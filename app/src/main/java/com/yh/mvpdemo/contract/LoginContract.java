package com.yh.mvpdemo.contract;

import com.yh.mvpdemo.base.BasePresenter;
import com.yh.mvpdemo.base.BaseResponse;
import com.yh.mvpdemo.base.BaseView;
import com.yh.mvpdemo.entity.Login;

import java.util.HashMap;
import java.util.List;

import io.reactivex.ObservableTransformer;

/**
 * @author ${俞欢} QQ:2366081200
 * @name MVPDemo
 * @class describe:
 * @time 2018/4/4 16:42
 * @chang time
 * @change class describe: V P契约类
 */

public interface LoginContract {
    interface  View extends BaseView{
        void  result(BaseResponse<List<Login>> data);
        void  setMsg(String msg);
        <T>ObservableTransformer<T,T>bindLifecycle();
    }
    abstract  class  Presenter extends BasePresenter<View>{
        public  abstract  void  login(HashMap<String,String>map,boolean isDialog,boolean cancelable);
    }
}
