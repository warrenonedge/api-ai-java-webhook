
package com.railinc.entities.webhook.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class RichResponse implements Serializable
{

    @SerializedName("items")
    @Expose
    private List<Item> items = new ArrayList<Item>();
    private final static long serialVersionUID = -6332677382645302173L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RichResponse() {
    }

    /**
     * 
     * @param items
     */
    public RichResponse(List<Item> items) {
        super();
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("items", items).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(items).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RichResponse) == false) {
            return false;
        }
        RichResponse rhs = ((RichResponse) other);
        return new EqualsBuilder().append(items, rhs.items).isEquals();
    }

}
