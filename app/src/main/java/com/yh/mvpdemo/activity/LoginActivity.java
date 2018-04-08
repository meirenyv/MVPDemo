package com.yh.mvpdemo.activity;

import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.yh.mvpdemo.R;
import com.yh.mvpdemo.base.BaseActivity;
import com.yh.mvpdemo.base.BaseResponse;
import com.yh.mvpdemo.contract.LoginContract;
import com.yh.mvpdemo.entity.Login;
import com.yh.mvpdemo.presenter.LoginPresenter;

import java.util.HashMap;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;
import io.reactivex.ObservableTransformer;

public class LoginActivity extends BaseActivity<LoginContract.View, LoginPresenter> implements LoginContract.View {

    @BindView(R.id.main_check_btn)
    Button mainCheckBtn;
    @BindView(R.id.main_msg_tv)
    TextView mainMsgTv;

    @Override
    public int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    public LoginPresenter createPresent() {
        return new LoginPresenter(this);
    }

    @Override
    public LoginContract.View createView() {
        return this;
    }

    @Override
    public void init() {

    }

    @Override
    public void result(BaseResponse<List<Login>> data) {
        mainMsgTv.setText(data.getData().toString());

    }

    @Override
    public void setMsg(String msg) {
       // ToastUtil.showShortToast(msg);
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }

    @Override
    public <T> ObservableTransformer<T, T> bindLifecycle() {
        return this.bindToLifecycle();//绑定activity，与activity生命周期一样
    }



    @OnClick(R.id.main_check_btn)
    public void onViewClicked() {
        mainMsgTv.setText("");
        HashMap<String,String> map = new HashMap<>();
        map.put("type","yuantong");
        map.put("postid","11111111111");
//                map.put("mobile","18328008870");
//                map.put("secret","34ba01d602c88790bbe81a7aca8d3a9f");
//                KLog.e("mobile:  "+"18328008870"+"  secret:   "+"34ba01d602c88790bbe81a7aca8d3a9f");
        getPresenter().login(map,true,true);
    }
}
