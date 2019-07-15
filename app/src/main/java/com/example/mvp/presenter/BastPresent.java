package com.example.mvp.presenter;

import com.example.mvp.model.Model;
import com.example.mvp.view.View;

import java.lang.ref.WeakReference;

public abstract class BastPresent<M extends Model, V extends View> implements Presenter<M, V> {
    /**
     * 使用弱应用防止内存溢出
     */
    private WeakReference<V> wrf;
    protected M model;
    @Override
    public void registerModel(M model) {
        this.model = model;
    }

    @Override
    public void registerView(V view) {
        wrf = new WeakReference<>(view);
    }

    @Override
    public V getView() {
        return wrf == null ? null : wrf.get();
    }

    @Override
    public void destroy() {
        if (wrf != null) {
            wrf.clear();
            wrf = null;
        }
        onDestroyView();
    }

    protected abstract void onDestroyView();

    public abstract void getdata();
}
