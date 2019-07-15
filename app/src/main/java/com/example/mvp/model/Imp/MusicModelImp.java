package com.example.mvp.model.Imp;

import com.example.mvp.model.MusicModel;
import com.example.mvp.bean.MusicBean;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

/**
 * data 2019/7/8
 * time 17:41
 * bug 线程问题 数据不会返回主线程
 */
public class MusicModelImp implements MusicModel {
    List<MusicBean.ResultBean.ChannellistBean> list = new ArrayList<>();

    @Override
    public List<MusicBean.ResultBean.ChannellistBean> list() {
//        Retrofit retrofit = new Retrofit.Builder().
//                baseUrl(URLContent.BASE_URL).
//                addConverterFactory(GsonConverterFactory.create()).
//                addCallAdapterFactory(RxJava2CallAdapterFactory.create()).
//                build();
//        HttpApi httpApi = retrofit.create(HttpApi.class);
//        Observable<MusicBean> observable = httpApi.getMusic();
//        observable.subscribeOn(Schedulers.io())//在io中进行网络请求
//                .subscribeOn(AndroidSchedulers.mainThread()).//回主线程处理
//                subscribe(new Observer<MusicBean>() {
//            @Override
//            public void onSubscribe(Disposable d) {
//                if (BuildConfig.DEBUG) Log.d("MusicModelImp", "开始请求");
//            }
//
//            @Override
//            public void onNext(MusicBean musicBean) {
//                if (BuildConfig.DEBUG) Log.d("MusicModelImp", "success");
//                list.addAll(musicBean.getResult().get(0).getChannellist());
//
//            }
//
//            @Override
//            public void onError(Throwable e) {
//                if (BuildConfig.DEBUG) Log.d("MusicModelImp", e.toString());
//            }
//
//            @Override
//            public void onComplete() {
//                if (BuildConfig.DEBUG) Log.d("MusicModelImp", "请求成功");
//            }
//        });

//        Call<MusicBean> call = httpApi.getMusic();
//        call.enqueue(new Callback<MusicBean>() {
//            @Override
//            public void onResponse(Call<MusicBean> call, Response<MusicBean> response) {
//                Toast.makeText(MyApplication.getContext(), "success", Toast.LENGTH_SHORT).show();
//                list = response.body().getResult().get(0).getChannellist();
//                if (BuildConfig.DEBUG)
//                    Log.d("MusicModelImp", "response.body().getResult().size():" + response.body().getResult().size());
//            }
//
//            @Override
//            public void onFailure(Call<MusicBean> call, Throwable t) {
//
//            }
//        });
        return list;
    }
}
