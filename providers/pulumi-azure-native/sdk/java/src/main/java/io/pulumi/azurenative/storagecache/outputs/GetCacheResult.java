// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.outputs;

import io.pulumi.azurenative.storagecache.outputs.CacheDirectorySettingsResponse;
import io.pulumi.azurenative.storagecache.outputs.CacheEncryptionSettingsResponse;
import io.pulumi.azurenative.storagecache.outputs.CacheHealthResponse;
import io.pulumi.azurenative.storagecache.outputs.CacheIdentityResponse;
import io.pulumi.azurenative.storagecache.outputs.CacheNetworkSettingsResponse;
import io.pulumi.azurenative.storagecache.outputs.CacheResponseSku;
import io.pulumi.azurenative.storagecache.outputs.CacheSecuritySettingsResponse;
import io.pulumi.azurenative.storagecache.outputs.CacheUpgradeStatusResponse;
import io.pulumi.azurenative.storagecache.outputs.SystemDataResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCacheResult {
    /**
     * The size of this Cache, in GB.
     * 
     */
    private final @Nullable Integer cacheSizeGB;
    /**
     * Specifies Directory Services settings of the cache.
     * 
     */
    private final @Nullable CacheDirectorySettingsResponse directoryServicesSettings;
    /**
     * Specifies encryption settings of the cache.
     * 
     */
    private final @Nullable CacheEncryptionSettingsResponse encryptionSettings;
    /**
     * Health of the Cache.
     * 
     */
    private final CacheHealthResponse health;
    /**
     * Resource ID of the Cache.
     * 
     */
    private final String id;
    /**
     * The identity of the cache, if configured.
     * 
     */
    private final @Nullable CacheIdentityResponse identity;
    /**
     * Region name string.
     * 
     */
    private final @Nullable String location;
    /**
     * Array of IP addresses that can be used by clients mounting this Cache.
     * 
     */
    private final List<String> mountAddresses;
    /**
     * Name of Cache.
     * 
     */
    private final String name;
    /**
     * Specifies network settings of the cache.
     * 
     */
    private final @Nullable CacheNetworkSettingsResponse networkSettings;
    /**
     * ARM provisioning state, see https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/Addendum.md#provisioningstate-property
     * 
     */
    private final @Nullable String provisioningState;
    /**
     * Specifies security settings of the cache.
     * 
     */
    private final @Nullable CacheSecuritySettingsResponse securitySettings;
    /**
     * SKU for the Cache.
     * 
     */
    private final @Nullable CacheResponseSku sku;
    /**
     * Subnet used for the Cache.
     * 
     */
    private final @Nullable String subnet;
    /**
     * The system meta data relating to this resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Type of the Cache; Microsoft.StorageCache/Cache
     * 
     */
    private final String type;
    /**
     * Upgrade status of the Cache.
     * 
     */
    private final @Nullable CacheUpgradeStatusResponse upgradeStatus;

    @CustomType.Constructor
    private GetCacheResult(
        @CustomType.Parameter("cacheSizeGB") @Nullable Integer cacheSizeGB,
        @CustomType.Parameter("directoryServicesSettings") @Nullable CacheDirectorySettingsResponse directoryServicesSettings,
        @CustomType.Parameter("encryptionSettings") @Nullable CacheEncryptionSettingsResponse encryptionSettings,
        @CustomType.Parameter("health") CacheHealthResponse health,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") @Nullable CacheIdentityResponse identity,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("mountAddresses") List<String> mountAddresses,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("networkSettings") @Nullable CacheNetworkSettingsResponse networkSettings,
        @CustomType.Parameter("provisioningState") @Nullable String provisioningState,
        @CustomType.Parameter("securitySettings") @Nullable CacheSecuritySettingsResponse securitySettings,
        @CustomType.Parameter("sku") @Nullable CacheResponseSku sku,
        @CustomType.Parameter("subnet") @Nullable String subnet,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("upgradeStatus") @Nullable CacheUpgradeStatusResponse upgradeStatus) {
        this.cacheSizeGB = cacheSizeGB;
        this.directoryServicesSettings = directoryServicesSettings;
        this.encryptionSettings = encryptionSettings;
        this.health = health;
        this.id = id;
        this.identity = identity;
        this.location = location;
        this.mountAddresses = mountAddresses;
        this.name = name;
        this.networkSettings = networkSettings;
        this.provisioningState = provisioningState;
        this.securitySettings = securitySettings;
        this.sku = sku;
        this.subnet = subnet;
        this.systemData = systemData;
        this.tags = tags;
        this.type = type;
        this.upgradeStatus = upgradeStatus;
    }

    /**
     * The size of this Cache, in GB.
     * 
    */
    public Optional<Integer> getCacheSizeGB() {
        return Optional.ofNullable(this.cacheSizeGB);
    }
    /**
     * Specifies Directory Services settings of the cache.
     * 
    */
    public Optional<CacheDirectorySettingsResponse> getDirectoryServicesSettings() {
        return Optional.ofNullable(this.directoryServicesSettings);
    }
    /**
     * Specifies encryption settings of the cache.
     * 
    */
    public Optional<CacheEncryptionSettingsResponse> getEncryptionSettings() {
        return Optional.ofNullable(this.encryptionSettings);
    }
    /**
     * Health of the Cache.
     * 
    */
    public CacheHealthResponse getHealth() {
        return this.health;
    }
    /**
     * Resource ID of the Cache.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The identity of the cache, if configured.
     * 
    */
    public Optional<CacheIdentityResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * Region name string.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Array of IP addresses that can be used by clients mounting this Cache.
     * 
    */
    public List<String> getMountAddresses() {
        return this.mountAddresses;
    }
    /**
     * Name of Cache.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Specifies network settings of the cache.
     * 
    */
    public Optional<CacheNetworkSettingsResponse> getNetworkSettings() {
        return Optional.ofNullable(this.networkSettings);
    }
    /**
     * ARM provisioning state, see https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/Addendum.md#provisioningstate-property
     * 
    */
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    /**
     * Specifies security settings of the cache.
     * 
    */
    public Optional<CacheSecuritySettingsResponse> getSecuritySettings() {
        return Optional.ofNullable(this.securitySettings);
    }
    /**
     * SKU for the Cache.
     * 
    */
    public Optional<CacheResponseSku> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * Subnet used for the Cache.
     * 
    */
    public Optional<String> getSubnet() {
        return Optional.ofNullable(this.subnet);
    }
    /**
     * The system meta data relating to this resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Type of the Cache; Microsoft.StorageCache/Cache
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Upgrade status of the Cache.
     * 
    */
    public Optional<CacheUpgradeStatusResponse> getUpgradeStatus() {
        return Optional.ofNullable(this.upgradeStatus);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCacheResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer cacheSizeGB;
        private @Nullable CacheDirectorySettingsResponse directoryServicesSettings;
        private @Nullable CacheEncryptionSettingsResponse encryptionSettings;
        private CacheHealthResponse health;
        private String id;
        private @Nullable CacheIdentityResponse identity;
        private @Nullable String location;
        private List<String> mountAddresses;
        private String name;
        private @Nullable CacheNetworkSettingsResponse networkSettings;
        private @Nullable String provisioningState;
        private @Nullable CacheSecuritySettingsResponse securitySettings;
        private @Nullable CacheResponseSku sku;
        private @Nullable String subnet;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable CacheUpgradeStatusResponse upgradeStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCacheResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheSizeGB = defaults.cacheSizeGB;
    	      this.directoryServicesSettings = defaults.directoryServicesSettings;
    	      this.encryptionSettings = defaults.encryptionSettings;
    	      this.health = defaults.health;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.mountAddresses = defaults.mountAddresses;
    	      this.name = defaults.name;
    	      this.networkSettings = defaults.networkSettings;
    	      this.provisioningState = defaults.provisioningState;
    	      this.securitySettings = defaults.securitySettings;
    	      this.sku = defaults.sku;
    	      this.subnet = defaults.subnet;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.upgradeStatus = defaults.upgradeStatus;
        }

        public Builder cacheSizeGB(@Nullable Integer cacheSizeGB) {
            this.cacheSizeGB = cacheSizeGB;
            return this;
        }
        public Builder directoryServicesSettings(@Nullable CacheDirectorySettingsResponse directoryServicesSettings) {
            this.directoryServicesSettings = directoryServicesSettings;
            return this;
        }
        public Builder encryptionSettings(@Nullable CacheEncryptionSettingsResponse encryptionSettings) {
            this.encryptionSettings = encryptionSettings;
            return this;
        }
        public Builder health(CacheHealthResponse health) {
            this.health = Objects.requireNonNull(health);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identity(@Nullable CacheIdentityResponse identity) {
            this.identity = identity;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder mountAddresses(List<String> mountAddresses) {
            this.mountAddresses = Objects.requireNonNull(mountAddresses);
            return this;
        }
        public Builder mountAddresses(String... mountAddresses) {
            return mountAddresses(List.of(mountAddresses));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder networkSettings(@Nullable CacheNetworkSettingsResponse networkSettings) {
            this.networkSettings = networkSettings;
            return this;
        }
        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }
        public Builder securitySettings(@Nullable CacheSecuritySettingsResponse securitySettings) {
            this.securitySettings = securitySettings;
            return this;
        }
        public Builder sku(@Nullable CacheResponseSku sku) {
            this.sku = sku;
            return this;
        }
        public Builder subnet(@Nullable String subnet) {
            this.subnet = subnet;
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder upgradeStatus(@Nullable CacheUpgradeStatusResponse upgradeStatus) {
            this.upgradeStatus = upgradeStatus;
            return this;
        }        public GetCacheResult build() {
            return new GetCacheResult(cacheSizeGB, directoryServicesSettings, encryptionSettings, health, id, identity, location, mountAddresses, name, networkSettings, provisioningState, securitySettings, sku, subnet, systemData, tags, type, upgradeStatus);
        }
    }
}
