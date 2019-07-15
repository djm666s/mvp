package com.example.mvp.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mvp.R;
import com.example.mvp.util.GrideUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
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
}
