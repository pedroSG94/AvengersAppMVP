package com.example.pedro.pruebadagger.domain.interator.retrofit.all;

import com.example.pedro.pruebadagger.domain.model.Avengers;

import java.util.List;

/**
 * Created by pedro on 6/04/16.
 */
public interface ClickAllInteractor {

    void clickAll(Callback callback);

    interface Callback{
        void onSucess(List<Avengers> avengerses);
        void onError(Throwable throwable);
    }
}
