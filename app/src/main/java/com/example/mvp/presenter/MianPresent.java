package com.example.mvp.presenter;

import android.util.Log;

import com.example.mvp.BuildConfig;
import com.example.mvp.model.MainModel;
import com.example.mvp.view.MianView;

public class MianPresent extends BastPresent<MainModel, MianView> {
    @Override
    public void getdata() {
        if (model != null) {
            if (getView() != null) {
                getView().setData(model.object());
                getView().data(model.data());
                getView().addpage(model.getfragemnt());
            }
        }
    }

    @Override
    protected void onDestroyView() {
        if (BuildConfig.DEBUG) Log.d("MianPresent", "mian flinsh");
    }
}
