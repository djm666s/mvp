package com.example.mvp.presenter;

import com.example.mvp.model.MusicModel;
import com.example.mvp.view.MusicView;

public class MusicPresent extends BastPresent<MusicModel, MusicView> {
    @Override
    protected void onDestroyView() {

    }

    /**
     * 数据绑定
     */
    @Override
    public void getdata() {
//        List<MusicBean.ResultBean.ChannellistBean> list = new ArrayList<>();
//        Handler handler = new Handler() {
//            @Override
//            public void handleMessage(@NonNull Message msg) {
//                super.handleMessage(msg);
//                getView().setAdapter(list);
//            }
//        };
//        if (model != null) {
//            if (getView() != null) {
//                Retrofit retrofit = new Retrofit.Builder().
//                        baseUrl().
//                        addConverterFactory(GsonConverterFactory.create()).
//                        addCallAdapterFactory(RxJava2CallAdapterFactory.create()).
//                        build();
//                HttpApi httpApi = retrofit.create(HttpApi.class);
//                Observable<MusicBean> observable = httpApi.getMusic();
//                observable.subscribeOn(Schedulers.io())//在io中进行网络请求
//                        .subscribeOn(AndroidSchedulers.mainThread()).//回主线程处理
//                        subscribe(new Observer<MusicBean>() {
//                    @Override
//                    public void onSubscribe(Disposable d) {
//                        if (BuildConfig.DEBUG) Log.d("MusicModelImp", "开始请求");
//                    }
//
//                    @Override
//                    public void onNext(MusicBean musicBean) {
//                        if (BuildConfig.DEBUG) Log.d("MusicModelImp", "success");
//                        list.addAll(musicBean.getResult().get(0).getChannellist());
//                        handler.sendEmptyMessage(200);
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                        if (BuildConfig.DEBUG) Log.d("MusicModelImp", e.toString());
//                    }
//
//                    @Override
//                    public void onComplete() {
//                        if (BuildConfig.DEBUG) Log.d("MusicModelImp", "请求成功");
//                    }
//                });
//            }
//        }
    }
}
