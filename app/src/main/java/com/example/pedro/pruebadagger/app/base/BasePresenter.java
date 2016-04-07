package com.example.pedro.pruebadagger.app.base;

import com.example.pedro.pruebadagger.app.View;

/**
 * Created by pedro on 6/04/16.
 */
public abstract class BasePresenter<T extends View> {
    protected T view;

    public void setView(T view) {
        this.view = view;
    }

    public T getView() {
        return view;
    }
}
