// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNetworkRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkRuleArgs Empty = new VirtualNetworkRuleArgs();

    /**
     * Create firewall rule before the virtual network has vnet service endpoint enabled.
     * 
     */
    @InputImport(name="ignoreMissingVnetServiceEndpoint")
      private final @Nullable Input<Boolean> ignoreMissingVnetServiceEndpoint;

    public Input<Boolean> getIgnoreMissingVnetServiceEndpoint() {
        return this.ignoreMissingVnetServiceEndpoint == null ? Input.empty() : this.ignoreMissingVnetServiceEndpoint;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server.
     * 
     */
    @InputImport(name="serverName", required=true)
      private final Input<String> serverName;

    public Input<String> getServerName() {
        return this.serverName;
    }

    /**
     * The name of the virtual network rule.
     * 
     */
    @InputImport(name="virtualNetworkRuleName")
      private final @Nullable Input<String> virtualNetworkRuleName;

    public Input<String> getVirtualNetworkRuleName() {
        return this.virtualNetworkRuleName == null ? Input.empty() : this.virtualNetworkRuleName;
    }

    /**
     * The ARM resource id of the virtual network subnet.
     * 
     */
    @InputImport(name="virtualNetworkSubnetId", required=true)
      private final Input<String> virtualNetworkSubnetId;

    public Input<String> getVirtualNetworkSubnetId() {
        return this.virtualNetworkSubnetId;
    }

    public VirtualNetworkRuleArgs(
        @Nullable Input<Boolean> ignoreMissingVnetServiceEndpoint,
        Input<String> resourceGroupName,
        Input<String> serverName,
        @Nullable Input<String> virtualNetworkRuleName,
        Input<String> virtualNetworkSubnetId) {
        this.ignoreMissingVnetServiceEndpoint = ignoreMissingVnetServiceEndpoint;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
        this.virtualNetworkRuleName = virtualNetworkRuleName;
        this.virtualNetworkSubnetId = Objects.requireNonNull(virtualNetworkSubnetId, "expected parameter 'virtualNetworkSubnetId' to be non-null");
    }

    private VirtualNetworkRuleArgs() {
        this.ignoreMissingVnetServiceEndpoint = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serverName = Input.empty();
        this.virtualNetworkRuleName = Input.empty();
        this.virtualNetworkSubnetId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> ignoreMissingVnetServiceEndpoint;
        private Input<String> resourceGroupName;
        private Input<String> serverName;
        private @Nullable Input<String> virtualNetworkRuleName;
        private Input<String> virtualNetworkSubnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ignoreMissingVnetServiceEndpoint = defaults.ignoreMissingVnetServiceEndpoint;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverName = defaults.serverName;
    	      this.virtualNetworkRuleName = defaults.virtualNetworkRuleName;
    	      this.virtualNetworkSubnetId = defaults.virtualNetworkSubnetId;
        }

        public Builder setIgnoreMissingVnetServiceEndpoint(@Nullable Input<Boolean> ignoreMissingVnetServiceEndpoint) {
            this.ignoreMissingVnetServiceEndpoint = ignoreMissingVnetServiceEndpoint;
            return this;
        }

        public Builder setIgnoreMissingVnetServiceEndpoint(@Nullable Boolean ignoreMissingVnetServiceEndpoint) {
            this.ignoreMissingVnetServiceEndpoint = Input.ofNullable(ignoreMissingVnetServiceEndpoint);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setServerName(Input<String> serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }

        public Builder setServerName(String serverName) {
            this.serverName = Input.of(Objects.requireNonNull(serverName));
            return this;
        }

        public Builder setVirtualNetworkRuleName(@Nullable Input<String> virtualNetworkRuleName) {
            this.virtualNetworkRuleName = virtualNetworkRuleName;
            return this;
        }

        public Builder setVirtualNetworkRuleName(@Nullable String virtualNetworkRuleName) {
            this.virtualNetworkRuleName = Input.ofNullable(virtualNetworkRuleName);
            return this;
        }

        public Builder setVirtualNetworkSubnetId(Input<String> virtualNetworkSubnetId) {
            this.virtualNetworkSubnetId = Objects.requireNonNull(virtualNetworkSubnetId);
            return this;
        }

        public Builder setVirtualNetworkSubnetId(String virtualNetworkSubnetId) {
            this.virtualNetworkSubnetId = Input.of(Objects.requireNonNull(virtualNetworkSubnetId));
            return this;
        }
        public VirtualNetworkRuleArgs build() {
            return new VirtualNetworkRuleArgs(ignoreMissingVnetServiceEndpoint, resourceGroupName, serverName, virtualNetworkRuleName, virtualNetworkSubnetId);
        }
    }
}
