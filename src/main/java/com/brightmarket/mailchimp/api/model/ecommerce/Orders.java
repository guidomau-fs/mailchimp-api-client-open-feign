
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
 * Ecommerce Orders
 * <p>
 * A list of an account's ecommerce orders.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "orders",
    "total_items",
    "_links"
})
public class Orders implements Serializable
{

    /**
     * Orders
     * <p>
     * An array of objects, each representing an order resource.
     *
     */
    @JsonProperty("orders")
    @JsonPropertyDescription("An array of objects, each representing an order resource.")
    private List<Order> orders = null;
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
    private final static long serialVersionUID = 9014372077236215461L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Orders() {
    }

    /**
     *
     * @param totalItems
     * @param orders
     * @param links
     */
    public Orders(List<Order> orders, Long totalItems, List<Link> links) {
        super();
        this.orders = orders;
        this.totalItems = totalItems;
        this.links = links;
    }

    /**
     * Orders
     * <p>
     * An array of objects, each representing an order resource.
     *
     */
    @JsonProperty("orders")
    public List<Order> getOrders() {
        return orders;
    }

    /**
     * Orders
     * <p>
     * An array of objects, each representing an order resource.
     *
     */
    @JsonProperty("orders")
    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Orders withOrders(List<Order> orders) {
        this.orders = orders;
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

    public Orders withTotalItems(Long totalItems) {
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

    public Orders withLinks(List<Link> links) {
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

    public Orders withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(orders).append(totalItems).append(links).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Orders) == false) {
            return false;
        }
        Orders rhs = ((Orders) other);
        return new EqualsBuilder().append(orders, rhs.orders).append(totalItems, rhs.totalItems).append(links, rhs.links).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
