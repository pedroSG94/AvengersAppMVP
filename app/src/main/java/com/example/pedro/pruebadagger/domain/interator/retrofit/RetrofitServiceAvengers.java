package com.example.pedro.pruebadagger.domain.interator.retrofit;

import com.example.pedro.pruebadagger.app.base.BaseInteractor;
import com.example.pedro.pruebadagger.app.executor.InteractorExecutor;
import com.example.pedro.pruebadagger.app.executor.MainThreadExecutor;
import com.example.pedro.pruebadagger.data.retrofit.model.AvengersRetrofit;
import com.example.pedro.pruebadagger.data.retrofit.service.AvengersService;
import com.example.pedro.pruebadagger.data.retrofit.service.IronManDescriptionService;
import com.example.pedro.pruebadagger.domain.model.IronMan;

import java.io.IOException;
import java.util.List;

import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by pedro on 17/03/16.
 */
public abstract class RetrofitServiceAvengers extends BaseInteractor{

    public RetrofitServiceAvengers(InteractorExecutor interactorExecutor, MainThreadExecutor mainThreadExecutor) {
        super(interactorExecutor, mainThreadExecutor);
    }

    public Response<List<AvengersRetrofit>> makeCallback() throws IOException{
        return makeService().getListAvengers().execute();
    }

    public abstract List<AvengersRetrofit> makeList(Response<List<AvengersRetrofit>> response);

    private AvengersService makeService(){
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://demo9277769.mockable.io")
                .build();

        return retrofit.create(AvengersService.class);
    }
}
