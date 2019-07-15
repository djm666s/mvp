package com.example.mvp.model;

import com.example.mvp.bean.PhotoBean;

import io.reactivex.Observable;

public interface PhotoModel extends Model {
    Observable<PhotoBean> getpagedata(int num,int page);

    Observable<PhotoBean>  upData(int num,int page);
}
