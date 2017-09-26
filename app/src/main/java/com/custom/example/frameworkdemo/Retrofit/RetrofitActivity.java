package com.custom.example.frameworkdemo.Retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.custom.example.frameworkdemo.R;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitActivity extends AppCompatActivity {
    private Api mApi;
    private Button button;
    private Call<Weather> loginCall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit);
        button = (Button) findViewById(R.id.btn);
        //创建retrofit对象
        newRectrofit();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(RetrofitActivity.this, "点击事件", Toast.LENGTH_SHORT).show();
                login();
                //getMsg();
            }
        });
    }
    private void getMsg(){
        loginCall.enqueue(new Callback<Weather>() {
            @Override
            public void onResponse(Call<Weather> call, Response<Weather> response) {
                Toast.makeText(RetrofitActivity.this, "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<Weather> call, Throwable t) {

            }
        });
    }
    public void login(){
        loginCall.enqueue(new Callback<Weather>() {
            @Override
            public void onResponse(Call<Weather> call, Response<Weather> response) {
                if (response.isSuccessful()){
                    Weather weather = response.body();
                    if (weather!=null){
                        Log.i("aaa","---"+response.body().getResult().getToday().getCity());
                    }

                }


//                Toast.makeText(RetrofitActivity.this, ""+response.toString(), Toast.LENGTH_SHORT).show();
//                try {
//                    Log.i("aaa","登录返回的"+new String(response.body().getReason()));
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
            }

            @Override
            public void onFailure(Call<Weather> call, Throwable t) {
                Toast.makeText(RetrofitActivity.this, ""+t.toString(), Toast.LENGTH_SHORT).show();
                Log.i("aaa","登录失败返回的"+t.toString());
            }
        });
    }
    //创建retrofit对象
    public void newRectrofit(){
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://v.juhe.cn/weather/")
                .build();
        mApi = retrofit.create(Api.class);
        //loginCall = mApi.getLogin("123","123456");
        loginCall = mApi.getWeather("郑州","76152f2c7516dbbec3864cd0b3e80d40");
    }

}
