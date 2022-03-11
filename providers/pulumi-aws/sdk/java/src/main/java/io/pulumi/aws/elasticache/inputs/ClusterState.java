// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticache.inputs;

import io.pulumi.aws.elasticache.inputs.ClusterCacheNodeGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterState extends io.pulumi.resources.ResourceArgs {

    public static final ClusterState Empty = new ClusterState();

    /**
     * Whether any database modifications are applied immediately, or during the next maintenance window. Default is `false`. See [Amazon ElastiCache Documentation for more information.](https://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_ModifyCacheCluster.html).
     * 
     */
    @InputImport(name="applyImmediately")
      private final @Nullable Output<Boolean> applyImmediately;

    public Output<Boolean> getApplyImmediately() {
        return this.applyImmediately == null ? Output.empty() : this.applyImmediately;
    }

    /**
     * The ARN of the created ElastiCache Cluster.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * Availability Zone for the cache cluster. If you want to create cache nodes in multi-az, use `preferred_availability_zones` instead. Default: System chosen Availability Zone. Changing this value will re-create the resource.
     * 
     */
    @InputImport(name="availabilityZone")
      private final @Nullable Output<String> availabilityZone;

    public Output<String> getAvailabilityZone() {
        return this.availabilityZone == null ? Output.empty() : this.availabilityZone;
    }

    /**
     * Whether the nodes in this Memcached node group are created in a single Availability Zone or created across multiple Availability Zones in the cluster's region. Valid values for this parameter are `single-az` or `cross-az`, default is `single-az`. If you want to choose `cross-az`, `num_cache_nodes` must be greater than `1`.
     * 
     */
    @InputImport(name="azMode")
      private final @Nullable Output<String> azMode;

    public Output<String> getAzMode() {
        return this.azMode == null ? Output.empty() : this.azMode;
    }

    /**
     * List of node objects including `id`, `address`, `port` and `availability_zone`.
     * 
     */
    @InputImport(name="cacheNodes")
      private final @Nullable Output<List<ClusterCacheNodeGetArgs>> cacheNodes;

    public Output<List<ClusterCacheNodeGetArgs>> getCacheNodes() {
        return this.cacheNodes == null ? Output.empty() : this.cacheNodes;
    }

    /**
     * (Memcached only) DNS name of the cache cluster without the port appended.
     * 
     */
    @InputImport(name="clusterAddress")
      private final @Nullable Output<String> clusterAddress;

    public Output<String> getClusterAddress() {
        return this.clusterAddress == null ? Output.empty() : this.clusterAddress;
    }

    /**
     * Group identifier. ElastiCache converts this name to lowercase. Changing this value will re-create the resource.
     * 
     */
    @InputImport(name="clusterId")
      private final @Nullable Output<String> clusterId;

    public Output<String> getClusterId() {
        return this.clusterId == null ? Output.empty() : this.clusterId;
    }

    /**
     * (Memcached only) Configuration endpoint to allow host discovery.
     * 
     */
    @InputImport(name="configurationEndpoint")
      private final @Nullable Output<String> configurationEndpoint;

    public Output<String> getConfigurationEndpoint() {
        return this.configurationEndpoint == null ? Output.empty() : this.configurationEndpoint;
    }

    /**
     * Name of the cache engine to be used for this cache cluster. Valid values are `memcached` or `redis`.
     * 
     */
    @InputImport(name="engine")
      private final @Nullable Output<String> engine;

    public Output<String> getEngine() {
        return this.engine == null ? Output.empty() : this.engine;
    }

    /**
     * Version number of the cache engine to be used.
     * See [Describe Cache Engine Versions](https://docs.aws.amazon.com/cli/latest/reference/elasticache/describe-cache-engine-versions.html)
     * in the AWS Documentation for supported versions. When `engine` is `redis` and the version is 6 or higher, only the major version can be set, e.g., `6.x`, otherwise, specify the full version desired, e.g., `5.0.6`. The actual engine version used is returned in the attribute `engine_version_actual`, defined below.
     * 
     */
    @InputImport(name="engineVersion")
      private final @Nullable Output<String> engineVersion;

    public Output<String> getEngineVersion() {
        return this.engineVersion == null ? Output.empty() : this.engineVersion;
    }

    /**
     * The running version of the cache engine.
     * 
     */
    @InputImport(name="engineVersionActual")
      private final @Nullable Output<String> engineVersionActual;

    public Output<String> getEngineVersionActual() {
        return this.engineVersionActual == null ? Output.empty() : this.engineVersionActual;
    }

    /**
     * Name of your final cluster snapshot. If omitted, no final snapshot will be made.
     * 
     */
    @InputImport(name="finalSnapshotIdentifier")
      private final @Nullable Output<String> finalSnapshotIdentifier;

    public Output<String> getFinalSnapshotIdentifier() {
        return this.finalSnapshotIdentifier == null ? Output.empty() : this.finalSnapshotIdentifier;
    }

    /**
     * Specifies the weekly time range for when maintenance
     * on the cache cluster is performed. The format is `ddd:hh24:mi-ddd:hh24:mi` (24H Clock UTC).
     * The minimum maintenance window is a 60 minute period. Example: `sun:05:00-sun:09:00`.
     * 
     */
    @InputImport(name="maintenanceWindow")
      private final @Nullable Output<String> maintenanceWindow;

    public Output<String> getMaintenanceWindow() {
        return this.maintenanceWindow == null ? Output.empty() : this.maintenanceWindow;
    }

    /**
     * The instance class used. See AWS documentation for information on [supported node types for Redis](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/CacheNodes.SupportedTypes.html) and [guidance on selecting node types for Redis](https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/nodes-select-size.html). See AWS documentation for information on [supported node types for Memcached](https://docs.aws.amazon.com/AmazonElastiCache/latest/mem-ug/CacheNodes.SupportedTypes.html) and [guidance on selecting node types for Memcached](https://docs.aws.amazon.com/AmazonElastiCache/latest/mem-ug/nodes-select-size.html). For Memcached, changing this value will re-create the resource.
     * 
     */
    @InputImport(name="nodeType")
      private final @Nullable Output<String> nodeType;

    public Output<String> getNodeType() {
        return this.nodeType == null ? Output.empty() : this.nodeType;
    }

    /**
     * ARN of an SNS topic to send ElastiCache notifications to. Example: `arn:aws:sns:us-east-1:012345678999:my_sns_topic`.
     * 
     */
    @InputImport(name="notificationTopicArn")
      private final @Nullable Output<String> notificationTopicArn;

    public Output<String> getNotificationTopicArn() {
        return this.notificationTopicArn == null ? Output.empty() : this.notificationTopicArn;
    }

    /**
     * The initial number of cache nodes that the cache cluster will have. For Redis, this value must be 1. For Memcached, this value must be between 1 and 40. If this number is reduced on subsequent runs, the highest numbered nodes will be removed.
     * 
     */
    @InputImport(name="numCacheNodes")
      private final @Nullable Output<Integer> numCacheNodes;

    public Output<Integer> getNumCacheNodes() {
        return this.numCacheNodes == null ? Output.empty() : this.numCacheNodes;
    }

    /**
     * The name of the parameter group to associate with this cache cluster.
     * 
     */
    @InputImport(name="parameterGroupName")
      private final @Nullable Output<String> parameterGroupName;

    public Output<String> getParameterGroupName() {
        return this.parameterGroupName == null ? Output.empty() : this.parameterGroupName;
    }

    /**
     * The port number on which each of the cache nodes will accept connections. For Memcached the default is 11211, and for Redis the default port is 6379. Cannot be provided with `replication_group_id`. Changing this value will re-create the resource.
     * 
     */
    @InputImport(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> getPort() {
        return this.port == null ? Output.empty() : this.port;
    }

    /**
     * List of the Availability Zones in which cache nodes are created. If you are creating your cluster in an Amazon VPC you can only locate nodes in Availability Zones that are associated with the subnets in the selected subnet group. The number of Availability Zones listed must equal the value of `num_cache_nodes`. If you want all the nodes in the same Availability Zone, use `availability_zone` instead, or repeat the Availability Zone multiple times in the list. Default: System chosen Availability Zones. Detecting drift of existing node availability zone is not currently supported. Updating this argument by itself to migrate existing node availability zones is not currently supported and will show a perpetual difference.
     * 
     */
    @InputImport(name="preferredAvailabilityZones")
      private final @Nullable Output<List<String>> preferredAvailabilityZones;

    public Output<List<String>> getPreferredAvailabilityZones() {
        return this.preferredAvailabilityZones == null ? Output.empty() : this.preferredAvailabilityZones;
    }

    /**
     * ID of the replication group to which this cluster should belong. If this parameter is specified, the cluster is added to the specified replication group as a read replica; otherwise, the cluster is a standalone primary that is not part of any replication group.
     * 
     */
    @InputImport(name="replicationGroupId")
      private final @Nullable Output<String> replicationGroupId;

    public Output<String> getReplicationGroupId() {
        return this.replicationGroupId == null ? Output.empty() : this.replicationGroupId;
    }

    /**
     * One or more VPC security groups associated with the cache cluster
     * 
     */
    @InputImport(name="securityGroupIds")
      private final @Nullable Output<List<String>> securityGroupIds;

    public Output<List<String>> getSecurityGroupIds() {
        return this.securityGroupIds == null ? Output.empty() : this.securityGroupIds;
    }

    /**
     * List of security group names to associate with this cache cluster. Changing this value will re-create the resource.
     * 
     */
    @InputImport(name="securityGroupNames")
      private final @Nullable Output<List<String>> securityGroupNames;

    public Output<List<String>> getSecurityGroupNames() {
        return this.securityGroupNames == null ? Output.empty() : this.securityGroupNames;
    }

    /**
     * Single-element string list containing an Amazon Resource Name (ARN) of a Redis RDB snapshot file stored in Amazon S3. The object name cannot contain any commas. Changing `snapshot_arns` forces a new resource.
     * 
     */
    @InputImport(name="snapshotArns")
      private final @Nullable Output<String> snapshotArns;

    public Output<String> getSnapshotArns() {
        return this.snapshotArns == null ? Output.empty() : this.snapshotArns;
    }

    /**
     * Name of a snapshot from which to restore data into the new node group. Changing `snapshot_name` forces a new resource.
     * 
     */
    @InputImport(name="snapshotName")
      private final @Nullable Output<String> snapshotName;

    public Output<String> getSnapshotName() {
        return this.snapshotName == null ? Output.empty() : this.snapshotName;
    }

    /**
     * Number of days for which ElastiCache will retain automatic cache cluster snapshots before deleting them. For example, if you set SnapshotRetentionLimit to 5, then a snapshot that was taken today will be retained for 5 days before being deleted. If the value of SnapshotRetentionLimit is set to zero (0), backups are turned off. Please note that setting a `snapshot_retention_limit` is not supported on cache.t1.micro cache nodes
     * 
     */
    @InputImport(name="snapshotRetentionLimit")
      private final @Nullable Output<Integer> snapshotRetentionLimit;

    public Output<Integer> getSnapshotRetentionLimit() {
        return this.snapshotRetentionLimit == null ? Output.empty() : this.snapshotRetentionLimit;
    }

    /**
     * Daily time range (in UTC) during which ElastiCache will begin taking a daily snapshot of your cache cluster. Example: 05:00-09:00
     * 
     */
    @InputImport(name="snapshotWindow")
      private final @Nullable Output<String> snapshotWindow;

    public Output<String> getSnapshotWindow() {
        return this.snapshotWindow == null ? Output.empty() : this.snapshotWindow;
    }

    /**
     * Name of the subnet group to be used for the cache cluster. Changing this value will re-create the resource.
     * 
     */
    @InputImport(name="subnetGroupName")
      private final @Nullable Output<String> subnetGroupName;

    public Output<String> getSubnetGroupName() {
        return this.subnetGroupName == null ? Output.empty() : this.subnetGroupName;
    }

    /**
     * Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    @InputImport(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public ClusterState(
        @Nullable Output<Boolean> applyImmediately,
        @Nullable Output<String> arn,
        @Nullable Output<String> availabilityZone,
        @Nullable Output<String> azMode,
        @Nullable Output<List<ClusterCacheNodeGetArgs>> cacheNodes,
        @Nullable Output<String> clusterAddress,
        @Nullable Output<String> clusterId,
        @Nullable Output<String> configurationEndpoint,
        @Nullable Output<String> engine,
        @Nullable Output<String> engineVersion,
        @Nullable Output<String> engineVersionActual,
        @Nullable Output<String> finalSnapshotIdentifier,
        @Nullable Output<String> maintenanceWindow,
        @Nullable Output<String> nodeType,
        @Nullable Output<String> notificationTopicArn,
        @Nullable Output<Integer> numCacheNodes,
        @Nullable Output<String> parameterGroupName,
        @Nullable Output<Integer> port,
        @Nullable Output<List<String>> preferredAvailabilityZones,
        @Nullable Output<String> replicationGroupId,
        @Nullable Output<List<String>> securityGroupIds,
        @Nullable Output<List<String>> securityGroupNames,
        @Nullable Output<String> snapshotArns,
        @Nullable Output<String> snapshotName,
        @Nullable Output<Integer> snapshotRetentionLimit,
        @Nullable Output<String> snapshotWindow,
        @Nullable Output<String> subnetGroupName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.applyImmediately = applyImmediately;
        this.arn = arn;
        this.availabilityZone = availabilityZone;
        this.azMode = azMode;
        this.cacheNodes = cacheNodes;
        this.clusterAddress = clusterAddress;
        this.clusterId = clusterId;
        this.configurationEndpoint = configurationEndpoint;
        this.engine = engine;
        this.engineVersion = engineVersion;
        this.engineVersionActual = engineVersionActual;
        this.finalSnapshotIdentifier = finalSnapshotIdentifier;
        this.maintenanceWindow = maintenanceWindow;
        this.nodeType = nodeType;
        this.notificationTopicArn = notificationTopicArn;
        this.numCacheNodes = numCacheNodes;
        this.parameterGroupName = parameterGroupName;
        this.port = port;
        this.preferredAvailabilityZones = preferredAvailabilityZones;
        this.replicationGroupId = replicationGroupId;
        this.securityGroupIds = securityGroupIds;
        this.securityGroupNames = securityGroupNames;
        this.snapshotArns = snapshotArns;
        this.snapshotName = snapshotName;
        this.snapshotRetentionLimit = snapshotRetentionLimit;
        this.snapshotWindow = snapshotWindow;
        this.subnetGroupName = subnetGroupName;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private ClusterState() {
        this.applyImmediately = Output.empty();
        this.arn = Output.empty();
        this.availabilityZone = Output.empty();
        this.azMode = Output.empty();
        this.cacheNodes = Output.empty();
        this.clusterAddress = Output.empty();
        this.clusterId = Output.empty();
        this.configurationEndpoint = Output.empty();
        this.engine = Output.empty();
        this.engineVersion = Output.empty();
        this.engineVersionActual = Output.empty();
        this.finalSnapshotIdentifier = Output.empty();
        this.maintenanceWindow = Output.empty();
        this.nodeType = Output.empty();
        this.notificationTopicArn = Output.empty();
        this.numCacheNodes = Output.empty();
        this.parameterGroupName = Output.empty();
        this.port = Output.empty();
        this.preferredAvailabilityZones = Output.empty();
        this.replicationGroupId = Output.empty();
        this.securityGroupIds = Output.empty();
        this.securityGroupNames = Output.empty();
        this.snapshotArns = Output.empty();
        this.snapshotName = Output.empty();
        this.snapshotRetentionLimit = Output.empty();
        this.snapshotWindow = Output.empty();
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
        private @Nullable Output<Boolean> applyImmediately;
        private @Nullable Output<String> arn;
        private @Nullable Output<String> availabilityZone;
        private @Nullable Output<String> azMode;
        private @Nullable Output<List<ClusterCacheNodeGetArgs>> cacheNodes;
        private @Nullable Output<String> clusterAddress;
        private @Nullable Output<String> clusterId;
        private @Nullable Output<String> configurationEndpoint;
        private @Nullable Output<String> engine;
        private @Nullable Output<String> engineVersion;
        private @Nullable Output<String> engineVersionActual;
        private @Nullable Output<String> finalSnapshotIdentifier;
        private @Nullable Output<String> maintenanceWindow;
        private @Nullable Output<String> nodeType;
        private @Nullable Output<String> notificationTopicArn;
        private @Nullable Output<Integer> numCacheNodes;
        private @Nullable Output<String> parameterGroupName;
        private @Nullable Output<Integer> port;
        private @Nullable Output<List<String>> preferredAvailabilityZones;
        private @Nullable Output<String> replicationGroupId;
        private @Nullable Output<List<String>> securityGroupIds;
        private @Nullable Output<List<String>> securityGroupNames;
        private @Nullable Output<String> snapshotArns;
        private @Nullable Output<String> snapshotName;
        private @Nullable Output<Integer> snapshotRetentionLimit;
        private @Nullable Output<String> snapshotWindow;
        private @Nullable Output<String> subnetGroupName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applyImmediately = defaults.applyImmediately;
    	      this.arn = defaults.arn;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.azMode = defaults.azMode;
    	      this.cacheNodes = defaults.cacheNodes;
    	      this.clusterAddress = defaults.clusterAddress;
    	      this.clusterId = defaults.clusterId;
    	      this.configurationEndpoint = defaults.configurationEndpoint;
    	      this.engine = defaults.engine;
    	      this.engineVersion = defaults.engineVersion;
    	      this.engineVersionActual = defaults.engineVersionActual;
    	      this.finalSnapshotIdentifier = defaults.finalSnapshotIdentifier;
    	      this.maintenanceWindow = defaults.maintenanceWindow;
    	      this.nodeType = defaults.nodeType;
    	      this.notificationTopicArn = defaults.notificationTopicArn;
    	      this.numCacheNodes = defaults.numCacheNodes;
    	      this.parameterGroupName = defaults.parameterGroupName;
    	      this.port = defaults.port;
    	      this.preferredAvailabilityZones = defaults.preferredAvailabilityZones;
    	      this.replicationGroupId = defaults.replicationGroupId;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.securityGroupNames = defaults.securityGroupNames;
    	      this.snapshotArns = defaults.snapshotArns;
    	      this.snapshotName = defaults.snapshotName;
    	      this.snapshotRetentionLimit = defaults.snapshotRetentionLimit;
    	      this.snapshotWindow = defaults.snapshotWindow;
    	      this.subnetGroupName = defaults.subnetGroupName;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder applyImmediately(@Nullable Output<Boolean> applyImmediately) {
            this.applyImmediately = applyImmediately;
            return this;
        }

        public Builder applyImmediately(@Nullable Boolean applyImmediately) {
            this.applyImmediately = Output.ofNullable(applyImmediately);
            return this;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }

        public Builder availabilityZone(@Nullable Output<String> availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }

        public Builder availabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = Output.ofNullable(availabilityZone);
            return this;
        }

        public Builder azMode(@Nullable Output<String> azMode) {
            this.azMode = azMode;
            return this;
        }

        public Builder azMode(@Nullable String azMode) {
            this.azMode = Output.ofNullable(azMode);
            return this;
        }

        public Builder cacheNodes(@Nullable Output<List<ClusterCacheNodeGetArgs>> cacheNodes) {
            this.cacheNodes = cacheNodes;
            return this;
        }

        public Builder cacheNodes(@Nullable List<ClusterCacheNodeGetArgs> cacheNodes) {
            this.cacheNodes = Output.ofNullable(cacheNodes);
            return this;
        }

        public Builder clusterAddress(@Nullable Output<String> clusterAddress) {
            this.clusterAddress = clusterAddress;
            return this;
        }

        public Builder clusterAddress(@Nullable String clusterAddress) {
            this.clusterAddress = Output.ofNullable(clusterAddress);
            return this;
        }

        public Builder clusterId(@Nullable Output<String> clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        public Builder clusterId(@Nullable String clusterId) {
            this.clusterId = Output.ofNullable(clusterId);
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

        public Builder engine(@Nullable Output<String> engine) {
            this.engine = engine;
            return this;
        }

        public Builder engine(@Nullable String engine) {
            this.engine = Output.ofNullable(engine);
            return this;
        }

        public Builder engineVersion(@Nullable Output<String> engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        public Builder engineVersion(@Nullable String engineVersion) {
            this.engineVersion = Output.ofNullable(engineVersion);
            return this;
        }

        public Builder engineVersionActual(@Nullable Output<String> engineVersionActual) {
            this.engineVersionActual = engineVersionActual;
            return this;
        }

        public Builder engineVersionActual(@Nullable String engineVersionActual) {
            this.engineVersionActual = Output.ofNullable(engineVersionActual);
            return this;
        }

        public Builder finalSnapshotIdentifier(@Nullable Output<String> finalSnapshotIdentifier) {
            this.finalSnapshotIdentifier = finalSnapshotIdentifier;
            return this;
        }

        public Builder finalSnapshotIdentifier(@Nullable String finalSnapshotIdentifier) {
            this.finalSnapshotIdentifier = Output.ofNullable(finalSnapshotIdentifier);
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

        public Builder notificationTopicArn(@Nullable Output<String> notificationTopicArn) {
            this.notificationTopicArn = notificationTopicArn;
            return this;
        }

        public Builder notificationTopicArn(@Nullable String notificationTopicArn) {
            this.notificationTopicArn = Output.ofNullable(notificationTopicArn);
            return this;
        }

        public Builder numCacheNodes(@Nullable Output<Integer> numCacheNodes) {
            this.numCacheNodes = numCacheNodes;
            return this;
        }

        public Builder numCacheNodes(@Nullable Integer numCacheNodes) {
            this.numCacheNodes = Output.ofNullable(numCacheNodes);
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

        public Builder preferredAvailabilityZones(@Nullable Output<List<String>> preferredAvailabilityZones) {
            this.preferredAvailabilityZones = preferredAvailabilityZones;
            return this;
        }

        public Builder preferredAvailabilityZones(@Nullable List<String> preferredAvailabilityZones) {
            this.preferredAvailabilityZones = Output.ofNullable(preferredAvailabilityZones);
            return this;
        }

        public Builder replicationGroupId(@Nullable Output<String> replicationGroupId) {
            this.replicationGroupId = replicationGroupId;
            return this;
        }

        public Builder replicationGroupId(@Nullable String replicationGroupId) {
            this.replicationGroupId = Output.ofNullable(replicationGroupId);
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

        public Builder securityGroupNames(@Nullable Output<List<String>> securityGroupNames) {
            this.securityGroupNames = securityGroupNames;
            return this;
        }

        public Builder securityGroupNames(@Nullable List<String> securityGroupNames) {
            this.securityGroupNames = Output.ofNullable(securityGroupNames);
            return this;
        }

        public Builder snapshotArns(@Nullable Output<String> snapshotArns) {
            this.snapshotArns = snapshotArns;
            return this;
        }

        public Builder snapshotArns(@Nullable String snapshotArns) {
            this.snapshotArns = Output.ofNullable(snapshotArns);
            return this;
        }

        public Builder snapshotName(@Nullable Output<String> snapshotName) {
            this.snapshotName = snapshotName;
            return this;
        }

        public Builder snapshotName(@Nullable String snapshotName) {
            this.snapshotName = Output.ofNullable(snapshotName);
            return this;
        }

        public Builder snapshotRetentionLimit(@Nullable Output<Integer> snapshotRetentionLimit) {
            this.snapshotRetentionLimit = snapshotRetentionLimit;
            return this;
        }

        public Builder snapshotRetentionLimit(@Nullable Integer snapshotRetentionLimit) {
            this.snapshotRetentionLimit = Output.ofNullable(snapshotRetentionLimit);
            return this;
        }

        public Builder snapshotWindow(@Nullable Output<String> snapshotWindow) {
            this.snapshotWindow = snapshotWindow;
            return this;
        }

        public Builder snapshotWindow(@Nullable String snapshotWindow) {
            this.snapshotWindow = Output.ofNullable(snapshotWindow);
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
        }
        public ClusterState build() {
            return new ClusterState(applyImmediately, arn, availabilityZone, azMode, cacheNodes, clusterAddress, clusterId, configurationEndpoint, engine, engineVersion, engineVersionActual, finalSnapshotIdentifier, maintenanceWindow, nodeType, notificationTopicArn, numCacheNodes, parameterGroupName, port, preferredAvailabilityZones, replicationGroupId, securityGroupIds, securityGroupNames, snapshotArns, snapshotName, snapshotRetentionLimit, snapshotWindow, subnetGroupName, tags, tagsAll);
        }
    }
}
