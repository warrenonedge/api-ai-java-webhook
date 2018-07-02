
package com.railinc.entities.webhook.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "text",
    "postback"
})
public class Button {

    @JsonProperty("text")
    private String text;
    @JsonProperty("postback")
    private String postback;

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("postback")
    public String getPostback() {
        return postback;
    }

    @JsonProperty("postback")
    public void setPostback(String postback) {
        this.postback = postback;
    }

}