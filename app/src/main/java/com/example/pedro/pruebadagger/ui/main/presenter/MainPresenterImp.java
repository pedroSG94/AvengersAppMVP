package com.example.pedro.pruebadagger.ui.main.presenter;

import android.util.Log;

import com.example.pedro.pruebadagger.app.navigator.Navigator;
import com.example.pedro.pruebadagger.domain.model.Avengers;
import com.example.pedro.pruebadagger.domain.interator.retrofit.active.ClickActiveInteractor;
import com.example.pedro.pruebadagger.domain.interator.retrofit.all.ClickAllInteractor;
import com.example.pedro.pruebadagger.domain.interator.retrofit.inactive.ClickInactiveInteractor;
import java.util.List;

/**
 * Created by pedro on 15/03/16.
 */
public class MainPresenterImp extends MainPresenter {

    private ClickAllInteractor clickAll;
    private ClickActiveInteractor clickActive;
    private ClickInactiveInteractor clickInactive;
    private Navigator navigator;

    public MainPresenterImp(ClickAllInteractor clickAll, ClickActiveInteractor clickActive, ClickInactiveInteractor clickInactive, Navigator navigator){
        this.clickAll = clickAll;
        this.clickActive = clickActive;
        this.clickInactive = clickInactive;
        this.navigator = navigator;
    }

    @Override
    public void onClickAll() {
        clickAll.clickAll(new ClickAllInteractor.Callback() {
            @Override
            public void onSucess(final List<Avengers> avengerses) {
                view.takeAllListAvengers(avengerses);
            }

            @Override
            public void onError(Throwable throwable) {
                Log.e("Retrofit error", throwable.getMessage());
            }
        });
    }

    @Override
    public void onClickActive() {
        clickActive.clikActive(new ClickActiveInteractor.Callback() {
            @Override
            public void onSucess(final List<Avengers> avengerses) {
                view.takeActiveListAvengers(avengerses);
            }

            @Override
            public void onError(Throwable throwable) {
                Log.e("Retrofit error", throwable.getMessage());
            }
        });
    }

    @Override
    public void onClickInactive() {
        clickInactive.clickInactive(new ClickInactiveInteractor.Callback() {
            @Override
            public void onSucess(final List<Avengers> avengerses) {
                view.takeInactiveListAvengers(avengerses);
            }

            @Override
            public void onError(Throwable throwable) {
                Log.e("Retrofit error", throwable.getMessage());
            }
        });
    }

    @Override
    public void onItemClickListView() {
        navigator.goToDescription();
    }
}
