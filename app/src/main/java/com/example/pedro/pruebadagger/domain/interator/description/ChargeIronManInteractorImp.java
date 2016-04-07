package com.example.pedro.pruebadagger.domain.interator.description;

import com.example.pedro.pruebadagger.app.executor.InteractorExecutor;
import com.example.pedro.pruebadagger.app.executor.MainThreadExecutor;
import com.example.pedro.pruebadagger.data.retrofit.mapper.ironman.MapIronMan;
import com.example.pedro.pruebadagger.domain.interator.retrofit.RetrofitServiceIronMan;
import com.example.pedro.pruebadagger.domain.model.IronMan;

/**
 * Created by pedro on 6/04/16.
 */
public class ChargeIronManInteractorImp extends RetrofitServiceIronMan implements ChargeIronManInteractor {


    private Callback callback;
    private MapIronMan mapIronMan;

    public ChargeIronManInteractorImp(InteractorExecutor interactorExecutor, MainThreadExecutor mainThreadExecutor, MapIronMan mapIronMan) {
        super(interactorExecutor, mainThreadExecutor);
        this.mapIronMan = mapIronMan;
    }

    @Override
    public void run() {
        try{
            final IronMan ironMan = mapIronMan.mapIronManretrofitToIronMan(makeIronManRetrofit(makeCallback()));
            executeOnMainThread(new Runnable() {
                @Override
                public void run() {
                    callback.onSucess(ironMan);
                }
            });
        }
        catch (Exception e){
            callback.onError(e);
        }
    }

    @Override
    public void description(Callback callback) {
        this.callback = callback;
        executeCurrentInteractor();
    }
}
