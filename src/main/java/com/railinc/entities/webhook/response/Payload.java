
package com.railinc.entities.webhook.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Payload implements Serializable
{

    @SerializedName("google")
    @Expose
    private Google google;
    private final static long serialVersionUID = 8003446452369570619L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Payload() {
    }
    
    public Payload(String text) {
    	this.google = new Google();
    	this.google.setExpectUserResponse(true);
    	List<Item> simpleResponseList = new ArrayList<Item>();
    	simpleResponseList.add(new Item(new SimpleResponse(text)));
    	this.google.getRichResponse().setItems(simpleResponseList);
    }

    /**
     * 
     * @param google
     */
    public Payload(Google google) {
        super();
        this.google = google;
    }

    public Google getGoogle() {
        return google;
    }

    public void setGoogle(Google google) {
        this.google = google;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("google", google).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(google).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Payload) == false) {
            return false;
        }
        Payload rhs = ((Payload) other);
        return new EqualsBuilder().append(google, rhs.google).isEquals();
    }

}
