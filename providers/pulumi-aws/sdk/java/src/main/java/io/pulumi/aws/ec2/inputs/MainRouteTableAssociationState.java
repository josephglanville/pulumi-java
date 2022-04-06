// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MainRouteTableAssociationState extends io.pulumi.resources.ResourceArgs {

    public static final MainRouteTableAssociationState Empty = new MainRouteTableAssociationState();

    /**
     * Used internally, see __Notes__ below
     * 
     */
    @Import(name="originalRouteTableId")
      private final @Nullable Output<String> originalRouteTableId;

    public Output<String> getOriginalRouteTableId() {
        return this.originalRouteTableId == null ? Output.empty() : this.originalRouteTableId;
    }

    /**
     * The ID of the Route Table to set as the new
     * main route table for the target VPC
     * 
     */
    @Import(name="routeTableId")
      private final @Nullable Output<String> routeTableId;

    public Output<String> getRouteTableId() {
        return this.routeTableId == null ? Output.empty() : this.routeTableId;
    }

    /**
     * The ID of the VPC whose main route table should be set
     * 
     */
    @Import(name="vpcId")
      private final @Nullable Output<String> vpcId;

    public Output<String> getVpcId() {
        return this.vpcId == null ? Output.empty() : this.vpcId;
    }

    public MainRouteTableAssociationState(
        @Nullable Output<String> originalRouteTableId,
        @Nullable Output<String> routeTableId,
        @Nullable Output<String> vpcId) {
        this.originalRouteTableId = originalRouteTableId;
        this.routeTableId = routeTableId;
        this.vpcId = vpcId;
    }

    private MainRouteTableAssociationState() {
        this.originalRouteTableId = Output.empty();
        this.routeTableId = Output.empty();
        this.vpcId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MainRouteTableAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> originalRouteTableId;
        private @Nullable Output<String> routeTableId;
        private @Nullable Output<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(MainRouteTableAssociationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.originalRouteTableId = defaults.originalRouteTableId;
    	      this.routeTableId = defaults.routeTableId;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder originalRouteTableId(@Nullable Output<String> originalRouteTableId) {
            this.originalRouteTableId = originalRouteTableId;
            return this;
        }
        public Builder originalRouteTableId(@Nullable String originalRouteTableId) {
            this.originalRouteTableId = Output.ofNullable(originalRouteTableId);
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
        public Builder vpcId(@Nullable Output<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = Output.ofNullable(vpcId);
            return this;
        }        public MainRouteTableAssociationState build() {
            return new MainRouteTableAssociationState(originalRouteTableId, routeTableId, vpcId);
        }
    }
}