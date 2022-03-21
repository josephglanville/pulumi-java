// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Metric limits set on an app.
 * 
 */
public final class SiteLimitsArgs extends io.pulumi.resources.ResourceArgs {

    public static final SiteLimitsArgs Empty = new SiteLimitsArgs();

    /**
     * Maximum allowed disk size usage in MB.
     * 
     */
    @Import(name="maxDiskSizeInMb")
      private final @Nullable Output<Double> maxDiskSizeInMb;

    public Output<Double> getMaxDiskSizeInMb() {
        return this.maxDiskSizeInMb == null ? Output.empty() : this.maxDiskSizeInMb;
    }

    /**
     * Maximum allowed memory usage in MB.
     * 
     */
    @Import(name="maxMemoryInMb")
      private final @Nullable Output<Double> maxMemoryInMb;

    public Output<Double> getMaxMemoryInMb() {
        return this.maxMemoryInMb == null ? Output.empty() : this.maxMemoryInMb;
    }

    /**
     * Maximum allowed CPU usage percentage.
     * 
     */
    @Import(name="maxPercentageCpu")
      private final @Nullable Output<Double> maxPercentageCpu;

    public Output<Double> getMaxPercentageCpu() {
        return this.maxPercentageCpu == null ? Output.empty() : this.maxPercentageCpu;
    }

    public SiteLimitsArgs(
        @Nullable Output<Double> maxDiskSizeInMb,
        @Nullable Output<Double> maxMemoryInMb,
        @Nullable Output<Double> maxPercentageCpu) {
        this.maxDiskSizeInMb = maxDiskSizeInMb;
        this.maxMemoryInMb = maxMemoryInMb;
        this.maxPercentageCpu = maxPercentageCpu;
    }

    private SiteLimitsArgs() {
        this.maxDiskSizeInMb = Output.empty();
        this.maxMemoryInMb = Output.empty();
        this.maxPercentageCpu = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SiteLimitsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Double> maxDiskSizeInMb;
        private @Nullable Output<Double> maxMemoryInMb;
        private @Nullable Output<Double> maxPercentageCpu;

        public Builder() {
    	      // Empty
        }

        public Builder(SiteLimitsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxDiskSizeInMb = defaults.maxDiskSizeInMb;
    	      this.maxMemoryInMb = defaults.maxMemoryInMb;
    	      this.maxPercentageCpu = defaults.maxPercentageCpu;
        }

        public Builder maxDiskSizeInMb(@Nullable Output<Double> maxDiskSizeInMb) {
            this.maxDiskSizeInMb = maxDiskSizeInMb;
            return this;
        }
        public Builder maxDiskSizeInMb(@Nullable Double maxDiskSizeInMb) {
            this.maxDiskSizeInMb = Output.ofNullable(maxDiskSizeInMb);
            return this;
        }
        public Builder maxMemoryInMb(@Nullable Output<Double> maxMemoryInMb) {
            this.maxMemoryInMb = maxMemoryInMb;
            return this;
        }
        public Builder maxMemoryInMb(@Nullable Double maxMemoryInMb) {
            this.maxMemoryInMb = Output.ofNullable(maxMemoryInMb);
            return this;
        }
        public Builder maxPercentageCpu(@Nullable Output<Double> maxPercentageCpu) {
            this.maxPercentageCpu = maxPercentageCpu;
            return this;
        }
        public Builder maxPercentageCpu(@Nullable Double maxPercentageCpu) {
            this.maxPercentageCpu = Output.ofNullable(maxPercentageCpu);
            return this;
        }        public SiteLimitsArgs build() {
            return new SiteLimitsArgs(maxDiskSizeInMb, maxMemoryInMb, maxPercentageCpu);
        }
    }
}
