package com.example.mvp.presenter;

import com.example.mvp.model.Main2Model;
import com.example.mvp.view.Main2View;

public class Main2Present extends BastPresent<Main2Model, Main2View> {
    @Override
    protected void onDestroyView() {

    }

    @Override
    public void getdata() {
        if (model != null) {
            if (getView() != null) {
                getView().setAdapter(model.list());
            }
        }

    }
}
