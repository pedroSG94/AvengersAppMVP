package com.example.pedro.pruebadagger.UI.model;

import android.util.Log;

import com.example.pedro.pruebadagger.UI.presenter.TakeList;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by pedro on 15/03/16.
 */
public class RetrofitCharge implements RetrofitInterator{

    @Override
    public void onClickAll(final TakeList takeList) {

        makeService().getListAvengers().enqueue(new Callback<List<Vengadores>>() {
            @Override
            public void onResponse(Call<List<Vengadores>> call, Response<List<Vengadores>> response) {
                takeList.takeAllListAvengers(response.body());
            }

            @Override
            public void onFailure(Call<List<Vengadores>> call, Throwable t) {
                Log.e("avengersError", t.getMessage());
            }
        });
    }

    @Override
    public void onClickActive(final TakeList takeList) {

        makeService().getListAvengers().enqueue(new Callback<List<Vengadores>>() {
            @Override
            public void onResponse(Call<List<Vengadores>> call, Response<List<Vengadores>> response) {

                List<Vengadores> avengersActive = new ArrayList<>();
                for (Vengadores v : response.body()) {
                    if (v.isActive()) {
                        avengersActive.add(v);
                    }
                }
                takeList.takeActiveListAvengers(avengersActive);
            }

            @Override
            public void onFailure(Call<List<Vengadores>> call, Throwable t) {
                Log.e("avengersError", t.getMessage());
            }
        });
    }

    @Override
    public void onClickInactive(final TakeList takeList) {

        makeService().getListAvengers().enqueue(new Callback<List<Vengadores>>() {
            @Override
            public void onResponse(Call<List<Vengadores>> call, Response<List<Vengadores>> response) {
                List<Vengadores> avengersInactive = new ArrayList<>();
                for (Vengadores v : response.body()) {
                    if (!v.isActive()) {
                        avengersInactive.add(v);
                    }
                }
                takeList.takeInactiveListAvengers(avengersInactive);
            }

            @Override
            public void onFailure(Call<List<Vengadores>> call, Throwable t) {
                Log.e("avengersError", t.getMessage());
            }
        });
    }
    public VengadoresServiceInterator makeService(){
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://demo9277769.mockable.io")
                .build();

        return retrofit.create(VengadoresServiceInterator.class);
    }
}
