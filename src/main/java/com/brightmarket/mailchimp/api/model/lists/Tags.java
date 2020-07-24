
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
 * Tags
 * <p>
 * The tags assigned to this list member.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name"
})
public class Tags implements Serializable {

    /**
     * Tag ID
     * <p>
     * The tag id.
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The tag id.")
    private Long id;
    /**
     * Name
     * <p>
     * The name of the tag
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of the tag")
    private String name;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -887835074543470646L;

    /**
     * No args constructor for use in serialization
     */
    public Tags() {
    }

    /**
     * @param name
     * @param id
     */
    public Tags(Long id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    /**
     * Tag ID
     * <p>
     * The tag id.
     */
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    /**
     * Tag ID
     * <p>
     * The tag id.
     */
    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    public Tags withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Name
     * <p>
     * The name of the tag
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * The name of the tag
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Tags withName(String name) {
        this.name = name;
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

    public Tags withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(id).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tags) == false) {
            return false;
        }
        Tags rhs = ((Tags) other);
        return new EqualsBuilder().append(name, rhs.name).append(id, rhs.id).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
