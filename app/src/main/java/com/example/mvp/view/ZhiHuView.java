package com.example.mvp.view;

import com.example.mvp.bean.ZhiHuBean;

import java.util.List;

public interface ZhiHuView extends View {
    void setAdapter(List<ZhiHuBean.TopStoriesBean> list);

    void getUpadta(List<ZhiHuBean.TopStoriesBean> list);

    void onFailure();
}
