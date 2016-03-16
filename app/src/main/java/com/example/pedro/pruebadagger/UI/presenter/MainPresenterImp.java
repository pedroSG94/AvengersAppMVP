package com.example.pedro.pruebadagger.UI.presenter;

import com.example.pedro.pruebadagger.UI.model.RetrofitCharge;
import com.example.pedro.pruebadagger.UI.model.RetrofitInterator;

/**
 * Created by pedro on 15/03/16.
 */
public class MainPresenterImp implements MainPresenter {

    private RetrofitInterator retrofitInterator;

    @Override
    public void onClickAll(TakeList takeList) {
        retrofitInterator = new RetrofitCharge();
        retrofitInterator.onClickAll(takeList);
    }

    @Override
    public void onClickActive(TakeList takeList) {
        retrofitInterator = new RetrofitCharge();
        retrofitInterator.onClickActive(takeList);
    }

    @Override
    public void onClickInactive(TakeList takeList) {
        retrofitInterator = new RetrofitCharge();
        retrofitInterator.onClickInactive(takeList);
    }
}
