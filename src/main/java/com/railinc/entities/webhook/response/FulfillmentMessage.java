
package com.railinc.entities.webhook.response;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class FulfillmentMessage implements Serializable
{

    @SerializedName("card")
    @Expose
    private Card card;
    private final static long serialVersionUID = -945440088791924039L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FulfillmentMessage() {
    }

    /**
     * 
     * @param card
     */
    public FulfillmentMessage(Card card) {
        super();
        this.card = card;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("card", card).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(card).toHashCode();
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
        return new EqualsBuilder().append(card, rhs.card).isEquals();
    }

}
