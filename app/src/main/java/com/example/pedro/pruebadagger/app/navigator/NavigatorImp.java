package com.example.pedro.pruebadagger.app.navigator;

import android.app.Activity;
import android.content.Intent;

import com.example.pedro.pruebadagger.ui.main.view.MainActivity;

/**
 * Created by pedro on 16/03/16.
 */
public class NavigatorImp implements Navigator {

    private Activity activity;

    @Override
    public Activity getActivity() {
        return activity;
    }

    @Override
    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void goBack(){
        activity.finish();
    }

    @Override
    public void goToMain() {
        activity.startActivity(new Intent(activity.getApplicationContext(), MainActivity.class));
    }
}
