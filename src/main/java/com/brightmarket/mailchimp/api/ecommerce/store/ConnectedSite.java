
package com.brightmarket.mailchimp.api.ecommerce.store;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
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
 * Connected Site
 * <p>
 * The Connected Site associated with the store.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "site_foreign_id",
    "site_script"
})
public class ConnectedSite implements Serializable
{

    /**
     * Connected Site Foreign ID
     * <p>
     * The unique identifier for the connected site.
     *
     */
    @JsonProperty("site_foreign_id")
    @JsonPropertyDescription("The unique identifier for the connected site.")
    private String siteForeignId;
    /**
     * Script
     * <p>
     * The script used to connect your site with Mailchimp.
     *
     */
    @JsonProperty("site_script")
    @JsonPropertyDescription("The script used to connect your site with Mailchimp.")
    private SiteScript siteScript;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8016670049065070014L;

    /**
     * No args constructor for use in serialization
     *
     */
    public ConnectedSite() {
    }

    /**
     *
     * @param siteScript
     * @param siteForeignId
     */
    public ConnectedSite(String siteForeignId, SiteScript siteScript) {
        super();
        this.siteForeignId = siteForeignId;
        this.siteScript = siteScript;
    }

    /**
     * Connected Site Foreign ID
     * <p>
     * The unique identifier for the connected site.
     *
     */
    @JsonProperty("site_foreign_id")
    public String getSiteForeignId() {
        return siteForeignId;
    }

    /**
     * Connected Site Foreign ID
     * <p>
     * The unique identifier for the connected site.
     *
     */
    @JsonProperty("site_foreign_id")
    public void setSiteForeignId(String siteForeignId) {
        this.siteForeignId = siteForeignId;
    }

    public ConnectedSite withSiteForeignId(String siteForeignId) {
        this.siteForeignId = siteForeignId;
        return this;
    }

    /**
     * Script
     * <p>
     * The script used to connect your site with Mailchimp.
     *
     */
    @JsonProperty("site_script")
    public SiteScript getSiteScript() {
        return siteScript;
    }

    /**
     * Script
     * <p>
     * The script used to connect your site with Mailchimp.
     *
     */
    @JsonProperty("site_script")
    public void setSiteScript(SiteScript siteScript) {
        this.siteScript = siteScript;
    }

    public ConnectedSite withSiteScript(SiteScript siteScript) {
        this.siteScript = siteScript;
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

    public ConnectedSite withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(siteForeignId).append(siteScript).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConnectedSite) == false) {
            return false;
        }
        ConnectedSite rhs = ((ConnectedSite) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(siteForeignId, rhs.siteForeignId).append(siteScript, rhs.siteScript).isEquals();
    }

}
