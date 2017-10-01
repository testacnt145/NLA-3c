package com.nearbylocation.foursquare;

import com.nearbylocation.repository.remote.Repository;
import com.nearbylocation.repository.remote.GeneralCallback;
import com.nearbylocation.repository.remote.model.foursquare.FourSquareNearbyPlaces;
import com.nearbylocation.app.util.LogUtil;
import retrofit2.Call;
import retrofit2.Response;

public class FourSquareActivityPresenter implements FourSquareActivityContract.Presenter {

    private FourSquareActivityContract.View view;
    private Repository repository;

    public FourSquareActivityPresenter(FourSquareActivityContract.View view, Repository repository) {
        this.view = view;
        this.repository = repository;
    }

    @Override
    public void loadLocation() {
        repository.getLocationFromFourSquare(new GeneralCallback<FourSquareNearbyPlaces>() {
            @Override
            public void onResponse(Call<FourSquareNearbyPlaces> call, Response<FourSquareNearbyPlaces> response) {
                if(response.isSuccessful())
                    view.displayLocation(response.body().getResponse().getVenues());
            }
            @Override
            public void onFailure(Call<FourSquareNearbyPlaces> call, Throwable t) {
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
