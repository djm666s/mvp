package com.example.mvp.model.Imp;

import androidx.fragment.app.Fragment;

import com.example.mvp.model.Test1Model;
import com.example.mvp.R;
import com.example.mvp.util.MyApplication;
import com.example.mvp.fragment.ReDainNewFragment;
import com.example.mvp.fragment.ZhihuFragment;

import java.util.ArrayList;
import java.util.List;

public class Test1ModelImp implements Test1Model {

    @Override
    public List<Fragment> setPage() {
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(new ZhihuFragment());
        fragments.add(new ReDainNewFragment());
        return fragments;
    }

    @Override
    public List<String> setcont() {
        List<String> list = new ArrayList<>();
        list.add(MyApplication.getContext().getResources().getString(R.string.newitem1));
        list.add(MyApplication.getContext().getResources().getString(R.string.newitem2));
        return list;
    }
}
