package com.example.mvp.view;

import com.example.mvp.bean.PhotoBean;

import java.util.List;

public interface PhotoView extends View {

    void getAdapter(List<PhotoBean.ResultsBean> list);

    void upData(List<PhotoBean.ResultsBean> list);

    void onFailure();
}
