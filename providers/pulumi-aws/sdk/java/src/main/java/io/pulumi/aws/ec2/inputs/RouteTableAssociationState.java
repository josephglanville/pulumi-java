// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteTableAssociationState extends io.pulumi.resources.ResourceArgs {

    public static final RouteTableAssociationState Empty = new RouteTableAssociationState();

    /**
     * The gateway ID to create an association. Conflicts with `subnet_id`.
     * 
     */
    @Import(name="gatewayId")
      private final @Nullable Output<String> gatewayId;

    public Output<String> getGatewayId() {
        return this.gatewayId == null ? Output.empty() : this.gatewayId;
    }

    /**
     * The ID of the routing table to associate with.
     * 
     */
    @Import(name="routeTableId")
      private final @Nullable Output<String> routeTableId;

    public Output<String> getRouteTableId() {
        return this.routeTableId == null ? Output.empty() : this.routeTableId;
    }

    /**
     * The subnet ID to create an association. Conflicts with `gateway_id`.
     * 
     */
    @Import(name="subnetId")
      private final @Nullable Output<String> subnetId;

    public Output<String> getSubnetId() {
        return this.subnetId == null ? Output.empty() : this.subnetId;
    }

    public RouteTableAssociationState(
        @Nullable Output<String> gatewayId,
        @Nullable Output<String> routeTableId,
        @Nullable Output<String> subnetId) {
        this.gatewayId = gatewayId;
        this.routeTableId = routeTableId;
        this.subnetId = subnetId;
    }

    private RouteTableAssociationState() {
        this.gatewayId = Output.empty();
        this.routeTableId = Output.empty();
        this.subnetId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteTableAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> gatewayId;
        private @Nullable Output<String> routeTableId;
        private @Nullable Output<String> subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteTableAssociationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gatewayId = defaults.gatewayId;
    	      this.routeTableId = defaults.routeTableId;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder gatewayId(@Nullable Output<String> gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Builder gatewayId(@Nullable String gatewayId) {
            this.gatewayId = Output.ofNullable(gatewayId);
            return this;
        }
        public Builder routeTableId(@Nullable Output<String> routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public Builder routeTableId(@Nullable String routeTableId) {
            this.routeTableId = Output.ofNullable(routeTableId);
            return this;
        }
        public Builder subnetId(@Nullable Output<String> subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = Output.ofNullable(subnetId);
            return this;
        }        public RouteTableAssociationState build() {
            return new RouteTableAssociationState(gatewayId, routeTableId, subnetId);
        }
    }
}