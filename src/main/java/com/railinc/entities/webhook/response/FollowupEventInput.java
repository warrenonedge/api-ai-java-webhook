
package com.railinc.entities.webhook.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "languageCode",
    "parameters"
})
public class FollowupEventInput {

    @JsonProperty("name")
    private String name;
    @JsonProperty("languageCode")
    private String languageCode;
    @JsonProperty("parameters")
    private Parameters_ parameters;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("languageCode")
    public String getLanguageCode() {
        return languageCode;
    }

    @JsonProperty("languageCode")
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    @JsonProperty("parameters")
    public Parameters_ getParameters() {
        return parameters;
    }

    @JsonProperty("parameters")
    public void setParameters(Parameters_ parameters) {
        this.parameters = parameters;
    }

}
