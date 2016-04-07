package com.example.pedro.pruebadagger.ui.description.presenter;

import android.util.Log;

import com.example.pedro.pruebadagger.domain.interator.description.ChangeImageInteractor;
import com.example.pedro.pruebadagger.domain.interator.description.ChargeIronManInteractor;
import com.example.pedro.pruebadagger.domain.model.IronMan;

/**
 * Created by pedro on 6/04/16.
 */
public class DescriptionPresenterImp extends DescriptionPresenter {

    private ChargeIronManInteractor chargeIronManInteractor;
    private ChangeImageInteractor changeImageInteractor;

    public DescriptionPresenterImp(ChargeIronManInteractor chargeIronManInteractor, ChangeImageInteractor changeImageInteractor){
        this.chargeIronManInteractor = chargeIronManInteractor;
        this.changeImageInteractor = changeImageInteractor;
    }

    @Override
    public void chargeIronMan() {
        chargeIronManInteractor.description(new ChargeIronManInteractor.Callback() {
            @Override
            public void onSucess(IronMan ironMan) {
                view.chargeData(ironMan);
            }

            @Override
            public void onError(Throwable throwable) {
                Log.e("Description error", throwable.getMessage());
            }
        });
    }

    @Override
    public void changeImage(final IronMan ironMan) {
        changeImageInteractor.changeImage(ironMan, new ChangeImageInteractor.Callback() {
            @Override
            public void onSucess(String image) {
                view.changeImage(image);
            }

            @Override
            public void onError(Throwable throwable) {
                Log.e("Change image error", "Error al cambiar la imagen");
            }
        });
    }
}
