// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.directoryservice.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDirectoryVpcSetting {
    private final List<String> availabilityZones;
    /**
     * The identifiers of the subnets for the connector servers (2 subnets in 2 different AZs).
     * 
     */
    private final List<String> subnetIds;
    /**
     * The ID of the VPC that the connector is in.
     * 
     */
    private final String vpcId;

    @CustomType.Constructor
    private GetDirectoryVpcSetting(
        @CustomType.Parameter("availabilityZones") List<String> availabilityZones,
        @CustomType.Parameter("subnetIds") List<String> subnetIds,
        @CustomType.Parameter("vpcId") String vpcId) {
        this.availabilityZones = availabilityZones;
        this.subnetIds = subnetIds;
        this.vpcId = vpcId;
    }

    public List<String> getAvailabilityZones() {
        return this.availabilityZones;
    }
    /**
     * The identifiers of the subnets for the connector servers (2 subnets in 2 different AZs).
     * 
    */
    public List<String> getSubnetIds() {
        return this.subnetIds;
    }
    /**
     * The ID of the VPC that the connector is in.
     * 
    */
    public String getVpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDirectoryVpcSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> availabilityZones;
        private List<String> subnetIds;
        private String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDirectoryVpcSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.subnetIds = defaults.subnetIds;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder availabilityZones(List<String> availabilityZones) {
            this.availabilityZones = Objects.requireNonNull(availabilityZones);
            return this;
        }
        public Builder availabilityZones(String... availabilityZones) {
            return availabilityZones(List.of(availabilityZones));
        }
        public Builder subnetIds(List<String> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }
        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }        public GetDirectoryVpcSetting build() {
            return new GetDirectoryVpcSetting(availabilityZones, subnetIds, vpcId);
        }
    }
}