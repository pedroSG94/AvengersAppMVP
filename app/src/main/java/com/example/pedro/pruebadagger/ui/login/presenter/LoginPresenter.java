package com.example.pedro.pruebadagger.ui.login.presenter;

import com.example.pedro.pruebadagger.app.base.BasePresenter;
import com.example.pedro.pruebadagger.ui.login.view.LoginView;

/**
 * Created by pedro on 16/03/16.
 */
public abstract class LoginPresenter extends BasePresenter<LoginView> {
    public abstract void onClickLogin(String user, String password);
}
