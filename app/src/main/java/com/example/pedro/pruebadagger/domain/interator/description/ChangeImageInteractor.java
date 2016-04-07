package com.example.pedro.pruebadagger.domain.interator.description;

import com.example.pedro.pruebadagger.domain.model.IronMan;

/**
 * Created by pedro on 7/04/16.
 */
public interface ChangeImageInteractor {

    void changeImage(IronMan ironMan, Callback callback);

    interface Callback{
        void onSucess(String image);
        void onError(Throwable throwable);
    }
}
