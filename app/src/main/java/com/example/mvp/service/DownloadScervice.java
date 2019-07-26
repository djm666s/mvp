package com.example.mvp.service;

import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.example.mvp.BuildConfig;
import com.example.mvp.R;
import com.example.mvp.api.BaseApi;
import com.example.mvp.helper.RetrofitHelper;
import com.example.mvp.util.DownloadUtil;
import com.example.mvp.util.inter.Download;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;

/**
 * @Author djm
 * @mailbox 1287825756@qq.com
 * @date 2019/7/26 15:37
 */
    public class DownloadScervice extends Service {
    Handler handler=new Handler(){
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case 200:
                    Toast.makeText(DownloadScervice.this, "下载完成", Toast.LENGTH_SHORT).show();
                    break;
                case 100:
                    Toast.makeText(DownloadScervice.this, "下载失败", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    };
    private DowanIbinder mBinder=new DowanIbinder();
    public class DowanIbinder extends Binder {
        public void startDownload() {
            if (BuildConfig.DEBUG) Log.d("DownlaodBinder", "startDownload");
        }

        public int getProgress() {
            if (BuildConfig.DEBUG) Log.d("DownlaodBinder", "getProgress");
            return 0;
        }
    }
    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }



    private Download mDownload = new Download() {
        @Override
        public void onProgess(int progess) {
            if (BuildConfig.DEBUG) Log.d("DownloadScervice", "progess:" + progess);
            getNotification(progess);
            if (progess==100){
            stopSelf();
            }
        }

        @Override
        public void onSuccess() {
            handler.sendEmptyMessage(200);
           if (BuildConfig.DEBUG) Log.d("DownloadScervice", "success");
        }

        @Override
        public void onFailed() {
        handler.sendEmptyMessage(100);
        }
    };

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        RetrofitHelper.getInstance().chenge(BaseApi.Dowanload);
        Observable<ResponseBody> observable = RetrofitHelper.getInstance().getApi().getDolwanload(intent.getStringExtra("url"));
        if (BuildConfig.DEBUG) Log.d("DownloadScervice", intent.getStringExtra("url"));
        observable.subscribeOn(Schedulers.io()).
                subscribe(new Observer<ResponseBody>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(ResponseBody body) {
                        DownloadUtil downloadUtil=new  DownloadUtil(mDownload);
                        downloadUtil.DownloadPic(intent.getStringExtra("url"), body);
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
        return super.onStartCommand(intent, flags, startId);
    }

    private void getNotification(int progess) {
        NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        Notification.Builder builder;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            builder = new Notification.Builder(this, "ad");
        } else {
            builder = new Notification.Builder(this);
        }
        builder.setContentTitle("下载");

        builder.setSmallIcon(R.mipmap.hread);
        builder.setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.cat));
        builder.setWhen(System.currentTimeMillis());
        builder.setContentText(progess + "%");
        builder.setProgress(100, progess, false);
//        builder.setContentIntent(PendingIntent.getActivity(this, 0, intent, 0));
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel("ad", "download", NotificationManager.IMPORTANCE_DEFAULT);
            manager.createNotificationChannel(channel);
        }
        startForeground(1, builder.build());
    }
}
