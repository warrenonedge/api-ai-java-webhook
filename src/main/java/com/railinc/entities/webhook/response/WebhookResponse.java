
package com.railinc.entities.webhook.response;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "fulfillmentText",
    "fulfillmentMessages",
    "source",
    "payload",
    "outputContexts",
    "followupEventInput"
})
public class WebhookResponse {

    @JsonProperty("fulfillmentText")
    private String fulfillmentText;
    @JsonProperty("fulfillmentMessages")
    private List<FulfillmentMessage> fulfillmentMessages = null;
    @JsonProperty("source")
    private String source = "java-webhook";
    @JsonProperty("payload")
    private Payload payload;
    @JsonProperty("outputContexts")
    private List<OutputContext> outputContexts = null;
    @JsonProperty("followupEventInput")
    private FollowupEventInput followupEventInput;
    
    
    public WebhookResponse (String responseText, String session) {
    	this.fulfillmentText = responseText;
    	this.outputContexts = new ArrayList<OutputContext>();
    	this.outputContexts.add(new OutputContext(session));
    }

    @JsonProperty("fulfillmentText")
    public String getFulfillmentText() {
        return fulfillmentText;
    }

    @JsonProperty("fulfillmentText")
    public void setFulfillmentText(String fulfillmentText) {
        this.fulfillmentText = fulfillmentText;
    }

    @JsonProperty("fulfillmentMessages")
    public List<FulfillmentMessage> getFulfillmentMessages() {
        return fulfillmentMessages;
    }

    @JsonProperty("fulfillmentMessages")
    public void setFulfillmentMessages(List<FulfillmentMessage> fulfillmentMessages) {
        this.fulfillmentMessages = fulfillmentMessages;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("payload")
    public Payload getPayload() {
        return payload;
    }

    @JsonProperty("payload")
    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    @JsonProperty("outputContexts")
    public List<OutputContext> getOutputContexts() {
        return outputContexts;
    }

    @JsonProperty("outputContexts")
    public void setOutputContexts(List<OutputContext> outputContexts) {
        this.outputContexts = outputContexts;
    }

    @JsonProperty("followupEventInput")
    public FollowupEventInput getFollowupEventInput() {
        return followupEventInput;
    }

    @JsonProperty("followupEventInput")
    public void setFollowupEventInput(FollowupEventInput followupEventInput) {
        this.followupEventInput = followupEventInput;
    }

}
