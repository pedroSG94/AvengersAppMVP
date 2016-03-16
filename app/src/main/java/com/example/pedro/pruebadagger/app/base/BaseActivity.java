package com.example.pedro.pruebadagger.app.base;

import android.app.Activity;
import android.os.Bundle;

import com.example.pedro.pruebadagger.app.App;
import com.example.pedro.pruebadagger.app.navigator.Navigator;

import javax.inject.Inject;

/**
 * Created by pedro on 15/03/16.
 */
public abstract class BaseActivity extends Activity {

    @Inject
    Navigator navigator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ((App) getApplication()).getObjectGraph().inject(this);
        navigator.setActivity(this);
    }
}
