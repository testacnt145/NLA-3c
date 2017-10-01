package com.nearbylocation.repository.remote.model.foursquare;


import java.util.List;
import com.squareup.moshi.Json;

public class Venue {

    @Json(name = "id")
    private String id;
    @Json(name = "name")
    private String name;
    @Json(name = "contact")
    private Contact contact;
    @Json(name = "location")
    private Location location;
    @Json(name = "categories")
    private List<Category> categories = null;
    @Json(name = "verified")
    private Boolean verified;
    @Json(name = "stats")
    private Stats stats;
    @Json(name = "url")
    private String url;
    @Json(name = "allowMenuUrlEdit")
    private Boolean allowMenuUrlEdit;
    @Json(name = "beenHere")
    private BeenHere beenHere;
    @Json(name = "specials")
    private Specials specials;
    @Json(name = "hereNow")
    private HereNow hereNow;
    @Json(name = "referralId")
    private String referralId;
    @Json(name = "venueChains")
    private List<VenueChain> venueChains = null;
    @Json(name = "hasPerk")
    private Boolean hasPerk;
    @Json(name = "venueRatingBlacklisted")
    private Boolean venueRatingBlacklisted;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getAllowMenuUrlEdit() {
        return allowMenuUrlEdit;
    }

    public void setAllowMenuUrlEdit(Boolean allowMenuUrlEdit) {
        this.allowMenuUrlEdit = allowMenuUrlEdit;
    }

    public BeenHere getBeenHere() {
        return beenHere;
    }

    public void setBeenHere(BeenHere beenHere) {
        this.beenHere = beenHere;
    }

    public Specials getSpecials() {
        return specials;
    }

    public void setSpecials(Specials specials) {
        this.specials = specials;
    }

    public HereNow getHereNow() {
        return hereNow;
    }

    public void setHereNow(HereNow hereNow) {
        this.hereNow = hereNow;
    }

    public String getReferralId() {
        return referralId;
    }

    public void setReferralId(String referralId) {
        this.referralId = referralId;
    }

    public List<VenueChain> getVenueChains() {
        return venueChains;
    }

    public void setVenueChains(List<VenueChain> venueChains) {
        this.venueChains = venueChains;
    }

    public Boolean getHasPerk() {
        return hasPerk;
    }

    public void setHasPerk(Boolean hasPerk) {
        this.hasPerk = hasPerk;
    }

    public Boolean getVenueRatingBlacklisted() {
        return venueRatingBlacklisted;
    }

    public void setVenueRatingBlacklisted(Boolean venueRatingBlacklisted) {
        this.venueRatingBlacklisted = venueRatingBlacklisted;
    }

}