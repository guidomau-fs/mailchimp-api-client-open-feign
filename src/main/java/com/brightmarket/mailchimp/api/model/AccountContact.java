
package com.brightmarket.mailchimp.api.model;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Account Contact
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "company",
    "addr1",
    "addr2",
    "city",
    "state",
    "zip",
    "country"
})
public class AccountContact implements Serializable
{

    /**
     * Company
     * <p>
     * The company name associated with the account.
     *
     */
    @JsonProperty("company")
    @JsonPropertyDescription("The company name associated with the account.")
    private String company;
    /**
     * Address Line 1
     * <p>
     * The street address for the account contact.
     *
     */
    @JsonProperty("addr1")
    @JsonPropertyDescription("The street address for the account contact.")
    private String addr1;
    /**
     * Address Line 2
     * <p>
     * The street address for the account contact.
     *
     */
    @JsonProperty("addr2")
    @JsonPropertyDescription("The street address for the account contact.")
    private String addr2;
    /**
     * City
     * <p>
     * The city for the account contact.
     *
     */
    @JsonProperty("city")
    @JsonPropertyDescription("The city for the account contact.")
    private String city;
    /**
     * State
     * <p>
     * The state (if available) for the account contact.
     *
     */
    @JsonProperty("state")
    @JsonPropertyDescription("The state (if available) for the account contact.")
    private String state;
    /**
     * Zip Code
     * <p>
     * The zip code (if available) for the account contact.
     *
     */
    @JsonProperty("zip")
    @JsonPropertyDescription("The zip code (if available) for the account contact.")
    private String zip;
    /**
     * Country
     * <p>
     * The country for the account contact.
     *
     */
    @JsonProperty("country")
    @JsonPropertyDescription("The country for the account contact.")
    private String country;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -162393231857181486L;

    /**
     * No args constructor for use in serialization
     *
     */
    public AccountContact() {
    }

    /**
     *
     * @param zip
     * @param country
     * @param addr2
     * @param addr1
     * @param city
     * @param company
     * @param state
     */
    public AccountContact(String company, String addr1, String addr2, String city, String state, String zip, String country) {
        super();
        this.company = company;
        this.addr1 = addr1;
        this.addr2 = addr2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
    }

    /**
     * Company
     * <p>
     * The company name associated with the account.
     *
     */
    @JsonProperty("company")
    public String getCompany() {
        return company;
    }

    /**
     * Company
     * <p>
     * The company name associated with the account.
     *
     */
    @JsonProperty("company")
    public void setCompany(String company) {
        this.company = company;
    }

    public AccountContact withCompany(String company) {
        this.company = company;
        return this;
    }

    /**
     * Address Line 1
     * <p>
     * The street address for the account contact.
     *
     */
    @JsonProperty("addr1")
    public String getAddr1() {
        return addr1;
    }

    /**
     * Address Line 1
     * <p>
     * The street address for the account contact.
     *
     */
    @JsonProperty("addr1")
    public void setAddr1(String addr1) {
        this.addr1 = addr1;
    }

    public AccountContact withAddr1(String addr1) {
        this.addr1 = addr1;
        return this;
    }

    /**
     * Address Line 2
     * <p>
     * The street address for the account contact.
     *
     */
    @JsonProperty("addr2")
    public String getAddr2() {
        return addr2;
    }

    /**
     * Address Line 2
     * <p>
     * The street address for the account contact.
     *
     */
    @JsonProperty("addr2")
    public void setAddr2(String addr2) {
        this.addr2 = addr2;
    }

    public AccountContact withAddr2(String addr2) {
        this.addr2 = addr2;
        return this;
    }

    /**
     * City
     * <p>
     * The city for the account contact.
     *
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * City
     * <p>
     * The city for the account contact.
     *
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public AccountContact withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * State
     * <p>
     * The state (if available) for the account contact.
     *
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * State
     * <p>
     * The state (if available) for the account contact.
     *
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    public AccountContact withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Zip Code
     * <p>
     * The zip code (if available) for the account contact.
     *
     */
    @JsonProperty("zip")
    public String getZip() {
        return zip;
    }

    /**
     * Zip Code
     * <p>
     * The zip code (if available) for the account contact.
     *
     */
    @JsonProperty("zip")
    public void setZip(String zip) {
        this.zip = zip;
    }

    public AccountContact withZip(String zip) {
        this.zip = zip;
        return this;
    }

    /**
     * Country
     * <p>
     * The country for the account contact.
     *
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * Country
     * <p>
     * The country for the account contact.
     *
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    public AccountContact withCountry(String country) {
        this.country = country;
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

    public AccountContact withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(zip).append(country).append(addr2).append(addr1).append(city).append(company).append(state).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountContact) == false) {
            return false;
        }
        AccountContact rhs = ((AccountContact) other);
        return new EqualsBuilder().append(zip, rhs.zip).append(country, rhs.country).append(addr2, rhs.addr2).append(addr1, rhs.addr1).append(city, rhs.city).append(company, rhs.company).append(state, rhs.state).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
