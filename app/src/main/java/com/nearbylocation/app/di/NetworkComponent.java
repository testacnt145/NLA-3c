package com.nearbylocation.app.di;

import com.nearbylocation.repository.remote.NetworkRepository;
import javax.inject.Singleton;
import dagger.Component;

@Singleton
@Component(modules = {NetworkModule.class})
public interface NetworkComponent {
    void inject(NetworkRepository networkRepository);
}