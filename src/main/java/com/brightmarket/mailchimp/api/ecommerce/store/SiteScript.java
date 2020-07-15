
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
 * Script
 * <p>
 * The script used to connect your site with Mailchimp.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "url",
    "fragment"
})
public class SiteScript implements Serializable
{

    /**
     * Script URL
     * <p>
     * The URL used for any integrations that offer built-in support for connected sites.
     *
     */
    @JsonProperty("url")
    @JsonPropertyDescription("The URL used for any integrations that offer built-in support for connected sites.")
    private String url;
    /**
     * Script Fragment
     * <p>
     * A pre-built script that you can copy-and-paste into your site to integrate it with Mailchimp.
     *
     */
    @JsonProperty("fragment")
    @JsonPropertyDescription("A pre-built script that you can copy-and-paste into your site to integrate it with Mailchimp.")
    private String fragment;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -7849281249487138785L;

    /**
     * No args constructor for use in serialization
     *
     */
    public SiteScript() {
    }

    /**
     *
     * @param fragment
     * @param url
     */
    public SiteScript(String url, String fragment) {
        super();
        this.url = url;
        this.fragment = fragment;
    }

    /**
     * Script URL
     * <p>
     * The URL used for any integrations that offer built-in support for connected sites.
     *
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * Script URL
     * <p>
     * The URL used for any integrations that offer built-in support for connected sites.
     *
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public SiteScript withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Script Fragment
     * <p>
     * A pre-built script that you can copy-and-paste into your site to integrate it with Mailchimp.
     *
     */
    @JsonProperty("fragment")
    public String getFragment() {
        return fragment;
    }

    /**
     * Script Fragment
     * <p>
     * A pre-built script that you can copy-and-paste into your site to integrate it with Mailchimp.
     *
     */
    @JsonProperty("fragment")
    public void setFragment(String fragment) {
        this.fragment = fragment;
    }

    public SiteScript withFragment(String fragment) {
        this.fragment = fragment;
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

    public SiteScript withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fragment).append(additionalProperties).append(url).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SiteScript) == false) {
            return false;
        }
        SiteScript rhs = ((SiteScript) other);
        return new EqualsBuilder().append(fragment, rhs.fragment).append(additionalProperties, rhs.additionalProperties).append(url, rhs.url).isEquals();
    }

}
