package com.example.pedro.pruebadagger.domain.interator;

import com.example.pedro.pruebadagger.data.model.Vengadores;
import com.example.pedro.pruebadagger.domain.RetrofitService;
import com.example.pedro.pruebadagger.ui.main.view.MainView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Response;

/**
 * Created by pedro on 17/03/16.
 */
public class ClickInactiveInterator extends RetrofitService {
    @Override
    public void makeList(MainView takeList, Response<List<Vengadores>> response) {
        List<Vengadores> avengersInactive = new ArrayList<>();
        for (Vengadores v : response.body()) {
            if (!v.isActive()) {
                avengersInactive.add(v);
            }
        }
        takeList.takeInactiveListAvengers(avengersInactive);
    }
}
