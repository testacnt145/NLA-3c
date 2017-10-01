package com.nearbylocation.repository.remote.model.googleplaces;

/**
 * Created by shayan on 9/29/17.
 */

import com.nearbylocation.repository.remote.model.foursquare.Meta;
import com.nearbylocation.repository.remote.model.foursquare.Response;
import com.squareup.moshi.Json;

import java.util.List;
import com.squareup.moshi.Json;

public class Result {

    @Json(name = "geometry")
    private Geometry geometry;
    @Json(name = "icon")
    private String icon;
    @Json(name = "id")
    private String id;
    @Json(name = "name")
    private String name;
    @Json(name = "photos")
    private List<Photo> photos = null;
    @Json(name = "place_id")
    private String placeId;
    @Json(name = "reference")
    private String reference;
    @Json(name = "scope")
    private String scope;
    @Json(name = "types")
    private List<String> types = null;
    @Json(name = "vicinity")
    private String vicinity;
    @Json(name = "rating")
    private Double rating;
    @Json(name = "opening_hours")
    private OpeningHours openingHours;

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public String getVicinity() {
        return vicinity;
    }

    public void setVicinity(String vicinity) {
        this.vicinity = vicinity;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public OpeningHours getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(OpeningHours openingHours) {
        this.openingHours = openingHours;
    }

}