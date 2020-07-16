
package com.brightmarket.mailchimp.api.model.ecommerce;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
 * Automations
 * <p>
 * Details for the automations attached to this store.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "abandoned_cart",
    "abandoned_browse"
})
public class Automations implements Serializable
{

    /**
     * Abandoned Cart Automation
     * <p>
     * abandonedCart automation details.
     *
     */
    @JsonProperty("abandoned_cart")
    @JsonPropertyDescription("abandonedCart automation details.")
    private AbandonedCart abandonedCart;
    /**
     * Abandoned Browse Automation
     * <p>
     * abandonedBrowse automation details. abandonedBrowse is also known as Product Retargeting Email or Retarget Site Visitors on the web.
     *
     */
    @JsonProperty("abandoned_browse")
    @JsonPropertyDescription("abandonedBrowse automation details. abandonedBrowse is also known as Product Retargeting Email or Retarget Site Visitors on the web.")
    private AbandonedBrowse abandonedBrowse;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -2003608298081964581L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Automations() {
    }

    /**
     *
     * @param abandonedBrowse
     * @param abandonedCart
     */
    public Automations(AbandonedCart abandonedCart, AbandonedBrowse abandonedBrowse) {
        super();
        this.abandonedCart = abandonedCart;
        this.abandonedBrowse = abandonedBrowse;
    }

    /**
     * Abandoned Cart Automation
     * <p>
     * abandonedCart automation details.
     *
     */
    @JsonProperty("abandoned_cart")
    public AbandonedCart getAbandonedCart() {
        return abandonedCart;
    }

    /**
     * Abandoned Cart Automation
     * <p>
     * abandonedCart automation details.
     *
     */
    @JsonProperty("abandoned_cart")
    public void setAbandonedCart(AbandonedCart abandonedCart) {
        this.abandonedCart = abandonedCart;
    }

    public Automations withAbandonedCart(AbandonedCart abandonedCart) {
        this.abandonedCart = abandonedCart;
        return this;
    }

    /**
     * Abandoned Browse Automation
     * <p>
     * abandonedBrowse automation details. abandonedBrowse is also known as Product Retargeting Email or Retarget Site Visitors on the web.
     *
     */
    @JsonProperty("abandoned_browse")
    public AbandonedBrowse getAbandonedBrowse() {
        return abandonedBrowse;
    }

    /**
     * Abandoned Browse Automation
     * <p>
     * abandonedBrowse automation details. abandonedBrowse is also known as Product Retargeting Email or Retarget Site Visitors on the web.
     *
     */
    @JsonProperty("abandoned_browse")
    public void setAbandonedBrowse(AbandonedBrowse abandonedBrowse) {
        this.abandonedBrowse = abandonedBrowse;
    }

    public Automations withAbandonedBrowse(AbandonedBrowse abandonedBrowse) {
        this.abandonedBrowse = abandonedBrowse;
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

    public Automations withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(abandonedBrowse).append(abandonedCart).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Automations) == false) {
            return false;
        }
        Automations rhs = ((Automations) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(abandonedBrowse, rhs.abandonedBrowse).append(abandonedCart, rhs.abandonedCart).isEquals();
    }

}
