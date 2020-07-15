
package com.brightmarket.mailchimp.api.ecommerce;

import com.brightmarket.mailchimp.api.root.Link;
import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Ecommerce Product Variants
 * <p>
 * Information about a specific product variant.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "title",
    "url",
    "sku",
    "price",
    "pricing",
    "shipping_dimensions",
    "inventory_quantity",
    "image_url",
    "backorders",
    "visibility",
    "created_at",
    "updated_at",
    "_links"
})
public class Variant implements Serializable
{

    /**
     * Product Variant Foreign ID
     * <p>
     * A unique identifier for the product variant.
     * (Required)
     *
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A unique identifier for the product variant.")
    private String id;
    /**
     * Title
     * <p>
     * The title of a product variant.
     * (Required)
     *
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The title of a product variant.")
    private String title;
    /**
     * URL
     * <p>
     * The URL of a product variant.
     *
     */
    @JsonProperty("url")
    @JsonPropertyDescription("The URL of a product variant.")
    private String url;
    /**
     * SKU
     * <p>
     * The stock keeping unit (SKU) of a product variant.
     *
     */
    @JsonProperty("sku")
    @JsonPropertyDescription("The stock keeping unit (SKU) of a product variant.")
    private String sku;
    /**
     * Price
     * <p>
     * The price of a product variant.
     *
     */
    @JsonProperty("price")
    @JsonPropertyDescription("The price of a product variant.")
    private Double price;
    /**
     * Product Pricing
     * <p>
     * An internal field that returns data on the formatting of a products' price based on currency.
     *
     */
    @JsonProperty("pricing")
    @JsonPropertyDescription("An internal field that returns data on the formatting of a products' price based on currency.")
    private Pricing pricing;
    /**
     * E-commerce Product Shipping Dimensions
     * <p>
     * Shipping dimension information about a specific product.
     *
     */
    @JsonProperty("shipping_dimensions")
    @JsonPropertyDescription("Shipping dimension information about a specific product.")
    private ShippingDimensions shippingDimensions;
    /**
     * Inventory Quantity
     * <p>
     * The inventory quantity of a product variant.
     *
     */
    @JsonProperty("inventory_quantity")
    @JsonPropertyDescription("The inventory quantity of a product variant.")
    private Long inventoryQuantity;
    /**
     * Image URL
     * <p>
     * The image URL for a product variant.
     *
     */
    @JsonProperty("image_url")
    @JsonPropertyDescription("The image URL for a product variant.")
    private String imageUrl;
    /**
     * Backorders
     * <p>
     * The backorders of a product variant.
     *
     */
    @JsonProperty("backorders")
    @JsonPropertyDescription("The backorders of a product variant.")
    private String backorders;
    /**
     * Visibility
     * <p>
     * The visibility of a product variant.
     *
     */
    @JsonProperty("visibility")
    @JsonPropertyDescription("The visibility of a product variant.")
    private String visibility;
    /**
     * Creation Time
     * <p>
     * The date and time when the product was created in ISO 8601 format.
     *
     */
    @JsonProperty("created_at")
    @JsonPropertyDescription("The date and time when the product was created in ISO 8601 format.")
    private Date createdAt;
    /**
     * Update Time
     * <p>
     * The date and time the product was last updated in ISO 8601 format.
     *
     */
    @JsonProperty("updated_at")
    @JsonPropertyDescription("The date and time the product was last updated in ISO 8601 format.")
    private Date updatedAt;
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
    private final static long serialVersionUID = 9145371186839549393L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Variant() {
    }

    /**
     *
     * @param visibility
     * @param inventoryQuantity
     * @param title
     * @param url
     * @param createdAt
     * @param backorders
     * @param price
     * @param imageUrl
     * @param links
     * @param id
     * @param shippingDimensions
     * @param sku
     * @param pricing
     * @param updatedAt
     */
    public Variant(String id, String title, String url, String sku, Double price, Pricing pricing, ShippingDimensions shippingDimensions, Long inventoryQuantity, String imageUrl, String backorders, String visibility, Date createdAt, Date updatedAt, List<Link> links) {
        super();
        this.id = id;
        this.title = title;
        this.url = url;
        this.sku = sku;
        this.price = price;
        this.pricing = pricing;
        this.shippingDimensions = shippingDimensions;
        this.inventoryQuantity = inventoryQuantity;
        this.imageUrl = imageUrl;
        this.backorders = backorders;
        this.visibility = visibility;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.links = links;
    }

    /**
     * Product Variant Foreign ID
     * <p>
     * A unique identifier for the product variant.
     * (Required)
     *
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Product Variant Foreign ID
     * <p>
     * A unique identifier for the product variant.
     * (Required)
     *
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Variant withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The title of a product variant.
     * (Required)
     *
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * The title of a product variant.
     * (Required)
     *
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Variant withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * URL
     * <p>
     * The URL of a product variant.
     *
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * URL
     * <p>
     * The URL of a product variant.
     *
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public Variant withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * SKU
     * <p>
     * The stock keeping unit (SKU) of a product variant.
     *
     */
    @JsonProperty("sku")
    public String getSku() {
        return sku;
    }

    /**
     * SKU
     * <p>
     * The stock keeping unit (SKU) of a product variant.
     *
     */
    @JsonProperty("sku")
    public void setSku(String sku) {
        this.sku = sku;
    }

    public Variant withSku(String sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Price
     * <p>
     * The price of a product variant.
     *
     */
    @JsonProperty("price")
    public Double getPrice() {
        return price;
    }

    /**
     * Price
     * <p>
     * The price of a product variant.
     *
     */
    @JsonProperty("price")
    public void setPrice(Double price) {
        this.price = price;
    }

    public Variant withPrice(Double price) {
        this.price = price;
        return this;
    }

    /**
     * Product Pricing
     * <p>
     * An internal field that returns data on the formatting of a products' price based on currency.
     *
     */
    @JsonProperty("pricing")
    public Pricing getPricing() {
        return pricing;
    }

    /**
     * Product Pricing
     * <p>
     * An internal field that returns data on the formatting of a products' price based on currency.
     *
     */
    @JsonProperty("pricing")
    public void setPricing(Pricing pricing) {
        this.pricing = pricing;
    }

    public Variant withPricing(Pricing pricing) {
        this.pricing = pricing;
        return this;
    }

    /**
     * E-commerce Product Shipping Dimensions
     * <p>
     * Shipping dimension information about a specific product.
     *
     */
    @JsonProperty("shipping_dimensions")
    public ShippingDimensions getShippingDimensions() {
        return shippingDimensions;
    }

    /**
     * E-commerce Product Shipping Dimensions
     * <p>
     * Shipping dimension information about a specific product.
     *
     */
    @JsonProperty("shipping_dimensions")
    public void setShippingDimensions(ShippingDimensions shippingDimensions) {
        this.shippingDimensions = shippingDimensions;
    }

    public Variant withShippingDimensions(ShippingDimensions shippingDimensions) {
        this.shippingDimensions = shippingDimensions;
        return this;
    }

    /**
     * Inventory Quantity
     * <p>
     * The inventory quantity of a product variant.
     *
     */
    @JsonProperty("inventory_quantity")
    public Long getInventoryQuantity() {
        return inventoryQuantity;
    }

    /**
     * Inventory Quantity
     * <p>
     * The inventory quantity of a product variant.
     *
     */
    @JsonProperty("inventory_quantity")
    public void setInventoryQuantity(Long inventoryQuantity) {
        this.inventoryQuantity = inventoryQuantity;
    }

    public Variant withInventoryQuantity(Long inventoryQuantity) {
        this.inventoryQuantity = inventoryQuantity;
        return this;
    }

    /**
     * Image URL
     * <p>
     * The image URL for a product variant.
     *
     */
    @JsonProperty("image_url")
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Image URL
     * <p>
     * The image URL for a product variant.
     *
     */
    @JsonProperty("image_url")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Variant withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     * Backorders
     * <p>
     * The backorders of a product variant.
     *
     */
    @JsonProperty("backorders")
    public String getBackorders() {
        return backorders;
    }

    /**
     * Backorders
     * <p>
     * The backorders of a product variant.
     *
     */
    @JsonProperty("backorders")
    public void setBackorders(String backorders) {
        this.backorders = backorders;
    }

    public Variant withBackorders(String backorders) {
        this.backorders = backorders;
        return this;
    }

    /**
     * Visibility
     * <p>
     * The visibility of a product variant.
     *
     */
    @JsonProperty("visibility")
    public String getVisibility() {
        return visibility;
    }

    /**
     * Visibility
     * <p>
     * The visibility of a product variant.
     *
     */
    @JsonProperty("visibility")
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public Variant withVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * Creation Time
     * <p>
     * The date and time when the product was created in ISO 8601 format.
     *
     */
    @JsonProperty("created_at")
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * Creation Time
     * <p>
     * The date and time when the product was created in ISO 8601 format.
     *
     */
    @JsonProperty("created_at")
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Variant withCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Update Time
     * <p>
     * The date and time the product was last updated in ISO 8601 format.
     *
     */
    @JsonProperty("updated_at")
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Update Time
     * <p>
     * The date and time the product was last updated in ISO 8601 format.
     *
     */
    @JsonProperty("updated_at")
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Variant withUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
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

    public Variant withLinks(List<Link> links) {
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

    public Variant withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(visibility).append(inventoryQuantity).append(title).append(url).append(createdAt).append(backorders).append(price).append(imageUrl).append(links).append(id).append(shippingDimensions).append(additionalProperties).append(sku).append(pricing).append(updatedAt).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Variant) == false) {
            return false;
        }
        Variant rhs = ((Variant) other);
        return new EqualsBuilder().append(visibility, rhs.visibility).append(inventoryQuantity, rhs.inventoryQuantity).append(title, rhs.title).append(url, rhs.url).append(createdAt, rhs.createdAt).append(backorders, rhs.backorders).append(price, rhs.price).append(imageUrl, rhs.imageUrl).append(links, rhs.links).append(id, rhs.id).append(shippingDimensions, rhs.shippingDimensions).append(additionalProperties, rhs.additionalProperties).append(sku, rhs.sku).append(pricing, rhs.pricing).append(updatedAt, rhs.updatedAt).isEquals();
    }

}
