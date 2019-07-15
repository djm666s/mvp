package com.example.mvp.model.Imp;

import com.example.mvp.model.ZhiHuModel;
import com.example.mvp.api.BaseApi;
import com.example.mvp.bean.ZhiHuBean;
import com.example.mvp.bean.ZhiHuDataBean;
import com.example.mvp.hlper.RetrofitHlper;

import io.reactivex.Observable;

public class ZhiHuModelImp implements ZhiHuModel {


    @Override
    public Observable<ZhiHuBean> requse() {
        RetrofitHlper.getInstance().chenge(BaseApi.BASE_PAHT);
        return RetrofitHlper.getInstance().getApi().getNewLastList();
    }

    @Override
    public Observable<ZhiHuDataBean> updata(long data) {
        RetrofitHlper.getInstance().chenge(BaseApi.BASE_PAHT);
        return RetrofitHlper.getInstance().getApi().getDailyListWithDate(String.valueOf(data));
    }
}
