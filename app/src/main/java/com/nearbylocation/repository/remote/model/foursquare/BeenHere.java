package com.nearbylocation.repository.remote.model.foursquare;

/**
 * Created by shayan on 9/29/17.
 */

import com.squareup.moshi.Json;

public class BeenHere {

    @Json(name = "lastCheckinExpiredAt")
    private Integer lastCheckinExpiredAt;

    public Integer getLastCheckinExpiredAt() {
        return lastCheckinExpiredAt;
    }

    public void setLastCheckinExpiredAt(Integer lastCheckinExpiredAt) {
        this.lastCheckinExpiredAt = lastCheckinExpiredAt;
    }

}