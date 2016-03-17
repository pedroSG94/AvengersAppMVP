package com.example.pedro.pruebadagger.domain.interator;

import com.example.pedro.pruebadagger.data.model.Vengadores;
import com.example.pedro.pruebadagger.domain.RetrofitService;
import com.example.pedro.pruebadagger.ui.main.view.MainView;

import java.util.List;

import retrofit2.Response;

/**
 * Created by pedro on 17/03/16.
 */
public class ClickAllInterator extends RetrofitService {
    @Override
    public void makeList(MainView takeList,  Response<List<Vengadores>> response) {
        takeList.takeAllListAvengers(response.body());
    }
}
