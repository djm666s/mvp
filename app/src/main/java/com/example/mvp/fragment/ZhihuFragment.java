package com.example.mvp.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvp.BuildConfig;
import com.example.mvp.model.Imp.ZhiHuModelImp;
import com.example.mvp.model.Model;
import com.example.mvp.model.ZhiHuModel;
import com.example.mvp.presenter.BastPresent;
import com.example.mvp.presenter.ZhiHuPresent;
import com.example.mvp.R;
import com.example.mvp.util.MyApplication;
import com.example.mvp.view.BaseFragment;
import com.example.mvp.view.ZhiHuView;
import com.example.mvp.activity.NewItemActivity;
import com.example.mvp.adapter.ZhiHuAdapter;
import com.example.mvp.bean.ZhiHuBean;
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


public class ZhihuFragment extends BaseFragment<ZhiHuModel, ZhiHuView, ZhiHuPresent> implements ZhiHuView, OnLoadMoreListener, OnRefreshListener {

    Unbinder unbinder;
    long datd = 20190710;
    ZhiHuAdapter adapter = null;
    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;
    @BindView(R.id.refresh_view)
    SmartRefreshLayout refreshView;
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
            presenter.getAdapter();
        }
    }

    @Override
    public Model creatModel() {
        return new ZhiHuModelImp();
    }

    @Override
    public com.example.mvp.view.View creatView() {
        return this;
    }

    @Override
    public BastPresent creatPresent() {
        return new ZhiHuPresent();
    }

    @Override
    public void setAdapter(List<ZhiHuBean.TopStoriesBean> list) {
        jiazLayout.setVisibility(View.GONE);
        if (list.size() > 0) {
            RecyclerView.LayoutManager manager = new LinearLayoutManager(getActivity());
            ((LinearLayoutManager) manager).setOrientation(RecyclerView.VERTICAL);
            recyclerView.setLayoutManager(manager);
            adapter = new ZhiHuAdapter(list, new ZhiHuAdapter.OnClick() {
                @Override
                public void click(View view, int position) {
                    Intent intent = new Intent();
                    intent.putExtra("new_url", String.valueOf(list.get(position).getId()));
                    if (BuildConfig.DEBUG)
                        Log.d("ZhihuFragment", "list.get(position).getId():" + list.get(position).getId());
                    intent.setClass(getActivity(), NewItemActivity.class);
                    startActivity(intent);
                }
            });
            recyclerView.setAdapter(adapter);
        }
    }

    @Override
    public void getUpadta(List<ZhiHuBean.TopStoriesBean> list) {
        adapter.updata(list);
    }

    @Override
    public void onFailure() {
        jiazLayout.setVisibility(View.VISIBLE);
        jaizImage.setImageResource(R.drawable.error);
        Toast.makeText(MyApplication.getContext(), "网络异常", Toast.LENGTH_SHORT).show();
    }


    @Override
    public void showtost(String info) {

    }


    @Override
    public void onLoadMore(RefreshLayout refreshLayout) {
        if (BuildConfig.DEBUG) Log.d("ZhihuFragment", "进入");
        datd--;
        if (datd <= 20190700) {
            datd = 20190630;
        }
        refreshView.setNoMoreData(false);
        presenter.getUpdata(datd);
        refreshView.setNoMoreData(false);
        refreshLayout.finishLoadMore();
    }

    @Override
    public void onRefresh(RefreshLayout refreshLayout) {

    }

    @OnClick(R.id.jaiz_image)
    public void onViewClicked() {
        if (jaizImage.getDrawable().getCurrent().getConstantState().equals(getResources().getDrawable(R.drawable.error).getConstantState())) {
            init();
            jaizImage.setImageResource(R.drawable.jaizai);
        }
    }
}
