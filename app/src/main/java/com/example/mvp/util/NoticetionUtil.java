package com.example.mvp.util;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;

import androidx.media.app.NotificationCompat;

import com.example.mvp.R;

/**
 * @Author djm
 * @mailbox 1287825756@qq.com
 * @date 2019/7/26 10:41
 */
public class NoticetionUtil {

    public static void sendNotice(Intent intent){
        NotificationManager manager= (NotificationManager) MyApplication.getContext().getSystemService(Context.NOTIFICATION_SERVICE);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            Notification notification=new Notification.Builder(MyApplication.getContext(),"FA").
                    setLargeIcon(BitmapFactory.decodeResource(MyApplication.getContext().getResources(),R.mipmap.cat))
                    .setSmallIcon(R.mipmap.bg1)
                    .setContentText("消息通知...")
                    .setContentTitle("通知")
                    .setContentIntent(PendingIntent.getActivity(MyApplication.getContext(),1,intent,0))
                    .build();
            manager.notify(1,notification);
        }

    }
}
