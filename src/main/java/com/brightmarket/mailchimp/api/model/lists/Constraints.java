
package com.brightmarket.mailchimp.api.model.lists;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
 * Collection Authorization
 * <p>
 * Do particular authorization constraints around this collection limit creation of new instances?
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "may_create",
    "max_instances",
    "current_total_instances"
})
public class Constraints implements Serializable
{

    /**
     * Resource creation authorization
     * <p>
     * May the user create additional instances of this resource?
     * (Required)
     *
     */
    @JsonProperty("may_create")
    @JsonPropertyDescription("May the user create additional instances of this resource?")
    private Boolean mayCreate;
    /**
     * Max instances
     * <p>
     * How many total instances of this resource are allowed? This is independent of any filter conditions applied to the query. As a special case, -1 indicates unlimited.
     * (Required)
     *
     */
    @JsonProperty("max_instances")
    @JsonPropertyDescription("How many total instances of this resource are allowed? This is independent of any filter conditions applied to the query. As a special case, -1 indicates unlimited.")
    private Long maxInstances;
    /**
     * Current total instances
     * <p>
     * How many total instances of this resource are already in use? This is independent of any filter conditions applied to the query. Value may be larger than max_instances. As a special case, -1 is returned when access is unlimited.
     *
     */
    @JsonProperty("current_total_instances")
    @JsonPropertyDescription("How many total instances of this resource are already in use? This is independent of any filter conditions applied to the query. Value may be larger than max_instances. As a special case, -1 is returned when access is unlimited.")
    private Long currentTotalInstances;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6198643504929312377L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Constraints() {
    }

    /**
     *
     * @param mayCreate
     * @param currentTotalInstances
     * @param maxInstances
     */
    public Constraints(Boolean mayCreate, Long maxInstances, Long currentTotalInstances) {
        super();
        this.mayCreate = mayCreate;
        this.maxInstances = maxInstances;
        this.currentTotalInstances = currentTotalInstances;
    }

    /**
     * Resource creation authorization
     * <p>
     * May the user create additional instances of this resource?
     * (Required)
     *
     */
    @JsonProperty("may_create")
    public Boolean getMayCreate() {
        return mayCreate;
    }

    /**
     * Resource creation authorization
     * <p>
     * May the user create additional instances of this resource?
     * (Required)
     *
     */
    @JsonProperty("may_create")
    public void setMayCreate(Boolean mayCreate) {
        this.mayCreate = mayCreate;
    }

    public Constraints withMayCreate(Boolean mayCreate) {
        this.mayCreate = mayCreate;
        return this;
    }

    /**
     * Max instances
     * <p>
     * How many total instances of this resource are allowed? This is independent of any filter conditions applied to the query. As a special case, -1 indicates unlimited.
     * (Required)
     *
     */
    @JsonProperty("max_instances")
    public Long getMaxInstances() {
        return maxInstances;
    }

    /**
     * Max instances
     * <p>
     * How many total instances of this resource are allowed? This is independent of any filter conditions applied to the query. As a special case, -1 indicates unlimited.
     * (Required)
     *
     */
    @JsonProperty("max_instances")
    public void setMaxInstances(Long maxInstances) {
        this.maxInstances = maxInstances;
    }

    public Constraints withMaxInstances(Long maxInstances) {
        this.maxInstances = maxInstances;
        return this;
    }

    /**
     * Current total instances
     * <p>
     * How many total instances of this resource are already in use? This is independent of any filter conditions applied to the query. Value may be larger than max_instances. As a special case, -1 is returned when access is unlimited.
     *
     */
    @JsonProperty("current_total_instances")
    public Long getCurrentTotalInstances() {
        return currentTotalInstances;
    }

    /**
     * Current total instances
     * <p>
     * How many total instances of this resource are already in use? This is independent of any filter conditions applied to the query. Value may be larger than max_instances. As a special case, -1 is returned when access is unlimited.
     *
     */
    @JsonProperty("current_total_instances")
    public void setCurrentTotalInstances(Long currentTotalInstances) {
        this.currentTotalInstances = currentTotalInstances;
    }

    public Constraints withCurrentTotalInstances(Long currentTotalInstances) {
        this.currentTotalInstances = currentTotalInstances;
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

    public Constraints withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(mayCreate).append(currentTotalInstances).append(additionalProperties).append(maxInstances).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Constraints) == false) {
            return false;
        }
        Constraints rhs = ((Constraints) other);
        return new EqualsBuilder().append(mayCreate, rhs.mayCreate).append(currentTotalInstances, rhs.currentTotalInstances).append(additionalProperties, rhs.additionalProperties).append(maxInstances, rhs.maxInstances).isEquals();
    }

}
