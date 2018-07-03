
package com.railinc.entities.webhook.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Card implements Serializable
{

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("subtitle")
    @Expose
    private String subtitle;
    @SerializedName("imageUri")
    @Expose
    private String imageUri;
    @SerializedName("buttons")
    @Expose
    private List<Button> buttons = new ArrayList<Button>();
    private final static long serialVersionUID = 3047033638206731985L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Card() {
    }

    /**
     * 
     * @param imageUri
     * @param title
     * @param subtitle
     * @param buttons
     */
    public Card(String title, String subtitle, String imageUri, List<Button> buttons) {
        super();
        this.title = title;
        this.subtitle = subtitle;
        this.imageUri = imageUri;
        this.buttons = buttons;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    public List<Button> getButtons() {
        return buttons;
    }

    public void setButtons(List<Button> buttons) {
        this.buttons = buttons;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("title", title).append("subtitle", subtitle).append("imageUri", imageUri).append("buttons", buttons).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(imageUri).append(title).append(subtitle).append(buttons).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Card) == false) {
            return false;
        }
        Card rhs = ((Card) other);
        return new EqualsBuilder().append(imageUri, rhs.imageUri).append(title, rhs.title).append(subtitle, rhs.subtitle).append(buttons, rhs.buttons).isEquals();
    }

}
