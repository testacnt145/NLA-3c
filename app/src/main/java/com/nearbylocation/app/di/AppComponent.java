package com.nearbylocation.app.di;

import com.nearbylocation.app.App;
import com.nearbylocation.foursquare.FourSquareActivity;
import com.nearbylocation.googleplaces.GooglePlacesActivity;

import javax.inject.Singleton;
import dagger.Component;

@Singleton
@Component(modules = { AppModule.class } )
public interface AppComponent {
    void inject(App application);
    void inject(FourSquareActivity fourSquareActivity);
    void inject(GooglePlacesActivity googlePlacesActivity);
}