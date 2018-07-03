
package com.railinc.entities.webhook.response;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class FollowupEventInput implements Serializable
{

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("languageCode")
    @Expose
    private String languageCode;
    @SerializedName("parameters")
    @Expose
    private Parameters_ parameters;
    private final static long serialVersionUID = -8146867033275283156L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FollowupEventInput() {
    }

    /**
     * 
     * @param languageCode
     * @param name
     * @param parameters
     */
    public FollowupEventInput(String name, String languageCode, Parameters_ parameters) {
        super();
        this.name = name;
        this.languageCode = languageCode;
        this.parameters = parameters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public Parameters_ getParameters() {
        return parameters;
    }

    public void setParameters(Parameters_ parameters) {
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("languageCode", languageCode).append("parameters", parameters).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(languageCode).append(name).append(parameters).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FollowupEventInput) == false) {
            return false;
        }
        FollowupEventInput rhs = ((FollowupEventInput) other);
        return new EqualsBuilder().append(languageCode, rhs.languageCode).append(name, rhs.name).append(parameters, rhs.parameters).isEquals();
    }

}
