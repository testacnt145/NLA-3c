package com.nearbylocation.repository.remote.model.foursquare;

/**
 * Created by shayan on 9/29/17.
 */

import com.squareup.moshi.Json;

public class Contact {

    @Json(name = "twitter")
    private String twitter;
    @Json(name = "facebook")
    private String facebook;
    @Json(name = "facebookUsername")
    private String facebookUsername;
    @Json(name = "facebookName")
    private String facebookName;
    @Json(name = "phone")
    private String phone;
    @Json(name = "formattedPhone")
    private String formattedPhone;

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getFacebookUsername() {
        return facebookUsername;
    }

    public void setFacebookUsername(String facebookUsername) {
        this.facebookUsername = facebookUsername;
    }

    public String getFacebookName() {
        return facebookName;
    }

    public void setFacebookName(String facebookName) {
        this.facebookName = facebookName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFormattedPhone() {
        return formattedPhone;
    }

    public void setFormattedPhone(String formattedPhone) {
        this.formattedPhone = formattedPhone;
    }

}