package com.example.pedro.pruebadagger.data.retrofit.mapper.ironman;

import com.example.pedro.pruebadagger.data.retrofit.model.IronManRetrofit;
import com.example.pedro.pruebadagger.domain.model.IronMan;

/**
 * Created by pedro on 6/04/16.
 */
public interface MapIronMan {

    IronMan mapIronManretrofitToIronMan(IronManRetrofit ironManRetrofit);
    IronManRetrofit mapIronManToIronManRetrofit(IronMan ironMan);
}
