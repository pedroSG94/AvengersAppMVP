package com.example.pedro.pruebadagger.ui.main.presenter;

import com.example.pedro.pruebadagger.data.retrofit.RetrofitCharge;
import com.example.pedro.pruebadagger.data.retrofit.RetrofitInterator;
import com.example.pedro.pruebadagger.ui.main.view.MainView;

/**
 * Created by pedro on 15/03/16.
 */
public class MainPresenterImp implements MainPresenter {

    private RetrofitInterator retrofitInterator;

    @Override
    public void onClickAll(MainView takeList) {
        retrofitInterator = new RetrofitCharge();
        retrofitInterator.onClickAll(takeList);
    }

    @Override
    public void onClickActive(MainView takeList) {
        retrofitInterator = new RetrofitCharge();
        retrofitInterator.onClickActive(takeList);
    }

    @Override
    public void onClickInactive(MainView takeList) {
        retrofitInterator = new RetrofitCharge();
        retrofitInterator.onClickInactive(takeList);
    }
}
