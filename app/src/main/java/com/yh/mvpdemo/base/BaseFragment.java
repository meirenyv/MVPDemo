package com.yh.mvpdemo.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.trello.rxlifecycle2.components.RxFragment;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * @author ${俞欢} QQ:2366081200
 * @name MVPDemo
 * @class describe:
 * @time 2018/4/3 13:57
 * @chang time
 * @change class describe:
 */

public abstract class BaseFragment <V extends  BaseView,P extends BasePresenter<V>> extends RxFragment{
    //引用V层和P层
    private  P presenter;
    private V view;
    public P getPresenter(){
        return  presenter;
    }
    public Context mContext;
    private Unbinder unbinder;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
       View view=inflater.inflate(getLayoutId(),container,false);
       unbinder= ButterKnife.bind(this,view);
       mContext=getActivity();
        if (presenter == null) {
            presenter=createPresenter();
        }
        if (this.view == null) {
            this.view=creatView();
        }
        if (presenter != null&&view!=null) {
            presenter.attachView(this.view);
        }
        init();
        return view;
    }
    //由子类指定具体类型
    public  abstract  int getLayoutId();
    public  abstract  P createPresenter();
    public  abstract V creatView();
    public  abstract  void  init();

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (presenter != null) {
            presenter.detachView();
        }if (unbinder!=null){
            unbinder.unbind();
        }
    }
}
