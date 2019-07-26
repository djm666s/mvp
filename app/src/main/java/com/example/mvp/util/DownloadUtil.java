package com.example.mvp.util;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import android.widget.Toast;

import com.example.mvp.BuildConfig;
import com.example.mvp.util.inter.Download;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import okhttp3.ResponseBody;

/**
 * @Author djm
 * @mailbox 1287825756@qq.com
 * @date 2019/7/19 10:26
 */
public class DownloadUtil {
    private Download mDownload;

    public DownloadUtil(Download download) {
        this.mDownload = download;
    }

    public void DownloadPic(String url, ResponseBody body ) {

        if (Environment.getExternalStorageState().equals(
                Environment.MEDIA_MOUNTED)) {
            @SuppressLint("SdCardPath") File dir = new File("/sdcard/");
            if (!dir.exists()) {
                dir.mkdir();
            }
            @SuppressLint("SdCardPath") File file = new File("/sdcard/" + url.substring(url.length() - 8, url.length()));
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            long downall = 0;
            long downnow = 0;
            InputStream in = null;
            OutputStream os = null;
            try {
                byte[] byteszie = new byte[2048];
                in = body.byteStream();
                downall = body.contentLength();
//            Toast.makeText(MyApplication.getContext(), "body.contentLength():" + body.contentLength(), Toast.LENGTH_SHORT).show();
                os = new FileOutputStream(file);
                int read;
                try {
                    while ((read = in.read(byteszie)) != -1) {
                        os.write(byteszie, 0, read);
                        downnow += read;
                        mDownload.onProgess((int) (downnow * 100 / downall));
                    }
                    os.flush();
                    mDownload.onSuccess();
//                Toast.makeText(MyApplication.getContext(), "下载成功" + file.getPath().toString(), Toast.LENGTH_SHORT).show();
//                    Toast.makeText(MyApplication.getContext(), "下载成功", Toast.LENGTH_SHORT).show();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (in != null) {
                        try {
                            in.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (os != null) {
                        try {
                            os.close();
                        } catch (IOException e) {
                            mDownload.onFailed();
                            e.printStackTrace();
                        }
                    }
                }
            } catch (FileNotFoundException e) {
                mDownload.onFailed();
                e.printStackTrace();
            }
        } else {

        }
    }
}
