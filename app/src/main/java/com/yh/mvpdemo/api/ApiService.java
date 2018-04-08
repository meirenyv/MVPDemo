package com.yh.mvpdemo.api;

import com.yh.mvpdemo.base.BaseResponse;
import com.yh.mvpdemo.entity.Login;

import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

/**
 * @author ${俞欢} QQ:2366081200
 * @name MVPDemo
 * @class describe:
 * @time 2018/4/4 11:15
 * @chang time
 * @change class describe: api service
 */

public interface ApiService {
    @POST("query")
    Observable<BaseResponse<List<Login>>>login(@QueryMap Map<String,String>map);
}
