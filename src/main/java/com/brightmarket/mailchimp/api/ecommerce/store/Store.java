
package com.brightmarket.mailchimp.api.ecommerce.store;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;


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
public class Store implements Serializable
{

    /**
     * Stores
     * <p>
     * An array of objects, each representing a store resource.
     *
     */
    @JsonProperty("stores")
    @JsonPropertyDescription("An array of objects, each representing a store resource.")
    private List<Store_> stores = null;
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
    public Store() {
    }

    /**
     *
     * @param totalItems
     * @param stores
     * @param links
     */
    public Store(List<Store_> stores, Long totalItems, List<Link> links) {
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
    public List<Store_> getStores() {
        return stores;
    }

    /**
     * Stores
     * <p>
     * An array of objects, each representing a store resource.
     *
     */
    @JsonProperty("stores")
    public void setStores(List<Store_> stores) {
        this.stores = stores;
    }

    public Store withStores(List<Store_> stores) {
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

    public Store withTotalItems(Long totalItems) {
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

    public Store withLinks(List<Link> links) {
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

    public Store withAdditionalProperty(String name, Object value) {
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
        if ((other instanceof Store) == false) {
            return false;
        }
        Store rhs = ((Store) other);
        return new EqualsBuilder().append(totalItems, rhs.totalItems).append(links, rhs.links).append(additionalProperties, rhs.additionalProperties).append(stores, rhs.stores).isEquals();
    }

}
