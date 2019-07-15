package com.example.mvp;

import com.example.mvp.model.Model;
import com.example.mvp.presenter.BastPresent;
import com.example.mvp.view.View;

public interface BaseMvp<M extends Model, V extends View, P extends BastPresent> {
    M creatModel();

    V creatView();

    P creatPresent();
}
