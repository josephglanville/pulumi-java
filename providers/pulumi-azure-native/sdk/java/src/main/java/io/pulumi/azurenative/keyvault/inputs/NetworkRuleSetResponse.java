// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault.inputs;

import io.pulumi.azurenative.keyvault.inputs.IPRuleResponse;
import io.pulumi.azurenative.keyvault.inputs.VirtualNetworkRuleResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A set of rules governing the network accessibility of a vault.
 * 
 */
public final class NetworkRuleSetResponse extends io.pulumi.resources.InvokeArgs {

    public static final NetworkRuleSetResponse Empty = new NetworkRuleSetResponse();

    /**
     * Tells what traffic can bypass network rules. This can be 'AzureServices' or 'None'.  If not specified the default is 'AzureServices'.
     * 
     */
    @Import(name="bypass")
      private final @Nullable String bypass;

    public Optional<String> getBypass() {
        return this.bypass == null ? Optional.empty() : Optional.ofNullable(this.bypass);
    }

    /**
     * The default action when no rule from ipRules and from virtualNetworkRules match. This is only used after the bypass property has been evaluated.
     * 
     */
    @Import(name="defaultAction")
      private final @Nullable String defaultAction;

    public Optional<String> getDefaultAction() {
        return this.defaultAction == null ? Optional.empty() : Optional.ofNullable(this.defaultAction);
    }

    /**
     * The list of IP address rules.
     * 
     */
    @Import(name="ipRules")
      private final @Nullable List<IPRuleResponse> ipRules;

    public List<IPRuleResponse> getIpRules() {
        return this.ipRules == null ? List.of() : this.ipRules;
    }

    /**
     * The list of virtual network rules.
     * 
     */
    @Import(name="virtualNetworkRules")
      private final @Nullable List<VirtualNetworkRuleResponse> virtualNetworkRules;

    public List<VirtualNetworkRuleResponse> getVirtualNetworkRules() {
        return this.virtualNetworkRules == null ? List.of() : this.virtualNetworkRules;
    }

    public NetworkRuleSetResponse(
        @Nullable String bypass,
        @Nullable String defaultAction,
        @Nullable List<IPRuleResponse> ipRules,
        @Nullable List<VirtualNetworkRuleResponse> virtualNetworkRules) {
        this.bypass = bypass;
        this.defaultAction = defaultAction;
        this.ipRules = ipRules;
        this.virtualNetworkRules = virtualNetworkRules;
    }

    private NetworkRuleSetResponse() {
        this.bypass = null;
        this.defaultAction = null;
        this.ipRules = List.of();
        this.virtualNetworkRules = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkRuleSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String bypass;
        private @Nullable String defaultAction;
        private @Nullable List<IPRuleResponse> ipRules;
        private @Nullable List<VirtualNetworkRuleResponse> virtualNetworkRules;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkRuleSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bypass = defaults.bypass;
    	      this.defaultAction = defaults.defaultAction;
    	      this.ipRules = defaults.ipRules;
    	      this.virtualNetworkRules = defaults.virtualNetworkRules;
        }

        public Builder bypass(@Nullable String bypass) {
            this.bypass = bypass;
            return this;
        }
        public Builder defaultAction(@Nullable String defaultAction) {
            this.defaultAction = defaultAction;
            return this;
        }
        public Builder ipRules(@Nullable List<IPRuleResponse> ipRules) {
            this.ipRules = ipRules;
            return this;
        }
        public Builder ipRules(IPRuleResponse... ipRules) {
            return ipRules(List.of(ipRules));
        }
        public Builder virtualNetworkRules(@Nullable List<VirtualNetworkRuleResponse> virtualNetworkRules) {
            this.virtualNetworkRules = virtualNetworkRules;
            return this;
        }
        public Builder virtualNetworkRules(VirtualNetworkRuleResponse... virtualNetworkRules) {
            return virtualNetworkRules(List.of(virtualNetworkRules));
        }        public NetworkRuleSetResponse build() {
            return new NetworkRuleSetResponse(bypass, defaultAction, ipRules, virtualNetworkRules);
        }
    }
}
