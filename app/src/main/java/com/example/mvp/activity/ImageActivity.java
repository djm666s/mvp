package com.example.mvp.activity;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mvp.BuildConfig;
import com.example.mvp.R;
import com.example.mvp.api.BaseApi;
import com.example.mvp.helper.RetrofitHelper;
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

        RetrofitHelper.getInstance().chenge(BaseApi.Dowanload);
        Observable<ResponseBody> observable = RetrofitHelper.getInstance().getApi().getDolwanload(getIntent().getStringExtra("url"));
        observable.subscribeOn(Schedulers.io()).
                observeOn(AndroidSchedulers.mainThread()).
                subscribe(new Observer<ResponseBody>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(ResponseBody body) {
                        DownloadUtil.DownloadPic(getIntent().getStringExtra("url"), body);
                    }

                    @Override
                    public void onError(Throwable e) {
//                        Toast.makeText(ImageActivity.this, "onError", Toast.LENGTH_SHORT).show();
                        if (BuildConfig.DEBUG) Log.d("ImageActivity", e.toString());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
