package com.example.mvp.view;

import com.example.mvp.bean.MusicBean;

import java.util.List;

public interface MusicView extends View {

    void setAdapter(List<MusicBean.ResultBean.ChannellistBean> list);
}
