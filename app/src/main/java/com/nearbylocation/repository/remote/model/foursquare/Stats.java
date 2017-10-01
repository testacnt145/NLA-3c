package com.nearbylocation.repository.remote.model.foursquare;

import com.squareup.moshi.Json;

public class Stats {

    @Json(name = "checkinsCount")
    private Integer checkinsCount;
    @Json(name = "usersCount")
    private Integer usersCount;
    @Json(name = "tipCount")
    private Integer tipCount;

    public Integer getCheckinsCount() {
        return checkinsCount;
    }

    public void setCheckinsCount(Integer checkinsCount) {
        this.checkinsCount = checkinsCount;
    }

    public Integer getUsersCount() {
        return usersCount;
    }

    public void setUsersCount(Integer usersCount) {
        this.usersCount = usersCount;
    }

    public Integer getTipCount() {
        return tipCount;
    }

    public void setTipCount(Integer tipCount) {
        this.tipCount = tipCount;
    }

}