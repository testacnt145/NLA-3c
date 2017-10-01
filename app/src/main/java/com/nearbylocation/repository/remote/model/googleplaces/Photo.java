package com.nearbylocation.repository.remote.model.googleplaces;

/**
 * Created by shanraisshan on 10/1/2017.
 */

import java.util.List;
import com.squareup.moshi.Json;

public class Photo {

    @Json(name = "height")
    private Integer height;
    @Json(name = "html_attributions")
    private List<String> htmlAttributions = null;
    @Json(name = "photo_reference")
    private String photoReference;
    @Json(name = "width")
    private Integer width;

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public List<String> getHtmlAttributions() {
        return htmlAttributions;
    }

    public void setHtmlAttributions(List<String> htmlAttributions) {
        this.htmlAttributions = htmlAttributions;
    }

    public String getPhotoReference() {
        return photoReference;
    }

    public void setPhotoReference(String photoReference) {
        this.photoReference = photoReference;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

}