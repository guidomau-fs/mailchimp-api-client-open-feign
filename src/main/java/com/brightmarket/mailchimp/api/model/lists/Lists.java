
package com.brightmarket.mailchimp.api.model.lists;

import com.brightmarket.mailchimp.api.model.Link;
import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
 * Subscriber Lists
 * <p>
 * A collection of subscriber lists associated with this account. Lists contain subscribers who have opted-in to receive correspondence from you or your organization.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "lists",
        "total_items",
        "constraints",
        "_links"
})
public class Lists implements Serializable {

    /**
     * Lists
     * <p>
     * An array of objects, each representing a list resource.
     */
    @JsonProperty("lists")
    @JsonPropertyDescription("An array of objects, each representing a list resource.")
    private java.util.List<List> lists = null;
    /**
     * Item Count
     * <p>
     * The total number of items matching the query, irrespective of pagination.
     */
    @JsonProperty("total_items")
    @JsonPropertyDescription("The total number of items matching the query, irrespective of pagination.")
    private Long totalItems;
    /**
     * Collection Authorization
     * <p>
     * Do particular authorization constraints around this collection limit creation of new instances?
     */
    @JsonProperty("constraints")
    @JsonPropertyDescription("Do particular authorization constraints around this collection limit creation of new instances?")
    private Constraints constraints;
    /**
     * Links
     * <p>
     */
    @JsonProperty("_links")
    @JsonPropertyDescription("")
    private java.util.List<Link> links = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 5271441597743514105L;

    /**
     * No args constructor for use in serialization
     */
    public Lists() {
    }

    /**
     * @param totalItems
     * @param lists
     * @param links
     * @param constraints
     */
    public Lists(java.util.List<List> lists, Long totalItems, Constraints constraints, java.util.List<Link> links) {
        super();
        this.lists = lists;
        this.totalItems = totalItems;
        this.constraints = constraints;
        this.links = links;
    }

    /**
     * Lists
     * <p>
     * An array of objects, each representing a list resource.
     */
    @JsonProperty("lists")
    public java.util.List<List> getLists() {
        return lists;
    }

    /**
     * Lists
     * <p>
     * An array of objects, each representing a list resource.
     */
    @JsonProperty("lists")
    public void setLists(java.util.List<List> lists) {
        this.lists = lists;
    }

    public Lists withLists(java.util.List<List> lists) {
        this.lists = lists;
        return this;
    }

    /**
     * Item Count
     * <p>
     * The total number of items matching the query, irrespective of pagination.
     */
    @JsonProperty("total_items")
    public Long getTotalItems() {
        return totalItems;
    }

    /**
     * Item Count
     * <p>
     * The total number of items matching the query, irrespective of pagination.
     */
    @JsonProperty("total_items")
    public void setTotalItems(Long totalItems) {
        this.totalItems = totalItems;
    }

    public Lists withTotalItems(Long totalItems) {
        this.totalItems = totalItems;
        return this;
    }

    /**
     * Collection Authorization
     * <p>
     * Do particular authorization constraints around this collection limit creation of new instances?
     */
    @JsonProperty("constraints")
    public Constraints getConstraints() {
        return constraints;
    }

    /**
     * Collection Authorization
     * <p>
     * Do particular authorization constraints around this collection limit creation of new instances?
     */
    @JsonProperty("constraints")
    public void setConstraints(Constraints constraints) {
        this.constraints = constraints;
    }

    public Lists withConstraints(Constraints constraints) {
        this.constraints = constraints;
        return this;
    }

    /**
     * Links
     * <p>
     */
    @JsonProperty("_links")
    public java.util.List<Link> getLinks() {
        return links;
    }

    /**
     * Links
     * <p>
     */
    @JsonProperty("_links")
    public void setLinks(java.util.List<Link> links) {
        this.links = links;
    }

    public Lists withLinks(java.util.List<Link> links) {
        this.links = links;
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

    public Lists withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(totalItems).append(links).append(additionalProperties).append(constraints).append(lists).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Lists) == false) {
            return false;
        }
        Lists rhs = ((Lists) other);
        return new EqualsBuilder().append(totalItems, rhs.totalItems).append(links, rhs.links).append(additionalProperties, rhs.additionalProperties).append(constraints, rhs.constraints).append(lists, rhs.lists).isEquals();
    }

}
