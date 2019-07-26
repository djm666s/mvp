package com.example.mvp.util;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

import com.panxw.android.imageindicator.ImageIndicatorView;

import java.util.List;

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