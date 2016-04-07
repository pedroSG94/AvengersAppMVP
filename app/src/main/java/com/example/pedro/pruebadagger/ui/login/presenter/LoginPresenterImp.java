package com.example.pedro.pruebadagger.ui.login.presenter;

import com.example.pedro.pruebadagger.app.navigator.Navigator;
import com.example.pedro.pruebadagger.domain.interator.login.Login;

/**
 * Created by pedro on 16/03/16.
 */
public class LoginPresenterImp extends LoginPresenter{

    private Navigator navigator;
    private Login log;

    public LoginPresenterImp(Navigator navigator, Login log){
        this.navigator = navigator;
        this.log = log;
    }

    @Override
    public void onClickLogin(String user, String password) {
        log.log(user, password, new Login.Callback() {
            @Override
            public void onSucess() {
                navigator.goToMain();
            }

            @Override
            public void onError(String error) {
                view.makeToast(error);
            }
        });
    }
}
