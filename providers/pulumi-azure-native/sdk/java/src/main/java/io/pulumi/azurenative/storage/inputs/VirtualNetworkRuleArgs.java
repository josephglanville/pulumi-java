// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.azurenative.storage.enums.Action;
import io.pulumi.azurenative.storage.enums.State;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Virtual Network rule.
 * 
 */
public final class VirtualNetworkRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkRuleArgs Empty = new VirtualNetworkRuleArgs();

    /**
     * The action of virtual network rule.
     * 
     */
    @Import(name="action")
      private final @Nullable Output<Action> action;

    public Output<Action> getAction() {
        return this.action == null ? Codegen.empty() : this.action;
    }

    /**
     * Gets the state of virtual network rule.
     * 
     */
    @Import(name="state")
      private final @Nullable Output<Either<String,State>> state;

    public Output<Either<String,State>> getState() {
        return this.state == null ? Codegen.empty() : this.state;
    }

    /**
     * Resource ID of a subnet, for example: /subscriptions/{subscriptionId}/resourceGroups/{groupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}.
     * 
     */
    @Import(name="virtualNetworkResourceId", required=true)
      private final Output<String> virtualNetworkResourceId;

    public Output<String> getVirtualNetworkResourceId() {
        return this.virtualNetworkResourceId;
    }

    public VirtualNetworkRuleArgs(
        @Nullable Output<Action> action,
        @Nullable Output<Either<String,State>> state,
        Output<String> virtualNetworkResourceId) {
        this.action = action == null ? Codegen.ofNullable(io.pulumi.azurenative.storage.enums.Action.Allow) : action;
        this.state = state;
        this.virtualNetworkResourceId = Objects.requireNonNull(virtualNetworkResourceId, "expected parameter 'virtualNetworkResourceId' to be non-null");
    }

    private VirtualNetworkRuleArgs() {
        this.action = Codegen.empty();
        this.state = Codegen.empty();
        this.virtualNetworkResourceId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Action> action;
        private @Nullable Output<Either<String,State>> state;
        private Output<String> virtualNetworkResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.state = defaults.state;
    	      this.virtualNetworkResourceId = defaults.virtualNetworkResourceId;
        }

        public Builder action(@Nullable Output<Action> action) {
            this.action = action;
            return this;
        }
        public Builder action(@Nullable Action action) {
            this.action = Codegen.ofNullable(action);
            return this;
        }
        public Builder state(@Nullable Output<Either<String,State>> state) {
            this.state = state;
            return this;
        }
        public Builder state(@Nullable Either<String,State> state) {
            this.state = Codegen.ofNullable(state);
            return this;
        }
        public Builder virtualNetworkResourceId(Output<String> virtualNetworkResourceId) {
            this.virtualNetworkResourceId = Objects.requireNonNull(virtualNetworkResourceId);
            return this;
        }
        public Builder virtualNetworkResourceId(String virtualNetworkResourceId) {
            this.virtualNetworkResourceId = Output.of(Objects.requireNonNull(virtualNetworkResourceId));
            return this;
        }        public VirtualNetworkRuleArgs build() {
            return new VirtualNetworkRuleArgs(action, state, virtualNetworkResourceId);
        }
    }
}
