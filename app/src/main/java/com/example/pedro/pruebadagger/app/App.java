package com.example.pedro.pruebadagger.app;

import android.app.Application;

import com.example.pedro.pruebadagger.app.di.RootModule;

import dagger.ObjectGraph;


/**
 * Created by pedro on 15/03/16.
 * Hay que declarar esta clase en el manifest
 */
public class App extends Application {

    private ObjectGraph objectGraph;

    @Override
    public void onCreate() {
        super.onCreate();

        objectGraph = ObjectGraph.create(new RootModule(this));
    }

    public ObjectGraph getObjectGraph() {
        return objectGraph;
    }

}
