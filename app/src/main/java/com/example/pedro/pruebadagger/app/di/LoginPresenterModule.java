package com.example.pedro.pruebadagger.app.di;

import com.example.pedro.pruebadagger.app.navigator.Navigator;
import com.example.pedro.pruebadagger.ui.login.presenter.LoginPresenter;
import com.example.pedro.pruebadagger.ui.login.presenter.LoginPresenterImp;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by pedro on 16/03/16.
 */

@Module(
        complete = false,
        library =  true
)
public class LoginPresenterModule {

    @Provides
    @Singleton
    public LoginPresenter providesLoginPresenter(Navigator navigator){
        return new LoginPresenterImp(navigator);
    }
}
