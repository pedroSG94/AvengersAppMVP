package com.example.pedro.pruebadagger.app.base;

import com.example.pedro.pruebadagger.app.executor.Interactor;
import com.example.pedro.pruebadagger.app.executor.InteractorExecutor;
import com.example.pedro.pruebadagger.app.executor.MainThreadExecutor;

/**
 * Created by pedro on 6/04/16.
 */
public abstract class BaseInteractor implements Interactor {

    private InteractorExecutor interactorExecutor;
    private MainThreadExecutor mainThreadExecutor;

    public BaseInteractor(InteractorExecutor interactorExecutor, MainThreadExecutor mainThreadExecutor){
        this.interactorExecutor = interactorExecutor;
        this.mainThreadExecutor = mainThreadExecutor;
    }

    public void executeCurrentInteractor(){
        interactorExecutor.execute(this);
    }

    public void executeOnMainThread(Runnable runnable){
        mainThreadExecutor.execute(runnable);
    }
}
