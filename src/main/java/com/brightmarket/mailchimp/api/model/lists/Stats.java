
package com.brightmarket.mailchimp.api.model.lists;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


/**
 * Statistics
 * <p>
 * Various stats and counts for the list. Many of these are cached for at least five minutes.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "member_count",
    "unsubscribe_count",
    "cleaned_count",
    "member_count_since_send",
    "unsubscribe_count_since_send",
    "cleaned_count_since_send",
    "campaign_count",
    "campaign_last_sent",
    "merge_field_count",
    "avg_sub_rate",
    "avg_unsub_rate",
    "target_sub_rate",
    "open_rate",
    "click_rate",
    "last_sub_date",
    "last_unsub_date"
})
public class Stats implements Serializable
{

    /**
     * Member Count
     * <p>
     * The number of active members in the given list.
     *
     */
    @JsonProperty("member_count")
    @JsonPropertyDescription("The number of active members in the given list.")
    private Long memberCount;
    /**
     * Unsubscribe Count
     * <p>
     * The number of members who have unsubscribed from the given list.
     *
     */
    @JsonProperty("unsubscribe_count")
    @JsonPropertyDescription("The number of members who have unsubscribed from the given list.")
    private Long unsubscribeCount;
    /**
     * Cleaned Count
     * <p>
     * The number of members cleaned from the given list.
     *
     */
    @JsonProperty("cleaned_count")
    @JsonPropertyDescription("The number of members cleaned from the given list.")
    private Long cleanedCount;
    /**
     * Member Count Since Send
     * <p>
     * The number of active members in the given list since the last campaign was sent.
     *
     */
    @JsonProperty("member_count_since_send")
    @JsonPropertyDescription("The number of active members in the given list since the last campaign was sent.")
    private Long memberCountSinceSend;
    /**
     * Unsubscribe Count Since Send
     * <p>
     * The number of members who have unsubscribed since the last campaign was sent.
     *
     */
    @JsonProperty("unsubscribe_count_since_send")
    @JsonPropertyDescription("The number of members who have unsubscribed since the last campaign was sent.")
    private Long unsubscribeCountSinceSend;
    /**
     * Cleaned Count Since Send
     * <p>
     * The number of members cleaned from the given list since the last campaign was sent.
     *
     */
    @JsonProperty("cleaned_count_since_send")
    @JsonPropertyDescription("The number of members cleaned from the given list since the last campaign was sent.")
    private Long cleanedCountSinceSend;
    /**
     * Campaign Count
     * <p>
     * The number of campaigns in any status that use this list.
     *
     */
    @JsonProperty("campaign_count")
    @JsonPropertyDescription("The number of campaigns in any status that use this list.")
    private Long campaignCount;
    /**
     * Campaign Last Sent
     * <p>
     * The date and time the last campaign was sent to this list in ISO 8601 format.
     *
     */
    @JsonProperty("campaign_last_sent")
    @JsonPropertyDescription("The date and time the last campaign was sent to this list in ISO 8601 format.")
    private Date campaignLastSent;
    /**
     * Merge Var Count
     * <p>
     * The number of merge vars for this list (not including the required EMAIL one).
     *
     */
    @JsonProperty("merge_field_count")
    @JsonPropertyDescription("The number of merge vars for this list (not including the required EMAIL one).")
    private Long mergeFieldCount;
    /**
     * Average Subscription Rate
     * <p>
     * The average number of subscriptions per month for the list (not returned if we haven't calculated it yet).
     *
     */
    @JsonProperty("avg_sub_rate")
    @JsonPropertyDescription("The average number of subscriptions per month for the list (not returned if we haven't calculated it yet).")
    private Double avgSubRate;
    /**
     * Average Unsubscription Rate
     * <p>
     * The average number of unsubscriptions per month for the list (not returned if we haven't calculated it yet).
     *
     */
    @JsonProperty("avg_unsub_rate")
    @JsonPropertyDescription("The average number of unsubscriptions per month for the list (not returned if we haven't calculated it yet).")
    private Double avgUnsubRate;
    /**
     * Average Subscription Rate
     * <p>
     * The target numberof subscriptions per month for the list to keep it growing (not returned if we haven't calculated it yet).
     *
     */
    @JsonProperty("target_sub_rate")
    @JsonPropertyDescription("The target numberof subscriptions per month for the list to keep it growing (not returned if we haven't calculated it yet).")
    private Double targetSubRate;
    /**
     * Open Rate
     * <p>
     * The average open rate (a percentage represented as a number between 0 and 100) per campaign for the list (not returned if we haven't calculated it yet).
     *
     */
    @JsonProperty("open_rate")
    @JsonPropertyDescription("The average open rate (a percentage represented as a number between 0 and 100) per campaign for the list (not returned if we haven't calculated it yet).")
    private Double openRate;
    /**
     * Click Rate
     * <p>
     * The average click rate (a percentage represented as a number between 0 and 100) per campaign for the list (not returned if we haven't calculated it yet).
     *
     */
    @JsonProperty("click_rate")
    @JsonPropertyDescription("The average click rate (a percentage represented as a number between 0 and 100) per campaign for the list (not returned if we haven't calculated it yet).")
    private Double clickRate;
    /**
     * Date of Last List Subscribe
     * <p>
     * The date and time of the last time someone subscribed to this list in ISO 8601 format.
     *
     */
    @JsonProperty("last_sub_date")
    @JsonPropertyDescription("The date and time of the last time someone subscribed to this list in ISO 8601 format.")
    private Date lastSubDate;
    /**
     * Date of Last List Unsubscribe
     * <p>
     * The date and time of the last time someone unsubscribed from this list in ISO 8601 format.
     *
     */
    @JsonProperty("last_unsub_date")
    @JsonPropertyDescription("The date and time of the last time someone unsubscribed from this list in ISO 8601 format.")
    private Date lastUnsubDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6693039165065881883L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Stats() {
    }

    /**
     *
     * @param openRate
     * @param campaignLastSent
     * @param memberCount
     * @param mergeFieldCount
     * @param unsubscribeCountSinceSend
     * @param unsubscribeCount
     * @param cleanedCount
     * @param lastUnsubDate
     * @param memberCountSinceSend
     * @param avgUnsubRate
     * @param clickRate
     * @param cleanedCountSinceSend
     * @param targetSubRate
     * @param campaignCount
     * @param avgSubRate
     * @param lastSubDate
     */
    public Stats(Long memberCount, Long unsubscribeCount, Long cleanedCount, Long memberCountSinceSend, Long unsubscribeCountSinceSend, Long cleanedCountSinceSend, Long campaignCount, Date campaignLastSent, Long mergeFieldCount, Double avgSubRate, Double avgUnsubRate, Double targetSubRate, Double openRate, Double clickRate, Date lastSubDate, Date lastUnsubDate) {
        super();
        this.memberCount = memberCount;
        this.unsubscribeCount = unsubscribeCount;
        this.cleanedCount = cleanedCount;
        this.memberCountSinceSend = memberCountSinceSend;
        this.unsubscribeCountSinceSend = unsubscribeCountSinceSend;
        this.cleanedCountSinceSend = cleanedCountSinceSend;
        this.campaignCount = campaignCount;
        this.campaignLastSent = campaignLastSent;
        this.mergeFieldCount = mergeFieldCount;
        this.avgSubRate = avgSubRate;
        this.avgUnsubRate = avgUnsubRate;
        this.targetSubRate = targetSubRate;
        this.openRate = openRate;
        this.clickRate = clickRate;
        this.lastSubDate = lastSubDate;
        this.lastUnsubDate = lastUnsubDate;
    }

    /**
     * Member Count
     * <p>
     * The number of active members in the given list.
     *
     */
    @JsonProperty("member_count")
    public Long getMemberCount() {
        return memberCount;
    }

    /**
     * Member Count
     * <p>
     * The number of active members in the given list.
     *
     */
    @JsonProperty("member_count")
    public void setMemberCount(Long memberCount) {
        this.memberCount = memberCount;
    }

    public Stats withMemberCount(Long memberCount) {
        this.memberCount = memberCount;
        return this;
    }

    /**
     * Unsubscribe Count
     * <p>
     * The number of members who have unsubscribed from the given list.
     *
     */
    @JsonProperty("unsubscribe_count")
    public Long getUnsubscribeCount() {
        return unsubscribeCount;
    }

    /**
     * Unsubscribe Count
     * <p>
     * The number of members who have unsubscribed from the given list.
     *
     */
    @JsonProperty("unsubscribe_count")
    public void setUnsubscribeCount(Long unsubscribeCount) {
        this.unsubscribeCount = unsubscribeCount;
    }

    public Stats withUnsubscribeCount(Long unsubscribeCount) {
        this.unsubscribeCount = unsubscribeCount;
        return this;
    }

    /**
     * Cleaned Count
     * <p>
     * The number of members cleaned from the given list.
     *
     */
    @JsonProperty("cleaned_count")
    public Long getCleanedCount() {
        return cleanedCount;
    }

    /**
     * Cleaned Count
     * <p>
     * The number of members cleaned from the given list.
     *
     */
    @JsonProperty("cleaned_count")
    public void setCleanedCount(Long cleanedCount) {
        this.cleanedCount = cleanedCount;
    }

    public Stats withCleanedCount(Long cleanedCount) {
        this.cleanedCount = cleanedCount;
        return this;
    }

    /**
     * Member Count Since Send
     * <p>
     * The number of active members in the given list since the last campaign was sent.
     *
     */
    @JsonProperty("member_count_since_send")
    public Long getMemberCountSinceSend() {
        return memberCountSinceSend;
    }

    /**
     * Member Count Since Send
     * <p>
     * The number of active members in the given list since the last campaign was sent.
     *
     */
    @JsonProperty("member_count_since_send")
    public void setMemberCountSinceSend(Long memberCountSinceSend) {
        this.memberCountSinceSend = memberCountSinceSend;
    }

    public Stats withMemberCountSinceSend(Long memberCountSinceSend) {
        this.memberCountSinceSend = memberCountSinceSend;
        return this;
    }

    /**
     * Unsubscribe Count Since Send
     * <p>
     * The number of members who have unsubscribed since the last campaign was sent.
     *
     */
    @JsonProperty("unsubscribe_count_since_send")
    public Long getUnsubscribeCountSinceSend() {
        return unsubscribeCountSinceSend;
    }

    /**
     * Unsubscribe Count Since Send
     * <p>
     * The number of members who have unsubscribed since the last campaign was sent.
     *
     */
    @JsonProperty("unsubscribe_count_since_send")
    public void setUnsubscribeCountSinceSend(Long unsubscribeCountSinceSend) {
        this.unsubscribeCountSinceSend = unsubscribeCountSinceSend;
    }

    public Stats withUnsubscribeCountSinceSend(Long unsubscribeCountSinceSend) {
        this.unsubscribeCountSinceSend = unsubscribeCountSinceSend;
        return this;
    }

    /**
     * Cleaned Count Since Send
     * <p>
     * The number of members cleaned from the given list since the last campaign was sent.
     *
     */
    @JsonProperty("cleaned_count_since_send")
    public Long getCleanedCountSinceSend() {
        return cleanedCountSinceSend;
    }

    /**
     * Cleaned Count Since Send
     * <p>
     * The number of members cleaned from the given list since the last campaign was sent.
     *
     */
    @JsonProperty("cleaned_count_since_send")
    public void setCleanedCountSinceSend(Long cleanedCountSinceSend) {
        this.cleanedCountSinceSend = cleanedCountSinceSend;
    }

    public Stats withCleanedCountSinceSend(Long cleanedCountSinceSend) {
        this.cleanedCountSinceSend = cleanedCountSinceSend;
        return this;
    }

    /**
     * Campaign Count
     * <p>
     * The number of campaigns in any status that use this list.
     *
     */
    @JsonProperty("campaign_count")
    public Long getCampaignCount() {
        return campaignCount;
    }

    /**
     * Campaign Count
     * <p>
     * The number of campaigns in any status that use this list.
     *
     */
    @JsonProperty("campaign_count")
    public void setCampaignCount(Long campaignCount) {
        this.campaignCount = campaignCount;
    }

    public Stats withCampaignCount(Long campaignCount) {
        this.campaignCount = campaignCount;
        return this;
    }

    /**
     * Campaign Last Sent
     * <p>
     * The date and time the last campaign was sent to this list in ISO 8601 format.
     *
     */
    @JsonProperty("campaign_last_sent")
    public Date getCampaignLastSent() {
        return campaignLastSent;
    }

    /**
     * Campaign Last Sent
     * <p>
     * The date and time the last campaign was sent to this list in ISO 8601 format.
     *
     */
    @JsonProperty("campaign_last_sent")
    public void setCampaignLastSent(Date campaignLastSent) {
        this.campaignLastSent = campaignLastSent;
    }

    public Stats withCampaignLastSent(Date campaignLastSent) {
        this.campaignLastSent = campaignLastSent;
        return this;
    }

    /**
     * Merge Var Count
     * <p>
     * The number of merge vars for this list (not including the required EMAIL one).
     *
     */
    @JsonProperty("merge_field_count")
    public Long getMergeFieldCount() {
        return mergeFieldCount;
    }

    /**
     * Merge Var Count
     * <p>
     * The number of merge vars for this list (not including the required EMAIL one).
     *
     */
    @JsonProperty("merge_field_count")
    public void setMergeFieldCount(Long mergeFieldCount) {
        this.mergeFieldCount = mergeFieldCount;
    }

    public Stats withMergeFieldCount(Long mergeFieldCount) {
        this.mergeFieldCount = mergeFieldCount;
        return this;
    }

    /**
     * Average Subscription Rate
     * <p>
     * The average number of subscriptions per month for the list (not returned if we haven't calculated it yet).
     *
     */
    @JsonProperty("avg_sub_rate")
    public Double getAvgSubRate() {
        return avgSubRate;
    }

    /**
     * Average Subscription Rate
     * <p>
     * The average number of subscriptions per month for the list (not returned if we haven't calculated it yet).
     *
     */
    @JsonProperty("avg_sub_rate")
    public void setAvgSubRate(Double avgSubRate) {
        this.avgSubRate = avgSubRate;
    }

    public Stats withAvgSubRate(Double avgSubRate) {
        this.avgSubRate = avgSubRate;
        return this;
    }

    /**
     * Average Unsubscription Rate
     * <p>
     * The average number of unsubscriptions per month for the list (not returned if we haven't calculated it yet).
     *
     */
    @JsonProperty("avg_unsub_rate")
    public Double getAvgUnsubRate() {
        return avgUnsubRate;
    }

    /**
     * Average Unsubscription Rate
     * <p>
     * The average number of unsubscriptions per month for the list (not returned if we haven't calculated it yet).
     *
     */
    @JsonProperty("avg_unsub_rate")
    public void setAvgUnsubRate(Double avgUnsubRate) {
        this.avgUnsubRate = avgUnsubRate;
    }

    public Stats withAvgUnsubRate(Double avgUnsubRate) {
        this.avgUnsubRate = avgUnsubRate;
        return this;
    }

    /**
     * Average Subscription Rate
     * <p>
     * The target numberof subscriptions per month for the list to keep it growing (not returned if we haven't calculated it yet).
     *
     */
    @JsonProperty("target_sub_rate")
    public Double getTargetSubRate() {
        return targetSubRate;
    }

    /**
     * Average Subscription Rate
     * <p>
     * The target numberof subscriptions per month for the list to keep it growing (not returned if we haven't calculated it yet).
     *
     */
    @JsonProperty("target_sub_rate")
    public void setTargetSubRate(Double targetSubRate) {
        this.targetSubRate = targetSubRate;
    }

    public Stats withTargetSubRate(Double targetSubRate) {
        this.targetSubRate = targetSubRate;
        return this;
    }

    /**
     * Open Rate
     * <p>
     * The average open rate (a percentage represented as a number between 0 and 100) per campaign for the list (not returned if we haven't calculated it yet).
     *
     */
    @JsonProperty("open_rate")
    public Double getOpenRate() {
        return openRate;
    }

    /**
     * Open Rate
     * <p>
     * The average open rate (a percentage represented as a number between 0 and 100) per campaign for the list (not returned if we haven't calculated it yet).
     *
     */
    @JsonProperty("open_rate")
    public void setOpenRate(Double openRate) {
        this.openRate = openRate;
    }

    public Stats withOpenRate(Double openRate) {
        this.openRate = openRate;
        return this;
    }

    /**
     * Click Rate
     * <p>
     * The average click rate (a percentage represented as a number between 0 and 100) per campaign for the list (not returned if we haven't calculated it yet).
     *
     */
    @JsonProperty("click_rate")
    public Double getClickRate() {
        return clickRate;
    }

    /**
     * Click Rate
     * <p>
     * The average click rate (a percentage represented as a number between 0 and 100) per campaign for the list (not returned if we haven't calculated it yet).
     *
     */
    @JsonProperty("click_rate")
    public void setClickRate(Double clickRate) {
        this.clickRate = clickRate;
    }

    public Stats withClickRate(Double clickRate) {
        this.clickRate = clickRate;
        return this;
    }

    /**
     * Date of Last List Subscribe
     * <p>
     * The date and time of the last time someone subscribed to this list in ISO 8601 format.
     *
     */
    @JsonProperty("last_sub_date")
    public Date getLastSubDate() {
        return lastSubDate;
    }

    /**
     * Date of Last List Subscribe
     * <p>
     * The date and time of the last time someone subscribed to this list in ISO 8601 format.
     *
     */
    @JsonProperty("last_sub_date")
    public void setLastSubDate(Date lastSubDate) {
        this.lastSubDate = lastSubDate;
    }

    public Stats withLastSubDate(Date lastSubDate) {
        this.lastSubDate = lastSubDate;
        return this;
    }

    /**
     * Date of Last List Unsubscribe
     * <p>
     * The date and time of the last time someone unsubscribed from this list in ISO 8601 format.
     *
     */
    @JsonProperty("last_unsub_date")
    public Date getLastUnsubDate() {
        return lastUnsubDate;
    }

    /**
     * Date of Last List Unsubscribe
     * <p>
     * The date and time of the last time someone unsubscribed from this list in ISO 8601 format.
     *
     */
    @JsonProperty("last_unsub_date")
    public void setLastUnsubDate(Date lastUnsubDate) {
        this.lastUnsubDate = lastUnsubDate;
    }

    public Stats withLastUnsubDate(Date lastUnsubDate) {
        this.lastUnsubDate = lastUnsubDate;
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

    public Stats withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(openRate).append(campaignLastSent).append(memberCount).append(mergeFieldCount).append(unsubscribeCountSinceSend).append(unsubscribeCount).append(cleanedCount).append(lastUnsubDate).append(memberCountSinceSend).append(avgUnsubRate).append(clickRate).append(cleanedCountSinceSend).append(additionalProperties).append(targetSubRate).append(campaignCount).append(avgSubRate).append(lastSubDate).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Stats) == false) {
            return false;
        }
        Stats rhs = ((Stats) other);
        return new EqualsBuilder().append(openRate, rhs.openRate).append(campaignLastSent, rhs.campaignLastSent).append(memberCount, rhs.memberCount).append(mergeFieldCount, rhs.mergeFieldCount).append(unsubscribeCountSinceSend, rhs.unsubscribeCountSinceSend).append(unsubscribeCount, rhs.unsubscribeCount).append(cleanedCount, rhs.cleanedCount).append(lastUnsubDate, rhs.lastUnsubDate).append(memberCountSinceSend, rhs.memberCountSinceSend).append(avgUnsubRate, rhs.avgUnsubRate).append(clickRate, rhs.clickRate).append(cleanedCountSinceSend, rhs.cleanedCountSinceSend).append(additionalProperties, rhs.additionalProperties).append(targetSubRate, rhs.targetSubRate).append(campaignCount, rhs.campaignCount).append(avgSubRate, rhs.avgSubRate).append(lastSubDate, rhs.lastSubDate).isEquals();
    }

}
