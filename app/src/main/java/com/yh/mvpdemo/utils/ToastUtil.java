package com.yh.mvpdemo.utils;

import android.content.Context;
import android.os.Looper;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @author ${俞欢} QQ:2366081200
 * @name MVPDemo
 * @class describe:
 * @time 2018/4/2 17:20
 * @chang time
 * @change class describe:
 */

public class ToastUtil {
    private  static Toast toast;
    private  static TextView stoast;
    public  static  void  showShortToast(String msg){
        // TODO: 2018/4/2
    }
    private  static  void  showCustomToast(final Context context,final  String msg,final int duration){
        if (context == null) {
            return;
        }
        if (Looper.myLooper()==Looper.getMainLooper()){
            // TODO: 2018/4/2
        }
    }
    private  static  void  showToast(Context context, String msg, int duration){
        if (null!=context) {
            if (toast==null){
                toast=new Toast(context);
                LayoutInflater inflater=LayoutInflater.from(context);
             //   View layout=inflater.inflate(R.layout., null);
            }
        }
    }
}
