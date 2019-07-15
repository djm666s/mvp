package com.example.mvp.view;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mvp.BaseMvp;
import com.example.mvp.model.Model;
import com.example.mvp.presenter.BastPresent;
/**
 * @Author djm
 * @mailbox 1287825756@qq.com
 * @date 2019/7/10 15:46
 */
public abstract class BaseActivity<M extends Model, V extends View, P extends BastPresent> extends AppCompatActivity implements BaseMvp {
    protected P presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = (P) creatPresent();
        if (presenter != null) {
            //注入Model和view
            presenter.registerModel(creatModel());
            presenter.registerView(creatView());
        }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.destroy();
    }
}
