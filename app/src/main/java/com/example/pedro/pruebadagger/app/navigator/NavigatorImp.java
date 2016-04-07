package com.example.pedro.pruebadagger.app.navigator;

import android.app.Activity;
import android.content.Intent;

import com.example.pedro.pruebadagger.ui.description.view.DescriptionActivity;
import com.example.pedro.pruebadagger.ui.login.view.LoginActivity;
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

    @Override
    public void goToLogin() {
        activity.startActivity(new Intent(activity.getApplicationContext(), LoginActivity.class));
    }

    @Override
    public void goToDescription() {
        activity.startActivity(new Intent(activity.getApplicationContext(), DescriptionActivity.class));
    }
}
