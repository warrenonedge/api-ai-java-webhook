
package com.railinc.entities.webhook.response;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "title",
    "subtitle",
    "imageUri",
    "buttons"
})
public class Card {

    @JsonProperty("title")
    private String title;
    @JsonProperty("subtitle")
    private String subtitle;
    @JsonProperty("imageUri")
    private String imageUri;
    @JsonProperty("buttons")
    private List<Button> buttons = null;

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("subtitle")
    public String getSubtitle() {
        return subtitle;
    }

    @JsonProperty("subtitle")
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    @JsonProperty("imageUri")
    public String getImageUri() {
        return imageUri;
    }

    @JsonProperty("imageUri")
    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    @JsonProperty("buttons")
    public List<Button> getButtons() {
        return buttons;
    }

    @JsonProperty("buttons")
    public void setButtons(List<Button> buttons) {
        this.buttons = buttons;
    }

}
