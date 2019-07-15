package com.example.mvp.model;

import com.example.mvp.bean.MusicBean;

import java.util.List;

public interface MusicModel extends Model {

    List<MusicBean.ResultBean.ChannellistBean> list();
}
