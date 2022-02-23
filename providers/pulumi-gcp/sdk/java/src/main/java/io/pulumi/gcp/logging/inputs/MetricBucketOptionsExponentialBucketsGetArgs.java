// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.logging.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MetricBucketOptionsExponentialBucketsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetricBucketOptionsExponentialBucketsGetArgs Empty = new MetricBucketOptionsExponentialBucketsGetArgs();

    /**
     * Must be greater than 1.
     * 
     */
    @InputImport(name="growthFactor")
      private final @Nullable Input<Double> growthFactor;

    public Input<Double> getGrowthFactor() {
        return this.growthFactor == null ? Input.empty() : this.growthFactor;
    }

    /**
     * Must be greater than 0.
     * 
     */
    @InputImport(name="numFiniteBuckets")
      private final @Nullable Input<Integer> numFiniteBuckets;

    public Input<Integer> getNumFiniteBuckets() {
        return this.numFiniteBuckets == null ? Input.empty() : this.numFiniteBuckets;
    }

    /**
     * Must be greater than 0.
     * 
     */
    @InputImport(name="scale")
      private final @Nullable Input<Double> scale;

    public Input<Double> getScale() {
        return this.scale == null ? Input.empty() : this.scale;
    }

    public MetricBucketOptionsExponentialBucketsGetArgs(
        @Nullable Input<Double> growthFactor,
        @Nullable Input<Integer> numFiniteBuckets,
        @Nullable Input<Double> scale) {
        this.growthFactor = growthFactor;
        this.numFiniteBuckets = numFiniteBuckets;
        this.scale = scale;
    }

    private MetricBucketOptionsExponentialBucketsGetArgs() {
        this.growthFactor = Input.empty();
        this.numFiniteBuckets = Input.empty();
        this.scale = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricBucketOptionsExponentialBucketsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Double> growthFactor;
        private @Nullable Input<Integer> numFiniteBuckets;
        private @Nullable Input<Double> scale;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricBucketOptionsExponentialBucketsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.growthFactor = defaults.growthFactor;
    	      this.numFiniteBuckets = defaults.numFiniteBuckets;
    	      this.scale = defaults.scale;
        }

        public Builder setGrowthFactor(@Nullable Input<Double> growthFactor) {
            this.growthFactor = growthFactor;
            return this;
        }

        public Builder setGrowthFactor(@Nullable Double growthFactor) {
            this.growthFactor = Input.ofNullable(growthFactor);
            return this;
        }

        public Builder setNumFiniteBuckets(@Nullable Input<Integer> numFiniteBuckets) {
            this.numFiniteBuckets = numFiniteBuckets;
            return this;
        }

        public Builder setNumFiniteBuckets(@Nullable Integer numFiniteBuckets) {
            this.numFiniteBuckets = Input.ofNullable(numFiniteBuckets);
            return this;
        }

        public Builder setScale(@Nullable Input<Double> scale) {
            this.scale = scale;
            return this;
        }

        public Builder setScale(@Nullable Double scale) {
            this.scale = Input.ofNullable(scale);
            return this;
        }
        public MetricBucketOptionsExponentialBucketsGetArgs build() {
            return new MetricBucketOptionsExponentialBucketsGetArgs(growthFactor, numFiniteBuckets, scale);
        }
    }
}
