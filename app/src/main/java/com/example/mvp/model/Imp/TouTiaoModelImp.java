package com.example.mvp.model.Imp;

import com.example.mvp.model.TouTiaoModel;
import com.example.mvp.api.BaseApi;
import com.example.mvp.bean.TouTiaoBean;
import com.example.mvp.helper.RetrofitHelper;
import com.example.mvp.helper.URLContent;

import io.reactivex.Observable;

public class TouTiaoModelImp implements TouTiaoModel {
    @Override
    public Observable<TouTiaoBean> getNewsBean(int page) {
        RetrofitHelper.getInstance().chenge(BaseApi.HOST);
        return RetrofitHelper.getInstance().getApi().getTouTiaoData(URLContent.TOUTIAO_KEY, URLContent.TOUTIAO_NUM, page);
    }
}
