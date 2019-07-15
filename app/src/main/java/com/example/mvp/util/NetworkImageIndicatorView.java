package com.example.mvp.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.mvp.api.BaseApi;
import com.example.mvp.hlper.RetrofitHlper;
import com.panxw.android.imageindicator.ImageIndicatorView;

import java.util.List;

import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * @Author djm
 * @mailbox 1287825756@qq.com
 * @date 2019/7/15 15:46
 * 网络加载轮播图
 */
public class NetworkImageIndicatorView extends ImageIndicatorView {
    public NetworkImageIndicatorView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NetworkImageIndicatorView(Context context) {
        super(context);
    }

    public void setupLayoutByImageUrl(List<String> urlList) {
        for (String url : urlList) {
            final ImageView imageView = new ImageView(getContext());
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                GrideUtil.getRul(url,imageView);
               addViewItem(imageView);
        }
    }
}