package com.example.pedro.pruebadagger.ui.main.presenter;

import com.example.pedro.pruebadagger.app.base.BasePresenter;
import com.example.pedro.pruebadagger.ui.main.view.MainView;

/**
 * Created by pedro on 15/03/16.
 */
public abstract class MainPresenter extends BasePresenter<MainView>{
    public abstract void onClickAll();
    public abstract void onClickActive();
    public abstract void onClickInactive();
    public abstract void onItemClickListView();
}
