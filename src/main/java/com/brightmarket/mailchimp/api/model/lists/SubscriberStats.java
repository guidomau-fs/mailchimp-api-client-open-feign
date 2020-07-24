
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
 * Subscriber Stats
 * <p>
 * General open rates for this subscriber.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "avg_open_rate",
        "avg_click_rate",
        "ecommerce_data"
})
public class SubscriberStats implements Serializable {

    /**
     * Average Open Rate
     * <p>
     * A subscriber's average open rate.
     */
    @JsonProperty("avg_open_rate")
    @JsonPropertyDescription("A subscriber's average open rate.")
    private Double avgOpenRate;
    /**
     * Average Click Rate
     * <p>
     * A subscriber's average clickthrough rate.
     */
    @JsonProperty("avg_click_rate")
    @JsonPropertyDescription("A subscriber's average clickthrough rate.")
    private Double avgClickRate;
    /**
     * Ecommerce Stats
     * <p>
     * Ecommerce stats for the list member if the list is attached to a store.
     */
    @JsonProperty("ecommerce_data")
    @JsonPropertyDescription("Ecommerce stats for the list member if the list is attached to a store.")
    private EcommerceData ecommerceData;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8631357802537117541L;

    /**
     * No args constructor for use in serialization
     */
    public SubscriberStats() {
    }

    /**
     * @param avgClickRate
     * @param avgOpenRate
     * @param ecommerceData
     */
    public SubscriberStats(Double avgOpenRate, Double avgClickRate, EcommerceData ecommerceData) {
        super();
        this.avgOpenRate = avgOpenRate;
        this.avgClickRate = avgClickRate;
        this.ecommerceData = ecommerceData;
    }

    /**
     * Average Open Rate
     * <p>
     * A subscriber's average open rate.
     */
    @JsonProperty("avg_open_rate")
    public Double getAvgOpenRate() {
        return avgOpenRate;
    }

    /**
     * Average Open Rate
     * <p>
     * A subscriber's average open rate.
     */
    @JsonProperty("avg_open_rate")
    public void setAvgOpenRate(Double avgOpenRate) {
        this.avgOpenRate = avgOpenRate;
    }

    public SubscriberStats withAvgOpenRate(Double avgOpenRate) {
        this.avgOpenRate = avgOpenRate;
        return this;
    }

    /**
     * Average Click Rate
     * <p>
     * A subscriber's average clickthrough rate.
     */
    @JsonProperty("avg_click_rate")
    public Double getAvgClickRate() {
        return avgClickRate;
    }

    /**
     * Average Click Rate
     * <p>
     * A subscriber's average clickthrough rate.
     */
    @JsonProperty("avg_click_rate")
    public void setAvgClickRate(Double avgClickRate) {
        this.avgClickRate = avgClickRate;
    }

    public SubscriberStats withAvgClickRate(Double avgClickRate) {
        this.avgClickRate = avgClickRate;
        return this;
    }

    /**
     * Ecommerce Stats
     * <p>
     * Ecommerce stats for the list member if the list is attached to a store.
     */
    @JsonProperty("ecommerce_data")
    public EcommerceData getEcommerceData() {
        return ecommerceData;
    }

    /**
     * Ecommerce Stats
     * <p>
     * Ecommerce stats for the list member if the list is attached to a store.
     */
    @JsonProperty("ecommerce_data")
    public void setEcommerceData(EcommerceData ecommerceData) {
        this.ecommerceData = ecommerceData;
    }

    public SubscriberStats withEcommerceData(EcommerceData ecommerceData) {
        this.ecommerceData = ecommerceData;
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

    public SubscriberStats withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ecommerceData).append(avgClickRate).append(avgOpenRate).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SubscriberStats) == false) {
            return false;
        }
        SubscriberStats rhs = ((SubscriberStats) other);
        return new EqualsBuilder().append(ecommerceData, rhs.ecommerceData).append(avgClickRate, rhs.avgClickRate).append(avgOpenRate, rhs.avgOpenRate).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
