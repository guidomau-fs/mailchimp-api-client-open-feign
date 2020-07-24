
package com.brightmarket.mailchimp.api.model.lists;

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
 * Marketing Permission
 * <p>
 * A single marketing permission a subscriber has either opted-in to or opted-out of.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "marketing_permission_id",
        "text",
        "enabled"
})
public class MarketingPermission implements Serializable {

    /**
     * Marketing Permission ID
     * <p>
     * The id for the marketing permission on the list
     */
    @JsonProperty("marketing_permission_id")
    @JsonPropertyDescription("The id for the marketing permission on the list")
    private String marketingPermissionId;
    /**
     * Marketing Permission Text
     * <p>
     * The text of the marketing permission.
     */
    @JsonProperty("text")
    @JsonPropertyDescription("The text of the marketing permission.")
    private String text;
    /**
     * Enabled
     * <p>
     * If the subscriber has opted-in to the marketing permission.
     */
    @JsonProperty("enabled")
    @JsonPropertyDescription("If the subscriber has opted-in to the marketing permission.")
    private Boolean enabled;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 253426200861181077L;

    /**
     * No args constructor for use in serialization
     */
    public MarketingPermission() {
    }

    /**
     * @param marketingPermissionId
     * @param text
     * @param enabled
     */
    public MarketingPermission(String marketingPermissionId, String text, Boolean enabled) {
        super();
        this.marketingPermissionId = marketingPermissionId;
        this.text = text;
        this.enabled = enabled;
    }

    /**
     * Marketing Permission ID
     * <p>
     * The id for the marketing permission on the list
     */
    @JsonProperty("marketing_permission_id")
    public String getMarketingPermissionId() {
        return marketingPermissionId;
    }

    /**
     * Marketing Permission ID
     * <p>
     * The id for the marketing permission on the list
     */
    @JsonProperty("marketing_permission_id")
    public void setMarketingPermissionId(String marketingPermissionId) {
        this.marketingPermissionId = marketingPermissionId;
    }

    public MarketingPermission withMarketingPermissionId(String marketingPermissionId) {
        this.marketingPermissionId = marketingPermissionId;
        return this;
    }

    /**
     * Marketing Permission Text
     * <p>
     * The text of the marketing permission.
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * Marketing Permission Text
     * <p>
     * The text of the marketing permission.
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    public MarketingPermission withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Enabled
     * <p>
     * If the subscriber has opted-in to the marketing permission.
     */
    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Enabled
     * <p>
     * If the subscriber has opted-in to the marketing permission.
     */
    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public MarketingPermission withEnabled(Boolean enabled) {
        this.enabled = enabled;
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

    public MarketingPermission withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(marketingPermissionId).append(text).append(additionalProperties).append(enabled).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MarketingPermission) == false) {
            return false;
        }
        MarketingPermission rhs = ((MarketingPermission) other);
        return new EqualsBuilder().append(marketingPermissionId, rhs.marketingPermissionId).append(text, rhs.text).append(additionalProperties, rhs.additionalProperties).append(enabled, rhs.enabled).isEquals();
    }

}
