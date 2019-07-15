package com.example.mvp.view;

import androidx.fragment.app.Fragment;

import java.util.List;

public interface Test1View extends View {
    void setPage(List<Fragment> fragments);

    void setcont(List<String> conts);
}
