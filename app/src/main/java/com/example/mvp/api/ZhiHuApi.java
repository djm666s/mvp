package com.example.mvp.api;

import com.example.mvp.bean.ZhiHuBean;
import com.example.mvp.bean.ZhiHuDataBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ZhiHuApi {
    final static String BASE_PAHT = "https://news-at.zhihu.com";

    @GET("/api/4/news/latest")
    Observable<ZhiHuBean> getNewLastList();

    @GET("/api/4/news/before/{date}")
    Observable<ZhiHuDataBean> getDailyListWithDate(@Path("date") String date);
}
