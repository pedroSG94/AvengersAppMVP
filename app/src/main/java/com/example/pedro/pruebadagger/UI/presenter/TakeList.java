package com.example.pedro.pruebadagger.UI.presenter;

import com.example.pedro.pruebadagger.UI.model.Vengadores;

import java.util.List;

/**
 * Created by pedro on 16/03/16.
 */
public interface TakeList {
    void takeAllListAvengers(List<Vengadores> avengersList);
    void takeActiveListAvengers(List<Vengadores> avengersListActive);
    void takeInactiveListAvengers(List<Vengadores> avengersListInactive);
}
