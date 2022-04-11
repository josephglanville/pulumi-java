// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks;

import io.pulumi.aws.eks.inputs.NodeGroupLaunchTemplateArgs;
import io.pulumi.aws.eks.inputs.NodeGroupRemoteAccessArgs;
import io.pulumi.aws.eks.inputs.NodeGroupScalingConfigArgs;
import io.pulumi.aws.eks.inputs.NodeGroupTaintArgs;
import io.pulumi.aws.eks.inputs.NodeGroupUpdateConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NodeGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeGroupArgs Empty = new NodeGroupArgs();

    /**
     * Type of Amazon Machine Image (AMI) associated with the EKS Node Group. See the [AWS documentation](https://docs.aws.amazon.com/eks/latest/APIReference/API_Nodegroup.html#AmazonEKS-Type-Nodegroup-amiType) for valid values. This provider will only perform drift detection if a configuration value is provided.
     * 
     */
    @Import(name="amiType")
      private final @Nullable Output<String> amiType;

    public Output<String> getAmiType() {
        return this.amiType == null ? Codegen.empty() : this.amiType;
    }

    /**
     * Type of capacity associated with the EKS Node Group. Valid values: `ON_DEMAND`, `SPOT`. This provider will only perform drift detection if a configuration value is provided.
     * 
     */
    @Import(name="capacityType")
      private final @Nullable Output<String> capacityType;

    public Output<String> getCapacityType() {
        return this.capacityType == null ? Codegen.empty() : this.capacityType;
    }

    /**
     * Name of the EKS Cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]+$`).
     * 
     */
    @Import(name="clusterName", required=true)
      private final Output<String> clusterName;

    public Output<String> getClusterName() {
        return this.clusterName;
    }

    /**
     * Disk size in GiB for worker nodes. Defaults to `20`. This provider will only perform drift detection if a configuration value is provided.
     * 
     */
    @Import(name="diskSize")
      private final @Nullable Output<Integer> diskSize;

    public Output<Integer> getDiskSize() {
        return this.diskSize == null ? Codegen.empty() : this.diskSize;
    }

    /**
     * Force version update if existing pods are unable to be drained due to a pod disruption budget issue.
     * 
     */
    @Import(name="forceUpdateVersion")
      private final @Nullable Output<Boolean> forceUpdateVersion;

    public Output<Boolean> getForceUpdateVersion() {
        return this.forceUpdateVersion == null ? Codegen.empty() : this.forceUpdateVersion;
    }

    /**
     * List of instance types associated with the EKS Node Group. Defaults to `["t3.medium"]`. This provider will only perform drift detection if a configuration value is provided.
     * 
     */
    @Import(name="instanceTypes")
      private final @Nullable Output<List<String>> instanceTypes;

    public Output<List<String>> getInstanceTypes() {
        return this.instanceTypes == null ? Codegen.empty() : this.instanceTypes;
    }

    /**
     * Key-value map of Kubernetes labels. Only labels that are applied with the EKS API are managed by this argument. Other Kubernetes labels applied to the EKS Node Group will not be managed.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * Configuration block with Launch Template settings. Detailed below.
     * 
     */
    @Import(name="launchTemplate")
      private final @Nullable Output<NodeGroupLaunchTemplateArgs> launchTemplate;

    public Output<NodeGroupLaunchTemplateArgs> getLaunchTemplate() {
        return this.launchTemplate == null ? Codegen.empty() : this.launchTemplate;
    }

    /**
     * Name of the EKS Node Group. If omitted, this provider will assign a random, unique name. Conflicts with `node_group_name_prefix`.
     * 
     */
    @Import(name="nodeGroupName")
      private final @Nullable Output<String> nodeGroupName;

    public Output<String> getNodeGroupName() {
        return this.nodeGroupName == null ? Codegen.empty() : this.nodeGroupName;
    }

    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `node_group_name`.
     * 
     */
    @Import(name="nodeGroupNamePrefix")
      private final @Nullable Output<String> nodeGroupNamePrefix;

    public Output<String> getNodeGroupNamePrefix() {
        return this.nodeGroupNamePrefix == null ? Codegen.empty() : this.nodeGroupNamePrefix;
    }

    /**
     * Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Node Group.
     * 
     */
    @Import(name="nodeRoleArn", required=true)
      private final Output<String> nodeRoleArn;

    public Output<String> getNodeRoleArn() {
        return this.nodeRoleArn;
    }

    /**
     * AMI version of the EKS Node Group. Defaults to latest version for Kubernetes version.
     * 
     */
    @Import(name="releaseVersion")
      private final @Nullable Output<String> releaseVersion;

    public Output<String> getReleaseVersion() {
        return this.releaseVersion == null ? Codegen.empty() : this.releaseVersion;
    }

    /**
     * Configuration block with remote access settings. Detailed below.
     * 
     */
    @Import(name="remoteAccess")
      private final @Nullable Output<NodeGroupRemoteAccessArgs> remoteAccess;

    public Output<NodeGroupRemoteAccessArgs> getRemoteAccess() {
        return this.remoteAccess == null ? Codegen.empty() : this.remoteAccess;
    }

    /**
     * Configuration block with scaling settings. Detailed below.
     * 
     */
    @Import(name="scalingConfig", required=true)
      private final Output<NodeGroupScalingConfigArgs> scalingConfig;

    public Output<NodeGroupScalingConfigArgs> getScalingConfig() {
        return this.scalingConfig;
    }

    /**
     * Identifiers of EC2 Subnets to associate with the EKS Node Group. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
     * 
     */
    @Import(name="subnetIds", required=true)
      private final Output<List<String>> subnetIds;

    public Output<List<String>> getSubnetIds() {
        return this.subnetIds;
    }

    /**
     * Key-value map of resource tags. If configured with a provider defaultTags present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The Kubernetes taints to be applied to the nodes in the node group. Maximum of 50 taints per node group. Detailed below.
     * 
     */
    @Import(name="taints")
      private final @Nullable Output<List<NodeGroupTaintArgs>> taints;

    public Output<List<NodeGroupTaintArgs>> getTaints() {
        return this.taints == null ? Codegen.empty() : this.taints;
    }

    @Import(name="updateConfig")
      private final @Nullable Output<NodeGroupUpdateConfigArgs> updateConfig;

    public Output<NodeGroupUpdateConfigArgs> getUpdateConfig() {
        return this.updateConfig == null ? Codegen.empty() : this.updateConfig;
    }

    /**
     * EC2 Launch Template version number. While the API accepts values like `$Default` and `$Latest`, the API will convert the value to the associated version number (e.g. `1`) on read and This provider will show a difference on next plan. Using the `default_version` or `latest_version` attribute of the `aws.ec2.LaunchTemplate` resource or data source is recommended for this argument.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> getVersion() {
        return this.version == null ? Codegen.empty() : this.version;
    }

    public NodeGroupArgs(
        @Nullable Output<String> amiType,
        @Nullable Output<String> capacityType,
        Output<String> clusterName,
        @Nullable Output<Integer> diskSize,
        @Nullable Output<Boolean> forceUpdateVersion,
        @Nullable Output<List<String>> instanceTypes,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<NodeGroupLaunchTemplateArgs> launchTemplate,
        @Nullable Output<String> nodeGroupName,
        @Nullable Output<String> nodeGroupNamePrefix,
        Output<String> nodeRoleArn,
        @Nullable Output<String> releaseVersion,
        @Nullable Output<NodeGroupRemoteAccessArgs> remoteAccess,
        Output<NodeGroupScalingConfigArgs> scalingConfig,
        Output<List<String>> subnetIds,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<List<NodeGroupTaintArgs>> taints,
        @Nullable Output<NodeGroupUpdateConfigArgs> updateConfig,
        @Nullable Output<String> version) {
        this.amiType = amiType;
        this.capacityType = capacityType;
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.diskSize = diskSize;
        this.forceUpdateVersion = forceUpdateVersion;
        this.instanceTypes = instanceTypes;
        this.labels = labels;
        this.launchTemplate = launchTemplate;
        this.nodeGroupName = nodeGroupName;
        this.nodeGroupNamePrefix = nodeGroupNamePrefix;
        this.nodeRoleArn = Objects.requireNonNull(nodeRoleArn, "expected parameter 'nodeRoleArn' to be non-null");
        this.releaseVersion = releaseVersion;
        this.remoteAccess = remoteAccess;
        this.scalingConfig = Objects.requireNonNull(scalingConfig, "expected parameter 'scalingConfig' to be non-null");
        this.subnetIds = Objects.requireNonNull(subnetIds, "expected parameter 'subnetIds' to be non-null");
        this.tags = tags;
        this.taints = taints;
        this.updateConfig = updateConfig;
        this.version = version;
    }

    private NodeGroupArgs() {
        this.amiType = Codegen.empty();
        this.capacityType = Codegen.empty();
        this.clusterName = Codegen.empty();
        this.diskSize = Codegen.empty();
        this.forceUpdateVersion = Codegen.empty();
        this.instanceTypes = Codegen.empty();
        this.labels = Codegen.empty();
        this.launchTemplate = Codegen.empty();
        this.nodeGroupName = Codegen.empty();
        this.nodeGroupNamePrefix = Codegen.empty();
        this.nodeRoleArn = Codegen.empty();
        this.releaseVersion = Codegen.empty();
        this.remoteAccess = Codegen.empty();
        this.scalingConfig = Codegen.empty();
        this.subnetIds = Codegen.empty();
        this.tags = Codegen.empty();
        this.taints = Codegen.empty();
        this.updateConfig = Codegen.empty();
        this.version = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> amiType;
        private @Nullable Output<String> capacityType;
        private Output<String> clusterName;
        private @Nullable Output<Integer> diskSize;
        private @Nullable Output<Boolean> forceUpdateVersion;
        private @Nullable Output<List<String>> instanceTypes;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<NodeGroupLaunchTemplateArgs> launchTemplate;
        private @Nullable Output<String> nodeGroupName;
        private @Nullable Output<String> nodeGroupNamePrefix;
        private Output<String> nodeRoleArn;
        private @Nullable Output<String> releaseVersion;
        private @Nullable Output<NodeGroupRemoteAccessArgs> remoteAccess;
        private Output<NodeGroupScalingConfigArgs> scalingConfig;
        private Output<List<String>> subnetIds;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<List<NodeGroupTaintArgs>> taints;
        private @Nullable Output<NodeGroupUpdateConfigArgs> updateConfig;
        private @Nullable Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amiType = defaults.amiType;
    	      this.capacityType = defaults.capacityType;
    	      this.clusterName = defaults.clusterName;
    	      this.diskSize = defaults.diskSize;
    	      this.forceUpdateVersion = defaults.forceUpdateVersion;
    	      this.instanceTypes = defaults.instanceTypes;
    	      this.labels = defaults.labels;
    	      this.launchTemplate = defaults.launchTemplate;
    	      this.nodeGroupName = defaults.nodeGroupName;
    	      this.nodeGroupNamePrefix = defaults.nodeGroupNamePrefix;
    	      this.nodeRoleArn = defaults.nodeRoleArn;
    	      this.releaseVersion = defaults.releaseVersion;
    	      this.remoteAccess = defaults.remoteAccess;
    	      this.scalingConfig = defaults.scalingConfig;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
    	      this.taints = defaults.taints;
    	      this.updateConfig = defaults.updateConfig;
    	      this.version = defaults.version;
        }

        public Builder amiType(@Nullable Output<String> amiType) {
            this.amiType = amiType;
            return this;
        }
        public Builder amiType(@Nullable String amiType) {
            this.amiType = Codegen.ofNullable(amiType);
            return this;
        }
        public Builder capacityType(@Nullable Output<String> capacityType) {
            this.capacityType = capacityType;
            return this;
        }
        public Builder capacityType(@Nullable String capacityType) {
            this.capacityType = Codegen.ofNullable(capacityType);
            return this;
        }
        public Builder clusterName(Output<String> clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }
        public Builder clusterName(String clusterName) {
            this.clusterName = Output.of(Objects.requireNonNull(clusterName));
            return this;
        }
        public Builder diskSize(@Nullable Output<Integer> diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Builder diskSize(@Nullable Integer diskSize) {
            this.diskSize = Codegen.ofNullable(diskSize);
            return this;
        }
        public Builder forceUpdateVersion(@Nullable Output<Boolean> forceUpdateVersion) {
            this.forceUpdateVersion = forceUpdateVersion;
            return this;
        }
        public Builder forceUpdateVersion(@Nullable Boolean forceUpdateVersion) {
            this.forceUpdateVersion = Codegen.ofNullable(forceUpdateVersion);
            return this;
        }
        public Builder instanceTypes(@Nullable Output<List<String>> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public Builder instanceTypes(@Nullable List<String> instanceTypes) {
            this.instanceTypes = Codegen.ofNullable(instanceTypes);
            return this;
        }
        public Builder instanceTypes(String... instanceTypes) {
            return instanceTypes(List.of(instanceTypes));
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder launchTemplate(@Nullable Output<NodeGroupLaunchTemplateArgs> launchTemplate) {
            this.launchTemplate = launchTemplate;
            return this;
        }
        public Builder launchTemplate(@Nullable NodeGroupLaunchTemplateArgs launchTemplate) {
            this.launchTemplate = Codegen.ofNullable(launchTemplate);
            return this;
        }
        public Builder nodeGroupName(@Nullable Output<String> nodeGroupName) {
            this.nodeGroupName = nodeGroupName;
            return this;
        }
        public Builder nodeGroupName(@Nullable String nodeGroupName) {
            this.nodeGroupName = Codegen.ofNullable(nodeGroupName);
            return this;
        }
        public Builder nodeGroupNamePrefix(@Nullable Output<String> nodeGroupNamePrefix) {
            this.nodeGroupNamePrefix = nodeGroupNamePrefix;
            return this;
        }
        public Builder nodeGroupNamePrefix(@Nullable String nodeGroupNamePrefix) {
            this.nodeGroupNamePrefix = Codegen.ofNullable(nodeGroupNamePrefix);
            return this;
        }
        public Builder nodeRoleArn(Output<String> nodeRoleArn) {
            this.nodeRoleArn = Objects.requireNonNull(nodeRoleArn);
            return this;
        }
        public Builder nodeRoleArn(String nodeRoleArn) {
            this.nodeRoleArn = Output.of(Objects.requireNonNull(nodeRoleArn));
            return this;
        }
        public Builder releaseVersion(@Nullable Output<String> releaseVersion) {
            this.releaseVersion = releaseVersion;
            return this;
        }
        public Builder releaseVersion(@Nullable String releaseVersion) {
            this.releaseVersion = Codegen.ofNullable(releaseVersion);
            return this;
        }
        public Builder remoteAccess(@Nullable Output<NodeGroupRemoteAccessArgs> remoteAccess) {
            this.remoteAccess = remoteAccess;
            return this;
        }
        public Builder remoteAccess(@Nullable NodeGroupRemoteAccessArgs remoteAccess) {
            this.remoteAccess = Codegen.ofNullable(remoteAccess);
            return this;
        }
        public Builder scalingConfig(Output<NodeGroupScalingConfigArgs> scalingConfig) {
            this.scalingConfig = Objects.requireNonNull(scalingConfig);
            return this;
        }
        public Builder scalingConfig(NodeGroupScalingConfigArgs scalingConfig) {
            this.scalingConfig = Output.of(Objects.requireNonNull(scalingConfig));
            return this;
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
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder taints(@Nullable Output<List<NodeGroupTaintArgs>> taints) {
            this.taints = taints;
            return this;
        }
        public Builder taints(@Nullable List<NodeGroupTaintArgs> taints) {
            this.taints = Codegen.ofNullable(taints);
            return this;
        }
        public Builder taints(NodeGroupTaintArgs... taints) {
            return taints(List.of(taints));
        }
        public Builder updateConfig(@Nullable Output<NodeGroupUpdateConfigArgs> updateConfig) {
            this.updateConfig = updateConfig;
            return this;
        }
        public Builder updateConfig(@Nullable NodeGroupUpdateConfigArgs updateConfig) {
            this.updateConfig = Codegen.ofNullable(updateConfig);
            return this;
        }
        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = Codegen.ofNullable(version);
            return this;
        }        public NodeGroupArgs build() {
            return new NodeGroupArgs(amiType, capacityType, clusterName, diskSize, forceUpdateVersion, instanceTypes, labels, launchTemplate, nodeGroupName, nodeGroupNamePrefix, nodeRoleArn, releaseVersion, remoteAccess, scalingConfig, subnetIds, tags, taints, updateConfig, version);
        }
    }
}
