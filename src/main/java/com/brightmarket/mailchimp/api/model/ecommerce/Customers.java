
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
 * Ecommerce Customers
 * <p>
 * A list of an account's ecommerce customers.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "store_id",
    "customers",
    "total_items",
    "_links"
})
public class Customers implements Serializable
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
     * Customers
     * <p>
     * An array of objects, each representing a customer resource.
     *
     */
    @JsonProperty("customers")
    @JsonPropertyDescription("An array of objects, each representing a customer resource.")
    private List<Customer> customers = null;
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
    private final static long serialVersionUID = 7602424643202516477L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Customers() {
    }

    /**
     *
     * @param totalItems
     * @param links
     * @param customers
     * @param storeId
     */
    public Customers(String storeId, List<Customer> customers, Long totalItems, List<Link> links) {
        super();
        this.storeId = storeId;
        this.customers = customers;
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

    public Customers withStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }

    /**
     * Customers
     * <p>
     * An array of objects, each representing a customer resource.
     *
     */
    @JsonProperty("customers")
    public List<Customer> getCustomers() {
        return customers;
    }

    /**
     * Customers
     * <p>
     * An array of objects, each representing a customer resource.
     *
     */
    @JsonProperty("customers")
    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public Customers withCustomers(List<Customer> customers) {
        this.customers = customers;
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

    public Customers withTotalItems(Long totalItems) {
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

    public Customers withLinks(List<Link> links) {
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

    public Customers withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(totalItems).append(links).append(customers).append(additionalProperties).append(storeId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Customers) == false) {
            return false;
        }
        Customers rhs = ((Customers) other);
        return new EqualsBuilder().append(totalItems, rhs.totalItems).append(links, rhs.links).append(customers, rhs.customers).append(additionalProperties, rhs.additionalProperties).append(storeId, rhs.storeId).isEquals();
    }

}
