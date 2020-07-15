
package com.brightmarket.mailchimp.api.ecommerce.order.cart;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


/**
 * Ecommerce Cart Lines
 * <p>
 * Information about a specific cart line item.
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
    "price"
})
public class Line implements Serializable
{

    /**
     * Cart Line Item Foreign ID
     * <p>
     * A unique identifier for the cart line item.
     * (Required)
     *
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A unique identifier for the cart line item.")
    private String id;
    /**
     * Cart Line Product Foreign ID
     * <p>
     * A unique identifier for the product associated with the cart line item.
     * (Required)
     *
     */
    @JsonProperty("product_id")
    @JsonPropertyDescription("A unique identifier for the product associated with the cart line item.")
    private String productId;
    /**
     * Cart Line Product Title
     * <p>
     * The name of the product for the cart line item.
     *
     */
    @JsonProperty("product_title")
    @JsonPropertyDescription("The name of the product for the cart line item.")
    private String productTitle;
    /**
     * Cart Line Product Variant Foreign ID
     * <p>
     * A unique identifier for the product variant associated with the cart line item.
     * (Required)
     *
     */
    @JsonProperty("product_variant_id")
    @JsonPropertyDescription("A unique identifier for the product variant associated with the cart line item.")
    private String productVariantId;
    /**
     * Cart Line Product Variant Title
     * <p>
     * The name of the product variant for the cart line item.
     *
     */
    @JsonProperty("product_variant_title")
    @JsonPropertyDescription("The name of the product variant for the cart line item.")
    private String productVariantTitle;
    /**
     * Quantity
     * <p>
     * The quantity of a cart line item.
     * (Required)
     *
     */
    @JsonProperty("quantity")
    @JsonPropertyDescription("The quantity of a cart line item.")
    private Long quantity;
    /**
     * Price
     * <p>
     * The price of a cart line item.
     * (Required)
     *
     */
    @JsonProperty("price")
    @JsonPropertyDescription("The price of a cart line item.")
    private Double price;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -1942711957075985046L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Line() {
    }

    /**
     *
     * @param productTitle
     * @param quantity
     * @param productId
     * @param productVariantId
     * @param price
     * @param id
     * @param productVariantTitle
     */
    public Line(String id, String productId, String productTitle, String productVariantId, String productVariantTitle, Long quantity, Double price) {
        super();
        this.id = id;
        this.productId = productId;
        this.productTitle = productTitle;
        this.productVariantId = productVariantId;
        this.productVariantTitle = productVariantTitle;
        this.quantity = quantity;
        this.price = price;
    }

    /**
     * Cart Line Item Foreign ID
     * <p>
     * A unique identifier for the cart line item.
     * (Required)
     *
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Cart Line Item Foreign ID
     * <p>
     * A unique identifier for the cart line item.
     * (Required)
     *
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Line withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Cart Line Product Foreign ID
     * <p>
     * A unique identifier for the product associated with the cart line item.
     * (Required)
     *
     */
    @JsonProperty("product_id")
    public String getProductId() {
        return productId;
    }

    /**
     * Cart Line Product Foreign ID
     * <p>
     * A unique identifier for the product associated with the cart line item.
     * (Required)
     *
     */
    @JsonProperty("product_id")
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Line withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * Cart Line Product Title
     * <p>
     * The name of the product for the cart line item.
     *
     */
    @JsonProperty("product_title")
    public String getProductTitle() {
        return productTitle;
    }

    /**
     * Cart Line Product Title
     * <p>
     * The name of the product for the cart line item.
     *
     */
    @JsonProperty("product_title")
    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public Line withProductTitle(String productTitle) {
        this.productTitle = productTitle;
        return this;
    }

    /**
     * Cart Line Product Variant Foreign ID
     * <p>
     * A unique identifier for the product variant associated with the cart line item.
     * (Required)
     *
     */
    @JsonProperty("product_variant_id")
    public String getProductVariantId() {
        return productVariantId;
    }

    /**
     * Cart Line Product Variant Foreign ID
     * <p>
     * A unique identifier for the product variant associated with the cart line item.
     * (Required)
     *
     */
    @JsonProperty("product_variant_id")
    public void setProductVariantId(String productVariantId) {
        this.productVariantId = productVariantId;
    }

    public Line withProductVariantId(String productVariantId) {
        this.productVariantId = productVariantId;
        return this;
    }

    /**
     * Cart Line Product Variant Title
     * <p>
     * The name of the product variant for the cart line item.
     *
     */
    @JsonProperty("product_variant_title")
    public String getProductVariantTitle() {
        return productVariantTitle;
    }

    /**
     * Cart Line Product Variant Title
     * <p>
     * The name of the product variant for the cart line item.
     *
     */
    @JsonProperty("product_variant_title")
    public void setProductVariantTitle(String productVariantTitle) {
        this.productVariantTitle = productVariantTitle;
    }

    public Line withProductVariantTitle(String productVariantTitle) {
        this.productVariantTitle = productVariantTitle;
        return this;
    }

    /**
     * Quantity
     * <p>
     * The quantity of a cart line item.
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
     * The quantity of a cart line item.
     * (Required)
     *
     */
    @JsonProperty("quantity")
    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Line withQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Price
     * <p>
     * The price of a cart line item.
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
     * The price of a cart line item.
     * (Required)
     *
     */
    @JsonProperty("price")
    public void setPrice(Double price) {
        this.price = price;
    }

    public Line withPrice(Double price) {
        this.price = price;
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

    public Line withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(productTitle).append(quantity).append(productId).append(productVariantId).append(price).append(id).append(additionalProperties).append(productVariantTitle).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Line) == false) {
            return false;
        }
        Line rhs = ((Line) other);
        return new EqualsBuilder().append(productTitle, rhs.productTitle).append(quantity, rhs.quantity).append(productId, rhs.productId).append(productVariantId, rhs.productVariantId).append(price, rhs.price).append(id, rhs.id).append(additionalProperties, rhs.additionalProperties).append(productVariantTitle, rhs.productVariantTitle).isEquals();
    }

}
