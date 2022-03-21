// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.enums.RouteNextHopType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="addressPrefix")
      private final @Nullable Output<String> addressPrefix;

    public Output<String> getAddressPrefix() {
        return this.addressPrefix == null ? Output.empty() : this.addressPrefix;
    }

    /**
     * A value indicating whether this route overrides overlapping BGP routes regardless of LPM.
     * 
     */
    @Import(name="hasBgpOverride")
      private final @Nullable Output<Boolean> hasBgpOverride;

    public Output<Boolean> getHasBgpOverride() {
        return this.hasBgpOverride == null ? Output.empty() : this.hasBgpOverride;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The IP address packets should be forwarded to. Next hop values are only allowed in routes where the next hop type is VirtualAppliance.
     * 
     */
    @Import(name="nextHopIpAddress")
      private final @Nullable Output<String> nextHopIpAddress;

    public Output<String> getNextHopIpAddress() {
        return this.nextHopIpAddress == null ? Output.empty() : this.nextHopIpAddress;
    }

    /**
     * The type of Azure hop the packet should be sent to.
     * 
     */
    @Import(name="nextHopType", required=true)
      private final Output<Either<String,RouteNextHopType>> nextHopType;

    public Output<Either<String,RouteNextHopType>> getNextHopType() {
        return this.nextHopType;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the route.
     * 
     */
    @Import(name="routeName")
      private final @Nullable Output<String> routeName;

    public Output<String> getRouteName() {
        return this.routeName == null ? Output.empty() : this.routeName;
    }

    /**
     * The name of the route table.
     * 
     */
    @Import(name="routeTableName", required=true)
      private final Output<String> routeTableName;

    public Output<String> getRouteTableName() {
        return this.routeTableName;
    }

    /**
     * The type of the resource.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public RouteArgs(
        @Nullable Output<String> addressPrefix,
        @Nullable Output<Boolean> hasBgpOverride,
        @Nullable Output<String> id,
        @Nullable Output<String> name,
        @Nullable Output<String> nextHopIpAddress,
        Output<Either<String,RouteNextHopType>> nextHopType,
        Output<String> resourceGroupName,
        @Nullable Output<String> routeName,
        Output<String> routeTableName,
        @Nullable Output<String> type) {
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
        this.addressPrefix = Output.empty();
        this.hasBgpOverride = Output.empty();
        this.id = Output.empty();
        this.name = Output.empty();
        this.nextHopIpAddress = Output.empty();
        this.nextHopType = Output.empty();
        this.resourceGroupName = Output.empty();
        this.routeName = Output.empty();
        this.routeTableName = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> addressPrefix;
        private @Nullable Output<Boolean> hasBgpOverride;
        private @Nullable Output<String> id;
        private @Nullable Output<String> name;
        private @Nullable Output<String> nextHopIpAddress;
        private Output<Either<String,RouteNextHopType>> nextHopType;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> routeName;
        private Output<String> routeTableName;
        private @Nullable Output<String> type;

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

        public Builder addressPrefix(@Nullable Output<String> addressPrefix) {
            this.addressPrefix = addressPrefix;
            return this;
        }
        public Builder addressPrefix(@Nullable String addressPrefix) {
            this.addressPrefix = Output.ofNullable(addressPrefix);
            return this;
        }
        public Builder hasBgpOverride(@Nullable Output<Boolean> hasBgpOverride) {
            this.hasBgpOverride = hasBgpOverride;
            return this;
        }
        public Builder hasBgpOverride(@Nullable Boolean hasBgpOverride) {
            this.hasBgpOverride = Output.ofNullable(hasBgpOverride);
            return this;
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder nextHopIpAddress(@Nullable Output<String> nextHopIpAddress) {
            this.nextHopIpAddress = nextHopIpAddress;
            return this;
        }
        public Builder nextHopIpAddress(@Nullable String nextHopIpAddress) {
            this.nextHopIpAddress = Output.ofNullable(nextHopIpAddress);
            return this;
        }
        public Builder nextHopType(Output<Either<String,RouteNextHopType>> nextHopType) {
            this.nextHopType = Objects.requireNonNull(nextHopType);
            return this;
        }
        public Builder nextHopType(Either<String,RouteNextHopType> nextHopType) {
            this.nextHopType = Output.of(Objects.requireNonNull(nextHopType));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder routeName(@Nullable Output<String> routeName) {
            this.routeName = routeName;
            return this;
        }
        public Builder routeName(@Nullable String routeName) {
            this.routeName = Output.ofNullable(routeName);
            return this;
        }
        public Builder routeTableName(Output<String> routeTableName) {
            this.routeTableName = Objects.requireNonNull(routeTableName);
            return this;
        }
        public Builder routeTableName(String routeTableName) {
            this.routeTableName = Output.of(Objects.requireNonNull(routeTableName));
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Output.ofNullable(type);
            return this;
        }        public RouteArgs build() {
            return new RouteArgs(addressPrefix, hasBgpOverride, id, name, nextHopIpAddress, nextHopType, resourceGroupName, routeName, routeTableName, type);
        }
    }
}
