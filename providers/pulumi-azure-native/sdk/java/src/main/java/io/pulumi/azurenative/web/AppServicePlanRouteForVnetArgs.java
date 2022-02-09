// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.web.enums.RouteType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppServicePlanRouteForVnetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppServicePlanRouteForVnetArgs Empty = new AppServicePlanRouteForVnetArgs();

    @InputImport(name="endAddress")
    private final @Nullable Input<String> endAddress;

    public Input<String> getEndAddress() {
        return this.endAddress == null ? Input.empty() : this.endAddress;
    }

    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="routeName")
    private final @Nullable Input<String> routeName;

    public Input<String> getRouteName() {
        return this.routeName == null ? Input.empty() : this.routeName;
    }

    @InputImport(name="routeType")
    private final @Nullable Input<Either<String,RouteType>> routeType;

    public Input<Either<String,RouteType>> getRouteType() {
        return this.routeType == null ? Input.empty() : this.routeType;
    }

    @InputImport(name="startAddress")
    private final @Nullable Input<String> startAddress;

    public Input<String> getStartAddress() {
        return this.startAddress == null ? Input.empty() : this.startAddress;
    }

    @InputImport(name="vnetName", required=true)
    private final Input<String> vnetName;

    public Input<String> getVnetName() {
        return this.vnetName;
    }

    public AppServicePlanRouteForVnetArgs(
        @Nullable Input<String> endAddress,
        @Nullable Input<String> kind,
        Input<String> name,
        Input<String> resourceGroupName,
        @Nullable Input<String> routeName,
        @Nullable Input<Either<String,RouteType>> routeType,
        @Nullable Input<String> startAddress,
        Input<String> vnetName) {
        this.endAddress = endAddress;
        this.kind = kind;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.routeName = routeName;
        this.routeType = routeType;
        this.startAddress = startAddress;
        this.vnetName = Objects.requireNonNull(vnetName, "expected parameter 'vnetName' to be non-null");
    }

    private AppServicePlanRouteForVnetArgs() {
        this.endAddress = Input.empty();
        this.kind = Input.empty();
        this.name = Input.empty();
        this.resourceGroupName = Input.empty();
        this.routeName = Input.empty();
        this.routeType = Input.empty();
        this.startAddress = Input.empty();
        this.vnetName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppServicePlanRouteForVnetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> endAddress;
        private @Nullable Input<String> kind;
        private Input<String> name;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> routeName;
        private @Nullable Input<Either<String,RouteType>> routeType;
        private @Nullable Input<String> startAddress;
        private Input<String> vnetName;

        public Builder() {
    	      // Empty
        }

        public Builder(AppServicePlanRouteForVnetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endAddress = defaults.endAddress;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.routeName = defaults.routeName;
    	      this.routeType = defaults.routeType;
    	      this.startAddress = defaults.startAddress;
    	      this.vnetName = defaults.vnetName;
        }

        public Builder setEndAddress(@Nullable Input<String> endAddress) {
            this.endAddress = endAddress;
            return this;
        }

        public Builder setEndAddress(@Nullable String endAddress) {
            this.endAddress = Input.ofNullable(endAddress);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
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

        public Builder setRouteType(@Nullable Input<Either<String,RouteType>> routeType) {
            this.routeType = routeType;
            return this;
        }

        public Builder setRouteType(@Nullable Either<String,RouteType> routeType) {
            this.routeType = Input.ofNullable(routeType);
            return this;
        }

        public Builder setStartAddress(@Nullable Input<String> startAddress) {
            this.startAddress = startAddress;
            return this;
        }

        public Builder setStartAddress(@Nullable String startAddress) {
            this.startAddress = Input.ofNullable(startAddress);
            return this;
        }

        public Builder setVnetName(Input<String> vnetName) {
            this.vnetName = Objects.requireNonNull(vnetName);
            return this;
        }

        public Builder setVnetName(String vnetName) {
            this.vnetName = Input.of(Objects.requireNonNull(vnetName));
            return this;
        }

        public AppServicePlanRouteForVnetArgs build() {
            return new AppServicePlanRouteForVnetArgs(endAddress, kind, name, resourceGroupName, routeName, routeType, startAddress, vnetName);
        }
    }
}
