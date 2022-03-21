// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.outputs;

import io.pulumi.aws.eks.outputs.GetNodeGroupRemoteAccess;
import io.pulumi.aws.eks.outputs.GetNodeGroupResource;
import io.pulumi.aws.eks.outputs.GetNodeGroupScalingConfig;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetNodeGroupResult {
    /**
     * Type of Amazon Machine Image (AMI) associated with the EKS Node Group.
     * 
     */
    private final String amiType;
    /**
     * Amazon Resource Name (ARN) of the EKS Node Group.
     * 
     */
    private final String arn;
    private final String clusterName;
    /**
     * Disk size in GiB for worker nodes.
     * 
     */
    private final Integer diskSize;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * Set of instance types associated with the EKS Node Group.
     * 
     */
    private final List<String> instanceTypes;
    /**
     * Key-value map of Kubernetes labels. Only labels that are applied with the EKS API are managed by this argument. Other Kubernetes labels applied to the EKS Node Group will not be managed.
     * 
     */
    private final Map<String,String> labels;
    private final String nodeGroupName;
    /**
     * Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Node Group.
     * 
     */
    private final String nodeRoleArn;
    /**
     * AMI version of the EKS Node Group.
     * 
     */
    private final String releaseVersion;
    /**
     * Configuration block with remote access settings.
     * 
     */
    private final List<GetNodeGroupRemoteAccess> remoteAccesses;
    /**
     * List of objects containing information about underlying resources.
     * 
     */
    private final List<GetNodeGroupResource> resources;
    /**
     * Configuration block with scaling settings.
     * 
     */
    private final List<GetNodeGroupScalingConfig> scalingConfigs;
    /**
     * Status of the EKS Node Group.
     * 
     */
    private final String status;
    /**
     * Identifiers of EC2 Subnets to associate with the EKS Node Group.
     * 
     */
    private final List<String> subnetIds;
    /**
     * Key-value map of resource tags.
     * 
     */
    private final Map<String,String> tags;
    /**
     * Kubernetes version.
     * 
     */
    private final String version;

    @CustomType.Constructor
    private GetNodeGroupResult(
        @CustomType.Parameter("amiType") String amiType,
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("clusterName") String clusterName,
        @CustomType.Parameter("diskSize") Integer diskSize,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("instanceTypes") List<String> instanceTypes,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("nodeGroupName") String nodeGroupName,
        @CustomType.Parameter("nodeRoleArn") String nodeRoleArn,
        @CustomType.Parameter("releaseVersion") String releaseVersion,
        @CustomType.Parameter("remoteAccesses") List<GetNodeGroupRemoteAccess> remoteAccesses,
        @CustomType.Parameter("resources") List<GetNodeGroupResource> resources,
        @CustomType.Parameter("scalingConfigs") List<GetNodeGroupScalingConfig> scalingConfigs,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("subnetIds") List<String> subnetIds,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("version") String version) {
        this.amiType = amiType;
        this.arn = arn;
        this.clusterName = clusterName;
        this.diskSize = diskSize;
        this.id = id;
        this.instanceTypes = instanceTypes;
        this.labels = labels;
        this.nodeGroupName = nodeGroupName;
        this.nodeRoleArn = nodeRoleArn;
        this.releaseVersion = releaseVersion;
        this.remoteAccesses = remoteAccesses;
        this.resources = resources;
        this.scalingConfigs = scalingConfigs;
        this.status = status;
        this.subnetIds = subnetIds;
        this.tags = tags;
        this.version = version;
    }

    /**
     * Type of Amazon Machine Image (AMI) associated with the EKS Node Group.
     * 
    */
    public String getAmiType() {
        return this.amiType;
    }
    /**
     * Amazon Resource Name (ARN) of the EKS Node Group.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    public String getClusterName() {
        return this.clusterName;
    }
    /**
     * Disk size in GiB for worker nodes.
     * 
    */
    public Integer getDiskSize() {
        return this.diskSize;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Set of instance types associated with the EKS Node Group.
     * 
    */
    public List<String> getInstanceTypes() {
        return this.instanceTypes;
    }
    /**
     * Key-value map of Kubernetes labels. Only labels that are applied with the EKS API are managed by this argument. Other Kubernetes labels applied to the EKS Node Group will not be managed.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    public String getNodeGroupName() {
        return this.nodeGroupName;
    }
    /**
     * Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Node Group.
     * 
    */
    public String getNodeRoleArn() {
        return this.nodeRoleArn;
    }
    /**
     * AMI version of the EKS Node Group.
     * 
    */
    public String getReleaseVersion() {
        return this.releaseVersion;
    }
    /**
     * Configuration block with remote access settings.
     * 
    */
    public List<GetNodeGroupRemoteAccess> getRemoteAccesses() {
        return this.remoteAccesses;
    }
    /**
     * List of objects containing information about underlying resources.
     * 
    */
    public List<GetNodeGroupResource> getResources() {
        return this.resources;
    }
    /**
     * Configuration block with scaling settings.
     * 
    */
    public List<GetNodeGroupScalingConfig> getScalingConfigs() {
        return this.scalingConfigs;
    }
    /**
     * Status of the EKS Node Group.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * Identifiers of EC2 Subnets to associate with the EKS Node Group.
     * 
    */
    public List<String> getSubnetIds() {
        return this.subnetIds;
    }
    /**
     * Key-value map of resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags;
    }
    /**
     * Kubernetes version.
     * 
    */
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNodeGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String amiType;
        private String arn;
        private String clusterName;
        private Integer diskSize;
        private String id;
        private List<String> instanceTypes;
        private Map<String,String> labels;
        private String nodeGroupName;
        private String nodeRoleArn;
        private String releaseVersion;
        private List<GetNodeGroupRemoteAccess> remoteAccesses;
        private List<GetNodeGroupResource> resources;
        private List<GetNodeGroupScalingConfig> scalingConfigs;
        private String status;
        private List<String> subnetIds;
        private Map<String,String> tags;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNodeGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amiType = defaults.amiType;
    	      this.arn = defaults.arn;
    	      this.clusterName = defaults.clusterName;
    	      this.diskSize = defaults.diskSize;
    	      this.id = defaults.id;
    	      this.instanceTypes = defaults.instanceTypes;
    	      this.labels = defaults.labels;
    	      this.nodeGroupName = defaults.nodeGroupName;
    	      this.nodeRoleArn = defaults.nodeRoleArn;
    	      this.releaseVersion = defaults.releaseVersion;
    	      this.remoteAccesses = defaults.remoteAccesses;
    	      this.resources = defaults.resources;
    	      this.scalingConfigs = defaults.scalingConfigs;
    	      this.status = defaults.status;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
    	      this.version = defaults.version;
        }

        public Builder amiType(String amiType) {
            this.amiType = Objects.requireNonNull(amiType);
            return this;
        }
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder clusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }
        public Builder diskSize(Integer diskSize) {
            this.diskSize = Objects.requireNonNull(diskSize);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder instanceTypes(List<String> instanceTypes) {
            this.instanceTypes = Objects.requireNonNull(instanceTypes);
            return this;
        }
        public Builder instanceTypes(String... instanceTypes) {
            return instanceTypes(List.of(instanceTypes));
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder nodeGroupName(String nodeGroupName) {
            this.nodeGroupName = Objects.requireNonNull(nodeGroupName);
            return this;
        }
        public Builder nodeRoleArn(String nodeRoleArn) {
            this.nodeRoleArn = Objects.requireNonNull(nodeRoleArn);
            return this;
        }
        public Builder releaseVersion(String releaseVersion) {
            this.releaseVersion = Objects.requireNonNull(releaseVersion);
            return this;
        }
        public Builder remoteAccesses(List<GetNodeGroupRemoteAccess> remoteAccesses) {
            this.remoteAccesses = Objects.requireNonNull(remoteAccesses);
            return this;
        }
        public Builder remoteAccesses(GetNodeGroupRemoteAccess... remoteAccesses) {
            return remoteAccesses(List.of(remoteAccesses));
        }
        public Builder resources(List<GetNodeGroupResource> resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }
        public Builder resources(GetNodeGroupResource... resources) {
            return resources(List.of(resources));
        }
        public Builder scalingConfigs(List<GetNodeGroupScalingConfig> scalingConfigs) {
            this.scalingConfigs = Objects.requireNonNull(scalingConfigs);
            return this;
        }
        public Builder scalingConfigs(GetNodeGroupScalingConfig... scalingConfigs) {
            return scalingConfigs(List.of(scalingConfigs));
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder subnetIds(List<String> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public GetNodeGroupResult build() {
            return new GetNodeGroupResult(amiType, arn, clusterName, diskSize, id, instanceTypes, labels, nodeGroupName, nodeRoleArn, releaseVersion, remoteAccesses, resources, scalingConfigs, status, subnetIds, tags, version);
        }
    }
}
