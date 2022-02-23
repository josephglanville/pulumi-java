// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.inspectorv2.inputs;

import io.pulumi.awsnative.inspectorv2.inputs.FilterDateFilterArgs;
import io.pulumi.awsnative.inspectorv2.inputs.FilterMapFilterArgs;
import io.pulumi.awsnative.inspectorv2.inputs.FilterNumberFilterArgs;
import io.pulumi.awsnative.inspectorv2.inputs.FilterPackageFilterArgs;
import io.pulumi.awsnative.inspectorv2.inputs.FilterPortRangeFilterArgs;
import io.pulumi.awsnative.inspectorv2.inputs.FilterStringFilterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FilterCriteriaArgs extends io.pulumi.resources.ResourceArgs {

    public static final FilterCriteriaArgs Empty = new FilterCriteriaArgs();

    @InputImport(name="awsAccountId")
      private final @Nullable Input<List<FilterStringFilterArgs>> awsAccountId;

    public Input<List<FilterStringFilterArgs>> getAwsAccountId() {
        return this.awsAccountId == null ? Input.empty() : this.awsAccountId;
    }

    @InputImport(name="componentId")
      private final @Nullable Input<List<FilterStringFilterArgs>> componentId;

    public Input<List<FilterStringFilterArgs>> getComponentId() {
        return this.componentId == null ? Input.empty() : this.componentId;
    }

    @InputImport(name="componentType")
      private final @Nullable Input<List<FilterStringFilterArgs>> componentType;

    public Input<List<FilterStringFilterArgs>> getComponentType() {
        return this.componentType == null ? Input.empty() : this.componentType;
    }

    @InputImport(name="ec2InstanceImageId")
      private final @Nullable Input<List<FilterStringFilterArgs>> ec2InstanceImageId;

    public Input<List<FilterStringFilterArgs>> getEc2InstanceImageId() {
        return this.ec2InstanceImageId == null ? Input.empty() : this.ec2InstanceImageId;
    }

    @InputImport(name="ec2InstanceSubnetId")
      private final @Nullable Input<List<FilterStringFilterArgs>> ec2InstanceSubnetId;

    public Input<List<FilterStringFilterArgs>> getEc2InstanceSubnetId() {
        return this.ec2InstanceSubnetId == null ? Input.empty() : this.ec2InstanceSubnetId;
    }

    @InputImport(name="ec2InstanceVpcId")
      private final @Nullable Input<List<FilterStringFilterArgs>> ec2InstanceVpcId;

    public Input<List<FilterStringFilterArgs>> getEc2InstanceVpcId() {
        return this.ec2InstanceVpcId == null ? Input.empty() : this.ec2InstanceVpcId;
    }

    @InputImport(name="ecrImageArchitecture")
      private final @Nullable Input<List<FilterStringFilterArgs>> ecrImageArchitecture;

    public Input<List<FilterStringFilterArgs>> getEcrImageArchitecture() {
        return this.ecrImageArchitecture == null ? Input.empty() : this.ecrImageArchitecture;
    }

    @InputImport(name="ecrImageHash")
      private final @Nullable Input<List<FilterStringFilterArgs>> ecrImageHash;

    public Input<List<FilterStringFilterArgs>> getEcrImageHash() {
        return this.ecrImageHash == null ? Input.empty() : this.ecrImageHash;
    }

    @InputImport(name="ecrImagePushedAt")
      private final @Nullable Input<List<FilterDateFilterArgs>> ecrImagePushedAt;

    public Input<List<FilterDateFilterArgs>> getEcrImagePushedAt() {
        return this.ecrImagePushedAt == null ? Input.empty() : this.ecrImagePushedAt;
    }

    @InputImport(name="ecrImageRegistry")
      private final @Nullable Input<List<FilterStringFilterArgs>> ecrImageRegistry;

    public Input<List<FilterStringFilterArgs>> getEcrImageRegistry() {
        return this.ecrImageRegistry == null ? Input.empty() : this.ecrImageRegistry;
    }

    @InputImport(name="ecrImageRepositoryName")
      private final @Nullable Input<List<FilterStringFilterArgs>> ecrImageRepositoryName;

    public Input<List<FilterStringFilterArgs>> getEcrImageRepositoryName() {
        return this.ecrImageRepositoryName == null ? Input.empty() : this.ecrImageRepositoryName;
    }

    @InputImport(name="ecrImageTags")
      private final @Nullable Input<List<FilterStringFilterArgs>> ecrImageTags;

    public Input<List<FilterStringFilterArgs>> getEcrImageTags() {
        return this.ecrImageTags == null ? Input.empty() : this.ecrImageTags;
    }

    @InputImport(name="findingArn")
      private final @Nullable Input<List<FilterStringFilterArgs>> findingArn;

    public Input<List<FilterStringFilterArgs>> getFindingArn() {
        return this.findingArn == null ? Input.empty() : this.findingArn;
    }

    @InputImport(name="findingStatus")
      private final @Nullable Input<List<FilterStringFilterArgs>> findingStatus;

    public Input<List<FilterStringFilterArgs>> getFindingStatus() {
        return this.findingStatus == null ? Input.empty() : this.findingStatus;
    }

    @InputImport(name="findingType")
      private final @Nullable Input<List<FilterStringFilterArgs>> findingType;

    public Input<List<FilterStringFilterArgs>> getFindingType() {
        return this.findingType == null ? Input.empty() : this.findingType;
    }

    @InputImport(name="firstObservedAt")
      private final @Nullable Input<List<FilterDateFilterArgs>> firstObservedAt;

    public Input<List<FilterDateFilterArgs>> getFirstObservedAt() {
        return this.firstObservedAt == null ? Input.empty() : this.firstObservedAt;
    }

    @InputImport(name="inspectorScore")
      private final @Nullable Input<List<FilterNumberFilterArgs>> inspectorScore;

    public Input<List<FilterNumberFilterArgs>> getInspectorScore() {
        return this.inspectorScore == null ? Input.empty() : this.inspectorScore;
    }

    @InputImport(name="lastObservedAt")
      private final @Nullable Input<List<FilterDateFilterArgs>> lastObservedAt;

    public Input<List<FilterDateFilterArgs>> getLastObservedAt() {
        return this.lastObservedAt == null ? Input.empty() : this.lastObservedAt;
    }

    @InputImport(name="networkProtocol")
      private final @Nullable Input<List<FilterStringFilterArgs>> networkProtocol;

    public Input<List<FilterStringFilterArgs>> getNetworkProtocol() {
        return this.networkProtocol == null ? Input.empty() : this.networkProtocol;
    }

    @InputImport(name="portRange")
      private final @Nullable Input<List<FilterPortRangeFilterArgs>> portRange;

    public Input<List<FilterPortRangeFilterArgs>> getPortRange() {
        return this.portRange == null ? Input.empty() : this.portRange;
    }

    @InputImport(name="relatedVulnerabilities")
      private final @Nullable Input<List<FilterStringFilterArgs>> relatedVulnerabilities;

    public Input<List<FilterStringFilterArgs>> getRelatedVulnerabilities() {
        return this.relatedVulnerabilities == null ? Input.empty() : this.relatedVulnerabilities;
    }

    @InputImport(name="resourceId")
      private final @Nullable Input<List<FilterStringFilterArgs>> resourceId;

    public Input<List<FilterStringFilterArgs>> getResourceId() {
        return this.resourceId == null ? Input.empty() : this.resourceId;
    }

    @InputImport(name="resourceTags")
      private final @Nullable Input<List<FilterMapFilterArgs>> resourceTags;

    public Input<List<FilterMapFilterArgs>> getResourceTags() {
        return this.resourceTags == null ? Input.empty() : this.resourceTags;
    }

    @InputImport(name="resourceType")
      private final @Nullable Input<List<FilterStringFilterArgs>> resourceType;

    public Input<List<FilterStringFilterArgs>> getPropResourceType() {
        return this.resourceType == null ? Input.empty() : this.resourceType;
    }

    @InputImport(name="severity")
      private final @Nullable Input<List<FilterStringFilterArgs>> severity;

    public Input<List<FilterStringFilterArgs>> getSeverity() {
        return this.severity == null ? Input.empty() : this.severity;
    }

    @InputImport(name="title")
      private final @Nullable Input<List<FilterStringFilterArgs>> title;

    public Input<List<FilterStringFilterArgs>> getTitle() {
        return this.title == null ? Input.empty() : this.title;
    }

    @InputImport(name="updatedAt")
      private final @Nullable Input<List<FilterDateFilterArgs>> updatedAt;

    public Input<List<FilterDateFilterArgs>> getUpdatedAt() {
        return this.updatedAt == null ? Input.empty() : this.updatedAt;
    }

    @InputImport(name="vendorSeverity")
      private final @Nullable Input<List<FilterStringFilterArgs>> vendorSeverity;

    public Input<List<FilterStringFilterArgs>> getVendorSeverity() {
        return this.vendorSeverity == null ? Input.empty() : this.vendorSeverity;
    }

    @InputImport(name="vulnerabilityId")
      private final @Nullable Input<List<FilterStringFilterArgs>> vulnerabilityId;

    public Input<List<FilterStringFilterArgs>> getVulnerabilityId() {
        return this.vulnerabilityId == null ? Input.empty() : this.vulnerabilityId;
    }

    @InputImport(name="vulnerabilitySource")
      private final @Nullable Input<List<FilterStringFilterArgs>> vulnerabilitySource;

    public Input<List<FilterStringFilterArgs>> getVulnerabilitySource() {
        return this.vulnerabilitySource == null ? Input.empty() : this.vulnerabilitySource;
    }

    @InputImport(name="vulnerablePackages")
      private final @Nullable Input<List<FilterPackageFilterArgs>> vulnerablePackages;

    public Input<List<FilterPackageFilterArgs>> getVulnerablePackages() {
        return this.vulnerablePackages == null ? Input.empty() : this.vulnerablePackages;
    }

    public FilterCriteriaArgs(
        @Nullable Input<List<FilterStringFilterArgs>> awsAccountId,
        @Nullable Input<List<FilterStringFilterArgs>> componentId,
        @Nullable Input<List<FilterStringFilterArgs>> componentType,
        @Nullable Input<List<FilterStringFilterArgs>> ec2InstanceImageId,
        @Nullable Input<List<FilterStringFilterArgs>> ec2InstanceSubnetId,
        @Nullable Input<List<FilterStringFilterArgs>> ec2InstanceVpcId,
        @Nullable Input<List<FilterStringFilterArgs>> ecrImageArchitecture,
        @Nullable Input<List<FilterStringFilterArgs>> ecrImageHash,
        @Nullable Input<List<FilterDateFilterArgs>> ecrImagePushedAt,
        @Nullable Input<List<FilterStringFilterArgs>> ecrImageRegistry,
        @Nullable Input<List<FilterStringFilterArgs>> ecrImageRepositoryName,
        @Nullable Input<List<FilterStringFilterArgs>> ecrImageTags,
        @Nullable Input<List<FilterStringFilterArgs>> findingArn,
        @Nullable Input<List<FilterStringFilterArgs>> findingStatus,
        @Nullable Input<List<FilterStringFilterArgs>> findingType,
        @Nullable Input<List<FilterDateFilterArgs>> firstObservedAt,
        @Nullable Input<List<FilterNumberFilterArgs>> inspectorScore,
        @Nullable Input<List<FilterDateFilterArgs>> lastObservedAt,
        @Nullable Input<List<FilterStringFilterArgs>> networkProtocol,
        @Nullable Input<List<FilterPortRangeFilterArgs>> portRange,
        @Nullable Input<List<FilterStringFilterArgs>> relatedVulnerabilities,
        @Nullable Input<List<FilterStringFilterArgs>> resourceId,
        @Nullable Input<List<FilterMapFilterArgs>> resourceTags,
        @Nullable Input<List<FilterStringFilterArgs>> resourceType,
        @Nullable Input<List<FilterStringFilterArgs>> severity,
        @Nullable Input<List<FilterStringFilterArgs>> title,
        @Nullable Input<List<FilterDateFilterArgs>> updatedAt,
        @Nullable Input<List<FilterStringFilterArgs>> vendorSeverity,
        @Nullable Input<List<FilterStringFilterArgs>> vulnerabilityId,
        @Nullable Input<List<FilterStringFilterArgs>> vulnerabilitySource,
        @Nullable Input<List<FilterPackageFilterArgs>> vulnerablePackages) {
        this.awsAccountId = awsAccountId;
        this.componentId = componentId;
        this.componentType = componentType;
        this.ec2InstanceImageId = ec2InstanceImageId;
        this.ec2InstanceSubnetId = ec2InstanceSubnetId;
        this.ec2InstanceVpcId = ec2InstanceVpcId;
        this.ecrImageArchitecture = ecrImageArchitecture;
        this.ecrImageHash = ecrImageHash;
        this.ecrImagePushedAt = ecrImagePushedAt;
        this.ecrImageRegistry = ecrImageRegistry;
        this.ecrImageRepositoryName = ecrImageRepositoryName;
        this.ecrImageTags = ecrImageTags;
        this.findingArn = findingArn;
        this.findingStatus = findingStatus;
        this.findingType = findingType;
        this.firstObservedAt = firstObservedAt;
        this.inspectorScore = inspectorScore;
        this.lastObservedAt = lastObservedAt;
        this.networkProtocol = networkProtocol;
        this.portRange = portRange;
        this.relatedVulnerabilities = relatedVulnerabilities;
        this.resourceId = resourceId;
        this.resourceTags = resourceTags;
        this.resourceType = resourceType;
        this.severity = severity;
        this.title = title;
        this.updatedAt = updatedAt;
        this.vendorSeverity = vendorSeverity;
        this.vulnerabilityId = vulnerabilityId;
        this.vulnerabilitySource = vulnerabilitySource;
        this.vulnerablePackages = vulnerablePackages;
    }

    private FilterCriteriaArgs() {
        this.awsAccountId = Input.empty();
        this.componentId = Input.empty();
        this.componentType = Input.empty();
        this.ec2InstanceImageId = Input.empty();
        this.ec2InstanceSubnetId = Input.empty();
        this.ec2InstanceVpcId = Input.empty();
        this.ecrImageArchitecture = Input.empty();
        this.ecrImageHash = Input.empty();
        this.ecrImagePushedAt = Input.empty();
        this.ecrImageRegistry = Input.empty();
        this.ecrImageRepositoryName = Input.empty();
        this.ecrImageTags = Input.empty();
        this.findingArn = Input.empty();
        this.findingStatus = Input.empty();
        this.findingType = Input.empty();
        this.firstObservedAt = Input.empty();
        this.inspectorScore = Input.empty();
        this.lastObservedAt = Input.empty();
        this.networkProtocol = Input.empty();
        this.portRange = Input.empty();
        this.relatedVulnerabilities = Input.empty();
        this.resourceId = Input.empty();
        this.resourceTags = Input.empty();
        this.resourceType = Input.empty();
        this.severity = Input.empty();
        this.title = Input.empty();
        this.updatedAt = Input.empty();
        this.vendorSeverity = Input.empty();
        this.vulnerabilityId = Input.empty();
        this.vulnerabilitySource = Input.empty();
        this.vulnerablePackages = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<FilterStringFilterArgs>> awsAccountId;
        private @Nullable Input<List<FilterStringFilterArgs>> componentId;
        private @Nullable Input<List<FilterStringFilterArgs>> componentType;
        private @Nullable Input<List<FilterStringFilterArgs>> ec2InstanceImageId;
        private @Nullable Input<List<FilterStringFilterArgs>> ec2InstanceSubnetId;
        private @Nullable Input<List<FilterStringFilterArgs>> ec2InstanceVpcId;
        private @Nullable Input<List<FilterStringFilterArgs>> ecrImageArchitecture;
        private @Nullable Input<List<FilterStringFilterArgs>> ecrImageHash;
        private @Nullable Input<List<FilterDateFilterArgs>> ecrImagePushedAt;
        private @Nullable Input<List<FilterStringFilterArgs>> ecrImageRegistry;
        private @Nullable Input<List<FilterStringFilterArgs>> ecrImageRepositoryName;
        private @Nullable Input<List<FilterStringFilterArgs>> ecrImageTags;
        private @Nullable Input<List<FilterStringFilterArgs>> findingArn;
        private @Nullable Input<List<FilterStringFilterArgs>> findingStatus;
        private @Nullable Input<List<FilterStringFilterArgs>> findingType;
        private @Nullable Input<List<FilterDateFilterArgs>> firstObservedAt;
        private @Nullable Input<List<FilterNumberFilterArgs>> inspectorScore;
        private @Nullable Input<List<FilterDateFilterArgs>> lastObservedAt;
        private @Nullable Input<List<FilterStringFilterArgs>> networkProtocol;
        private @Nullable Input<List<FilterPortRangeFilterArgs>> portRange;
        private @Nullable Input<List<FilterStringFilterArgs>> relatedVulnerabilities;
        private @Nullable Input<List<FilterStringFilterArgs>> resourceId;
        private @Nullable Input<List<FilterMapFilterArgs>> resourceTags;
        private @Nullable Input<List<FilterStringFilterArgs>> resourceType;
        private @Nullable Input<List<FilterStringFilterArgs>> severity;
        private @Nullable Input<List<FilterStringFilterArgs>> title;
        private @Nullable Input<List<FilterDateFilterArgs>> updatedAt;
        private @Nullable Input<List<FilterStringFilterArgs>> vendorSeverity;
        private @Nullable Input<List<FilterStringFilterArgs>> vulnerabilityId;
        private @Nullable Input<List<FilterStringFilterArgs>> vulnerabilitySource;
        private @Nullable Input<List<FilterPackageFilterArgs>> vulnerablePackages;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterCriteriaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsAccountId = defaults.awsAccountId;
    	      this.componentId = defaults.componentId;
    	      this.componentType = defaults.componentType;
    	      this.ec2InstanceImageId = defaults.ec2InstanceImageId;
    	      this.ec2InstanceSubnetId = defaults.ec2InstanceSubnetId;
    	      this.ec2InstanceVpcId = defaults.ec2InstanceVpcId;
    	      this.ecrImageArchitecture = defaults.ecrImageArchitecture;
    	      this.ecrImageHash = defaults.ecrImageHash;
    	      this.ecrImagePushedAt = defaults.ecrImagePushedAt;
    	      this.ecrImageRegistry = defaults.ecrImageRegistry;
    	      this.ecrImageRepositoryName = defaults.ecrImageRepositoryName;
    	      this.ecrImageTags = defaults.ecrImageTags;
    	      this.findingArn = defaults.findingArn;
    	      this.findingStatus = defaults.findingStatus;
    	      this.findingType = defaults.findingType;
    	      this.firstObservedAt = defaults.firstObservedAt;
    	      this.inspectorScore = defaults.inspectorScore;
    	      this.lastObservedAt = defaults.lastObservedAt;
    	      this.networkProtocol = defaults.networkProtocol;
    	      this.portRange = defaults.portRange;
    	      this.relatedVulnerabilities = defaults.relatedVulnerabilities;
    	      this.resourceId = defaults.resourceId;
    	      this.resourceTags = defaults.resourceTags;
    	      this.resourceType = defaults.resourceType;
    	      this.severity = defaults.severity;
    	      this.title = defaults.title;
    	      this.updatedAt = defaults.updatedAt;
    	      this.vendorSeverity = defaults.vendorSeverity;
    	      this.vulnerabilityId = defaults.vulnerabilityId;
    	      this.vulnerabilitySource = defaults.vulnerabilitySource;
    	      this.vulnerablePackages = defaults.vulnerablePackages;
        }

        public Builder setAwsAccountId(@Nullable Input<List<FilterStringFilterArgs>> awsAccountId) {
            this.awsAccountId = awsAccountId;
            return this;
        }

        public Builder setAwsAccountId(@Nullable List<FilterStringFilterArgs> awsAccountId) {
            this.awsAccountId = Input.ofNullable(awsAccountId);
            return this;
        }

        public Builder setComponentId(@Nullable Input<List<FilterStringFilterArgs>> componentId) {
            this.componentId = componentId;
            return this;
        }

        public Builder setComponentId(@Nullable List<FilterStringFilterArgs> componentId) {
            this.componentId = Input.ofNullable(componentId);
            return this;
        }

        public Builder setComponentType(@Nullable Input<List<FilterStringFilterArgs>> componentType) {
            this.componentType = componentType;
            return this;
        }

        public Builder setComponentType(@Nullable List<FilterStringFilterArgs> componentType) {
            this.componentType = Input.ofNullable(componentType);
            return this;
        }

        public Builder setEc2InstanceImageId(@Nullable Input<List<FilterStringFilterArgs>> ec2InstanceImageId) {
            this.ec2InstanceImageId = ec2InstanceImageId;
            return this;
        }

        public Builder setEc2InstanceImageId(@Nullable List<FilterStringFilterArgs> ec2InstanceImageId) {
            this.ec2InstanceImageId = Input.ofNullable(ec2InstanceImageId);
            return this;
        }

        public Builder setEc2InstanceSubnetId(@Nullable Input<List<FilterStringFilterArgs>> ec2InstanceSubnetId) {
            this.ec2InstanceSubnetId = ec2InstanceSubnetId;
            return this;
        }

        public Builder setEc2InstanceSubnetId(@Nullable List<FilterStringFilterArgs> ec2InstanceSubnetId) {
            this.ec2InstanceSubnetId = Input.ofNullable(ec2InstanceSubnetId);
            return this;
        }

        public Builder setEc2InstanceVpcId(@Nullable Input<List<FilterStringFilterArgs>> ec2InstanceVpcId) {
            this.ec2InstanceVpcId = ec2InstanceVpcId;
            return this;
        }

        public Builder setEc2InstanceVpcId(@Nullable List<FilterStringFilterArgs> ec2InstanceVpcId) {
            this.ec2InstanceVpcId = Input.ofNullable(ec2InstanceVpcId);
            return this;
        }

        public Builder setEcrImageArchitecture(@Nullable Input<List<FilterStringFilterArgs>> ecrImageArchitecture) {
            this.ecrImageArchitecture = ecrImageArchitecture;
            return this;
        }

        public Builder setEcrImageArchitecture(@Nullable List<FilterStringFilterArgs> ecrImageArchitecture) {
            this.ecrImageArchitecture = Input.ofNullable(ecrImageArchitecture);
            return this;
        }

        public Builder setEcrImageHash(@Nullable Input<List<FilterStringFilterArgs>> ecrImageHash) {
            this.ecrImageHash = ecrImageHash;
            return this;
        }

        public Builder setEcrImageHash(@Nullable List<FilterStringFilterArgs> ecrImageHash) {
            this.ecrImageHash = Input.ofNullable(ecrImageHash);
            return this;
        }

        public Builder setEcrImagePushedAt(@Nullable Input<List<FilterDateFilterArgs>> ecrImagePushedAt) {
            this.ecrImagePushedAt = ecrImagePushedAt;
            return this;
        }

        public Builder setEcrImagePushedAt(@Nullable List<FilterDateFilterArgs> ecrImagePushedAt) {
            this.ecrImagePushedAt = Input.ofNullable(ecrImagePushedAt);
            return this;
        }

        public Builder setEcrImageRegistry(@Nullable Input<List<FilterStringFilterArgs>> ecrImageRegistry) {
            this.ecrImageRegistry = ecrImageRegistry;
            return this;
        }

        public Builder setEcrImageRegistry(@Nullable List<FilterStringFilterArgs> ecrImageRegistry) {
            this.ecrImageRegistry = Input.ofNullable(ecrImageRegistry);
            return this;
        }

        public Builder setEcrImageRepositoryName(@Nullable Input<List<FilterStringFilterArgs>> ecrImageRepositoryName) {
            this.ecrImageRepositoryName = ecrImageRepositoryName;
            return this;
        }

        public Builder setEcrImageRepositoryName(@Nullable List<FilterStringFilterArgs> ecrImageRepositoryName) {
            this.ecrImageRepositoryName = Input.ofNullable(ecrImageRepositoryName);
            return this;
        }

        public Builder setEcrImageTags(@Nullable Input<List<FilterStringFilterArgs>> ecrImageTags) {
            this.ecrImageTags = ecrImageTags;
            return this;
        }

        public Builder setEcrImageTags(@Nullable List<FilterStringFilterArgs> ecrImageTags) {
            this.ecrImageTags = Input.ofNullable(ecrImageTags);
            return this;
        }

        public Builder setFindingArn(@Nullable Input<List<FilterStringFilterArgs>> findingArn) {
            this.findingArn = findingArn;
            return this;
        }

        public Builder setFindingArn(@Nullable List<FilterStringFilterArgs> findingArn) {
            this.findingArn = Input.ofNullable(findingArn);
            return this;
        }

        public Builder setFindingStatus(@Nullable Input<List<FilterStringFilterArgs>> findingStatus) {
            this.findingStatus = findingStatus;
            return this;
        }

        public Builder setFindingStatus(@Nullable List<FilterStringFilterArgs> findingStatus) {
            this.findingStatus = Input.ofNullable(findingStatus);
            return this;
        }

        public Builder setFindingType(@Nullable Input<List<FilterStringFilterArgs>> findingType) {
            this.findingType = findingType;
            return this;
        }

        public Builder setFindingType(@Nullable List<FilterStringFilterArgs> findingType) {
            this.findingType = Input.ofNullable(findingType);
            return this;
        }

        public Builder setFirstObservedAt(@Nullable Input<List<FilterDateFilterArgs>> firstObservedAt) {
            this.firstObservedAt = firstObservedAt;
            return this;
        }

        public Builder setFirstObservedAt(@Nullable List<FilterDateFilterArgs> firstObservedAt) {
            this.firstObservedAt = Input.ofNullable(firstObservedAt);
            return this;
        }

        public Builder setInspectorScore(@Nullable Input<List<FilterNumberFilterArgs>> inspectorScore) {
            this.inspectorScore = inspectorScore;
            return this;
        }

        public Builder setInspectorScore(@Nullable List<FilterNumberFilterArgs> inspectorScore) {
            this.inspectorScore = Input.ofNullable(inspectorScore);
            return this;
        }

        public Builder setLastObservedAt(@Nullable Input<List<FilterDateFilterArgs>> lastObservedAt) {
            this.lastObservedAt = lastObservedAt;
            return this;
        }

        public Builder setLastObservedAt(@Nullable List<FilterDateFilterArgs> lastObservedAt) {
            this.lastObservedAt = Input.ofNullable(lastObservedAt);
            return this;
        }

        public Builder setNetworkProtocol(@Nullable Input<List<FilterStringFilterArgs>> networkProtocol) {
            this.networkProtocol = networkProtocol;
            return this;
        }

        public Builder setNetworkProtocol(@Nullable List<FilterStringFilterArgs> networkProtocol) {
            this.networkProtocol = Input.ofNullable(networkProtocol);
            return this;
        }

        public Builder setPortRange(@Nullable Input<List<FilterPortRangeFilterArgs>> portRange) {
            this.portRange = portRange;
            return this;
        }

        public Builder setPortRange(@Nullable List<FilterPortRangeFilterArgs> portRange) {
            this.portRange = Input.ofNullable(portRange);
            return this;
        }

        public Builder setRelatedVulnerabilities(@Nullable Input<List<FilterStringFilterArgs>> relatedVulnerabilities) {
            this.relatedVulnerabilities = relatedVulnerabilities;
            return this;
        }

        public Builder setRelatedVulnerabilities(@Nullable List<FilterStringFilterArgs> relatedVulnerabilities) {
            this.relatedVulnerabilities = Input.ofNullable(relatedVulnerabilities);
            return this;
        }

        public Builder setResourceId(@Nullable Input<List<FilterStringFilterArgs>> resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setResourceId(@Nullable List<FilterStringFilterArgs> resourceId) {
            this.resourceId = Input.ofNullable(resourceId);
            return this;
        }

        public Builder setResourceTags(@Nullable Input<List<FilterMapFilterArgs>> resourceTags) {
            this.resourceTags = resourceTags;
            return this;
        }

        public Builder setResourceTags(@Nullable List<FilterMapFilterArgs> resourceTags) {
            this.resourceTags = Input.ofNullable(resourceTags);
            return this;
        }

        public Builder setResourceType(@Nullable Input<List<FilterStringFilterArgs>> resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public Builder setResourceType(@Nullable List<FilterStringFilterArgs> resourceType) {
            this.resourceType = Input.ofNullable(resourceType);
            return this;
        }

        public Builder setSeverity(@Nullable Input<List<FilterStringFilterArgs>> severity) {
            this.severity = severity;
            return this;
        }

        public Builder setSeverity(@Nullable List<FilterStringFilterArgs> severity) {
            this.severity = Input.ofNullable(severity);
            return this;
        }

        public Builder setTitle(@Nullable Input<List<FilterStringFilterArgs>> title) {
            this.title = title;
            return this;
        }

        public Builder setTitle(@Nullable List<FilterStringFilterArgs> title) {
            this.title = Input.ofNullable(title);
            return this;
        }

        public Builder setUpdatedAt(@Nullable Input<List<FilterDateFilterArgs>> updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder setUpdatedAt(@Nullable List<FilterDateFilterArgs> updatedAt) {
            this.updatedAt = Input.ofNullable(updatedAt);
            return this;
        }

        public Builder setVendorSeverity(@Nullable Input<List<FilterStringFilterArgs>> vendorSeverity) {
            this.vendorSeverity = vendorSeverity;
            return this;
        }

        public Builder setVendorSeverity(@Nullable List<FilterStringFilterArgs> vendorSeverity) {
            this.vendorSeverity = Input.ofNullable(vendorSeverity);
            return this;
        }

        public Builder setVulnerabilityId(@Nullable Input<List<FilterStringFilterArgs>> vulnerabilityId) {
            this.vulnerabilityId = vulnerabilityId;
            return this;
        }

        public Builder setVulnerabilityId(@Nullable List<FilterStringFilterArgs> vulnerabilityId) {
            this.vulnerabilityId = Input.ofNullable(vulnerabilityId);
            return this;
        }

        public Builder setVulnerabilitySource(@Nullable Input<List<FilterStringFilterArgs>> vulnerabilitySource) {
            this.vulnerabilitySource = vulnerabilitySource;
            return this;
        }

        public Builder setVulnerabilitySource(@Nullable List<FilterStringFilterArgs> vulnerabilitySource) {
            this.vulnerabilitySource = Input.ofNullable(vulnerabilitySource);
            return this;
        }

        public Builder setVulnerablePackages(@Nullable Input<List<FilterPackageFilterArgs>> vulnerablePackages) {
            this.vulnerablePackages = vulnerablePackages;
            return this;
        }

        public Builder setVulnerablePackages(@Nullable List<FilterPackageFilterArgs> vulnerablePackages) {
            this.vulnerablePackages = Input.ofNullable(vulnerablePackages);
            return this;
        }
        public FilterCriteriaArgs build() {
            return new FilterCriteriaArgs(awsAccountId, componentId, componentType, ec2InstanceImageId, ec2InstanceSubnetId, ec2InstanceVpcId, ecrImageArchitecture, ecrImageHash, ecrImagePushedAt, ecrImageRegistry, ecrImageRepositoryName, ecrImageTags, findingArn, findingStatus, findingType, firstObservedAt, inspectorScore, lastObservedAt, networkProtocol, portRange, relatedVulnerabilities, resourceId, resourceTags, resourceType, severity, title, updatedAt, vendorSeverity, vulnerabilityId, vulnerabilitySource, vulnerablePackages);
        }
    }
}
