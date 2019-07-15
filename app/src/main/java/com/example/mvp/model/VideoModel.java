package com.example.mvp.model;

import com.example.mvp.bean.VideoBean;

import java.util.List;

public interface VideoModel extends Model {
    List<VideoBean> getData();

    List<VideoBean> Yunding();

    List<VideoBean> NvSheng();

    List<String> getUlrPath();
}
