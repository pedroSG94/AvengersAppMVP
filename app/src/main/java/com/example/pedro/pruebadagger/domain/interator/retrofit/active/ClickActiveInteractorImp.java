package com.example.pedro.pruebadagger.domain.interator.retrofit.active;

import com.example.pedro.pruebadagger.app.executor.InteractorExecutor;
import com.example.pedro.pruebadagger.app.executor.MainThreadExecutor;
import com.example.pedro.pruebadagger.data.retrofit.mapper.avengers.MapAvengers;
import com.example.pedro.pruebadagger.data.retrofit.model.AvengersRetrofit;
import com.example.pedro.pruebadagger.domain.interator.retrofit.RetrofitServiceAvengers;
import com.example.pedro.pruebadagger.domain.model.Avengers;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Response;

/**
 * Created by pedro on 17/03/16.
 */
public class ClickActiveInteractorImp extends RetrofitServiceAvengers implements ClickActiveInteractor {

    private Callback callback;
    private MapAvengers mapAvengers;


    public ClickActiveInteractorImp(InteractorExecutor interactorExecutor, MainThreadExecutor mainThreadExecutor, MapAvengers mapAvengers) {
        super(interactorExecutor, mainThreadExecutor);
        this.mapAvengers = mapAvengers;
    }

    @Override
    public List<AvengersRetrofit> makeList(Response<List<AvengersRetrofit>> response) {
        List<AvengersRetrofit> avengersActive = new ArrayList<>();
        for (AvengersRetrofit v : response.body()) {
            if (v.isActive()) {
                avengersActive.add(v);
            }
        }
        return avengersActive;
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
        catch (Exception e){
            callback.onError(e);
        }
    }

    @Override
    public void clikActive(Callback callback) {
        this.callback = callback;
        executeCurrentInteractor();
    }
}
