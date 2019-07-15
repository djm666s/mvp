package com.example.mvp.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.mvp.model.Imp.Main2ModelIpl;
import com.example.mvp.model.Main2Model;
import com.example.mvp.model.Model;
import com.example.mvp.presenter.BastPresent;
import com.example.mvp.presenter.Main2Present;
import com.example.mvp.R;
import com.example.mvp.view.BaseActivity;
import com.example.mvp.view.Main2View;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main2Activity extends BaseActivity<Main2Model, Main2View, Main2Present> implements Main2View {

    @BindView(R.id.view_page)
    ViewPager viewPage;
    @BindView(R.id.main_image)
    ImageView mainImage;
    @BindView(R.id.main_text)
    TextView mainText;
    @BindView(R.id.layout_main)
    LinearLayout layoutMain;
    @BindView(R.id.ganh_image)
    ImageView ganhImage;
    @BindView(R.id.ganh_text)
    TextView ganhText;
    @BindView(R.id.layout_ganh)
    LinearLayout layoutGanh;
    @BindView(R.id.ship_image)
    ImageView shipImage;
    @BindView(R.id.ship_text)
    TextView shipText;
    @BindView(R.id.layout_video)
    LinearLayout layoutVideo;
    @BindView(R.id.my_image)
    ImageView myImage;
    @BindView(R.id.my_text)
    TextView myText;
    @BindView(R.id.layout_my)
    LinearLayout layoutMy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);
        initLayout();
        init();
    }

    private void init() {
        if (presenter != null) {
            presenter.getdata();
        }
    }

    private void selectLayout(int prostion) {
        switch (prostion) {
            case 0:
                mainImage.setImageResource(R.drawable.home);
                mainText.setTextColor(Color.BLUE);
                break;
            case 1:
                ganhImage.setImageResource(R.drawable.write_blue);
                ganhText.setTextColor(Color.BLUE);
                break;
            case 2:
                shipImage.setImageResource(R.mipmap.cat);
                shipText.setTextColor(Color.BLUE);
                break;
            case 3:
                myImage.setImageResource(R.drawable.user);
                myText.setTextColor(Color.BLUE);
                break;
        }
    }

    private void initLayout() {
        mainImage.setImageResource(R.drawable.home_1);
        mainText.setTextColor(Color.BLACK);
        ganhImage.setImageResource(R.drawable.write);
        ganhText.setTextColor(Color.BLACK);
        shipImage.setImageResource(R.mipmap.img_default);
        shipText.setTextColor(Color.BLACK);
        myImage.setImageResource(R.drawable.user1);
        myText.setTextColor(Color.BLACK);
    }


    @OnClick({R.id.layout_main, R.id.layout_ganh, R.id.layout_video, R.id.layout_my})
    public void onViewClicked(View view) {
        initLayout();
        switch (view.getId()) {
            case R.id.layout_main:
                selectLayout(0);
                viewPage.setCurrentItem(0, false);
                break;
            case R.id.layout_ganh:
                selectLayout(1);
                viewPage.setCurrentItem(1, false);
                break;
            case R.id.layout_video:
                selectLayout(2);
                viewPage.setCurrentItem(2, false);
                break;
            case R.id.layout_my:
                selectLayout(3);
                viewPage.setCurrentItem(3, false);
                break;
        }
    }

    @Override
    public Model creatModel() {
        return new Main2ModelIpl();
    }

    @Override
    public com.example.mvp.view.View creatView() {
        return this;
    }

    @Override
    public BastPresent creatPresent() {
        return new Main2Present();
    }

    @Override
    public void setAdapter(List<Fragment> fragments) {
        viewPage.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
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
        viewPage.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                initLayout();
                selectLayout(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        selectLayout(0);
        viewPage.setOffscreenPageLimit(1);
    }

    @Override
    public void showtost(String info) {

    }
}
