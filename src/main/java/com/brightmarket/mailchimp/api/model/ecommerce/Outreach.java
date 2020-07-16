
package com.brightmarket.mailchimp.api.model.ecommerce;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


/**
 * Outreach
 * <p>
 * The outreach associated with this order. For example, an email campaign or Facebook ad.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "published_time"
})
public class Outreach implements Serializable
{

    /**
     * Outreach ID
     * <p>
     * A unique identifier for the outreach. Can be an email campaign ID.
     *
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A unique identifier for the outreach. Can be an email campaign ID.")
    private String id;
    /**
     * Outreach name
     * <p>
     * The name for the outreach.
     *
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name for the outreach.")
    private String name;
    /**
     * Outreach published time
     * <p>
     * The date and time the Outreach was published in ISO 8601 format.
     *
     */
    @JsonProperty("published_time")
    @JsonPropertyDescription("The date and time the Outreach was published in ISO 8601 format.")
    private Date publishedTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6644574985719095899L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Outreach() {
    }

    /**
     *
     * @param publishedTime
     * @param name
     * @param id
     */
    public Outreach(String id, String name, Date publishedTime) {
        super();
        this.id = id;
        this.name = name;
        this.publishedTime = publishedTime;
    }

    /**
     * Outreach ID
     * <p>
     * A unique identifier for the outreach. Can be an email campaign ID.
     *
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Outreach ID
     * <p>
     * A unique identifier for the outreach. Can be an email campaign ID.
     *
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Outreach withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Outreach name
     * <p>
     * The name for the outreach.
     *
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Outreach name
     * <p>
     * The name for the outreach.
     *
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Outreach withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Outreach published time
     * <p>
     * The date and time the Outreach was published in ISO 8601 format.
     *
     */
    @JsonProperty("published_time")
    public Date getPublishedTime() {
        return publishedTime;
    }

    /**
     * Outreach published time
     * <p>
     * The date and time the Outreach was published in ISO 8601 format.
     *
     */
    @JsonProperty("published_time")
    public void setPublishedTime(Date publishedTime) {
        this.publishedTime = publishedTime;
    }

    public Outreach withPublishedTime(Date publishedTime) {
        this.publishedTime = publishedTime;
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

    public Outreach withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(id).append(additionalProperties).append(publishedTime).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Outreach) == false) {
            return false;
        }
        Outreach rhs = ((Outreach) other);
        return new EqualsBuilder().append(name, rhs.name).append(id, rhs.id).append(additionalProperties, rhs.additionalProperties).append(publishedTime, rhs.publishedTime).isEquals();
    }

}
