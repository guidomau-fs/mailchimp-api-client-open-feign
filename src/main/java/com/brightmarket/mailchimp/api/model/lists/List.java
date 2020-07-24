
package com.brightmarket.mailchimp.api.model.lists;

import com.brightmarket.mailchimp.api.model.Link;
import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


/**
 * Subscriber List
 * <p>
 * Information about a specific list.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "web_id",
        "name",
        "contact",
        "permission_reminder",
        "use_archive_bar",
        "campaign_defaults",
        "notify_on_subscribe",
        "notify_on_unsubscribe",
        "date_created",
        "list_rating",
        "email_type_option",
        "subscribe_url_short",
        "subscribe_url_long",
        "beamer_address",
        "visibility",
        "double_optin",
        "has_welcome",
        "marketing_permissions",
        "modules",
        "stats",
        "_links"
})
public class List implements Serializable {

    /**
     * List ID
     * <p>
     * A string that uniquely identifies this list
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A string that uniquely identifies this list")
    private String id;
    /**
     * List Web ID
     * <p>
     * The ID used in the Mailchimp web application. View this list in your Mailchimp account at `https://{dc}.admin.mailchimp.com/lists/members/?id={web_id}`.
     */
    @JsonProperty("web_id")
    @JsonPropertyDescription("The ID used in the Mailchimp web application. View this list in your Mailchimp account at `https://{dc}.admin.mailchimp.com/lists/members/?id={web_id}`.")
    private Long webId;
    /**
     * List Name
     * <p>
     * The name of the list.
     * (Required)
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of the list.")
    private String name;
    /**
     * List Contact
     * <p>
     * displayed in campaign footers to comply with international spam laws
     * (Required)
     */
    @JsonProperty("contact")
    @JsonPropertyDescription("displayed in campaign footers to comply with international spam laws")
    private Contact contact;
    /**
     * Permission Reminder
     * <p>
     * The permission reminder for the list: a line of text that appears in the footer of each campaign that explains why subscribers are receiving the email campaign.
     * (Required)
     */
    @JsonProperty("permission_reminder")
    @JsonPropertyDescription("The permission reminder for the list: a line of text that appears in the footer of each campaign that explains why subscribers are receiving the email campaign.")
    private String permissionReminder;
    /**
     * Use Archive Bar
     * <p>
     * Whether or not campaigns for this list use the Archive Bar in archives by default.
     */
    @JsonProperty("use_archive_bar")
    @JsonPropertyDescription("Whether or not campaigns for this list use the Archive Bar in archives by default.")
    private Boolean useArchiveBar = false;
    /**
     * Campaign Defaults
     * <p>
     * Default values for campaigns created for this list.
     * (Required)
     */
    @JsonProperty("campaign_defaults")
    @JsonPropertyDescription("Default values for campaigns created for this list.")
    private CampaignDefaults campaignDefaults;
    /**
     * Notify on Subscribe
     * <p>
     * The email address to send subscribe notifications to, when enabled.
     */
    @JsonProperty("notify_on_subscribe")
    @JsonPropertyDescription("The email address to send subscribe notifications to, when enabled.")
    private String notifyOnSubscribe = "false";
    /**
     * Notify on Unsubscribe
     * <p>
     * The email address to send unsubscribe notifications to, when enabled.
     */
    @JsonProperty("notify_on_unsubscribe")
    @JsonPropertyDescription("The email address to send unsubscribe notifications to, when enabled.")
    private String notifyOnUnsubscribe = "false";
    /**
     * Creation Date
     * <p>
     * The date and time that this list was created in ISO 8601 format.
     */
    @JsonProperty("date_created")
    @JsonPropertyDescription("The date and time that this list was created in ISO 8601 format.")
    private Date dateCreated;
    /**
     * List Rating
     * <p>
     * An auto-generated activity score for the list (0-5).
     */
    @JsonProperty("list_rating")
    @JsonPropertyDescription("An auto-generated activity score for the list (0-5).")
    private Long listRating;
    /**
     * Email Type Option
     * <p>
     * Whether or not the list supports multiple formats for emails.
     * (Required)
     */
    @JsonProperty("email_type_option")
    @JsonPropertyDescription("Whether or not the list supports multiple formats for emails.")
    private Boolean emailTypeOption;
    /**
     * Subscribe URL Short
     * <p>
     * Our eepurl shortened version of this list's subscribe form.
     */
    @JsonProperty("subscribe_url_short")
    @JsonPropertyDescription("Our eepurl shortened version of this list's subscribe form.")
    private String subscribeUrlShort;
    /**
     * Subscribe URL Long
     * <p>
     * The full version of this list's subscribe form (host will vary).
     */
    @JsonProperty("subscribe_url_long")
    @JsonPropertyDescription("The full version of this list's subscribe form (host will vary).")
    private String subscribeUrlLong;
    /**
     * Beamer Address
     * <p>
     * The email address to use for this list's Email Beamer.
     */
    @JsonProperty("beamer_address")
    @JsonPropertyDescription("The email address to use for this list's Email Beamer.")
    private String beamerAddress;
    /**
     * Visibility
     * <p>
     * Whether this list is public (pub) or private (prv). Used internally for projects like Wavelength.
     */
    @JsonProperty("visibility")
    @JsonPropertyDescription("Whether this list is public (pub) or private (prv). Used internally for projects like Wavelength.")
    private List.Visibility visibility;
    /**
     * Double Opt In
     * <p>
     * Whether or not to require the subscriber to confirm subscription via email.
     */
    @JsonProperty("double_optin")
    @JsonPropertyDescription("Whether or not to require the subscriber to confirm subscription via email.")
    private Boolean doubleOptin = false;
    /**
     * Has Welcome
     * <p>
     * Whether or not this list has a welcome automation connected. Welcome Automations: welcomeSeries, singleWelcome, emailFollowup.
     */
    @JsonProperty("has_welcome")
    @JsonPropertyDescription("Whether or not this list has a welcome automation connected. Welcome Automations: welcomeSeries, singleWelcome, emailFollowup.")
    private Boolean hasWelcome = false;
    /**
     * Marketing Permissions
     * <p>
     * Whether or not the list has marketing permissions (eg. GDPR) enabled.
     */
    @JsonProperty("marketing_permissions")
    @JsonPropertyDescription("Whether or not the list has marketing permissions (eg. GDPR) enabled.")
    private Boolean marketingPermissions = false;
    /**
     * Modules
     * <p>
     * Any list-specific modules installed for this list.
     */
    @JsonProperty("modules")
    @JsonPropertyDescription("Any list-specific modules installed for this list.")
    private java.util.List<Object> modules = null;
    /**
     * Statistics
     * <p>
     * Various stats and counts for the list. Many of these are cached for at least five minutes.
     */
    @JsonProperty("stats")
    @JsonPropertyDescription("Various stats and counts for the list. Many of these are cached for at least five minutes.")
    private Stats stats;
    /**
     * Links
     * <p>
     */
    @JsonProperty("_links")
    @JsonPropertyDescription("")
    private java.util.List<Link> links = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6530620283249761327L;

    /**
     * No args constructor for use in serialization
     */
    public List() {
    }

    /**
     * @param campaignDefaults
     * @param visibility
     * @param useArchiveBar
     * @param hasWelcome
     * @param notifyOnSubscribe
     * @param modules
     * @param webId
     * @param dateCreated
     * @param subscribeUrlShort
     * @param subscribeUrlLong
     * @param stats
     * @param permissionReminder
     * @param contact
     * @param doubleOptin
     * @param name
     * @param beamerAddress
     * @param listRating
     * @param links
     * @param id
     * @param emailTypeOption
     * @param notifyOnUnsubscribe
     * @param marketingPermissions
     */
    public List(String id, Long webId, String name, Contact contact, String permissionReminder, Boolean useArchiveBar, CampaignDefaults campaignDefaults, String notifyOnSubscribe, String notifyOnUnsubscribe, Date dateCreated, Long listRating, Boolean emailTypeOption, String subscribeUrlShort, String subscribeUrlLong, String beamerAddress, List.Visibility visibility, Boolean doubleOptin, Boolean hasWelcome, Boolean marketingPermissions, java.util.List<Object> modules, Stats stats, java.util.List<Link> links) {
        super();
        this.id = id;
        this.webId = webId;
        this.name = name;
        this.contact = contact;
        this.permissionReminder = permissionReminder;
        this.useArchiveBar = useArchiveBar;
        this.campaignDefaults = campaignDefaults;
        this.notifyOnSubscribe = notifyOnSubscribe;
        this.notifyOnUnsubscribe = notifyOnUnsubscribe;
        this.dateCreated = dateCreated;
        this.listRating = listRating;
        this.emailTypeOption = emailTypeOption;
        this.subscribeUrlShort = subscribeUrlShort;
        this.subscribeUrlLong = subscribeUrlLong;
        this.beamerAddress = beamerAddress;
        this.visibility = visibility;
        this.doubleOptin = doubleOptin;
        this.hasWelcome = hasWelcome;
        this.marketingPermissions = marketingPermissions;
        this.modules = modules;
        this.stats = stats;
        this.links = links;
    }

    /**
     * List ID
     * <p>
     * A string that uniquely identifies this list
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * List ID
     * <p>
     * A string that uniquely identifies this list
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public List withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * List Web ID
     * <p>
     * The ID used in the Mailchimp web application. View this list in your Mailchimp account at `https://{dc}.admin.mailchimp.com/lists/members/?id={web_id}`.
     */
    @JsonProperty("web_id")
    public Long getWebId() {
        return webId;
    }

    /**
     * List Web ID
     * <p>
     * The ID used in the Mailchimp web application. View this list in your Mailchimp account at `https://{dc}.admin.mailchimp.com/lists/members/?id={web_id}`.
     */
    @JsonProperty("web_id")
    public void setWebId(Long webId) {
        this.webId = webId;
    }

    public List withWebId(Long webId) {
        this.webId = webId;
        return this;
    }

    /**
     * List Name
     * <p>
     * The name of the list.
     * (Required)
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * List Name
     * <p>
     * The name of the list.
     * (Required)
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public List withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * List Contact
     * <p>
     * displayed in campaign footers to comply with international spam laws
     * (Required)
     */
    @JsonProperty("contact")
    public Contact getContact() {
        return contact;
    }

    /**
     * List Contact
     * <p>
     * displayed in campaign footers to comply with international spam laws
     * (Required)
     */
    @JsonProperty("contact")
    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public List withContact(Contact contact) {
        this.contact = contact;
        return this;
    }

    /**
     * Permission Reminder
     * <p>
     * The permission reminder for the list: a line of text that appears in the footer of each campaign that explains why subscribers are receiving the email campaign.
     * (Required)
     */
    @JsonProperty("permission_reminder")
    public String getPermissionReminder() {
        return permissionReminder;
    }

    /**
     * Permission Reminder
     * <p>
     * The permission reminder for the list: a line of text that appears in the footer of each campaign that explains why subscribers are receiving the email campaign.
     * (Required)
     */
    @JsonProperty("permission_reminder")
    public void setPermissionReminder(String permissionReminder) {
        this.permissionReminder = permissionReminder;
    }

    public List withPermissionReminder(String permissionReminder) {
        this.permissionReminder = permissionReminder;
        return this;
    }

    /**
     * Use Archive Bar
     * <p>
     * Whether or not campaigns for this list use the Archive Bar in archives by default.
     */
    @JsonProperty("use_archive_bar")
    public Boolean getUseArchiveBar() {
        return useArchiveBar;
    }

    /**
     * Use Archive Bar
     * <p>
     * Whether or not campaigns for this list use the Archive Bar in archives by default.
     */
    @JsonProperty("use_archive_bar")
    public void setUseArchiveBar(Boolean useArchiveBar) {
        this.useArchiveBar = useArchiveBar;
    }

    public List withUseArchiveBar(Boolean useArchiveBar) {
        this.useArchiveBar = useArchiveBar;
        return this;
    }

    /**
     * Campaign Defaults
     * <p>
     * Default values for campaigns created for this list.
     * (Required)
     */
    @JsonProperty("campaign_defaults")
    public CampaignDefaults getCampaignDefaults() {
        return campaignDefaults;
    }

    /**
     * Campaign Defaults
     * <p>
     * Default values for campaigns created for this list.
     * (Required)
     */
    @JsonProperty("campaign_defaults")
    public void setCampaignDefaults(CampaignDefaults campaignDefaults) {
        this.campaignDefaults = campaignDefaults;
    }

    public List withCampaignDefaults(CampaignDefaults campaignDefaults) {
        this.campaignDefaults = campaignDefaults;
        return this;
    }

    /**
     * Notify on Subscribe
     * <p>
     * The email address to send subscribe notifications to, when enabled.
     */
    @JsonProperty("notify_on_subscribe")
    public String getNotifyOnSubscribe() {
        return notifyOnSubscribe;
    }

    /**
     * Notify on Subscribe
     * <p>
     * The email address to send subscribe notifications to, when enabled.
     */
    @JsonProperty("notify_on_subscribe")
    public void setNotifyOnSubscribe(String notifyOnSubscribe) {
        this.notifyOnSubscribe = notifyOnSubscribe;
    }

    public List withNotifyOnSubscribe(String notifyOnSubscribe) {
        this.notifyOnSubscribe = notifyOnSubscribe;
        return this;
    }

    /**
     * Notify on Unsubscribe
     * <p>
     * The email address to send unsubscribe notifications to, when enabled.
     */
    @JsonProperty("notify_on_unsubscribe")
    public String getNotifyOnUnsubscribe() {
        return notifyOnUnsubscribe;
    }

    /**
     * Notify on Unsubscribe
     * <p>
     * The email address to send unsubscribe notifications to, when enabled.
     */
    @JsonProperty("notify_on_unsubscribe")
    public void setNotifyOnUnsubscribe(String notifyOnUnsubscribe) {
        this.notifyOnUnsubscribe = notifyOnUnsubscribe;
    }

    public List withNotifyOnUnsubscribe(String notifyOnUnsubscribe) {
        this.notifyOnUnsubscribe = notifyOnUnsubscribe;
        return this;
    }

    /**
     * Creation Date
     * <p>
     * The date and time that this list was created in ISO 8601 format.
     */
    @JsonProperty("date_created")
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * Creation Date
     * <p>
     * The date and time that this list was created in ISO 8601 format.
     */
    @JsonProperty("date_created")
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public List withDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }

    /**
     * List Rating
     * <p>
     * An auto-generated activity score for the list (0-5).
     */
    @JsonProperty("list_rating")
    public Long getListRating() {
        return listRating;
    }

    /**
     * List Rating
     * <p>
     * An auto-generated activity score for the list (0-5).
     */
    @JsonProperty("list_rating")
    public void setListRating(Long listRating) {
        this.listRating = listRating;
    }

    public List withListRating(Long listRating) {
        this.listRating = listRating;
        return this;
    }

    /**
     * Email Type Option
     * <p>
     * Whether or not the list supports multiple formats for emails.
     * (Required)
     */
    @JsonProperty("email_type_option")
    public Boolean getEmailTypeOption() {
        return emailTypeOption;
    }

    /**
     * Email Type Option
     * <p>
     * Whether or not the list supports multiple formats for emails.
     * (Required)
     */
    @JsonProperty("email_type_option")
    public void setEmailTypeOption(Boolean emailTypeOption) {
        this.emailTypeOption = emailTypeOption;
    }

    public List withEmailTypeOption(Boolean emailTypeOption) {
        this.emailTypeOption = emailTypeOption;
        return this;
    }

    /**
     * Subscribe URL Short
     * <p>
     * Our eepurl shortened version of this list's subscribe form.
     */
    @JsonProperty("subscribe_url_short")
    public String getSubscribeUrlShort() {
        return subscribeUrlShort;
    }

    /**
     * Subscribe URL Short
     * <p>
     * Our eepurl shortened version of this list's subscribe form.
     */
    @JsonProperty("subscribe_url_short")
    public void setSubscribeUrlShort(String subscribeUrlShort) {
        this.subscribeUrlShort = subscribeUrlShort;
    }

    public List withSubscribeUrlShort(String subscribeUrlShort) {
        this.subscribeUrlShort = subscribeUrlShort;
        return this;
    }

    /**
     * Subscribe URL Long
     * <p>
     * The full version of this list's subscribe form (host will vary).
     */
    @JsonProperty("subscribe_url_long")
    public String getSubscribeUrlLong() {
        return subscribeUrlLong;
    }

    /**
     * Subscribe URL Long
     * <p>
     * The full version of this list's subscribe form (host will vary).
     */
    @JsonProperty("subscribe_url_long")
    public void setSubscribeUrlLong(String subscribeUrlLong) {
        this.subscribeUrlLong = subscribeUrlLong;
    }

    public List withSubscribeUrlLong(String subscribeUrlLong) {
        this.subscribeUrlLong = subscribeUrlLong;
        return this;
    }

    /**
     * Beamer Address
     * <p>
     * The email address to use for this list's Email Beamer.
     */
    @JsonProperty("beamer_address")
    public String getBeamerAddress() {
        return beamerAddress;
    }

    /**
     * Beamer Address
     * <p>
     * The email address to use for this list's Email Beamer.
     */
    @JsonProperty("beamer_address")
    public void setBeamerAddress(String beamerAddress) {
        this.beamerAddress = beamerAddress;
    }

    public List withBeamerAddress(String beamerAddress) {
        this.beamerAddress = beamerAddress;
        return this;
    }

    /**
     * Visibility
     * <p>
     * Whether this list is public (pub) or private (prv). Used internally for projects like Wavelength.
     */
    @JsonProperty("visibility")
    public List.Visibility getVisibility() {
        return visibility;
    }

    /**
     * Visibility
     * <p>
     * Whether this list is public (pub) or private (prv). Used internally for projects like Wavelength.
     */
    @JsonProperty("visibility")
    public void setVisibility(List.Visibility visibility) {
        this.visibility = visibility;
    }

    public List withVisibility(List.Visibility visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * Double Opt In
     * <p>
     * Whether or not to require the subscriber to confirm subscription via email.
     */
    @JsonProperty("double_optin")
    public Boolean getDoubleOptin() {
        return doubleOptin;
    }

    /**
     * Double Opt In
     * <p>
     * Whether or not to require the subscriber to confirm subscription via email.
     */
    @JsonProperty("double_optin")
    public void setDoubleOptin(Boolean doubleOptin) {
        this.doubleOptin = doubleOptin;
    }

    public List withDoubleOptin(Boolean doubleOptin) {
        this.doubleOptin = doubleOptin;
        return this;
    }

    /**
     * Has Welcome
     * <p>
     * Whether or not this list has a welcome automation connected. Welcome Automations: welcomeSeries, singleWelcome, emailFollowup.
     */
    @JsonProperty("has_welcome")
    public Boolean getHasWelcome() {
        return hasWelcome;
    }

    /**
     * Has Welcome
     * <p>
     * Whether or not this list has a welcome automation connected. Welcome Automations: welcomeSeries, singleWelcome, emailFollowup.
     */
    @JsonProperty("has_welcome")
    public void setHasWelcome(Boolean hasWelcome) {
        this.hasWelcome = hasWelcome;
    }

    public List withHasWelcome(Boolean hasWelcome) {
        this.hasWelcome = hasWelcome;
        return this;
    }

    /**
     * Marketing Permissions
     * <p>
     * Whether or not the list has marketing permissions (eg. GDPR) enabled.
     */
    @JsonProperty("marketing_permissions")
    public Boolean getMarketingPermissions() {
        return marketingPermissions;
    }

    /**
     * Marketing Permissions
     * <p>
     * Whether or not the list has marketing permissions (eg. GDPR) enabled.
     */
    @JsonProperty("marketing_permissions")
    public void setMarketingPermissions(Boolean marketingPermissions) {
        this.marketingPermissions = marketingPermissions;
    }

    public List withMarketingPermissions(Boolean marketingPermissions) {
        this.marketingPermissions = marketingPermissions;
        return this;
    }

    /**
     * Modules
     * <p>
     * Any list-specific modules installed for this list.
     */
    @JsonProperty("modules")
    public java.util.List<Object> getModules() {
        return modules;
    }

    /**
     * Modules
     * <p>
     * Any list-specific modules installed for this list.
     */
    @JsonProperty("modules")
    public void setModules(java.util.List<Object> modules) {
        this.modules = modules;
    }

    public List withModules(java.util.List<Object> modules) {
        this.modules = modules;
        return this;
    }

    /**
     * Statistics
     * <p>
     * Various stats and counts for the list. Many of these are cached for at least five minutes.
     */
    @JsonProperty("stats")
    public Stats getStats() {
        return stats;
    }

    /**
     * Statistics
     * <p>
     * Various stats and counts for the list. Many of these are cached for at least five minutes.
     */
    @JsonProperty("stats")
    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public List withStats(Stats stats) {
        this.stats = stats;
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

    public List withLinks(java.util.List<Link> links) {
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

    public List withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(campaignDefaults).append(visibility).append(useArchiveBar).append(hasWelcome).append(notifyOnSubscribe).append(modules).append(webId).append(dateCreated).append(subscribeUrlShort).append(subscribeUrlLong).append(stats).append(permissionReminder).append(contact).append(doubleOptin).append(name).append(beamerAddress).append(listRating).append(links).append(id).append(additionalProperties).append(emailTypeOption).append(notifyOnUnsubscribe).append(marketingPermissions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof List) == false) {
            return false;
        }
        List rhs = ((List) other);
        return new EqualsBuilder().append(campaignDefaults, rhs.campaignDefaults).append(visibility, rhs.visibility).append(useArchiveBar, rhs.useArchiveBar).append(hasWelcome, rhs.hasWelcome).append(notifyOnSubscribe, rhs.notifyOnSubscribe).append(modules, rhs.modules).append(webId, rhs.webId).append(dateCreated, rhs.dateCreated).append(subscribeUrlShort, rhs.subscribeUrlShort).append(subscribeUrlLong, rhs.subscribeUrlLong).append(stats, rhs.stats).append(permissionReminder, rhs.permissionReminder).append(contact, rhs.contact).append(doubleOptin, rhs.doubleOptin).append(name, rhs.name).append(beamerAddress, rhs.beamerAddress).append(listRating, rhs.listRating).append(links, rhs.links).append(id, rhs.id).append(additionalProperties, rhs.additionalProperties).append(emailTypeOption, rhs.emailTypeOption).append(notifyOnUnsubscribe, rhs.notifyOnUnsubscribe).append(marketingPermissions, rhs.marketingPermissions).isEquals();
    }

    public enum Visibility {

        PUB("pub"),
        PRV("prv");
        private final String value;
        private final static Map<String, List.Visibility> CONSTANTS = new HashMap<String, List.Visibility>();

        static {
            for (List.Visibility c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Visibility(String value) {
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
        public static List.Visibility fromValue(String value) {
            List.Visibility constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
