
package com.railinc.entities.webhook.request;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class FulfillmentMessage implements Serializable
{

    @SerializedName("platform")
    @Expose
    private String platform;
    @SerializedName("simpleResponses")
    @Expose
    private SimpleResponses simpleResponses;
    @SerializedName("text")
    @Expose
    private Text text;
    private final static long serialVersionUID = -5883446059565488783L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FulfillmentMessage() {
    }

    /**
     * 
     * @param simpleResponses
     * @param platform
     * @param text
     */
    public FulfillmentMessage(String platform, SimpleResponses simpleResponses, Text text) {
        super();
        this.platform = platform;
        this.simpleResponses = simpleResponses;
        this.text = text;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public SimpleResponses getSimpleResponses() {
        return simpleResponses;
    }

    public void setSimpleResponses(SimpleResponses simpleResponses) {
        this.simpleResponses = simpleResponses;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("platform", platform).append("simpleResponses", simpleResponses).append("text", text).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(simpleResponses).append(platform).append(text).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FulfillmentMessage) == false) {
            return false;
        }
        FulfillmentMessage rhs = ((FulfillmentMessage) other);
        return new EqualsBuilder().append(simpleResponses, rhs.simpleResponses).append(platform, rhs.platform).append(text, rhs.text).isEquals();
    }

}
