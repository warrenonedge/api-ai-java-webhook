
package com.railinc.entities.webhook.request;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class OriginalDetectIntentRequest implements Serializable
{

    @SerializedName("payload")
    @Expose
    private Payload payload;
    private final static long serialVersionUID = -3544365379911182004L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public OriginalDetectIntentRequest() {
    }

    /**
     * 
     * @param payload
     */
    public OriginalDetectIntentRequest(Payload payload) {
        super();
        this.payload = payload;
    }

    public Payload getPayload() {
        return payload;
    }

    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("payload", payload).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(payload).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OriginalDetectIntentRequest) == false) {
            return false;
        }
        OriginalDetectIntentRequest rhs = ((OriginalDetectIntentRequest) other);
        return new EqualsBuilder().append(payload, rhs.payload).isEquals();
    }

}
