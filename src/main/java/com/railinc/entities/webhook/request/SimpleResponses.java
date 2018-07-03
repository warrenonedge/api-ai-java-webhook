
package com.railinc.entities.webhook.request;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class SimpleResponses implements Serializable
{

    @SerializedName("simpleResponses")
    @Expose
    private List<SimpleResponse> simpleResponses = new ArrayList<SimpleResponse>();
    private final static long serialVersionUID = -7424863426370645567L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SimpleResponses() {
    }

    /**
     * 
     * @param simpleResponses
     */
    public SimpleResponses(List<SimpleResponse> simpleResponses) {
        super();
        this.simpleResponses = simpleResponses;
    }

    public List<SimpleResponse> getSimpleResponses() {
        return simpleResponses;
    }

    public void setSimpleResponses(List<SimpleResponse> simpleResponses) {
        this.simpleResponses = simpleResponses;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("simpleResponses", simpleResponses).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(simpleResponses).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SimpleResponses) == false) {
            return false;
        }
        SimpleResponses rhs = ((SimpleResponses) other);
        return new EqualsBuilder().append(simpleResponses, rhs.simpleResponses).isEquals();
    }

}
