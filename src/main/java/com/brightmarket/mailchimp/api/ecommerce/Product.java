
package com.brightmarket.mailchimp.api.ecommerce;

import com.brightmarket.mailchimp.api.Link;
import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Ecommerce Products
 * <p>
 * Information about a specific product.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "title",
    "handle",
    "url",
    "description",
    "type",
    "vendor",
    "image_url",
    "pricing",
    "variants",
    "shipping_dimensions",
    "images",
    "published_at_foreign",
    "_links"
})
public class Product implements Serializable
{

    /**
     * Product Foreign ID
     * <p>
     * A unique identifier for the product.
     * (Required)
     *
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A unique identifier for the product.")
    private String id;
    /**
     * Title
     * <p>
     * The title of a product.
     * (Required)
     *
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The title of a product.")
    private String title;
    /**
     * Handle
     * <p>
     * The handle of a product.
     *
     */
    @JsonProperty("handle")
    @JsonPropertyDescription("The handle of a product.")
    private String handle;
    /**
     * Product URL
     * <p>
     * The URL of a product.
     *
     */
    @JsonProperty("url")
    @JsonPropertyDescription("The URL of a product.")
    private String url;
    /**
     * Description
     * <p>
     * The description of a product.
     *
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of a product.")
    private String description;
    /**
     * Type
     * <p>
     * The type of product.
     *
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of product.")
    private String type;
    /**
     * Vendor
     * <p>
     * The vendor for a product.
     *
     */
    @JsonProperty("vendor")
    @JsonPropertyDescription("The vendor for a product.")
    private String vendor;
    /**
     * Product Image URL
     * <p>
     * The image URL for a product.
     *
     */
    @JsonProperty("image_url")
    @JsonPropertyDescription("The image URL for a product.")
    private String imageUrl;
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
     * Product Variants
     * <p>
     * An array of the product's variants.
     * (Required)
     *
     */
    @JsonProperty("variants")
    @JsonPropertyDescription("An array of the product's variants.")
    private List<Variant> variants = null;
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
     * Product Images
     * <p>
     * An array of the product's images.
     *
     */
    @JsonProperty("images")
    @JsonPropertyDescription("An array of the product's images.")
    private List<Image> images = null;
    /**
     * Foreign Publish Time
     * <p>
     * The date and time when the product was published in ISO 8601 format.
     *
     */
    @JsonProperty("published_at_foreign")
    @JsonPropertyDescription("The date and time when the product was published in ISO 8601 format.")
    private Date publishedAtForeign;
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
    private final static long serialVersionUID = 8338507743969190944L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Product() {
    }

    /**
     *
     * @param images
     * @param description
     * @param handle
     * @param variants
     * @param title
     * @param type
     * @param url
     * @param publishedAtForeign
     * @param vendor
     * @param imageUrl
     * @param links
     * @param id
     * @param shippingDimensions
     * @param pricing
     */
    public Product(String id, String title, String handle, String url, String description, String type, String vendor, String imageUrl, Pricing pricing, List<Variant> variants, ShippingDimensions shippingDimensions, List<Image> images, Date publishedAtForeign, List<Link> links) {
        super();
        this.id = id;
        this.title = title;
        this.handle = handle;
        this.url = url;
        this.description = description;
        this.type = type;
        this.vendor = vendor;
        this.imageUrl = imageUrl;
        this.pricing = pricing;
        this.variants = variants;
        this.shippingDimensions = shippingDimensions;
        this.images = images;
        this.publishedAtForeign = publishedAtForeign;
        this.links = links;
    }

    /**
     * Product Foreign ID
     * <p>
     * A unique identifier for the product.
     * (Required)
     *
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Product Foreign ID
     * <p>
     * A unique identifier for the product.
     * (Required)
     *
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Product withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The title of a product.
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
     * The title of a product.
     * (Required)
     *
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Product withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Handle
     * <p>
     * The handle of a product.
     *
     */
    @JsonProperty("handle")
    public String getHandle() {
        return handle;
    }

    /**
     * Handle
     * <p>
     * The handle of a product.
     *
     */
    @JsonProperty("handle")
    public void setHandle(String handle) {
        this.handle = handle;
    }

    public Product withHandle(String handle) {
        this.handle = handle;
        return this;
    }

    /**
     * Product URL
     * <p>
     * The URL of a product.
     *
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * Product URL
     * <p>
     * The URL of a product.
     *
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public Product withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of a product.
     *
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of a product.
     *
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Product withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Type
     * <p>
     * The type of product.
     *
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of product.
     *
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Product withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Vendor
     * <p>
     * The vendor for a product.
     *
     */
    @JsonProperty("vendor")
    public String getVendor() {
        return vendor;
    }

    /**
     * Vendor
     * <p>
     * The vendor for a product.
     *
     */
    @JsonProperty("vendor")
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public Product withVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    /**
     * Product Image URL
     * <p>
     * The image URL for a product.
     *
     */
    @JsonProperty("image_url")
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Product Image URL
     * <p>
     * The image URL for a product.
     *
     */
    @JsonProperty("image_url")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Product withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
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

    public Product withPricing(Pricing pricing) {
        this.pricing = pricing;
        return this;
    }

    /**
     * Product Variants
     * <p>
     * An array of the product's variants.
     * (Required)
     *
     */
    @JsonProperty("variants")
    public List<Variant> getVariants() {
        return variants;
    }

    /**
     * Product Variants
     * <p>
     * An array of the product's variants.
     * (Required)
     *
     */
    @JsonProperty("variants")
    public void setVariants(List<Variant> variants) {
        this.variants = variants;
    }

    public Product withVariants(List<Variant> variants) {
        this.variants = variants;
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

    public Product withShippingDimensions(ShippingDimensions shippingDimensions) {
        this.shippingDimensions = shippingDimensions;
        return this;
    }

    /**
     * Product Images
     * <p>
     * An array of the product's images.
     *
     */
    @JsonProperty("images")
    public List<Image> getImages() {
        return images;
    }

    /**
     * Product Images
     * <p>
     * An array of the product's images.
     *
     */
    @JsonProperty("images")
    public void setImages(List<Image> images) {
        this.images = images;
    }

    public Product withImages(List<Image> images) {
        this.images = images;
        return this;
    }

    /**
     * Foreign Publish Time
     * <p>
     * The date and time when the product was published in ISO 8601 format.
     *
     */
    @JsonProperty("published_at_foreign")
    public Date getPublishedAtForeign() {
        return publishedAtForeign;
    }

    /**
     * Foreign Publish Time
     * <p>
     * The date and time when the product was published in ISO 8601 format.
     *
     */
    @JsonProperty("published_at_foreign")
    public void setPublishedAtForeign(Date publishedAtForeign) {
        this.publishedAtForeign = publishedAtForeign;
    }

    public Product withPublishedAtForeign(Date publishedAtForeign) {
        this.publishedAtForeign = publishedAtForeign;
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

    public Product withLinks(List<Link> links) {
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

    public Product withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(images).append(description).append(handle).append(variants).append(title).append(type).append(url).append(publishedAtForeign).append(vendor).append(imageUrl).append(links).append(id).append(shippingDimensions).append(additionalProperties).append(pricing).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Product) == false) {
            return false;
        }
        Product rhs = ((Product) other);
        return new EqualsBuilder().append(images, rhs.images).append(description, rhs.description).append(handle, rhs.handle).append(variants, rhs.variants).append(title, rhs.title).append(type, rhs.type).append(url, rhs.url).append(publishedAtForeign, rhs.publishedAtForeign).append(vendor, rhs.vendor).append(imageUrl, rhs.imageUrl).append(links, rhs.links).append(id, rhs.id).append(shippingDimensions, rhs.shippingDimensions).append(additionalProperties, rhs.additionalProperties).append(pricing, rhs.pricing).isEquals();
    }

}
