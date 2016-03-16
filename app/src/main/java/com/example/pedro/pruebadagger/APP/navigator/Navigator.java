package com.example.pedro.pruebadagger.APP.navigator;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by pedro on 16/03/16.
 */
public class Navigator {

    private Activity activity;

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void goBack(){
        activity.finish();
    }

    public void changeActivity(Class destiny){
        activity.startActivity(new Intent(activity.getApplicationContext(), destiny));
    }
}
