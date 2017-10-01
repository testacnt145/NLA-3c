package com.nearbylocation.repository.remote.model.foursquare;

import java.util.List;
import com.squareup.moshi.Json;

public class Response {

    @Json(name = "venues")
    private List<Venue> venues = null;
    @Json(name = "confident")
    private Boolean confident;

    public List<Venue> getVenues() {
        return venues;
    }

    public void setVenues(List<Venue> venues) {
        this.venues = venues;
    }

    public Boolean getConfident() {
        return confident;
    }

    public void setConfident(Boolean confident) {
        this.confident = confident;
    }

}