package com.example.mvp.model.Imp;

import androidx.fragment.app.Fragment;

import com.example.mvp.model.MainModel;
import com.example.mvp.R;
import com.example.mvp.bean.TestBean;
import com.example.mvp.fragment.Test1Fragment;
import com.example.mvp.fragment.Test2Fragment;

import java.util.ArrayList;
import java.util.List;

public class MainModelImp implements MainModel {
    @Override
    public String object() {
        return "djm good";
    }

    @Override
    public List<TestBean> data() {
        List<TestBean> testBeans = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            TestBean testBean = new TestBean();
            testBean.setTest("djm" + i);
            testBean.setIcon(R.mipmap.cat);
            testBeans.add(testBean);
        }
        return testBeans;
    }

    @Override
    public List<Fragment> getfragemnt() {
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(new Test1Fragment());
        fragments.add(new Test2Fragment());
        return fragments;
    }



}
