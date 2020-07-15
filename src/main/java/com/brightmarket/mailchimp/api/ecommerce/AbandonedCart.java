
package com.brightmarket.mailchimp.api.ecommerce;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
 * Abandoned Cart Automation
 * <p>
 * abandonedCart automation details.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "is_supported",
    "id",
    "status"
})
public class AbandonedCart implements Serializable
{

    /**
     * Is Supported
     * <p>
     * Whether this store supports the abandonedCart automation.
     *
     */
    @JsonProperty("is_supported")
    @JsonPropertyDescription("Whether this store supports the abandonedCart automation.")
    private Boolean isSupported;
    /**
     * ID
     * <p>
     * Unique ID of automation parent campaign.
     *
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Unique ID of automation parent campaign.")
    private String id;
    /**
     * Status
     * <p>
     * Status of the abandonedCart automation.
     *
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Status of the abandonedCart automation.")
    private AbandonedCart.Status status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -3756695967105085468L;

    /**
     * No args constructor for use in serialization
     *
     */
    public AbandonedCart() {
    }

    /**
     *
     * @param isSupported
     * @param id
     * @param status
     */
    public AbandonedCart(Boolean isSupported, String id, AbandonedCart.Status status) {
        super();
        this.isSupported = isSupported;
        this.id = id;
        this.status = status;
    }

    /**
     * Is Supported
     * <p>
     * Whether this store supports the abandonedCart automation.
     *
     */
    @JsonProperty("is_supported")
    public Boolean getIsSupported() {
        return isSupported;
    }

    /**
     * Is Supported
     * <p>
     * Whether this store supports the abandonedCart automation.
     *
     */
    @JsonProperty("is_supported")
    public void setIsSupported(Boolean isSupported) {
        this.isSupported = isSupported;
    }

    public AbandonedCart withIsSupported(Boolean isSupported) {
        this.isSupported = isSupported;
        return this;
    }

    /**
     * ID
     * <p>
     * Unique ID of automation parent campaign.
     *
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Unique ID of automation parent campaign.
     *
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AbandonedCart withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Status
     * <p>
     * Status of the abandonedCart automation.
     *
     */
    @JsonProperty("status")
    public AbandonedCart.Status getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * Status of the abandonedCart automation.
     *
     */
    @JsonProperty("status")
    public void setStatus(AbandonedCart.Status status) {
        this.status = status;
    }

    public AbandonedCart withStatus(AbandonedCart.Status status) {
        this.status = status;
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

    public AbandonedCart withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(isSupported).append(id).append(additionalProperties).append(status).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AbandonedCart) == false) {
            return false;
        }
        AbandonedCart rhs = ((AbandonedCart) other);
        return new EqualsBuilder().append(isSupported, rhs.isSupported).append(id, rhs.id).append(additionalProperties, rhs.additionalProperties).append(status, rhs.status).isEquals();
    }

    public enum Status {

        SAVE("save"),
        SENDING("sending"),
        PAUSED("paused");
        private final String value;
        private final static Map<String, AbandonedCart.Status> CONSTANTS = new HashMap<String, AbandonedCart.Status>();

        static {
            for (AbandonedCart.Status c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Status(String value) {
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
        public static AbandonedCart.Status fromValue(String value) {
            AbandonedCart.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
