
package com.brightmarket.mailchimp.api.model;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API Root
 * <p>
 * This resource is nothing more than links to other resources available through the API.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "account_id",
    "login_id",
    "account_name",
    "email",
    "first_name",
    "last_name",
    "username",
    "avatar_url",
    "role",
    "contact",
    "pro_enabled",
    "last_login",
    "total_subscribers",
    "industry_stats",
    "_links"
})
public class Root implements Serializable
{

    /**
     * Account ID
     * <p>
     * The ID associated with this account. Used for things like subscribe forms.
     *
     */
    @JsonProperty("account_id")
    @JsonPropertyDescription("The ID associated with this account. Used for things like subscribe forms.")
    private String accountId;
    /**
     * Login ID
     * <p>
     * The ID associated with the user who owns this API key. If you can login to multiple accounts, this ID will be the same for each account.
     *
     */
    @JsonProperty("login_id")
    @JsonPropertyDescription("The ID associated with the user who owns this API key. If you can login to multiple accounts, this ID will be the same for each account.")
    private String loginId;
    /**
     * Account Name
     * <p>
     * The name of the account.
     *
     */
    @JsonProperty("account_name")
    @JsonPropertyDescription("The name of the account.")
    private String accountName;
    /**
     * Email
     * <p>
     * The email address tied to the account
     *
     */
    @JsonProperty("email")
    @JsonPropertyDescription("The email address tied to the account")
    private String email;
    /**
     * First Name
     * <p>
     * The first name tied to the account.
     *
     */
    @JsonProperty("first_name")
    @JsonPropertyDescription("The first name tied to the account.")
    private String firstName;
    /**
     * Last Name
     * <p>
     * The last name tied to the account.
     *
     */
    @JsonProperty("last_name")
    @JsonPropertyDescription("The last name tied to the account.")
    private String lastName;
    /**
     * User Name
     * <p>
     * The username tied to the account.
     *
     */
    @JsonProperty("username")
    @JsonPropertyDescription("The username tied to the account.")
    private String username;
    /**
     * Avatar URL
     * <p>
     * URL of the avatar for the user.
     *
     */
    @JsonProperty("avatar_url")
    @JsonPropertyDescription("URL of the avatar for the user.")
    private String avatarUrl;
    /**
     * Role
     * <p>
     * the role assigned to the account
     *
     */
    @JsonProperty("role")
    @JsonPropertyDescription("the role assigned to the account")
    private String role;
    /**
     * Account Contact
     * <p>
     *
     *
     */
    @JsonProperty("contact")
    private AccountContact contact;
    /**
     *
     * <p>
     *
     *
     */
    @JsonProperty("pro_enabled")
    @JsonPropertyDescription("")
    private Boolean proEnabled;
    /**
     * Last Login Date
     * <p>
     * The date and time of the last login for this account in ISO 8601 format.
     *
     */
    @JsonProperty("last_login")
    @JsonPropertyDescription("The date and time of the last login for this account in ISO 8601 format.")
    private Date lastLogin;
    /**
     * Total Subscribers
     * <p>
     * The total number of subscribers across all lists in the account.
     *
     */
    @JsonProperty("total_subscribers")
    @JsonPropertyDescription("The total number of subscribers across all lists in the account.")
    private Long totalSubscribers;
    /**
     * Industry Stats
     * <p>
     *
     *
     */
    @JsonProperty("industry_stats")
    private IndustryStats industryStats;
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
    private final static long serialVersionUID = -9117978979865872363L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Root() {
    }

    /**
     *
     * @param lastName
     * @param lastLogin
     * @param loginId
     * @param role
     * @param accountName
     * @param avatarUrl
     * @param industryStats
     * @param totalSubscribers
     * @param accountId
     * @param firstName
     * @param proEnabled
     * @param contact
     * @param links
     * @param email
     * @param username
     */
    public Root(String accountId, String loginId, String accountName, String email, String firstName, String lastName, String username, String avatarUrl, String role, AccountContact contact, Boolean proEnabled, Date lastLogin, Long totalSubscribers, IndustryStats industryStats, List<Link> links) {
        super();
        this.accountId = accountId;
        this.loginId = loginId;
        this.accountName = accountName;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.avatarUrl = avatarUrl;
        this.role = role;
        this.contact = contact;
        this.proEnabled = proEnabled;
        this.lastLogin = lastLogin;
        this.totalSubscribers = totalSubscribers;
        this.industryStats = industryStats;
        this.links = links;
    }

    /**
     * Account ID
     * <p>
     * The ID associated with this account. Used for things like subscribe forms.
     *
     */
    @JsonProperty("account_id")
    public String getAccountId() {
        return accountId;
    }

    /**
     * Account ID
     * <p>
     * The ID associated with this account. Used for things like subscribe forms.
     *
     */
    @JsonProperty("account_id")
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Root withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * Login ID
     * <p>
     * The ID associated with the user who owns this API key. If you can login to multiple accounts, this ID will be the same for each account.
     *
     */
    @JsonProperty("login_id")
    public String getLoginId() {
        return loginId;
    }

    /**
     * Login ID
     * <p>
     * The ID associated with the user who owns this API key. If you can login to multiple accounts, this ID will be the same for each account.
     *
     */
    @JsonProperty("login_id")
    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public Root withLoginId(String loginId) {
        this.loginId = loginId;
        return this;
    }

    /**
     * Account Name
     * <p>
     * The name of the account.
     *
     */
    @JsonProperty("account_name")
    public String getAccountName() {
        return accountName;
    }

    /**
     * Account Name
     * <p>
     * The name of the account.
     *
     */
    @JsonProperty("account_name")
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Root withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Email
     * <p>
     * The email address tied to the account
     *
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * Email
     * <p>
     * The email address tied to the account
     *
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public Root withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * First Name
     * <p>
     * The first name tied to the account.
     *
     */
    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    /**
     * First Name
     * <p>
     * The first name tied to the account.
     *
     */
    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Root withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Last Name
     * <p>
     * The last name tied to the account.
     *
     */
    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    /**
     * Last Name
     * <p>
     * The last name tied to the account.
     *
     */
    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Root withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * User Name
     * <p>
     * The username tied to the account.
     *
     */
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    /**
     * User Name
     * <p>
     * The username tied to the account.
     *
     */
    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    public Root withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Avatar URL
     * <p>
     * URL of the avatar for the user.
     *
     */
    @JsonProperty("avatar_url")
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * Avatar URL
     * <p>
     * URL of the avatar for the user.
     *
     */
    @JsonProperty("avatar_url")
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public Root withAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }

    /**
     * Role
     * <p>
     * the role assigned to the account
     *
     */
    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    /**
     * Role
     * <p>
     * the role assigned to the account
     *
     */
    @JsonProperty("role")
    public void setRole(String role) {
        this.role = role;
    }

    public Root withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * Account Contact
     * <p>
     *
     *
     */
    @JsonProperty("contact")
    public AccountContact getContact() {
        return contact;
    }

    /**
     * Account Contact
     * <p>
     *
     *
     */
    @JsonProperty("contact")
    public void setContact(AccountContact contact) {
        this.contact = contact;
    }

    public Root withContact(AccountContact contact) {
        this.contact = contact;
        return this;
    }

    /**
     *
     * <p>
     *
     *
     */
    @JsonProperty("pro_enabled")
    public Boolean getProEnabled() {
        return proEnabled;
    }

    /**
     *
     * <p>
     *
     *
     */
    @JsonProperty("pro_enabled")
    public void setProEnabled(Boolean proEnabled) {
        this.proEnabled = proEnabled;
    }

    public Root withProEnabled(Boolean proEnabled) {
        this.proEnabled = proEnabled;
        return this;
    }

    /**
     * Last Login Date
     * <p>
     * The date and time of the last login for this account in ISO 8601 format.
     *
     */
    @JsonProperty("last_login")
    public Date getLastLogin() {
        return lastLogin;
    }

    /**
     * Last Login Date
     * <p>
     * The date and time of the last login for this account in ISO 8601 format.
     *
     */
    @JsonProperty("last_login")
    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Root withLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
        return this;
    }

    /**
     * Total Subscribers
     * <p>
     * The total number of subscribers across all lists in the account.
     *
     */
    @JsonProperty("total_subscribers")
    public Long getTotalSubscribers() {
        return totalSubscribers;
    }

    /**
     * Total Subscribers
     * <p>
     * The total number of subscribers across all lists in the account.
     *
     */
    @JsonProperty("total_subscribers")
    public void setTotalSubscribers(Long totalSubscribers) {
        this.totalSubscribers = totalSubscribers;
    }

    public Root withTotalSubscribers(Long totalSubscribers) {
        this.totalSubscribers = totalSubscribers;
        return this;
    }

    /**
     * Industry Stats
     * <p>
     *
     *
     */
    @JsonProperty("industry_stats")
    public IndustryStats getIndustryStats() {
        return industryStats;
    }

    /**
     * Industry Stats
     * <p>
     *
     *
     */
    @JsonProperty("industry_stats")
    public void setIndustryStats(IndustryStats industryStats) {
        this.industryStats = industryStats;
    }

    public Root withIndustryStats(IndustryStats industryStats) {
        this.industryStats = industryStats;
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

    public Root withLinks(List<Link> links) {
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

    public Root withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(lastName).append(lastLogin).append(loginId).append(role).append(accountName).append(avatarUrl).append(industryStats).append(totalSubscribers).append(accountId).append(firstName).append(proEnabled).append(contact).append(links).append(additionalProperties).append(email).append(username).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Root) == false) {
            return false;
        }
        Root rhs = ((Root) other);
        return new EqualsBuilder().append(lastName, rhs.lastName).append(lastLogin, rhs.lastLogin).append(loginId, rhs.loginId).append(role, rhs.role).append(accountName, rhs.accountName).append(avatarUrl, rhs.avatarUrl).append(industryStats, rhs.industryStats).append(totalSubscribers, rhs.totalSubscribers).append(accountId, rhs.accountId).append(firstName, rhs.firstName).append(proEnabled, rhs.proEnabled).append(contact, rhs.contact).append(links, rhs.links).append(additionalProperties, rhs.additionalProperties).append(email, rhs.email).append(username, rhs.username).isEquals();
    }

}
