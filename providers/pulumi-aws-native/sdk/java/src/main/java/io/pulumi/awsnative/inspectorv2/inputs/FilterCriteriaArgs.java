// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.inspectorv2.inputs;

import io.pulumi.awsnative.inspectorv2.inputs.FilterDateFilterArgs;
import io.pulumi.awsnative.inspectorv2.inputs.FilterMapFilterArgs;
import io.pulumi.awsnative.inspectorv2.inputs.FilterNumberFilterArgs;
import io.pulumi.awsnative.inspectorv2.inputs.FilterPackageFilterArgs;
import io.pulumi.awsnative.inspectorv2.inputs.FilterPortRangeFilterArgs;
import io.pulumi.awsnative.inspectorv2.inputs.FilterStringFilterArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FilterCriteriaArgs extends io.pulumi.resources.ResourceArgs {

    public static final FilterCriteriaArgs Empty = new FilterCriteriaArgs();

    @InputImport(name="awsAccountId")
      private final @Nullable Output<List<FilterStringFilterArgs>> awsAccountId;

    public Output<List<FilterStringFilterArgs>> getAwsAccountId() {
        return this.awsAccountId == null ? Output.empty() : this.awsAccountId;
    }

    @InputImport(name="componentId")
      private final @Nullable Output<List<FilterStringFilterArgs>> componentId;

    public Output<List<FilterStringFilterArgs>> getComponentId() {
        return this.componentId == null ? Output.empty() : this.componentId;
    }

    @InputImport(name="componentType")
      private final @Nullable Output<List<FilterStringFilterArgs>> componentType;

    public Output<List<FilterStringFilterArgs>> getComponentType() {
        return this.componentType == null ? Output.empty() : this.componentType;
    }

    @InputImport(name="ec2InstanceImageId")
      private final @Nullable Output<List<FilterStringFilterArgs>> ec2InstanceImageId;

    public Output<List<FilterStringFilterArgs>> getEc2InstanceImageId() {
        return this.ec2InstanceImageId == null ? Output.empty() : this.ec2InstanceImageId;
    }

    @InputImport(name="ec2InstanceSubnetId")
      private final @Nullable Output<List<FilterStringFilterArgs>> ec2InstanceSubnetId;

    public Output<List<FilterStringFilterArgs>> getEc2InstanceSubnetId() {
        return this.ec2InstanceSubnetId == null ? Output.empty() : this.ec2InstanceSubnetId;
    }

    @InputImport(name="ec2InstanceVpcId")
      private final @Nullable Output<List<FilterStringFilterArgs>> ec2InstanceVpcId;

    public Output<List<FilterStringFilterArgs>> getEc2InstanceVpcId() {
        return this.ec2InstanceVpcId == null ? Output.empty() : this.ec2InstanceVpcId;
    }

    @InputImport(name="ecrImageArchitecture")
      private final @Nullable Output<List<FilterStringFilterArgs>> ecrImageArchitecture;

    public Output<List<FilterStringFilterArgs>> getEcrImageArchitecture() {
        return this.ecrImageArchitecture == null ? Output.empty() : this.ecrImageArchitecture;
    }

    @InputImport(name="ecrImageHash")
      private final @Nullable Output<List<FilterStringFilterArgs>> ecrImageHash;

    public Output<List<FilterStringFilterArgs>> getEcrImageHash() {
        return this.ecrImageHash == null ? Output.empty() : this.ecrImageHash;
    }

    @InputImport(name="ecrImagePushedAt")
      private final @Nullable Output<List<FilterDateFilterArgs>> ecrImagePushedAt;

    public Output<List<FilterDateFilterArgs>> getEcrImagePushedAt() {
        return this.ecrImagePushedAt == null ? Output.empty() : this.ecrImagePushedAt;
    }

    @InputImport(name="ecrImageRegistry")
      private final @Nullable Output<List<FilterStringFilterArgs>> ecrImageRegistry;

    public Output<List<FilterStringFilterArgs>> getEcrImageRegistry() {
        return this.ecrImageRegistry == null ? Output.empty() : this.ecrImageRegistry;
    }

    @InputImport(name="ecrImageRepositoryName")
      private final @Nullable Output<List<FilterStringFilterArgs>> ecrImageRepositoryName;

    public Output<List<FilterStringFilterArgs>> getEcrImageRepositoryName() {
        return this.ecrImageRepositoryName == null ? Output.empty() : this.ecrImageRepositoryName;
    }

    @InputImport(name="ecrImageTags")
      private final @Nullable Output<List<FilterStringFilterArgs>> ecrImageTags;

    public Output<List<FilterStringFilterArgs>> getEcrImageTags() {
        return this.ecrImageTags == null ? Output.empty() : this.ecrImageTags;
    }

    @InputImport(name="findingArn")
      private final @Nullable Output<List<FilterStringFilterArgs>> findingArn;

    public Output<List<FilterStringFilterArgs>> getFindingArn() {
        return this.findingArn == null ? Output.empty() : this.findingArn;
    }

    @InputImport(name="findingStatus")
      private final @Nullable Output<List<FilterStringFilterArgs>> findingStatus;

    public Output<List<FilterStringFilterArgs>> getFindingStatus() {
        return this.findingStatus == null ? Output.empty() : this.findingStatus;
    }

    @InputImport(name="findingType")
      private final @Nullable Output<List<FilterStringFilterArgs>> findingType;

    public Output<List<FilterStringFilterArgs>> getFindingType() {
        return this.findingType == null ? Output.empty() : this.findingType;
    }

    @InputImport(name="firstObservedAt")
      private final @Nullable Output<List<FilterDateFilterArgs>> firstObservedAt;

    public Output<List<FilterDateFilterArgs>> getFirstObservedAt() {
        return this.firstObservedAt == null ? Output.empty() : this.firstObservedAt;
    }

    @InputImport(name="inspectorScore")
      private final @Nullable Output<List<FilterNumberFilterArgs>> inspectorScore;

    public Output<List<FilterNumberFilterArgs>> getInspectorScore() {
        return this.inspectorScore == null ? Output.empty() : this.inspectorScore;
    }

    @InputImport(name="lastObservedAt")
      private final @Nullable Output<List<FilterDateFilterArgs>> lastObservedAt;

    public Output<List<FilterDateFilterArgs>> getLastObservedAt() {
        return this.lastObservedAt == null ? Output.empty() : this.lastObservedAt;
    }

    @InputImport(name="networkProtocol")
      private final @Nullable Output<List<FilterStringFilterArgs>> networkProtocol;

    public Output<List<FilterStringFilterArgs>> getNetworkProtocol() {
        return this.networkProtocol == null ? Output.empty() : this.networkProtocol;
    }

    @InputImport(name="portRange")
      private final @Nullable Output<List<FilterPortRangeFilterArgs>> portRange;

    public Output<List<FilterPortRangeFilterArgs>> getPortRange() {
        return this.portRange == null ? Output.empty() : this.portRange;
    }

    @InputImport(name="relatedVulnerabilities")
      private final @Nullable Output<List<FilterStringFilterArgs>> relatedVulnerabilities;

    public Output<List<FilterStringFilterArgs>> getRelatedVulnerabilities() {
        return this.relatedVulnerabilities == null ? Output.empty() : this.relatedVulnerabilities;
    }

    @InputImport(name="resourceId")
      private final @Nullable Output<List<FilterStringFilterArgs>> resourceId;

    public Output<List<FilterStringFilterArgs>> getResourceId() {
        return this.resourceId == null ? Output.empty() : this.resourceId;
    }

    @InputImport(name="resourceTags")
      private final @Nullable Output<List<FilterMapFilterArgs>> resourceTags;

    public Output<List<FilterMapFilterArgs>> getResourceTags() {
        return this.resourceTags == null ? Output.empty() : this.resourceTags;
    }

    @InputImport(name="resourceType")
      private final @Nullable Output<List<FilterStringFilterArgs>> resourceType;

    public Output<List<FilterStringFilterArgs>> getPropResourceType() {
        return this.resourceType == null ? Output.empty() : this.resourceType;
    }

    @InputImport(name="severity")
      private final @Nullable Output<List<FilterStringFilterArgs>> severity;

    public Output<List<FilterStringFilterArgs>> getSeverity() {
        return this.severity == null ? Output.empty() : this.severity;
    }

    @InputImport(name="title")
      private final @Nullable Output<List<FilterStringFilterArgs>> title;

    public Output<List<FilterStringFilterArgs>> getTitle() {
        return this.title == null ? Output.empty() : this.title;
    }

    @InputImport(name="updatedAt")
      private final @Nullable Output<List<FilterDateFilterArgs>> updatedAt;

    public Output<List<FilterDateFilterArgs>> getUpdatedAt() {
        return this.updatedAt == null ? Output.empty() : this.updatedAt;
    }

    @InputImport(name="vendorSeverity")
      private final @Nullable Output<List<FilterStringFilterArgs>> vendorSeverity;

    public Output<List<FilterStringFilterArgs>> getVendorSeverity() {
        return this.vendorSeverity == null ? Output.empty() : this.vendorSeverity;
    }

    @InputImport(name="vulnerabilityId")
      private final @Nullable Output<List<FilterStringFilterArgs>> vulnerabilityId;

    public Output<List<FilterStringFilterArgs>> getVulnerabilityId() {
        return this.vulnerabilityId == null ? Output.empty() : this.vulnerabilityId;
    }

    @InputImport(name="vulnerabilitySource")
      private final @Nullable Output<List<FilterStringFilterArgs>> vulnerabilitySource;

    public Output<List<FilterStringFilterArgs>> getVulnerabilitySource() {
        return this.vulnerabilitySource == null ? Output.empty() : this.vulnerabilitySource;
    }

    @InputImport(name="vulnerablePackages")
      private final @Nullable Output<List<FilterPackageFilterArgs>> vulnerablePackages;

    public Output<List<FilterPackageFilterArgs>> getVulnerablePackages() {
        return this.vulnerablePackages == null ? Output.empty() : this.vulnerablePackages;
    }

    public FilterCriteriaArgs(
        @Nullable Output<List<FilterStringFilterArgs>> awsAccountId,
        @Nullable Output<List<FilterStringFilterArgs>> componentId,
        @Nullable Output<List<FilterStringFilterArgs>> componentType,
        @Nullable Output<List<FilterStringFilterArgs>> ec2InstanceImageId,
        @Nullable Output<List<FilterStringFilterArgs>> ec2InstanceSubnetId,
        @Nullable Output<List<FilterStringFilterArgs>> ec2InstanceVpcId,
        @Nullable Output<List<FilterStringFilterArgs>> ecrImageArchitecture,
        @Nullable Output<List<FilterStringFilterArgs>> ecrImageHash,
        @Nullable Output<List<FilterDateFilterArgs>> ecrImagePushedAt,
        @Nullable Output<List<FilterStringFilterArgs>> ecrImageRegistry,
        @Nullable Output<List<FilterStringFilterArgs>> ecrImageRepositoryName,
        @Nullable Output<List<FilterStringFilterArgs>> ecrImageTags,
        @Nullable Output<List<FilterStringFilterArgs>> findingArn,
        @Nullable Output<List<FilterStringFilterArgs>> findingStatus,
        @Nullable Output<List<FilterStringFilterArgs>> findingType,
        @Nullable Output<List<FilterDateFilterArgs>> firstObservedAt,
        @Nullable Output<List<FilterNumberFilterArgs>> inspectorScore,
        @Nullable Output<List<FilterDateFilterArgs>> lastObservedAt,
        @Nullable Output<List<FilterStringFilterArgs>> networkProtocol,
        @Nullable Output<List<FilterPortRangeFilterArgs>> portRange,
        @Nullable Output<List<FilterStringFilterArgs>> relatedVulnerabilities,
        @Nullable Output<List<FilterStringFilterArgs>> resourceId,
        @Nullable Output<List<FilterMapFilterArgs>> resourceTags,
        @Nullable Output<List<FilterStringFilterArgs>> resourceType,
        @Nullable Output<List<FilterStringFilterArgs>> severity,
        @Nullable Output<List<FilterStringFilterArgs>> title,
        @Nullable Output<List<FilterDateFilterArgs>> updatedAt,
        @Nullable Output<List<FilterStringFilterArgs>> vendorSeverity,
        @Nullable Output<List<FilterStringFilterArgs>> vulnerabilityId,
        @Nullable Output<List<FilterStringFilterArgs>> vulnerabilitySource,
        @Nullable Output<List<FilterPackageFilterArgs>> vulnerablePackages) {
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
        this.awsAccountId = Output.empty();
        this.componentId = Output.empty();
        this.componentType = Output.empty();
        this.ec2InstanceImageId = Output.empty();
        this.ec2InstanceSubnetId = Output.empty();
        this.ec2InstanceVpcId = Output.empty();
        this.ecrImageArchitecture = Output.empty();
        this.ecrImageHash = Output.empty();
        this.ecrImagePushedAt = Output.empty();
        this.ecrImageRegistry = Output.empty();
        this.ecrImageRepositoryName = Output.empty();
        this.ecrImageTags = Output.empty();
        this.findingArn = Output.empty();
        this.findingStatus = Output.empty();
        this.findingType = Output.empty();
        this.firstObservedAt = Output.empty();
        this.inspectorScore = Output.empty();
        this.lastObservedAt = Output.empty();
        this.networkProtocol = Output.empty();
        this.portRange = Output.empty();
        this.relatedVulnerabilities = Output.empty();
        this.resourceId = Output.empty();
        this.resourceTags = Output.empty();
        this.resourceType = Output.empty();
        this.severity = Output.empty();
        this.title = Output.empty();
        this.updatedAt = Output.empty();
        this.vendorSeverity = Output.empty();
        this.vulnerabilityId = Output.empty();
        this.vulnerabilitySource = Output.empty();
        this.vulnerablePackages = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<FilterStringFilterArgs>> awsAccountId;
        private @Nullable Output<List<FilterStringFilterArgs>> componentId;
        private @Nullable Output<List<FilterStringFilterArgs>> componentType;
        private @Nullable Output<List<FilterStringFilterArgs>> ec2InstanceImageId;
        private @Nullable Output<List<FilterStringFilterArgs>> ec2InstanceSubnetId;
        private @Nullable Output<List<FilterStringFilterArgs>> ec2InstanceVpcId;
        private @Nullable Output<List<FilterStringFilterArgs>> ecrImageArchitecture;
        private @Nullable Output<List<FilterStringFilterArgs>> ecrImageHash;
        private @Nullable Output<List<FilterDateFilterArgs>> ecrImagePushedAt;
        private @Nullable Output<List<FilterStringFilterArgs>> ecrImageRegistry;
        private @Nullable Output<List<FilterStringFilterArgs>> ecrImageRepositoryName;
        private @Nullable Output<List<FilterStringFilterArgs>> ecrImageTags;
        private @Nullable Output<List<FilterStringFilterArgs>> findingArn;
        private @Nullable Output<List<FilterStringFilterArgs>> findingStatus;
        private @Nullable Output<List<FilterStringFilterArgs>> findingType;
        private @Nullable Output<List<FilterDateFilterArgs>> firstObservedAt;
        private @Nullable Output<List<FilterNumberFilterArgs>> inspectorScore;
        private @Nullable Output<List<FilterDateFilterArgs>> lastObservedAt;
        private @Nullable Output<List<FilterStringFilterArgs>> networkProtocol;
        private @Nullable Output<List<FilterPortRangeFilterArgs>> portRange;
        private @Nullable Output<List<FilterStringFilterArgs>> relatedVulnerabilities;
        private @Nullable Output<List<FilterStringFilterArgs>> resourceId;
        private @Nullable Output<List<FilterMapFilterArgs>> resourceTags;
        private @Nullable Output<List<FilterStringFilterArgs>> resourceType;
        private @Nullable Output<List<FilterStringFilterArgs>> severity;
        private @Nullable Output<List<FilterStringFilterArgs>> title;
        private @Nullable Output<List<FilterDateFilterArgs>> updatedAt;
        private @Nullable Output<List<FilterStringFilterArgs>> vendorSeverity;
        private @Nullable Output<List<FilterStringFilterArgs>> vulnerabilityId;
        private @Nullable Output<List<FilterStringFilterArgs>> vulnerabilitySource;
        private @Nullable Output<List<FilterPackageFilterArgs>> vulnerablePackages;

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

        public Builder awsAccountId(@Nullable Output<List<FilterStringFilterArgs>> awsAccountId) {
            this.awsAccountId = awsAccountId;
            return this;
        }

        public Builder awsAccountId(@Nullable List<FilterStringFilterArgs> awsAccountId) {
            this.awsAccountId = Output.ofNullable(awsAccountId);
            return this;
        }

        public Builder componentId(@Nullable Output<List<FilterStringFilterArgs>> componentId) {
            this.componentId = componentId;
            return this;
        }

        public Builder componentId(@Nullable List<FilterStringFilterArgs> componentId) {
            this.componentId = Output.ofNullable(componentId);
            return this;
        }

        public Builder componentType(@Nullable Output<List<FilterStringFilterArgs>> componentType) {
            this.componentType = componentType;
            return this;
        }

        public Builder componentType(@Nullable List<FilterStringFilterArgs> componentType) {
            this.componentType = Output.ofNullable(componentType);
            return this;
        }

        public Builder ec2InstanceImageId(@Nullable Output<List<FilterStringFilterArgs>> ec2InstanceImageId) {
            this.ec2InstanceImageId = ec2InstanceImageId;
            return this;
        }

        public Builder ec2InstanceImageId(@Nullable List<FilterStringFilterArgs> ec2InstanceImageId) {
            this.ec2InstanceImageId = Output.ofNullable(ec2InstanceImageId);
            return this;
        }

        public Builder ec2InstanceSubnetId(@Nullable Output<List<FilterStringFilterArgs>> ec2InstanceSubnetId) {
            this.ec2InstanceSubnetId = ec2InstanceSubnetId;
            return this;
        }

        public Builder ec2InstanceSubnetId(@Nullable List<FilterStringFilterArgs> ec2InstanceSubnetId) {
            this.ec2InstanceSubnetId = Output.ofNullable(ec2InstanceSubnetId);
            return this;
        }

        public Builder ec2InstanceVpcId(@Nullable Output<List<FilterStringFilterArgs>> ec2InstanceVpcId) {
            this.ec2InstanceVpcId = ec2InstanceVpcId;
            return this;
        }

        public Builder ec2InstanceVpcId(@Nullable List<FilterStringFilterArgs> ec2InstanceVpcId) {
            this.ec2InstanceVpcId = Output.ofNullable(ec2InstanceVpcId);
            return this;
        }

        public Builder ecrImageArchitecture(@Nullable Output<List<FilterStringFilterArgs>> ecrImageArchitecture) {
            this.ecrImageArchitecture = ecrImageArchitecture;
            return this;
        }

        public Builder ecrImageArchitecture(@Nullable List<FilterStringFilterArgs> ecrImageArchitecture) {
            this.ecrImageArchitecture = Output.ofNullable(ecrImageArchitecture);
            return this;
        }

        public Builder ecrImageHash(@Nullable Output<List<FilterStringFilterArgs>> ecrImageHash) {
            this.ecrImageHash = ecrImageHash;
            return this;
        }

        public Builder ecrImageHash(@Nullable List<FilterStringFilterArgs> ecrImageHash) {
            this.ecrImageHash = Output.ofNullable(ecrImageHash);
            return this;
        }

        public Builder ecrImagePushedAt(@Nullable Output<List<FilterDateFilterArgs>> ecrImagePushedAt) {
            this.ecrImagePushedAt = ecrImagePushedAt;
            return this;
        }

        public Builder ecrImagePushedAt(@Nullable List<FilterDateFilterArgs> ecrImagePushedAt) {
            this.ecrImagePushedAt = Output.ofNullable(ecrImagePushedAt);
            return this;
        }

        public Builder ecrImageRegistry(@Nullable Output<List<FilterStringFilterArgs>> ecrImageRegistry) {
            this.ecrImageRegistry = ecrImageRegistry;
            return this;
        }

        public Builder ecrImageRegistry(@Nullable List<FilterStringFilterArgs> ecrImageRegistry) {
            this.ecrImageRegistry = Output.ofNullable(ecrImageRegistry);
            return this;
        }

        public Builder ecrImageRepositoryName(@Nullable Output<List<FilterStringFilterArgs>> ecrImageRepositoryName) {
            this.ecrImageRepositoryName = ecrImageRepositoryName;
            return this;
        }

        public Builder ecrImageRepositoryName(@Nullable List<FilterStringFilterArgs> ecrImageRepositoryName) {
            this.ecrImageRepositoryName = Output.ofNullable(ecrImageRepositoryName);
            return this;
        }

        public Builder ecrImageTags(@Nullable Output<List<FilterStringFilterArgs>> ecrImageTags) {
            this.ecrImageTags = ecrImageTags;
            return this;
        }

        public Builder ecrImageTags(@Nullable List<FilterStringFilterArgs> ecrImageTags) {
            this.ecrImageTags = Output.ofNullable(ecrImageTags);
            return this;
        }

        public Builder findingArn(@Nullable Output<List<FilterStringFilterArgs>> findingArn) {
            this.findingArn = findingArn;
            return this;
        }

        public Builder findingArn(@Nullable List<FilterStringFilterArgs> findingArn) {
            this.findingArn = Output.ofNullable(findingArn);
            return this;
        }

        public Builder findingStatus(@Nullable Output<List<FilterStringFilterArgs>> findingStatus) {
            this.findingStatus = findingStatus;
            return this;
        }

        public Builder findingStatus(@Nullable List<FilterStringFilterArgs> findingStatus) {
            this.findingStatus = Output.ofNullable(findingStatus);
            return this;
        }

        public Builder findingType(@Nullable Output<List<FilterStringFilterArgs>> findingType) {
            this.findingType = findingType;
            return this;
        }

        public Builder findingType(@Nullable List<FilterStringFilterArgs> findingType) {
            this.findingType = Output.ofNullable(findingType);
            return this;
        }

        public Builder firstObservedAt(@Nullable Output<List<FilterDateFilterArgs>> firstObservedAt) {
            this.firstObservedAt = firstObservedAt;
            return this;
        }

        public Builder firstObservedAt(@Nullable List<FilterDateFilterArgs> firstObservedAt) {
            this.firstObservedAt = Output.ofNullable(firstObservedAt);
            return this;
        }

        public Builder inspectorScore(@Nullable Output<List<FilterNumberFilterArgs>> inspectorScore) {
            this.inspectorScore = inspectorScore;
            return this;
        }

        public Builder inspectorScore(@Nullable List<FilterNumberFilterArgs> inspectorScore) {
            this.inspectorScore = Output.ofNullable(inspectorScore);
            return this;
        }

        public Builder lastObservedAt(@Nullable Output<List<FilterDateFilterArgs>> lastObservedAt) {
            this.lastObservedAt = lastObservedAt;
            return this;
        }

        public Builder lastObservedAt(@Nullable List<FilterDateFilterArgs> lastObservedAt) {
            this.lastObservedAt = Output.ofNullable(lastObservedAt);
            return this;
        }

        public Builder networkProtocol(@Nullable Output<List<FilterStringFilterArgs>> networkProtocol) {
            this.networkProtocol = networkProtocol;
            return this;
        }

        public Builder networkProtocol(@Nullable List<FilterStringFilterArgs> networkProtocol) {
            this.networkProtocol = Output.ofNullable(networkProtocol);
            return this;
        }

        public Builder portRange(@Nullable Output<List<FilterPortRangeFilterArgs>> portRange) {
            this.portRange = portRange;
            return this;
        }

        public Builder portRange(@Nullable List<FilterPortRangeFilterArgs> portRange) {
            this.portRange = Output.ofNullable(portRange);
            return this;
        }

        public Builder relatedVulnerabilities(@Nullable Output<List<FilterStringFilterArgs>> relatedVulnerabilities) {
            this.relatedVulnerabilities = relatedVulnerabilities;
            return this;
        }

        public Builder relatedVulnerabilities(@Nullable List<FilterStringFilterArgs> relatedVulnerabilities) {
            this.relatedVulnerabilities = Output.ofNullable(relatedVulnerabilities);
            return this;
        }

        public Builder resourceId(@Nullable Output<List<FilterStringFilterArgs>> resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder resourceId(@Nullable List<FilterStringFilterArgs> resourceId) {
            this.resourceId = Output.ofNullable(resourceId);
            return this;
        }

        public Builder resourceTags(@Nullable Output<List<FilterMapFilterArgs>> resourceTags) {
            this.resourceTags = resourceTags;
            return this;
        }

        public Builder resourceTags(@Nullable List<FilterMapFilterArgs> resourceTags) {
            this.resourceTags = Output.ofNullable(resourceTags);
            return this;
        }

        public Builder resourceType(@Nullable Output<List<FilterStringFilterArgs>> resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public Builder resourceType(@Nullable List<FilterStringFilterArgs> resourceType) {
            this.resourceType = Output.ofNullable(resourceType);
            return this;
        }

        public Builder severity(@Nullable Output<List<FilterStringFilterArgs>> severity) {
            this.severity = severity;
            return this;
        }

        public Builder severity(@Nullable List<FilterStringFilterArgs> severity) {
            this.severity = Output.ofNullable(severity);
            return this;
        }

        public Builder title(@Nullable Output<List<FilterStringFilterArgs>> title) {
            this.title = title;
            return this;
        }

        public Builder title(@Nullable List<FilterStringFilterArgs> title) {
            this.title = Output.ofNullable(title);
            return this;
        }

        public Builder updatedAt(@Nullable Output<List<FilterDateFilterArgs>> updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder updatedAt(@Nullable List<FilterDateFilterArgs> updatedAt) {
            this.updatedAt = Output.ofNullable(updatedAt);
            return this;
        }

        public Builder vendorSeverity(@Nullable Output<List<FilterStringFilterArgs>> vendorSeverity) {
            this.vendorSeverity = vendorSeverity;
            return this;
        }

        public Builder vendorSeverity(@Nullable List<FilterStringFilterArgs> vendorSeverity) {
            this.vendorSeverity = Output.ofNullable(vendorSeverity);
            return this;
        }

        public Builder vulnerabilityId(@Nullable Output<List<FilterStringFilterArgs>> vulnerabilityId) {
            this.vulnerabilityId = vulnerabilityId;
            return this;
        }

        public Builder vulnerabilityId(@Nullable List<FilterStringFilterArgs> vulnerabilityId) {
            this.vulnerabilityId = Output.ofNullable(vulnerabilityId);
            return this;
        }

        public Builder vulnerabilitySource(@Nullable Output<List<FilterStringFilterArgs>> vulnerabilitySource) {
            this.vulnerabilitySource = vulnerabilitySource;
            return this;
        }

        public Builder vulnerabilitySource(@Nullable List<FilterStringFilterArgs> vulnerabilitySource) {
            this.vulnerabilitySource = Output.ofNullable(vulnerabilitySource);
            return this;
        }

        public Builder vulnerablePackages(@Nullable Output<List<FilterPackageFilterArgs>> vulnerablePackages) {
            this.vulnerablePackages = vulnerablePackages;
            return this;
        }

        public Builder vulnerablePackages(@Nullable List<FilterPackageFilterArgs> vulnerablePackages) {
            this.vulnerablePackages = Output.ofNullable(vulnerablePackages);
            return this;
        }
        public FilterCriteriaArgs build() {
            return new FilterCriteriaArgs(awsAccountId, componentId, componentType, ec2InstanceImageId, ec2InstanceSubnetId, ec2InstanceVpcId, ecrImageArchitecture, ecrImageHash, ecrImagePushedAt, ecrImageRegistry, ecrImageRepositoryName, ecrImageTags, findingArn, findingStatus, findingType, firstObservedAt, inspectorScore, lastObservedAt, networkProtocol, portRange, relatedVulnerabilities, resourceId, resourceTags, resourceType, severity, title, updatedAt, vendorSeverity, vulnerabilityId, vulnerabilitySource, vulnerablePackages);
        }
    }
}
