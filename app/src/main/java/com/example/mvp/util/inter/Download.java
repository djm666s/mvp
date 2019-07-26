package com.example.mvp.util.inter;

/**
 * @Author djm
 * @mailbox 1287825756@qq.com
 * @date 2019/7/26 15:41
 */
public interface Download {

    void onProgess(int progess);

    void onSuccess();

    void onFailed();
}
