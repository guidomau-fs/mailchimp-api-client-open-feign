
package com.brightmarket.mailchimp.api.ecommerce.order;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.brightmarket.mailchimp.api.Link;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


/**
 * Ecommerce Orders
 * <p>
 * Information about a specific order.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "customer",
    "campaign_id",
    "landing_site",
    "financial_status",
    "fulfillment_status",
    "currency_code",
    "order_total",
    "order_url",
    "discount_total",
    "tax_total",
    "shipping_total",
    "tracking_code",
    "processed_at_foreign",
    "cancelled_at_foreign",
    "updated_at_foreign",
    "shipping_address",
    "billing_address",
    "promos",
    "lines",
    "outreach",
    "_links"
})
public class Order implements Serializable
{

    /**
     * Order Foreign ID
     * <p>
     * A unique identifier for the order.
     * (Required)
     *
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A unique identifier for the order.")
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
     * A string that uniquely identifies the campaign associated with an order.
     *
     */
    @JsonProperty("campaign_id")
    @JsonPropertyDescription("A string that uniquely identifies the campaign associated with an order.")
    private String campaignId;
    /**
     * Landing Site
     * <p>
     * The URL for the page where the buyer landed when entering the shop.
     *
     */
    @JsonProperty("landing_site")
    @JsonPropertyDescription("The URL for the page where the buyer landed when entering the shop.")
    private String landingSite;
    /**
     * Financial Status
     * <p>
     * The order status. For example: `refunded`, `processing`, `cancelled`, etc.
     *
     */
    @JsonProperty("financial_status")
    @JsonPropertyDescription("The order status. For example: `refunded`, `processing`, `cancelled`, etc.")
    private String financialStatus;
    /**
     * Fulfillment Status
     * <p>
     * The fulfillment status for the order. For example: `partial`, `fulfilled`, etc.
     *
     */
    @JsonProperty("fulfillment_status")
    @JsonPropertyDescription("The fulfillment status for the order. For example: `partial`, `fulfilled`, etc.")
    private String fulfillmentStatus;
    /**
     * Currency Code
     * <p>
     * The three-letter ISO 4217 code for the currency that the store accepts.
     * (Required)
     *
     */
    @JsonProperty("currency_code")
    @JsonPropertyDescription("The three-letter ISO 4217 code for the currency that the store accepts.")
    private String currencyCode;
    /**
     * Order Total
     * <p>
     * The order total for the order.
     * (Required)
     *
     */
    @JsonProperty("order_total")
    @JsonPropertyDescription("The order total for the order.")
    private Double orderTotal;
    /**
     * Order URL
     * <p>
     * The URL for the order.
     *
     */
    @JsonProperty("order_url")
    @JsonPropertyDescription("The URL for the order.")
    private String orderUrl;
    /**
     * Discount Total
     * <p>
     * The total amount of the discounts to be applied to the price of the order.
     *
     */
    @JsonProperty("discount_total")
    @JsonPropertyDescription("The total amount of the discounts to be applied to the price of the order.")
    private Double discountTotal;
    /**
     * Tax Total
     * <p>
     * The tax total for the order.
     *
     */
    @JsonProperty("tax_total")
    @JsonPropertyDescription("The tax total for the order.")
    private Double taxTotal;
    /**
     * Shipping Total
     * <p>
     * The shipping total for the order.
     *
     */
    @JsonProperty("shipping_total")
    @JsonPropertyDescription("The shipping total for the order.")
    private Double shippingTotal;
    /**
     * Tracking Code
     * <p>
     * The Mailchimp tracking code for the order. Uses the 'mc_tc' parameter in eCommerce360-enabled tracking urls.
     *
     */
    @JsonProperty("tracking_code")
    @JsonPropertyDescription("The Mailchimp tracking code for the order. Uses the 'mc_tc' parameter in eCommerce360-enabled tracking urls.")
    private Order.TrackingCode trackingCode;
    /**
     * Foreign Processed Time
     * <p>
     * The date and time the order was processed in ISO 8601 format.
     *
     */
    @JsonProperty("processed_at_foreign")
    @JsonPropertyDescription("The date and time the order was processed in ISO 8601 format.")
    private Date processedAtForeign;
    /**
     * Foreign Cancel Time
     * <p>
     * The date and time the order was cancelled in ISO 8601 format.
     *
     */
    @JsonProperty("cancelled_at_foreign")
    @JsonPropertyDescription("The date and time the order was cancelled in ISO 8601 format.")
    private Date cancelledAtForeign;
    /**
     * Foreign Update Time
     * <p>
     * The date and time the order was updated in ISO 8601 format.
     *
     */
    @JsonProperty("updated_at_foreign")
    @JsonPropertyDescription("The date and time the order was updated in ISO 8601 format.")
    private Date updatedAtForeign;
    /**
     * Shipping Address
     * <p>
     * The shipping address for the order.
     *
     */
    @JsonProperty("shipping_address")
    @JsonPropertyDescription("The shipping address for the order.")
    private ShippingAddress shippingAddress;
    /**
     * Billing Address
     * <p>
     * The billing address for the order.
     *
     */
    @JsonProperty("billing_address")
    @JsonPropertyDescription("The billing address for the order.")
    private BillingAddress billingAddress;
    /**
     * Promos
     * <p>
     * The promo codes applied on the order
     *
     */
    @JsonProperty("promos")
    @JsonPropertyDescription("The promo codes applied on the order")
    private List<Promo> promos = null;
    /**
     * Order Line Items
     * <p>
     * An array of the order's line items.
     * (Required)
     *
     */
    @JsonProperty("lines")
    @JsonPropertyDescription("An array of the order's line items.")
    private List<OrderLine> lines = null;
    /**
     * Outreach
     * <p>
     * The outreach associated with this order. For example, an email campaign or Facebook ad.
     *
     */
    @JsonProperty("outreach")
    @JsonPropertyDescription("The outreach associated with this order. For example, an email campaign or Facebook ad.")
    private Outreach outreach;
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
    private final static long serialVersionUID = -5332460469915883005L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Order() {
    }

    /**
     *
     * @param campaignId
     * @param outreach
     * @param taxTotal
     * @param trackingCode
     * @param fulfillmentStatus
     * @param orderTotal
     * @param orderUrl
     * @param shippingTotal
     * @param processedAtForeign
     * @param updatedAtForeign
     * @param discountTotal
     * @param financialStatus
     * @param shippingAddress
     * @param links
     * @param id
     * @param billingAddress
     * @param landingSite
     * @param lines
     * @param currencyCode
     * @param promos
     * @param customer
     * @param cancelledAtForeign
     */
    public Order(String id, Customer customer, String campaignId, String landingSite, String financialStatus, String fulfillmentStatus, String currencyCode, Double orderTotal, String orderUrl, Double discountTotal, Double taxTotal, Double shippingTotal, Order.TrackingCode trackingCode, Date processedAtForeign, Date cancelledAtForeign, Date updatedAtForeign, ShippingAddress shippingAddress, BillingAddress billingAddress, List<Promo> promos, List<OrderLine> lines, Outreach outreach, List<Link> links) {
        super();
        this.id = id;
        this.customer = customer;
        this.campaignId = campaignId;
        this.landingSite = landingSite;
        this.financialStatus = financialStatus;
        this.fulfillmentStatus = fulfillmentStatus;
        this.currencyCode = currencyCode;
        this.orderTotal = orderTotal;
        this.orderUrl = orderUrl;
        this.discountTotal = discountTotal;
        this.taxTotal = taxTotal;
        this.shippingTotal = shippingTotal;
        this.trackingCode = trackingCode;
        this.processedAtForeign = processedAtForeign;
        this.cancelledAtForeign = cancelledAtForeign;
        this.updatedAtForeign = updatedAtForeign;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
        this.promos = promos;
        this.lines = lines;
        this.outreach = outreach;
        this.links = links;
    }

    /**
     * Order Foreign ID
     * <p>
     * A unique identifier for the order.
     * (Required)
     *
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Order Foreign ID
     * <p>
     * A unique identifier for the order.
     * (Required)
     *
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Order withId(String id) {
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

    public Order withCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }

    /**
     * Campaign ID
     * <p>
     * A string that uniquely identifies the campaign associated with an order.
     *
     */
    @JsonProperty("campaign_id")
    public String getCampaignId() {
        return campaignId;
    }

    /**
     * Campaign ID
     * <p>
     * A string that uniquely identifies the campaign associated with an order.
     *
     */
    @JsonProperty("campaign_id")
    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    public Order withCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }

    /**
     * Landing Site
     * <p>
     * The URL for the page where the buyer landed when entering the shop.
     *
     */
    @JsonProperty("landing_site")
    public String getLandingSite() {
        return landingSite;
    }

    /**
     * Landing Site
     * <p>
     * The URL for the page where the buyer landed when entering the shop.
     *
     */
    @JsonProperty("landing_site")
    public void setLandingSite(String landingSite) {
        this.landingSite = landingSite;
    }

    public Order withLandingSite(String landingSite) {
        this.landingSite = landingSite;
        return this;
    }

    /**
     * Financial Status
     * <p>
     * The order status. For example: `refunded`, `processing`, `cancelled`, etc.
     *
     */
    @JsonProperty("financial_status")
    public String getFinancialStatus() {
        return financialStatus;
    }

    /**
     * Financial Status
     * <p>
     * The order status. For example: `refunded`, `processing`, `cancelled`, etc.
     *
     */
    @JsonProperty("financial_status")
    public void setFinancialStatus(String financialStatus) {
        this.financialStatus = financialStatus;
    }

    public Order withFinancialStatus(String financialStatus) {
        this.financialStatus = financialStatus;
        return this;
    }

    /**
     * Fulfillment Status
     * <p>
     * The fulfillment status for the order. For example: `partial`, `fulfilled`, etc.
     *
     */
    @JsonProperty("fulfillment_status")
    public String getFulfillmentStatus() {
        return fulfillmentStatus;
    }

    /**
     * Fulfillment Status
     * <p>
     * The fulfillment status for the order. For example: `partial`, `fulfilled`, etc.
     *
     */
    @JsonProperty("fulfillment_status")
    public void setFulfillmentStatus(String fulfillmentStatus) {
        this.fulfillmentStatus = fulfillmentStatus;
    }

    public Order withFulfillmentStatus(String fulfillmentStatus) {
        this.fulfillmentStatus = fulfillmentStatus;
        return this;
    }

    /**
     * Currency Code
     * <p>
     * The three-letter ISO 4217 code for the currency that the store accepts.
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
     * The three-letter ISO 4217 code for the currency that the store accepts.
     * (Required)
     *
     */
    @JsonProperty("currency_code")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Order withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * Order Total
     * <p>
     * The order total for the order.
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
     * The order total for the order.
     * (Required)
     *
     */
    @JsonProperty("order_total")
    public void setOrderTotal(Double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public Order withOrderTotal(Double orderTotal) {
        this.orderTotal = orderTotal;
        return this;
    }

    /**
     * Order URL
     * <p>
     * The URL for the order.
     *
     */
    @JsonProperty("order_url")
    public String getOrderUrl() {
        return orderUrl;
    }

    /**
     * Order URL
     * <p>
     * The URL for the order.
     *
     */
    @JsonProperty("order_url")
    public void setOrderUrl(String orderUrl) {
        this.orderUrl = orderUrl;
    }

    public Order withOrderUrl(String orderUrl) {
        this.orderUrl = orderUrl;
        return this;
    }

    /**
     * Discount Total
     * <p>
     * The total amount of the discounts to be applied to the price of the order.
     *
     */
    @JsonProperty("discount_total")
    public Double getDiscountTotal() {
        return discountTotal;
    }

    /**
     * Discount Total
     * <p>
     * The total amount of the discounts to be applied to the price of the order.
     *
     */
    @JsonProperty("discount_total")
    public void setDiscountTotal(Double discountTotal) {
        this.discountTotal = discountTotal;
    }

    public Order withDiscountTotal(Double discountTotal) {
        this.discountTotal = discountTotal;
        return this;
    }

    /**
     * Tax Total
     * <p>
     * The tax total for the order.
     *
     */
    @JsonProperty("tax_total")
    public Double getTaxTotal() {
        return taxTotal;
    }

    /**
     * Tax Total
     * <p>
     * The tax total for the order.
     *
     */
    @JsonProperty("tax_total")
    public void setTaxTotal(Double taxTotal) {
        this.taxTotal = taxTotal;
    }

    public Order withTaxTotal(Double taxTotal) {
        this.taxTotal = taxTotal;
        return this;
    }

    /**
     * Shipping Total
     * <p>
     * The shipping total for the order.
     *
     */
    @JsonProperty("shipping_total")
    public Double getShippingTotal() {
        return shippingTotal;
    }

    /**
     * Shipping Total
     * <p>
     * The shipping total for the order.
     *
     */
    @JsonProperty("shipping_total")
    public void setShippingTotal(Double shippingTotal) {
        this.shippingTotal = shippingTotal;
    }

    public Order withShippingTotal(Double shippingTotal) {
        this.shippingTotal = shippingTotal;
        return this;
    }

    /**
     * Tracking Code
     * <p>
     * The Mailchimp tracking code for the order. Uses the 'mc_tc' parameter in eCommerce360-enabled tracking urls.
     *
     */
    @JsonProperty("tracking_code")
    public Order.TrackingCode getTrackingCode() {
        return trackingCode;
    }

    /**
     * Tracking Code
     * <p>
     * The Mailchimp tracking code for the order. Uses the 'mc_tc' parameter in eCommerce360-enabled tracking urls.
     *
     */
    @JsonProperty("tracking_code")
    public void setTrackingCode(Order.TrackingCode trackingCode) {
        this.trackingCode = trackingCode;
    }

    public Order withTrackingCode(Order.TrackingCode trackingCode) {
        this.trackingCode = trackingCode;
        return this;
    }

    /**
     * Foreign Processed Time
     * <p>
     * The date and time the order was processed in ISO 8601 format.
     *
     */
    @JsonProperty("processed_at_foreign")
    public Date getProcessedAtForeign() {
        return processedAtForeign;
    }

    /**
     * Foreign Processed Time
     * <p>
     * The date and time the order was processed in ISO 8601 format.
     *
     */
    @JsonProperty("processed_at_foreign")
    public void setProcessedAtForeign(Date processedAtForeign) {
        this.processedAtForeign = processedAtForeign;
    }

    public Order withProcessedAtForeign(Date processedAtForeign) {
        this.processedAtForeign = processedAtForeign;
        return this;
    }

    /**
     * Foreign Cancel Time
     * <p>
     * The date and time the order was cancelled in ISO 8601 format.
     *
     */
    @JsonProperty("cancelled_at_foreign")
    public Date getCancelledAtForeign() {
        return cancelledAtForeign;
    }

    /**
     * Foreign Cancel Time
     * <p>
     * The date and time the order was cancelled in ISO 8601 format.
     *
     */
    @JsonProperty("cancelled_at_foreign")
    public void setCancelledAtForeign(Date cancelledAtForeign) {
        this.cancelledAtForeign = cancelledAtForeign;
    }

    public Order withCancelledAtForeign(Date cancelledAtForeign) {
        this.cancelledAtForeign = cancelledAtForeign;
        return this;
    }

    /**
     * Foreign Update Time
     * <p>
     * The date and time the order was updated in ISO 8601 format.
     *
     */
    @JsonProperty("updated_at_foreign")
    public Date getUpdatedAtForeign() {
        return updatedAtForeign;
    }

    /**
     * Foreign Update Time
     * <p>
     * The date and time the order was updated in ISO 8601 format.
     *
     */
    @JsonProperty("updated_at_foreign")
    public void setUpdatedAtForeign(Date updatedAtForeign) {
        this.updatedAtForeign = updatedAtForeign;
    }

    public Order withUpdatedAtForeign(Date updatedAtForeign) {
        this.updatedAtForeign = updatedAtForeign;
        return this;
    }

    /**
     * Shipping Address
     * <p>
     * The shipping address for the order.
     *
     */
    @JsonProperty("shipping_address")
    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Shipping Address
     * <p>
     * The shipping address for the order.
     *
     */
    @JsonProperty("shipping_address")
    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Order withShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

    /**
     * Billing Address
     * <p>
     * The billing address for the order.
     *
     */
    @JsonProperty("billing_address")
    public BillingAddress getBillingAddress() {
        return billingAddress;
    }

    /**
     * Billing Address
     * <p>
     * The billing address for the order.
     *
     */
    @JsonProperty("billing_address")
    public void setBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Order withBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
        return this;
    }

    /**
     * Promos
     * <p>
     * The promo codes applied on the order
     *
     */
    @JsonProperty("promos")
    public List<Promo> getPromos() {
        return promos;
    }

    /**
     * Promos
     * <p>
     * The promo codes applied on the order
     *
     */
    @JsonProperty("promos")
    public void setPromos(List<Promo> promos) {
        this.promos = promos;
    }

    public Order withPromos(List<Promo> promos) {
        this.promos = promos;
        return this;
    }

    /**
     * Order Line Items
     * <p>
     * An array of the order's line items.
     * (Required)
     *
     */
    @JsonProperty("lines")
    public List<OrderLine> getLines() {
        return lines;
    }

    /**
     * Order Line Items
     * <p>
     * An array of the order's line items.
     * (Required)
     *
     */
    @JsonProperty("lines")
    public void setLines(List<OrderLine> lines) {
        this.lines = lines;
    }

    public Order withLines(List<OrderLine> lines) {
        this.lines = lines;
        return this;
    }

    /**
     * Outreach
     * <p>
     * The outreach associated with this order. For example, an email campaign or Facebook ad.
     *
     */
    @JsonProperty("outreach")
    public Outreach getOutreach() {
        return outreach;
    }

    /**
     * Outreach
     * <p>
     * The outreach associated with this order. For example, an email campaign or Facebook ad.
     *
     */
    @JsonProperty("outreach")
    public void setOutreach(Outreach outreach) {
        this.outreach = outreach;
    }

    public Order withOutreach(Outreach outreach) {
        this.outreach = outreach;
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

    public Order withLinks(List<Link> links) {
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

    public Order withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(campaignId).append(outreach).append(taxTotal).append(trackingCode).append(fulfillmentStatus).append(orderTotal).append(orderUrl).append(shippingTotal).append(processedAtForeign).append(updatedAtForeign).append(discountTotal).append(financialStatus).append(shippingAddress).append(links).append(id).append(billingAddress).append(additionalProperties).append(landingSite).append(lines).append(currencyCode).append(promos).append(customer).append(cancelledAtForeign).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Order) == false) {
            return false;
        }
        Order rhs = ((Order) other);
        return new EqualsBuilder().append(campaignId, rhs.campaignId).append(outreach, rhs.outreach).append(taxTotal, rhs.taxTotal).append(trackingCode, rhs.trackingCode).append(fulfillmentStatus, rhs.fulfillmentStatus).append(orderTotal, rhs.orderTotal).append(orderUrl, rhs.orderUrl).append(shippingTotal, rhs.shippingTotal).append(processedAtForeign, rhs.processedAtForeign).append(updatedAtForeign, rhs.updatedAtForeign).append(discountTotal, rhs.discountTotal).append(financialStatus, rhs.financialStatus).append(shippingAddress, rhs.shippingAddress).append(links, rhs.links).append(id, rhs.id).append(billingAddress, rhs.billingAddress).append(additionalProperties, rhs.additionalProperties).append(landingSite, rhs.landingSite).append(lines, rhs.lines).append(currencyCode, rhs.currencyCode).append(promos, rhs.promos).append(customer, rhs.customer).append(cancelledAtForeign, rhs.cancelledAtForeign).isEquals();
    }

    public enum TrackingCode {

        PREC("prec");
        private final String value;
        private final static Map<String, Order.TrackingCode> CONSTANTS = new HashMap<String, Order.TrackingCode>();

        static {
            for (Order.TrackingCode c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TrackingCode(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Order.TrackingCode fromValue(String value) {
            Order.TrackingCode constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
