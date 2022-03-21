// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storagetransfer_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies a bandwidth limit for an agent pool.
 * 
 */
public final class BandwidthLimitArgs extends io.pulumi.resources.ResourceArgs {

    public static final BandwidthLimitArgs Empty = new BandwidthLimitArgs();

    /**
     * Bandwidth rate in megabytes per second, distributed across all the agents in the pool.
     * 
     */
    @Import(name="limitMbps")
      private final @Nullable Output<String> limitMbps;

    public Output<String> getLimitMbps() {
        return this.limitMbps == null ? Output.empty() : this.limitMbps;
    }

    public BandwidthLimitArgs(@Nullable Output<String> limitMbps) {
        this.limitMbps = limitMbps;
    }

    private BandwidthLimitArgs() {
        this.limitMbps = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BandwidthLimitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> limitMbps;

        public Builder() {
    	      // Empty
        }

        public Builder(BandwidthLimitArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.limitMbps = defaults.limitMbps;
        }

        public Builder limitMbps(@Nullable Output<String> limitMbps) {
            this.limitMbps = limitMbps;
            return this;
        }
        public Builder limitMbps(@Nullable String limitMbps) {
            this.limitMbps = Output.ofNullable(limitMbps);
            return this;
        }        public BandwidthLimitArgs build() {
            return new BandwidthLimitArgs(limitMbps);
        }
    }
}
