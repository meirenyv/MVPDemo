package com.yh.mvpdemo.presenter;

import android.content.Context;

import com.yh.mvpdemo.base.BaseResponse;
import com.yh.mvpdemo.contract.LoginContract;
import com.yh.mvpdemo.entity.Login;
import com.yh.mvpdemo.modle.LoginModel;
import com.yh.mvpdemo.progress.ObserverResponseListener;
import com.yh.mvpdemo.utils.ExceptionHandle;
import com.yh.mvpdemo.utils.ToastUtil;

import java.util.HashMap;
import java.util.List;

/**
 * @author ${俞欢} QQ:2366081200
 * @name MVPDemo
 * @class describe:
 * @time 2018/4/4 16:54
 * @chang time
 * @change class describe:
 */

public class LoginPresenter extends LoginContract.Presenter {
    private LoginModel model;
    private Context context;

    public LoginPresenter( Context context) {
        this.model = new LoginModel();
        this.context = context;
    }



    @Override
    public void login(HashMap<String, String> map, boolean isDialog, boolean cancelable) {
        model.login(context, map, isDialog, cancelable, getView().bindLifecycle(), new ObserverResponseListener() {
            @Override
            public void onNext(Object o) {

                if (getView() != null) {
                    getView().result((BaseResponse<List<Login>>) o);
                    getView().setMsg("请求成功");
                }
            }

            @Override
            public void onError(ExceptionHandle.ResponeThrowable e) {
                if (getView() != null) {
                    ToastUtil.showShortToast(ExceptionHandle.handleException(e).message);

                }
            }
        });
    }
}
