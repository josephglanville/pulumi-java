// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.enums.RouteNextHopType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteArgs Empty = new RouteArgs();

    /**
     * The destination CIDR to which the route applies.
     * 
     */
    @InputImport(name="addressPrefix")
      private final @Nullable Input<String> addressPrefix;

    public Input<String> getAddressPrefix() {
        return this.addressPrefix == null ? Input.empty() : this.addressPrefix;
    }

    /**
     * A value indicating whether this route overrides overlapping BGP routes regardless of LPM.
     * 
     */
    @InputImport(name="hasBgpOverride")
      private final @Nullable Input<Boolean> hasBgpOverride;

    public Input<Boolean> getHasBgpOverride() {
        return this.hasBgpOverride == null ? Input.empty() : this.hasBgpOverride;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The IP address packets should be forwarded to. Next hop values are only allowed in routes where the next hop type is VirtualAppliance.
     * 
     */
    @InputImport(name="nextHopIpAddress")
      private final @Nullable Input<String> nextHopIpAddress;

    public Input<String> getNextHopIpAddress() {
        return this.nextHopIpAddress == null ? Input.empty() : this.nextHopIpAddress;
    }

    /**
     * The type of Azure hop the packet should be sent to.
     * 
     */
    @InputImport(name="nextHopType", required=true)
      private final Input<Either<String,RouteNextHopType>> nextHopType;

    public Input<Either<String,RouteNextHopType>> getNextHopType() {
        return this.nextHopType;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the route.
     * 
     */
    @InputImport(name="routeName")
      private final @Nullable Input<String> routeName;

    public Input<String> getRouteName() {
        return this.routeName == null ? Input.empty() : this.routeName;
    }

    /**
     * The name of the route table.
     * 
     */
    @InputImport(name="routeTableName", required=true)
      private final Input<String> routeTableName;

    public Input<String> getRouteTableName() {
        return this.routeTableName;
    }

    /**
     * The type of the resource.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public RouteArgs(
        @Nullable Input<String> addressPrefix,
        @Nullable Input<Boolean> hasBgpOverride,
        @Nullable Input<String> id,
        @Nullable Input<String> name,
        @Nullable Input<String> nextHopIpAddress,
        Input<Either<String,RouteNextHopType>> nextHopType,
        Input<String> resourceGroupName,
        @Nullable Input<String> routeName,
        Input<String> routeTableName,
        @Nullable Input<String> type) {
        this.addressPrefix = addressPrefix;
        this.hasBgpOverride = hasBgpOverride;
        this.id = id;
        this.name = name;
        this.nextHopIpAddress = nextHopIpAddress;
        this.nextHopType = Objects.requireNonNull(nextHopType, "expected parameter 'nextHopType' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.routeName = routeName;
        this.routeTableName = Objects.requireNonNull(routeTableName, "expected parameter 'routeTableName' to be non-null");
        this.type = type;
    }

    private RouteArgs() {
        this.addressPrefix = Input.empty();
        this.hasBgpOverride = Input.empty();
        this.id = Input.empty();
        this.name = Input.empty();
        this.nextHopIpAddress = Input.empty();
        this.nextHopType = Input.empty();
        this.resourceGroupName = Input.empty();
        this.routeName = Input.empty();
        this.routeTableName = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> addressPrefix;
        private @Nullable Input<Boolean> hasBgpOverride;
        private @Nullable Input<String> id;
        private @Nullable Input<String> name;
        private @Nullable Input<String> nextHopIpAddress;
        private Input<Either<String,RouteNextHopType>> nextHopType;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> routeName;
        private Input<String> routeTableName;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressPrefix = defaults.addressPrefix;
    	      this.hasBgpOverride = defaults.hasBgpOverride;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.nextHopIpAddress = defaults.nextHopIpAddress;
    	      this.nextHopType = defaults.nextHopType;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.routeName = defaults.routeName;
    	      this.routeTableName = defaults.routeTableName;
    	      this.type = defaults.type;
        }

        public Builder setAddressPrefix(@Nullable Input<String> addressPrefix) {
            this.addressPrefix = addressPrefix;
            return this;
        }

        public Builder setAddressPrefix(@Nullable String addressPrefix) {
            this.addressPrefix = Input.ofNullable(addressPrefix);
            return this;
        }

        public Builder setHasBgpOverride(@Nullable Input<Boolean> hasBgpOverride) {
            this.hasBgpOverride = hasBgpOverride;
            return this;
        }

        public Builder setHasBgpOverride(@Nullable Boolean hasBgpOverride) {
            this.hasBgpOverride = Input.ofNullable(hasBgpOverride);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNextHopIpAddress(@Nullable Input<String> nextHopIpAddress) {
            this.nextHopIpAddress = nextHopIpAddress;
            return this;
        }

        public Builder setNextHopIpAddress(@Nullable String nextHopIpAddress) {
            this.nextHopIpAddress = Input.ofNullable(nextHopIpAddress);
            return this;
        }

        public Builder setNextHopType(Input<Either<String,RouteNextHopType>> nextHopType) {
            this.nextHopType = Objects.requireNonNull(nextHopType);
            return this;
        }

        public Builder setNextHopType(Either<String,RouteNextHopType> nextHopType) {
            this.nextHopType = Input.of(Objects.requireNonNull(nextHopType));
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

        public Builder setRouteName(@Nullable Input<String> routeName) {
            this.routeName = routeName;
            return this;
        }

        public Builder setRouteName(@Nullable String routeName) {
            this.routeName = Input.ofNullable(routeName);
            return this;
        }

        public Builder setRouteTableName(Input<String> routeTableName) {
            this.routeTableName = Objects.requireNonNull(routeTableName);
            return this;
        }

        public Builder setRouteTableName(String routeTableName) {
            this.routeTableName = Input.of(Objects.requireNonNull(routeTableName));
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public RouteArgs build() {
            return new RouteArgs(addressPrefix, hasBgpOverride, id, name, nextHopIpAddress, nextHopType, resourceGroupName, routeName, routeTableName, type);
        }
    }
}
