package com.example.pedro.pruebadagger.ui.main.view;

import com.example.pedro.pruebadagger.app.View;
import com.example.pedro.pruebadagger.domain.model.Avengers;

import java.util.List;

/**
 * Created by pedro on 16/03/16.
 */
public interface MainView extends View{
    void onClick(android.view.View v);
    void takeAllListAvengers(List<Avengers> avengersList);
    void takeActiveListAvengers(List<Avengers> avengersListActive);
    void takeInactiveListAvengers(List<Avengers> avengersListInactive);

}
