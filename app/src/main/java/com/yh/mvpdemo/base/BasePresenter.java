package com.yh.mvpdemo.base;

/**
 * @author ${俞欢} QQ:2366081200
 * @name MVPDemo
 * @class describe:
 * @time 2018/4/3 11:30
 * @chang time
 * @change class describe:
 */

public class BasePresenter<V extends BaseView> {
    private  V mView;
    public V getView(){
        return  mView;
    }
    public  void  attachView(V v){
        mView=v;
    }
    public  void  detachView(){
        mView=null;
    }
}
