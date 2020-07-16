
package com.brightmarket.mailchimp.api.model;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
 * Industry Stats
 * <p>
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "open_rate",
    "bounce_rate",
    "click_rate"
})
public class IndustryStats implements Serializable
{

    /**
     * Open Rate
     * <p>
     * Percentage of successfully delivered campaigns that registered as an open group by users's Industry.
     *
     */
    @JsonProperty("open_rate")
    @JsonPropertyDescription("Percentage of successfully delivered campaigns that registered as an open group by users's Industry.")
    private Double openRate;
    /**
     * Bounce Rate
     * <p>
     * Percentage of number of recipients that registered as a hard or soft bounce group by users's Industry.
     *
     */
    @JsonProperty("bounce_rate")
    @JsonPropertyDescription("Percentage of number of recipients that registered as a hard or soft bounce group by users's Industry.")
    private Double bounceRate;
    /**
     * Click Rate
     * <p>
     * Percentage of successfully delivered campaigns that registered a click group by users's Industry.
     *
     */
    @JsonProperty("click_rate")
    @JsonPropertyDescription("Percentage of successfully delivered campaigns that registered a click group by users's Industry.")
    private Double clickRate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2277931589114757624L;

    /**
     * No args constructor for use in serialization
     *
     */
    public IndustryStats() {
    }

    /**
     *
     * @param openRate
     * @param clickRate
     * @param bounceRate
     */
    public IndustryStats(Double openRate, Double bounceRate, Double clickRate) {
        super();
        this.openRate = openRate;
        this.bounceRate = bounceRate;
        this.clickRate = clickRate;
    }

    /**
     * Open Rate
     * <p>
     * Percentage of successfully delivered campaigns that registered as an open group by users's Industry.
     *
     */
    @JsonProperty("open_rate")
    public Double getOpenRate() {
        return openRate;
    }

    /**
     * Open Rate
     * <p>
     * Percentage of successfully delivered campaigns that registered as an open group by users's Industry.
     *
     */
    @JsonProperty("open_rate")
    public void setOpenRate(Double openRate) {
        this.openRate = openRate;
    }

    public IndustryStats withOpenRate(Double openRate) {
        this.openRate = openRate;
        return this;
    }

    /**
     * Bounce Rate
     * <p>
     * Percentage of number of recipients that registered as a hard or soft bounce group by users's Industry.
     *
     */
    @JsonProperty("bounce_rate")
    public Double getBounceRate() {
        return bounceRate;
    }

    /**
     * Bounce Rate
     * <p>
     * Percentage of number of recipients that registered as a hard or soft bounce group by users's Industry.
     *
     */
    @JsonProperty("bounce_rate")
    public void setBounceRate(Double bounceRate) {
        this.bounceRate = bounceRate;
    }

    public IndustryStats withBounceRate(Double bounceRate) {
        this.bounceRate = bounceRate;
        return this;
    }

    /**
     * Click Rate
     * <p>
     * Percentage of successfully delivered campaigns that registered a click group by users's Industry.
     *
     */
    @JsonProperty("click_rate")
    public Double getClickRate() {
        return clickRate;
    }

    /**
     * Click Rate
     * <p>
     * Percentage of successfully delivered campaigns that registered a click group by users's Industry.
     *
     */
    @JsonProperty("click_rate")
    public void setClickRate(Double clickRate) {
        this.clickRate = clickRate;
    }

    public IndustryStats withClickRate(Double clickRate) {
        this.clickRate = clickRate;
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

    public IndustryStats withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(openRate).append(additionalProperties).append(bounceRate).append(clickRate).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IndustryStats) == false) {
            return false;
        }
        IndustryStats rhs = ((IndustryStats) other);
        return new EqualsBuilder().append(openRate, rhs.openRate).append(additionalProperties, rhs.additionalProperties).append(bounceRate, rhs.bounceRate).append(clickRate, rhs.clickRate).isEquals();
    }

}
