package com.example.mvp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvp.BuildConfig;
import com.example.mvp.model.Imp.MusicModelImp;
import com.example.mvp.model.Model;
import com.example.mvp.model.MusicModel;
import com.example.mvp.presenter.BastPresent;
import com.example.mvp.presenter.MusicPresent;
import com.example.mvp.R;
import com.example.mvp.util.MyApplication;
import com.example.mvp.view.BaseActivity;
import com.example.mvp.view.MusicView;
import com.example.mvp.view.View;
import com.example.mvp.adapter.MusicAdaoter;
import com.example.mvp.bean.MusicBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TestActivity extends BaseActivity<MusicModel, MusicView, MusicPresent> implements MusicView {
    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_activity);
        ButterKnife.bind(this);
        init();
    }

    private void init() {
        if (presenter != null) {
            presenter.getdata();
        }
    }

    @Override
    public Model creatModel() {
        return new MusicModelImp();
    }

    @Override
    public View creatView() {
        return this;
    }

    @Override
    public BastPresent creatPresent() {
        return new MusicPresent();
    }

    @Override
    public void setAdapter(List<MusicBean.ResultBean.ChannellistBean> list) {
        if (BuildConfig.DEBUG) Log.d("TestActivity", "list.size():" + list.size());
//        RecyclerView.LayoutManager manager = new LinearLayoutManager(MyApplication.getContext());
//        ((LinearLayoutManager) manager).setOrientation(RecyclerView.HORIZONTAL);
        GridLayoutManager manager = new GridLayoutManager(TestActivity.this, 2);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(new MusicAdaoter(MyApplication.getContext(), list, new MusicAdaoter.OnClick() {
            @Override
            public void click(android.view.View view, int position) {
                Intent intent = new Intent();
                intent.putExtra("url", list.get(position).getThumb());
                intent.setClass(TestActivity.this, ImageActivity.class);
                startActivity(intent);
            }
        }));
    }

    @Override
    public void showtost(String info) {

    }
}
