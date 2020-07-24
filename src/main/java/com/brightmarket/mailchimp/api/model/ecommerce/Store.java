
package com.brightmarket.mailchimp.api.model.ecommerce;

import com.brightmarket.mailchimp.api.model.Link;
import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Ecommerce Store
 * <p>
 * Information about a specific ecommerce store.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "list_id",
        "name",
        "platform",
        "domain",
        "is_syncing",
        "email_address",
        "currency_code",
        "money_format",
        "primary_locale",
        "timezone",
        "phone",
        "address",
        "connected_site",
        "automations",
        "list_is_active",
        "created_at",
        "updated_at",
        "_links"
})
public class Store implements Serializable {

    /**
     * Store Foreign ID
     * <p>
     * The unique identifier for the store.
     * (Required)
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The unique identifier for the store.")
    private String id;
    /**
     * List ID
     * <p>
     * The unique identifier for the Mailchimp list that's associated with the store. The list_id for a specific store can't change.
     * (Required)
     */
    @JsonProperty("list_id")
    @JsonPropertyDescription("The unique identifier for the Mailchimp list that's associated with the store. The list_id for a specific store can't change.")
    private String listId;
    /**
     * Store Name
     * <p>
     * The name of the store.
     * (Required)
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of the store.")
    private String name;
    /**
     * Store Platform
     * <p>
     * The ecommerce platform of the store.
     */
    @JsonProperty("platform")
    @JsonPropertyDescription("The ecommerce platform of the store.")
    private String platform;
    /**
     * Domain
     * <p>
     * The store domain.  The store domain must be unique within a user account.
     */
    @JsonProperty("domain")
    @JsonPropertyDescription("The store domain.  The store domain must be unique within a user account.")
    private String domain;
    /**
     * Is Syncing
     * <p>
     * Whether the Ecommerce Store is currently syncing.
     */
    @JsonProperty("is_syncing")
    @JsonPropertyDescription("Whether the Ecommerce Store is currently syncing.")
    private Boolean isSyncing;
    /**
     * Email Address
     * <p>
     * The email address for the store.
     */
    @JsonProperty("email_address")
    @JsonPropertyDescription("The email address for the store.")
    private String emailAddress;
    /**
     * Currency
     * <p>
     * The three-letter ISO 4217 code for the currency that the store accepts.
     * (Required)
     */
    @JsonProperty("currency_code")
    @JsonPropertyDescription("The three-letter ISO 4217 code for the currency that the store accepts.")
    private String currencyCode;
    /**
     * Money Format
     * <p>
     * The currency format for the store. For example: `$`, `£`, etc.
     */
    @JsonProperty("money_format")
    @JsonPropertyDescription("The currency format for the store. For example: `$`, `\u00a3`, etc.")
    private String moneyFormat;
    /**
     * Primary Locale
     * <p>
     * The primary locale for the store. For example: `en`, `de`, etc.
     */
    @JsonProperty("primary_locale")
    @JsonPropertyDescription("The primary locale for the store. For example: `en`, `de`, etc.")
    private String primaryLocale;
    /**
     * Timezone
     * <p>
     * The timezone for the store.
     */
    @JsonProperty("timezone")
    @JsonPropertyDescription("The timezone for the store.")
    private String timezone;
    /**
     * Phone
     * <p>
     * The store phone number.
     */
    @JsonProperty("phone")
    @JsonPropertyDescription("The store phone number.")
    private String phone;
    /**
     * Address
     * <p>
     * The store address.
     */
    @JsonProperty("address")
    @JsonPropertyDescription("The store address.")
    private StoreAddress address;
    /**
     * Connected Site
     * <p>
     * The Connected Site associated with the store.
     */
    @JsonProperty("connected_site")
    @JsonPropertyDescription("The Connected Site associated with the store.")
    private ConnectedSite connectedSite;
    /**
     * Automations
     * <p>
     * Details for the automations attached to this store.
     */
    @JsonProperty("automations")
    @JsonPropertyDescription("Details for the automations attached to this store.")
    private Automations automations;
    /**
     * List Status
     * <p>
     * The status of the list connected to the store, namely if it's deleted or disabled.
     */
    @JsonProperty("list_is_active")
    @JsonPropertyDescription("The status of the list connected to the store, namely if it's deleted or disabled.")
    private Boolean listIsActive;
    /**
     * Creation Time
     * <p>
     * The date and time the store was created in ISO 8601 format.
     */
    @JsonProperty("created_at")
    @JsonPropertyDescription("The date and time the store was created in ISO 8601 format.")
    private Date createdAt;
    /**
     * Update Time
     * <p>
     * The date and time the store was last updated in ISO 8601 format.
     */
    @JsonProperty("updated_at")
    @JsonPropertyDescription("The date and time the store was last updated in ISO 8601 format.")
    private Date updatedAt;
    /**
     * Links
     * <p>
     */
    @JsonProperty("_links")
    @JsonPropertyDescription("")
    private List<Link> links = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -1663095647554026219L;

    /**
     * No args constructor for use in serialization
     */
    public Store() {
    }

    /**
     * @param automations
     * @param address
     * @param timezone
     * @param isSyncing
     * @param platform
     * @param listId
     * @param createdAt
     * @param emailAddress
     * @param phone
     * @param domain
     * @param name
     * @param listIsActive
     * @param moneyFormat
     * @param links
     * @param id
     * @param currencyCode
     * @param primaryLocale
     * @param connectedSite
     * @param updatedAt
     */
    public Store(String id, String listId, String name, String platform, String domain, Boolean isSyncing, String emailAddress, String currencyCode, String moneyFormat, String primaryLocale, String timezone, String phone, StoreAddress address, ConnectedSite connectedSite, Automations automations, Boolean listIsActive, Date createdAt, Date updatedAt, List<Link> links) {
        super();
        this.id = id;
        this.listId = listId;
        this.name = name;
        this.platform = platform;
        this.domain = domain;
        this.isSyncing = isSyncing;
        this.emailAddress = emailAddress;
        this.currencyCode = currencyCode;
        this.moneyFormat = moneyFormat;
        this.primaryLocale = primaryLocale;
        this.timezone = timezone;
        this.phone = phone;
        this.address = address;
        this.connectedSite = connectedSite;
        this.automations = automations;
        this.listIsActive = listIsActive;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.links = links;
    }

    /**
     * Store Foreign ID
     * <p>
     * The unique identifier for the store.
     * (Required)
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Store Foreign ID
     * <p>
     * The unique identifier for the store.
     * (Required)
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Store withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * List ID
     * <p>
     * The unique identifier for the Mailchimp list that's associated with the store. The list_id for a specific store can't change.
     * (Required)
     */
    @JsonProperty("list_id")
    public String getListId() {
        return listId;
    }

    /**
     * List ID
     * <p>
     * The unique identifier for the Mailchimp list that's associated with the store. The list_id for a specific store can't change.
     * (Required)
     */
    @JsonProperty("list_id")
    public void setListId(String listId) {
        this.listId = listId;
    }

    public Store withListId(String listId) {
        this.listId = listId;
        return this;
    }

    /**
     * Store Name
     * <p>
     * The name of the store.
     * (Required)
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Store Name
     * <p>
     * The name of the store.
     * (Required)
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Store withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Store Platform
     * <p>
     * The ecommerce platform of the store.
     */
    @JsonProperty("platform")
    public String getPlatform() {
        return platform;
    }

    /**
     * Store Platform
     * <p>
     * The ecommerce platform of the store.
     */
    @JsonProperty("platform")
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Store withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Domain
     * <p>
     * The store domain.  The store domain must be unique within a user account.
     */
    @JsonProperty("domain")
    public String getDomain() {
        return domain;
    }

    /**
     * Domain
     * <p>
     * The store domain.  The store domain must be unique within a user account.
     */
    @JsonProperty("domain")
    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Store withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * Is Syncing
     * <p>
     * Whether the Ecommerce Store is currently syncing.
     */
    @JsonProperty("is_syncing")
    public Boolean getIsSyncing() {
        return isSyncing;
    }

    /**
     * Is Syncing
     * <p>
     * Whether the Ecommerce Store is currently syncing.
     */
    @JsonProperty("is_syncing")
    public void setIsSyncing(Boolean isSyncing) {
        this.isSyncing = isSyncing;
    }

    public Store withIsSyncing(Boolean isSyncing) {
        this.isSyncing = isSyncing;
        return this;
    }

    /**
     * Email Address
     * <p>
     * The email address for the store.
     */
    @JsonProperty("email_address")
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Email Address
     * <p>
     * The email address for the store.
     */
    @JsonProperty("email_address")
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Store withEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * Currency
     * <p>
     * The three-letter ISO 4217 code for the currency that the store accepts.
     * (Required)
     */
    @JsonProperty("currency_code")
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Currency
     * <p>
     * The three-letter ISO 4217 code for the currency that the store accepts.
     * (Required)
     */
    @JsonProperty("currency_code")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Store withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * Money Format
     * <p>
     * The currency format for the store. For example: `$`, `£`, etc.
     */
    @JsonProperty("money_format")
    public String getMoneyFormat() {
        return moneyFormat;
    }

    /**
     * Money Format
     * <p>
     * The currency format for the store. For example: `$`, `£`, etc.
     */
    @JsonProperty("money_format")
    public void setMoneyFormat(String moneyFormat) {
        this.moneyFormat = moneyFormat;
    }

    public Store withMoneyFormat(String moneyFormat) {
        this.moneyFormat = moneyFormat;
        return this;
    }

    /**
     * Primary Locale
     * <p>
     * The primary locale for the store. For example: `en`, `de`, etc.
     */
    @JsonProperty("primary_locale")
    public String getPrimaryLocale() {
        return primaryLocale;
    }

    /**
     * Primary Locale
     * <p>
     * The primary locale for the store. For example: `en`, `de`, etc.
     */
    @JsonProperty("primary_locale")
    public void setPrimaryLocale(String primaryLocale) {
        this.primaryLocale = primaryLocale;
    }

    public Store withPrimaryLocale(String primaryLocale) {
        this.primaryLocale = primaryLocale;
        return this;
    }

    /**
     * Timezone
     * <p>
     * The timezone for the store.
     */
    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    /**
     * Timezone
     * <p>
     * The timezone for the store.
     */
    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Store withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * Phone
     * <p>
     * The store phone number.
     */
    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    /**
     * Phone
     * <p>
     * The store phone number.
     */
    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Store withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Address
     * <p>
     * The store address.
     */
    @JsonProperty("address")
    public StoreAddress getAddress() {
        return address;
    }

    /**
     * Address
     * <p>
     * The store address.
     */
    @JsonProperty("address")
    public void setAddress(StoreAddress address) {
        this.address = address;
    }

    public Store withAddress(StoreAddress address) {
        this.address = address;
        return this;
    }

    /**
     * Connected Site
     * <p>
     * The Connected Site associated with the store.
     */
    @JsonProperty("connected_site")
    public ConnectedSite getConnectedSite() {
        return connectedSite;
    }

    /**
     * Connected Site
     * <p>
     * The Connected Site associated with the store.
     */
    @JsonProperty("connected_site")
    public void setConnectedSite(ConnectedSite connectedSite) {
        this.connectedSite = connectedSite;
    }

    public Store withConnectedSite(ConnectedSite connectedSite) {
        this.connectedSite = connectedSite;
        return this;
    }

    /**
     * Automations
     * <p>
     * Details for the automations attached to this store.
     */
    @JsonProperty("automations")
    public Automations getAutomations() {
        return automations;
    }

    /**
     * Automations
     * <p>
     * Details for the automations attached to this store.
     */
    @JsonProperty("automations")
    public void setAutomations(Automations automations) {
        this.automations = automations;
    }

    public Store withAutomations(Automations automations) {
        this.automations = automations;
        return this;
    }

    /**
     * List Status
     * <p>
     * The status of the list connected to the store, namely if it's deleted or disabled.
     */
    @JsonProperty("list_is_active")
    public Boolean getListIsActive() {
        return listIsActive;
    }

    /**
     * List Status
     * <p>
     * The status of the list connected to the store, namely if it's deleted or disabled.
     */
    @JsonProperty("list_is_active")
    public void setListIsActive(Boolean listIsActive) {
        this.listIsActive = listIsActive;
    }

    public Store withListIsActive(Boolean listIsActive) {
        this.listIsActive = listIsActive;
        return this;
    }

    /**
     * Creation Time
     * <p>
     * The date and time the store was created in ISO 8601 format.
     */
    @JsonProperty("created_at")
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * Creation Time
     * <p>
     * The date and time the store was created in ISO 8601 format.
     */
    @JsonProperty("created_at")
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Store withCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Update Time
     * <p>
     * The date and time the store was last updated in ISO 8601 format.
     */
    @JsonProperty("updated_at")
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Update Time
     * <p>
     * The date and time the store was last updated in ISO 8601 format.
     */
    @JsonProperty("updated_at")
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Store withUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
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

    public Store withLinks(List<Link> links) {
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

    public Store withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(automations).append(address).append(timezone).append(isSyncing).append(platform).append(listId).append(createdAt).append(emailAddress).append(phone).append(domain).append(name).append(listIsActive).append(moneyFormat).append(links).append(id).append(additionalProperties).append(currencyCode).append(primaryLocale).append(connectedSite).append(updatedAt).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Store) == false) {
            return false;
        }
        Store rhs = ((Store) other);
        return new EqualsBuilder().append(automations, rhs.automations).append(address, rhs.address).append(timezone, rhs.timezone).append(isSyncing, rhs.isSyncing).append(platform, rhs.platform).append(listId, rhs.listId).append(createdAt, rhs.createdAt).append(emailAddress, rhs.emailAddress).append(phone, rhs.phone).append(domain, rhs.domain).append(name, rhs.name).append(listIsActive, rhs.listIsActive).append(moneyFormat, rhs.moneyFormat).append(links, rhs.links).append(id, rhs.id).append(additionalProperties, rhs.additionalProperties).append(currencyCode, rhs.currencyCode).append(primaryLocale, rhs.primaryLocale).append(connectedSite, rhs.connectedSite).append(updatedAt, rhs.updatedAt).isEquals();
    }

}
