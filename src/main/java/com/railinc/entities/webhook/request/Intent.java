
package com.railinc.entities.webhook.request;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Intent implements Serializable
{

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("displayName")
    @Expose
    private String displayName;
    private final static long serialVersionUID = -3919059866478486623L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Intent() {
    }

    /**
     * 
     * @param name
     * @param displayName
     */
    public Intent(String name, String displayName) {
        super();
        this.name = name;
        this.displayName = displayName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("displayName", displayName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(displayName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Intent) == false) {
            return false;
        }
        Intent rhs = ((Intent) other);
        return new EqualsBuilder().append(name, rhs.name).append(displayName, rhs.displayName).isEquals();
    }

}
