// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dax.inputs;

import io.pulumi.aws.dax.inputs.ClusterNodeGetArgs;
import io.pulumi.aws.dax.inputs.ClusterServerSideEncryptionGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterState extends io.pulumi.resources.ResourceArgs {

    public static final ClusterState Empty = new ClusterState();

    /**
     * The ARN of the DAX cluster
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * List of Availability Zones in which the
     * nodes will be created
     * 
     */
    @Import(name="availabilityZones")
      private final @Nullable Output<List<String>> availabilityZones;

    public Output<List<String>> getAvailabilityZones() {
        return this.availabilityZones == null ? Output.empty() : this.availabilityZones;
    }

    /**
     * The DNS name of the DAX cluster without the port appended
     * 
     */
    @Import(name="clusterAddress")
      private final @Nullable Output<String> clusterAddress;

    public Output<String> getClusterAddress() {
        return this.clusterAddress == null ? Output.empty() : this.clusterAddress;
    }

    /**
     * The type of encryption the
     * cluster's endpoint should support. Valid values are: `NONE` and `TLS`.
     * Default value is `NONE`.
     * 
     */
    @Import(name="clusterEndpointEncryptionType")
      private final @Nullable Output<String> clusterEndpointEncryptionType;

    public Output<String> getClusterEndpointEncryptionType() {
        return this.clusterEndpointEncryptionType == null ? Output.empty() : this.clusterEndpointEncryptionType;
    }

    /**
     * Group identifier. DAX converts this name to
     * lowercase
     * 
     */
    @Import(name="clusterName")
      private final @Nullable Output<String> clusterName;

    public Output<String> getClusterName() {
        return this.clusterName == null ? Output.empty() : this.clusterName;
    }

    /**
     * The configuration endpoint for this DAX cluster,
     * consisting of a DNS name and a port number
     * 
     */
    @Import(name="configurationEndpoint")
      private final @Nullable Output<String> configurationEndpoint;

    public Output<String> getConfigurationEndpoint() {
        return this.configurationEndpoint == null ? Output.empty() : this.configurationEndpoint;
    }

    /**
     * Description for the cluster
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * A valid Amazon Resource Name (ARN) that identifies
     * an IAM role. At runtime, DAX will assume this role and use the role's
     * permissions to access DynamoDB on your behalf
     * 
     */
    @Import(name="iamRoleArn")
      private final @Nullable Output<String> iamRoleArn;

    public Output<String> getIamRoleArn() {
        return this.iamRoleArn == null ? Output.empty() : this.iamRoleArn;
    }

    /**
     * Specifies the weekly time range for when
     * maintenance on the cluster is performed. The format is `ddd:hh24:mi-ddd:hh24:mi`
     * (24H Clock UTC). The minimum maintenance window is a 60 minute period. Example:
     * `sun:05:00-sun:09:00`
     * 
     */
    @Import(name="maintenanceWindow")
      private final @Nullable Output<String> maintenanceWindow;

    public Output<String> getMaintenanceWindow() {
        return this.maintenanceWindow == null ? Output.empty() : this.maintenanceWindow;
    }

    /**
     * The compute and memory capacity of the nodes. See
     * [Nodes](http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DAX.concepts.cluster.html#DAX.concepts.nodes) for supported node types
     * 
     */
    @Import(name="nodeType")
      private final @Nullable Output<String> nodeType;

    public Output<String> getNodeType() {
        return this.nodeType == null ? Output.empty() : this.nodeType;
    }

    /**
     * List of node objects including `id`, `address`, `port` and
     * `availability_zone`. Referenceable e.g., as
     * `${aws_dax_cluster.test.nodes.0.address}`
     * 
     */
    @Import(name="nodes")
      private final @Nullable Output<List<ClusterNodeGetArgs>> nodes;

    public Output<List<ClusterNodeGetArgs>> getNodes() {
        return this.nodes == null ? Output.empty() : this.nodes;
    }

    /**
     * An Amazon Resource Name (ARN) of an
     * SNS topic to send DAX notifications to. Example:
     * `arn:aws:sns:us-east-1:012345678999:my_sns_topic`
     * 
     */
    @Import(name="notificationTopicArn")
      private final @Nullable Output<String> notificationTopicArn;

    public Output<String> getNotificationTopicArn() {
        return this.notificationTopicArn == null ? Output.empty() : this.notificationTopicArn;
    }

    /**
     * Name of the parameter group to associate
     * with this DAX cluster
     * 
     */
    @Import(name="parameterGroupName")
      private final @Nullable Output<String> parameterGroupName;

    public Output<String> getParameterGroupName() {
        return this.parameterGroupName == null ? Output.empty() : this.parameterGroupName;
    }

    /**
     * The port used by the configuration endpoint
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> getPort() {
        return this.port == null ? Output.empty() : this.port;
    }

    /**
     * The number of nodes in the DAX cluster. A
     * replication factor of 1 will create a single-node cluster, without any read
     * replicas
     * 
     */
    @Import(name="replicationFactor")
      private final @Nullable Output<Integer> replicationFactor;

    public Output<Integer> getReplicationFactor() {
        return this.replicationFactor == null ? Output.empty() : this.replicationFactor;
    }

    /**
     * One or more VPC security groups associated
     * with the cluster
     * 
     */
    @Import(name="securityGroupIds")
      private final @Nullable Output<List<String>> securityGroupIds;

    public Output<List<String>> getSecurityGroupIds() {
        return this.securityGroupIds == null ? Output.empty() : this.securityGroupIds;
    }

    /**
     * Encrypt at rest options
     * 
     */
    @Import(name="serverSideEncryption")
      private final @Nullable Output<ClusterServerSideEncryptionGetArgs> serverSideEncryption;

    public Output<ClusterServerSideEncryptionGetArgs> getServerSideEncryption() {
        return this.serverSideEncryption == null ? Output.empty() : this.serverSideEncryption;
    }

    /**
     * Name of the subnet group to be used for the
     * cluster
     * 
     */
    @Import(name="subnetGroupName")
      private final @Nullable Output<String> subnetGroupName;

    public Output<String> getSubnetGroupName() {
        return this.subnetGroupName == null ? Output.empty() : this.subnetGroupName;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public ClusterState(
        @Nullable Output<String> arn,
        @Nullable Output<List<String>> availabilityZones,
        @Nullable Output<String> clusterAddress,
        @Nullable Output<String> clusterEndpointEncryptionType,
        @Nullable Output<String> clusterName,
        @Nullable Output<String> configurationEndpoint,
        @Nullable Output<String> description,
        @Nullable Output<String> iamRoleArn,
        @Nullable Output<String> maintenanceWindow,
        @Nullable Output<String> nodeType,
        @Nullable Output<List<ClusterNodeGetArgs>> nodes,
        @Nullable Output<String> notificationTopicArn,
        @Nullable Output<String> parameterGroupName,
        @Nullable Output<Integer> port,
        @Nullable Output<Integer> replicationFactor,
        @Nullable Output<List<String>> securityGroupIds,
        @Nullable Output<ClusterServerSideEncryptionGetArgs> serverSideEncryption,
        @Nullable Output<String> subnetGroupName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.availabilityZones = availabilityZones;
        this.clusterAddress = clusterAddress;
        this.clusterEndpointEncryptionType = clusterEndpointEncryptionType;
        this.clusterName = clusterName;
        this.configurationEndpoint = configurationEndpoint;
        this.description = description;
        this.iamRoleArn = iamRoleArn;
        this.maintenanceWindow = maintenanceWindow;
        this.nodeType = nodeType;
        this.nodes = nodes;
        this.notificationTopicArn = notificationTopicArn;
        this.parameterGroupName = parameterGroupName;
        this.port = port;
        this.replicationFactor = replicationFactor;
        this.securityGroupIds = securityGroupIds;
        this.serverSideEncryption = serverSideEncryption;
        this.subnetGroupName = subnetGroupName;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private ClusterState() {
        this.arn = Output.empty();
        this.availabilityZones = Output.empty();
        this.clusterAddress = Output.empty();
        this.clusterEndpointEncryptionType = Output.empty();
        this.clusterName = Output.empty();
        this.configurationEndpoint = Output.empty();
        this.description = Output.empty();
        this.iamRoleArn = Output.empty();
        this.maintenanceWindow = Output.empty();
        this.nodeType = Output.empty();
        this.nodes = Output.empty();
        this.notificationTopicArn = Output.empty();
        this.parameterGroupName = Output.empty();
        this.port = Output.empty();
        this.replicationFactor = Output.empty();
        this.securityGroupIds = Output.empty();
        this.serverSideEncryption = Output.empty();
        this.subnetGroupName = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<List<String>> availabilityZones;
        private @Nullable Output<String> clusterAddress;
        private @Nullable Output<String> clusterEndpointEncryptionType;
        private @Nullable Output<String> clusterName;
        private @Nullable Output<String> configurationEndpoint;
        private @Nullable Output<String> description;
        private @Nullable Output<String> iamRoleArn;
        private @Nullable Output<String> maintenanceWindow;
        private @Nullable Output<String> nodeType;
        private @Nullable Output<List<ClusterNodeGetArgs>> nodes;
        private @Nullable Output<String> notificationTopicArn;
        private @Nullable Output<String> parameterGroupName;
        private @Nullable Output<Integer> port;
        private @Nullable Output<Integer> replicationFactor;
        private @Nullable Output<List<String>> securityGroupIds;
        private @Nullable Output<ClusterServerSideEncryptionGetArgs> serverSideEncryption;
        private @Nullable Output<String> subnetGroupName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.clusterAddress = defaults.clusterAddress;
    	      this.clusterEndpointEncryptionType = defaults.clusterEndpointEncryptionType;
    	      this.clusterName = defaults.clusterName;
    	      this.configurationEndpoint = defaults.configurationEndpoint;
    	      this.description = defaults.description;
    	      this.iamRoleArn = defaults.iamRoleArn;
    	      this.maintenanceWindow = defaults.maintenanceWindow;
    	      this.nodeType = defaults.nodeType;
    	      this.nodes = defaults.nodes;
    	      this.notificationTopicArn = defaults.notificationTopicArn;
    	      this.parameterGroupName = defaults.parameterGroupName;
    	      this.port = defaults.port;
    	      this.replicationFactor = defaults.replicationFactor;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.serverSideEncryption = defaults.serverSideEncryption;
    	      this.subnetGroupName = defaults.subnetGroupName;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public Builder availabilityZones(@Nullable Output<List<String>> availabilityZones) {
            this.availabilityZones = availabilityZones;
            return this;
        }
        public Builder availabilityZones(@Nullable List<String> availabilityZones) {
            this.availabilityZones = Output.ofNullable(availabilityZones);
            return this;
        }
        public Builder availabilityZones(String... availabilityZones) {
            return availabilityZones(List.of(availabilityZones));
        }
        public Builder clusterAddress(@Nullable Output<String> clusterAddress) {
            this.clusterAddress = clusterAddress;
            return this;
        }
        public Builder clusterAddress(@Nullable String clusterAddress) {
            this.clusterAddress = Output.ofNullable(clusterAddress);
            return this;
        }
        public Builder clusterEndpointEncryptionType(@Nullable Output<String> clusterEndpointEncryptionType) {
            this.clusterEndpointEncryptionType = clusterEndpointEncryptionType;
            return this;
        }
        public Builder clusterEndpointEncryptionType(@Nullable String clusterEndpointEncryptionType) {
            this.clusterEndpointEncryptionType = Output.ofNullable(clusterEndpointEncryptionType);
            return this;
        }
        public Builder clusterName(@Nullable Output<String> clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public Builder clusterName(@Nullable String clusterName) {
            this.clusterName = Output.ofNullable(clusterName);
            return this;
        }
        public Builder configurationEndpoint(@Nullable Output<String> configurationEndpoint) {
            this.configurationEndpoint = configurationEndpoint;
            return this;
        }
        public Builder configurationEndpoint(@Nullable String configurationEndpoint) {
            this.configurationEndpoint = Output.ofNullable(configurationEndpoint);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder iamRoleArn(@Nullable Output<String> iamRoleArn) {
            this.iamRoleArn = iamRoleArn;
            return this;
        }
        public Builder iamRoleArn(@Nullable String iamRoleArn) {
            this.iamRoleArn = Output.ofNullable(iamRoleArn);
            return this;
        }
        public Builder maintenanceWindow(@Nullable Output<String> maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            return this;
        }
        public Builder maintenanceWindow(@Nullable String maintenanceWindow) {
            this.maintenanceWindow = Output.ofNullable(maintenanceWindow);
            return this;
        }
        public Builder nodeType(@Nullable Output<String> nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public Builder nodeType(@Nullable String nodeType) {
            this.nodeType = Output.ofNullable(nodeType);
            return this;
        }
        public Builder nodes(@Nullable Output<List<ClusterNodeGetArgs>> nodes) {
            this.nodes = nodes;
            return this;
        }
        public Builder nodes(@Nullable List<ClusterNodeGetArgs> nodes) {
            this.nodes = Output.ofNullable(nodes);
            return this;
        }
        public Builder nodes(ClusterNodeGetArgs... nodes) {
            return nodes(List.of(nodes));
        }
        public Builder notificationTopicArn(@Nullable Output<String> notificationTopicArn) {
            this.notificationTopicArn = notificationTopicArn;
            return this;
        }
        public Builder notificationTopicArn(@Nullable String notificationTopicArn) {
            this.notificationTopicArn = Output.ofNullable(notificationTopicArn);
            return this;
        }
        public Builder parameterGroupName(@Nullable Output<String> parameterGroupName) {
            this.parameterGroupName = parameterGroupName;
            return this;
        }
        public Builder parameterGroupName(@Nullable String parameterGroupName) {
            this.parameterGroupName = Output.ofNullable(parameterGroupName);
            return this;
        }
        public Builder port(@Nullable Output<Integer> port) {
            this.port = port;
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = Output.ofNullable(port);
            return this;
        }
        public Builder replicationFactor(@Nullable Output<Integer> replicationFactor) {
            this.replicationFactor = replicationFactor;
            return this;
        }
        public Builder replicationFactor(@Nullable Integer replicationFactor) {
            this.replicationFactor = Output.ofNullable(replicationFactor);
            return this;
        }
        public Builder securityGroupIds(@Nullable Output<List<String>> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public Builder securityGroupIds(@Nullable List<String> securityGroupIds) {
            this.securityGroupIds = Output.ofNullable(securityGroupIds);
            return this;
        }
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }
        public Builder serverSideEncryption(@Nullable Output<ClusterServerSideEncryptionGetArgs> serverSideEncryption) {
            this.serverSideEncryption = serverSideEncryption;
            return this;
        }
        public Builder serverSideEncryption(@Nullable ClusterServerSideEncryptionGetArgs serverSideEncryption) {
            this.serverSideEncryption = Output.ofNullable(serverSideEncryption);
            return this;
        }
        public Builder subnetGroupName(@Nullable Output<String> subnetGroupName) {
            this.subnetGroupName = subnetGroupName;
            return this;
        }
        public Builder subnetGroupName(@Nullable String subnetGroupName) {
            this.subnetGroupName = Output.ofNullable(subnetGroupName);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }        public ClusterState build() {
            return new ClusterState(arn, availabilityZones, clusterAddress, clusterEndpointEncryptionType, clusterName, configurationEndpoint, description, iamRoleArn, maintenanceWindow, nodeType, nodes, notificationTopicArn, parameterGroupName, port, replicationFactor, securityGroupIds, serverSideEncryption, subnetGroupName, tags, tagsAll);
        }
    }
}
