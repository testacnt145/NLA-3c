package com.nearbylocation.repository.remote.model.googleplaces;

/**
 * Created by shanraisshan on 10/1/2017.
 */
import java.util.List;
import com.squareup.moshi.Json;

public class GoogleNearbyPlaces {

    @Json(name = "html_attributions")
    private List<Object> htmlAttributions = null;
    @Json(name = "next_page_token")
    private String nextPageToken;
    @Json(name = "results")
    private List<Result> results = null;
    @Json(name = "status")
    private String status;

    public List<Object> getHtmlAttributions() {
        return htmlAttributions;
    }

    public void setHtmlAttributions(List<Object> htmlAttributions) {
        this.htmlAttributions = htmlAttributions;
    }

    public String getNextPageToken() {
        return nextPageToken;
    }

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    public List<Result > getResults() {
        return results;
    }

    public void setResults(List<Result > results) {
        this.results = results;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}