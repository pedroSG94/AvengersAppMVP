package com.example.pedro.pruebadagger.data.retrofit.mapper.ironman;

import com.example.pedro.pruebadagger.data.retrofit.model.IronManRetrofit;
import com.example.pedro.pruebadagger.domain.model.IronMan;

/**
 * Created by pedro on 6/04/16.
 */
public class MapIronManImp implements MapIronMan{

    @Override
    public IronMan mapIronManretrofitToIronMan(IronManRetrofit ironManRetrofit) {
        IronMan ironMan = new IronMan();
        ironMan.setCharacter(ironManRetrofit.getCharacter());
        ironMan.setName(ironManRetrofit.getName());
        ironMan.setDescription(ironManRetrofit.getDescription());
        ironMan.setImages(ironManRetrofit.getImages());

        return ironMan;
    }

    @Override
    public IronManRetrofit mapIronManToIronManRetrofit(IronMan ironMan) {
        IronManRetrofit ironManRetrofit = new IronManRetrofit();
        ironManRetrofit.setCharacter(ironMan.getCharacter());
        ironManRetrofit.setName(ironMan.getName());
        ironManRetrofit.setDescription(ironMan.getDescription());
        ironManRetrofit.setImages(ironMan.getImages());

        return ironManRetrofit;
    }
}
