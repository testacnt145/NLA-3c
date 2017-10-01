package com.nearbylocation.menu;

public class MainActivityPresenter implements MainActivityContract.Presenter {

    private MainActivityContract.View view;

    public MainActivityPresenter(MainActivityContract.View view) {
        this.view = view;
    }

    @Override
    public void navigateToFourSquare() {
        view.startFourSquareActivity();
    }

    @Override
    public void navigateToGooglePlaces() {
        view.startGooglePlacesActivity();
    }

    @Override
    public void unsubscribe() {
        //do nothing
    }
}
