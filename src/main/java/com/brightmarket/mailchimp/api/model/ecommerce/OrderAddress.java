
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
 * The address associated with an ecommerce customer.
 *
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
    "country_code"
})
public class OrderAddress implements Serializable
{

    /**
     * Address Field 1
     * <p>
     * The mailing address of the customer.
     *
     */
    @JsonProperty("address1")
    @JsonPropertyDescription("The mailing address of the customer.")
    private String address1;
    /**
     * Address Field 2
     * <p>
     * An additional field for the customer's mailing address.
     *
     */
    @JsonProperty("address2")
    @JsonPropertyDescription("An additional field for the customer's mailing address.")
    private String address2;
    /**
     * City
     * <p>
     * The city the customer is located in.
     *
     */
    @JsonProperty("city")
    @JsonPropertyDescription("The city the customer is located in.")
    private String city;
    /**
     * Province
     * <p>
     * The customer's state name or normalized province.
     *
     */
    @JsonProperty("province")
    @JsonPropertyDescription("The customer's state name or normalized province.")
    private String province;
    /**
     * Province Code
     * <p>
     * The two-letter code for the customer's province or state.
     *
     */
    @JsonProperty("province_code")
    @JsonPropertyDescription("The two-letter code for the customer's province or state.")
    private String provinceCode;
    /**
     * Postal Code
     * <p>
     * The customer's postal or zip code.
     *
     */
    @JsonProperty("postal_code")
    @JsonPropertyDescription("The customer's postal or zip code.")
    private String postalCode;
    /**
     * Country Code
     * <p>
     * The customer's country.
     *
     */
    @JsonProperty("country")
    @JsonPropertyDescription("The customer's country.")
    private String country;
    /**
     * Country Code
     * <p>
     * The two-letter code for the customer's country.
     *
     */
    @JsonProperty("country_code")
    @JsonPropertyDescription("The two-letter code for the customer's country.")
    private String countryCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4020414898731344257L;

    /**
     * No args constructor for use in serialization
     *
     */
    public OrderAddress() {
    }

    /**
     *
     * @param country
     * @param province
     * @param address2
     * @param city
     * @param address1
     * @param provinceCode
     * @param countryCode
     * @param postalCode
     */
    public OrderAddress(String address1, String address2, String city, String province, String provinceCode, String postalCode, String country, String countryCode) {
        super();
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.province = province;
        this.provinceCode = provinceCode;
        this.postalCode = postalCode;
        this.country = country;
        this.countryCode = countryCode;
    }

    /**
     * Address Field 1
     * <p>
     * The mailing address of the customer.
     *
     */
    @JsonProperty("address1")
    public String getAddress1() {
        return address1;
    }

    /**
     * Address Field 1
     * <p>
     * The mailing address of the customer.
     *
     */
    @JsonProperty("address1")
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public OrderAddress withAddress1(String address1) {
        this.address1 = address1;
        return this;
    }

    /**
     * Address Field 2
     * <p>
     * An additional field for the customer's mailing address.
     *
     */
    @JsonProperty("address2")
    public String getAddress2() {
        return address2;
    }

    /**
     * Address Field 2
     * <p>
     * An additional field for the customer's mailing address.
     *
     */
    @JsonProperty("address2")
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public OrderAddress withAddress2(String address2) {
        this.address2 = address2;
        return this;
    }

    /**
     * City
     * <p>
     * The city the customer is located in.
     *
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * City
     * <p>
     * The city the customer is located in.
     *
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public OrderAddress withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Province
     * <p>
     * The customer's state name or normalized province.
     *
     */
    @JsonProperty("province")
    public String getProvince() {
        return province;
    }

    /**
     * Province
     * <p>
     * The customer's state name or normalized province.
     *
     */
    @JsonProperty("province")
    public void setProvince(String province) {
        this.province = province;
    }

    public OrderAddress withProvince(String province) {
        this.province = province;
        return this;
    }

    /**
     * Province Code
     * <p>
     * The two-letter code for the customer's province or state.
     *
     */
    @JsonProperty("province_code")
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * Province Code
     * <p>
     * The two-letter code for the customer's province or state.
     *
     */
    @JsonProperty("province_code")
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public OrderAddress withProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
        return this;
    }

    /**
     * Postal Code
     * <p>
     * The customer's postal or zip code.
     *
     */
    @JsonProperty("postal_code")
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Postal Code
     * <p>
     * The customer's postal or zip code.
     *
     */
    @JsonProperty("postal_code")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public OrderAddress withPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * Country Code
     * <p>
     * The customer's country.
     *
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * Country Code
     * <p>
     * The customer's country.
     *
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    public OrderAddress withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Country Code
     * <p>
     * The two-letter code for the customer's country.
     *
     */
    @JsonProperty("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Country Code
     * <p>
     * The two-letter code for the customer's country.
     *
     */
    @JsonProperty("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public OrderAddress withCountryCode(String countryCode) {
        this.countryCode = countryCode;
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

    public OrderAddress withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(country).append(province).append(address2).append(city).append(address1).append(provinceCode).append(countryCode).append(postalCode).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrderAddress) == false) {
            return false;
        }
        OrderAddress rhs = ((OrderAddress) other);
        return new EqualsBuilder().append(country, rhs.country).append(province, rhs.province).append(address2, rhs.address2).append(city, rhs.city).append(address1, rhs.address1).append(provinceCode, rhs.provinceCode).append(countryCode, rhs.countryCode).append(postalCode, rhs.postalCode).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
