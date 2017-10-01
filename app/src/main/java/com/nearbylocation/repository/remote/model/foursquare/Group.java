package com.nearbylocation.repository.remote.model.foursquare;

/**
 * Created by shayan on 9/29/17.
 */

import java.util.List;
import com.squareup.moshi.Json;

public class Group {

    @Json(name = "type")
    private String type;
    @Json(name = "name")
    private String name;
    @Json(name = "count")
    private Integer count;
    @Json(name = "items")
    private List<Object> items = null;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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