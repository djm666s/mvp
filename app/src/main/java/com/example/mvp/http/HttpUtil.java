package com.example.mvp.http;

import retrofit2.Retrofit;

public class HttpUtil {
    private static Retrofit retrofit;

    public static void psot(String url) {
        retrofit = new Retrofit.Builder().baseUrl(url).build();
    }
}
