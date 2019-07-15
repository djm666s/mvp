package com.example.mvp.model;

import androidx.fragment.app.Fragment;

import java.util.List;

public interface Test1Model extends Model {
    List<Fragment> setPage();

    List<String> setcont();
}
