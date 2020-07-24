
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
        "product_id",
        "variants",
        "total_items",
        "_links"
})
public class Variants implements Serializable {

    /**
     * Store Foreign ID
     * <p>
     * A unique identifier for the store.
     */
    @JsonProperty("store_id")
    @JsonPropertyDescription("A unique identifier for the store.")
    private String storeId;

    /**
     * Product Foreign ID
     * <p>
     * A unique identifier for the cart.
     */
    @JsonProperty("product_id")
    @JsonPropertyDescription("A unique identifier for the product.")
    private String productId;

    /**
     * Checkouts
     * <p>
     * An array of objects, each representing a product variant resource.
     */
    @JsonProperty("variants")
    @JsonPropertyDescription("An array of objects, each representing a product variant resource.")
    private List<Variant> variants = null;
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
    public Variants() {
    }

    /**
     * @param storeId
     * @param productId
     * @param variants
     * @param totalItems
     * @param links
     */
    public Variants(String storeId, String productId, List<Variant> variants, Long totalItems, List<Link> links) {
        super();
        this.storeId = storeId;
        this.productId = productId;
        this.variants = variants;
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

    public Variants withStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }

    /**
     * Product Foreign ID
     * <p>
     * A unique identifier for the product.
     */
    @JsonProperty("product_id")
    public String getProductId() {
        return productId;
    }

    /**
     * Product Foreign ID
     * <p>
     * A unique identifier for the product.
     */
    @JsonProperty("cart_id")
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Variants withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * Checkouts
     * <p>
     * An array of objects, each representing a cart line resource.
     */
    @JsonProperty("variants")
    public List<Variant> getVariants() {
        return variants;
    }

    /**
     * Checkouts
     * <p>
     * An array of objects, each representing a cart line resource.
     */
    @JsonProperty("variants")
    public void setVariants(List<Variant> variants) {
        this.variants = variants;
    }

    public Variants withVariants(List<Variant> variants) {
        this.variants = variants;
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

    public Variants withTotalItems(Long totalItems) {
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

    public Variants withLinks(List<Link> links) {
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

    public Variants withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(totalItems).append(links).append(variants).append(additionalProperties).append(storeId).append(productId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Variants) == false) {
            return false;
        }
        Variants rhs = ((Variants) other);
        return new EqualsBuilder().append(totalItems, rhs.totalItems).append(links, rhs.links).append(variants, rhs.variants)
                .append(additionalProperties, rhs.additionalProperties).append(storeId, rhs.storeId).append(productId, rhs.productId).isEquals();
    }

}
