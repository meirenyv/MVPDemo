package com.yh.mvpdemo.base;

import android.os.Bundle;

import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;

import butterknife.ButterKnife;

/**
 * @author ${俞欢} QQ:2366081200
 * @name MVPDemo
 * @class describe:
 * @time 2018/4/4 10:21
 * @chang time
 * @change class describe:
 */

public abstract class BaseActivity<V extends  BaseView,P extends BasePresenter<V> >extends RxAppCompatActivity{
   //引用V层和P层
    private  P presenter;
    private  V view;
    public  P  getPresenter(){return  presenter;}

    @Override
    public void onCreate( Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        if (presenter == null) {
            presenter=createPresent();
        }
        if (view == null) {
            view=createView();
        }
        if (presenter != null&&view!=null) {
            presenter.attachView(view);
        }
        init();
    }
    //由子类指定具体类型
    public  abstract  int getLayoutId();
    public  abstract P createPresent();
    public  abstract  V createView();
    public  abstract  void init();
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter != null) {
            presenter.detachView();
        }
    }
}
