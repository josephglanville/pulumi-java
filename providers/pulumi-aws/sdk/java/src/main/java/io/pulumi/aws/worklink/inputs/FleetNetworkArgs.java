// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.worklink.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class FleetNetworkArgs extends io.pulumi.resources.ResourceArgs {

    public static final FleetNetworkArgs Empty = new FleetNetworkArgs();

    /**
     * A list of security group IDs associated with access to the provided subnets.
     * 
     */
    @Import(name="securityGroupIds", required=true)
      private final Output<List<String>> securityGroupIds;

    public Output<List<String>> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * A list of subnet IDs used for X-ENI connections from Amazon WorkLink rendering containers.
     * 
     */
    @Import(name="subnetIds", required=true)
      private final Output<List<String>> subnetIds;

    public Output<List<String>> getSubnetIds() {
        return this.subnetIds;
    }

    /**
     * The VPC ID with connectivity to associated websites.
     * 
     */
    @Import(name="vpcId", required=true)
      private final Output<String> vpcId;

    public Output<String> getVpcId() {
        return this.vpcId;
    }

    public FleetNetworkArgs(
        Output<List<String>> securityGroupIds,
        Output<List<String>> subnetIds,
        Output<String> vpcId) {
        this.securityGroupIds = Objects.requireNonNull(securityGroupIds, "expected parameter 'securityGroupIds' to be non-null");
        this.subnetIds = Objects.requireNonNull(subnetIds, "expected parameter 'subnetIds' to be non-null");
        this.vpcId = Objects.requireNonNull(vpcId, "expected parameter 'vpcId' to be non-null");
    }

    private FleetNetworkArgs() {
        this.securityGroupIds = Codegen.empty();
        this.subnetIds = Codegen.empty();
        this.vpcId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> securityGroupIds;
        private Output<List<String>> subnetIds;
        private Output<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetNetworkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetIds = defaults.subnetIds;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder securityGroupIds(Output<List<String>> securityGroupIds) {
            this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
            return this;
        }
        public Builder securityGroupIds(List<String> securityGroupIds) {
            this.securityGroupIds = Output.of(Objects.requireNonNull(securityGroupIds));
            return this;
        }
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }
        public Builder subnetIds(Output<List<String>> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }
        public Builder subnetIds(List<String> subnetIds) {
            this.subnetIds = Output.of(Objects.requireNonNull(subnetIds));
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }
        public Builder vpcId(Output<String> vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public Builder vpcId(String vpcId) {
            this.vpcId = Output.of(Objects.requireNonNull(vpcId));
            return this;
        }        public FleetNetworkArgs build() {
            return new FleetNetworkArgs(securityGroupIds, subnetIds, vpcId);
        }
    }
}
