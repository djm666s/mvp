package com.example.mvp.presenter;

import com.example.mvp.model.PhotoModel;
import com.example.mvp.view.PhotoView;
import com.example.mvp.bean.PhotoBean;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class PhotoPresent extends BastPresent<PhotoModel, PhotoView> {
    @Override
    protected void onDestroyView() {

    }

    public void getUpdata(int pre_page, int page) {
        if (model != null) {
            model.getpagedata(pre_page, page).subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Observer<PhotoBean>() {
                        @Override
                        public void onSubscribe(Disposable d) {

                        }

                        @Override
                        public void onNext(PhotoBean photoBean) {
                            if (getView() != null) {
                                getView().upData(photoBean.getResults());
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

    public void getoneData(int pre_page, int page) {
        if (model != null) {
            model.getpagedata(pre_page, page).subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Observer<PhotoBean>() {
                        @Override
                        public void onSubscribe(Disposable d) {

                        }

                        @Override
                        public void onNext(PhotoBean photoBean) {
                            if (getView() != null) {
                                getView().getAdapter(photoBean.getResults());
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

    @Override
    public void getdata() {


    }
}
