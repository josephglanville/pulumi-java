// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.PropagatedRouteTableResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.azurenative.network.outputs.VnetRouteResponse;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RoutingConfigurationResponse {
    /**
     * The resource id RouteTable associated with this RoutingConfiguration.
     * 
     */
    private final @Nullable SubResourceResponse associatedRouteTable;
    /**
     * The list of RouteTables to advertise the routes to.
     * 
     */
    private final @Nullable PropagatedRouteTableResponse propagatedRouteTables;
    /**
     * List of routes that control routing from VirtualHub into a virtual network connection.
     * 
     */
    private final @Nullable VnetRouteResponse vnetRoutes;

    @CustomType.Constructor
    private RoutingConfigurationResponse(
        @CustomType.Parameter("associatedRouteTable") @Nullable SubResourceResponse associatedRouteTable,
        @CustomType.Parameter("propagatedRouteTables") @Nullable PropagatedRouteTableResponse propagatedRouteTables,
        @CustomType.Parameter("vnetRoutes") @Nullable VnetRouteResponse vnetRoutes) {
        this.associatedRouteTable = associatedRouteTable;
        this.propagatedRouteTables = propagatedRouteTables;
        this.vnetRoutes = vnetRoutes;
    }

    /**
     * The resource id RouteTable associated with this RoutingConfiguration.
     * 
    */
    public Optional<SubResourceResponse> getAssociatedRouteTable() {
        return Optional.ofNullable(this.associatedRouteTable);
    }
    /**
     * The list of RouteTables to advertise the routes to.
     * 
    */
    public Optional<PropagatedRouteTableResponse> getPropagatedRouteTables() {
        return Optional.ofNullable(this.propagatedRouteTables);
    }
    /**
     * List of routes that control routing from VirtualHub into a virtual network connection.
     * 
    */
    public Optional<VnetRouteResponse> getVnetRoutes() {
        return Optional.ofNullable(this.vnetRoutes);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoutingConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SubResourceResponse associatedRouteTable;
        private @Nullable PropagatedRouteTableResponse propagatedRouteTables;
        private @Nullable VnetRouteResponse vnetRoutes;

        public Builder() {
    	      // Empty
        }

        public Builder(RoutingConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associatedRouteTable = defaults.associatedRouteTable;
    	      this.propagatedRouteTables = defaults.propagatedRouteTables;
    	      this.vnetRoutes = defaults.vnetRoutes;
        }

        public Builder associatedRouteTable(@Nullable SubResourceResponse associatedRouteTable) {
            this.associatedRouteTable = associatedRouteTable;
            return this;
        }
        public Builder propagatedRouteTables(@Nullable PropagatedRouteTableResponse propagatedRouteTables) {
            this.propagatedRouteTables = propagatedRouteTables;
            return this;
        }
        public Builder vnetRoutes(@Nullable VnetRouteResponse vnetRoutes) {
            this.vnetRoutes = vnetRoutes;
            return this;
        }        public RoutingConfigurationResponse build() {
            return new RoutingConfigurationResponse(associatedRouteTable, propagatedRouteTables, vnetRoutes);
        }
    }
}
