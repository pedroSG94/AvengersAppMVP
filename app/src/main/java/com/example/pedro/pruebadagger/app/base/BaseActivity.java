package com.example.pedro.pruebadagger.app.base;

import android.app.Activity;
import android.os.Bundle;

import butterknife.ButterKnife;
import com.example.pedro.pruebadagger.app.App;
import com.example.pedro.pruebadagger.app.View;
import com.example.pedro.pruebadagger.app.navigator.Navigator;

import javax.inject.Inject;

/**
 * Created by pedro on 15/03/16.
 */
public abstract class BaseActivity extends Activity implements View{

    @Inject
    Navigator navigator;
    private BasePresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(bindLayout());
        injectView();
        presenter = bindPresenter();
        presenter.setView(this);
        navigator.setActivity(this);
    }

    public void injectView() {
        ((App) getApplication()).getObjectGraph().inject(this);
        ButterKnife.bind(this);
    }

    public abstract BasePresenter bindPresenter();

    public abstract int bindLayout();
}
