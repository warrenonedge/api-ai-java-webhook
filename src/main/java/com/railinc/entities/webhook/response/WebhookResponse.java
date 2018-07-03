
package com.railinc.entities.webhook.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class WebhookResponse implements Serializable
{

    @SerializedName("fulfillmentText")
    @Expose
    private String fulfillmentText;
    @SerializedName("fulfillmentMessages")
    @Expose
    private List<FulfillmentMessage> fulfillmentMessages = new ArrayList<FulfillmentMessage>();
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("payload")
    @Expose
    private Payload payload;
    @SerializedName("outputContexts")
    @Expose
    private List<OutputContext> outputContexts = new ArrayList<OutputContext>();
    @SerializedName("followupEventInput")
    @Expose
    private FollowupEventInput followupEventInput;
    private final static long serialVersionUID = -6823870696331777593L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public WebhookResponse() {
    }
    
    public WebhookResponse (String responseText) {
    	this.fulfillmentText = responseText;
    	this.payload = new Payload(responseText);
    }
    
    public WebhookResponse (String responseText, String session) {
    	this.fulfillmentText = responseText;
    	this.payload = new Payload(responseText);
    	this.outputContexts = new ArrayList<OutputContext>();
    	this.outputContexts.add(new OutputContext(session));
    }

    /**
     * 
     * @param followupEventInput
     * @param outputContexts
     * @param source
     * @param payload
     * @param fulfillmentText
     * @param fulfillmentMessages
     */
    public WebhookResponse(String fulfillmentText, List<FulfillmentMessage> fulfillmentMessages, String source, Payload payload, List<OutputContext> outputContexts, FollowupEventInput followupEventInput) {
        super();
        this.fulfillmentText = fulfillmentText;
        this.fulfillmentMessages = fulfillmentMessages;
        this.source = source;
        this.payload = payload;
        this.outputContexts = outputContexts;
        this.followupEventInput = followupEventInput;
    }

    public String getFulfillmentText() {
        return fulfillmentText;
    }

    public void setFulfillmentText(String fulfillmentText) {
        this.fulfillmentText = fulfillmentText;
    }

    public List<FulfillmentMessage> getFulfillmentMessages() {
        return fulfillmentMessages;
    }

    public void setFulfillmentMessages(List<FulfillmentMessage> fulfillmentMessages) {
        this.fulfillmentMessages = fulfillmentMessages;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Payload getPayload() {
        return payload;
    }

    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    public List<OutputContext> getOutputContexts() {
        return outputContexts;
    }

    public void setOutputContexts(List<OutputContext> outputContexts) {
        this.outputContexts = outputContexts;
    }

    public FollowupEventInput getFollowupEventInput() {
        return followupEventInput;
    }

    public void setFollowupEventInput(FollowupEventInput followupEventInput) {
        this.followupEventInput = followupEventInput;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("fulfillmentText", fulfillmentText).append("fulfillmentMessages", fulfillmentMessages).append("source", source).append("payload", payload).append("outputContexts", outputContexts).append("followupEventInput", followupEventInput).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(followupEventInput).append(outputContexts).append(source).append(payload).append(fulfillmentText).append(fulfillmentMessages).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WebhookResponse) == false) {
            return false;
        }
        WebhookResponse rhs = ((WebhookResponse) other);
        return new EqualsBuilder().append(followupEventInput, rhs.followupEventInput).append(outputContexts, rhs.outputContexts).append(source, rhs.source).append(payload, rhs.payload).append(fulfillmentText, rhs.fulfillmentText).append(fulfillmentMessages, rhs.fulfillmentMessages).isEquals();
    }

}
