// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The start and end date for pulling data for the report.
 * 
 */
public final class ReportConfigTimePeriodResponse extends io.pulumi.resources.InvokeArgs {

    public static final ReportConfigTimePeriodResponse Empty = new ReportConfigTimePeriodResponse();

    /**
     * The start date to pull data from.
     * 
     */
    @Import(name="from", required=true)
      private final String from;

    public String getFrom() {
        return this.from;
    }

    /**
     * The end date to pull data to.
     * 
     */
    @Import(name="to", required=true)
      private final String to;

    public String getTo() {
        return this.to;
    }

    public ReportConfigTimePeriodResponse(
        String from,
        String to) {
        this.from = Objects.requireNonNull(from, "expected parameter 'from' to be non-null");
        this.to = Objects.requireNonNull(to, "expected parameter 'to' to be non-null");
    }

    private ReportConfigTimePeriodResponse() {
        this.from = null;
        this.to = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportConfigTimePeriodResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String from;
        private String to;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportConfigTimePeriodResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.from = defaults.from;
    	      this.to = defaults.to;
        }

        public Builder from(String from) {
            this.from = Objects.requireNonNull(from);
            return this;
        }
        public Builder to(String to) {
            this.to = Objects.requireNonNull(to);
            return this;
        }        public ReportConfigTimePeriodResponse build() {
            return new ReportConfigTimePeriodResponse(from, to);
        }
    }
}
