
package com.brightmarket.mailchimp.api.model.ecommerce;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
 * E-commerce Product Shipping Dimensions
 * <p>
 * Shipping dimension information about a specific product.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "width",
        "height",
        "length",
        "weight",
        "dimensions_unit",
        "weight_unit"
})
public class ShippingDimensions implements Serializable {

    /**
     * Product Shipping Width
     * <p>
     * The width of the product.
     */
    @JsonProperty("width")
    @JsonPropertyDescription("The width of the product.")
    private Double width;
    /**
     * Product Shipping Height
     * <p>
     * The height of the product.
     */
    @JsonProperty("height")
    @JsonPropertyDescription("The height of the product.")
    private Double height;
    /**
     * Product Shipping Length
     * <p>
     * The length of the product.
     */
    @JsonProperty("length")
    @JsonPropertyDescription("The length of the product.")
    private Double length;
    /**
     * Product Shipping Weight
     * <p>
     * The weight of the product.
     */
    @JsonProperty("weight")
    @JsonPropertyDescription("The weight of the product.")
    private Double weight;
    /**
     * Product Dimensions Unit
     * <p>
     * The unit of measurement for a products dimensions.
     */
    @JsonProperty("dimensions_unit")
    @JsonPropertyDescription("The unit of measurement for a products dimensions.")
    private String dimensionsUnit;
    /**
     * Description
     * <p>
     * The description of a product.
     */
    @JsonProperty("weight_unit")
    @JsonPropertyDescription("The description of a product.")
    private String weightUnit;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -286815751763275353L;

    /**
     * No args constructor for use in serialization
     */
    public ShippingDimensions() {
    }

    /**
     * @param width
     * @param length
     * @param weight
     * @param dimensionsUnit
     * @param height
     * @param weightUnit
     */
    public ShippingDimensions(Double width, Double height, Double length, Double weight, String dimensionsUnit, String weightUnit) {
        super();
        this.width = width;
        this.height = height;
        this.length = length;
        this.weight = weight;
        this.dimensionsUnit = dimensionsUnit;
        this.weightUnit = weightUnit;
    }

    /**
     * Product Shipping Width
     * <p>
     * The width of the product.
     */
    @JsonProperty("width")
    public Double getWidth() {
        return width;
    }

    /**
     * Product Shipping Width
     * <p>
     * The width of the product.
     */
    @JsonProperty("width")
    public void setWidth(Double width) {
        this.width = width;
    }

    public ShippingDimensions withWidth(Double width) {
        this.width = width;
        return this;
    }

    /**
     * Product Shipping Height
     * <p>
     * The height of the product.
     */
    @JsonProperty("height")
    public Double getHeight() {
        return height;
    }

    /**
     * Product Shipping Height
     * <p>
     * The height of the product.
     */
    @JsonProperty("height")
    public void setHeight(Double height) {
        this.height = height;
    }

    public ShippingDimensions withHeight(Double height) {
        this.height = height;
        return this;
    }

    /**
     * Product Shipping Length
     * <p>
     * The length of the product.
     */
    @JsonProperty("length")
    public Double getLength() {
        return length;
    }

    /**
     * Product Shipping Length
     * <p>
     * The length of the product.
     */
    @JsonProperty("length")
    public void setLength(Double length) {
        this.length = length;
    }

    public ShippingDimensions withLength(Double length) {
        this.length = length;
        return this;
    }

    /**
     * Product Shipping Weight
     * <p>
     * The weight of the product.
     */
    @JsonProperty("weight")
    public Double getWeight() {
        return weight;
    }

    /**
     * Product Shipping Weight
     * <p>
     * The weight of the product.
     */
    @JsonProperty("weight")
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public ShippingDimensions withWeight(Double weight) {
        this.weight = weight;
        return this;
    }

    /**
     * Product Dimensions Unit
     * <p>
     * The unit of measurement for a products dimensions.
     */
    @JsonProperty("dimensions_unit")
    public String getDimensionsUnit() {
        return dimensionsUnit;
    }

    /**
     * Product Dimensions Unit
     * <p>
     * The unit of measurement for a products dimensions.
     */
    @JsonProperty("dimensions_unit")
    public void setDimensionsUnit(String dimensionsUnit) {
        this.dimensionsUnit = dimensionsUnit;
    }

    public ShippingDimensions withDimensionsUnit(String dimensionsUnit) {
        this.dimensionsUnit = dimensionsUnit;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of a product.
     */
    @JsonProperty("weight_unit")
    public String getWeightUnit() {
        return weightUnit;
    }

    /**
     * Description
     * <p>
     * The description of a product.
     */
    @JsonProperty("weight_unit")
    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    public ShippingDimensions withWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
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

    public ShippingDimensions withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(width).append(length).append(weight).append(dimensionsUnit).append(additionalProperties).append(height).append(weightUnit).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ShippingDimensions) == false) {
            return false;
        }
        ShippingDimensions rhs = ((ShippingDimensions) other);
        return new EqualsBuilder().append(width, rhs.width).append(length, rhs.length).append(weight, rhs.weight).append(dimensionsUnit, rhs.dimensionsUnit).append(additionalProperties, rhs.additionalProperties).append(height, rhs.height).append(weightUnit, rhs.weightUnit).isEquals();
    }

}
