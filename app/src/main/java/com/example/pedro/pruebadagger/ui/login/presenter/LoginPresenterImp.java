package com.example.pedro.pruebadagger.ui.login.presenter;

import android.widget.Toast;

import com.example.pedro.pruebadagger.app.navigator.Navigator;

/**
 * Created by pedro on 16/03/16.
 */
public class LoginPresenterImp implements LoginPresenter{

    private Navigator navigator;

    public LoginPresenterImp(Navigator navigator){
        this.navigator = navigator;
    }

    @Override
    public void onClickLogin(String nick, String password) {
        if (nick.equals("nick") && password.equals("admin")) {
            navigator.goBack();
            navigator.goToMain();
        }
        else {
            Toast.makeText(navigator.getActivity(), "Usuario o contraseña icorrectos", Toast.LENGTH_SHORT).show();
        }
    }
}
