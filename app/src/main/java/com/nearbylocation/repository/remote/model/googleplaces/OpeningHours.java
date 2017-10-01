package com.nearbylocation.repository.remote.model.googleplaces;

/**
 * Created by shanraisshan on 10/1/2017.
 */

import java.util.List;
import com.squareup.moshi.Json;

public class OpeningHours {

    @Json(name = "open_now")
    private Boolean openNow;
    @Json(name = "weekday_text")
    private List<Object> weekdayText = null;

    public Boolean getOpenNow() {
        return openNow;
    }

    public void setOpenNow(Boolean openNow) {
        this.openNow = openNow;
    }

    public List<Object> getWeekdayText() {
        return weekdayText;
    }

    public void setWeekdayText(List<Object> weekdayText) {
        this.weekdayText = weekdayText;
    }

}