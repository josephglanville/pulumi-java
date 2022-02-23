// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetScopeConnectionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetScopeConnectionArgs Empty = new GetScopeConnectionArgs();

    /**
     * The name of the network manager.
     * 
     */
    @InputImport(name="networkManagerName", required=true)
      private final String networkManagerName;

    public String getNetworkManagerName() {
        return this.networkManagerName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name for the cross-tenant connection.
     * 
     */
    @InputImport(name="scopeConnectionName", required=true)
      private final String scopeConnectionName;

    public String getScopeConnectionName() {
        return this.scopeConnectionName;
    }

    public GetScopeConnectionArgs(
        String networkManagerName,
        String resourceGroupName,
        String scopeConnectionName) {
        this.networkManagerName = Objects.requireNonNull(networkManagerName, "expected parameter 'networkManagerName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.scopeConnectionName = Objects.requireNonNull(scopeConnectionName, "expected parameter 'scopeConnectionName' to be non-null");
    }

    private GetScopeConnectionArgs() {
        this.networkManagerName = null;
        this.resourceGroupName = null;
        this.scopeConnectionName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScopeConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String networkManagerName;
        private String resourceGroupName;
        private String scopeConnectionName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetScopeConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkManagerName = defaults.networkManagerName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.scopeConnectionName = defaults.scopeConnectionName;
        }

        public Builder setNetworkManagerName(String networkManagerName) {
            this.networkManagerName = Objects.requireNonNull(networkManagerName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setScopeConnectionName(String scopeConnectionName) {
            this.scopeConnectionName = Objects.requireNonNull(scopeConnectionName);
            return this;
        }
        public GetScopeConnectionArgs build() {
            return new GetScopeConnectionArgs(networkManagerName, resourceGroupName, scopeConnectionName);
        }
    }
}
