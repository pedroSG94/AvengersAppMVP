package com.example.pedro.pruebadagger.data.retrofit.mapper.avengers;

import com.example.pedro.pruebadagger.data.retrofit.model.AvengersRetrofit;
import com.example.pedro.pruebadagger.domain.model.Avengers;

import java.util.List;

/**
 * Created by pedro on 6/04/16.
 */
public interface MapAvengers {
    List<Avengers> mapAvengersRetrofitToAvengers(List<AvengersRetrofit> avengersRetrofitList);
    List<AvengersRetrofit> mapAvengersToAvengersRetrofit(List<Avengers> avengersList);
    AvengersRetrofit mapAvengerToAvengerRetrofit(Avengers avengers);
    Avengers mapAvengerRetrofitToAvenger(AvengersRetrofit avengersRetrofit);
}
