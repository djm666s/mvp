package com.example.mvp.fragment;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvp.R;
import com.example.mvp.activity.VideoActivity;
import com.example.mvp.adapter.RecvicerOnClick;
import com.example.mvp.adapter.VideoAdapter;
import com.example.mvp.bean.VideoBean;
import com.example.mvp.model.Imp.VideoModelImp;
import com.example.mvp.model.Model;
import com.example.mvp.model.VideoModel;
import com.example.mvp.presenter.BastPresent;
import com.example.mvp.presenter.VideoPresent;
import com.example.mvp.util.NetworkImageIndicatorView;
import com.example.mvp.view.BaseFragment;
import com.example.mvp.view.VideoView;
import com.panxw.android.imageindicator.AutoPlayManager;
import com.panxw.android.imageindicator.ImageIndicatorView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import pl.droidsonroids.gif.GifImageView;


public class VideoFragment extends BaseFragment<VideoModel, VideoView, VideoPresent> implements VideoView {

    @BindView(R.id.jaiz_image)
    GifImageView jaizImage;
    @BindView(R.id.jiaz_layout)
    LinearLayout jiazLayout;
    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;
    Unbinder unbinder;
    @BindView(R.id.quanbu)
    TextView quanbu;
    @BindView(R.id.yundingzhiyi)
    TextView yundingzhiyi;
    @BindView(R.id.nvsheng)
    TextView nvsheng;
    VideoAdapter adapter = null;
    @BindView(R.id.iamge_indicator)
    NetworkImageIndicatorView iamgeIndicator;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_video, container, false);
        ButterKnife.bind(getActivity());
        unbinder = ButterKnife.bind(this, view);
        init();
        return view;
    }


    private void init() {
        if (presenter != null) {
            presenter.getpathUrl();
            presenter.getdata();
        }
    }

    @Override
    public Model creatModel() {
        return new VideoModelImp();
    }

    @Override
    public com.example.mvp.view.View creatView() {
        return this;
    }

    @Override
    public BastPresent creatPresent() {
        return new VideoPresent();
    }

    @Override
    public void setData(List<VideoBean> list) {
        GridLayoutManager manager = new GridLayoutManager(getActivity(), 2);
        recyclerView.setLayoutManager(manager);
        jiazLayout.setVisibility(View.GONE);
        adapter = new VideoAdapter(list, new RecvicerOnClick() {
            @Override
            public void onClick(View view, int prostion) {
                Intent intent = new Intent();
                intent.putExtra("title", list.get(prostion).getTitle());
                intent.setClass(getContext(), VideoActivity.class);
                startActivity(intent);
            }
        });
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void setYunding(List<VideoBean> list) {
        adapter.upData(list);
    }

    @Override
    public void setNvSheng(List<VideoBean> list) {
        adapter.upData(list);
    }

    @Override
    public void setlunbo(List<String> urlpath) {
        iamgeIndicator.setIndicateStyle(ImageIndicatorView.INDICATE_USERGUIDE_STYLE);
        iamgeIndicator.setupLayoutByImageUrl(urlpath);
        iamgeIndicator.show();
        iamgeIndicator.setOnItemClickListener(new ImageIndicatorView.OnItemClickListener() {
            @Override
            public void OnItemClick(View view, int position) {
                Toast.makeText(getContext(), "position:" + position, Toast.LENGTH_SHORT).show();
            }
        });
        AutoPlayManager autoPlayManager=new AutoPlayManager(iamgeIndicator);
        autoPlayManager.setBroadcastEnable(true);
        autoPlayManager.setBroadcastTimeIntevel(0,1000);
//        autoPlayManager.setBroadCastTimes(5);
        autoPlayManager.loop();
    }

    @Override
    public void onFailure() {

    }

    @Override
    public void showtost(String info) {

    }

    @OnClick({R.id.quanbu, R.id.yundingzhiyi, R.id.nvsheng})
    public void onViewClicked(View view) {
        inittestback();
        switch (view.getId()) {
            case R.id.quanbu:
                selecton(0);
                presenter.getdata();
                break;
            case R.id.yundingzhiyi:
                selecton(1);
                presenter.getYundin();
                break;
            case R.id.nvsheng:
                selecton(2);
                presenter.getNvSheng();
                break;
        }
    }

    private void inittestback() {
        quanbu.setBackgroundResource(R.color.wc);
        quanbu.setTextColor(Color.BLACK);
        yundingzhiyi.setBackgroundResource(R.color.wc);
        yundingzhiyi.setTextColor(Color.BLACK);
        nvsheng.setBackgroundResource(R.color.wc);
        nvsheng.setTextColor(Color.BLACK);
    }

    private void selecton(int postion) {
        switch (postion) {
            case 0:
                quanbu.setBackgroundResource(R.drawable.video_text_shape);
                quanbu.setTextColor(Color.BLUE);
                break;
            case 1:
                yundingzhiyi.setBackgroundResource(R.drawable.video_text_shape);
                yundingzhiyi.setTextColor(Color.BLUE);
                break;
            case 2:
                nvsheng.setBackgroundResource(R.drawable.video_text_shape);
                nvsheng.setTextColor(Color.BLUE);
                break;
        }
    }
}
