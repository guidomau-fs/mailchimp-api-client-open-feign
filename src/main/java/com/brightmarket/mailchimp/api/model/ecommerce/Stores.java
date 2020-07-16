
package com.brightmarket.mailchimp.api.model.ecommerce;

import com.brightmarket.mailchimp.api.model.Link;
import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Ecommerce Stores
 * <p>
 * A list of an account's ecommerce stores.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "stores",
    "total_items",
    "_links"
})
public class Stores implements Serializable
{

    /**
     * Stores
     * <p>
     * An array of objects, each representing a store resource.
     *
     */
    @JsonProperty("stores")
    @JsonPropertyDescription("An array of objects, each representing a store resource.")
    private List<Store> stores = null;
    /**
     * Item Count
     * <p>
     * The total number of items matching the query, irrespective of pagination.
     *
     */
    @JsonProperty("total_items")
    @JsonPropertyDescription("The total number of items matching the query, irrespective of pagination.")
    private Long totalItems;
    /**
     * Links
     * <p>
     *
     *
     */
    @JsonProperty("_links")
    @JsonPropertyDescription("")
    private List<Link> links = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6442004534396407388L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Stores() {
    }

    /**
     *
     * @param totalItems
     * @param stores
     * @param links
     */
    public Stores(List<Store> stores, Long totalItems, List<Link> links) {
        super();
        this.stores = stores;
        this.totalItems = totalItems;
        this.links = links;
    }

    /**
     * Stores
     * <p>
     * An array of objects, each representing a store resource.
     *
     */
    @JsonProperty("stores")
    public List<Store> getStores() {
        return stores;
    }

    /**
     * Stores
     * <p>
     * An array of objects, each representing a store resource.
     *
     */
    @JsonProperty("stores")
    public void setStores(List<Store> stores) {
        this.stores = stores;
    }

    public Stores withStores(List<Store> stores) {
        this.stores = stores;
        return this;
    }

    /**
     * Item Count
     * <p>
     * The total number of items matching the query, irrespective of pagination.
     *
     */
    @JsonProperty("total_items")
    public Long getTotalItems() {
        return totalItems;
    }

    /**
     * Item Count
     * <p>
     * The total number of items matching the query, irrespective of pagination.
     *
     */
    @JsonProperty("total_items")
    public void setTotalItems(Long totalItems) {
        this.totalItems = totalItems;
    }

    public Stores withTotalItems(Long totalItems) {
        this.totalItems = totalItems;
        return this;
    }

    /**
     * Links
     * <p>
     *
     *
     */
    @JsonProperty("_links")
    public List<Link> getLinks() {
        return links;
    }

    /**
     * Links
     * <p>
     *
     *
     */
    @JsonProperty("_links")
    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public Stores withLinks(List<Link> links) {
        this.links = links;
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

    public Stores withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(totalItems).append(links).append(additionalProperties).append(stores).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Stores) == false) {
            return false;
        }
        Stores rhs = ((Stores) other);
        return new EqualsBuilder().append(totalItems, rhs.totalItems).append(links, rhs.links).append(additionalProperties, rhs.additionalProperties).append(stores, rhs.stores).isEquals();
    }

}
