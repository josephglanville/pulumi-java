// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDomainVpcOption {
    /**
     * The availability zones used by the domain.
     * 
     */
    private final List<String> availabilityZones;
    /**
     * The security groups used by the domain.
     * 
     */
    private final List<String> securityGroupIds;
    /**
     * The subnets used by the domain.
     * 
     */
    private final List<String> subnetIds;
    /**
     * The VPC used by the domain.
     * 
     */
    private final String vpcId;

    @CustomType.Constructor
    private GetDomainVpcOption(
        @CustomType.Parameter("availabilityZones") List<String> availabilityZones,
        @CustomType.Parameter("securityGroupIds") List<String> securityGroupIds,
        @CustomType.Parameter("subnetIds") List<String> subnetIds,
        @CustomType.Parameter("vpcId") String vpcId) {
        this.availabilityZones = availabilityZones;
        this.securityGroupIds = securityGroupIds;
        this.subnetIds = subnetIds;
        this.vpcId = vpcId;
    }

    /**
     * The availability zones used by the domain.
     * 
    */
    public List<String> getAvailabilityZones() {
        return this.availabilityZones;
    }
    /**
     * The security groups used by the domain.
     * 
    */
    public List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }
    /**
     * The subnets used by the domain.
     * 
    */
    public List<String> getSubnetIds() {
        return this.subnetIds;
    }
    /**
     * The VPC used by the domain.
     * 
    */
    public String getVpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainVpcOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> availabilityZones;
        private List<String> securityGroupIds;
        private List<String> subnetIds;
        private String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainVpcOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.securityGroupIds = defaults.securityGroupIds;
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
        public Builder securityGroupIds(List<String> securityGroupIds) {
            this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
            return this;
        }
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
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
        }        public GetDomainVpcOption build() {
            return new GetDomainVpcOption(availabilityZones, securityGroupIds, subnetIds, vpcId);
        }
    }
}
