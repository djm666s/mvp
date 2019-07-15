package com.example.mvp.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvp.BuildConfig;
import com.example.mvp.model.Imp.TouTiaoModelImp;
import com.example.mvp.model.Model;
import com.example.mvp.model.TouTiaoModel;
import com.example.mvp.presenter.BastPresent;
import com.example.mvp.presenter.TouTiaoPresent;
import com.example.mvp.R;
import com.example.mvp.view.BaseFragment;
import com.example.mvp.view.TouTiaoView;
import com.example.mvp.activity.NewItemActivity;
import com.example.mvp.adapter.TouTiaoAdapter;
import com.example.mvp.bean.TouTiaoBean;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import pl.droidsonroids.gif.GifImageView;


public class ReDainNewFragment extends BaseFragment<TouTiaoModel, TouTiaoView, TouTiaoPresent> implements TouTiaoView, OnLoadMoreListener {


    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;
    @BindView(R.id.refresh_view)
    SmartRefreshLayout refreshView;
    Unbinder unbinder;
    TouTiaoAdapter adapter;
    int page = 1;
    @BindView(R.id.jaiz_image)
    GifImageView jaizImage;
    @BindView(R.id.jiaz_layout)
    LinearLayout jiazLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_zhihu, container, false);
        ButterKnife.bind(getActivity());
        unbinder = ButterKnife.bind(this, view);
        refreshView.setOnLoadMoreListener(this);
        init();
        return view;
    }


    private void init() {
        if (presenter != null) {
            presenter.getData(page);
        }
    }

    @Override
    public Model creatModel() {
        return new TouTiaoModelImp();
    }

    @Override
    public com.example.mvp.view.View creatView() {
        return this;
    }

    @Override
    public BastPresent creatPresent() {
        return new TouTiaoPresent();
    }

    @Override
    public void setAdapter(List<TouTiaoBean.NewslistBean> list) {
        RecyclerView.LayoutManager manager = new LinearLayoutManager(getContext());
        ((LinearLayoutManager) manager).setOrientation(RecyclerView.VERTICAL);
        if (BuildConfig.DEBUG) Log.d("ReDainNewFragment", "list.size():" + list.size());
        recyclerView.setLayoutManager(manager);
        adapter = new TouTiaoAdapter(list, new TouTiaoAdapter.OnClick() {
            @Override
            public void click(View view, int position) {
                Intent intent = new Intent();
                intent.putExtra("new_url_toutiao", list.get(position).getUrl());
                intent.setClass(getContext(), NewItemActivity.class);
                startActivity(intent);
            }
        });
        jiazLayout.setVisibility(View.GONE);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void updata(List<TouTiaoBean.NewslistBean> list) {
        adapter.updata(list);
    }

    @Override
    public void onFailure() {
        jaizImage.setImageResource(R.drawable.error);
    }

    @Override
    public void showtost(String info) {

    }

    @Override
    public void onLoadMore(RefreshLayout refreshLayout) {
        refreshView.setNoMoreData(false);
        page++;
        presenter.updata(page);
        refreshView.setNoMoreData(false);
        refreshLayout.finishLoadMore();
    }

    @OnClick(R.id.jaiz_image)
    public void onViewClicked() {
        if (jaizImage.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.error).getConstantState())) {
            init();
            jaizImage.setImageResource(R.drawable.jaizai);
        }
    }
}
