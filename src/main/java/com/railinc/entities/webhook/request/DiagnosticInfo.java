
package com.railinc.entities.webhook.request;

import java.io.Serializable;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class DiagnosticInfo implements Serializable
{

    private final static long serialVersionUID = -4063136543420714858L;

    @Override
    public String toString() {
        return new ToStringBuilder(this).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DiagnosticInfo) == false) {
            return false;
        }
        DiagnosticInfo rhs = ((DiagnosticInfo) other);
        return new EqualsBuilder().isEquals();
    }

}
