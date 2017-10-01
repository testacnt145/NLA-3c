package com.nearbylocation.app.constants;


public class Network {


    //http://www.jsonschema2pojo.org/

    //latitude longitude from
    //https://www.latlong.net/

//    public static final String URL_FOUR_SQUARE = "https://api.foursquare.com/v2/venues/search?" +
//            "client_id=" + FOURSQUARE_CLIENT_ID +
//            "&client_secret="	+ FOURSQUARE_CLIENT_SECRET +
//            "&v=" + FOURSQUARE_VERSION +
//            "&ll=" + GEO_LOCATION;

    //[email_: testacnt145@gmail.com]
    //https://api.foursquare.com/v2/venues/search?client_id=AL4MXJV4FQHIX5UHB0PSAEXX2QSQJBCNIV2ZYO5KNF5OMJ4F&client_secret=OROT2PGNS1ZQQLMNJEWUFH2EBPHUWWSDDMVEGGVMIFAZEGFH&v=20130815&ll=24.860345,67.062703
    public static final String FOURSQUARE_CLIENT_ID = "AL4MXJV4FQHIX5UHB0PSAEXX2QSQJBCNIV2ZYO5KNF5OMJ4F";
    public static final String FOURSQUARE_CLIENT_SECRET = "OROT2PGNS1ZQQLMNJEWUFH2EBPHUWWSDDMVEGGVMIFAZEGFH";
    public static final String FOURSQUARE_VERSION = "20170929";
    public static final String GEO_LOCATION = "24.877349,67.052997";

    //https://github.com/Taishi-Y/Foursquare-API-client-sample-app-for-Android
    //https://github.com/Taishi-Y/Foursquare-API-client-sample-app-for-Android/blob/master/app/src/main/java/com/taishi/foursquareapiforandroid/Model/Explore/Venue.java
    public static String BASE_URL_FOUR_SQUARE = "https://api.foursquare.com/v2/";


    //[email_: testacnt145@gmail.com]
    //https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=24.877349,67.052997&radius=500&key=AIzaSyAorjB4lptWQGkG5xNBNif5aPLEGzKvoJ4
    public static String BASE_URL_GOOGLE_PLACES = "https://maps.googleapis.com/";
    private static final String GOOGLE_PLACES_API_KEY = "AIzaSyAorjB4lptWQGkG5xNBNif5aPLEGzKvoJ4";
    public static final String URL_GOOGLE_PLACES = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?"
            + "location=" + GEO_LOCATION
            + "&radius=500"
            + "&key=" + GOOGLE_PLACES_API_KEY;


}
