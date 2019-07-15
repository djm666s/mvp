package com.example.mvp.api;

import com.example.mvp.bean.TouTiaoBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RjingRiTouTiaoApi {
    static final String BASE_PATH = "https://api.tianapi.com";

    @POST("/generalnews")
    Observable<TouTiaoBean> getTouTiaoData(@Query("key") String key, @Query("num") int num, @Query("page") int page);
}
