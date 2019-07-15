package com.example.mvp.view;

import androidx.fragment.app.Fragment;

import java.util.List;

public interface Main2View extends View {
    void setAdapter(List<Fragment> fragments);
}
