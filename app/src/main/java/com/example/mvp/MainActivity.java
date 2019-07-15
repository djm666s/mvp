package com.example.mvp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.mvp.model.Imp.MainModelImp;
import com.example.mvp.model.MainModel;
import com.example.mvp.model.Model;
import com.example.mvp.presenter.BastPresent;
import com.example.mvp.presenter.MianPresent;
import com.example.mvp.view.BaseActivity;
import com.example.mvp.view.MianView;
import com.example.mvp.view.View;
import com.example.mvp.bean.TestBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity<MainModel, MianView, MianPresent> implements MianView {

    @BindView(R.id.view_page)
    ViewPager viewPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        return new MainModelImp();
    }

    @Override
    public View creatView() {
        return this;
    }

    @Override
    public BastPresent creatPresent() {
        return new MianPresent();
    }

    @Override
    public void setData(String str) {
    }

    @Override
    public void data(List<TestBean> list) {
















































    }

    @Override
    public void addpage(List<Fragment> fragments) {
        viewPage.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);
            }

            @Override
            public int getCount() {
                return fragments.size();
            }
        });
    }

    @Override
    public void showtost(String info) {

    }


}
