package com.example.pedro.pruebadagger.ui.description.presenter;

import com.example.pedro.pruebadagger.app.base.BasePresenter;
import com.example.pedro.pruebadagger.domain.model.IronMan;
import com.example.pedro.pruebadagger.ui.description.view.DescriptionView;

/**
 * Created by pedro on 6/04/16.
 */
public abstract class DescriptionPresenter extends BasePresenter<DescriptionView>{

    public abstract void chargeIronMan();
    public abstract void changeImage(IronMan ironMan);
}
