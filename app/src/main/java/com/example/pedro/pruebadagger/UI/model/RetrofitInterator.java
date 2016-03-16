package com.example.pedro.pruebadagger.UI.model;

import com.example.pedro.pruebadagger.UI.presenter.TakeList;

/**
 * Created by pedro on 15/03/16.
 */
public interface RetrofitInterator {
    void onClickAll(TakeList takeList);
    void onClickActive(TakeList takeList);
    void onClickInactive(TakeList takeList);
}
