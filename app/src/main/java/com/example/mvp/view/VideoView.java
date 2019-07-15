package com.example.mvp.view;

import com.example.mvp.bean.VideoBean;

import java.util.List;

public interface VideoView extends View {
    void setData(List<VideoBean> list);

    void setYunding(List<VideoBean> list);

    void setNvSheng(List<VideoBean> list);

    void setlunbo(List<String> urlpath);

    void onFailure();
}
