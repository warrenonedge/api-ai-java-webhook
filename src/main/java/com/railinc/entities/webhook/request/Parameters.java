
package com.railinc.entities.webhook.request;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Parameters implements Serializable
{

    @SerializedName("oncall-entity")
    @Expose
    private String oncallEntity;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("date-period")
    @Expose
    private Object datePeriod;
    private final static long serialVersionUID = 8714187320645222051L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Parameters() {
    }

    /**
     * 
     * @param date
     * @param oncallEntity
     * @param datePeriod
     */
    public Parameters(String oncallEntity, String date, Object datePeriod) {
        super();
        this.oncallEntity = oncallEntity;
        this.date = date;
        this.datePeriod = datePeriod;
    }

    public String getOncallEntity() {
        return oncallEntity;
    }

    public void setOncallEntity(String oncallEntity) {
        this.oncallEntity = oncallEntity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Object getDatePeriod() {
        return datePeriod;
    }

    public void setDatePeriod(Object datePeriod) {
        this.datePeriod = datePeriod;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("oncallEntity", oncallEntity).append("date", date).append("datePeriod", datePeriod).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(date).append(oncallEntity).append(datePeriod).toHashCode();
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
        return new EqualsBuilder().append(date, rhs.date).append(oncallEntity, rhs.oncallEntity).append(datePeriod, rhs.datePeriod).isEquals();
    }

}
