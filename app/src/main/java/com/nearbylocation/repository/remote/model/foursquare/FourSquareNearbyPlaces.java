package com.nearbylocation.repository.remote.model.foursquare;

/**
 * Created by shayan on 9/29/17.
 */

import com.squareup.moshi.Json;

    public class FourSquareNearbyPlaces {

        @Json(name = "meta")
        private Meta meta;
        @Json(name = "response")
        private Response response;

        public Meta getMeta() {
            return meta;
        }

        public void setMeta(Meta meta) {
            this.meta = meta;
        }

        public Response getResponse() {
            return response;
        }

        public void setResponse(Response response) {
            this.response = response;
        }

    }