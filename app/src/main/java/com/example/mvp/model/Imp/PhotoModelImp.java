package com.example.mvp.model.Imp;

import com.example.mvp.model.PhotoModel;
import com.example.mvp.api.BaseApi;
import com.example.mvp.bean.PhotoBean;
import com.example.mvp.helper.RetrofitHelper;

import io.reactivex.Observable;

public class PhotoModelImp implements PhotoModel {

    @Override
    public Observable<PhotoBean> getpagedata(int num, int page) {
        RetrofitHelper.getInstance().chenge(BaseApi.GANHOST);
        return RetrofitHelper.getInstance().getApi().getPhoto(num, page);
    }

    @Override
    public Observable<PhotoBean> upData(int num, int page) {
        RetrofitHelper.getInstance().chenge(BaseApi.GANHOST);
        return RetrofitHelper.getInstance().getApi().getPhoto(num, page);
    }


}
