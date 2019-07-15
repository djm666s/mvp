package com.example.mvp.presenter;

import android.util.Log;
import android.widget.Toast;

import com.example.mvp.BuildConfig;
import com.example.mvp.model.ZhiHuModel;
import com.example.mvp.util.MyApplication;
import com.example.mvp.view.ZhiHuView;
import com.example.mvp.bean.ZhiHuBean;
import com.example.mvp.bean.ZhiHuDataBean;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class ZhiHuPresent extends BastPresent<ZhiHuModel, ZhiHuView> {
    @Override
    protected void onDestroyView() {

    }

    @Override
    public void getdata() {

    }

    public void getUpdata(long data) {
        if (model != null) {
            List<ZhiHuBean.TopStoriesBean> list = new ArrayList<>();
            Observable<ZhiHuDataBean> observable = model.updata(data);
            observable.subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Observer<ZhiHuDataBean>() {
                        @Override
                        public void onSubscribe(Disposable d) {

                        }

                        @Override
                        public void onNext(ZhiHuDataBean zhiHuDataBean) {
                            if (BuildConfig.DEBUG) Log.d("ZhiHuPresent", "success");
                            for (ZhiHuDataBean.StoriesBean s : zhiHuDataBean.getStories()) {
                                ZhiHuBean.TopStoriesBean z = new ZhiHuBean.TopStoriesBean();
                                z.setId(s.getId());
                                z.setGa_prefix(s.getGa_prefix());
                                z.setImage(s.getImages().get(0));
                                z.setTitle(s.getTitle());
                                z.setType(s.getType());
                                list.add(z);
                            }
                            getView().getUpadta(list);

                        }

                        @Override
                        public void onError(Throwable e) {

                        }

                        @Override
                        public void onComplete() {

                        }
                    });
        }
    }

    /**
     * subscribeOn 改变之前线程
     * observeOn 改变之后线程
     */
    public void getAdapter() {
        if (model != null) {
            model.requse().subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())//回切主线程
                    .subscribe(new Observer<ZhiHuBean>() {
                        @Override
                        public void onSubscribe(Disposable d) {
                        }

                        @Override
                        public void onNext(ZhiHuBean zhiHuBean) {
                            if (getView() != null) {
                                getView().setAdapter(zhiHuBean.getTop_stories());
                            }

                        }

                        @Override
                        public void onError(Throwable e) {
                            getView().onFailure();
                            Toast.makeText(MyApplication.getContext(), "error", Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        public void onComplete() {

                        }
                    });
        }

    }
}
