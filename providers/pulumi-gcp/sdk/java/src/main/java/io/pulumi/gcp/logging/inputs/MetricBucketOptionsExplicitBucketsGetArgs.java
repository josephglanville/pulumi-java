// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.logging.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.util.List;
import java.util.Objects;


public final class MetricBucketOptionsExplicitBucketsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetricBucketOptionsExplicitBucketsGetArgs Empty = new MetricBucketOptionsExplicitBucketsGetArgs();

    /**
     * The values must be monotonically increasing.
     * 
     */
    @Import(name="bounds", required=true)
      private final Output<List<Double>> bounds;

    public Output<List<Double>> getBounds() {
        return this.bounds;
    }

    public MetricBucketOptionsExplicitBucketsGetArgs(Output<List<Double>> bounds) {
        this.bounds = Objects.requireNonNull(bounds, "expected parameter 'bounds' to be non-null");
    }

    private MetricBucketOptionsExplicitBucketsGetArgs() {
        this.bounds = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricBucketOptionsExplicitBucketsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<Double>> bounds;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricBucketOptionsExplicitBucketsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bounds = defaults.bounds;
        }

        public Builder bounds(Output<List<Double>> bounds) {
            this.bounds = Objects.requireNonNull(bounds);
            return this;
        }
        public Builder bounds(List<Double> bounds) {
            this.bounds = Output.of(Objects.requireNonNull(bounds));
            return this;
        }
        public Builder bounds(Double... bounds) {
            return bounds(List.of(bounds));
        }        public MetricBucketOptionsExplicitBucketsGetArgs build() {
            return new MetricBucketOptionsExplicitBucketsGetArgs(bounds);
        }
    }
}
