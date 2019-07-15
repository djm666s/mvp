package com.example.mvp.model.Imp;

import android.widget.PopupWindow;

import com.example.mvp.model.PhotoModel;
import com.example.mvp.api.BaseApi;
import com.example.mvp.bean.PhotoBean;
import com.example.mvp.hlper.RetrofitHlper;

import io.reactivex.Observable;

public class PhotoModelImp implements PhotoModel {

    @Override
    public Observable<PhotoBean> getpagedata(int num, int page) {
        RetrofitHlper.getInstance().chenge(BaseApi.GANHOST);
        return RetrofitHlper.getInstance().getApi().getPhoto(num, page);
    }

    @Override
    public Observable<PhotoBean> upData(int num, int page) {
        RetrofitHlper.getInstance().chenge(BaseApi.GANHOST);
        return RetrofitHlper.getInstance().getApi().getPhoto(num, page);
    }


}
