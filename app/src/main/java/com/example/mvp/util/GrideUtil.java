package com.example.mvp.util;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.example.mvp.R;
/**
 * @Author djm
 * @mailbox 1287825756@qq.com
 * @date 2019/7/11 14:46
 */
public class GrideUtil {
    public static void getRul(String url, ImageView view) {
        RequestOptions options = new RequestOptions().placeholder(R.mipmap.img_default).diskCacheStrategy(DiskCacheStrategy.NONE
        );//占位图
        Glide.with(MyApplication.getContext()).load(url).apply(options).into((ImageView) view);
    }
}
