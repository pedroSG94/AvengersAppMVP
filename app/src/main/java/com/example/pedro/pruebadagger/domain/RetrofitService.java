package com.example.pedro.pruebadagger.domain;

import android.util.Log;

import com.example.pedro.pruebadagger.data.model.Vengadores;
import com.example.pedro.pruebadagger.data.retrofit.RetrofitInterator;
import com.example.pedro.pruebadagger.data.retrofit.VengadoresServiceInterator;
import com.example.pedro.pruebadagger.ui.main.view.MainView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by pedro on 17/03/16.
 */
public abstract class RetrofitService{

    public void makeCallback(final MainView takeList){
        makeService().getListAvengers().enqueue(new Callback<List<Vengadores>>() {
            @Override
            public void onResponse(Call<List<Vengadores>> call, Response<List<Vengadores>> response) {
                makeList(takeList, response);
            }

            @Override
            public void onFailure(Call<List<Vengadores>> call, Throwable t) {
                Log.e("avengersError", t.getMessage());
            }
        });
    }

    protected abstract void makeList(MainView takeList,  Response<List<Vengadores>> response);

    private VengadoresServiceInterator makeService(){
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://demo9277769.mockable.io")
                .build();

        return retrofit.create(VengadoresServiceInterator.class);
    }
}
