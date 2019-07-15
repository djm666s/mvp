package com.example.mvp.model;

import com.example.mvp.bean.TouTiaoBean;

import io.reactivex.Observable;

public interface TouTiaoModel extends Model {

    Observable<TouTiaoBean> getNewsBean(int page);
}
