package com.example.pedro.pruebadagger.APP.di;

import com.example.pedro.pruebadagger.APP.navigator.Navigator;
import com.example.pedro.pruebadagger.UI.view.LoginActivity;
import com.example.pedro.pruebadagger.UI.view.MainActivity;

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

    @Singleton
    @Provides
    public Navigator getNavigator(){
        return new Navigator();
    }
}
