package com.example.pedro.pruebadagger.data.retrofit;

import com.example.pedro.pruebadagger.domain.interator.ClickActiveInterator;
import com.example.pedro.pruebadagger.domain.interator.ClickAllInterator;
import com.example.pedro.pruebadagger.domain.interator.ClickInactiveInterator;
import com.example.pedro.pruebadagger.domain.RetrofitService;
import com.example.pedro.pruebadagger.ui.main.view.MainView;

import javax.inject.Inject;

/**
 * Created by pedro on 15/03/16.
 */
public class RetrofitCharge implements RetrofitInterator{

    private RetrofitService retrofitService;

    @Override
    public void onClickAll(final MainView takeList) {
        retrofitService = new ClickAllInterator();
        retrofitService.makeCallback(takeList);
    }

    @Override
    public void onClickActive(final MainView takeList) {
        retrofitService = new ClickActiveInterator();
        retrofitService.makeCallback(takeList);
    }

    @Override
    public void onClickInactive(final MainView takeList) {
        retrofitService = new ClickInactiveInterator();
        retrofitService.makeCallback(takeList);
    }
}
