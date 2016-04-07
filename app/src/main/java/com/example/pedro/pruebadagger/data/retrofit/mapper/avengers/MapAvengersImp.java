package com.example.pedro.pruebadagger.data.retrofit.mapper.avengers;

import com.example.pedro.pruebadagger.data.retrofit.model.AvengersRetrofit;
import com.example.pedro.pruebadagger.domain.model.Avengers;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pedro on 6/04/16.
 */
public class MapAvengersImp implements MapAvengers{

    @Override
    public List<Avengers> mapAvengersRetrofitToAvengers(List<AvengersRetrofit> avengersRetrofitList){
        List<Avengers> list = new ArrayList<>();
        for(AvengersRetrofit a : avengersRetrofitList){
            Avengers avenger = new Avengers();
            avenger.setName(a.getName());
            avenger.setHeroe(a.getHeroe());
            avenger.setImage(a.getImage());
            avenger.setActive(a.isActive());

            list.add(avenger);
        }
        return list;
    }

    @Override
    public List<AvengersRetrofit> mapAvengersToAvengersRetrofit(List<Avengers> avengersList){
        List<AvengersRetrofit> list = new ArrayList<>();
        for(Avengers a : avengersList){
            AvengersRetrofit avengerRetrofit = new AvengersRetrofit();
            avengerRetrofit.setName(a.getName());
            avengerRetrofit.setHeroe(a.getHeroe());
            avengerRetrofit.setImage(a.getImage());
            avengerRetrofit.setActive(a.isActive());

            list.add(avengerRetrofit);
        }
        return list;
    }

    @Override
    public AvengersRetrofit mapAvengerToAvengerRetrofit(Avengers avengers){
        AvengersRetrofit avengerRetrofit = new AvengersRetrofit();
        avengerRetrofit.setName(avengers.getName());
        avengerRetrofit.setHeroe(avengers.getHeroe());
        avengerRetrofit.setImage(avengers.getImage());
        avengerRetrofit.setActive(avengers.isActive());

        return avengerRetrofit;
    }

    @Override
    public Avengers mapAvengerRetrofitToAvenger(AvengersRetrofit avengersRetrofit){
        Avengers avenger = new Avengers();
        avenger.setName(avengersRetrofit.getName());
        avenger.setHeroe(avengersRetrofit.getHeroe());
        avenger.setImage(avengersRetrofit.getImage());
        avenger.setActive(avengersRetrofit.isActive());

        return avenger;
    }
}
