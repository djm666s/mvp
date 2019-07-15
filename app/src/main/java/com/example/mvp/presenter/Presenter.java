package com.example.mvp.presenter;

import com.example.mvp.model.Model;
import com.example.mvp.view.View;

public interface Presenter<M extends Model, V extends View> {
    /**
     * 注册Model
     *
     * @param model
     */
    void registerModel(M model);

    /**
     * 注册View
     *
     * @param view
     */
    void registerView(V view);

    /**
     * 获取View
     *
     * @return
     */
    V getView();

    /**
     * 销毁
     */
    void destroy();
}
