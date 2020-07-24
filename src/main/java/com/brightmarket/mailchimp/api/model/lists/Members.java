
package com.brightmarket.mailchimp.api.model.lists;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.brightmarket.mailchimp.api.model.Link;
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
 * List Members
 * <p>
 * Individuals who are currently or have been previously suscribed to this list, including members who have bounced or unsubscribed.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "members",
        "list_id",
        "total_items",
        "_links"
})
public class Members implements Serializable {

    /**
     * Members
     * <p>
     * An array of objects, each representing a member resource.
     */
    @JsonProperty("members")
    @JsonPropertyDescription("An array of objects, each representing a member resource.")
    private List<Member> members = null;
    /**
     * List ID
     * <p>
     * The list id.
     */
    @JsonProperty("list_id")
    @JsonPropertyDescription("The list id.")
    private String listId;
    /**
     * Item Count
     * <p>
     * The total number of items matching the query, irrespective of pagination.
     */
    @JsonProperty("total_items")
    @JsonPropertyDescription("The total number of items matching the query, irrespective of pagination.")
    private Long totalItems;
    /**
     * Links
     * <p>
     */
    @JsonProperty("_links")
    @JsonPropertyDescription("")
    private List<Link> links = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -2795429868200188619L;

    /**
     * No args constructor for use in serialization
     */
    public Members() {
    }

    /**
     * @param listId
     * @param totalItems
     * @param members
     * @param links
     */
    public Members(List<Member> members, String listId, Long totalItems, List<Link> links) {
        super();
        this.members = members;
        this.listId = listId;
        this.totalItems = totalItems;
        this.links = links;
    }

    /**
     * Members
     * <p>
     * An array of objects, each representing a member resource.
     */
    @JsonProperty("members")
    public List<Member> getMembers() {
        return members;
    }

    /**
     * Members
     * <p>
     * An array of objects, each representing a member resource.
     */
    @JsonProperty("members")
    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public Members withMembers(List<Member> members) {
        this.members = members;
        return this;
    }

    /**
     * List ID
     * <p>
     * The list id.
     */
    @JsonProperty("list_id")
    public String getListId() {
        return listId;
    }

    /**
     * List ID
     * <p>
     * The list id.
     */
    @JsonProperty("list_id")
    public void setListId(String listId) {
        this.listId = listId;
    }

    public Members withListId(String listId) {
        this.listId = listId;
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

    public Members withTotalItems(Long totalItems) {
        this.totalItems = totalItems;
        return this;
    }

    /**
     * Links
     * <p>
     */
    @JsonProperty("_links")
    public List<Link> getLinks() {
        return links;
    }

    /**
     * Links
     * <p>
     */
    @JsonProperty("_links")
    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public Members withLinks(List<Link> links) {
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

    public Members withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(listId).append(totalItems).append(links).append(additionalProperties).append(members).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Members) == false) {
            return false;
        }
        Members rhs = ((Members) other);
        return new EqualsBuilder().append(listId, rhs.listId).append(totalItems, rhs.totalItems).append(links, rhs.links).append(additionalProperties, rhs.additionalProperties).append(members, rhs.members).isEquals();
    }

}
