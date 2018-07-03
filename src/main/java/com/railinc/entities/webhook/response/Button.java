
package com.railinc.entities.webhook.response;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Button implements Serializable
{

    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("postback")
    @Expose
    private String postback;
    private final static long serialVersionUID = 2952038128706528274L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Button() {
    }

    /**
     * 
     * @param text
     * @param postback
     */
    public Button(String text, String postback) {
        super();
        this.text = text;
        this.postback = postback;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPostback() {
        return postback;
    }

    public void setPostback(String postback) {
        this.postback = postback;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("text", text).append("postback", postback).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(text).append(postback).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Button) == false) {
            return false;
        }
        Button rhs = ((Button) other);
        return new EqualsBuilder().append(text, rhs.text).append(postback, rhs.postback).isEquals();
    }

}
