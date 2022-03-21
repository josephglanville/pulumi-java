// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class InstanceFromMachineImageNetworkPerformanceConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceFromMachineImageNetworkPerformanceConfigArgs Empty = new InstanceFromMachineImageNetworkPerformanceConfigArgs();

    @Import(name="totalEgressBandwidthTier", required=true)
      private final Output<String> totalEgressBandwidthTier;

    public Output<String> getTotalEgressBandwidthTier() {
        return this.totalEgressBandwidthTier;
    }

    public InstanceFromMachineImageNetworkPerformanceConfigArgs(Output<String> totalEgressBandwidthTier) {
        this.totalEgressBandwidthTier = Objects.requireNonNull(totalEgressBandwidthTier, "expected parameter 'totalEgressBandwidthTier' to be non-null");
    }

    private InstanceFromMachineImageNetworkPerformanceConfigArgs() {
        this.totalEgressBandwidthTier = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFromMachineImageNetworkPerformanceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> totalEgressBandwidthTier;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFromMachineImageNetworkPerformanceConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.totalEgressBandwidthTier = defaults.totalEgressBandwidthTier;
        }

        public Builder totalEgressBandwidthTier(Output<String> totalEgressBandwidthTier) {
            this.totalEgressBandwidthTier = Objects.requireNonNull(totalEgressBandwidthTier);
            return this;
        }
        public Builder totalEgressBandwidthTier(String totalEgressBandwidthTier) {
            this.totalEgressBandwidthTier = Output.of(Objects.requireNonNull(totalEgressBandwidthTier));
            return this;
        }        public InstanceFromMachineImageNetworkPerformanceConfigArgs build() {
            return new InstanceFromMachineImageNetworkPerformanceConfigArgs(totalEgressBandwidthTier);
        }
    }
}
