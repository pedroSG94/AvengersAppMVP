package com.example.pedro.pruebadagger.APP.di;

import com.example.pedro.pruebadagger.UI.view.MainActivity;
import com.example.pedro.pruebadagger.UI.presenter.MainPresenter;
import com.example.pedro.pruebadagger.UI.presenter.MainPresenterImp;

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
public class MainModule {

    @Provides
    @Singleton
    public MainPresenter providesMainPresent(){
        return new MainPresenterImp();
    }
}
