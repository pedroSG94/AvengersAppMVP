package com.example.pedro.pruebadagger.app.di;

import com.example.pedro.pruebadagger.app.executor.InteractorExecutor;
import com.example.pedro.pruebadagger.app.executor.MainThreadExecutor;
import com.example.pedro.pruebadagger.data.retrofit.mapper.avengers.MapAvengers;
import com.example.pedro.pruebadagger.data.retrofit.mapper.ironman.MapIronMan;
import com.example.pedro.pruebadagger.domain.interator.description.ChangeImageInteractor;
import com.example.pedro.pruebadagger.domain.interator.description.ChangeImageInteractorImp;
import com.example.pedro.pruebadagger.domain.interator.description.ChargeIronManInteractor;
import com.example.pedro.pruebadagger.domain.interator.description.ChargeIronManInteractorImp;
import com.example.pedro.pruebadagger.domain.interator.login.Login;
import com.example.pedro.pruebadagger.domain.interator.login.LoginInteractor;
import com.example.pedro.pruebadagger.domain.interator.retrofit.active.ClickActiveInteractor;
import com.example.pedro.pruebadagger.domain.interator.retrofit.active.ClickActiveInteractorImp;
import com.example.pedro.pruebadagger.domain.interator.retrofit.all.ClickAllInteractor;
import com.example.pedro.pruebadagger.domain.interator.retrofit.all.ClickAllInteractorImp;
import com.example.pedro.pruebadagger.domain.interator.retrofit.inactive.ClickInactiveInteractor;
import com.example.pedro.pruebadagger.domain.interator.retrofit.inactive.ClickInactiveInteractorImp;

import dagger.Module;
import dagger.Provides;

/**
 * Created by pedro on 6/04/16.
 */

@Module(
        complete = false,
        library = true
)
public class InteractorModule {

    @Provides
    public Login providesLogInteractor(InteractorExecutor interactorExecutor, MainThreadExecutor mainThreadExecutor){
        return new LoginInteractor(interactorExecutor, mainThreadExecutor);
    }

    @Provides
    public ClickAllInteractor providesClickAllInteractor(InteractorExecutor interactorExecutor, MainThreadExecutor mainThreadExecutor, MapAvengers mapAvengers){
        return new ClickAllInteractorImp(interactorExecutor, mainThreadExecutor, mapAvengers);
    }

    @Provides
    public ClickActiveInteractor providesClickActiveInteractor(InteractorExecutor interactorExecutor, MainThreadExecutor mainThreadExecutor, MapAvengers mapAvengers){
        return new ClickActiveInteractorImp(interactorExecutor, mainThreadExecutor, mapAvengers);
    }

    @Provides
    public ClickInactiveInteractor providesClickInactiveInteractor(InteractorExecutor interactorExecutor, MainThreadExecutor mainThreadExecutor, MapAvengers mapAvengers){
        return new ClickInactiveInteractorImp(interactorExecutor, mainThreadExecutor, mapAvengers);
    }

    @Provides
    public ChargeIronManInteractor providesDescriptionInteractor(InteractorExecutor interactorExecutor, MainThreadExecutor mainThreadExecutor, MapIronMan mapIronMan){
        return new ChargeIronManInteractorImp(interactorExecutor, mainThreadExecutor, mapIronMan);
    }

    @Provides
    public ChangeImageInteractor providesChangeImageInteractor(InteractorExecutor interactorExecutor, MainThreadExecutor mainThreadExecutor){
        return new ChangeImageInteractorImp(interactorExecutor, mainThreadExecutor);
    }
}
