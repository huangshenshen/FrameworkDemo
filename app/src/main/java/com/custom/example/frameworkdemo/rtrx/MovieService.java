package com.custom.example.frameworkdemo.rtrx;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Administrator on 2017/9/26 0026.
 */

public interface MovieService {
    @GET("top250")
    Observable<MovieEntity> getMovieTop(@Query("start")int start,@Query("count")int count);
    /**
     * 单个retrofit2使用时
       Call<MovieEntity> getMovieTop(@Query("start") int start,@Query("count") int count);
     *
     */

}
