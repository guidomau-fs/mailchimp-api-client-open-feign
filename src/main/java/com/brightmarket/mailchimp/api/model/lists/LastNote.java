
package com.brightmarket.mailchimp.api.model.lists;

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
 * Notes
 * <p>
 * The most recent Note added about this member.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "note_id",
        "created_at",
        "created_by",
        "note"
})
public class LastNote implements Serializable {

    /**
     * Note ID
     * <p>
     * The note's ID.
     */
    @JsonProperty("note_id")
    @JsonPropertyDescription("The note's ID.")
    private Long noteId;
    /**
     * Created Time
     * <p>
     * The date the note was created.
     */
    @JsonProperty("created_at")
    @JsonPropertyDescription("The date the note was created.")
    private String createdAt;
    /**
     * Author
     * <p>
     * The author of the note.
     */
    @JsonProperty("created_by")
    @JsonPropertyDescription("The author of the note.")
    private String createdBy;
    /**
     * Note
     * <p>
     * The content of the note.
     */
    @JsonProperty("note")
    @JsonPropertyDescription("The content of the note.")
    private String note;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 8965179022671165182L;

    /**
     * No args constructor for use in serialization
     */
    public LastNote() {
    }

    /**
     * @param createdAt
     * @param note
     * @param createdBy
     * @param noteId
     */
    public LastNote(Long noteId, String createdAt, String createdBy, String note) {
        super();
        this.noteId = noteId;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.note = note;
    }

    /**
     * Note ID
     * <p>
     * The note's ID.
     */
    @JsonProperty("note_id")
    public Long getNoteId() {
        return noteId;
    }

    /**
     * Note ID
     * <p>
     * The note's ID.
     */
    @JsonProperty("note_id")
    public void setNoteId(Long noteId) {
        this.noteId = noteId;
    }

    public LastNote withNoteId(Long noteId) {
        this.noteId = noteId;
        return this;
    }

    /**
     * Created Time
     * <p>
     * The date the note was created.
     */
    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Created Time
     * <p>
     * The date the note was created.
     */
    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public LastNote withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Author
     * <p>
     * The author of the note.
     */
    @JsonProperty("created_by")
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Author
     * <p>
     * The author of the note.
     */
    @JsonProperty("created_by")
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LastNote withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Note
     * <p>
     * The content of the note.
     */
    @JsonProperty("note")
    public String getNote() {
        return note;
    }

    /**
     * Note
     * <p>
     * The content of the note.
     */
    @JsonProperty("note")
    public void setNote(String note) {
        this.note = note;
    }

    public LastNote withNote(String note) {
        this.note = note;
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

    public LastNote withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(createdAt).append(note).append(noteId).append(additionalProperties).append(createdBy).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LastNote) == false) {
            return false;
        }
        LastNote rhs = ((LastNote) other);
        return new EqualsBuilder().append(createdAt, rhs.createdAt).append(note, rhs.note).append(noteId, rhs.noteId).append(additionalProperties, rhs.additionalProperties).append(createdBy, rhs.createdBy).isEquals();
    }

}
