package com.example.mvp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mvp.BuildConfig;
import com.example.mvp.R;
import com.example.mvp.api.BaseApi;
import com.example.mvp.helper.RetrofitHelper;
import com.example.mvp.service.DownloadScervice;
import com.example.mvp.util.DownloadUtil;
import com.example.mvp.util.GrideUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;
import uk.co.senab.photoview.PhotoView;

public class ImageActivity extends AppCompatActivity {

    @BindView(R.id.photo_view)
    PhotoView photoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        ButterKnife.bind(this);
        if (getIntent().getStringExtra("url").isEmpty()) {
            photoView.setImageResource(getIntent().getIntExtra("icon", 0));
        } else {
            GrideUtil.getRul(getIntent().getStringExtra("url"), photoView);
        }
    }

    @OnClick(R.id.xiazai)
    public void onViewClicked() {
        Intent intent = new Intent(this, DownloadScervice.class);
        intent.putExtra("url", getIntent().getStringExtra("url"));
        startService(intent);
    }
}
