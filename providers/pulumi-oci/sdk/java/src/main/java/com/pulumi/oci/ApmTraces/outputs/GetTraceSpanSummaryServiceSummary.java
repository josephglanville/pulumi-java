// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ApmTraces.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTraceSpanSummaryServiceSummary {
    /**
     * @return Number of spans with errors for serviceName in the trace.
     * 
     */
    private final String errorSpans;
    /**
     * @return Name associated with the service.
     * 
     */
    private final String spanServiceName;
    /**
     * @return Number of spans for serviceName in the trace.
     * 
     */
    private final String totalSpans;

    @CustomType.Constructor
    private GetTraceSpanSummaryServiceSummary(
        @CustomType.Parameter("errorSpans") String errorSpans,
        @CustomType.Parameter("spanServiceName") String spanServiceName,
        @CustomType.Parameter("totalSpans") String totalSpans) {
        this.errorSpans = errorSpans;
        this.spanServiceName = spanServiceName;
        this.totalSpans = totalSpans;
    }

    /**
     * @return Number of spans with errors for serviceName in the trace.
     * 
     */
    public String errorSpans() {
        return this.errorSpans;
    }
    /**
     * @return Name associated with the service.
     * 
     */
    public String spanServiceName() {
        return this.spanServiceName;
    }
    /**
     * @return Number of spans for serviceName in the trace.
     * 
     */
    public String totalSpans() {
        return this.totalSpans;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTraceSpanSummaryServiceSummary defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String errorSpans;
        private String spanServiceName;
        private String totalSpans;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTraceSpanSummaryServiceSummary defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorSpans = defaults.errorSpans;
    	      this.spanServiceName = defaults.spanServiceName;
    	      this.totalSpans = defaults.totalSpans;
        }

        public Builder errorSpans(String errorSpans) {
            this.errorSpans = Objects.requireNonNull(errorSpans);
            return this;
        }
        public Builder spanServiceName(String spanServiceName) {
            this.spanServiceName = Objects.requireNonNull(spanServiceName);
            return this;
        }
        public Builder totalSpans(String totalSpans) {
            this.totalSpans = Objects.requireNonNull(totalSpans);
            return this;
        }        public GetTraceSpanSummaryServiceSummary build() {
            return new GetTraceSpanSummaryServiceSummary(errorSpans, spanServiceName, totalSpans);
        }
    }
}
