
package com.railinc.entities.webhook.response;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class OutputContext implements Serializable
{

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("lifespanCount")
    @Expose
    private Integer lifespanCount;
    @SerializedName("parameters")
    @Expose
    private Parameters parameters;
    private final static long serialVersionUID = -7554212815755730462L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public OutputContext() {
    }
    
    public OutputContext(String name) {
    	this.name = name;
    }

    /**
     * 
     * @param name
     * @param parameters
     * @param lifespanCount
     */
    public OutputContext(String name, Integer lifespanCount, Parameters parameters) {
        super();
        this.name = name;
        this.lifespanCount = lifespanCount;
        this.parameters = parameters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLifespanCount() {
        return lifespanCount;
    }

    public void setLifespanCount(Integer lifespanCount) {
        this.lifespanCount = lifespanCount;
    }

    public Parameters getParameters() {
        return parameters;
    }

    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("lifespanCount", lifespanCount).append("parameters", parameters).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(parameters).append(lifespanCount).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OutputContext) == false) {
            return false;
        }
        OutputContext rhs = ((OutputContext) other);
        return new EqualsBuilder().append(name, rhs.name).append(parameters, rhs.parameters).append(lifespanCount, rhs.lifespanCount).isEquals();
    }

}
