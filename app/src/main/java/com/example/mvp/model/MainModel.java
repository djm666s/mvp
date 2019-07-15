package com.example.mvp.model;

import androidx.fragment.app.Fragment;

import com.example.mvp.bean.TestBean;

import java.util.List;

public interface MainModel extends Model {
    /**
     * 获取数据
     *
     * @return
     */
    String object();

    List<TestBean> data();

    List<Fragment> getfragemnt();
}
