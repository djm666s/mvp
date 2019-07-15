package com.example.mvp.model;

import com.example.mvp.bean.ZhiHuBean;
import com.example.mvp.bean.ZhiHuDataBean;

import io.reactivex.Observable;

public interface ZhiHuModel extends Model {

    Observable<ZhiHuBean> requse();

    Observable<ZhiHuDataBean> updata(long data);
}
