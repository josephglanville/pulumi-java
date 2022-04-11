// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * A rule governing the accessibility of a managed hsm pool from a specific virtual network.
 * 
 */
public final class MHSMVirtualNetworkRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final MHSMVirtualNetworkRuleArgs Empty = new MHSMVirtualNetworkRuleArgs();

    /**
     * Full resource id of a vnet subnet, such as '/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/test-vnet/subnets/subnet1'.
     * 
     */
    @Import(name="id", required=true)
      private final Output<String> id;

    public Output<String> getId() {
        return this.id;
    }

    public MHSMVirtualNetworkRuleArgs(Output<String> id) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
    }

    private MHSMVirtualNetworkRuleArgs() {
        this.id = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MHSMVirtualNetworkRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> id;

        public Builder() {
    	      // Empty
        }

        public Builder(MHSMVirtualNetworkRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(Output<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder id(String id) {
            this.id = Output.of(Objects.requireNonNull(id));
            return this;
        }        public MHSMVirtualNetworkRuleArgs build() {
            return new MHSMVirtualNetworkRuleArgs(id);
        }
    }
}
