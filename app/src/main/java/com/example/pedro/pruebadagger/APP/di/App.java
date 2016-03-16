package com.example.pedro.pruebadagger.APP.di;


import android.app.Application;

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
