package com.example.pedro.pruebadagger.domain.interator.login;

import com.example.pedro.pruebadagger.app.base.BaseInteractor;
import com.example.pedro.pruebadagger.app.executor.InteractorExecutor;
import com.example.pedro.pruebadagger.app.executor.MainThreadExecutor;

/**
 * Created by pedro on 6/04/16.
 */
public class LoginInteractor extends BaseInteractor implements Login {

    private Callback callback;
    private String user;
    private String password;

    public LoginInteractor(InteractorExecutor interactorExecutor, MainThreadExecutor mainThreadExecutor) {
        super(interactorExecutor, mainThreadExecutor);
    }

    @Override
    public void run() {
        if (user.equals("nick") && password.equals("admin")) {
            callback.onSucess();
        }
        else{
            onError();
        }
    }


    @Override
    public void log(String user, String password, Callback callback) {
        this.callback = callback;
        this.user = user;
        this.password = password;
        executeCurrentInteractor();
    }

    void onError(){
        executeOnMainThread(new Runnable() {
            @Override
            public void run() {
                callback.onError("Login incorrecto, vuelve a intentarlo");
            }
        });
    }
}
