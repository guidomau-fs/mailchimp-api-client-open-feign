
package com.brightmarket.mailchimp.api.ecommerce;

import com.brightmarket.mailchimp.api.Link;
import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Ecommerce Carts
 * <p>
 * A list of an account's ecommerce carts.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "store_id",
    "carts",
    "total_items",
    "_links"
})
public class CartList implements Serializable
{

    /**
     * Store Foreign ID
     * <p>
     * A unique identifier for the store.
     *
     */
    @JsonProperty("store_id")
    @JsonPropertyDescription("A unique identifier for the store.")
    private String storeId;
    /**
     * Checkouts
     * <p>
     * An array of objects, each representing a cart resource.
     *
     */
    @JsonProperty("carts")
    @JsonPropertyDescription("An array of objects, each representing a cart resource.")
    private List<Cart> carts = null;
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
    private final static long serialVersionUID = 6386577205739415857L;

    /**
     * No args constructor for use in serialization
     *
     */
    public CartList() {
    }

    /**
     *
     * @param totalItems
     * @param carts
     * @param links
     * @param storeId
     */
    public CartList(String storeId, List<Cart> carts, Long totalItems, List<Link> links) {
        super();
        this.storeId = storeId;
        this.carts = carts;
        this.totalItems = totalItems;
        this.links = links;
    }

    /**
     * Store Foreign ID
     * <p>
     * A unique identifier for the store.
     *
     */
    @JsonProperty("store_id")
    public String getStoreId() {
        return storeId;
    }

    /**
     * Store Foreign ID
     * <p>
     * A unique identifier for the store.
     *
     */
    @JsonProperty("store_id")
    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public CartList withStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }

    /**
     * Checkouts
     * <p>
     * An array of objects, each representing a cart resource.
     *
     */
    @JsonProperty("carts")
    public List<Cart> getCarts() {
        return carts;
    }

    /**
     * Checkouts
     * <p>
     * An array of objects, each representing a cart resource.
     *
     */
    @JsonProperty("carts")
    public void setCarts(List<Cart> carts) {
        this.carts = carts;
    }

    public CartList withCarts(List<Cart> carts) {
        this.carts = carts;
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

    public CartList withTotalItems(Long totalItems) {
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

    public CartList withLinks(List<Link> links) {
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

    public CartList withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(totalItems).append(links).append(carts).append(additionalProperties).append(storeId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CartList) == false) {
            return false;
        }
        CartList rhs = ((CartList) other);
        return new EqualsBuilder().append(totalItems, rhs.totalItems).append(links, rhs.links).append(carts, rhs.carts).append(additionalProperties, rhs.additionalProperties).append(storeId, rhs.storeId).isEquals();
    }

}
