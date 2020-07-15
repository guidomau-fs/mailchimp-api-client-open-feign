
package com.brightmarket.mailchimp.api.ecommerce;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
 * Abandoned Browse Automation
 * <p>
 * abandonedBrowse automation details. abandonedBrowse is also known as Product Retargeting Email or Retarget Site Visitors on the web.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "is_supported",
    "id",
    "status"
})
public class AbandonedBrowse implements Serializable
{

    /**
     * Is Supported
     * <p>
     * Whether this store supports the abandonedBrowse automation.
     *
     */
    @JsonProperty("is_supported")
    @JsonPropertyDescription("Whether this store supports the abandonedBrowse automation.")
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
     * Status of the abandonedBrowse automation.
     *
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Status of the abandonedBrowse automation.")
    private AbandonedBrowse.Status status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 3190352995834000454L;

    /**
     * No args constructor for use in serialization
     *
     */
    public AbandonedBrowse() {
    }

    /**
     *
     * @param isSupported
     * @param id
     * @param status
     */
    public AbandonedBrowse(Boolean isSupported, String id, AbandonedBrowse.Status status) {
        super();
        this.isSupported = isSupported;
        this.id = id;
        this.status = status;
    }

    /**
     * Is Supported
     * <p>
     * Whether this store supports the abandonedBrowse automation.
     *
     */
    @JsonProperty("is_supported")
    public Boolean getIsSupported() {
        return isSupported;
    }

    /**
     * Is Supported
     * <p>
     * Whether this store supports the abandonedBrowse automation.
     *
     */
    @JsonProperty("is_supported")
    public void setIsSupported(Boolean isSupported) {
        this.isSupported = isSupported;
    }

    public AbandonedBrowse withIsSupported(Boolean isSupported) {
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

    public AbandonedBrowse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Status
     * <p>
     * Status of the abandonedBrowse automation.
     *
     */
    @JsonProperty("status")
    public AbandonedBrowse.Status getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * Status of the abandonedBrowse automation.
     *
     */
    @JsonProperty("status")
    public void setStatus(AbandonedBrowse.Status status) {
        this.status = status;
    }

    public AbandonedBrowse withStatus(AbandonedBrowse.Status status) {
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

    public AbandonedBrowse withAdditionalProperty(String name, Object value) {
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
        if ((other instanceof AbandonedBrowse) == false) {
            return false;
        }
        AbandonedBrowse rhs = ((AbandonedBrowse) other);
        return new EqualsBuilder().append(isSupported, rhs.isSupported).append(id, rhs.id).append(additionalProperties, rhs.additionalProperties).append(status, rhs.status).isEquals();
    }

    public enum Status {

        SAVE("save"),
        SENDING("sending"),
        PAUSED("paused");
        private final String value;
        private final static Map<String, AbandonedBrowse.Status> CONSTANTS = new HashMap<String, AbandonedBrowse.Status>();

        static {
            for (AbandonedBrowse.Status c: values()) {
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
        public static AbandonedBrowse.Status fromValue(String value) {
            AbandonedBrowse.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
