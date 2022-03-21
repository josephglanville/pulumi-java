// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVirtualHubRouteTableV2Args extends io.pulumi.resources.InvokeArgs {

    public static final GetVirtualHubRouteTableV2Args Empty = new GetVirtualHubRouteTableV2Args();

    /**
     * The resource group name of the VirtualHubRouteTableV2.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the VirtualHubRouteTableV2.
     * 
     */
    @Import(name="routeTableName", required=true)
      private final String routeTableName;

    public String getRouteTableName() {
        return this.routeTableName;
    }

    /**
     * The name of the VirtualHub.
     * 
     */
    @Import(name="virtualHubName", required=true)
      private final String virtualHubName;

    public String getVirtualHubName() {
        return this.virtualHubName;
    }

    public GetVirtualHubRouteTableV2Args(
        String resourceGroupName,
        String routeTableName,
        String virtualHubName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.routeTableName = Objects.requireNonNull(routeTableName, "expected parameter 'routeTableName' to be non-null");
        this.virtualHubName = Objects.requireNonNull(virtualHubName, "expected parameter 'virtualHubName' to be non-null");
    }

    private GetVirtualHubRouteTableV2Args() {
        this.resourceGroupName = null;
        this.routeTableName = null;
        this.virtualHubName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualHubRouteTableV2Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String routeTableName;
        private String virtualHubName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualHubRouteTableV2Args defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.routeTableName = defaults.routeTableName;
    	      this.virtualHubName = defaults.virtualHubName;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder routeTableName(String routeTableName) {
            this.routeTableName = Objects.requireNonNull(routeTableName);
            return this;
        }
        public Builder virtualHubName(String virtualHubName) {
            this.virtualHubName = Objects.requireNonNull(virtualHubName);
            return this;
        }        public GetVirtualHubRouteTableV2Args build() {
            return new GetVirtualHubRouteTableV2Args(resourceGroupName, routeTableName, virtualHubName);
        }
    }
}
