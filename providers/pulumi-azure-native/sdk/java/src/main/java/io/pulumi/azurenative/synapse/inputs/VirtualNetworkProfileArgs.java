// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Virtual Network Profile
 * 
 */
public final class VirtualNetworkProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkProfileArgs Empty = new VirtualNetworkProfileArgs();

    /**
     * Subnet ID used for computes in workspace
     * 
     */
    @Import(name="computeSubnetId")
      private final @Nullable Output<String> computeSubnetId;

    public Output<String> getComputeSubnetId() {
        return this.computeSubnetId == null ? Output.empty() : this.computeSubnetId;
    }

    public VirtualNetworkProfileArgs(@Nullable Output<String> computeSubnetId) {
        this.computeSubnetId = computeSubnetId;
    }

    private VirtualNetworkProfileArgs() {
        this.computeSubnetId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> computeSubnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeSubnetId = defaults.computeSubnetId;
        }

        public Builder computeSubnetId(@Nullable Output<String> computeSubnetId) {
            this.computeSubnetId = computeSubnetId;
            return this;
        }
        public Builder computeSubnetId(@Nullable String computeSubnetId) {
            this.computeSubnetId = Output.ofNullable(computeSubnetId);
            return this;
        }        public VirtualNetworkProfileArgs build() {
            return new VirtualNetworkProfileArgs(computeSubnetId);
        }
    }
}
