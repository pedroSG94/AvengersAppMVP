package com.example.pedro.pruebadagger.app.di;

import com.example.pedro.pruebadagger.app.navigator.Navigator;
import com.example.pedro.pruebadagger.ui.login.presenter.LoginPresenter;
import com.example.pedro.pruebadagger.ui.login.presenter.LoginPresenterImp;
import com.example.pedro.pruebadagger.ui.main.presenter.MainPresenter;
import com.example.pedro.pruebadagger.ui.main.presenter.MainPresenterImp;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by pedro on 15/03/16.
 */

@Module(
        complete = false,
        library = true
)
public class MainPresenterModule {

    @Provides
    @Singleton
    public MainPresenter providesMainPresent(){
        return new MainPresenterImp();
    }
}
