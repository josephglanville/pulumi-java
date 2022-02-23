// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The aggregation expression to be used in the report.
 * 
 */
public final class ReportConfigAggregationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ReportConfigAggregationResponse Empty = new ReportConfigAggregationResponse();

    /**
     * The name of the aggregation function to use.
     * 
     */
    @InputImport(name="function", required=true)
      private final String function;

    public String getFunction() {
        return this.function;
    }

    /**
     * The name of the column to aggregate.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public ReportConfigAggregationResponse(
        String function,
        String name) {
        this.function = Objects.requireNonNull(function, "expected parameter 'function' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ReportConfigAggregationResponse() {
        this.function = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportConfigAggregationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String function;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportConfigAggregationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.function = defaults.function;
    	      this.name = defaults.name;
        }

        public Builder setFunction(String function) {
            this.function = Objects.requireNonNull(function);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public ReportConfigAggregationResponse build() {
            return new ReportConfigAggregationResponse(function, name);
        }
    }
}
