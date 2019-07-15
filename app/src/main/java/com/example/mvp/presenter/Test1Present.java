package com.example.mvp.presenter;

import com.example.mvp.model.Test1Model;
import com.example.mvp.view.Test1View;

public  class Test1Present extends BastPresent<Test1Model, Test1View> {

    @Override
    protected void onDestroyView() {

    }

    @Override
    public void getdata() {
        if (model != null) {
            if (getView() != null) {
                getView().setcont(model.setcont());
                getView().setPage(model.setPage());
            }
        }
    }
}
