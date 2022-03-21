// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The aggregation expression to be used in the report.
 * 
 */
public final class ReportAggregationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ReportAggregationResponse Empty = new ReportAggregationResponse();

    /**
     * The name of the aggregation function to use.
     * 
     */
    @Import(name="function", required=true)
      private final String function;

    public String getFunction() {
        return this.function;
    }

    /**
     * The name of the column to aggregate.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public ReportAggregationResponse(
        String function,
        String name) {
        this.function = Objects.requireNonNull(function, "expected parameter 'function' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ReportAggregationResponse() {
        this.function = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportAggregationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String function;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportAggregationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.function = defaults.function;
    	      this.name = defaults.name;
        }

        public Builder function(String function) {
            this.function = Objects.requireNonNull(function);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public ReportAggregationResponse build() {
            return new ReportAggregationResponse(function, name);
        }
    }
}
