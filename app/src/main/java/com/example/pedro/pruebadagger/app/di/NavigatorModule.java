package com.example.pedro.pruebadagger.app.di;

import com.example.pedro.pruebadagger.app.navigator.NavigatorImp;
import com.example.pedro.pruebadagger.app.navigator.Navigator;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by pedro on 16/03/16.
 */

@Module(
        complete = false,
        library = true
)
public class NavigatorModule {

    @Provides
    @Singleton
    public Navigator providesNavigator(){
        return new NavigatorImp();
    }
}
