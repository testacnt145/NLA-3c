package com.nearbylocation.googleplaces;

import com.nearbylocation.repository.remote.model.foursquare.Venue;
import com.nearbylocation.repository.remote.model.googleplaces.Result;

import java.util.List;

public interface GooglePlacesActivityContract {

    interface Presenter {
        void loadLocation();
        void unsubscribe();
    }

    interface View {
        void displayLocation(List<Result> venues);
        void displayInternetError();
    }

}