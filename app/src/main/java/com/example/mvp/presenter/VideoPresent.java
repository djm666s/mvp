package com.example.mvp.presenter;

import com.example.mvp.model.VideoModel;
import com.example.mvp.view.VideoView;

public class VideoPresent extends BastPresent<VideoModel, VideoView> {
    @Override
    protected void onDestroyView() {

    }
    public  void getpathUrl(){
        if (model != null) {
            if (getView() != null) {
                getView().setlunbo(model.getUlrPath());
            }
        }
    }
    @Override
    public void getdata() {
        if (model != null) {
            if (getView() != null) {
                getView().setData(model.getData());
            }
        }
    }

    public void getYundin(){
        if (model != null) {
            if (getView() != null) {
                getView().setData(model.Yunding());
            }
        }
    }

    public void getNvSheng(){
        if (model != null) {
            if (getView() != null) {
                getView().setData(model.NvSheng());
            }
        }
    }
}
