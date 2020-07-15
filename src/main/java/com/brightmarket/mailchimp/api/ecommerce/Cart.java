
package com.brightmarket.mailchimp.api.ecommerce;

import com.brightmarket.mailchimp.api.root.Link;
import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Ecommerce Carts
 * <p>
 * Information about a specific cart.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "customer",
    "campaign_id",
    "checkout_url",
    "currency_code",
    "order_total",
    "tax_total",
    "lines",
    "created_at",
    "updated_at",
    "_links"
})
public class Cart implements Serializable
{

    /**
     * Cart Foreign ID
     * <p>
     * A unique identifier for the cart.
     * (Required)
     *
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A unique identifier for the cart.")
    private String id;
    /**
     * Ecommerce Customers
     * <p>
     * Information about a specific customer. Orders for existing customers should include only the id parameter in the customer object body.
     * (Required)
     *
     */
    @JsonProperty("customer")
    @JsonPropertyDescription("Information about a specific customer. Orders for existing customers should include only the id parameter in the customer object body.")
    private Customer customer;
    /**
     * Campaign ID
     * <p>
     * A string that uniquely identifies the campaign associated with a cart.
     *
     */
    @JsonProperty("campaign_id")
    @JsonPropertyDescription("A string that uniquely identifies the campaign associated with a cart.")
    private String campaignId;
    /**
     * Checkout URL
     * <p>
     * The URL for the cart.
     *
     */
    @JsonProperty("checkout_url")
    @JsonPropertyDescription("The URL for the cart.")
    private String checkoutUrl;
    /**
     * Currency Code
     * <p>
     * The three-letter ISO 4217 code for the currency that the cart uses.
     * (Required)
     *
     */
    @JsonProperty("currency_code")
    @JsonPropertyDescription("The three-letter ISO 4217 code for the currency that the cart uses.")
    private String currencyCode;
    /**
     * Order Total
     * <p>
     * The order total for the cart.
     * (Required)
     *
     */
    @JsonProperty("order_total")
    @JsonPropertyDescription("The order total for the cart.")
    private Double orderTotal;
    /**
     * Tax Total
     * <p>
     * The total tax for the cart.
     *
     */
    @JsonProperty("tax_total")
    @JsonPropertyDescription("The total tax for the cart.")
    private Double taxTotal;
    /**
     * Cart Lines
     * <p>
     * An array of the cart's line items.
     * (Required)
     *
     */
    @JsonProperty("lines")
    @JsonPropertyDescription("An array of the cart's line items.")
    private List<CartLine> lines = null;
    /**
     * Creation Time
     * <p>
     * The date and time when the cart was created in ISO 8601 format.
     *
     */
    @JsonProperty("created_at")
    @JsonPropertyDescription("The date and time when the cart was created in ISO 8601 format.")
    private Date createdAt;
    /**
     * Update Time
     * <p>
     * The date and time when the cart was last updated in ISO 8601 format.
     *
     */
    @JsonProperty("updated_at")
    @JsonPropertyDescription("The date and time when the cart was last updated in ISO 8601 format.")
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
    private final static long serialVersionUID = 208461553590910346L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Cart() {
    }

    /**
     *
     * @param createdAt
     * @param campaignId
     * @param taxTotal
     * @param links
     * @param id
     * @param lines
     * @param currencyCode
     * @param orderTotal
     * @param customer
     * @param checkoutUrl
     * @param updatedAt
     */
    public Cart(String id, Customer customer, String campaignId, String checkoutUrl, String currencyCode, Double orderTotal, Double taxTotal, List<CartLine> lines, Date createdAt, Date updatedAt, List<Link> links) {
        super();
        this.id = id;
        this.customer = customer;
        this.campaignId = campaignId;
        this.checkoutUrl = checkoutUrl;
        this.currencyCode = currencyCode;
        this.orderTotal = orderTotal;
        this.taxTotal = taxTotal;
        this.lines = lines;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.links = links;
    }

    /**
     * Cart Foreign ID
     * <p>
     * A unique identifier for the cart.
     * (Required)
     *
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Cart Foreign ID
     * <p>
     * A unique identifier for the cart.
     * (Required)
     *
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Cart withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Ecommerce Customers
     * <p>
     * Information about a specific customer. Orders for existing customers should include only the id parameter in the customer object body.
     * (Required)
     *
     */
    @JsonProperty("customer")
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Ecommerce Customers
     * <p>
     * Information about a specific customer. Orders for existing customers should include only the id parameter in the customer object body.
     * (Required)
     *
     */
    @JsonProperty("customer")
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Cart withCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }

    /**
     * Campaign ID
     * <p>
     * A string that uniquely identifies the campaign associated with a cart.
     *
     */
    @JsonProperty("campaign_id")
    public String getCampaignId() {
        return campaignId;
    }

    /**
     * Campaign ID
     * <p>
     * A string that uniquely identifies the campaign associated with a cart.
     *
     */
    @JsonProperty("campaign_id")
    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    public Cart withCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }

    /**
     * Checkout URL
     * <p>
     * The URL for the cart.
     *
     */
    @JsonProperty("checkout_url")
    public String getCheckoutUrl() {
        return checkoutUrl;
    }

    /**
     * Checkout URL
     * <p>
     * The URL for the cart.
     *
     */
    @JsonProperty("checkout_url")
    public void setCheckoutUrl(String checkoutUrl) {
        this.checkoutUrl = checkoutUrl;
    }

    public Cart withCheckoutUrl(String checkoutUrl) {
        this.checkoutUrl = checkoutUrl;
        return this;
    }

    /**
     * Currency Code
     * <p>
     * The three-letter ISO 4217 code for the currency that the cart uses.
     * (Required)
     *
     */
    @JsonProperty("currency_code")
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Currency Code
     * <p>
     * The three-letter ISO 4217 code for the currency that the cart uses.
     * (Required)
     *
     */
    @JsonProperty("currency_code")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Cart withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * Order Total
     * <p>
     * The order total for the cart.
     * (Required)
     *
     */
    @JsonProperty("order_total")
    public Double getOrderTotal() {
        return orderTotal;
    }

    /**
     * Order Total
     * <p>
     * The order total for the cart.
     * (Required)
     *
     */
    @JsonProperty("order_total")
    public void setOrderTotal(Double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public Cart withOrderTotal(Double orderTotal) {
        this.orderTotal = orderTotal;
        return this;
    }

    /**
     * Tax Total
     * <p>
     * The total tax for the cart.
     *
     */
    @JsonProperty("tax_total")
    public Double getTaxTotal() {
        return taxTotal;
    }

    /**
     * Tax Total
     * <p>
     * The total tax for the cart.
     *
     */
    @JsonProperty("tax_total")
    public void setTaxTotal(Double taxTotal) {
        this.taxTotal = taxTotal;
    }

    public Cart withTaxTotal(Double taxTotal) {
        this.taxTotal = taxTotal;
        return this;
    }

    /**
     * Cart Lines
     * <p>
     * An array of the cart's line items.
     * (Required)
     *
     */
    @JsonProperty("lines")
    public List<CartLine> getLines() {
        return lines;
    }

    /**
     * Cart Lines
     * <p>
     * An array of the cart's line items.
     * (Required)
     *
     */
    @JsonProperty("lines")
    public void setLines(List<CartLine> lines) {
        this.lines = lines;
    }

    public Cart withLines(List<CartLine> lines) {
        this.lines = lines;
        return this;
    }

    /**
     * Creation Time
     * <p>
     * The date and time when the cart was created in ISO 8601 format.
     *
     */
    @JsonProperty("created_at")
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * Creation Time
     * <p>
     * The date and time when the cart was created in ISO 8601 format.
     *
     */
    @JsonProperty("created_at")
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Cart withCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Update Time
     * <p>
     * The date and time when the cart was last updated in ISO 8601 format.
     *
     */
    @JsonProperty("updated_at")
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Update Time
     * <p>
     * The date and time when the cart was last updated in ISO 8601 format.
     *
     */
    @JsonProperty("updated_at")
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Cart withUpdatedAt(Date updatedAt) {
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

    public Cart withLinks(List<Link> links) {
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

    public Cart withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(campaignId).append(taxTotal).append(orderTotal).append(checkoutUrl).append(createdAt).append(links).append(id).append(additionalProperties).append(lines).append(currencyCode).append(customer).append(updatedAt).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Cart) == false) {
            return false;
        }
        Cart rhs = ((Cart) other);
        return new EqualsBuilder().append(campaignId, rhs.campaignId).append(taxTotal, rhs.taxTotal).append(orderTotal, rhs.orderTotal).append(checkoutUrl, rhs.checkoutUrl).append(createdAt, rhs.createdAt).append(links, rhs.links).append(id, rhs.id).append(additionalProperties, rhs.additionalProperties).append(lines, rhs.lines).append(currencyCode, rhs.currencyCode).append(customer, rhs.customer).append(updatedAt, rhs.updatedAt).isEquals();
    }

}
