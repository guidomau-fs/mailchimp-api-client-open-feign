
package com.brightmarket.mailchimp.api.ecommerce.order;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


/**
 * Billing Address
 * <p>
 * The billing address for the order.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "address1",
    "address2",
    "city",
    "province",
    "province_code",
    "postal_code",
    "country",
    "country_code",
    "longitude",
    "latitude",
    "phone",
    "company"
})
public class BillingAddress implements Serializable
{

    /**
     * Name
     * <p>
     * The name associated with an order's billing address.
     *
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name associated with an order's billing address.")
    private String name;
    /**
     * Address Field 1
     * <p>
     * The billing address for the order.
     *
     */
    @JsonProperty("address1")
    @JsonPropertyDescription("The billing address for the order.")
    private String address1;
    /**
     * Address Field 2
     * <p>
     * An additional field for the billing address.
     *
     */
    @JsonProperty("address2")
    @JsonPropertyDescription("An additional field for the billing address.")
    private String address2;
    /**
     * City
     * <p>
     * The city in the billing address.
     *
     */
    @JsonProperty("city")
    @JsonPropertyDescription("The city in the billing address.")
    private String city;
    /**
     * Province
     * <p>
     * The state or normalized province in the billing address.
     *
     */
    @JsonProperty("province")
    @JsonPropertyDescription("The state or normalized province in the billing address.")
    private String province;
    /**
     * Province Code
     * <p>
     * The two-letter code for the province or state in the billing address.
     *
     */
    @JsonProperty("province_code")
    @JsonPropertyDescription("The two-letter code for the province or state in the billing address.")
    private String provinceCode;
    /**
     * Postal Code
     * <p>
     * The postal or zip code in the billing address.
     *
     */
    @JsonProperty("postal_code")
    @JsonPropertyDescription("The postal or zip code in the billing address.")
    private String postalCode;
    /**
     * Country Code
     * <p>
     * The country in the billing address.
     *
     */
    @JsonProperty("country")
    @JsonPropertyDescription("The country in the billing address.")
    private String country;
    /**
     * Country Code
     * <p>
     * The two-letter code for the country in the billing address.
     *
     */
    @JsonProperty("country_code")
    @JsonPropertyDescription("The two-letter code for the country in the billing address.")
    private String countryCode;
    /**
     * Longitude
     * <p>
     * The longitude for the billing address location.
     *
     */
    @JsonProperty("longitude")
    @JsonPropertyDescription("The longitude for the billing address location.")
    private Double longitude;
    /**
     * Latitude
     * <p>
     * The latitude for the billing address location.
     *
     */
    @JsonProperty("latitude")
    @JsonPropertyDescription("The latitude for the billing address location.")
    private Double latitude;
    /**
     * Phone Number
     * <p>
     * The phone number for the billing address.
     *
     */
    @JsonProperty("phone")
    @JsonPropertyDescription("The phone number for the billing address.")
    private String phone;
    /**
     * Company
     * <p>
     * The company associated with the billing address.
     *
     */
    @JsonProperty("company")
    @JsonPropertyDescription("The company associated with the billing address.")
    private String company;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6972702731600939680L;

    /**
     * No args constructor for use in serialization
     *
     */
    public BillingAddress() {
    }

    /**
     *
     * @param country
     * @param address2
     * @param city
     * @param address1
     * @param provinceCode
     * @param postalCode
     * @param latitude
     * @param province
     * @param phone
     * @param countryCode
     * @param name
     * @param company
     * @param longitude
     */
    public BillingAddress(String name, String address1, String address2, String city, String province, String provinceCode, String postalCode, String country, String countryCode, Double longitude, Double latitude, String phone, String company) {
        super();
        this.name = name;
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
        this.phone = phone;
        this.company = company;
    }

    /**
     * Name
     * <p>
     * The name associated with an order's billing address.
     *
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * The name associated with an order's billing address.
     *
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public BillingAddress withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Address Field 1
     * <p>
     * The billing address for the order.
     *
     */
    @JsonProperty("address1")
    public String getAddress1() {
        return address1;
    }

    /**
     * Address Field 1
     * <p>
     * The billing address for the order.
     *
     */
    @JsonProperty("address1")
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public BillingAddress withAddress1(String address1) {
        this.address1 = address1;
        return this;
    }

    /**
     * Address Field 2
     * <p>
     * An additional field for the billing address.
     *
     */
    @JsonProperty("address2")
    public String getAddress2() {
        return address2;
    }

    /**
     * Address Field 2
     * <p>
     * An additional field for the billing address.
     *
     */
    @JsonProperty("address2")
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public BillingAddress withAddress2(String address2) {
        this.address2 = address2;
        return this;
    }

    /**
     * City
     * <p>
     * The city in the billing address.
     *
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * City
     * <p>
     * The city in the billing address.
     *
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public BillingAddress withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Province
     * <p>
     * The state or normalized province in the billing address.
     *
     */
    @JsonProperty("province")
    public String getProvince() {
        return province;
    }

    /**
     * Province
     * <p>
     * The state or normalized province in the billing address.
     *
     */
    @JsonProperty("province")
    public void setProvince(String province) {
        this.province = province;
    }

    public BillingAddress withProvince(String province) {
        this.province = province;
        return this;
    }

    /**
     * Province Code
     * <p>
     * The two-letter code for the province or state in the billing address.
     *
     */
    @JsonProperty("province_code")
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * Province Code
     * <p>
     * The two-letter code for the province or state in the billing address.
     *
     */
    @JsonProperty("province_code")
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public BillingAddress withProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
        return this;
    }

    /**
     * Postal Code
     * <p>
     * The postal or zip code in the billing address.
     *
     */
    @JsonProperty("postal_code")
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Postal Code
     * <p>
     * The postal or zip code in the billing address.
     *
     */
    @JsonProperty("postal_code")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public BillingAddress withPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * Country Code
     * <p>
     * The country in the billing address.
     *
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * Country Code
     * <p>
     * The country in the billing address.
     *
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    public BillingAddress withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Country Code
     * <p>
     * The two-letter code for the country in the billing address.
     *
     */
    @JsonProperty("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Country Code
     * <p>
     * The two-letter code for the country in the billing address.
     *
     */
    @JsonProperty("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public BillingAddress withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Longitude
     * <p>
     * The longitude for the billing address location.
     *
     */
    @JsonProperty("longitude")
    public Double getLongitude() {
        return longitude;
    }

    /**
     * Longitude
     * <p>
     * The longitude for the billing address location.
     *
     */
    @JsonProperty("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public BillingAddress withLongitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * Latitude
     * <p>
     * The latitude for the billing address location.
     *
     */
    @JsonProperty("latitude")
    public Double getLatitude() {
        return latitude;
    }

    /**
     * Latitude
     * <p>
     * The latitude for the billing address location.
     *
     */
    @JsonProperty("latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public BillingAddress withLatitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * Phone Number
     * <p>
     * The phone number for the billing address.
     *
     */
    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    /**
     * Phone Number
     * <p>
     * The phone number for the billing address.
     *
     */
    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public BillingAddress withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Company
     * <p>
     * The company associated with the billing address.
     *
     */
    @JsonProperty("company")
    public String getCompany() {
        return company;
    }

    /**
     * Company
     * <p>
     * The company associated with the billing address.
     *
     */
    @JsonProperty("company")
    public void setCompany(String company) {
        this.company = company;
    }

    public BillingAddress withCompany(String company) {
        this.company = company;
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

    public BillingAddress withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(country).append(address2).append(city).append(address1).append(provinceCode).append(postalCode).append(latitude).append(province).append(phone).append(countryCode).append(name).append(company).append(additionalProperties).append(longitude).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BillingAddress) == false) {
            return false;
        }
        BillingAddress rhs = ((BillingAddress) other);
        return new EqualsBuilder().append(country, rhs.country).append(address2, rhs.address2).append(city, rhs.city).append(address1, rhs.address1).append(provinceCode, rhs.provinceCode).append(postalCode, rhs.postalCode).append(latitude, rhs.latitude).append(province, rhs.province).append(phone, rhs.phone).append(countryCode, rhs.countryCode).append(name, rhs.name).append(company, rhs.company).append(additionalProperties, rhs.additionalProperties).append(longitude, rhs.longitude).isEquals();
    }

}
