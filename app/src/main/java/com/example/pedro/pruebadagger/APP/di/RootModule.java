package com.example.pedro.pruebadagger.APP.di;

import android.content.Context;

import com.example.pedro.pruebadagger.UI.view.LoginActivity;
import com.example.pedro.pruebadagger.UI.view.MainActivity;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by pedro on 16/03/16.
 */

@Module(includes = {
        MainModule.class,
        NavigatorModule.class
},
        injects = {
        MainActivity.class,
        LoginActivity.class
},
        library = true
)
public class RootModule {
    private final Context context;

    public RootModule(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    public Context provideApplicationContext() {
        return context;
    }
}
