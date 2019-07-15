package com.example.mvp.fragment;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.mvp.model.Imp.Test1ModelImp;
import com.example.mvp.model.Model;
import com.example.mvp.model.Test1Model;
import com.example.mvp.presenter.BastPresent;
import com.example.mvp.presenter.Test1Present;
import com.example.mvp.R;
import com.example.mvp.view.BaseFragment;
import com.example.mvp.view.Test1View;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class Test1Fragment extends BaseFragment<Test1Model, Test1View, Test1Present> implements Test1View, ViewPager.OnPageChangeListener {


    @BindView(R.id.new_viewpage)
    ViewPager newViewpage;
    Unbinder unbinder;
    @BindView(R.id.zhihu_item)
    TextView zhihuItem;
    @BindView(R.id.redain_new)
    TextView redainNew;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_test1, container, false);
        ButterKnife.bind(getActivity());
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init();
    }

    private void init() {
        if (presenter != null) {
            presenter.getdata();
        }
    }

    @Override
    public Model creatModel() {
        return new Test1ModelImp();
    }

    @Override
    public com.example.mvp.view.View creatView() {
        return this;
    }

    @Override
    public BastPresent creatPresent() {
        return new Test1Present();
    }

    @Override
    public void setPage(List<Fragment> fragments) {
        newViewpage.setAdapter(new FragmentPagerAdapter(getChildFragmentManager()) {
            @NonNull
            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);
            }

            @Override
            public int getCount() {
                return fragments.size();
            }
        });
        zhihuItem.setTextColor(Color.WHITE);
        newViewpage.addOnPageChangeListener(this);
    }

    @Override
    public void setcont(List<String> conts) {
        if (conts.size() > 0) {
            zhihuItem.setText(conts.get(0));
            redainNew.setText(conts.get(1));
        }
    }

    @Override
    public void showtost(String info) {

    }

    @SuppressLint("ResourceAsColor")
    @OnClick({R.id.zhihu_item, R.id.redain_new})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.zhihu_item:
                newViewpage.setCurrentItem(0);
                zhihuItem.setTextColor(Color.WHITE);
                redainNew.setTextColor(Color.BLACK);
                break;
            case R.id.redain_new:
                newViewpage.setCurrentItem(1);
                redainNew.setTextColor(Color.WHITE);
                zhihuItem.setTextColor(Color.BLACK);
                break;
        }
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        switch (position) {
            case 0:
                zhihuItem.setTextColor(Color.WHITE);
                redainNew.setTextColor(Color.BLACK);
                break;
            case 1:
                redainNew.setTextColor(Color.WHITE);
                zhihuItem.setTextColor(Color.BLACK);
                break;
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
