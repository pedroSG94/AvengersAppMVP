package com.example.pedro.pruebadagger.domain.interator.description;

import com.example.pedro.pruebadagger.domain.model.IronMan;

/**
 * Created by pedro on 6/04/16.
 */
public interface ChargeIronManInteractor {

    void description(Callback callback);

    interface Callback{
        void onSucess(IronMan ironMan);
        void onError(Throwable throwable);
    }
}
