package com.example.mvp.bean;

public class BaseRequst<T>  {
    private String version="v1";
    private T obj;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
