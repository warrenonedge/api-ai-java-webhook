
package com.railinc.entities.webhook;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "oncall-entity",
    "date",
    "date-period"
})
public class Parameters {

    @JsonProperty("oncall-entity")
    private String oncallEntity;
    @JsonProperty("date")
    private String date;
    @JsonProperty("date-period")
    private String datePeriod;

    @JsonProperty("oncall-entity")
    public String getOncallEntity() {
        return oncallEntity;
    }

    @JsonProperty("oncall-entity")
    public void setOncallEntity(String oncallEntity) {
        this.oncallEntity = oncallEntity;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("date-period")
    public String getDatePeriod() {
        return datePeriod;
    }

    @JsonProperty("date-period")
    public void setDatePeriod(String datePeriod) {
        this.datePeriod = datePeriod;
    }

}
