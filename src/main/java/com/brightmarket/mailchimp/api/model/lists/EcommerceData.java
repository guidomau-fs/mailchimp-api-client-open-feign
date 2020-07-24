
package com.brightmarket.mailchimp.api.model.lists;

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
 * Ecommerce Stats
 * <p>
 * Ecommerce stats for the list member if the list is attached to a store.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "total_revenue",
        "number_of_orders",
        "currency_code"
})
public class EcommerceData implements Serializable {

    /**
     * Total Revenue
     * <p>
     * The total revenue the list member has brought in.
     */
    @JsonProperty("total_revenue")
    @JsonPropertyDescription("The total revenue the list member has brought in.")
    private Double totalRevenue;
    /**
     * Total Number of Orders
     * <p>
     * The total number of orders placed by the list member.
     */
    @JsonProperty("number_of_orders")
    @JsonPropertyDescription("The total number of orders placed by the list member.")
    private Double numberOfOrders;
    /**
     * Currency
     * <p>
     * The three-letter [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217#Active_codes) code for the currency that the store accepts.
     */
    @JsonProperty("currency_code")
    @JsonPropertyDescription("The three-letter [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217#Active_codes) code for the currency that the store accepts.")
    private String currencyCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 5927231633117498552L;

    /**
     * No args constructor for use in serialization
     */
    public EcommerceData() {
    }

    /**
     * @param totalRevenue
     * @param numberOfOrders
     * @param currencyCode
     */
    public EcommerceData(Double totalRevenue, Double numberOfOrders, String currencyCode) {
        super();
        this.totalRevenue = totalRevenue;
        this.numberOfOrders = numberOfOrders;
        this.currencyCode = currencyCode;
    }

    /**
     * Total Revenue
     * <p>
     * The total revenue the list member has brought in.
     */
    @JsonProperty("total_revenue")
    public Double getTotalRevenue() {
        return totalRevenue;
    }

    /**
     * Total Revenue
     * <p>
     * The total revenue the list member has brought in.
     */
    @JsonProperty("total_revenue")
    public void setTotalRevenue(Double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public EcommerceData withTotalRevenue(Double totalRevenue) {
        this.totalRevenue = totalRevenue;
        return this;
    }

    /**
     * Total Number of Orders
     * <p>
     * The total number of orders placed by the list member.
     */
    @JsonProperty("number_of_orders")
    public Double getNumberOfOrders() {
        return numberOfOrders;
    }

    /**
     * Total Number of Orders
     * <p>
     * The total number of orders placed by the list member.
     */
    @JsonProperty("number_of_orders")
    public void setNumberOfOrders(Double numberOfOrders) {
        this.numberOfOrders = numberOfOrders;
    }

    public EcommerceData withNumberOfOrders(Double numberOfOrders) {
        this.numberOfOrders = numberOfOrders;
        return this;
    }

    /**
     * Currency
     * <p>
     * The three-letter [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217#Active_codes) code for the currency that the store accepts.
     */
    @JsonProperty("currency_code")
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Currency
     * <p>
     * The three-letter [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217#Active_codes) code for the currency that the store accepts.
     */
    @JsonProperty("currency_code")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public EcommerceData withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
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

    public EcommerceData withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(totalRevenue).append(numberOfOrders).append(additionalProperties).append(currencyCode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EcommerceData) == false) {
            return false;
        }
        EcommerceData rhs = ((EcommerceData) other);
        return new EqualsBuilder().append(totalRevenue, rhs.totalRevenue).append(numberOfOrders, rhs.numberOfOrders).append(additionalProperties, rhs.additionalProperties).append(currencyCode, rhs.currencyCode).isEquals();
    }

}
