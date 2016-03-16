package com.example.pedro.pruebadagger.ui.main.view;

import com.example.pedro.pruebadagger.data.model.Vengadores;

import java.util.List;

/**
 * Created by pedro on 16/03/16.
 */
public interface MainView {
    void takeAllListAvengers(List<Vengadores> avengersList);
    void takeActiveListAvengers(List<Vengadores> avengersListActive);
    void takeInactiveListAvengers(List<Vengadores> avengersListInactive);
}
