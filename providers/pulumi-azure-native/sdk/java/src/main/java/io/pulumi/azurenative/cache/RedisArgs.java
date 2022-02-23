// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache;

import io.pulumi.azurenative.cache.enums.PublicNetworkAccess;
import io.pulumi.azurenative.cache.enums.TlsVersion;
import io.pulumi.azurenative.cache.inputs.RedisCommonPropertiesRedisConfigurationArgs;
import io.pulumi.azurenative.cache.inputs.SkuArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RedisArgs extends io.pulumi.resources.ResourceArgs {

    public static final RedisArgs Empty = new RedisArgs();

    /**
     * Specifies whether the non-ssl Redis server port (6379) is enabled.
     * 
     */
    @InputImport(name="enableNonSslPort")
      private final @Nullable Input<Boolean> enableNonSslPort;

    public Input<Boolean> getEnableNonSslPort() {
        return this.enableNonSslPort == null ? Input.empty() : this.enableNonSslPort;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Optional: requires clients to use a specified TLS version (or higher) to connect (e,g, '1.0', '1.1', '1.2')
     * 
     */
    @InputImport(name="minimumTlsVersion")
      private final @Nullable Input<Either<String,TlsVersion>> minimumTlsVersion;

    public Input<Either<String,TlsVersion>> getMinimumTlsVersion() {
        return this.minimumTlsVersion == null ? Input.empty() : this.minimumTlsVersion;
    }

    /**
     * The name of the Redis cache.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Whether or not public endpoint access is allowed for this cache.  Value is optional but if passed in, must be 'Enabled' or 'Disabled'. If 'Disabled', private endpoints are the exclusive access method. Default value is 'Enabled'
     * 
     */
    @InputImport(name="publicNetworkAccess")
      private final @Nullable Input<Either<String,PublicNetworkAccess>> publicNetworkAccess;

    public Input<Either<String,PublicNetworkAccess>> getPublicNetworkAccess() {
        return this.publicNetworkAccess == null ? Input.empty() : this.publicNetworkAccess;
    }

    /**
     * All Redis Settings. Few possible keys: rdb-backup-enabled,rdb-storage-connection-string,rdb-backup-frequency,maxmemory-delta,maxmemory-policy,notify-keyspace-events,maxmemory-samples,slowlog-log-slower-than,slowlog-max-len,list-max-ziplist-entries,list-max-ziplist-value,hash-max-ziplist-entries,hash-max-ziplist-value,set-max-intset-entries,zset-max-ziplist-entries,zset-max-ziplist-value etc.
     * 
     */
    @InputImport(name="redisConfiguration")
      private final @Nullable Input<RedisCommonPropertiesRedisConfigurationArgs> redisConfiguration;

    public Input<RedisCommonPropertiesRedisConfigurationArgs> getRedisConfiguration() {
        return this.redisConfiguration == null ? Input.empty() : this.redisConfiguration;
    }

    /**
     * The number of replicas to be created per master.
     * 
     */
    @InputImport(name="replicasPerMaster")
      private final @Nullable Input<Integer> replicasPerMaster;

    public Input<Integer> getReplicasPerMaster() {
        return this.replicasPerMaster == null ? Input.empty() : this.replicasPerMaster;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The number of shards to be created on a Premium Cluster Cache.
     * 
     */
    @InputImport(name="shardCount")
      private final @Nullable Input<Integer> shardCount;

    public Input<Integer> getShardCount() {
        return this.shardCount == null ? Input.empty() : this.shardCount;
    }

    /**
     * The SKU of the Redis cache to deploy.
     * 
     */
    @InputImport(name="sku", required=true)
      private final Input<SkuArgs> sku;

    public Input<SkuArgs> getSku() {
        return this.sku;
    }

    /**
     * Static IP address. Optionally, may be specified when deploying a Redis cache inside an existing Azure Virtual Network; auto assigned by default.
     * 
     */
    @InputImport(name="staticIP")
      private final @Nullable Input<String> staticIP;

    public Input<String> getStaticIP() {
        return this.staticIP == null ? Input.empty() : this.staticIP;
    }

    /**
     * The full resource ID of a subnet in a virtual network to deploy the Redis cache in. Example format: /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/Microsoft.{Network|ClassicNetwork}/VirtualNetworks/vnet1/subnets/subnet1
     * 
     */
    @InputImport(name="subnetId")
      private final @Nullable Input<String> subnetId;

    public Input<String> getSubnetId() {
        return this.subnetId == null ? Input.empty() : this.subnetId;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A dictionary of tenant settings
     * 
     */
    @InputImport(name="tenantSettings")
      private final @Nullable Input<Map<String,String>> tenantSettings;

    public Input<Map<String,String>> getTenantSettings() {
        return this.tenantSettings == null ? Input.empty() : this.tenantSettings;
    }

    /**
     * A list of availability zones denoting where the resource needs to come from.
     * 
     */
    @InputImport(name="zones")
      private final @Nullable Input<List<String>> zones;

    public Input<List<String>> getZones() {
        return this.zones == null ? Input.empty() : this.zones;
    }

    public RedisArgs(
        @Nullable Input<Boolean> enableNonSslPort,
        @Nullable Input<String> location,
        @Nullable Input<Either<String,TlsVersion>> minimumTlsVersion,
        @Nullable Input<String> name,
        @Nullable Input<Either<String,PublicNetworkAccess>> publicNetworkAccess,
        @Nullable Input<RedisCommonPropertiesRedisConfigurationArgs> redisConfiguration,
        @Nullable Input<Integer> replicasPerMaster,
        Input<String> resourceGroupName,
        @Nullable Input<Integer> shardCount,
        Input<SkuArgs> sku,
        @Nullable Input<String> staticIP,
        @Nullable Input<String> subnetId,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tenantSettings,
        @Nullable Input<List<String>> zones) {
        this.enableNonSslPort = enableNonSslPort == null ? Input.ofNullable(false) : enableNonSslPort;
        this.location = location;
        this.minimumTlsVersion = minimumTlsVersion;
        this.name = name;
        this.publicNetworkAccess = publicNetworkAccess == null ? Input.ofLeft("Enabled") : publicNetworkAccess;
        this.redisConfiguration = redisConfiguration;
        this.replicasPerMaster = replicasPerMaster;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.shardCount = shardCount;
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
        this.staticIP = staticIP;
        this.subnetId = subnetId;
        this.tags = tags;
        this.tenantSettings = tenantSettings;
        this.zones = zones;
    }

    private RedisArgs() {
        this.enableNonSslPort = Input.empty();
        this.location = Input.empty();
        this.minimumTlsVersion = Input.empty();
        this.name = Input.empty();
        this.publicNetworkAccess = Input.empty();
        this.redisConfiguration = Input.empty();
        this.replicasPerMaster = Input.empty();
        this.resourceGroupName = Input.empty();
        this.shardCount = Input.empty();
        this.sku = Input.empty();
        this.staticIP = Input.empty();
        this.subnetId = Input.empty();
        this.tags = Input.empty();
        this.tenantSettings = Input.empty();
        this.zones = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RedisArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enableNonSslPort;
        private @Nullable Input<String> location;
        private @Nullable Input<Either<String,TlsVersion>> minimumTlsVersion;
        private @Nullable Input<String> name;
        private @Nullable Input<Either<String,PublicNetworkAccess>> publicNetworkAccess;
        private @Nullable Input<RedisCommonPropertiesRedisConfigurationArgs> redisConfiguration;
        private @Nullable Input<Integer> replicasPerMaster;
        private Input<String> resourceGroupName;
        private @Nullable Input<Integer> shardCount;
        private Input<SkuArgs> sku;
        private @Nullable Input<String> staticIP;
        private @Nullable Input<String> subnetId;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tenantSettings;
        private @Nullable Input<List<String>> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(RedisArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableNonSslPort = defaults.enableNonSslPort;
    	      this.location = defaults.location;
    	      this.minimumTlsVersion = defaults.minimumTlsVersion;
    	      this.name = defaults.name;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.redisConfiguration = defaults.redisConfiguration;
    	      this.replicasPerMaster = defaults.replicasPerMaster;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.shardCount = defaults.shardCount;
    	      this.sku = defaults.sku;
    	      this.staticIP = defaults.staticIP;
    	      this.subnetId = defaults.subnetId;
    	      this.tags = defaults.tags;
    	      this.tenantSettings = defaults.tenantSettings;
    	      this.zones = defaults.zones;
        }

        public Builder setEnableNonSslPort(@Nullable Input<Boolean> enableNonSslPort) {
            this.enableNonSslPort = enableNonSslPort;
            return this;
        }

        public Builder setEnableNonSslPort(@Nullable Boolean enableNonSslPort) {
            this.enableNonSslPort = Input.ofNullable(enableNonSslPort);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setMinimumTlsVersion(@Nullable Input<Either<String,TlsVersion>> minimumTlsVersion) {
            this.minimumTlsVersion = minimumTlsVersion;
            return this;
        }

        public Builder setMinimumTlsVersion(@Nullable Either<String,TlsVersion> minimumTlsVersion) {
            this.minimumTlsVersion = Input.ofNullable(minimumTlsVersion);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable Input<Either<String,PublicNetworkAccess>> publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable Either<String,PublicNetworkAccess> publicNetworkAccess) {
            this.publicNetworkAccess = Input.ofNullable(publicNetworkAccess);
            return this;
        }

        public Builder setRedisConfiguration(@Nullable Input<RedisCommonPropertiesRedisConfigurationArgs> redisConfiguration) {
            this.redisConfiguration = redisConfiguration;
            return this;
        }

        public Builder setRedisConfiguration(@Nullable RedisCommonPropertiesRedisConfigurationArgs redisConfiguration) {
            this.redisConfiguration = Input.ofNullable(redisConfiguration);
            return this;
        }

        public Builder setReplicasPerMaster(@Nullable Input<Integer> replicasPerMaster) {
            this.replicasPerMaster = replicasPerMaster;
            return this;
        }

        public Builder setReplicasPerMaster(@Nullable Integer replicasPerMaster) {
            this.replicasPerMaster = Input.ofNullable(replicasPerMaster);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setShardCount(@Nullable Input<Integer> shardCount) {
            this.shardCount = shardCount;
            return this;
        }

        public Builder setShardCount(@Nullable Integer shardCount) {
            this.shardCount = Input.ofNullable(shardCount);
            return this;
        }

        public Builder setSku(Input<SkuArgs> sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder setSku(SkuArgs sku) {
            this.sku = Input.of(Objects.requireNonNull(sku));
            return this;
        }

        public Builder setStaticIP(@Nullable Input<String> staticIP) {
            this.staticIP = staticIP;
            return this;
        }

        public Builder setStaticIP(@Nullable String staticIP) {
            this.staticIP = Input.ofNullable(staticIP);
            return this;
        }

        public Builder setSubnetId(@Nullable Input<String> subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public Builder setSubnetId(@Nullable String subnetId) {
            this.subnetId = Input.ofNullable(subnetId);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTenantSettings(@Nullable Input<Map<String,String>> tenantSettings) {
            this.tenantSettings = tenantSettings;
            return this;
        }

        public Builder setTenantSettings(@Nullable Map<String,String> tenantSettings) {
            this.tenantSettings = Input.ofNullable(tenantSettings);
            return this;
        }

        public Builder setZones(@Nullable Input<List<String>> zones) {
            this.zones = zones;
            return this;
        }

        public Builder setZones(@Nullable List<String> zones) {
            this.zones = Input.ofNullable(zones);
            return this;
        }
        public RedisArgs build() {
            return new RedisArgs(enableNonSslPort, location, minimumTlsVersion, name, publicNetworkAccess, redisConfiguration, replicasPerMaster, resourceGroupName, shardCount, sku, staticIP, subnetId, tags, tenantSettings, zones);
        }
    }
}
