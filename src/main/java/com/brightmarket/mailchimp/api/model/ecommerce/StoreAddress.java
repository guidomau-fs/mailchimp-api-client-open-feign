
package com.brightmarket.mailchimp.api.model.ecommerce;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
 * Address
 * <p>
 * The store address.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "address1",
        "address2",
        "city",
        "province",
        "province_code",
        "postal_code",
        "country",
        "country_code",
        "longitude",
        "latitude"
})
public class StoreAddress implements Serializable {

    /**
     * Address Field 1
     * <p>
     * The store's mailing address.
     */
    @JsonProperty("address1")
    @JsonPropertyDescription("The store's mailing address.")
    private String address1;
    /**
     * Address Field 2
     * <p>
     * An additional field for the store's mailing address.
     */
    @JsonProperty("address2")
    @JsonPropertyDescription("An additional field for the store's mailing address.")
    private String address2;
    /**
     * City
     * <p>
     * The city the store is located in.
     */
    @JsonProperty("city")
    @JsonPropertyDescription("The city the store is located in.")
    private String city;
    /**
     * Province
     * <p>
     * The store's state name or normalized province.
     */
    @JsonProperty("province")
    @JsonPropertyDescription("The store's state name or normalized province.")
    private String province;
    /**
     * Province Code
     * <p>
     * The two-letter code for the store's province or state.
     */
    @JsonProperty("province_code")
    @JsonPropertyDescription("The two-letter code for the store's province or state.")
    private String provinceCode;
    /**
     * Postal Code
     * <p>
     * The store's postal or zip code.
     */
    @JsonProperty("postal_code")
    @JsonPropertyDescription("The store's postal or zip code.")
    private String postalCode;
    /**
     * Country Code
     * <p>
     * The store's country.
     */
    @JsonProperty("country")
    @JsonPropertyDescription("The store's country.")
    private String country;
    /**
     * Country Code
     * <p>
     * The two-letter code for to the store's country.
     */
    @JsonProperty("country_code")
    @JsonPropertyDescription("The two-letter code for to the store's country.")
    private String countryCode;
    /**
     * Longitude
     * <p>
     * The longitude of the store location.
     */
    @JsonProperty("longitude")
    @JsonPropertyDescription("The longitude of the store location.")
    private Double longitude;
    /**
     * Latitude
     * <p>
     * The latitude of the store location.
     */
    @JsonProperty("latitude")
    @JsonPropertyDescription("The latitude of the store location.")
    private Double latitude;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6261187921696991677L;

    /**
     * No args constructor for use in serialization
     */
    public StoreAddress() {
    }

    /**
     * @param country
     * @param province
     * @param address2
     * @param city
     * @param address1
     * @param provinceCode
     * @param countryCode
     * @param postalCode
     * @param latitude
     * @param longitude
     */
    public StoreAddress(String address1, String address2, String city, String province, String provinceCode, String postalCode, String country, String countryCode, Double longitude, Double latitude) {
        super();
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.province = province;
        this.provinceCode = provinceCode;
        this.postalCode = postalCode;
        this.country = country;
        this.countryCode = countryCode;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    /**
     * Address Field 1
     * <p>
     * The store's mailing address.
     */
    @JsonProperty("address1")
    public String getAddress1() {
        return address1;
    }

    /**
     * Address Field 1
     * <p>
     * The store's mailing address.
     */
    @JsonProperty("address1")
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public StoreAddress withAddress1(String address1) {
        this.address1 = address1;
        return this;
    }

    /**
     * Address Field 2
     * <p>
     * An additional field for the store's mailing address.
     */
    @JsonProperty("address2")
    public String getAddress2() {
        return address2;
    }

    /**
     * Address Field 2
     * <p>
     * An additional field for the store's mailing address.
     */
    @JsonProperty("address2")
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public StoreAddress withAddress2(String address2) {
        this.address2 = address2;
        return this;
    }

    /**
     * City
     * <p>
     * The city the store is located in.
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * City
     * <p>
     * The city the store is located in.
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public StoreAddress withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Province
     * <p>
     * The store's state name or normalized province.
     */
    @JsonProperty("province")
    public String getProvince() {
        return province;
    }

    /**
     * Province
     * <p>
     * The store's state name or normalized province.
     */
    @JsonProperty("province")
    public void setProvince(String province) {
        this.province = province;
    }

    public StoreAddress withProvince(String province) {
        this.province = province;
        return this;
    }

    /**
     * Province Code
     * <p>
     * The two-letter code for the store's province or state.
     */
    @JsonProperty("province_code")
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * Province Code
     * <p>
     * The two-letter code for the store's province or state.
     */
    @JsonProperty("province_code")
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public StoreAddress withProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
        return this;
    }

    /**
     * Postal Code
     * <p>
     * The store's postal or zip code.
     */
    @JsonProperty("postal_code")
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Postal Code
     * <p>
     * The store's postal or zip code.
     */
    @JsonProperty("postal_code")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public StoreAddress withPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * Country Code
     * <p>
     * The store's country.
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * Country Code
     * <p>
     * The store's country.
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    public StoreAddress withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Country Code
     * <p>
     * The two-letter code for to the store's country.
     */
    @JsonProperty("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Country Code
     * <p>
     * The two-letter code for to the store's country.
     */
    @JsonProperty("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public StoreAddress withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Longitude
     * <p>
     * The longitude of the store location.
     */
    @JsonProperty("longitude")
    public Double getLongitude() {
        return longitude;
    }

    /**
     * Longitude
     * <p>
     * The longitude of the store location.
     */
    @JsonProperty("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public StoreAddress withLongitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * Latitude
     * <p>
     * The latitude of the store location.
     */
    @JsonProperty("latitude")
    public Double getLatitude() {
        return latitude;
    }

    /**
     * Latitude
     * <p>
     * The latitude of the store location.
     */
    @JsonProperty("latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public StoreAddress withLatitude(Double latitude) {
        this.latitude = latitude;
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

    public StoreAddress withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(country).append(province).append(address2).append(city).append(address1).append(provinceCode).append(countryCode).append(postalCode).append(latitude).append(additionalProperties).append(longitude).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StoreAddress) == false) {
            return false;
        }
        StoreAddress rhs = ((StoreAddress) other);
        return new EqualsBuilder().append(country, rhs.country).append(province, rhs.province).append(address2, rhs.address2).append(city, rhs.city).append(address1, rhs.address1).append(provinceCode, rhs.provinceCode).append(countryCode, rhs.countryCode).append(postalCode, rhs.postalCode).append(latitude, rhs.latitude).append(additionalProperties, rhs.additionalProperties).append(longitude, rhs.longitude).isEquals();
    }

}
