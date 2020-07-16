package com.brightmarket.mailchimp.api.model.error;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Error Cause Response
 * <p>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "field",
        "message"
})
public class Cause implements Serializable {

    @JsonProperty("field")
    @JsonPropertyDescription("Field that causes the error.")
    private String field;

    @JsonProperty("message")
    @JsonPropertyDescription("Cause message.")
    private String message;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Cause() {
        super();
    }

    public Cause(String field, String message) {
        super();
        this.field = field;
        this.message = message;
    }

    @JsonProperty("field")
    public String getField() {
        return field;
    }

    @JsonProperty("field")
    public void setField(String field) {
        this.field = field;
    }

    public Cause withField(String field) {
        this.field = field;
        return this;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    public Cause withMessage(String message) {
        this.message = message;
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

    public Cause withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(field).append(message).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Cause) == false) {
            return false;
        }
        Cause rhs = ((Cause) other);
        return new EqualsBuilder().append(field, rhs.field).append(message, rhs.message).isEquals();
    }
}
