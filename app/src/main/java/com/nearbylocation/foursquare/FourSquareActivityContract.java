package com.nearbylocation.foursquare;

import com.nearbylocation.repository.remote.model.foursquare.Venue;
import java.util.List;

public interface FourSquareActivityContract {

    interface Presenter {
        void loadLocation();
        void unsubscribe();
    }

    interface View {
        void displayLocation(List<Venue> venues);
        void displayInternetError();
    }
}
