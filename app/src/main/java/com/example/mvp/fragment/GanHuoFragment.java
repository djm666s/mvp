package com.example.mvp.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.mvp.model.Imp.PhotoModelImp;
import com.example.mvp.model.Model;
import com.example.mvp.model.PhotoModel;
import com.example.mvp.presenter.BastPresent;
import com.example.mvp.presenter.PhotoPresent;
import com.example.mvp.R;
import com.example.mvp.view.BaseFragment;
import com.example.mvp.view.PhotoView;
import com.example.mvp.activity.ImageActivity;
import com.example.mvp.adapter.PhotoAdaoter;
import com.example.mvp.bean.PhotoBean;
import com.example.mvp.helper.URLContent;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import pl.droidsonroids.gif.GifImageView;

public class GanHuoFragment extends BaseFragment<PhotoModel, PhotoView, PhotoPresent> implements PhotoView, OnRefreshListener, OnLoadMoreListener {


    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;
    int page = 1;
    @BindView(R.id.refresh_view)
    SmartRefreshLayout refreshView;
    PhotoAdaoter adaoter;
    Unbinder unbinder;
    @BindView(R.id.jaiz_image)
    GifImageView jaizImage;
    @BindView(R.id.jiaz_layout)
    LinearLayout jiazLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_gan_huo, container, false);
        ButterKnife.bind(getActivity());
        unbinder = ButterKnife.bind(this, view);
        init();
        return view;
    }

    private void init() {
        if (presenter != null) {
            presenter.getoneData(URLContent.TOUTIAO_NUM, page);
        }
        refreshView.setOnRefreshListener(this);
        refreshView.setOnLoadMoreListener(this);
    }

    @Override
    public Model creatModel() {
        return new PhotoModelImp();
    }

    @Override
    public com.example.mvp.view.View creatView() {
        return this;
    }

    @Override
    public BastPresent creatPresent() {
        return new PhotoPresent();
    }

    @Override
    public void getAdapter(List<PhotoBean.ResultsBean> list) {

//        GridLayoutManager manager = new GridLayoutManager(getContext(), 2);
        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        adaoter = new PhotoAdaoter(getContext(), list, new PhotoAdaoter.OnClick() {
            @Override
            public void click(View view, int position) {
                Intent intent = new Intent();
                intent.putExtra("url", list.get(position).getUrl());
                intent.setClass(getContext(), ImageActivity.class);
                startActivity(intent);
            }
        });
        jiazLayout.setVisibility(View.GONE);
        recyclerView.setAdapter(adaoter);
    }

    @Override
    public void upData(List<PhotoBean.ResultsBean> list) {
        adaoter.updata(list);
    }

    @Override
    public void onFailure() {
        jaizImage.setImageResource(R.drawable.error);
    }

    @Override
    public void showtost(String info) {

    }

    @Override
    public void onRefresh(RefreshLayout refreshlayout) {
        refreshlayout.finishRefresh();
    }


    @Override
    public void onLoadMore(RefreshLayout refreshLayout) {
        page++;
        refreshView.setNoMoreData(false);
        presenter.getUpdata(URLContent.TOUTIAO_NUM, page);
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
