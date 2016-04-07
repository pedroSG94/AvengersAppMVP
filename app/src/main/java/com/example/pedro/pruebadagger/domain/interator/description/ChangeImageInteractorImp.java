package com.example.pedro.pruebadagger.domain.interator.description;

import android.util.Log;

import com.example.pedro.pruebadagger.app.base.BaseInteractor;
import com.example.pedro.pruebadagger.app.executor.InteractorExecutor;
import com.example.pedro.pruebadagger.app.executor.MainThreadExecutor;
import com.example.pedro.pruebadagger.domain.model.IronMan;

/**
 * Created by pedro on 7/04/16.
 */
public class ChangeImageInteractorImp extends BaseInteractor implements ChangeImageInteractor {

    private int cont;
    private IronMan ironMan;
    private Callback callback;

    public ChangeImageInteractorImp(InteractorExecutor interactorExecutor, MainThreadExecutor mainThreadExecutor) {
        super(interactorExecutor, mainThreadExecutor);
        cont = 0;
    }

    @Override
    public void run() {
        try {
            executeOnMainThread(new Runnable() {
                @Override
                public void run() {
                    if (cont >= ironMan.getImages().size() - 1) {
                        cont = 0;
                    } else {
                        cont++;
                    }
                    callback.onSucess(ironMan.getImages().get(cont).image);
                    Log.e("Contador", cont + " || " + ironMan.getImages().get(cont).image);
                }
            });
        }
        catch (Exception e){
            callback.onError(e);
        }
    }

    @Override
    public void changeImage(IronMan ironMan, Callback callback) {
        this.ironMan = ironMan;
        this.callback = callback;
        executeCurrentInteractor();
    }
}
