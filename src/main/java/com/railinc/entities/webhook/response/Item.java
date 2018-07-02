
package com.railinc.entities.webhook.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "simpleResponse"
})
public class Item {

    @JsonProperty("simpleResponse")
    private SimpleResponse simpleResponse;

    public Item(SimpleResponse simpleResponse2) {
		this.simpleResponse = simpleResponse2;
	}

	@JsonProperty("simpleResponse")
    public SimpleResponse getSimpleResponse() {
        return simpleResponse;
    }

    @JsonProperty("simpleResponse")
    public void setSimpleResponse(SimpleResponse simpleResponse) {
        this.simpleResponse = simpleResponse;
    }

}
