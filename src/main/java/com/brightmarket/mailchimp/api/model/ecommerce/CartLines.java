
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
 * Ecommerce Carts
 * <p>
 * A list of an account's ecommerce carts.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "store_id",
        "cart_id",
        "lines",
        "total_items",
        "_links"
})
public class CartLines implements Serializable {

    /**
     * Store Foreign ID
     * <p>
     * A unique identifier for the store.
     */
    @JsonProperty("store_id")
    @JsonPropertyDescription("A unique identifier for the store.")
    private String storeId;

    /**
     * Cart Foreign ID
     * <p>
     * A unique identifier for the cart.
     */
    @JsonProperty("store_id")
    @JsonPropertyDescription("A unique identifier for the cart.")
    private String cartId;

    /**
     * Checkouts
     * <p>
     * An array of objects, each representing a cart resource.
     */
    @JsonProperty("lines")
    @JsonPropertyDescription("An array of objects, each representing a cart line resource.")
    private List<CartLine> lines = null;
    /**
     * Item Count
     * <p>
     * The total number of items matching the query, irrespective of pagination.
     */
    @JsonProperty("total_items")
    @JsonPropertyDescription("The total number of items matching the query, irrespective of pagination.")
    private Long totalItems;
    /**
     * Links
     * <p>
     */
    @JsonProperty("_links")
    @JsonPropertyDescription("")
    private List<Link> links = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6386577205739415857L;

    /**
     * No args constructor for use in serialization
     */
    public CartLines() {
    }

    /**
     * @param storeId
     * @param cartId
     * @param lines
     * @param totalItems
     * @param links
     */
    public CartLines(String storeId, String cartId, List<CartLine> lines, Long totalItems, List<Link> links) {
        super();
        this.storeId = storeId;
        this.cartId = cartId;
        this.lines = lines;
        this.totalItems = totalItems;
        this.links = links;
    }

    /**
     * Store Foreign ID
     * <p>
     * A unique identifier for the store.
     */
    @JsonProperty("store_id")
    public String getStoreId() {
        return storeId;
    }

    /**
     * Store Foreign ID
     * <p>
     * A unique identifier for the store.
     */
    @JsonProperty("store_id")
    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public CartLines withStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }

    /**
     * Checkouts
     * <p>
     * An array of objects, each representing a cart line resource.
     */
    @JsonProperty("lines")
    public List<CartLine> getLines() {
        return lines;
    }

    /**
     * Checkouts
     * <p>
     * An array of objects, each representing a cart line resource.
     */
    @JsonProperty("lines")
    public void setLines(List<CartLine> lines) {
        this.lines = lines;
    }

    public CartLines withLines(List<CartLine> lines) {
        this.lines = lines;
        return this;
    }

    /**
     * Item Count
     * <p>
     * The total number of items matching the query, irrespective of pagination.
     */
    @JsonProperty("total_items")
    public Long getTotalItems() {
        return totalItems;
    }

    /**
     * Item Count
     * <p>
     * The total number of items matching the query, irrespective of pagination.
     */
    @JsonProperty("total_items")
    public void setTotalItems(Long totalItems) {
        this.totalItems = totalItems;
    }

    public CartLines withTotalItems(Long totalItems) {
        this.totalItems = totalItems;
        return this;
    }

    /**
     * Links
     * <p>
     */
    @JsonProperty("_links")
    public List<Link> getLinks() {
        return links;
    }

    /**
     * Links
     * <p>
     */
    @JsonProperty("_links")
    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public CartLines withLinks(List<Link> links) {
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

    public CartLines withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(totalItems).append(links).append(lines).append(additionalProperties).append(storeId).append(cartId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CartLines) == false) {
            return false;
        }
        CartLines rhs = ((CartLines) other);
        return new EqualsBuilder().append(totalItems, rhs.totalItems).append(links, rhs.links).append(lines, rhs.lines).append(additionalProperties, rhs.additionalProperties).append(storeId, rhs.storeId).append(cartId, rhs.cartId).isEquals();
    }

}
