package com.yh.mvpdemo.base;

import android.content.Context;

import com.yh.mvpdemo.progress.ObserverResponseListener;
import com.yh.mvpdemo.progress.ProgressObserver;

import io.reactivex.Observable;
import io.reactivex.ObservableTransformer;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * @author ${俞欢} QQ:2366081200
 * @name MVPDemo
 * @class describe:
 * @time 2018/4/3 13:15
 * @chang time
 * @change class describe: M层父类
 * 封装线程管理和订阅过程 是否添加progressdialog
 */

public class BaseModel<T> {
    public void subscribe(Context context, final Observable observable, ObserverResponseListener<T> listener,
                          ObservableTransformer<T, T> transformer, boolean isDialog, boolean cancelable) {
        final Observer<T> observer = new ProgressObserver<>(context, listener, isDialog, cancelable);
        observable.compose(transformer)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }

    public void subscribe(Context context, final Observable observable, ObserverResponseListener<T> listener,
                          ObservableTransformer<T, T> transformer) {
        subscribe(context, observable, listener, transformer, true, true);
    }
}
