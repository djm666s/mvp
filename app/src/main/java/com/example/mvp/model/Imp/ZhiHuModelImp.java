package com.example.mvp.model.Imp;

import com.example.mvp.model.ZhiHuModel;
import com.example.mvp.api.BaseApi;
import com.example.mvp.bean.ZhiHuBean;
import com.example.mvp.bean.ZhiHuDataBean;
import com.example.mvp.helper.RetrofitHelper;

import io.reactivex.Observable;

public class ZhiHuModelImp implements ZhiHuModel {


    @Override
    public Observable<ZhiHuBean> requse() {
        RetrofitHelper.getInstance().chenge(BaseApi.BASE_PAHT);
        return RetrofitHelper.getInstance().getApi().getNewLastList();
    }

    @Override
    public Observable<ZhiHuDataBean> updata(long data) {
        RetrofitHelper.getInstance().chenge(BaseApi.BASE_PAHT);
        return RetrofitHelper.getInstance().getApi().getDailyListWithDate(String.valueOf(data));
    }
}
