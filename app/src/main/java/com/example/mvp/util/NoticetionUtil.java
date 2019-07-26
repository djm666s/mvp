package com.example.mvp.util;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Build;

import androidx.media.app.NotificationCompat;

import com.example.mvp.R;

/**
 * @Author djm
 * @mailbox 1287825756@qq.com
 * @date 2019/7/26 10:41
 */
public class NoticetionUtil {

    public static void getNotifition(String title,String contexttext,Intent intent) {
        NotificationManager manager = (NotificationManager) MyApplication.getContext().getSystemService(Context.NOTIFICATION_SERVICE);
        Notification.Builder notification ;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            notification=new Notification.Builder(MyApplication.getContext(),"channel");
        }else {
            notification=new Notification.Builder(MyApplication.getContext());
        }
        notification.setContentTitle(title);
        notification .setContentText(contexttext);
        notification .setWhen(System.currentTimeMillis());
        notification  .setSmallIcon(R.mipmap.hread);
        notification  .setLargeIcon(BitmapFactory.decodeResource(MyApplication.getContext().getResources(), R.mipmap.cat));
        notification  .setAutoCancel(true);
        //点击跳转
        PendingIntent pendingIntent=PendingIntent.getActivity(MyApplication.getContext(), 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
        notification.setContentIntent(pendingIntent);
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
            NotificationChannel channel = new NotificationChannel("channel", "测试", NotificationManager.IMPORTANCE_DEFAULT);
            manager.createNotificationChannel(channel);
        }
        manager.notify(1, notification.build());
    }
}
