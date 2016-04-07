package com.example.pedro.pruebadagger.app.di;

import com.example.pedro.pruebadagger.app.navigator.Navigator;
import com.example.pedro.pruebadagger.domain.interator.description.ChangeImageInteractor;
import com.example.pedro.pruebadagger.domain.interator.description.ChargeIronManInteractor;
import com.example.pedro.pruebadagger.domain.interator.login.Login;
import com.example.pedro.pruebadagger.domain.interator.retrofit.active.ClickActiveInteractor;
import com.example.pedro.pruebadagger.domain.interator.retrofit.all.ClickAllInteractor;
import com.example.pedro.pruebadagger.domain.interator.retrofit.inactive.ClickInactiveInteractor;
import com.example.pedro.pruebadagger.ui.description.presenter.DescriptionPresenter;
import com.example.pedro.pruebadagger.ui.description.presenter.DescriptionPresenterImp;
import com.example.pedro.pruebadagger.ui.login.presenter.LoginPresenter;
import com.example.pedro.pruebadagger.ui.login.presenter.LoginPresenterImp;
import com.example.pedro.pruebadagger.ui.main.presenter.MainPresenter;
import com.example.pedro.pruebadagger.ui.main.presenter.MainPresenterImp;

import dagger.Module;
import dagger.Provides;

/**
 * Created by pedro on 6/04/16.
 */

@Module(
        complete = false,
        library = true
)
public class PresenterModule {

    @Provides
    public MainPresenter providesMainPresenter(ClickAllInteractor clickAll, ClickActiveInteractor clickActive, ClickInactiveInteractor clickInactive, Navigator navigator){
        return new MainPresenterImp(clickAll, clickActive, clickInactive, navigator);
    }

    @Provides
    public LoginPresenter providesLoginPresenter(Navigator navigator, Login log){
        return new LoginPresenterImp(navigator, log);
    }

    @Provides
    public DescriptionPresenter providesDescriptionPresenter(ChargeIronManInteractor descriptionInteractor, ChangeImageInteractor changeImageInteractor){
        return new DescriptionPresenterImp(descriptionInteractor, changeImageInteractor);
    }
}
