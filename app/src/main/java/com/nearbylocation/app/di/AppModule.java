package com.nearbylocation.app.di;

import android.content.Context;
import com.nearbylocation.app.App;
import com.nearbylocation.repository.remote.NetworkRepository;
import com.nearbylocation.repository.remote.Repository;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private final App application;

    public AppModule(App app) {
        this.application = app;
    }

    @Provides
    @Singleton
    Context providesApplicationContext() {
        return application;
    }

    @Provides
    @Singleton
    Repository providesRepository() {
        return new NetworkRepository();
    }
}
