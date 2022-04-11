// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainVpcOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainVpcOptionsArgs Empty = new DomainVpcOptionsArgs();

    @Import(name="availabilityZones")
      private final @Nullable Output<List<String>> availabilityZones;

    public Output<List<String>> getAvailabilityZones() {
        return this.availabilityZones == null ? Codegen.empty() : this.availabilityZones;
    }

    /**
     * List of VPC Security Group IDs to be applied to the Elasticsearch domain endpoints. If omitted, the default Security Group for the VPC will be used.
     * 
     */
    @Import(name="securityGroupIds")
      private final @Nullable Output<List<String>> securityGroupIds;

    public Output<List<String>> getSecurityGroupIds() {
        return this.securityGroupIds == null ? Codegen.empty() : this.securityGroupIds;
    }

    /**
     * List of VPC Subnet IDs for the Elasticsearch domain endpoints to be created in.
     * 
     */
    @Import(name="subnetIds")
      private final @Nullable Output<List<String>> subnetIds;

    public Output<List<String>> getSubnetIds() {
        return this.subnetIds == null ? Codegen.empty() : this.subnetIds;
    }

    @Import(name="vpcId")
      private final @Nullable Output<String> vpcId;

    public Output<String> getVpcId() {
        return this.vpcId == null ? Codegen.empty() : this.vpcId;
    }

    public DomainVpcOptionsArgs(
        @Nullable Output<List<String>> availabilityZones,
        @Nullable Output<List<String>> securityGroupIds,
        @Nullable Output<List<String>> subnetIds,
        @Nullable Output<String> vpcId) {
        this.availabilityZones = availabilityZones;
        this.securityGroupIds = securityGroupIds;
        this.subnetIds = subnetIds;
        this.vpcId = vpcId;
    }

    private DomainVpcOptionsArgs() {
        this.availabilityZones = Codegen.empty();
        this.securityGroupIds = Codegen.empty();
        this.subnetIds = Codegen.empty();
        this.vpcId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainVpcOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> availabilityZones;
        private @Nullable Output<List<String>> securityGroupIds;
        private @Nullable Output<List<String>> subnetIds;
        private @Nullable Output<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainVpcOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetIds = defaults.subnetIds;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder availabilityZones(@Nullable Output<List<String>> availabilityZones) {
            this.availabilityZones = availabilityZones;
            return this;
        }
        public Builder availabilityZones(@Nullable List<String> availabilityZones) {
            this.availabilityZones = Codegen.ofNullable(availabilityZones);
            return this;
        }
        public Builder availabilityZones(String... availabilityZones) {
            return availabilityZones(List.of(availabilityZones));
        }
        public Builder securityGroupIds(@Nullable Output<List<String>> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public Builder securityGroupIds(@Nullable List<String> securityGroupIds) {
            this.securityGroupIds = Codegen.ofNullable(securityGroupIds);
            return this;
        }
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }
        public Builder subnetIds(@Nullable Output<List<String>> subnetIds) {
            this.subnetIds = subnetIds;
            return this;
        }
        public Builder subnetIds(@Nullable List<String> subnetIds) {
            this.subnetIds = Codegen.ofNullable(subnetIds);
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }
        public Builder vpcId(@Nullable Output<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = Codegen.ofNullable(vpcId);
            return this;
        }        public DomainVpcOptionsArgs build() {
            return new DomainVpcOptionsArgs(availabilityZones, securityGroupIds, subnetIds, vpcId);
        }
    }
}
