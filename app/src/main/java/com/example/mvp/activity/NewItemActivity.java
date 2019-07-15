package com.example.mvp.activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mvp.BuildConfig;
import com.example.mvp.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NewItemActivity extends AppCompatActivity {

    @BindView(R.id.webview)
    WebView webview;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_item);
        ButterKnife.bind(this);
        String url = "https://news-at.zhihu.com/story/";
        url = url + getIntent().getStringExtra("new_url");
        if (BuildConfig.DEBUG) Log.d("NewItemActivity", url);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.setWebChromeClient(new WebChromeClient());
        webview.setWebViewClient(new WebViewClient());
        if (getIntent().getStringExtra("new_url") == null || getIntent().getStringExtra("new_url").isEmpty()) {
            webview.loadUrl(getIntent().getStringExtra("new_url_toutiao"));
        } else {
            webview.loadUrl(url);
        }
    }
}
