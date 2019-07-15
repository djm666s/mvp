package com.example.mvp.view;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mvp.BaseMvp;
import com.example.mvp.model.Model;
import com.example.mvp.presenter.BastPresent;
/**
 * @Author djm
 * @mailbox 1287825756@qq.com
 * @date 2019/7/10 15:46
 */
public abstract class BaseFragment<M extends Model, V extends View, P extends BastPresent> extends Fragment implements BaseMvp {
    protected P presenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = (P) creatPresent();
        if (presenter != null) {
            presenter.registerModel(creatModel());
            presenter.registerView(creatView());
        }
    }
}
