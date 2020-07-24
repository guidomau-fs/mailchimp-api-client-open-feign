
package com.brightmarket.mailchimp.api.model.lists;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


/**
 * Location
 * <p>
 * Subscriber location information.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "latitude",
        "longitude",
        "gmtoff",
        "dstoff",
        "country_code",
        "timezone"
})
public class Location implements Serializable {

    /**
     * Latitude
     * <p>
     */
    @JsonProperty("latitude")
    private Double latitude;
    /**
     * Longitude
     * <p>
     */
    @JsonProperty("longitude")
    private Double longitude;
    /**
     * GMT Offset
     * <p>
     */
    @JsonProperty("gmtoff")
    private Long gmtoff;
    /**
     * DST Offset
     * <p>
     */
    @JsonProperty("dstoff")
    private Long dstoff;
    /**
     * Country Code
     * <p>
     */
    @JsonProperty("country_code")
    private String countryCode;
    /**
     * Timezone
     * <p>
     */
    @JsonProperty("timezone")
    private String timezone;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -3757103751188361825L;

    /**
     * No args constructor for use in serialization
     */
    public Location() {
    }

    /**
     * @param dstoff
     * @param countryCode
     * @param timezone
     * @param latitude
     * @param gmtoff
     * @param longitude
     */
    public Location(Double latitude, Double longitude, Long gmtoff, Long dstoff, String countryCode, String timezone) {
        super();
        this.latitude = latitude;
        this.longitude = longitude;
        this.gmtoff = gmtoff;
        this.dstoff = dstoff;
        this.countryCode = countryCode;
        this.timezone = timezone;
    }

    /**
     * Latitude
     * <p>
     */
    @JsonProperty("latitude")
    public Double getLatitude() {
        return latitude;
    }

    /**
     * Latitude
     * <p>
     */
    @JsonProperty("latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Location withLatitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * Longitude
     * <p>
     */
    @JsonProperty("longitude")
    public Double getLongitude() {
        return longitude;
    }

    /**
     * Longitude
     * <p>
     */
    @JsonProperty("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Location withLongitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * GMT Offset
     * <p>
     */
    @JsonProperty("gmtoff")
    public Long getGmtoff() {
        return gmtoff;
    }

    /**
     * GMT Offset
     * <p>
     */
    @JsonProperty("gmtoff")
    public void setGmtoff(Long gmtoff) {
        this.gmtoff = gmtoff;
    }

    public Location withGmtoff(Long gmtoff) {
        this.gmtoff = gmtoff;
        return this;
    }

    /**
     * DST Offset
     * <p>
     */
    @JsonProperty("dstoff")
    public Long getDstoff() {
        return dstoff;
    }

    /**
     * DST Offset
     * <p>
     */
    @JsonProperty("dstoff")
    public void setDstoff(Long dstoff) {
        this.dstoff = dstoff;
    }

    public Location withDstoff(Long dstoff) {
        this.dstoff = dstoff;
        return this;
    }

    /**
     * Country Code
     * <p>
     */
    @JsonProperty("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Country Code
     * <p>
     */
    @JsonProperty("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Location withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Timezone
     * <p>
     */
    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    /**
     * Timezone
     * <p>
     */
    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Location withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Location withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dstoff).append(countryCode).append(timezone).append(latitude).append(gmtoff).append(additionalProperties).append(longitude).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Location) == false) {
            return false;
        }
        Location rhs = ((Location) other);
        return new EqualsBuilder().append(dstoff, rhs.dstoff).append(countryCode, rhs.countryCode).append(timezone, rhs.timezone).append(latitude, rhs.latitude).append(gmtoff, rhs.gmtoff).append(additionalProperties, rhs.additionalProperties).append(longitude, rhs.longitude).isEquals();
    }

}
