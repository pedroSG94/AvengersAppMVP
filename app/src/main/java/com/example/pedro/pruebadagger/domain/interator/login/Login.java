package com.example.pedro.pruebadagger.domain.interator.login;

/**
 * Created by pedro on 6/04/16.
 */
public interface Login {

    void log(String user, String password, Callback callback);

    interface Callback{
        void onSucess();
        void onError(String error);
    }
}
