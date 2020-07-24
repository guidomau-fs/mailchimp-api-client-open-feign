
package com.brightmarket.mailchimp.api.model.lists;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.brightmarket.mailchimp.api.model.Link;
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
 * List Members
 * <p>
 * Individuals who are currently or have been previously subscribed to this list, including members who have bounced or unsubscribed.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "email_address",
        "unique_email_id",
        "email_type",
        "status",
        "status_if_new",
        "merge_fields",
        "interests",
        "stats",
        "ip_signup",
        "timestamp_signup",
        "ip_opt",
        "timestamp_opt",
        "member_rating",
        "last_changed",
        "language",
        "vip",
        "email_client",
        "location",
        "marketing_permissions",
        "last_note",
        "list_id",
        "tags_count",
        "tags",
        "source",
        "_links"
})
public class Member implements Serializable {

    /**
     * Email ID
     * <p>
     * The MD5 hash of the list member's email address.
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The MD5 hash of the list member's email address.")
    private String id;
    /**
     * Email Address
     * <p>
     * Email address for a subscriber.
     * (Required)
     */
    @JsonProperty("email_address")
    @JsonPropertyDescription("Email address for a subscriber.")
    private String emailAddress;
    /**
     * Unique Email ID
     * <p>
     * An identifier for the address across all of Mailchimp.
     */
    @JsonProperty("unique_email_id")
    @JsonPropertyDescription("An identifier for the address across all of Mailchimp.")
    private String uniqueEmailId;
    /**
     * Email Type
     * <p>
     * Type of email this member asked to get ('html' or 'text').
     */
    @JsonProperty("email_type")
    @JsonPropertyDescription("Type of email this member asked to get ('html' or 'text').")
    private String emailType;
    /**
     * Status
     * <p>
     * Subscriber's current status ('subscribed', 'unsubscribed', 'cleaned', 'transactional', or 'pending').
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Subscriber's current status ('subscribed', 'unsubscribed', 'cleaned', 'transactional', or 'pending').")
    private Member.Status status;
    /**
     * Default Status
     * <p>
     * Subscriber's status ('subscribed', 'unsubscribed', 'cleaned', 'transactional', or 'pending'), to be used only on a PUT request if the email is not already present on the list.
     */
    @JsonProperty("status_if_new")
    @JsonPropertyDescription("Subscriber's status ('subscribed', 'unsubscribed', 'cleaned', 'transactional', or 'pending'), to be used only on a PUT request if the email is not already present on the list.")
    private Member.StatusIfNew statusIfNew;
    /**
     * Member Merge Var
     * <p>
     * An individual merge var and value for a member.
     */
    @JsonProperty("merge_fields")
    @JsonPropertyDescription("An individual merge var and value for a member.")
    private MergeFields mergeFields;
    /**
     * Subscriber Interests
     * <p>
     * The key of this object's properties is the ID of the interest in question.
     */
    @JsonProperty("interests")
    @JsonPropertyDescription("The key of this object's properties is the ID of the interest in question.")
    private Interests interests;
    /**
     * Subscriber Stats
     * <p>
     * General open rates for this subscriber.
     */
    @JsonProperty("stats")
    @JsonPropertyDescription("General open rates for this subscriber.")
    private SubscriberStats stats;
    /**
     * Signup IP
     * <p>
     * IP address the subscriber signed up from.
     */
    @JsonProperty("ip_signup")
    @JsonPropertyDescription("IP address the subscriber signed up from.")
    private String ipSignup;
    /**
     * Signup Timestamp
     * <p>
     * Date and time the subscriber signed up for the list.
     */
    @JsonProperty("timestamp_signup")
    @JsonPropertyDescription("Date and time the subscriber signed up for the list.")
    private Date timestampSignup;
    /**
     * Opt-in IP
     * <p>
     * IP address the subscriber confirmed their opt-in status.
     */
    @JsonProperty("ip_opt")
    @JsonPropertyDescription("IP address the subscriber confirmed their opt-in status.")
    private String ipOpt;
    /**
     * Opt-in Timestamp
     * <p>
     * Date and time the subscribe confirmed their opt-in status.
     */
    @JsonProperty("timestamp_opt")
    @JsonPropertyDescription("Date and time the subscribe confirmed their opt-in status.")
    private Date timestampOpt;
    /**
     * Member Rating
     * <p>
     * Star rating for this member between 1 and 5.
     */
    @JsonProperty("member_rating")
    @JsonPropertyDescription("Star rating for this member between 1 and 5.")
    private Long memberRating;
    /**
     * Last Changed Date
     * <p>
     * Date and time the member's info was last changed.
     */
    @JsonProperty("last_changed")
    @JsonPropertyDescription("Date and time the member's info was last changed.")
    private Date lastChanged;
    /**
     * Language
     * <p>
     * If set/detected, the language of the subscriber.
     */
    @JsonProperty("language")
    @JsonPropertyDescription("If set/detected, the language of the subscriber.")
    private String language;
    /**
     * VIP
     * <p>
     * VIP status for subscriber.
     */
    @JsonProperty("vip")
    @JsonPropertyDescription("VIP status for subscriber.")
    private Boolean vip;
    /**
     * Email Client
     * <p>
     * The email client the address as using.
     */
    @JsonProperty("email_client")
    @JsonPropertyDescription("The email client the address as using.")
    private String emailClient;
    /**
     * Location
     * <p>
     * Subscriber location information.
     */
    @JsonProperty("location")
    @JsonPropertyDescription("Subscriber location information.")
    private Location location;
    /**
     * Marketing Permissions
     * <p>
     * The marketing permissions for the subscriber.
     */
    @JsonProperty("marketing_permissions")
    @JsonPropertyDescription("The marketing permissions for the subscriber.")
    private List<MarketingPermission> marketingPermissions = null;
    /**
     * Notes
     * <p>
     * The most recent Note added about this member.
     */
    @JsonProperty("last_note")
    @JsonPropertyDescription("The most recent Note added about this member.")
    private LastNote lastNote;
    /**
     * List ID
     * <p>
     * The id for the list.
     */
    @JsonProperty("list_id")
    @JsonPropertyDescription("The id for the list.")
    private String listId;
    /**
     * Tags Count
     * <p>
     * The number of tags applied to this member.
     */
    @JsonProperty("tags_count")
    @JsonPropertyDescription("The number of tags applied to this member.")
    private Long tagsCount;
    /**
     * Tags
     * <p>
     * The tags assigned to this list member.
     */
    @JsonProperty("tags")
    @JsonPropertyDescription("The tags assigned to this list member.")
    private Tags tags;
    /**
     * Subscriber Source
     * <p>
     * The source from which the subscriber was added to this list.
     */
    @JsonProperty("source")
    @JsonPropertyDescription("The source from which the subscriber was added to this list.")
    private String source;
    /**
     * Links
     * <p>
     */
    @JsonProperty("_links")
    @JsonPropertyDescription("")
    private List<Link> links = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 5193066342627737762L;

    /**
     * No args constructor for use in serialization
     */
    public Member() {
    }

    /**
     * @param language
     * @param source
     * @param listId
     * @param emailAddress
     * @param emailType
     * @param statusIfNew
     * @param stats
     * @param links
     * @param id
     * @param vip
     * @param marketingPermissions
     * @param tagsCount
     * @param uniqueEmailId
     * @param emailClient
     * @param timestampSignup
     * @param lastChanged
     * @param lastNote
     * @param tags
     * @param ipSignup
     * @param ipOpt
     * @param timestampOpt
     * @param memberRating
     * @param location
     * @param interests
     * @param mergeFields
     * @param status
     */
    public Member(String id, String emailAddress, String uniqueEmailId, String emailType, Member.Status status, Member.StatusIfNew statusIfNew, MergeFields mergeFields, Interests interests, SubscriberStats stats, String ipSignup, Date timestampSignup, String ipOpt, Date timestampOpt, Long memberRating, Date lastChanged, String language, Boolean vip, String emailClient, Location location, List<MarketingPermission> marketingPermissions, LastNote lastNote, String listId, Long tagsCount, Tags tags, String source, List<Link> links) {
        super();
        this.id = id;
        this.emailAddress = emailAddress;
        this.uniqueEmailId = uniqueEmailId;
        this.emailType = emailType;
        this.status = status;
        this.statusIfNew = statusIfNew;
        this.mergeFields = mergeFields;
        this.interests = interests;
        this.stats = stats;
        this.ipSignup = ipSignup;
        this.timestampSignup = timestampSignup;
        this.ipOpt = ipOpt;
        this.timestampOpt = timestampOpt;
        this.memberRating = memberRating;
        this.lastChanged = lastChanged;
        this.language = language;
        this.vip = vip;
        this.emailClient = emailClient;
        this.location = location;
        this.marketingPermissions = marketingPermissions;
        this.lastNote = lastNote;
        this.listId = listId;
        this.tagsCount = tagsCount;
        this.tags = tags;
        this.source = source;
        this.links = links;
    }

    /**
     * Email ID
     * <p>
     * The MD5 hash of the list member's email address.
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Email ID
     * <p>
     * The MD5 hash of the list member's email address.
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Member withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Email Address
     * <p>
     * Email address for a subscriber.
     * (Required)
     */
    @JsonProperty("email_address")
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Email Address
     * <p>
     * Email address for a subscriber.
     * (Required)
     */
    @JsonProperty("email_address")
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Member withEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * Unique Email ID
     * <p>
     * An identifier for the address across all of Mailchimp.
     */
    @JsonProperty("unique_email_id")
    public String getUniqueEmailId() {
        return uniqueEmailId;
    }

    /**
     * Unique Email ID
     * <p>
     * An identifier for the address across all of Mailchimp.
     */
    @JsonProperty("unique_email_id")
    public void setUniqueEmailId(String uniqueEmailId) {
        this.uniqueEmailId = uniqueEmailId;
    }

    public Member withUniqueEmailId(String uniqueEmailId) {
        this.uniqueEmailId = uniqueEmailId;
        return this;
    }

    /**
     * Email Type
     * <p>
     * Type of email this member asked to get ('html' or 'text').
     */
    @JsonProperty("email_type")
    public String getEmailType() {
        return emailType;
    }

    /**
     * Email Type
     * <p>
     * Type of email this member asked to get ('html' or 'text').
     */
    @JsonProperty("email_type")
    public void setEmailType(String emailType) {
        this.emailType = emailType;
    }

    public Member withEmailType(String emailType) {
        this.emailType = emailType;
        return this;
    }

    /**
     * Status
     * <p>
     * Subscriber's current status ('subscribed', 'unsubscribed', 'cleaned', 'transactional', or 'pending').
     */
    @JsonProperty("status")
    public Member.Status getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * Subscriber's current status ('subscribed', 'unsubscribed', 'cleaned', 'transactional', or 'pending').
     */
    @JsonProperty("status")
    public void setStatus(Member.Status status) {
        this.status = status;
    }

    public Member withStatus(Member.Status status) {
        this.status = status;
        return this;
    }

    /**
     * Default Status
     * <p>
     * Subscriber's status ('subscribed', 'unsubscribed', 'cleaned', 'transactional', or 'pending'), to be used only on a PUT request if the email is not already present on the list.
     */
    @JsonProperty("status_if_new")
    public Member.StatusIfNew getStatusIfNew() {
        return statusIfNew;
    }

    /**
     * Default Status
     * <p>
     * Subscriber's status ('subscribed', 'unsubscribed', 'cleaned', 'transactional', or 'pending'), to be used only on a PUT request if the email is not already present on the list.
     */
    @JsonProperty("status_if_new")
    public void setStatusIfNew(Member.StatusIfNew statusIfNew) {
        this.statusIfNew = statusIfNew;
    }

    public Member withStatusIfNew(Member.StatusIfNew statusIfNew) {
        this.statusIfNew = statusIfNew;
        return this;
    }

    /**
     * Member Merge Var
     * <p>
     * An individual merge var and value for a member.
     */
    @JsonProperty("merge_fields")
    public MergeFields getMergeFields() {
        return mergeFields;
    }

    /**
     * Member Merge Var
     * <p>
     * An individual merge var and value for a member.
     */
    @JsonProperty("merge_fields")
    public void setMergeFields(MergeFields mergeFields) {
        this.mergeFields = mergeFields;
    }

    public Member withMergeFields(MergeFields mergeFields) {
        this.mergeFields = mergeFields;
        return this;
    }

    /**
     * Subscriber Interests
     * <p>
     * The key of this object's properties is the ID of the interest in question.
     */
    @JsonProperty("interests")
    public Interests getInterests() {
        return interests;
    }

    /**
     * Subscriber Interests
     * <p>
     * The key of this object's properties is the ID of the interest in question.
     */
    @JsonProperty("interests")
    public void setInterests(Interests interests) {
        this.interests = interests;
    }

    public Member withInterests(Interests interests) {
        this.interests = interests;
        return this;
    }

    /**
     * Subscriber Stats
     * <p>
     * General open rates for this subscriber.
     */
    @JsonProperty("stats")
    public SubscriberStats getStats() {
        return stats;
    }

    /**
     * Subscriber Stats
     * <p>
     * General open rates for this subscriber.
     */
    @JsonProperty("stats")
    public void setStats(SubscriberStats stats) {
        this.stats = stats;
    }

    public Member withStats(SubscriberStats stats) {
        this.stats = stats;
        return this;
    }

    /**
     * Signup IP
     * <p>
     * IP address the subscriber signed up from.
     */
    @JsonProperty("ip_signup")
    public String getIpSignup() {
        return ipSignup;
    }

    /**
     * Signup IP
     * <p>
     * IP address the subscriber signed up from.
     */
    @JsonProperty("ip_signup")
    public void setIpSignup(String ipSignup) {
        this.ipSignup = ipSignup;
    }

    public Member withIpSignup(String ipSignup) {
        this.ipSignup = ipSignup;
        return this;
    }

    /**
     * Signup Timestamp
     * <p>
     * Date and time the subscriber signed up for the list.
     */
    @JsonProperty("timestamp_signup")
    public Date getTimestampSignup() {
        return timestampSignup;
    }

    /**
     * Signup Timestamp
     * <p>
     * Date and time the subscriber signed up for the list.
     */
    @JsonProperty("timestamp_signup")
    public void setTimestampSignup(Date timestampSignup) {
        this.timestampSignup = timestampSignup;
    }

    public Member withTimestampSignup(Date timestampSignup) {
        this.timestampSignup = timestampSignup;
        return this;
    }

    /**
     * Opt-in IP
     * <p>
     * IP address the subscriber confirmed their opt-in status.
     */
    @JsonProperty("ip_opt")
    public String getIpOpt() {
        return ipOpt;
    }

    /**
     * Opt-in IP
     * <p>
     * IP address the subscriber confirmed their opt-in status.
     */
    @JsonProperty("ip_opt")
    public void setIpOpt(String ipOpt) {
        this.ipOpt = ipOpt;
    }

    public Member withIpOpt(String ipOpt) {
        this.ipOpt = ipOpt;
        return this;
    }

    /**
     * Opt-in Timestamp
     * <p>
     * Date and time the subscribe confirmed their opt-in status.
     */
    @JsonProperty("timestamp_opt")
    public Date getTimestampOpt() {
        return timestampOpt;
    }

    /**
     * Opt-in Timestamp
     * <p>
     * Date and time the subscribe confirmed their opt-in status.
     */
    @JsonProperty("timestamp_opt")
    public void setTimestampOpt(Date timestampOpt) {
        this.timestampOpt = timestampOpt;
    }

    public Member withTimestampOpt(Date timestampOpt) {
        this.timestampOpt = timestampOpt;
        return this;
    }

    /**
     * Member Rating
     * <p>
     * Star rating for this member between 1 and 5.
     */
    @JsonProperty("member_rating")
    public Long getMemberRating() {
        return memberRating;
    }

    /**
     * Member Rating
     * <p>
     * Star rating for this member between 1 and 5.
     */
    @JsonProperty("member_rating")
    public void setMemberRating(Long memberRating) {
        this.memberRating = memberRating;
    }

    public Member withMemberRating(Long memberRating) {
        this.memberRating = memberRating;
        return this;
    }

    /**
     * Last Changed Date
     * <p>
     * Date and time the member's info was last changed.
     */
    @JsonProperty("last_changed")
    public Date getLastChanged() {
        return lastChanged;
    }

    /**
     * Last Changed Date
     * <p>
     * Date and time the member's info was last changed.
     */
    @JsonProperty("last_changed")
    public void setLastChanged(Date lastChanged) {
        this.lastChanged = lastChanged;
    }

    public Member withLastChanged(Date lastChanged) {
        this.lastChanged = lastChanged;
        return this;
    }

    /**
     * Language
     * <p>
     * If set/detected, the language of the subscriber.
     */
    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    /**
     * Language
     * <p>
     * If set/detected, the language of the subscriber.
     */
    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    public Member withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * VIP
     * <p>
     * VIP status for subscriber.
     */
    @JsonProperty("vip")
    public Boolean getVip() {
        return vip;
    }

    /**
     * VIP
     * <p>
     * VIP status for subscriber.
     */
    @JsonProperty("vip")
    public void setVip(Boolean vip) {
        this.vip = vip;
    }

    public Member withVip(Boolean vip) {
        this.vip = vip;
        return this;
    }

    /**
     * Email Client
     * <p>
     * The email client the address as using.
     */
    @JsonProperty("email_client")
    public String getEmailClient() {
        return emailClient;
    }

    /**
     * Email Client
     * <p>
     * The email client the address as using.
     */
    @JsonProperty("email_client")
    public void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }

    public Member withEmailClient(String emailClient) {
        this.emailClient = emailClient;
        return this;
    }

    /**
     * Location
     * <p>
     * Subscriber location information.
     */
    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    /**
     * Location
     * <p>
     * Subscriber location information.
     */
    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    public Member withLocation(Location location) {
        this.location = location;
        return this;
    }

    /**
     * Marketing Permissions
     * <p>
     * The marketing permissions for the subscriber.
     */
    @JsonProperty("marketing_permissions")
    public List<MarketingPermission> getMarketingPermissions() {
        return marketingPermissions;
    }

    /**
     * Marketing Permissions
     * <p>
     * The marketing permissions for the subscriber.
     */
    @JsonProperty("marketing_permissions")
    public void setMarketingPermissions(List<MarketingPermission> marketingPermissions) {
        this.marketingPermissions = marketingPermissions;
    }

    public Member withMarketingPermissions(List<MarketingPermission> marketingPermissions) {
        this.marketingPermissions = marketingPermissions;
        return this;
    }

    /**
     * Notes
     * <p>
     * The most recent Note added about this member.
     */
    @JsonProperty("last_note")
    public LastNote getLastNote() {
        return lastNote;
    }

    /**
     * Notes
     * <p>
     * The most recent Note added about this member.
     */
    @JsonProperty("last_note")
    public void setLastNote(LastNote lastNote) {
        this.lastNote = lastNote;
    }

    public Member withLastNote(LastNote lastNote) {
        this.lastNote = lastNote;
        return this;
    }

    /**
     * List ID
     * <p>
     * The id for the list.
     */
    @JsonProperty("list_id")
    public String getListId() {
        return listId;
    }

    /**
     * List ID
     * <p>
     * The id for the list.
     */
    @JsonProperty("list_id")
    public void setListId(String listId) {
        this.listId = listId;
    }

    public Member withListId(String listId) {
        this.listId = listId;
        return this;
    }

    /**
     * Tags Count
     * <p>
     * The number of tags applied to this member.
     */
    @JsonProperty("tags_count")
    public Long getTagsCount() {
        return tagsCount;
    }

    /**
     * Tags Count
     * <p>
     * The number of tags applied to this member.
     */
    @JsonProperty("tags_count")
    public void setTagsCount(Long tagsCount) {
        this.tagsCount = tagsCount;
    }

    public Member withTagsCount(Long tagsCount) {
        this.tagsCount = tagsCount;
        return this;
    }

    /**
     * Tags
     * <p>
     * The tags assigned to this list member.
     */
    @JsonProperty("tags")
    public Tags getTags() {
        return tags;
    }

    /**
     * Tags
     * <p>
     * The tags assigned to this list member.
     */
    @JsonProperty("tags")
    public void setTags(Tags tags) {
        this.tags = tags;
    }

    public Member withTags(Tags tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Subscriber Source
     * <p>
     * The source from which the subscriber was added to this list.
     */
    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    /**
     * Subscriber Source
     * <p>
     * The source from which the subscriber was added to this list.
     */
    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    public Member withSource(String source) {
        this.source = source;
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

    public Member withLinks(List<Link> links) {
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

    public Member withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(language).append(source).append(listId).append(emailAddress).append(emailType).append(statusIfNew).append(stats).append(links).append(id).append(vip).append(marketingPermissions).append(tagsCount).append(uniqueEmailId).append(emailClient).append(timestampSignup).append(lastChanged).append(lastNote).append(tags).append(ipSignup).append(ipOpt).append(timestampOpt).append(memberRating).append(location).append(additionalProperties).append(interests).append(mergeFields).append(status).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Member) == false) {
            return false;
        }
        Member rhs = ((Member) other);
        return new EqualsBuilder().append(language, rhs.language).append(source, rhs.source).append(listId, rhs.listId).append(emailAddress, rhs.emailAddress).append(emailType, rhs.emailType).append(statusIfNew, rhs.statusIfNew).append(stats, rhs.stats).append(links, rhs.links).append(id, rhs.id).append(vip, rhs.vip).append(marketingPermissions, rhs.marketingPermissions).append(tagsCount, rhs.tagsCount).append(uniqueEmailId, rhs.uniqueEmailId).append(emailClient, rhs.emailClient).append(timestampSignup, rhs.timestampSignup).append(lastChanged, rhs.lastChanged).append(lastNote, rhs.lastNote).append(tags, rhs.tags).append(ipSignup, rhs.ipSignup).append(ipOpt, rhs.ipOpt).append(timestampOpt, rhs.timestampOpt).append(memberRating, rhs.memberRating).append(location, rhs.location).append(additionalProperties, rhs.additionalProperties).append(interests, rhs.interests).append(mergeFields, rhs.mergeFields).append(status, rhs.status).isEquals();
    }

    public enum Status {

        SUBSCRIBED("subscribed"),
        UNSUBSCRIBED("unsubscribed"),
        CLEANED("cleaned"),
        TRANSACTIONAL("transactional"),
        PENDING("pending");
        private final String value;
        private final static Map<String, Member.Status> CONSTANTS = new HashMap<String, Member.Status>();

        static {
            for (Member.Status c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Status(String value) {
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
        public static Member.Status fromValue(String value) {
            Member.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum StatusIfNew {

        SUBSCRIBED("subscribed"),
        UNSUBSCRIBED("unsubscribed"),
        CLEANED("cleaned"),
        TRANSACTIONAL("transactional"),
        PENDING("pending");
        private final String value;
        private final static Map<String, Member.StatusIfNew> CONSTANTS = new HashMap<String, Member.StatusIfNew>();

        static {
            for (Member.StatusIfNew c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private StatusIfNew(String value) {
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
        public static Member.StatusIfNew fromValue(String value) {
            Member.StatusIfNew constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
