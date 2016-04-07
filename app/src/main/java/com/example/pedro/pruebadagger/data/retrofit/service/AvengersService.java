package com.example.pedro.pruebadagger.data.retrofit.service;

import com.example.pedro.pruebadagger.data.retrofit.model.AvengersRetrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


/**
 * Created by pedro on 15/03/16.
 */
public interface AvengersService {
    @GET("avengers")
    Call<List<AvengersRetrofit>> getListAvengers();
}
