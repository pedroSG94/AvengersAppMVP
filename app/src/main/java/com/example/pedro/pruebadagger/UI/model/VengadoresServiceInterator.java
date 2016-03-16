package com.example.pedro.pruebadagger.UI.model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


/**
 * Created by pedro on 15/03/16.
 */
public interface VengadoresServiceInterator {
    @GET("avengers")
    Call<List<Vengadores>> getListAvengers();
}
