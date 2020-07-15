
package com.brightmarket.mailchimp.api;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
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
 * Resource Link
 * <p>
 * This object represents a link from the resource where it is found to another resource or action that may be performed.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "rel",
    "href",
    "method",
    "targetSchema",
    "schema"
})
public class Link implements Serializable
{

    /**
     * As with an HTML 'rel' attribute, this describes the type of link.
     *
     */
    @JsonProperty("rel")
    @JsonPropertyDescription("As with an HTML 'rel' attribute, this describes the type of link.")
    private String rel;
    /**
     * This property contains a fully-qualified URL that can be called to retrieve the linked resource or perform the linked action.
     *
     */
    @JsonProperty("href")
    @JsonPropertyDescription("This property contains a fully-qualified URL that can be called to retrieve the linked resource or perform the linked action.")
    private String href;
    /**
     * The HTTP method that should be used when accessing the URL defined in 'href'.
     *
     */
    @JsonProperty("method")
    @JsonPropertyDescription("The HTTP method that should be used when accessing the URL defined in 'href'.")
    private Link.Method method;
    /**
     * For GETs, this is a URL representing the schema that the response should conform to.
     *
     */
    @JsonProperty("targetSchema")
    @JsonPropertyDescription("For GETs, this is a URL representing the schema that the response should conform to.")
    private String targetSchema;
    /**
     * For HTTP methods that can receive bodies (POST and PUT), this is a URL representing the schema that the body should conform to.
     *
     */
    @JsonProperty("schema")
    @JsonPropertyDescription("For HTTP methods that can receive bodies (POST and PUT), this is a URL representing the schema that the body should conform to.")
    private String schema;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6315852482858782553L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Link() {
    }

    /**
     *
     * @param schema
     * @param targetSchema
     * @param method
     * @param rel
     * @param href
     */
    public Link(String rel, String href, Link.Method method, String targetSchema, String schema) {
        super();
        this.rel = rel;
        this.href = href;
        this.method = method;
        this.targetSchema = targetSchema;
        this.schema = schema;
    }

    /**
     * As with an HTML 'rel' attribute, this describes the type of link.
     *
     */
    @JsonProperty("rel")
    public String getRel() {
        return rel;
    }

    /**
     * As with an HTML 'rel' attribute, this describes the type of link.
     *
     */
    @JsonProperty("rel")
    public void setRel(String rel) {
        this.rel = rel;
    }

    public Link withRel(String rel) {
        this.rel = rel;
        return this;
    }

    /**
     * This property contains a fully-qualified URL that can be called to retrieve the linked resource or perform the linked action.
     *
     */
    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    /**
     * This property contains a fully-qualified URL that can be called to retrieve the linked resource or perform the linked action.
     *
     */
    @JsonProperty("href")
    public void setHref(String href) {
        this.href = href;
    }

    public Link withHref(String href) {
        this.href = href;
        return this;
    }

    /**
     * The HTTP method that should be used when accessing the URL defined in 'href'.
     *
     */
    @JsonProperty("method")
    public Link.Method getMethod() {
        return method;
    }

    /**
     * The HTTP method that should be used when accessing the URL defined in 'href'.
     *
     */
    @JsonProperty("method")
    public void setMethod(Link.Method method) {
        this.method = method;
    }

    public Link withMethod(Link.Method method) {
        this.method = method;
        return this;
    }

    /**
     * For GETs, this is a URL representing the schema that the response should conform to.
     *
     */
    @JsonProperty("targetSchema")
    public String getTargetSchema() {
        return targetSchema;
    }

    /**
     * For GETs, this is a URL representing the schema that the response should conform to.
     *
     */
    @JsonProperty("targetSchema")
    public void setTargetSchema(String targetSchema) {
        this.targetSchema = targetSchema;
    }

    public Link withTargetSchema(String targetSchema) {
        this.targetSchema = targetSchema;
        return this;
    }

    /**
     * For HTTP methods that can receive bodies (POST and PUT), this is a URL representing the schema that the body should conform to.
     *
     */
    @JsonProperty("schema")
    public String getSchema() {
        return schema;
    }

    /**
     * For HTTP methods that can receive bodies (POST and PUT), this is a URL representing the schema that the body should conform to.
     *
     */
    @JsonProperty("schema")
    public void setSchema(String schema) {
        this.schema = schema;
    }

    public Link withSchema(String schema) {
        this.schema = schema;
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

    public Link withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(schema).append(targetSchema).append(method).append(rel).append(href).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Link) == false) {
            return false;
        }
        Link rhs = ((Link) other);
        return new EqualsBuilder().append(schema, rhs.schema).append(targetSchema, rhs.targetSchema).append(method, rhs.method).append(rel, rhs.rel).append(href, rhs.href).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    public enum Method {

        GET("GET"),
        POST("POST"),
        PUT("PUT"),
        PATCH("PATCH"),
        DELETE("DELETE"),
        OPTIONS("OPTIONS"),
        HEAD("HEAD");
        private final String value;
        private final static Map<String, Link.Method> CONSTANTS = new HashMap<String, Link.Method>();

        static {
            for (Link.Method c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Method(String value) {
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
        public static Link.Method fromValue(String value) {
            Link.Method constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
