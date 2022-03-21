// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetReportArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetReportArgs Empty = new GetReportArgs();

    /**
     * Report Name.
     * 
     */
    @Import(name="reportName", required=true)
      private final String reportName;

    public String getReportName() {
        return this.reportName;
    }

    public GetReportArgs(String reportName) {
        this.reportName = Objects.requireNonNull(reportName, "expected parameter 'reportName' to be non-null");
    }

    private GetReportArgs() {
        this.reportName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String reportName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReportArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.reportName = defaults.reportName;
        }

        public Builder reportName(String reportName) {
            this.reportName = Objects.requireNonNull(reportName);
            return this;
        }        public GetReportArgs build() {
            return new GetReportArgs(reportName);
        }
    }
}
