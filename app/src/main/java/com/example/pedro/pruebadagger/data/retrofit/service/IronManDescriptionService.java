package com.example.pedro.pruebadagger.data.retrofit.service;

import com.example.pedro.pruebadagger.data.retrofit.model.IronManRetrofit;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by pedro on 6/04/16.
 */
public interface IronManDescriptionService {

    @GET("avengers/1")
    Call<IronManRetrofit> getIronManDescription();
}
