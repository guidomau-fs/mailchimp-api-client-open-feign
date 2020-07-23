
package com.brightmarket.mailchimp.api.model.lists;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
 * Campaign Defaults
 * <p>
 * Default values for campaigns created for this list.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "from_name",
    "from_email",
    "subject",
    "language"
})
public class CampaignDefaults implements Serializable
{

    /**
     * Sender's Name
     * <p>
     * The default from name for campaigns sent to this list.
     * (Required)
     *
     */
    @JsonProperty("from_name")
    @JsonPropertyDescription("The default from name for campaigns sent to this list.")
    private String fromName;
    /**
     * Sender's Email Address
     * <p>
     * The default from email (must be a valid email address) for campaigns sent to this list.
     * (Required)
     *
     */
    @JsonProperty("from_email")
    @JsonPropertyDescription("The default from email (must be a valid email address) for campaigns sent to this list.")
    private String fromEmail;
    /**
     * Subject
     * <p>
     * The default subject line for campaigns sent to this list.
     * (Required)
     *
     */
    @JsonProperty("subject")
    @JsonPropertyDescription("The default subject line for campaigns sent to this list.")
    private String subject;
    /**
     * Language
     * <p>
     * The default language for this lists's forms.
     * (Required)
     *
     */
    @JsonProperty("language")
    @JsonPropertyDescription("The default language for this lists's forms.")
    private String language;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8114781186457224859L;

    /**
     * No args constructor for use in serialization
     *
     */
    public CampaignDefaults() {
    }

    /**
     *
     * @param subject
     * @param fromName
     * @param language
     * @param fromEmail
     */
    public CampaignDefaults(String fromName, String fromEmail, String subject, String language) {
        super();
        this.fromName = fromName;
        this.fromEmail = fromEmail;
        this.subject = subject;
        this.language = language;
    }

    /**
     * Sender's Name
     * <p>
     * The default from name for campaigns sent to this list.
     * (Required)
     *
     */
    @JsonProperty("from_name")
    public String getFromName() {
        return fromName;
    }

    /**
     * Sender's Name
     * <p>
     * The default from name for campaigns sent to this list.
     * (Required)
     *
     */
    @JsonProperty("from_name")
    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public CampaignDefaults withFromName(String fromName) {
        this.fromName = fromName;
        return this;
    }

    /**
     * Sender's Email Address
     * <p>
     * The default from email (must be a valid email address) for campaigns sent to this list.
     * (Required)
     *
     */
    @JsonProperty("from_email")
    public String getFromEmail() {
        return fromEmail;
    }

    /**
     * Sender's Email Address
     * <p>
     * The default from email (must be a valid email address) for campaigns sent to this list.
     * (Required)
     *
     */
    @JsonProperty("from_email")
    public void setFromEmail(String fromEmail) {
        this.fromEmail = fromEmail;
    }

    public CampaignDefaults withFromEmail(String fromEmail) {
        this.fromEmail = fromEmail;
        return this;
    }

    /**
     * Subject
     * <p>
     * The default subject line for campaigns sent to this list.
     * (Required)
     *
     */
    @JsonProperty("subject")
    public String getSubject() {
        return subject;
    }

    /**
     * Subject
     * <p>
     * The default subject line for campaigns sent to this list.
     * (Required)
     *
     */
    @JsonProperty("subject")
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public CampaignDefaults withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Language
     * <p>
     * The default language for this lists's forms.
     * (Required)
     *
     */
    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    /**
     * Language
     * <p>
     * The default language for this lists's forms.
     * (Required)
     *
     */
    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    public CampaignDefaults withLanguage(String language) {
        this.language = language;
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

    public CampaignDefaults withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fromName).append(language).append(additionalProperties).append(subject).append(fromEmail).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CampaignDefaults) == false) {
            return false;
        }
        CampaignDefaults rhs = ((CampaignDefaults) other);
        return new EqualsBuilder().append(fromName, rhs.fromName).append(language, rhs.language).append(additionalProperties, rhs.additionalProperties).append(subject, rhs.subject).append(fromEmail, rhs.fromEmail).isEquals();
    }

}
