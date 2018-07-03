
package com.railinc.entities.webhook.request;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Text implements Serializable
{

    @SerializedName("text")
    @Expose
    private List<String> text = new ArrayList<String>();
    private final static long serialVersionUID = 9208174653948671605L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Text() {
    }

    /**
     * 
     * @param text
     */
    public Text(List<String> text) {
        super();
        this.text = text;
    }

    public List<String> getText() {
        return text;
    }

    public void setText(List<String> text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("text", text).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(text).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Text) == false) {
            return false;
        }
        Text rhs = ((Text) other);
        return new EqualsBuilder().append(text, rhs.text).isEquals();
    }

}
