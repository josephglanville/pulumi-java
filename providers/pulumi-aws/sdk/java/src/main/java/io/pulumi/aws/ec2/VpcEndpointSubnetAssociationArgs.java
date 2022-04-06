// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class VpcEndpointSubnetAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpcEndpointSubnetAssociationArgs Empty = new VpcEndpointSubnetAssociationArgs();

    /**
     * The ID of the subnet to be associated with the VPC endpoint.
     * 
     */
    @Import(name="subnetId", required=true)
      private final Output<String> subnetId;

    public Output<String> getSubnetId() {
        return this.subnetId;
    }

    /**
     * The ID of the VPC endpoint with which the subnet will be associated.
     * 
     */
    @Import(name="vpcEndpointId", required=true)
      private final Output<String> vpcEndpointId;

    public Output<String> getVpcEndpointId() {
        return this.vpcEndpointId;
    }

    public VpcEndpointSubnetAssociationArgs(
        Output<String> subnetId,
        Output<String> vpcEndpointId) {
        this.subnetId = Objects.requireNonNull(subnetId, "expected parameter 'subnetId' to be non-null");
        this.vpcEndpointId = Objects.requireNonNull(vpcEndpointId, "expected parameter 'vpcEndpointId' to be non-null");
    }

    private VpcEndpointSubnetAssociationArgs() {
        this.subnetId = Output.empty();
        this.vpcEndpointId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcEndpointSubnetAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> subnetId;
        private Output<String> vpcEndpointId;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcEndpointSubnetAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subnetId = defaults.subnetId;
    	      this.vpcEndpointId = defaults.vpcEndpointId;
        }

        public Builder subnetId(Output<String> subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        public Builder subnetId(String subnetId) {
            this.subnetId = Output.of(Objects.requireNonNull(subnetId));
            return this;
        }
        public Builder vpcEndpointId(Output<String> vpcEndpointId) {
            this.vpcEndpointId = Objects.requireNonNull(vpcEndpointId);
            return this;
        }
        public Builder vpcEndpointId(String vpcEndpointId) {
            this.vpcEndpointId = Output.of(Objects.requireNonNull(vpcEndpointId));
            return this;
        }        public VpcEndpointSubnetAssociationArgs build() {
            return new VpcEndpointSubnetAssociationArgs(subnetId, vpcEndpointId);
        }
    }
}