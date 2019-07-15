package com.example.mvp.activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvp.model.Imp.PhotoModelImp;
import com.example.mvp.model.Model;
import com.example.mvp.model.PhotoModel;
import com.example.mvp.presenter.BastPresent;
import com.example.mvp.presenter.PhotoPresent;
import com.example.mvp.R;
import com.example.mvp.view.BaseActivity;
import com.example.mvp.view.PhotoView;
import com.example.mvp.view.View;
import com.example.mvp.adapter.PhotoAdaoter;
import com.example.mvp.bean.PhotoBean;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.OnLoadmoreListener;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GanHuoActivity extends BaseActivity<PhotoModel, PhotoView, PhotoPresent> implements PhotoView, OnRefreshListener, OnLoadmoreListener, OnLoadMoreListener {

    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;
    final static int PREPAGE = 10;
    int page = 1;
    @BindView(R.id.refresh_view)
    SmartRefreshLayout refreshView;
    PhotoAdaoter adaoter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gan_huo);
        ButterKnife.bind(this);
        init();
    }

    private void init() {
        if (presenter != null) {
            presenter.getoneData(PREPAGE, page);
        }
        refreshView.setOnRefreshListener(this);
        refreshView.setOnLoadMoreListener(this);
    }

    @Override
    public Model creatModel() {
        return new PhotoModelImp();
    }

    @Override
    public View creatView() {
        return this;
    }

    @Override
    public BastPresent creatPresent() {
        return new PhotoPresent();
    }

    @Override
    public void getAdapter(List<PhotoBean.ResultsBean> list) {
        GridLayoutManager manager = new GridLayoutManager(GanHuoActivity.this, 2);
        recyclerView.setLayoutManager(manager);
        adaoter = new PhotoAdaoter(GanHuoActivity.this, list, new PhotoAdaoter.OnClick() {
            @Override
            public void click(android.view.View view, int position) {
                Intent intent = new Intent();
                intent.putExtra("url", list.get(position).getUrl());
                intent.setClass(GanHuoActivity.this, ImageActivity.class);
                startActivity(intent);
            }
        });

        recyclerView.setAdapter(adaoter);
    }

    @Override
    public void upData(List<PhotoBean.ResultsBean> list) {
        adaoter.updata(list);
    }

    @Override
    public void onFailure() {

    }

    @Override
    public void showtost(String info) {

    }

    @Override
    public void onRefresh(RefreshLayout refreshlayout) {
        refreshlayout.finishRefresh();
    }

    @Override
    public void onLoadmore(RefreshLayout refreshLayout) {


    }

    @Override
    public void onLoadMore(RefreshLayout refreshLayout) {
        page++;
        refreshView.setNoMoreData(true);
        presenter.getUpdata(PREPAGE, page);
        refreshView.setNoMoreData(false);
        refreshLayout.finishLoadMore();
    }
}
