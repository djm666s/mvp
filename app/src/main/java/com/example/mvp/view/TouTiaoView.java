package com.example.mvp.view;

import com.example.mvp.bean.TouTiaoBean;

import java.util.List;

public interface TouTiaoView extends View {
    void setAdapter(List<TouTiaoBean.NewslistBean> list);

    void updata(List<TouTiaoBean.NewslistBean> list);

    void onFailure();
}
