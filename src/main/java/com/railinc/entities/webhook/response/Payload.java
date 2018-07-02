
package com.railinc.entities.webhook.response;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "google",
    "facebook",
    "slack",
    "kik",
    "telegram"
})
public class Payload {

    @JsonProperty("google")
    private Google google;
    @JsonProperty("facebook")
    private Facebook facebook;
    @JsonProperty("slack")
    private Slack slack;
    @JsonProperty("kik")
    private Kik kik;
    @JsonProperty("telegram")
    private Telegram telegram;
    
    public Payload(String text) {
    	this.google = new Google();
    	this.google.setExpectUserResponse(true);
    	List<Item> simpleResponseList = new ArrayList<Item>();
    	simpleResponseList.add(new Item(new SimpleResponse(text)));
    	this.google.getRichResponse().setItems(simpleResponseList);
    }

    @JsonProperty("google")
    public Google getGoogle() {
        return google;
    }

    @JsonProperty("google")
    public void setGoogle(Google google) {
        this.google = google;
    }

    @JsonProperty("facebook")
    public Facebook getFacebook() {
        return facebook;
    }

    @JsonProperty("facebook")
    public void setFacebook(Facebook facebook) {
        this.facebook = facebook;
    }

    @JsonProperty("slack")
    public Slack getSlack() {
        return slack;
    }

    @JsonProperty("slack")
    public void setSlack(Slack slack) {
        this.slack = slack;
    }

    @JsonProperty("kik")
    public Kik getKik() {
        return kik;
    }

    @JsonProperty("kik")
    public void setKik(Kik kik) {
        this.kik = kik;
    }

    @JsonProperty("telegram")
    public Telegram getTelegram() {
        return telegram;
    }

    @JsonProperty("telegram")
    public void setTelegram(Telegram telegram) {
        this.telegram = telegram;
    }

}
