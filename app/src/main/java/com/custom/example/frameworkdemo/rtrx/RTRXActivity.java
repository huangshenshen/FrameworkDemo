package com.custom.example.frameworkdemo.rtrx;

import android.os.Bundle;
import android.support.v4.app.NotificationCompatBase;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.custom.example.frameworkdemo.R;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.Subject;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RTRXActivity extends AppCompatActivity {

    @BindView(R.id.result_tv)
    TextView resultTv;
    @BindView(R.id.result_btn)
    Button resultBtn;
    private Subscriber<MovieEntity> subscriber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rtrx);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.result_btn)
    public void onClick() {
       // 1、getMovie();
        getMovieRTRX();
        //getMovies();
    }
    private void getMovies(){
        subscriber = new Subscriber<MovieEntity>() {
            @Override
            public void onSubscribe(Subscription s) {

            }

            @Override
            public void onNext(MovieEntity movieEntity) {
                resultTv.setText(movieEntity.toString());
            }

            @Override
            public void onError(Throwable t) {
                Toast.makeText(RTRXActivity.this, "加载错误", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onComplete() {
                Toast.makeText(RTRXActivity.this, "加载完成", Toast.LENGTH_SHORT).show();
            }
        };
        HttpMethods.getInstance().getTopMovie(subscriber,0,10);
    }
    private void getMovieRTRX(){
        String baseUrl = "https://api.douban.com/v2/movie/";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        MovieService movieService = retrofit.create(MovieService.class);
        movieService.getMovieTop(0,10)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subject<MovieEntity>() {
                    @Override
                    public boolean hasObservers() {
                        return false;
                    }

                    @Override
                    public boolean hasThrowable() {
                        return false;
                    }

                    @Override
                    public boolean hasComplete() {
                        return false;
                    }

                    @Override
                    public Throwable getThrowable() {
                        return null;
                    }

                    @Override
                    protected void subscribeActual(Observer<? super MovieEntity> observer) {

                    }

                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull MovieEntity movieEntity) {
                        resultTv.setText(movieEntity.toString());
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        Toast.makeText(RTRXActivity.this, "加载错误", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onComplete() {
                        Toast.makeText(RTRXActivity.this, "加载完成", Toast.LENGTH_SHORT).show();
                    }
                });


    }
    /**
    //进行网络请求 单个Retrofit
    private void getMovie(){
        String baseUrl = "https://api.douban.com/v2/movie/";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        MovieService movieService = retrofit.create(MovieService.class);
        Call<MovieEntity> call = movieService.getMovieTop(0,10);
        call.enqueue(new Callback<MovieEntity>() {
            @Override
            public void onResponse(Call<MovieEntity> call, Response<MovieEntity> response) {
                resultTv.setText(response.body().toString());
            }

            @Override
            public void onFailure(Call<MovieEntity> call, Throwable t) {
                resultTv.setText(t.getMessage().toString());
            }
        });


    }
     */
}
