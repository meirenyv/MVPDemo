package com.yh.mvpdemo.utils;

import android.app.Application;
import android.content.Context;

/**
 * @author ${俞欢} QQ:2366081200
 * @name MVPDemo
 * @class describe:
 * @time 2018/4/2 15:37
 * @chang time
 * @change class describe:
 */

public class ApplicationUtils extends Application {
    private  static Context mContext;//全局上下文对象

    @Override
    public void onCreate() {
        super.onCreate();
        mContext=getApplicationContext();
    }
    public  static  Context getContext(){
        return  mContext;
    }
}
