
package com.railinc.entities.webhook.response;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Parameters implements Serializable
{

    @SerializedName("param")
    @Expose
    private String param;
    private final static long serialVersionUID = 1492562473937572083L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Parameters() {
    }

    /**
     * 
     * @param param
     */
    public Parameters(String param) {
        super();
        this.param = param;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("param", param).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(param).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Parameters) == false) {
            return false;
        }
        Parameters rhs = ((Parameters) other);
        return new EqualsBuilder().append(param, rhs.param).isEquals();
    }

}
