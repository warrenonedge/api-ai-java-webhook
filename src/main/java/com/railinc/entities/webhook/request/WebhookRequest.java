
package com.railinc.entities.webhook.request;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class WebhookRequest implements Serializable
{

    @SerializedName("responseId")
    @Expose
    private String responseId;
    @SerializedName("queryResult")
    @Expose
    private QueryResult queryResult;
    @SerializedName("originalDetectIntentRequest")
    @Expose
    private OriginalDetectIntentRequest originalDetectIntentRequest;
    @SerializedName("session")
    @Expose
    private String session;
    private final static long serialVersionUID = -8470581524189562785L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public WebhookRequest() {
    }

    /**
     * 
     * @param responseId
     * @param session
     * @param queryResult
     * @param originalDetectIntentRequest
     */
    public WebhookRequest(String responseId, QueryResult queryResult, OriginalDetectIntentRequest originalDetectIntentRequest, String session) {
        super();
        this.responseId = responseId;
        this.queryResult = queryResult;
        this.originalDetectIntentRequest = originalDetectIntentRequest;
        this.session = session;
    }

    public String getResponseId() {
        return responseId;
    }

    public void setResponseId(String responseId) {
        this.responseId = responseId;
    }

    public QueryResult getQueryResult() {
        return queryResult;
    }

    public void setQueryResult(QueryResult queryResult) {
        this.queryResult = queryResult;
    }

    public OriginalDetectIntentRequest getOriginalDetectIntentRequest() {
        return originalDetectIntentRequest;
    }

    public void setOriginalDetectIntentRequest(OriginalDetectIntentRequest originalDetectIntentRequest) {
        this.originalDetectIntentRequest = originalDetectIntentRequest;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("responseId", responseId).append("queryResult", queryResult).append("originalDetectIntentRequest", originalDetectIntentRequest).append("session", session).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(responseId).append(session).append(queryResult).append(originalDetectIntentRequest).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WebhookRequest) == false) {
            return false;
        }
        WebhookRequest rhs = ((WebhookRequest) other);
        return new EqualsBuilder().append(responseId, rhs.responseId).append(session, rhs.session).append(queryResult, rhs.queryResult).append(originalDetectIntentRequest, rhs.originalDetectIntentRequest).isEquals();
    }

}
