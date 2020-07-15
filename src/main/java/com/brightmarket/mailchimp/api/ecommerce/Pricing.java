
package com.brightmarket.mailchimp.api.ecommerce;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
 * Product Pricing
 * <p>
 * An internal field that returns data on the formatting of a products' price based on currency.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "formatted_price",
    "price",
    "currency_code",
    "currency_symbol",
    "decimal_places"
})
public class Pricing implements Serializable
{

    /**
     * Product's Formatted Price
     * <p>
     * The formatted string of the price of the product based on the store's currency and that currency's convention.
     *
     */
    @JsonProperty("formatted_price")
    @JsonPropertyDescription("The formatted string of the price of the product based on the store's currency and that currency's convention.")
    private String formattedPrice;
    /**
     * Product's Price
     * <p>
     * The number representing the price of the product.
     *
     */
    @JsonProperty("price")
    @JsonPropertyDescription("The number representing the price of the product.")
    private Double price;
    /**
     * Currency Code
     * <p>
     * The currency code associated with the currency of the store this product belongs to.
     *
     */
    @JsonProperty("currency_code")
    @JsonPropertyDescription("The currency code associated with the currency of the store this product belongs to.")
    private String currencyCode;
    /**
     * Currency Symbol
     * <p>
     * The currency symbol associated with the currency of the store this product belongs to.
     *
     */
    @JsonProperty("currency_symbol")
    @JsonPropertyDescription("The currency symbol associated with the currency of the store this product belongs to.")
    private String currencySymbol;
    /**
     * Decimal places
     * <p>
     * The formatted string of the price of the product based on the store's currency and that currency's convention.
     *
     */
    @JsonProperty("decimal_places")
    @JsonPropertyDescription("The formatted string of the price of the product based on the store's currency and that currency's convention.")
    private Double decimalPlaces;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 4335676308515860463L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Pricing() {
    }

    /**
     *
     * @param formattedPrice
     * @param decimalPlaces
     * @param price
     * @param currencySymbol
     * @param currencyCode
     */
    public Pricing(String formattedPrice, Double price, String currencyCode, String currencySymbol, Double decimalPlaces) {
        super();
        this.formattedPrice = formattedPrice;
        this.price = price;
        this.currencyCode = currencyCode;
        this.currencySymbol = currencySymbol;
        this.decimalPlaces = decimalPlaces;
    }

    /**
     * Product's Formatted Price
     * <p>
     * The formatted string of the price of the product based on the store's currency and that currency's convention.
     *
     */
    @JsonProperty("formatted_price")
    public String getFormattedPrice() {
        return formattedPrice;
    }

    /**
     * Product's Formatted Price
     * <p>
     * The formatted string of the price of the product based on the store's currency and that currency's convention.
     *
     */
    @JsonProperty("formatted_price")
    public void setFormattedPrice(String formattedPrice) {
        this.formattedPrice = formattedPrice;
    }

    public Pricing withFormattedPrice(String formattedPrice) {
        this.formattedPrice = formattedPrice;
        return this;
    }

    /**
     * Product's Price
     * <p>
     * The number representing the price of the product.
     *
     */
    @JsonProperty("price")
    public Double getPrice() {
        return price;
    }

    /**
     * Product's Price
     * <p>
     * The number representing the price of the product.
     *
     */
    @JsonProperty("price")
    public void setPrice(Double price) {
        this.price = price;
    }

    public Pricing withPrice(Double price) {
        this.price = price;
        return this;
    }

    /**
     * Currency Code
     * <p>
     * The currency code associated with the currency of the store this product belongs to.
     *
     */
    @JsonProperty("currency_code")
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Currency Code
     * <p>
     * The currency code associated with the currency of the store this product belongs to.
     *
     */
    @JsonProperty("currency_code")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Pricing withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * Currency Symbol
     * <p>
     * The currency symbol associated with the currency of the store this product belongs to.
     *
     */
    @JsonProperty("currency_symbol")
    public String getCurrencySymbol() {
        return currencySymbol;
    }

    /**
     * Currency Symbol
     * <p>
     * The currency symbol associated with the currency of the store this product belongs to.
     *
     */
    @JsonProperty("currency_symbol")
    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public Pricing withCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
        return this;
    }

    /**
     * Decimal places
     * <p>
     * The formatted string of the price of the product based on the store's currency and that currency's convention.
     *
     */
    @JsonProperty("decimal_places")
    public Double getDecimalPlaces() {
        return decimalPlaces;
    }

    /**
     * Decimal places
     * <p>
     * The formatted string of the price of the product based on the store's currency and that currency's convention.
     *
     */
    @JsonProperty("decimal_places")
    public void setDecimalPlaces(Double decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
    }

    public Pricing withDecimalPlaces(Double decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
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

    public Pricing withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(formattedPrice).append(decimalPlaces).append(price).append(currencySymbol).append(additionalProperties).append(currencyCode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Pricing) == false) {
            return false;
        }
        Pricing rhs = ((Pricing) other);
        return new EqualsBuilder().append(formattedPrice, rhs.formattedPrice).append(decimalPlaces, rhs.decimalPlaces).append(price, rhs.price).append(currencySymbol, rhs.currencySymbol).append(additionalProperties, rhs.additionalProperties).append(currencyCode, rhs.currencyCode).isEquals();
    }

}
