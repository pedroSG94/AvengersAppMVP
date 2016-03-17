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
public class ClickActiveInterator extends RetrofitService {
    @Override
    public void makeList(MainView takeList, Response<List<Vengadores>> response) {
        List<Vengadores> avengersActive = new ArrayList<>();
        for (Vengadores v : response.body()) {
            if (v.isActive()) {
                avengersActive.add(v);
            }
        }
        takeList.takeActiveListAvengers(avengersActive);
    }
}
