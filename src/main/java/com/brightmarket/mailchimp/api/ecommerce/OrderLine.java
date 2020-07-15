
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
 * Ecommerce Order Lines
 * <p>
 * Information about a specific order line.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "product_id",
    "product_title",
    "product_variant_id",
    "product_variant_title",
    "quantity",
    "price",
    "discount",
    "_links"
})
public class OrderLine implements Serializable
{

    /**
     * Order Line Item Foreign ID
     * <p>
     * A unique identifier for the order line item.
     * (Required)
     *
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A unique identifier for the order line item.")
    private String id;
    /**
     * Order Line Item Product Foreign ID
     * <p>
     * A unique identifier for the product associated with the order line item.
     * (Required)
     *
     */
    @JsonProperty("product_id")
    @JsonPropertyDescription("A unique identifier for the product associated with the order line item.")
    private String productId;
    /**
     * Order Line Item Product Title
     * <p>
     * The name of the product for the order line item.
     *
     */
    @JsonProperty("product_title")
    @JsonPropertyDescription("The name of the product for the order line item.")
    private String productTitle;
    /**
     * Order Line Item Product Variant Foreign ID
     * <p>
     * A unique identifier for the product variant associated with the order line item.
     * (Required)
     *
     */
    @JsonProperty("product_variant_id")
    @JsonPropertyDescription("A unique identifier for the product variant associated with the order line item.")
    private String productVariantId;
    /**
     * Order Line Item Product Variant Title
     * <p>
     * The name of the product variant for the order line item.
     *
     */
    @JsonProperty("product_variant_title")
    @JsonPropertyDescription("The name of the product variant for the order line item.")
    private String productVariantTitle;
    /**
     * Quantity
     * <p>
     * The quantity of an order line item.
     * (Required)
     *
     */
    @JsonProperty("quantity")
    @JsonPropertyDescription("The quantity of an order line item.")
    private Long quantity;
    /**
     * Price
     * <p>
     * The price of an ecommerce order line item.
     * (Required)
     *
     */
    @JsonProperty("price")
    @JsonPropertyDescription("The price of an ecommerce order line item.")
    private Double price;
    /**
     * Discount
     * <p>
     * The total discount amount applied to this line item.
     *
     */
    @JsonProperty("discount")
    @JsonPropertyDescription("The total discount amount applied to this line item.")
    private Double discount;
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
    private final static long serialVersionUID = -6655446360239398220L;

    /**
     * No args constructor for use in serialization
     *
     */
    public OrderLine() {
    }

    /**
     *
     * @param productTitle
     * @param quantity
     * @param productId
     * @param productVariantId
     * @param price
     * @param discount
     * @param links
     * @param id
     * @param productVariantTitle
     */
    public OrderLine(String id, String productId, String productTitle, String productVariantId, String productVariantTitle, Long quantity, Double price, Double discount, List<Link> links) {
        super();
        this.id = id;
        this.productId = productId;
        this.productTitle = productTitle;
        this.productVariantId = productVariantId;
        this.productVariantTitle = productVariantTitle;
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
        this.links = links;
    }

    /**
     * Order Line Item Foreign ID
     * <p>
     * A unique identifier for the order line item.
     * (Required)
     *
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Order Line Item Foreign ID
     * <p>
     * A unique identifier for the order line item.
     * (Required)
     *
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public OrderLine withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Order Line Item Product Foreign ID
     * <p>
     * A unique identifier for the product associated with the order line item.
     * (Required)
     *
     */
    @JsonProperty("product_id")
    public String getProductId() {
        return productId;
    }

    /**
     * Order Line Item Product Foreign ID
     * <p>
     * A unique identifier for the product associated with the order line item.
     * (Required)
     *
     */
    @JsonProperty("product_id")
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public OrderLine withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * Order Line Item Product Title
     * <p>
     * The name of the product for the order line item.
     *
     */
    @JsonProperty("product_title")
    public String getProductTitle() {
        return productTitle;
    }

    /**
     * Order Line Item Product Title
     * <p>
     * The name of the product for the order line item.
     *
     */
    @JsonProperty("product_title")
    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public OrderLine withProductTitle(String productTitle) {
        this.productTitle = productTitle;
        return this;
    }

    /**
     * Order Line Item Product Variant Foreign ID
     * <p>
     * A unique identifier for the product variant associated with the order line item.
     * (Required)
     *
     */
    @JsonProperty("product_variant_id")
    public String getProductVariantId() {
        return productVariantId;
    }

    /**
     * Order Line Item Product Variant Foreign ID
     * <p>
     * A unique identifier for the product variant associated with the order line item.
     * (Required)
     *
     */
    @JsonProperty("product_variant_id")
    public void setProductVariantId(String productVariantId) {
        this.productVariantId = productVariantId;
    }

    public OrderLine withProductVariantId(String productVariantId) {
        this.productVariantId = productVariantId;
        return this;
    }

    /**
     * Order Line Item Product Variant Title
     * <p>
     * The name of the product variant for the order line item.
     *
     */
    @JsonProperty("product_variant_title")
    public String getProductVariantTitle() {
        return productVariantTitle;
    }

    /**
     * Order Line Item Product Variant Title
     * <p>
     * The name of the product variant for the order line item.
     *
     */
    @JsonProperty("product_variant_title")
    public void setProductVariantTitle(String productVariantTitle) {
        this.productVariantTitle = productVariantTitle;
    }

    public OrderLine withProductVariantTitle(String productVariantTitle) {
        this.productVariantTitle = productVariantTitle;
        return this;
    }

    /**
     * Quantity
     * <p>
     * The quantity of an order line item.
     * (Required)
     *
     */
    @JsonProperty("quantity")
    public Long getQuantity() {
        return quantity;
    }

    /**
     * Quantity
     * <p>
     * The quantity of an order line item.
     * (Required)
     *
     */
    @JsonProperty("quantity")
    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public OrderLine withQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Price
     * <p>
     * The price of an ecommerce order line item.
     * (Required)
     *
     */
    @JsonProperty("price")
    public Double getPrice() {
        return price;
    }

    /**
     * Price
     * <p>
     * The price of an ecommerce order line item.
     * (Required)
     *
     */
    @JsonProperty("price")
    public void setPrice(Double price) {
        this.price = price;
    }

    public OrderLine withPrice(Double price) {
        this.price = price;
        return this;
    }

    /**
     * Discount
     * <p>
     * The total discount amount applied to this line item.
     *
     */
    @JsonProperty("discount")
    public Double getDiscount() {
        return discount;
    }

    /**
     * Discount
     * <p>
     * The total discount amount applied to this line item.
     *
     */
    @JsonProperty("discount")
    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public OrderLine withDiscount(Double discount) {
        this.discount = discount;
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

    public OrderLine withLinks(List<Link> links) {
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

    public OrderLine withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(productTitle).append(quantity).append(productId).append(productVariantId).append(price).append(discount).append(links).append(id).append(additionalProperties).append(productVariantTitle).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrderLine) == false) {
            return false;
        }
        OrderLine rhs = ((OrderLine) other);
        return new EqualsBuilder().append(productTitle, rhs.productTitle).append(quantity, rhs.quantity).append(productId, rhs.productId).append(productVariantId, rhs.productVariantId).append(price, rhs.price).append(discount, rhs.discount).append(links, rhs.links).append(id, rhs.id).append(additionalProperties, rhs.additionalProperties).append(productVariantTitle, rhs.productVariantTitle).isEquals();
    }

}
