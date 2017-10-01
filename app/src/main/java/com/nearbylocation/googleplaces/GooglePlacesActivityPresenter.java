package com.nearbylocation.googleplaces;

import com.nearbylocation.repository.remote.Repository;
import com.nearbylocation.repository.remote.GeneralCallback;
import com.nearbylocation.app.util.LogUtil;
import com.nearbylocation.repository.remote.model.googleplaces.GoogleNearbyPlaces;
import retrofit2.Call;
import retrofit2.Response;

public class GooglePlacesActivityPresenter implements GooglePlacesActivityContract.Presenter {

    private GooglePlacesActivityContract.View view;
    private Repository repository;

    public GooglePlacesActivityPresenter(GooglePlacesActivityContract.View view, Repository repository) {
        this.view = view;
        this.repository = repository;
    }

    @Override
    public void loadLocation() {
        repository.getLocationFromGooglePlaces(new GeneralCallback<GoogleNearbyPlaces>() {
            @Override
            public void onResponse(Call<GoogleNearbyPlaces> call, Response<GoogleNearbyPlaces> response) {
                if(response.isSuccessful())
                    view.displayLocation(response.body().getResults());
            }
            @Override
            public void onFailure(Call<GoogleNearbyPlaces> call, Throwable t) {
                if(call.isCanceled())
                    LogUtil.e(getClass().getSimpleName(), "Call canceled");
                else
                    view.displayInternetError();
            }
        });
    }

    @Override
    public void unsubscribe() {
        repository.clear();
    }
}
