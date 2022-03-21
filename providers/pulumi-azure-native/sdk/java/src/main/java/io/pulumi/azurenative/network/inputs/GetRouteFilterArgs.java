// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRouteFilterArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRouteFilterArgs Empty = new GetRouteFilterArgs();

    /**
     * Expands referenced express route bgp peering resources.
     * 
     */
    @Import(name="expand")
      private final @Nullable String expand;

    public Optional<String> getExpand() {
        return this.expand == null ? Optional.empty() : Optional.ofNullable(this.expand);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the route filter.
     * 
     */
    @Import(name="routeFilterName", required=true)
      private final String routeFilterName;

    public String getRouteFilterName() {
        return this.routeFilterName;
    }

    public GetRouteFilterArgs(
        @Nullable String expand,
        String resourceGroupName,
        String routeFilterName) {
        this.expand = expand;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.routeFilterName = Objects.requireNonNull(routeFilterName, "expected parameter 'routeFilterName' to be non-null");
    }

    private GetRouteFilterArgs() {
        this.expand = null;
        this.resourceGroupName = null;
        this.routeFilterName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expand;
        private String resourceGroupName;
        private String routeFilterName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRouteFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expand = defaults.expand;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.routeFilterName = defaults.routeFilterName;
        }

        public Builder expand(@Nullable String expand) {
            this.expand = expand;
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder routeFilterName(String routeFilterName) {
            this.routeFilterName = Objects.requireNonNull(routeFilterName);
            return this;
        }        public GetRouteFilterArgs build() {
            return new GetRouteFilterArgs(expand, resourceGroupName, routeFilterName);
        }
    }
}
