package com.example.mvp.hlper;

import com.example.mvp.api.BaseApi;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitHlper {
    private Retrofit retrofit;
    private BaseApi api;

    private RetrofitHlper() {
        retrofit = new Retrofit.Builder()
                .baseUrl(api.HOST)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        api = retrofit.create(BaseApi.class);
    }

    /**
     * 创建单例模式
     */
    private static class SlinRetrofitHlper {
        private static final RetrofitHlper INSTANCE = new RetrofitHlper();
    }

    /**
     * 获取单例模式
     *
     * @return
     */
    public static RetrofitHlper getInstance() {
        return SlinRetrofitHlper.INSTANCE;
    }

    /**
     * 获取Http服务
     *
     * @return
     */
    public BaseApi getApi() {
        return api;
    }

    public void chenge(String url) {
        retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        api = retrofit.create(BaseApi.class);
    }
}
