package com.nearbylocation.repository.remote;

import com.nearbylocation.app.constants.Network;
import com.nearbylocation.repository.remote.model.foursquare.FourSquareNearbyPlaces;
import com.nearbylocation.repository.remote.model.googleplaces.GoogleNearbyPlaces;
import com.nearbylocation.repository.remote.retrofit.API;
import com.nearbylocation.app.util.LogUtil;
import com.nearbylocation.app.di.DaggerNetworkComponent;
import com.nearbylocation.app.di.NetworkComponent;
import com.nearbylocation.app.di.NetworkModule;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Converter;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import javax.inject.Inject;
import android.support.annotation.NonNull;

public class NetworkRepository implements Repository {

    @Inject
    Retrofit retrofit;
    @Inject
    API api;
    @Inject
    Call<FourSquareNearbyPlaces> callFourSquare;
    @Inject
    Call<GoogleNearbyPlaces> callGooglePlaces;


    @Override
    public void getLocationFromFourSquare(GeneralCallback<FourSquareNearbyPlaces> callback) {
        generateComponent(Network.BASE_URL_FOUR_SQUARE, MoshiConverterFactory.create());
        callFourSquare.enqueue(new Callback<FourSquareNearbyPlaces>() {
            @Override
            public void onResponse(@NonNull Call<FourSquareNearbyPlaces> call, @NonNull Response<FourSquareNearbyPlaces> response) {
                callback.onResponse(call, response);
            }
            @Override
            public void onFailure(@NonNull Call<FourSquareNearbyPlaces> call, @NonNull Throwable t) {
                callback.onFailure(call, t);
            }
        });
    }

    @Override
    public void getLocationFromGooglePlaces(GeneralCallback<GoogleNearbyPlaces> callback) {
        generateComponent(Network.BASE_URL_GOOGLE_PLACES, MoshiConverterFactory.create());
        callGooglePlaces.enqueue(new Callback<GoogleNearbyPlaces>() {
            @Override
            public void onResponse(@NonNull Call<GoogleNearbyPlaces> call, @NonNull Response<GoogleNearbyPlaces> response) {
               callback.onResponse(call, response);
            }
            @Override
            public void onFailure(@NonNull Call<GoogleNearbyPlaces> call, @NonNull Throwable t) {
               callback.onFailure(call, t);
                LogUtil.e("saaaa", t.getMessage());
            }
        });
    }

    @Override
    public void clear() {
        LogUtil.e(getClass().getSimpleName(), "clear");
            callFourSquare.cancel();
            callGooglePlaces.cancel();
    }

    private void generateComponent(String baseUrl, Converter.Factory converterFactory) {
        NetworkComponent networkComponent = DaggerNetworkComponent.builder()
                .networkModule(new NetworkModule(baseUrl, converterFactory))
                .build();
        networkComponent.inject(this);
    }
}
