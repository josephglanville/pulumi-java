// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.aws.ec2.outputs.SpotFleetRequestLaunchSpecificationEbsBlockDevice;
import io.pulumi.aws.ec2.outputs.SpotFleetRequestLaunchSpecificationEphemeralBlockDevice;
import io.pulumi.aws.ec2.outputs.SpotFleetRequestLaunchSpecificationRootBlockDevice;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SpotFleetRequestLaunchSpecification {
    private final String ami;
    private final @Nullable Boolean associatePublicIpAddress;
    /**
     * The availability zone in which to place the request.
     * 
     */
    private final @Nullable String availabilityZone;
    private final @Nullable List<SpotFleetRequestLaunchSpecificationEbsBlockDevice> ebsBlockDevices;
    private final @Nullable Boolean ebsOptimized;
    private final @Nullable List<SpotFleetRequestLaunchSpecificationEphemeralBlockDevice> ephemeralBlockDevices;
    private final @Nullable String iamInstanceProfile;
    private final @Nullable String iamInstanceProfileArn;
    /**
     * The type of instance to request.
     * 
     */
    private final String instanceType;
    private final @Nullable String keyName;
    private final @Nullable Boolean monitoring;
    private final @Nullable String placementGroup;
    private final @Nullable String placementTenancy;
    private final @Nullable List<SpotFleetRequestLaunchSpecificationRootBlockDevice> rootBlockDevices;
    /**
     * The maximum spot bid for this override request.
     * 
     */
    private final @Nullable String spotPrice;
    /**
     * The subnet in which to launch the requested instance.
     * 
     */
    private final @Nullable String subnetId;
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    private final @Nullable Map<String,String> tags;
    private final @Nullable String userData;
    private final @Nullable List<String> vpcSecurityGroupIds;
    /**
     * The capacity added to the fleet by a fulfilled request.
     * 
     */
    private final @Nullable String weightedCapacity;

    @CustomType.Constructor
    private SpotFleetRequestLaunchSpecification(
        @CustomType.Parameter("ami") String ami,
        @CustomType.Parameter("associatePublicIpAddress") @Nullable Boolean associatePublicIpAddress,
        @CustomType.Parameter("availabilityZone") @Nullable String availabilityZone,
        @CustomType.Parameter("ebsBlockDevices") @Nullable List<SpotFleetRequestLaunchSpecificationEbsBlockDevice> ebsBlockDevices,
        @CustomType.Parameter("ebsOptimized") @Nullable Boolean ebsOptimized,
        @CustomType.Parameter("ephemeralBlockDevices") @Nullable List<SpotFleetRequestLaunchSpecificationEphemeralBlockDevice> ephemeralBlockDevices,
        @CustomType.Parameter("iamInstanceProfile") @Nullable String iamInstanceProfile,
        @CustomType.Parameter("iamInstanceProfileArn") @Nullable String iamInstanceProfileArn,
        @CustomType.Parameter("instanceType") String instanceType,
        @CustomType.Parameter("keyName") @Nullable String keyName,
        @CustomType.Parameter("monitoring") @Nullable Boolean monitoring,
        @CustomType.Parameter("placementGroup") @Nullable String placementGroup,
        @CustomType.Parameter("placementTenancy") @Nullable String placementTenancy,
        @CustomType.Parameter("rootBlockDevices") @Nullable List<SpotFleetRequestLaunchSpecificationRootBlockDevice> rootBlockDevices,
        @CustomType.Parameter("spotPrice") @Nullable String spotPrice,
        @CustomType.Parameter("subnetId") @Nullable String subnetId,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("userData") @Nullable String userData,
        @CustomType.Parameter("vpcSecurityGroupIds") @Nullable List<String> vpcSecurityGroupIds,
        @CustomType.Parameter("weightedCapacity") @Nullable String weightedCapacity) {
        this.ami = ami;
        this.associatePublicIpAddress = associatePublicIpAddress;
        this.availabilityZone = availabilityZone;
        this.ebsBlockDevices = ebsBlockDevices;
        this.ebsOptimized = ebsOptimized;
        this.ephemeralBlockDevices = ephemeralBlockDevices;
        this.iamInstanceProfile = iamInstanceProfile;
        this.iamInstanceProfileArn = iamInstanceProfileArn;
        this.instanceType = instanceType;
        this.keyName = keyName;
        this.monitoring = monitoring;
        this.placementGroup = placementGroup;
        this.placementTenancy = placementTenancy;
        this.rootBlockDevices = rootBlockDevices;
        this.spotPrice = spotPrice;
        this.subnetId = subnetId;
        this.tags = tags;
        this.userData = userData;
        this.vpcSecurityGroupIds = vpcSecurityGroupIds;
        this.weightedCapacity = weightedCapacity;
    }

    public String getAmi() {
        return this.ami;
    }
    public Optional<Boolean> getAssociatePublicIpAddress() {
        return Optional.ofNullable(this.associatePublicIpAddress);
    }
    /**
     * The availability zone in which to place the request.
     * 
    */
    public Optional<String> getAvailabilityZone() {
        return Optional.ofNullable(this.availabilityZone);
    }
    public List<SpotFleetRequestLaunchSpecificationEbsBlockDevice> getEbsBlockDevices() {
        return this.ebsBlockDevices == null ? List.of() : this.ebsBlockDevices;
    }
    public Optional<Boolean> getEbsOptimized() {
        return Optional.ofNullable(this.ebsOptimized);
    }
    public List<SpotFleetRequestLaunchSpecificationEphemeralBlockDevice> getEphemeralBlockDevices() {
        return this.ephemeralBlockDevices == null ? List.of() : this.ephemeralBlockDevices;
    }
    public Optional<String> getIamInstanceProfile() {
        return Optional.ofNullable(this.iamInstanceProfile);
    }
    public Optional<String> getIamInstanceProfileArn() {
        return Optional.ofNullable(this.iamInstanceProfileArn);
    }
    /**
     * The type of instance to request.
     * 
    */
    public String getInstanceType() {
        return this.instanceType;
    }
    public Optional<String> getKeyName() {
        return Optional.ofNullable(this.keyName);
    }
    public Optional<Boolean> getMonitoring() {
        return Optional.ofNullable(this.monitoring);
    }
    public Optional<String> getPlacementGroup() {
        return Optional.ofNullable(this.placementGroup);
    }
    public Optional<String> getPlacementTenancy() {
        return Optional.ofNullable(this.placementTenancy);
    }
    public List<SpotFleetRequestLaunchSpecificationRootBlockDevice> getRootBlockDevices() {
        return this.rootBlockDevices == null ? List.of() : this.rootBlockDevices;
    }
    /**
     * The maximum spot bid for this override request.
     * 
    */
    public Optional<String> getSpotPrice() {
        return Optional.ofNullable(this.spotPrice);
    }
    /**
     * The subnet in which to launch the requested instance.
     * 
    */
    public Optional<String> getSubnetId() {
        return Optional.ofNullable(this.subnetId);
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public Optional<String> getUserData() {
        return Optional.ofNullable(this.userData);
    }
    public List<String> getVpcSecurityGroupIds() {
        return this.vpcSecurityGroupIds == null ? List.of() : this.vpcSecurityGroupIds;
    }
    /**
     * The capacity added to the fleet by a fulfilled request.
     * 
    */
    public Optional<String> getWeightedCapacity() {
        return Optional.ofNullable(this.weightedCapacity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetRequestLaunchSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ami;
        private @Nullable Boolean associatePublicIpAddress;
        private @Nullable String availabilityZone;
        private @Nullable List<SpotFleetRequestLaunchSpecificationEbsBlockDevice> ebsBlockDevices;
        private @Nullable Boolean ebsOptimized;
        private @Nullable List<SpotFleetRequestLaunchSpecificationEphemeralBlockDevice> ephemeralBlockDevices;
        private @Nullable String iamInstanceProfile;
        private @Nullable String iamInstanceProfileArn;
        private String instanceType;
        private @Nullable String keyName;
        private @Nullable Boolean monitoring;
        private @Nullable String placementGroup;
        private @Nullable String placementTenancy;
        private @Nullable List<SpotFleetRequestLaunchSpecificationRootBlockDevice> rootBlockDevices;
        private @Nullable String spotPrice;
        private @Nullable String subnetId;
        private @Nullable Map<String,String> tags;
        private @Nullable String userData;
        private @Nullable List<String> vpcSecurityGroupIds;
        private @Nullable String weightedCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetRequestLaunchSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ami = defaults.ami;
    	      this.associatePublicIpAddress = defaults.associatePublicIpAddress;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.ebsBlockDevices = defaults.ebsBlockDevices;
    	      this.ebsOptimized = defaults.ebsOptimized;
    	      this.ephemeralBlockDevices = defaults.ephemeralBlockDevices;
    	      this.iamInstanceProfile = defaults.iamInstanceProfile;
    	      this.iamInstanceProfileArn = defaults.iamInstanceProfileArn;
    	      this.instanceType = defaults.instanceType;
    	      this.keyName = defaults.keyName;
    	      this.monitoring = defaults.monitoring;
    	      this.placementGroup = defaults.placementGroup;
    	      this.placementTenancy = defaults.placementTenancy;
    	      this.rootBlockDevices = defaults.rootBlockDevices;
    	      this.spotPrice = defaults.spotPrice;
    	      this.subnetId = defaults.subnetId;
    	      this.tags = defaults.tags;
    	      this.userData = defaults.userData;
    	      this.vpcSecurityGroupIds = defaults.vpcSecurityGroupIds;
    	      this.weightedCapacity = defaults.weightedCapacity;
        }

        public Builder ami(String ami) {
            this.ami = Objects.requireNonNull(ami);
            return this;
        }
        public Builder associatePublicIpAddress(@Nullable Boolean associatePublicIpAddress) {
            this.associatePublicIpAddress = associatePublicIpAddress;
            return this;
        }
        public Builder availabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public Builder ebsBlockDevices(@Nullable List<SpotFleetRequestLaunchSpecificationEbsBlockDevice> ebsBlockDevices) {
            this.ebsBlockDevices = ebsBlockDevices;
            return this;
        }
        public Builder ebsBlockDevices(SpotFleetRequestLaunchSpecificationEbsBlockDevice... ebsBlockDevices) {
            return ebsBlockDevices(List.of(ebsBlockDevices));
        }
        public Builder ebsOptimized(@Nullable Boolean ebsOptimized) {
            this.ebsOptimized = ebsOptimized;
            return this;
        }
        public Builder ephemeralBlockDevices(@Nullable List<SpotFleetRequestLaunchSpecificationEphemeralBlockDevice> ephemeralBlockDevices) {
            this.ephemeralBlockDevices = ephemeralBlockDevices;
            return this;
        }
        public Builder ephemeralBlockDevices(SpotFleetRequestLaunchSpecificationEphemeralBlockDevice... ephemeralBlockDevices) {
            return ephemeralBlockDevices(List.of(ephemeralBlockDevices));
        }
        public Builder iamInstanceProfile(@Nullable String iamInstanceProfile) {
            this.iamInstanceProfile = iamInstanceProfile;
            return this;
        }
        public Builder iamInstanceProfileArn(@Nullable String iamInstanceProfileArn) {
            this.iamInstanceProfileArn = iamInstanceProfileArn;
            return this;
        }
        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        public Builder keyName(@Nullable String keyName) {
            this.keyName = keyName;
            return this;
        }
        public Builder monitoring(@Nullable Boolean monitoring) {
            this.monitoring = monitoring;
            return this;
        }
        public Builder placementGroup(@Nullable String placementGroup) {
            this.placementGroup = placementGroup;
            return this;
        }
        public Builder placementTenancy(@Nullable String placementTenancy) {
            this.placementTenancy = placementTenancy;
            return this;
        }
        public Builder rootBlockDevices(@Nullable List<SpotFleetRequestLaunchSpecificationRootBlockDevice> rootBlockDevices) {
            this.rootBlockDevices = rootBlockDevices;
            return this;
        }
        public Builder rootBlockDevices(SpotFleetRequestLaunchSpecificationRootBlockDevice... rootBlockDevices) {
            return rootBlockDevices(List.of(rootBlockDevices));
        }
        public Builder spotPrice(@Nullable String spotPrice) {
            this.spotPrice = spotPrice;
            return this;
        }
        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder userData(@Nullable String userData) {
            this.userData = userData;
            return this;
        }
        public Builder vpcSecurityGroupIds(@Nullable List<String> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = vpcSecurityGroupIds;
            return this;
        }
        public Builder vpcSecurityGroupIds(String... vpcSecurityGroupIds) {
            return vpcSecurityGroupIds(List.of(vpcSecurityGroupIds));
        }
        public Builder weightedCapacity(@Nullable String weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }        public SpotFleetRequestLaunchSpecification build() {
            return new SpotFleetRequestLaunchSpecification(ami, associatePublicIpAddress, availabilityZone, ebsBlockDevices, ebsOptimized, ephemeralBlockDevices, iamInstanceProfile, iamInstanceProfileArn, instanceType, keyName, monitoring, placementGroup, placementTenancy, rootBlockDevices, spotPrice, subnetId, tags, userData, vpcSecurityGroupIds, weightedCapacity);
        }
    }
}
