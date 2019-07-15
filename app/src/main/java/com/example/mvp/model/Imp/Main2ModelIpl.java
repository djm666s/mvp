package com.example.mvp.model.Imp;

import androidx.fragment.app.Fragment;

import com.example.mvp.model.Main2Model;
import com.example.mvp.fragment.GanHuoFragment;
import com.example.mvp.fragment.MainFragment;
import com.example.mvp.fragment.MyFragment;
import com.example.mvp.fragment.VideoFragment;

import java.util.ArrayList;
import java.util.List;

public class Main2ModelIpl implements Main2Model {
    @Override
    public List<Fragment> list() {
        List<Fragment> list = new ArrayList<>();
        list.add(new MainFragment());
        list.add(new GanHuoFragment());
        list.add(new VideoFragment());
        list.add(new MyFragment());
        return list;
    }
}
