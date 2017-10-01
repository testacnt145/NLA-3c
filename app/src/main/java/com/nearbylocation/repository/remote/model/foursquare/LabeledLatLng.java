package com.nearbylocation.repository.remote.model.foursquare;

import com.squareup.moshi.Json;

public class LabeledLatLng {

    @Json(name = "label")
    private String label;
    @Json(name = "lat")
    private Double lat;
    @Json(name = "lng")
    private Double lng;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

}
