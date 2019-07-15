package com.example.mvp.util;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import com.example.mvp.R;

/**
 * @Author djm
 * @mailbox 1287825756@qq.com
 * @date 2019/7/15 11:15
 */
public class LoadDialog extends Dialog {

    public LoadDialog(Context context) {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.load_view);
        setCanceledOnTouchOutside(false);
    }


}
