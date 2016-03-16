package com.example.pedro.pruebadagger.APP.base;

import android.app.Activity;
import android.os.Bundle;

import com.example.pedro.pruebadagger.APP.di.App;
import com.example.pedro.pruebadagger.APP.navigator.Navigator;
import com.example.pedro.pruebadagger.UI.view.MainActivity;

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
