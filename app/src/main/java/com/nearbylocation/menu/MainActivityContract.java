package com.nearbylocation.menu;


public interface MainActivityContract {

    interface Presenter {
        void navigateToFourSquare();
        void navigateToGooglePlaces();
        void unsubscribe();
    }

    interface View {
        void startFourSquareActivity();
        void startGooglePlacesActivity();
    }

}