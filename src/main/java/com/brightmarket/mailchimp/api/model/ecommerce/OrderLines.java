
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
        "order_id",
        "lines",
        "total_items",
        "_links"
})
public class OrderLines implements Serializable {

    /**
     * Store Foreign ID
     * <p>
     * A unique identifier for the store.
     */
    @JsonProperty("store_id")
    @JsonPropertyDescription("A unique identifier for the store.")
    private String storeId;

    /**
     * Order Foreign ID
     * <p>
     * A unique identifier for the order.
     */
    @JsonProperty("order_id")
    @JsonPropertyDescription("A unique identifier for the order.")
    private String orderId;

    /**
     * Checkouts
     * <p>
     * An array of objects, each representing a cart resource.
     */
    @JsonProperty("lines")
    @JsonPropertyDescription("An array of objects, each representing a order line resource.")
    private List<OrderLine> lines = null;
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
    public OrderLines() {
    }

    /**
     * @param storeId
     * @param orderId
     * @param lines
     * @param totalItems
     * @param links
     */
    public OrderLines(String storeId, String orderId, List<OrderLine> lines, Long totalItems, List<Link> links) {
        super();
        this.storeId = storeId;
        this.orderId = orderId;
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

    public OrderLines withStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }

    /**
     * Order Foreign ID
     * <p>
     * A unique identifier for the order.
     */
    @JsonProperty("order_id")
    public String getOrderId() {
        return orderId;
    }

    /**
     * Order Foreign ID
     * <p>
     * A unique identifier for the order.
     */
    @JsonProperty("order_id")
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public OrderLines withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * Checkouts
     * <p>
     * An array of objects, each representing a order line resource.
     */
    @JsonProperty("lines")
    public List<OrderLine> getLines() {
        return lines;
    }

    /**
     * Checkouts
     * <p>
     * An array of objects, each representing a order line resource.
     */
    @JsonProperty("lines")
    public void setLines(List<OrderLine> lines) {
        this.lines = lines;
    }

    public OrderLines withLines(List<OrderLine> lines) {
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

    public OrderLines withTotalItems(Long totalItems) {
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

    public OrderLines withLinks(List<Link> links) {
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

    public OrderLines withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(totalItems).append(links).append(lines).append(additionalProperties)
                .append(storeId).append(orderId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrderLines) == false) {
            return false;
        }
        OrderLines rhs = ((OrderLines) other);
        return new EqualsBuilder().append(totalItems, rhs.totalItems).append(links, rhs.links).append(lines, rhs.lines)
                .append(additionalProperties, rhs.additionalProperties).append(storeId, rhs.storeId).append(orderId, rhs.orderId).isEquals();
    }

}
