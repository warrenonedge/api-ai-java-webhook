
package com.railinc.entities.webhook.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "lifespanCount",
    "parameters"
})
public class OutputContext {

    @JsonProperty("name")
    private String name;
    @JsonProperty("lifespanCount")
    private Integer lifespanCount = 5;
    @JsonProperty("parameters")
    private Parameters parameters;
    
    public OutputContext(String session) {
    	this.name = session;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("lifespanCount")
    public Integer getLifespanCount() {
        return lifespanCount;
    }

    @JsonProperty("lifespanCount")
    public void setLifespanCount(Integer lifespanCount) {
        this.lifespanCount = lifespanCount;
    }

    @JsonProperty("parameters")
    public Parameters getParameters() {
        return parameters;
    }

    @JsonProperty("parameters")
    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

}
