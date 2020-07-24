
package com.brightmarket.mailchimp.api.model.lists;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


/**
 * Subscriber Interests
 * <p>
 * The key of this object's properties is the ID of the interest in question.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({

})
public class Interests implements Serializable {

    @JsonIgnore
    private Map<String, Boolean> additionalProperties = new HashMap<String, Boolean>();
    private final static long serialVersionUID = -1707838543600159162L;

    @JsonAnyGetter
    public Map<String, Boolean> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Boolean value) {
        this.additionalProperties.put(name, value);
    }

    public Interests withAdditionalProperty(String name, Boolean value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Interests) == false) {
            return false;
        }
        Interests rhs = ((Interests) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
