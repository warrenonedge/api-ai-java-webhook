
package com.railinc.entities.webhook.request;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class DatePeriod implements Serializable
{

    @SerializedName("startDate")
    @Expose
    private String startDate;
    @SerializedName("endDate")
    @Expose
    private String endDate;
    private final static long serialVersionUID = 3333598050656882140L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DatePeriod() {
    }

    /**
     * 
     * @param startDate
     * @param endDate
     */
    public DatePeriod(String startDate, String endDate) {
        super();
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("startDate", startDate).append("endDate", endDate).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(startDate).append(endDate).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DatePeriod) == false) {
            return false;
        }
        DatePeriod rhs = ((DatePeriod) other);
        return new EqualsBuilder().append(startDate, rhs.startDate).append(endDate, rhs.endDate).isEquals();
    }

}
