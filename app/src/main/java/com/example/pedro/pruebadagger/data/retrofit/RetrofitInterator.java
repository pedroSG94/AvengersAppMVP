package com.example.pedro.pruebadagger.data.retrofit;

import com.example.pedro.pruebadagger.ui.main.view.MainView;

/**
 * Created by pedro on 15/03/16.
 */
public interface RetrofitInterator {
    void onClickAll(MainView takeList);
    void onClickActive(MainView takeList);
    void onClickInactive(MainView takeList);
}
