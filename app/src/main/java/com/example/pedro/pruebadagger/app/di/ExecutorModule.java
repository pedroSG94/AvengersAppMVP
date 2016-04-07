package com.example.pedro.pruebadagger.app.di;

import com.example.pedro.pruebadagger.app.executor.InteractorExecutor;
import com.example.pedro.pruebadagger.app.executor.InteractorExecutorImp;
import com.example.pedro.pruebadagger.app.executor.MainThreadExecutor;
import com.example.pedro.pruebadagger.app.executor.MainThreadExecutorImp;

import dagger.Module;
import dagger.Provides;

/**
 * Created by pedro on 6/04/16.
 */

@Module(
        complete = false,
        library = true
)
public class ExecutorModule {

    @Provides
    public InteractorExecutor providesInteractorExecutor(){
        return new InteractorExecutorImp();
    }

    @Provides
    public MainThreadExecutor providesMainThreadExecutor(){
        return new MainThreadExecutorImp();
    }
}
