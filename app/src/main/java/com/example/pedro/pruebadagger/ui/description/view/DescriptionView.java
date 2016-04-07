package com.example.pedro.pruebadagger.ui.description.view;


import com.example.pedro.pruebadagger.app.View;
import com.example.pedro.pruebadagger.domain.model.IronMan;


/**
 * Created by pedro on 6/04/16.
 */
public interface DescriptionView extends View {

    void onClick(android.view.View v);
    void chargeData(IronMan ironMan);
    void changeImage(String image);
}
