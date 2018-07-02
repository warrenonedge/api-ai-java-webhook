
package com.railinc.entities.webhook.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "textToSpeech"
})
public class SimpleResponse {

    @JsonProperty("textToSpeech")
    private String textToSpeech;

    public SimpleResponse(String text) {
		this.textToSpeech = text;
	}

	@JsonProperty("textToSpeech")
    public String getTextToSpeech() {
        return textToSpeech;
    }

    @JsonProperty("textToSpeech")
    public void setTextToSpeech(String textToSpeech) {
        this.textToSpeech = textToSpeech;
    }

}
