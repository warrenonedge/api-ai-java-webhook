
package com.railinc.entities.webhook.request;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class QueryResult implements Serializable
{

    @SerializedName("queryText")
    @Expose
    private String queryText;
    @SerializedName("parameters")
    @Expose
    private Parameters parameters;
    @SerializedName("allRequiredParamsPresent")
    @Expose
    private Boolean allRequiredParamsPresent;
    @SerializedName("fulfillmentText")
    @Expose
    private String fulfillmentText;
    @SerializedName("fulfillmentMessages")
    @Expose
    private List<FulfillmentMessage> fulfillmentMessages = new ArrayList<FulfillmentMessage>();
    @SerializedName("intent")
    @Expose
    private Intent intent;
    @SerializedName("intentDetectionConfidence")
    @Expose
    private Integer intentDetectionConfidence;
    @SerializedName("diagnosticInfo")
    @Expose
    private DiagnosticInfo diagnosticInfo;
    @SerializedName("languageCode")
    @Expose
    private String languageCode;
    private final static long serialVersionUID = 2773173730625607953L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public QueryResult() {
    }

    /**
     * 
     * @param languageCode
     * @param intentDetectionConfidence
     * @param allRequiredParamsPresent
     * @param fulfillmentText
     * @param parameters
     * @param fulfillmentMessages
     * @param queryText
     * @param diagnosticInfo
     * @param intent
     */
    public QueryResult(String queryText, Parameters parameters, Boolean allRequiredParamsPresent, String fulfillmentText, List<FulfillmentMessage> fulfillmentMessages, Intent intent, Integer intentDetectionConfidence, DiagnosticInfo diagnosticInfo, String languageCode) {
        super();
        this.queryText = queryText;
        this.parameters = parameters;
        this.allRequiredParamsPresent = allRequiredParamsPresent;
        this.fulfillmentText = fulfillmentText;
        this.fulfillmentMessages = fulfillmentMessages;
        this.intent = intent;
        this.intentDetectionConfidence = intentDetectionConfidence;
        this.diagnosticInfo = diagnosticInfo;
        this.languageCode = languageCode;
    }

    public String getQueryText() {
        return queryText;
    }

    public void setQueryText(String queryText) {
        this.queryText = queryText;
    }

    public Parameters getParameters() {
        return parameters;
    }

    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    public Boolean getAllRequiredParamsPresent() {
        return allRequiredParamsPresent;
    }

    public void setAllRequiredParamsPresent(Boolean allRequiredParamsPresent) {
        this.allRequiredParamsPresent = allRequiredParamsPresent;
    }

    public String getFulfillmentText() {
        return fulfillmentText;
    }

    public void setFulfillmentText(String fulfillmentText) {
        this.fulfillmentText = fulfillmentText;
    }

    public List<FulfillmentMessage> getFulfillmentMessages() {
        return fulfillmentMessages;
    }

    public void setFulfillmentMessages(List<FulfillmentMessage> fulfillmentMessages) {
        this.fulfillmentMessages = fulfillmentMessages;
    }

    public Intent getIntent() {
        return intent;
    }

    public void setIntent(Intent intent) {
        this.intent = intent;
    }

    public Integer getIntentDetectionConfidence() {
        return intentDetectionConfidence;
    }

    public void setIntentDetectionConfidence(Integer intentDetectionConfidence) {
        this.intentDetectionConfidence = intentDetectionConfidence;
    }

    public DiagnosticInfo getDiagnosticInfo() {
        return diagnosticInfo;
    }

    public void setDiagnosticInfo(DiagnosticInfo diagnosticInfo) {
        this.diagnosticInfo = diagnosticInfo;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("queryText", queryText).append("parameters", parameters).append("allRequiredParamsPresent", allRequiredParamsPresent).append("fulfillmentText", fulfillmentText).append("fulfillmentMessages", fulfillmentMessages).append("intent", intent).append("intentDetectionConfidence", intentDetectionConfidence).append("diagnosticInfo", diagnosticInfo).append("languageCode", languageCode).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(languageCode).append(intentDetectionConfidence).append(allRequiredParamsPresent).append(fulfillmentText).append(parameters).append(fulfillmentMessages).append(queryText).append(diagnosticInfo).append(intent).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof QueryResult) == false) {
            return false;
        }
        QueryResult rhs = ((QueryResult) other);
        return new EqualsBuilder().append(languageCode, rhs.languageCode).append(intentDetectionConfidence, rhs.intentDetectionConfidence).append(allRequiredParamsPresent, rhs.allRequiredParamsPresent).append(fulfillmentText, rhs.fulfillmentText).append(parameters, rhs.parameters).append(fulfillmentMessages, rhs.fulfillmentMessages).append(queryText, rhs.queryText).append(diagnosticInfo, rhs.diagnosticInfo).append(intent, rhs.intent).isEquals();
    }

}
