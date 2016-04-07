package com.example.pedro.pruebadagger.domain.interator.retrofit;

import com.example.pedro.pruebadagger.app.base.BaseInteractor;
import com.example.pedro.pruebadagger.app.executor.InteractorExecutor;
import com.example.pedro.pruebadagger.app.executor.MainThreadExecutor;
import com.example.pedro.pruebadagger.data.retrofit.model.IronManRetrofit;
import com.example.pedro.pruebadagger.data.retrofit.service.IronManDescriptionService;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by pedro on 7/04/16.
 */
public abstract class RetrofitServiceIronMan extends BaseInteractor {

    public RetrofitServiceIronMan(InteractorExecutor interactorExecutor, MainThreadExecutor mainThreadExecutor) {
        super(interactorExecutor, mainThreadExecutor);
    }

    private IronManDescriptionService makeServiceIronMan(){
        //log de la peticion de retrofit
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(logging);

        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://demo9277769.mockable.io")
                .client(httpClient.build())
                .build();

        return retrofit.create(IronManDescriptionService.class);
    }

    public Response<IronManRetrofit> makeCallback() throws IOException {
        return makeServiceIronMan().getIronManDescription().execute();
    }

    public IronManRetrofit makeIronManRetrofit(Response<IronManRetrofit> response){
        return response.body();
    }
}
