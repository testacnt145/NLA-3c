package com.nearbylocation.repository.remote;

import com.nearbylocation.repository.remote.model.foursquare.FourSquareNearbyPlaces;
import com.nearbylocation.repository.remote.model.googleplaces.GoogleNearbyPlaces;

public interface Repository {
    void getLocationFromFourSquare(GeneralCallback<FourSquareNearbyPlaces> callback);
    void getLocationFromGooglePlaces(GeneralCallback<GoogleNearbyPlaces> callback);
    void clear();
}
