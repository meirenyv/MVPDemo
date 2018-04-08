package com.yh.mvpdemo.api;

import com.yh.mvpdemo.base.BaseApi;

/**
 * @author ${俞欢} QQ:2366081200
 * @name MVPDemo
 * @class describe:
 * @time 2018/4/4 11:12
 * @chang time
 * @change class describe:
 */

public class Api {
    private String baseUrl="http://www.kuaidi100.com/";
    private  volatile static ApiService apiService;

    private Api() {
        BaseApi baseApi=new BaseApi();
        apiService=baseApi.getRetrofit(baseUrl).create(ApiService.class);
    }

    public  static ApiService getApiService(){
        if (apiService == null) {
            synchronized (Api.class){
                if (apiService == null) {
                    new Api();
                }
            }
        }
        return  apiService;
    }
}
