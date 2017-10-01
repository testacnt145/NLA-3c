package com.nearbylocation.repository.remote.retrofit;

import com.nearbylocation.repository.remote.model.foursquare.FourSquareNearbyPlaces;
import com.nearbylocation.repository.remote.model.googleplaces.GoogleNearbyPlaces;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface API {

    //Useful Documentation
    //https://github.com/codepath/android_guides/wiki/Consuming-APIs-with-Retrofit
    //https://futurestud.io/tutorials/retrofit-2-cancel-requests
    //old 2.0 tutorial http://www.vogella.com/tutorials/Retrofit/article.html


    //Retrofit with MVP example using Dagger
    //https://hackernoon.com/yet-another-mvp-article-part-3-calling-apis-using-retrofit-23757f4eee05

    @GET("venues/search/")
    Call<FourSquareNearbyPlaces> fourSquareLocation(
            @Query("client_id") String client_id,
            @Query("client_secret") String client_secret,
            @Query("v") String v,
            @Query("ll") String ll
    );


    @GET
    Call<GoogleNearbyPlaces> googlePlacesLocation(@Url String url);
}
