
package com.brightmarket.mailchimp.api.ecommerce.order;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.brightmarket.mailchimp.api.Link;
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
 * Ecommerce Customers
 * <p>
 * Information about a specific customer. Orders for existing customers should include only the id parameter in the customer object body.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "email_address",
    "opt_in_status",
    "company",
    "first_name",
    "last_name",
    "orders_count",
    "total_spent",
    "address",
    "created_at",
    "updated_at",
    "_links"
})
public class Customer implements Serializable
{

    /**
     * Customer Foreign ID
     * <p>
     * A unique identifier for the customer.
     * (Required)
     *
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A unique identifier for the customer.")
    private String id;
    /**
     * Email Address
     * <p>
     * The customer's email address.
     *
     */
    @JsonProperty("email_address")
    @JsonPropertyDescription("The customer's email address.")
    private String emailAddress;
    /**
     * Opt-in Status
     * <p>
     * The customer's opt-in status. This value will never overwrite the opt-in status of a pre-existing Mailchimp list member, but will apply to list members that are added through the e-commerce API endpoints.
     *
     */
    @JsonProperty("opt_in_status")
    @JsonPropertyDescription("The customer's opt-in status. This value will never overwrite the opt-in status of a pre-existing Mailchimp list member, but will apply to list members that are added through the e-commerce API endpoints.")
    private Boolean optInStatus;
    /**
     * Company
     * <p>
     * The customer's company.
     *
     */
    @JsonProperty("company")
    @JsonPropertyDescription("The customer's company.")
    private String company;
    /**
     * First Name
     * <p>
     * The customer's first name.
     *
     */
    @JsonProperty("first_name")
    @JsonPropertyDescription("The customer's first name.")
    private String firstName;
    /**
     * Last Name
     * <p>
     * The customer's last name.
     *
     */
    @JsonProperty("last_name")
    @JsonPropertyDescription("The customer's last name.")
    private String lastName;
    /**
     * Orders Count
     * <p>
     * The customer's total order count.
     *
     */
    @JsonProperty("orders_count")
    @JsonPropertyDescription("The customer's total order count.")
    private Long ordersCount;
    /**
     * Total Spent
     * <p>
     * The total amount the customer has spent.
     *
     */
    @JsonProperty("total_spent")
    @JsonPropertyDescription("The total amount the customer has spent.")
    private Double totalSpent;
    /**
     * Address
     * <p>
     * The address associated with an ecommerce customer.
     *
     */
    @JsonProperty("address")
    @JsonPropertyDescription("The address associated with an ecommerce customer.")
    private Address address;
    /**
     * Creation Time
     * <p>
     * The date and time the customer was created in ISO 8601 format.
     *
     */
    @JsonProperty("created_at")
    @JsonPropertyDescription("The date and time the customer was created in ISO 8601 format.")
    private Date createdAt;
    /**
     * Update Time
     * <p>
     * The date and time the customer was last updated in ISO 8601 format.
     *
     */
    @JsonProperty("updated_at")
    @JsonPropertyDescription("The date and time the customer was last updated in ISO 8601 format.")
    private Date updatedAt;
    /**
     * Links
     * <p>
     *
     *
     */
    @JsonProperty("_links")
    @JsonPropertyDescription("")
    private List<Link> links = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -299087273120299585L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Customer() {
    }

    /**
     *
     * @param firstName
     * @param lastName
     * @param createdAt
     * @param emailAddress
     * @param ordersCount
     * @param totalSpent
     * @param address
     * @param optInStatus
     * @param company
     * @param links
     * @param id
     * @param updatedAt
     */
    public Customer(String id, String emailAddress, Boolean optInStatus, String company, String firstName, String lastName, Long ordersCount, Double totalSpent, Address address, Date createdAt, Date updatedAt, List<Link> links) {
        super();
        this.id = id;
        this.emailAddress = emailAddress;
        this.optInStatus = optInStatus;
        this.company = company;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ordersCount = ordersCount;
        this.totalSpent = totalSpent;
        this.address = address;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.links = links;
    }

    /**
     * Customer Foreign ID
     * <p>
     * A unique identifier for the customer.
     * (Required)
     *
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Customer Foreign ID
     * <p>
     * A unique identifier for the customer.
     * (Required)
     *
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Customer withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Email Address
     * <p>
     * The customer's email address.
     *
     */
    @JsonProperty("email_address")
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Email Address
     * <p>
     * The customer's email address.
     *
     */
    @JsonProperty("email_address")
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Customer withEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * Opt-in Status
     * <p>
     * The customer's opt-in status. This value will never overwrite the opt-in status of a pre-existing Mailchimp list member, but will apply to list members that are added through the e-commerce API endpoints.
     *
     */
    @JsonProperty("opt_in_status")
    public Boolean getOptInStatus() {
        return optInStatus;
    }

    /**
     * Opt-in Status
     * <p>
     * The customer's opt-in status. This value will never overwrite the opt-in status of a pre-existing Mailchimp list member, but will apply to list members that are added through the e-commerce API endpoints.
     *
     */
    @JsonProperty("opt_in_status")
    public void setOptInStatus(Boolean optInStatus) {
        this.optInStatus = optInStatus;
    }

    public Customer withOptInStatus(Boolean optInStatus) {
        this.optInStatus = optInStatus;
        return this;
    }

    /**
     * Company
     * <p>
     * The customer's company.
     *
     */
    @JsonProperty("company")
    public String getCompany() {
        return company;
    }

    /**
     * Company
     * <p>
     * The customer's company.
     *
     */
    @JsonProperty("company")
    public void setCompany(String company) {
        this.company = company;
    }

    public Customer withCompany(String company) {
        this.company = company;
        return this;
    }

    /**
     * First Name
     * <p>
     * The customer's first name.
     *
     */
    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    /**
     * First Name
     * <p>
     * The customer's first name.
     *
     */
    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Customer withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Last Name
     * <p>
     * The customer's last name.
     *
     */
    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    /**
     * Last Name
     * <p>
     * The customer's last name.
     *
     */
    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Customer withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Orders Count
     * <p>
     * The customer's total order count.
     *
     */
    @JsonProperty("orders_count")
    public Long getOrdersCount() {
        return ordersCount;
    }

    /**
     * Orders Count
     * <p>
     * The customer's total order count.
     *
     */
    @JsonProperty("orders_count")
    public void setOrdersCount(Long ordersCount) {
        this.ordersCount = ordersCount;
    }

    public Customer withOrdersCount(Long ordersCount) {
        this.ordersCount = ordersCount;
        return this;
    }

    /**
     * Total Spent
     * <p>
     * The total amount the customer has spent.
     *
     */
    @JsonProperty("total_spent")
    public Double getTotalSpent() {
        return totalSpent;
    }

    /**
     * Total Spent
     * <p>
     * The total amount the customer has spent.
     *
     */
    @JsonProperty("total_spent")
    public void setTotalSpent(Double totalSpent) {
        this.totalSpent = totalSpent;
    }

    public Customer withTotalSpent(Double totalSpent) {
        this.totalSpent = totalSpent;
        return this;
    }

    /**
     * Address
     * <p>
     * The address associated with an ecommerce customer.
     *
     */
    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    /**
     * Address
     * <p>
     * The address associated with an ecommerce customer.
     *
     */
    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    public Customer withAddress(Address address) {
        this.address = address;
        return this;
    }

    /**
     * Creation Time
     * <p>
     * The date and time the customer was created in ISO 8601 format.
     *
     */
    @JsonProperty("created_at")
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * Creation Time
     * <p>
     * The date and time the customer was created in ISO 8601 format.
     *
     */
    @JsonProperty("created_at")
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Customer withCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Update Time
     * <p>
     * The date and time the customer was last updated in ISO 8601 format.
     *
     */
    @JsonProperty("updated_at")
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Update Time
     * <p>
     * The date and time the customer was last updated in ISO 8601 format.
     *
     */
    @JsonProperty("updated_at")
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Customer withUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Links
     * <p>
     *
     *
     */
    @JsonProperty("_links")
    public List<Link> getLinks() {
        return links;
    }

    /**
     * Links
     * <p>
     *
     *
     */
    @JsonProperty("_links")
    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public Customer withLinks(List<Link> links) {
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

    public Customer withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(lastName).append(totalSpent).append(address).append(optInStatus).append(firstName).append(createdAt).append(emailAddress).append(ordersCount).append(company).append(links).append(id).append(additionalProperties).append(updatedAt).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Customer) == false) {
            return false;
        }
        Customer rhs = ((Customer) other);
        return new EqualsBuilder().append(lastName, rhs.lastName).append(totalSpent, rhs.totalSpent).append(address, rhs.address).append(optInStatus, rhs.optInStatus).append(firstName, rhs.firstName).append(createdAt, rhs.createdAt).append(emailAddress, rhs.emailAddress).append(ordersCount, rhs.ordersCount).append(company, rhs.company).append(links, rhs.links).append(id, rhs.id).append(additionalProperties, rhs.additionalProperties).append(updatedAt, rhs.updatedAt).isEquals();
    }

}
