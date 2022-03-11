// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.inputs.DimensionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies the criteria for converting log to metric.
 * 
 */
public final class CriteriaArgs extends io.pulumi.resources.ResourceArgs {

    public static final CriteriaArgs Empty = new CriteriaArgs();

    /**
     * List of Dimensions for creating metric
     * 
     */
    @InputImport(name="dimensions")
      private final @Nullable Output<List<DimensionArgs>> dimensions;

    public Output<List<DimensionArgs>> getDimensions() {
        return this.dimensions == null ? Output.empty() : this.dimensions;
    }

    /**
     * Name of the metric
     * 
     */
    @InputImport(name="metricName", required=true)
      private final Output<String> metricName;

    public Output<String> getMetricName() {
        return this.metricName;
    }

    public CriteriaArgs(
        @Nullable Output<List<DimensionArgs>> dimensions,
        Output<String> metricName) {
        this.dimensions = dimensions;
        this.metricName = Objects.requireNonNull(metricName, "expected parameter 'metricName' to be non-null");
    }

    private CriteriaArgs() {
        this.dimensions = Output.empty();
        this.metricName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<DimensionArgs>> dimensions;
        private Output<String> metricName;

        public Builder() {
    	      // Empty
        }

        public Builder(CriteriaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensions = defaults.dimensions;
    	      this.metricName = defaults.metricName;
        }

        public Builder dimensions(@Nullable Output<List<DimensionArgs>> dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        public Builder dimensions(@Nullable List<DimensionArgs> dimensions) {
            this.dimensions = Output.ofNullable(dimensions);
            return this;
        }

        public Builder metricName(Output<String> metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }

        public Builder metricName(String metricName) {
            this.metricName = Output.of(Objects.requireNonNull(metricName));
            return this;
        }
        public CriteriaArgs build() {
            return new CriteriaArgs(dimensions, metricName);
        }
    }
}
