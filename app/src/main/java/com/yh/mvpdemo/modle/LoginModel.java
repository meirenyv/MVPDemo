package com.yh.mvpdemo.modle;

import android.content.Context;

import com.yh.mvpdemo.api.Api;
import com.yh.mvpdemo.base.BaseModel;
import com.yh.mvpdemo.progress.ObserverResponseListener;

import java.util.HashMap;

import io.reactivex.ObservableTransformer;

/**
 * @author ${俞欢} QQ:2366081200
 * @name MVPDemo
 * @class describe:
 * @time 2018/4/4 16:28
 * @chang time
 * @change class describe:
 */

public class LoginModel<T>extends BaseModel {
    public  void  login(Context context, HashMap<String ,String>map, boolean isDialog, boolean cancelable,
                        ObservableTransformer<T,T> transformer, ObserverResponseListener observerListener){
        subscribe(context, Api.getApiService().login(map), observerListener,transformer,isDialog,cancelable);
    }
}
