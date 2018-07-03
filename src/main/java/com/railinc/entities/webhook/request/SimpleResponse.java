
package com.railinc.entities.webhook.request;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class SimpleResponse implements Serializable
{

    @SerializedName("textToSpeech")
    @Expose
    private String textToSpeech;
    private final static long serialVersionUID = 8202726844853906884L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SimpleResponse() {
    }

    /**
     * 
     * @param textToSpeech
     */
    public SimpleResponse(String textToSpeech) {
        super();
        this.textToSpeech = textToSpeech;
    }

    public String getTextToSpeech() {
        return textToSpeech;
    }

    public void setTextToSpeech(String textToSpeech) {
        this.textToSpeech = textToSpeech;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("textToSpeech", textToSpeech).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(textToSpeech).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SimpleResponse) == false) {
            return false;
        }
        SimpleResponse rhs = ((SimpleResponse) other);
        return new EqualsBuilder().append(textToSpeech, rhs.textToSpeech).isEquals();
    }

}
