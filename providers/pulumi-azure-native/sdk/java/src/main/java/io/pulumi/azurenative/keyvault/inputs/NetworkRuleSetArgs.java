// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault.inputs;

import io.pulumi.azurenative.keyvault.enums.NetworkRuleAction;
import io.pulumi.azurenative.keyvault.enums.NetworkRuleBypassOptions;
import io.pulumi.azurenative.keyvault.inputs.IPRuleArgs;
import io.pulumi.azurenative.keyvault.inputs.VirtualNetworkRuleArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A set of rules governing the network accessibility of a vault.
 * 
 */
public final class NetworkRuleSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkRuleSetArgs Empty = new NetworkRuleSetArgs();

    /**
     * Tells what traffic can bypass network rules. This can be 'AzureServices' or 'None'.  If not specified the default is 'AzureServices'.
     * 
     */
    @Import(name="bypass")
      private final @Nullable Output<Either<String,NetworkRuleBypassOptions>> bypass;

    public Output<Either<String,NetworkRuleBypassOptions>> getBypass() {
        return this.bypass == null ? Output.empty() : this.bypass;
    }

    /**
     * The default action when no rule from ipRules and from virtualNetworkRules match. This is only used after the bypass property has been evaluated.
     * 
     */
    @Import(name="defaultAction")
      private final @Nullable Output<Either<String,NetworkRuleAction>> defaultAction;

    public Output<Either<String,NetworkRuleAction>> getDefaultAction() {
        return this.defaultAction == null ? Output.empty() : this.defaultAction;
    }

    /**
     * The list of IP address rules.
     * 
     */
    @Import(name="ipRules")
      private final @Nullable Output<List<IPRuleArgs>> ipRules;

    public Output<List<IPRuleArgs>> getIpRules() {
        return this.ipRules == null ? Output.empty() : this.ipRules;
    }

    /**
     * The list of virtual network rules.
     * 
     */
    @Import(name="virtualNetworkRules")
      private final @Nullable Output<List<VirtualNetworkRuleArgs>> virtualNetworkRules;

    public Output<List<VirtualNetworkRuleArgs>> getVirtualNetworkRules() {
        return this.virtualNetworkRules == null ? Output.empty() : this.virtualNetworkRules;
    }

    public NetworkRuleSetArgs(
        @Nullable Output<Either<String,NetworkRuleBypassOptions>> bypass,
        @Nullable Output<Either<String,NetworkRuleAction>> defaultAction,
        @Nullable Output<List<IPRuleArgs>> ipRules,
        @Nullable Output<List<VirtualNetworkRuleArgs>> virtualNetworkRules) {
        this.bypass = bypass;
        this.defaultAction = defaultAction;
        this.ipRules = ipRules;
        this.virtualNetworkRules = virtualNetworkRules;
    }

    private NetworkRuleSetArgs() {
        this.bypass = Output.empty();
        this.defaultAction = Output.empty();
        this.ipRules = Output.empty();
        this.virtualNetworkRules = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkRuleSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,NetworkRuleBypassOptions>> bypass;
        private @Nullable Output<Either<String,NetworkRuleAction>> defaultAction;
        private @Nullable Output<List<IPRuleArgs>> ipRules;
        private @Nullable Output<List<VirtualNetworkRuleArgs>> virtualNetworkRules;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkRuleSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bypass = defaults.bypass;
    	      this.defaultAction = defaults.defaultAction;
    	      this.ipRules = defaults.ipRules;
    	      this.virtualNetworkRules = defaults.virtualNetworkRules;
        }

        public Builder bypass(@Nullable Output<Either<String,NetworkRuleBypassOptions>> bypass) {
            this.bypass = bypass;
            return this;
        }
        public Builder bypass(@Nullable Either<String,NetworkRuleBypassOptions> bypass) {
            this.bypass = Output.ofNullable(bypass);
            return this;
        }
        public Builder defaultAction(@Nullable Output<Either<String,NetworkRuleAction>> defaultAction) {
            this.defaultAction = defaultAction;
            return this;
        }
        public Builder defaultAction(@Nullable Either<String,NetworkRuleAction> defaultAction) {
            this.defaultAction = Output.ofNullable(defaultAction);
            return this;
        }
        public Builder ipRules(@Nullable Output<List<IPRuleArgs>> ipRules) {
            this.ipRules = ipRules;
            return this;
        }
        public Builder ipRules(@Nullable List<IPRuleArgs> ipRules) {
            this.ipRules = Output.ofNullable(ipRules);
            return this;
        }
        public Builder ipRules(IPRuleArgs... ipRules) {
            return ipRules(List.of(ipRules));
        }
        public Builder virtualNetworkRules(@Nullable Output<List<VirtualNetworkRuleArgs>> virtualNetworkRules) {
            this.virtualNetworkRules = virtualNetworkRules;
            return this;
        }
        public Builder virtualNetworkRules(@Nullable List<VirtualNetworkRuleArgs> virtualNetworkRules) {
            this.virtualNetworkRules = Output.ofNullable(virtualNetworkRules);
            return this;
        }
        public Builder virtualNetworkRules(VirtualNetworkRuleArgs... virtualNetworkRules) {
            return virtualNetworkRules(List.of(virtualNetworkRules));
        }        public NetworkRuleSetArgs build() {
            return new NetworkRuleSetArgs(bypass, defaultAction, ipRules, virtualNetworkRules);
        }
    }
}
