package com.example.mvp.api;

import com.example.mvp.bean.BaseRequst;
import com.example.mvp.bean.MusicBean;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface HttpApi {

    @POST("/musicBroadcasting")
    Observable<MusicBean> getMusic();

//    @POST("/musicBroadcasting")
//    Call<MusicBean> getMusic();
}
