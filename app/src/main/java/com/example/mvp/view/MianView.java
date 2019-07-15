package com.example.mvp.view;

import androidx.fragment.app.Fragment;

import com.example.mvp.bean.TestBean;

import java.util.List;

public interface MianView extends View {

    void setData(String str);

    void data(List<TestBean> list);

    void addpage(List<Fragment> fragments);
}
