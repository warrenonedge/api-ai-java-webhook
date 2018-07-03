
package com.railinc.entities.webhook.response;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Item implements Serializable
{

    @SerializedName("simpleResponse")
    @Expose
    private SimpleResponse simpleResponse;
    private final static long serialVersionUID = -5194853026059614229L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Item() {
    }

    /**
     * 
     * @param simpleResponse
     */
    public Item(SimpleResponse simpleResponse) {
        super();
        this.simpleResponse = simpleResponse;
    }

    public SimpleResponse getSimpleResponse() {
        return simpleResponse;
    }

    public void setSimpleResponse(SimpleResponse simpleResponse) {
        this.simpleResponse = simpleResponse;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("simpleResponse", simpleResponse).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(simpleResponse).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Item) == false) {
            return false;
        }
        Item rhs = ((Item) other);
        return new EqualsBuilder().append(simpleResponse, rhs.simpleResponse).isEquals();
    }

}
