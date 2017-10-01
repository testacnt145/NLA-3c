package com.nearbylocation.repository.remote.model.foursquare;

import java.util.List;
import com.squareup.moshi.Json;

public class Specials {

    @Json(name = "count")
    private Integer count;
    @Json(name = "items")
    private List<Object> items = null;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<Object> getItems() {
        return items;
    }

    public void setItems(List<Object> items) {
        this.items = items;
    }

}