package com.example.pedro.pruebadagger.domain.interator.retrofit.inactive;

import com.example.pedro.pruebadagger.domain.model.Avengers;

import java.util.List;

/**
 * Created by pedro on 6/04/16.
 */
public interface ClickInactiveInteractor {

    void clickInactive(Callback callback);

    interface Callback{
        void onSucess(List<Avengers> avengerses);
        void onError(Throwable throwable);
    }
}
