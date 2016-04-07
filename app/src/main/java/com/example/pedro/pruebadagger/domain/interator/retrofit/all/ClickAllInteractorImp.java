package com.example.pedro.pruebadagger.domain.interator.retrofit.all;

import com.example.pedro.pruebadagger.app.executor.InteractorExecutor;
import com.example.pedro.pruebadagger.app.executor.MainThreadExecutor;
import com.example.pedro.pruebadagger.data.retrofit.mapper.avengers.MapAvengers;
import com.example.pedro.pruebadagger.data.retrofit.model.AvengersRetrofit;
import com.example.pedro.pruebadagger.domain.interator.retrofit.RetrofitServiceAvengers;
import com.example.pedro.pruebadagger.domain.model.Avengers;

import java.io.IOException;
import java.util.List;

import retrofit2.Response;

/**
 * Created by pedro on 17/03/16.
 */
public class ClickAllInteractorImp extends RetrofitServiceAvengers implements ClickAllInteractor {

    private Callback callback;
    private MapAvengers mapAvengers;

    public ClickAllInteractorImp(InteractorExecutor interactorExecutor, MainThreadExecutor mainThreadExecutor, MapAvengers mapAvengers) {
        super(interactorExecutor, mainThreadExecutor);
        this.mapAvengers = mapAvengers;
    }

    @Override
    public List<AvengersRetrofit> makeList(Response<List<AvengersRetrofit>> response) {
        return response.body();
    }

    @Override
    public void run() {
        try {
            final List<Avengers> list = mapAvengers.mapAvengersRetrofitToAvengers(makeList(makeCallback()));
            executeOnMainThread(new Runnable() {
                @Override
                public void run() {
                    callback.onSucess(list);
                }
            });
        }
        catch (IOException e) {
            callback.onError(e);
        }
    }

    @Override
    public void clickAll(Callback callback) {
        this.callback = callback;
        executeCurrentInteractor();
    }
}
