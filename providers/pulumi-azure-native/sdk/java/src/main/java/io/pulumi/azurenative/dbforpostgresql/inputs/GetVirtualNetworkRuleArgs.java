// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbforpostgresql.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVirtualNetworkRuleArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetVirtualNetworkRuleArgs Empty = new GetVirtualNetworkRuleArgs();

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server.
     * 
     */
    @Import(name="serverName", required=true)
      private final String serverName;

    public String getServerName() {
        return this.serverName;
    }

    /**
     * The name of the virtual network rule.
     * 
     */
    @Import(name="virtualNetworkRuleName", required=true)
      private final String virtualNetworkRuleName;

    public String getVirtualNetworkRuleName() {
        return this.virtualNetworkRuleName;
    }

    public GetVirtualNetworkRuleArgs(
        String resourceGroupName,
        String serverName,
        String virtualNetworkRuleName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
        this.virtualNetworkRuleName = Objects.requireNonNull(virtualNetworkRuleName, "expected parameter 'virtualNetworkRuleName' to be non-null");
    }

    private GetVirtualNetworkRuleArgs() {
        this.resourceGroupName = null;
        this.serverName = null;
        this.virtualNetworkRuleName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualNetworkRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String serverName;
        private String virtualNetworkRuleName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualNetworkRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverName = defaults.serverName;
    	      this.virtualNetworkRuleName = defaults.virtualNetworkRuleName;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder serverName(String serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }
        public Builder virtualNetworkRuleName(String virtualNetworkRuleName) {
            this.virtualNetworkRuleName = Objects.requireNonNull(virtualNetworkRuleName);
            return this;
        }        public GetVirtualNetworkRuleArgs build() {
            return new GetVirtualNetworkRuleArgs(resourceGroupName, serverName, virtualNetworkRuleName);
        }
    }
}
