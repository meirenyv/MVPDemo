package com.yh.mvpdemo.base;

/**
 * @author ${俞欢} QQ:2366081200
 * @name MVPDemo
 * @class describe:
 * @time 2018/4/3 11:23
 * @chang time
 * @change class describe:
 */

public class BaseResponse<T> {
    private  String msg;
    private  int code;
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
