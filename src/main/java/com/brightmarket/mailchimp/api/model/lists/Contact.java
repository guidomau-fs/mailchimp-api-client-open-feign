
package com.brightmarket.mailchimp.api.model.lists;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
 * List Contact
 * <p>
 * displayed in campaign footers to comply with international spam laws
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "company",
    "address1",
    "address2",
    "city",
    "state",
    "zip",
    "country",
    "phone"
})
public class Contact implements Serializable
{

    /**
     * Company Name
     * <p>
     * The company name associated with the list.
     * (Required)
     *
     */
    @JsonProperty("company")
    @JsonPropertyDescription("The company name associated with the list.")
    private String company;
    /**
     * Address
     * <p>
     * The street address for the list contact.
     * (Required)
     *
     */
    @JsonProperty("address1")
    @JsonPropertyDescription("The street address for the list contact.")
    private String address1;
    /**
     * Address
     * <p>
     * The street address for the list contact.
     *
     */
    @JsonProperty("address2")
    @JsonPropertyDescription("The street address for the list contact.")
    private String address2;
    /**
     * City
     * <p>
     * The city for the list contact.
     * (Required)
     *
     */
    @JsonProperty("city")
    @JsonPropertyDescription("The city for the list contact.")
    private String city;
    /**
     * State
     * <p>
     * The state for the list contact.
     * (Required)
     *
     */
    @JsonProperty("state")
    @JsonPropertyDescription("The state for the list contact.")
    private String state;
    /**
     * Postal Code
     * <p>
     * The postal or zip code for the list contact.
     * (Required)
     *
     */
    @JsonProperty("zip")
    @JsonPropertyDescription("The postal or zip code for the list contact.")
    private String zip;
    /**
     * Country Code
     * <p>
     * A two-character ISO3166 country code. Defaults to US if invalid.
     * (Required)
     *
     */
    @JsonProperty("country")
    @JsonPropertyDescription("A two-character ISO3166 country code. Defaults to US if invalid.")
    private String country;
    /**
     * Phone Number
     * <p>
     * The phone number for the list contact.
     *
     */
    @JsonProperty("phone")
    @JsonPropertyDescription("The phone number for the list contact.")
    private String phone;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -3815778213168453164L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Contact() {
    }

    /**
     *
     * @param zip
     * @param country
     * @param address2
     * @param city
     * @param phone
     * @param address1
     * @param company
     * @param state
     */
    public Contact(String company, String address1, String address2, String city, String state, String zip, String country, String phone) {
        super();
        this.company = company;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
        this.phone = phone;
    }

    /**
     * Company Name
     * <p>
     * The company name associated with the list.
     * (Required)
     *
     */
    @JsonProperty("company")
    public String getCompany() {
        return company;
    }

    /**
     * Company Name
     * <p>
     * The company name associated with the list.
     * (Required)
     *
     */
    @JsonProperty("company")
    public void setCompany(String company) {
        this.company = company;
    }

    public Contact withCompany(String company) {
        this.company = company;
        return this;
    }

    /**
     * Address
     * <p>
     * The street address for the list contact.
     * (Required)
     *
     */
    @JsonProperty("address1")
    public String getAddress1() {
        return address1;
    }

    /**
     * Address
     * <p>
     * The street address for the list contact.
     * (Required)
     *
     */
    @JsonProperty("address1")
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public Contact withAddress1(String address1) {
        this.address1 = address1;
        return this;
    }

    /**
     * Address
     * <p>
     * The street address for the list contact.
     *
     */
    @JsonProperty("address2")
    public String getAddress2() {
        return address2;
    }

    /**
     * Address
     * <p>
     * The street address for the list contact.
     *
     */
    @JsonProperty("address2")
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public Contact withAddress2(String address2) {
        this.address2 = address2;
        return this;
    }

    /**
     * City
     * <p>
     * The city for the list contact.
     * (Required)
     *
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * City
     * <p>
     * The city for the list contact.
     * (Required)
     *
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public Contact withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * State
     * <p>
     * The state for the list contact.
     * (Required)
     *
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * State
     * <p>
     * The state for the list contact.
     * (Required)
     *
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    public Contact withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Postal Code
     * <p>
     * The postal or zip code for the list contact.
     * (Required)
     *
     */
    @JsonProperty("zip")
    public String getZip() {
        return zip;
    }

    /**
     * Postal Code
     * <p>
     * The postal or zip code for the list contact.
     * (Required)
     *
     */
    @JsonProperty("zip")
    public void setZip(String zip) {
        this.zip = zip;
    }

    public Contact withZip(String zip) {
        this.zip = zip;
        return this;
    }

    /**
     * Country Code
     * <p>
     * A two-character ISO3166 country code. Defaults to US if invalid.
     * (Required)
     *
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * Country Code
     * <p>
     * A two-character ISO3166 country code. Defaults to US if invalid.
     * (Required)
     *
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    public Contact withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Phone Number
     * <p>
     * The phone number for the list contact.
     *
     */
    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    /**
     * Phone Number
     * <p>
     * The phone number for the list contact.
     *
     */
    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Contact withPhone(String phone) {
        this.phone = phone;
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

    public Contact withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(zip).append(country).append(address2).append(city).append(phone).append(address1).append(company).append(state).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Contact) == false) {
            return false;
        }
        Contact rhs = ((Contact) other);
        return new EqualsBuilder().append(zip, rhs.zip).append(country, rhs.country).append(address2, rhs.address2).append(city, rhs.city).append(phone, rhs.phone).append(address1, rhs.address1).append(company, rhs.company).append(state, rhs.state).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
