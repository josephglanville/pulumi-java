// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.redis_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.redis_v1beta1.outputs.MaintenancePolicyResponse;
import io.pulumi.googlenative.redis_v1beta1.outputs.MaintenanceScheduleResponse;
import io.pulumi.googlenative.redis_v1beta1.outputs.NodeInfoResponse;
import io.pulumi.googlenative.redis_v1beta1.outputs.PersistenceConfigResponse;
import io.pulumi.googlenative.redis_v1beta1.outputs.TlsCertificateResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetInstanceResult {
    /**
     * Optional. If specified, at least one node will be provisioned in this zone in addition to the zone specified in location_id. Only applicable to standard tier. If provided, it must be a different zone from the one provided in [location_id]. Additional nodes beyond the first 2 will be placed in zones selected by the service.
     * 
     */
    private final String alternativeLocationId;
    /**
     * Optional. Indicates whether OSS Redis AUTH is enabled for the instance. If set to "true" AUTH is enabled on the instance. Default value is "false" meaning AUTH is disabled.
     * 
     */
    private final Boolean authEnabled;
    /**
     * Optional. The full name of the Google Compute Engine [network](https://cloud.google.com/vpc/docs/vpc) to which the instance is connected. If left unspecified, the `default` network will be used.
     * 
     */
    private final String authorizedNetwork;
    /**
     * Optional. The network connect mode of the Redis instance. If not provided, the connect mode defaults to DIRECT_PEERING.
     * 
     */
    private final String connectMode;
    /**
     * The time the instance was created.
     * 
     */
    private final String createTime;
    /**
     * The current zone where the Redis primary node is located. In basic tier, this will always be the same as [location_id]. In standard tier, this can be the zone of any node in the instance.
     * 
     */
    private final String currentLocationId;
    /**
     * An arbitrary and optional user-provided name for the instance.
     * 
     */
    private final String displayName;
    /**
     * Hostname or IP address of the exposed Redis endpoint used by clients to connect to the service.
     * 
     */
    private final String host;
    /**
     * Resource labels to represent user provided metadata
     * 
     */
    private final Map<String,String> labels;
    /**
     * Optional. The zone where the instance will be provisioned. If not provided, the service will choose a zone from the specified region for the instance. For standard tier, additional nodes will be added across multiple zones for protection against zonal failures. If specified, at least one node will be provisioned in this zone.
     * 
     */
    private final String location;
    /**
     * Optional. The maintenance policy for the instance. If not provided, maintenance events can be performed at any time.
     * 
     */
    private final MaintenancePolicyResponse maintenancePolicy;
    /**
     * Date and time of upcoming maintenance events which have been scheduled.
     * 
     */
    private final MaintenanceScheduleResponse maintenanceSchedule;
    /**
     * Redis memory size in GiB.
     * 
     */
    private final Integer memorySizeGb;
    /**
     * Unique name of the resource in this scope including project and location using the form: `projects/{project_id}/locations/{location_id}/instances/{instance_id}` Note: Redis instances are managed and addressed at regional level so location_id here refers to a GCP region; however, users may choose which specific zone (or collection of zones for cross-zone instances) an instance should be provisioned in. Refer to location_id and alternative_location_id fields for more details.
     * 
     */
    private final String name;
    /**
     * Info per node.
     * 
     */
    private final List<NodeInfoResponse> nodes;
    /**
     * Optional. Persistence configuration parameters
     * 
     */
    private final PersistenceConfigResponse persistenceConfig;
    /**
     * Cloud IAM identity used by import / export operations to transfer data to/from Cloud Storage. Format is "serviceAccount:". The value may change over time for a given instance so should be checked before each import/export operation.
     * 
     */
    private final String persistenceIamIdentity;
    /**
     * The port number of the exposed Redis endpoint.
     * 
     */
    private final Integer port;
    /**
     * Hostname or IP address of the exposed readonly Redis endpoint. Standard tier only. Targets all healthy replica nodes in instance. Replication is asynchronous and replica nodes will exhibit some lag behind the primary. Write requests must target 'host'.
     * 
     */
    private final String readEndpoint;
    /**
     * The port number of the exposed readonly redis endpoint. Standard tier only. Write requests should target 'port'.
     * 
     */
    private final Integer readEndpointPort;
    /**
     * Optional. Read replica mode. Can only be specified when trying to create the instance.
     * 
     */
    private final String readReplicasMode;
    /**
     * Optional. Redis configuration parameters, according to http://redis.io/topics/config. Currently, the only supported parameters are: Redis version 3.2 and newer: * maxmemory-policy * notify-keyspace-events Redis version 4.0 and newer: * activedefrag * lfu-decay-time * lfu-log-factor * maxmemory-gb Redis version 5.0 and newer: * stream-node-max-bytes * stream-node-max-entries
     * 
     */
    private final Map<String,String> redisConfigs;
    /**
     * Optional. The version of Redis software. If not provided, latest supported version will be used. Currently, the supported values are: * `REDIS_3_2` for Redis 3.2 compatibility * `REDIS_4_0` for Redis 4.0 compatibility (default) * `REDIS_5_0` for Redis 5.0 compatibility * `REDIS_6_X` for Redis 6.x compatibility
     * 
     */
    private final String redisVersion;
    /**
     * Optional. The number of replica nodes. The valid range for the Standard Tier with read replicas enabled is [1-5] and defaults to 2. If read replicas are not enabled for a Standard Tier instance, the only valid value is 1 and the default is 1. The valid value for basic tier is 0 and the default is also 0.
     * 
     */
    private final Integer replicaCount;
    /**
     * Optional. For DIRECT_PEERING mode, the CIDR range of internal addresses that are reserved for this instance. Range must be unique and non-overlapping with existing subnets in an authorized network. For PRIVATE_SERVICE_ACCESS mode, the name of one allocated IP address ranges associated with this private service access connection. If not provided, the service will choose an unused /29 block, for example, 10.0.0.0/29 or 192.168.0.0/29. For READ_REPLICAS_ENABLED the default block size is /28.
     * 
     */
    private final String reservedIpRange;
    /**
     * Optional. Additional ip ranges for node placement, beyond those specified in reserved_ip_range. At most 1 secondary IP range is supported. The mask value must not exceed /28. Not supported for BASIC tier. Updates can only add new ranges, once added ranges cannot be changed or deleted. Values in this list cannot overlap with the reserved_ip_range. Not supported during instance creation.
     * 
     */
    private final String secondaryIpRange;
    /**
     * List of server CA certificates for the instance.
     * 
     */
    private final List<TlsCertificateResponse> serverCaCerts;
    /**
     * The current state of this instance.
     * 
     */
    private final String state;
    /**
     * Additional information about the current status of this instance, if available.
     * 
     */
    private final String statusMessage;
    /**
     * The service tier of the instance.
     * 
     */
    private final String tier;
    /**
     * Optional. The TLS mode of the Redis instance. If not provided, TLS is disabled for the instance.
     * 
     */
    private final String transitEncryptionMode;

    @CustomType.Constructor
    private GetInstanceResult(
        @CustomType.Parameter("alternativeLocationId") String alternativeLocationId,
        @CustomType.Parameter("authEnabled") Boolean authEnabled,
        @CustomType.Parameter("authorizedNetwork") String authorizedNetwork,
        @CustomType.Parameter("connectMode") String connectMode,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("currentLocationId") String currentLocationId,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("host") String host,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("maintenancePolicy") MaintenancePolicyResponse maintenancePolicy,
        @CustomType.Parameter("maintenanceSchedule") MaintenanceScheduleResponse maintenanceSchedule,
        @CustomType.Parameter("memorySizeGb") Integer memorySizeGb,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("nodes") List<NodeInfoResponse> nodes,
        @CustomType.Parameter("persistenceConfig") PersistenceConfigResponse persistenceConfig,
        @CustomType.Parameter("persistenceIamIdentity") String persistenceIamIdentity,
        @CustomType.Parameter("port") Integer port,
        @CustomType.Parameter("readEndpoint") String readEndpoint,
        @CustomType.Parameter("readEndpointPort") Integer readEndpointPort,
        @CustomType.Parameter("readReplicasMode") String readReplicasMode,
        @CustomType.Parameter("redisConfigs") Map<String,String> redisConfigs,
        @CustomType.Parameter("redisVersion") String redisVersion,
        @CustomType.Parameter("replicaCount") Integer replicaCount,
        @CustomType.Parameter("reservedIpRange") String reservedIpRange,
        @CustomType.Parameter("secondaryIpRange") String secondaryIpRange,
        @CustomType.Parameter("serverCaCerts") List<TlsCertificateResponse> serverCaCerts,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("statusMessage") String statusMessage,
        @CustomType.Parameter("tier") String tier,
        @CustomType.Parameter("transitEncryptionMode") String transitEncryptionMode) {
        this.alternativeLocationId = alternativeLocationId;
        this.authEnabled = authEnabled;
        this.authorizedNetwork = authorizedNetwork;
        this.connectMode = connectMode;
        this.createTime = createTime;
        this.currentLocationId = currentLocationId;
        this.displayName = displayName;
        this.host = host;
        this.labels = labels;
        this.location = location;
        this.maintenancePolicy = maintenancePolicy;
        this.maintenanceSchedule = maintenanceSchedule;
        this.memorySizeGb = memorySizeGb;
        this.name = name;
        this.nodes = nodes;
        this.persistenceConfig = persistenceConfig;
        this.persistenceIamIdentity = persistenceIamIdentity;
        this.port = port;
        this.readEndpoint = readEndpoint;
        this.readEndpointPort = readEndpointPort;
        this.readReplicasMode = readReplicasMode;
        this.redisConfigs = redisConfigs;
        this.redisVersion = redisVersion;
        this.replicaCount = replicaCount;
        this.reservedIpRange = reservedIpRange;
        this.secondaryIpRange = secondaryIpRange;
        this.serverCaCerts = serverCaCerts;
        this.state = state;
        this.statusMessage = statusMessage;
        this.tier = tier;
        this.transitEncryptionMode = transitEncryptionMode;
    }

    /**
     * Optional. If specified, at least one node will be provisioned in this zone in addition to the zone specified in location_id. Only applicable to standard tier. If provided, it must be a different zone from the one provided in [location_id]. Additional nodes beyond the first 2 will be placed in zones selected by the service.
     * 
    */
    public String getAlternativeLocationId() {
        return this.alternativeLocationId;
    }
    /**
     * Optional. Indicates whether OSS Redis AUTH is enabled for the instance. If set to "true" AUTH is enabled on the instance. Default value is "false" meaning AUTH is disabled.
     * 
    */
    public Boolean getAuthEnabled() {
        return this.authEnabled;
    }
    /**
     * Optional. The full name of the Google Compute Engine [network](https://cloud.google.com/vpc/docs/vpc) to which the instance is connected. If left unspecified, the `default` network will be used.
     * 
    */
    public String getAuthorizedNetwork() {
        return this.authorizedNetwork;
    }
    /**
     * Optional. The network connect mode of the Redis instance. If not provided, the connect mode defaults to DIRECT_PEERING.
     * 
    */
    public String getConnectMode() {
        return this.connectMode;
    }
    /**
     * The time the instance was created.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * The current zone where the Redis primary node is located. In basic tier, this will always be the same as [location_id]. In standard tier, this can be the zone of any node in the instance.
     * 
    */
    public String getCurrentLocationId() {
        return this.currentLocationId;
    }
    /**
     * An arbitrary and optional user-provided name for the instance.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Hostname or IP address of the exposed Redis endpoint used by clients to connect to the service.
     * 
    */
    public String getHost() {
        return this.host;
    }
    /**
     * Resource labels to represent user provided metadata
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * Optional. The zone where the instance will be provisioned. If not provided, the service will choose a zone from the specified region for the instance. For standard tier, additional nodes will be added across multiple zones for protection against zonal failures. If specified, at least one node will be provisioned in this zone.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Optional. The maintenance policy for the instance. If not provided, maintenance events can be performed at any time.
     * 
    */
    public MaintenancePolicyResponse getMaintenancePolicy() {
        return this.maintenancePolicy;
    }
    /**
     * Date and time of upcoming maintenance events which have been scheduled.
     * 
    */
    public MaintenanceScheduleResponse getMaintenanceSchedule() {
        return this.maintenanceSchedule;
    }
    /**
     * Redis memory size in GiB.
     * 
    */
    public Integer getMemorySizeGb() {
        return this.memorySizeGb;
    }
    /**
     * Unique name of the resource in this scope including project and location using the form: `projects/{project_id}/locations/{location_id}/instances/{instance_id}` Note: Redis instances are managed and addressed at regional level so location_id here refers to a GCP region; however, users may choose which specific zone (or collection of zones for cross-zone instances) an instance should be provisioned in. Refer to location_id and alternative_location_id fields for more details.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Info per node.
     * 
    */
    public List<NodeInfoResponse> getNodes() {
        return this.nodes;
    }
    /**
     * Optional. Persistence configuration parameters
     * 
    */
    public PersistenceConfigResponse getPersistenceConfig() {
        return this.persistenceConfig;
    }
    /**
     * Cloud IAM identity used by import / export operations to transfer data to/from Cloud Storage. Format is "serviceAccount:". The value may change over time for a given instance so should be checked before each import/export operation.
     * 
    */
    public String getPersistenceIamIdentity() {
        return this.persistenceIamIdentity;
    }
    /**
     * The port number of the exposed Redis endpoint.
     * 
    */
    public Integer getPort() {
        return this.port;
    }
    /**
     * Hostname or IP address of the exposed readonly Redis endpoint. Standard tier only. Targets all healthy replica nodes in instance. Replication is asynchronous and replica nodes will exhibit some lag behind the primary. Write requests must target 'host'.
     * 
    */
    public String getReadEndpoint() {
        return this.readEndpoint;
    }
    /**
     * The port number of the exposed readonly redis endpoint. Standard tier only. Write requests should target 'port'.
     * 
    */
    public Integer getReadEndpointPort() {
        return this.readEndpointPort;
    }
    /**
     * Optional. Read replica mode. Can only be specified when trying to create the instance.
     * 
    */
    public String getReadReplicasMode() {
        return this.readReplicasMode;
    }
    /**
     * Optional. Redis configuration parameters, according to http://redis.io/topics/config. Currently, the only supported parameters are: Redis version 3.2 and newer: * maxmemory-policy * notify-keyspace-events Redis version 4.0 and newer: * activedefrag * lfu-decay-time * lfu-log-factor * maxmemory-gb Redis version 5.0 and newer: * stream-node-max-bytes * stream-node-max-entries
     * 
    */
    public Map<String,String> getRedisConfigs() {
        return this.redisConfigs;
    }
    /**
     * Optional. The version of Redis software. If not provided, latest supported version will be used. Currently, the supported values are: * `REDIS_3_2` for Redis 3.2 compatibility * `REDIS_4_0` for Redis 4.0 compatibility (default) * `REDIS_5_0` for Redis 5.0 compatibility * `REDIS_6_X` for Redis 6.x compatibility
     * 
    */
    public String getRedisVersion() {
        return this.redisVersion;
    }
    /**
     * Optional. The number of replica nodes. The valid range for the Standard Tier with read replicas enabled is [1-5] and defaults to 2. If read replicas are not enabled for a Standard Tier instance, the only valid value is 1 and the default is 1. The valid value for basic tier is 0 and the default is also 0.
     * 
    */
    public Integer getReplicaCount() {
        return this.replicaCount;
    }
    /**
     * Optional. For DIRECT_PEERING mode, the CIDR range of internal addresses that are reserved for this instance. Range must be unique and non-overlapping with existing subnets in an authorized network. For PRIVATE_SERVICE_ACCESS mode, the name of one allocated IP address ranges associated with this private service access connection. If not provided, the service will choose an unused /29 block, for example, 10.0.0.0/29 or 192.168.0.0/29. For READ_REPLICAS_ENABLED the default block size is /28.
     * 
    */
    public String getReservedIpRange() {
        return this.reservedIpRange;
    }
    /**
     * Optional. Additional ip ranges for node placement, beyond those specified in reserved_ip_range. At most 1 secondary IP range is supported. The mask value must not exceed /28. Not supported for BASIC tier. Updates can only add new ranges, once added ranges cannot be changed or deleted. Values in this list cannot overlap with the reserved_ip_range. Not supported during instance creation.
     * 
    */
    public String getSecondaryIpRange() {
        return this.secondaryIpRange;
    }
    /**
     * List of server CA certificates for the instance.
     * 
    */
    public List<TlsCertificateResponse> getServerCaCerts() {
        return this.serverCaCerts;
    }
    /**
     * The current state of this instance.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * Additional information about the current status of this instance, if available.
     * 
    */
    public String getStatusMessage() {
        return this.statusMessage;
    }
    /**
     * The service tier of the instance.
     * 
    */
    public String getTier() {
        return this.tier;
    }
    /**
     * Optional. The TLS mode of the Redis instance. If not provided, TLS is disabled for the instance.
     * 
    */
    public String getTransitEncryptionMode() {
        return this.transitEncryptionMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String alternativeLocationId;
        private Boolean authEnabled;
        private String authorizedNetwork;
        private String connectMode;
        private String createTime;
        private String currentLocationId;
        private String displayName;
        private String host;
        private Map<String,String> labels;
        private String location;
        private MaintenancePolicyResponse maintenancePolicy;
        private MaintenanceScheduleResponse maintenanceSchedule;
        private Integer memorySizeGb;
        private String name;
        private List<NodeInfoResponse> nodes;
        private PersistenceConfigResponse persistenceConfig;
        private String persistenceIamIdentity;
        private Integer port;
        private String readEndpoint;
        private Integer readEndpointPort;
        private String readReplicasMode;
        private Map<String,String> redisConfigs;
        private String redisVersion;
        private Integer replicaCount;
        private String reservedIpRange;
        private String secondaryIpRange;
        private List<TlsCertificateResponse> serverCaCerts;
        private String state;
        private String statusMessage;
        private String tier;
        private String transitEncryptionMode;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alternativeLocationId = defaults.alternativeLocationId;
    	      this.authEnabled = defaults.authEnabled;
    	      this.authorizedNetwork = defaults.authorizedNetwork;
    	      this.connectMode = defaults.connectMode;
    	      this.createTime = defaults.createTime;
    	      this.currentLocationId = defaults.currentLocationId;
    	      this.displayName = defaults.displayName;
    	      this.host = defaults.host;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.maintenancePolicy = defaults.maintenancePolicy;
    	      this.maintenanceSchedule = defaults.maintenanceSchedule;
    	      this.memorySizeGb = defaults.memorySizeGb;
    	      this.name = defaults.name;
    	      this.nodes = defaults.nodes;
    	      this.persistenceConfig = defaults.persistenceConfig;
    	      this.persistenceIamIdentity = defaults.persistenceIamIdentity;
    	      this.port = defaults.port;
    	      this.readEndpoint = defaults.readEndpoint;
    	      this.readEndpointPort = defaults.readEndpointPort;
    	      this.readReplicasMode = defaults.readReplicasMode;
    	      this.redisConfigs = defaults.redisConfigs;
    	      this.redisVersion = defaults.redisVersion;
    	      this.replicaCount = defaults.replicaCount;
    	      this.reservedIpRange = defaults.reservedIpRange;
    	      this.secondaryIpRange = defaults.secondaryIpRange;
    	      this.serverCaCerts = defaults.serverCaCerts;
    	      this.state = defaults.state;
    	      this.statusMessage = defaults.statusMessage;
    	      this.tier = defaults.tier;
    	      this.transitEncryptionMode = defaults.transitEncryptionMode;
        }

        public Builder alternativeLocationId(String alternativeLocationId) {
            this.alternativeLocationId = Objects.requireNonNull(alternativeLocationId);
            return this;
        }
        public Builder authEnabled(Boolean authEnabled) {
            this.authEnabled = Objects.requireNonNull(authEnabled);
            return this;
        }
        public Builder authorizedNetwork(String authorizedNetwork) {
            this.authorizedNetwork = Objects.requireNonNull(authorizedNetwork);
            return this;
        }
        public Builder connectMode(String connectMode) {
            this.connectMode = Objects.requireNonNull(connectMode);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder currentLocationId(String currentLocationId) {
            this.currentLocationId = Objects.requireNonNull(currentLocationId);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder host(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder maintenancePolicy(MaintenancePolicyResponse maintenancePolicy) {
            this.maintenancePolicy = Objects.requireNonNull(maintenancePolicy);
            return this;
        }
        public Builder maintenanceSchedule(MaintenanceScheduleResponse maintenanceSchedule) {
            this.maintenanceSchedule = Objects.requireNonNull(maintenanceSchedule);
            return this;
        }
        public Builder memorySizeGb(Integer memorySizeGb) {
            this.memorySizeGb = Objects.requireNonNull(memorySizeGb);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder nodes(List<NodeInfoResponse> nodes) {
            this.nodes = Objects.requireNonNull(nodes);
            return this;
        }
        public Builder nodes(NodeInfoResponse... nodes) {
            return nodes(List.of(nodes));
        }
        public Builder persistenceConfig(PersistenceConfigResponse persistenceConfig) {
            this.persistenceConfig = Objects.requireNonNull(persistenceConfig);
            return this;
        }
        public Builder persistenceIamIdentity(String persistenceIamIdentity) {
            this.persistenceIamIdentity = Objects.requireNonNull(persistenceIamIdentity);
            return this;
        }
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder readEndpoint(String readEndpoint) {
            this.readEndpoint = Objects.requireNonNull(readEndpoint);
            return this;
        }
        public Builder readEndpointPort(Integer readEndpointPort) {
            this.readEndpointPort = Objects.requireNonNull(readEndpointPort);
            return this;
        }
        public Builder readReplicasMode(String readReplicasMode) {
            this.readReplicasMode = Objects.requireNonNull(readReplicasMode);
            return this;
        }
        public Builder redisConfigs(Map<String,String> redisConfigs) {
            this.redisConfigs = Objects.requireNonNull(redisConfigs);
            return this;
        }
        public Builder redisVersion(String redisVersion) {
            this.redisVersion = Objects.requireNonNull(redisVersion);
            return this;
        }
        public Builder replicaCount(Integer replicaCount) {
            this.replicaCount = Objects.requireNonNull(replicaCount);
            return this;
        }
        public Builder reservedIpRange(String reservedIpRange) {
            this.reservedIpRange = Objects.requireNonNull(reservedIpRange);
            return this;
        }
        public Builder secondaryIpRange(String secondaryIpRange) {
            this.secondaryIpRange = Objects.requireNonNull(secondaryIpRange);
            return this;
        }
        public Builder serverCaCerts(List<TlsCertificateResponse> serverCaCerts) {
            this.serverCaCerts = Objects.requireNonNull(serverCaCerts);
            return this;
        }
        public Builder serverCaCerts(TlsCertificateResponse... serverCaCerts) {
            return serverCaCerts(List.of(serverCaCerts));
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder statusMessage(String statusMessage) {
            this.statusMessage = Objects.requireNonNull(statusMessage);
            return this;
        }
        public Builder tier(String tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }
        public Builder transitEncryptionMode(String transitEncryptionMode) {
            this.transitEncryptionMode = Objects.requireNonNull(transitEncryptionMode);
            return this;
        }        public GetInstanceResult build() {
            return new GetInstanceResult(alternativeLocationId, authEnabled, authorizedNetwork, connectMode, createTime, currentLocationId, displayName, host, labels, location, maintenancePolicy, maintenanceSchedule, memorySizeGb, name, nodes, persistenceConfig, persistenceIamIdentity, port, readEndpoint, readEndpointPort, readReplicasMode, redisConfigs, redisVersion, replicaCount, reservedIpRange, secondaryIpRange, serverCaCerts, state, statusMessage, tier, transitEncryptionMode);
        }
    }
}
