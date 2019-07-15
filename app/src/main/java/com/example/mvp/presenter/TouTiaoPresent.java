package com.example.mvp.presenter;

import com.example.mvp.model.TouTiaoModel;
import com.example.mvp.view.TouTiaoView;
import com.example.mvp.bean.TouTiaoBean;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class TouTiaoPresent extends BastPresent<TouTiaoModel, TouTiaoView> {
    @Override
    protected void onDestroyView() {

    }

    public void updata(int page) {

        if (model != null) {
            model.getNewsBean(page).subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Observer<TouTiaoBean>() {
                        @Override
                        public void onSubscribe(Disposable d) {

                        }

                        @Override
                        public void onNext(TouTiaoBean touTiaoBean) {
                            if (getView() != null) {
                                getView().updata(touTiaoBean.getNewslist());
                            }
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

    @Override
    public void getdata() {
    }

    public void getData(int page) {
        if (model != null) {
            model.getNewsBean(page).subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Observer<TouTiaoBean>() {
                        @Override
                        public void onSubscribe(Disposable d) {

                        }

                        @Override
                        public void onNext(TouTiaoBean touTiaoBean) {
                            if (getView() != null) {
                                getView().setAdapter(touTiaoBean.getNewslist());
                            }
                        }

                        @Override
                        public void onError(Throwable e) {
                            getView().onFailure();
                        }

                        @Override
                        public void onComplete() {

                        }
                    });
        }
    }
}
