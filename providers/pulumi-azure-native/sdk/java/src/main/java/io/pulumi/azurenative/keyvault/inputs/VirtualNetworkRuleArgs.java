// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A rule governing the accessibility of a vault from a specific virtual network.
 * 
 */
public final class VirtualNetworkRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkRuleArgs Empty = new VirtualNetworkRuleArgs();

    /**
     * Full resource id of a vnet subnet, such as '/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/test-vnet/subnets/subnet1'.
     * 
     */
    @Import(name="id", required=true)
      private final Output<String> id;

    public Output<String> getId() {
        return this.id;
    }

    /**
     * Property to specify whether NRP will ignore the check if parent subnet has serviceEndpoints configured.
     * 
     */
    @Import(name="ignoreMissingVnetServiceEndpoint")
      private final @Nullable Output<Boolean> ignoreMissingVnetServiceEndpoint;

    public Output<Boolean> getIgnoreMissingVnetServiceEndpoint() {
        return this.ignoreMissingVnetServiceEndpoint == null ? Codegen.empty() : this.ignoreMissingVnetServiceEndpoint;
    }

    public VirtualNetworkRuleArgs(
        Output<String> id,
        @Nullable Output<Boolean> ignoreMissingVnetServiceEndpoint) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.ignoreMissingVnetServiceEndpoint = ignoreMissingVnetServiceEndpoint;
    }

    private VirtualNetworkRuleArgs() {
        this.id = Codegen.empty();
        this.ignoreMissingVnetServiceEndpoint = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> id;
        private @Nullable Output<Boolean> ignoreMissingVnetServiceEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ignoreMissingVnetServiceEndpoint = defaults.ignoreMissingVnetServiceEndpoint;
        }

        public Builder id(Output<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder id(String id) {
            this.id = Output.of(Objects.requireNonNull(id));
            return this;
        }
        public Builder ignoreMissingVnetServiceEndpoint(@Nullable Output<Boolean> ignoreMissingVnetServiceEndpoint) {
            this.ignoreMissingVnetServiceEndpoint = ignoreMissingVnetServiceEndpoint;
            return this;
        }
        public Builder ignoreMissingVnetServiceEndpoint(@Nullable Boolean ignoreMissingVnetServiceEndpoint) {
            this.ignoreMissingVnetServiceEndpoint = Codegen.ofNullable(ignoreMissingVnetServiceEndpoint);
            return this;
        }        public VirtualNetworkRuleArgs build() {
            return new VirtualNetworkRuleArgs(id, ignoreMissingVnetServiceEndpoint);
        }
    }
}
