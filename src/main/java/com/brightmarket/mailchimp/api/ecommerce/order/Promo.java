
package com.brightmarket.mailchimp.api.ecommerce.order;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code",
    "amount_discounted",
    "type"
})
public class Promo implements Serializable
{

    /**
     * Code
     * <p>
     * The Promo Code
     * (Required)
     *
     */
    @JsonProperty("code")
    @JsonPropertyDescription("The Promo Code")
    private String code;
    /**
     * Amount Discounted
     * <p>
     * The amount of discount applied on the total price. For example if the total cost was $100 and the customer paid $95.5, amount_discounted will be 4.5 For free shipping set amount_discounted to 0
     * (Required)
     *
     */
    @JsonProperty("amount_discounted")
    @JsonPropertyDescription("The amount of discount applied on the total price. For example if the total cost was $100 and the customer paid $95.5, amount_discounted will be 4.5 For free shipping set amount_discounted to 0")
    private Double amountDiscounted;
    /**
     * Type
     * <p>
     * Type of discount. For free shipping set type to fixed
     * (Required)
     *
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type of discount. For free shipping set type to fixed")
    private Promo.Type type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -3479291522022105843L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Promo() {
    }

    /**
     *
     * @param code
     * @param type
     * @param amountDiscounted
     */
    public Promo(String code, Double amountDiscounted, Promo.Type type) {
        super();
        this.code = code;
        this.amountDiscounted = amountDiscounted;
        this.type = type;
    }

    /**
     * Code
     * <p>
     * The Promo Code
     * (Required)
     *
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * The Promo Code
     * (Required)
     *
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public Promo withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Amount Discounted
     * <p>
     * The amount of discount applied on the total price. For example if the total cost was $100 and the customer paid $95.5, amount_discounted will be 4.5 For free shipping set amount_discounted to 0
     * (Required)
     *
     */
    @JsonProperty("amount_discounted")
    public Double getAmountDiscounted() {
        return amountDiscounted;
    }

    /**
     * Amount Discounted
     * <p>
     * The amount of discount applied on the total price. For example if the total cost was $100 and the customer paid $95.5, amount_discounted will be 4.5 For free shipping set amount_discounted to 0
     * (Required)
     *
     */
    @JsonProperty("amount_discounted")
    public void setAmountDiscounted(Double amountDiscounted) {
        this.amountDiscounted = amountDiscounted;
    }

    public Promo withAmountDiscounted(Double amountDiscounted) {
        this.amountDiscounted = amountDiscounted;
        return this;
    }

    /**
     * Type
     * <p>
     * Type of discount. For free shipping set type to fixed
     * (Required)
     *
     */
    @JsonProperty("type")
    public Promo.Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * Type of discount. For free shipping set type to fixed
     * (Required)
     *
     */
    @JsonProperty("type")
    public void setType(Promo.Type type) {
        this.type = type;
    }

    public Promo withType(Promo.Type type) {
        this.type = type;
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

    public Promo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(code).append(additionalProperties).append(type).append(amountDiscounted).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Promo) == false) {
            return false;
        }
        Promo rhs = ((Promo) other);
        return new EqualsBuilder().append(code, rhs.code).append(additionalProperties, rhs.additionalProperties).append(type, rhs.type).append(amountDiscounted, rhs.amountDiscounted).isEquals();
    }

    public enum Type {

        FIXED("fixed"),
        PERCENTAGE("percentage");
        private final String value;
        private final static Map<String, Promo.Type> CONSTANTS = new HashMap<String, Promo.Type>();

        static {
            for (Promo.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Type(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Promo.Type fromValue(String value) {
            Promo.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
