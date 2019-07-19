package com.example.mvp.api;

import android.graphics.Bitmap;

import com.example.mvp.bean.PhotoBean;
import com.example.mvp.bean.TouTiaoBean;
import com.example.mvp.bean.ZhiHuBean;
import com.example.mvp.bean.ZhiHuDataBean;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Streaming;
import retrofit2.http.Url;

public interface BaseApi {

    /**
     * 头条接口
     */
    static final String HOST = "https://api.tianapi.com";

    @POST("/generalnews")
    Observable<TouTiaoBean> getTouTiaoData(@Query("key") String key, @Query("num") int num, @Query("page") int page);

    /**
     * 知乎接口
     */
    final static String BASE_PAHT = "https://news-at.zhihu.com";

    @GET("/api/4/news/latest")
    Observable<ZhiHuBean> getNewLastList();

    @GET("/api/4/news/before/{date}")
    Observable<ZhiHuDataBean> getDailyListWithDate(@Path("date") String date);

    /**
     * 干货api
     */
    static final String GANHOST = "http://gank.io";

    @GET("/api/data/福利/{per_page}/{page}")
    Observable<PhotoBean> getPhoto(@Path("per_page") int pare_page, @Path("page") int page);

    /**
     * 图片下载
     */

    static final String Dowanload = "https://ww1.sinaimg.cn";
    @Streaming
    @GET
    Observable<ResponseBody> getDolwanload(@Url String url);

    /**
     * 视频轮播
     */
    static final String LUNBO = "https://huyaimg.msstatic.com";

    @GET("/{page}")
    Observable<Bitmap> getLunbo(@Path("page") String page);
}
