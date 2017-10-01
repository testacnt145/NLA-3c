package com.nearbylocation.repository.remote.model.foursquare;

import com.squareup.moshi.Json;

public class VenueChain {

    @Json(name = "id")
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}