
package com.railinc.entities.webhook.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "expectUserResponse",
    "richResponse"
})
public class Google {

    @JsonProperty("expectUserResponse")
    private Boolean expectUserResponse;
    @JsonProperty("richResponse")
    private RichResponse richResponse;
    
    public Google() {
    	this.richResponse = new RichResponse();
    }

    @JsonProperty("expectUserResponse")
    public Boolean getExpectUserResponse() {
        return expectUserResponse;
    }

    @JsonProperty("expectUserResponse")
    public void setExpectUserResponse(Boolean expectUserResponse) {
        this.expectUserResponse = expectUserResponse;
    }

    @JsonProperty("richResponse")
    public RichResponse getRichResponse() {
        return richResponse;
    }

    @JsonProperty("richResponse")
    public void setRichResponse(RichResponse richResponse) {
        this.richResponse = richResponse;
    }

}
