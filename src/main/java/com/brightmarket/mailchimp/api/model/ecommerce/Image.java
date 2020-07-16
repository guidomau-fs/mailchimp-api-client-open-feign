
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
 * Ecommerce Product Images
 * <p>
 * Information about a specific product image.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "url",
    "variant_ids",
    "_links"
})
public class Image implements Serializable
{

    /**
     * Image Foreign ID
     * <p>
     * A unique identifier for the product image.
     * (Required)
     *
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A unique identifier for the product image.")
    private String id;
    /**
     * URL
     * <p>
     * The URL of a product image.
     * (Required)
     *
     */
    @JsonProperty("url")
    @JsonPropertyDescription("The URL of a product image.")
    private String url;
    /**
     * Product Variants
     * <p>
     * The list of product variants using the image.
     *
     */
    @JsonProperty("variant_ids")
    @JsonPropertyDescription("The list of product variants using the image.")
    private List<Object> variantIds = null;
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
    private final static long serialVersionUID = -8528967383646374110L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Image() {
    }

    /**
     *
     * @param variantIds
     * @param links
     * @param id
     * @param url
     */
    public Image(String id, String url, List<Object> variantIds, List<Link> links) {
        super();
        this.id = id;
        this.url = url;
        this.variantIds = variantIds;
        this.links = links;
    }

    /**
     * Image Foreign ID
     * <p>
     * A unique identifier for the product image.
     * (Required)
     *
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Image Foreign ID
     * <p>
     * A unique identifier for the product image.
     * (Required)
     *
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Image withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * URL
     * <p>
     * The URL of a product image.
     * (Required)
     *
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * URL
     * <p>
     * The URL of a product image.
     * (Required)
     *
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public Image withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Product Variants
     * <p>
     * The list of product variants using the image.
     *
     */
    @JsonProperty("variant_ids")
    public List<Object> getVariantIds() {
        return variantIds;
    }

    /**
     * Product Variants
     * <p>
     * The list of product variants using the image.
     *
     */
    @JsonProperty("variant_ids")
    public void setVariantIds(List<Object> variantIds) {
        this.variantIds = variantIds;
    }

    public Image withVariantIds(List<Object> variantIds) {
        this.variantIds = variantIds;
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

    public Image withLinks(List<Link> links) {
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

    public Image withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(links).append(id).append(additionalProperties).append(variantIds).append(url).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Image) == false) {
            return false;
        }
        Image rhs = ((Image) other);
        return new EqualsBuilder().append(links, rhs.links).append(id, rhs.id).append(additionalProperties, rhs.additionalProperties).append(variantIds, rhs.variantIds).append(url, rhs.url).isEquals();
    }

}
