package com.example.pedro.pruebadagger.app.navigator;

import android.app.Activity;

/**
 * Created by pedro on 16/03/16.
 */
public interface Navigator {

    Activity getActivity();
    void setActivity(Activity activity);
    void goBack();
    void goToMain();
    void goToLogin();
    void goToDescription();
}
