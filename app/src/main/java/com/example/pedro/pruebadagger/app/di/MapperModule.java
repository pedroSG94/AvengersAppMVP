package com.example.pedro.pruebadagger.app.di;

import com.example.pedro.pruebadagger.data.retrofit.mapper.avengers.MapAvengers;
import com.example.pedro.pruebadagger.data.retrofit.mapper.avengers.MapAvengersImp;
import com.example.pedro.pruebadagger.data.retrofit.mapper.ironman.MapIronMan;
import com.example.pedro.pruebadagger.data.retrofit.mapper.ironman.MapIronManImp;

import dagger.Module;
import dagger.Provides;

/**
 * Created by pedro on 6/04/16.
 */

@Module(
        complete = false,
        library = true
)
public class MapperModule {

    //poner singleton???
    @Provides
    public MapAvengers providesMapAvengers(){
        return new MapAvengersImp();
    }

    @Provides
    public MapIronMan providesMapIronMan(){
        return new MapIronManImp();
    }
}
