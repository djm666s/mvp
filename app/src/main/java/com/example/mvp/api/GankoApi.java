package com.example.mvp.api;

import com.example.mvp.bean.PhotoBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GankoApi extends BaseApi {
    static final String HOST = "http://gank.io";

    @GET("/api/data/福利/{per_page}/{page}")
    Observable<PhotoBean> getPhoto(@Path("per_page") int pare_page, @Path("page") int page);


}
