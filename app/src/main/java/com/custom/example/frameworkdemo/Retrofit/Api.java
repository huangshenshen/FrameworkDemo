package com.custom.example.frameworkdemo.Retrofit;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Administrator on 2017/9/11 0011.
 */

public interface Api {
    @POST("appAccountResource/appLogin")
    Call<ResponseBody> getLogin(@Query("username")String username, @Query("password")String password);
    @GET("index")
    Call<Weather> getWeather(@Query("cityname")String cityname,@Query("key")String key);


}
