
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
 * Ecommerce Products
 * <p>
 * A list of an account's ecommerce products.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "store_id",
    "products",
    "total_items",
    "_links"
})
public class ProductList implements Serializable
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
     * Products
     * <p>
     * An array of objects, each representing a product resource.
     *
     */
    @JsonProperty("products")
    @JsonPropertyDescription("An array of objects, each representing a product resource.")
    private List<Product> products = null;
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
    private final static long serialVersionUID = 7293954180710951709L;

    /**
     * No args constructor for use in serialization
     *
     */
    public ProductList() {
    }

    /**
     *
     * @param totalItems
     * @param links
     * @param storeId
     * @param products
     */
    public ProductList(String storeId, List<Product> products, Long totalItems, List<Link> links) {
        super();
        this.storeId = storeId;
        this.products = products;
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

    public ProductList withStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }

    /**
     * Products
     * <p>
     * An array of objects, each representing a product resource.
     *
     */
    @JsonProperty("products")
    public List<Product> getProducts() {
        return products;
    }

    /**
     * Products
     * <p>
     * An array of objects, each representing a product resource.
     *
     */
    @JsonProperty("products")
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public ProductList withProducts(List<Product> products) {
        this.products = products;
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

    public ProductList withTotalItems(Long totalItems) {
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

    public ProductList withLinks(List<Link> links) {
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

    public ProductList withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(totalItems).append(links).append(additionalProperties).append(storeId).append(products).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProductList) == false) {
            return false;
        }
        ProductList rhs = ((ProductList) other);
        return new EqualsBuilder().append(totalItems, rhs.totalItems).append(links, rhs.links).append(additionalProperties, rhs.additionalProperties).append(storeId, rhs.storeId).append(products, rhs.products).isEquals();
    }

}
