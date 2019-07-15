package com.example.mvp.util;

import android.app.Application;
/**
 * @Author djm
 * @mailbox 1287825756@qq.com
 * @date 2019/7/9 09:11
 */
public class MyApplication extends Application {
    static MyApplication myApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        myApplication = this;
    }

    public static MyApplication getContext() {
        return myApplication;
    }
}
