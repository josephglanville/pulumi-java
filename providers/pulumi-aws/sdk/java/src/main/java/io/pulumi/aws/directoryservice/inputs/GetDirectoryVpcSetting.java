// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.directoryservice.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetDirectoryVpcSetting extends io.pulumi.resources.InvokeArgs {

    public static final GetDirectoryVpcSetting Empty = new GetDirectoryVpcSetting();

    @Import(name="availabilityZones", required=true)
      private final List<String> availabilityZones;

    public List<String> getAvailabilityZones() {
        return this.availabilityZones;
    }

    /**
     * The identifiers of the subnets for the connector servers (2 subnets in 2 different AZs).
     * 
     */
    @Import(name="subnetIds", required=true)
      private final List<String> subnetIds;

    public List<String> getSubnetIds() {
        return this.subnetIds;
    }

    /**
     * The ID of the VPC that the connector is in.
     * 
     */
    @Import(name="vpcId", required=true)
      private final String vpcId;

    public String getVpcId() {
        return this.vpcId;
    }

    public GetDirectoryVpcSetting(
        List<String> availabilityZones,
        List<String> subnetIds,
        String vpcId) {
        this.availabilityZones = Objects.requireNonNull(availabilityZones, "expected parameter 'availabilityZones' to be non-null");
        this.subnetIds = Objects.requireNonNull(subnetIds, "expected parameter 'subnetIds' to be non-null");
        this.vpcId = Objects.requireNonNull(vpcId, "expected parameter 'vpcId' to be non-null");
    }

    private GetDirectoryVpcSetting() {
        this.availabilityZones = List.of();
        this.subnetIds = List.of();
        this.vpcId = null;
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