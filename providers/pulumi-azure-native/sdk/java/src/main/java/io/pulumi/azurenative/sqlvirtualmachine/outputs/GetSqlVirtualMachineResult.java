// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sqlvirtualmachine.outputs;

import io.pulumi.azurenative.sqlvirtualmachine.outputs.AutoBackupSettingsResponse;
import io.pulumi.azurenative.sqlvirtualmachine.outputs.AutoPatchingSettingsResponse;
import io.pulumi.azurenative.sqlvirtualmachine.outputs.KeyVaultCredentialSettingsResponse;
import io.pulumi.azurenative.sqlvirtualmachine.outputs.ResourceIdentityResponse;
import io.pulumi.azurenative.sqlvirtualmachine.outputs.ServerConfigurationsManagementSettingsResponse;
import io.pulumi.azurenative.sqlvirtualmachine.outputs.StorageConfigurationSettingsResponse;
import io.pulumi.azurenative.sqlvirtualmachine.outputs.WsfcDomainCredentialsResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSqlVirtualMachineResult {
    /**
     * Auto backup settings for SQL Server.
     * 
     */
    private final @Nullable AutoBackupSettingsResponse autoBackupSettings;
    /**
     * Auto patching settings for applying critical security updates to SQL virtual machine.
     * 
     */
    private final @Nullable AutoPatchingSettingsResponse autoPatchingSettings;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Azure Active Directory identity of the server.
     * 
     */
    private final @Nullable ResourceIdentityResponse identity;
    /**
     * Key vault credential settings.
     * 
     */
    private final @Nullable KeyVaultCredentialSettingsResponse keyVaultCredentialSettings;
    /**
     * Resource location.
     * 
     */
    private final String location;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Provisioning state to track the async operation status.
     * 
     */
    private final String provisioningState;
    /**
     * SQL Server configuration management settings.
     * 
     */
    private final @Nullable ServerConfigurationsManagementSettingsResponse serverConfigurationsManagementSettings;
    /**
     * SQL image offer. Examples include SQL2016-WS2016, SQL2017-WS2016.
     * 
     */
    private final @Nullable String sqlImageOffer;
    /**
     * SQL Server edition type.
     * 
     */
    private final @Nullable String sqlImageSku;
    /**
     * SQL Server Management type.
     * 
     */
    private final @Nullable String sqlManagement;
    /**
     * SQL Server license type.
     * 
     */
    private final @Nullable String sqlServerLicenseType;
    /**
     * ARM resource id of the SQL virtual machine group this SQL virtual machine is or will be part of.
     * 
     */
    private final @Nullable String sqlVirtualMachineGroupResourceId;
    /**
     * Storage Configuration Settings.
     * 
     */
    private final @Nullable StorageConfigurationSettingsResponse storageConfigurationSettings;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type.
     * 
     */
    private final String type;
    /**
     * ARM Resource id of underlying virtual machine created from SQL marketplace image.
     * 
     */
    private final @Nullable String virtualMachineResourceId;
    /**
     * Domain credentials for setting up Windows Server Failover Cluster for SQL availability group.
     * 
     */
    private final @Nullable WsfcDomainCredentialsResponse wsfcDomainCredentials;

    @CustomType.Constructor
    private GetSqlVirtualMachineResult(
        @CustomType.Parameter("autoBackupSettings") @Nullable AutoBackupSettingsResponse autoBackupSettings,
        @CustomType.Parameter("autoPatchingSettings") @Nullable AutoPatchingSettingsResponse autoPatchingSettings,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") @Nullable ResourceIdentityResponse identity,
        @CustomType.Parameter("keyVaultCredentialSettings") @Nullable KeyVaultCredentialSettingsResponse keyVaultCredentialSettings,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("serverConfigurationsManagementSettings") @Nullable ServerConfigurationsManagementSettingsResponse serverConfigurationsManagementSettings,
        @CustomType.Parameter("sqlImageOffer") @Nullable String sqlImageOffer,
        @CustomType.Parameter("sqlImageSku") @Nullable String sqlImageSku,
        @CustomType.Parameter("sqlManagement") @Nullable String sqlManagement,
        @CustomType.Parameter("sqlServerLicenseType") @Nullable String sqlServerLicenseType,
        @CustomType.Parameter("sqlVirtualMachineGroupResourceId") @Nullable String sqlVirtualMachineGroupResourceId,
        @CustomType.Parameter("storageConfigurationSettings") @Nullable StorageConfigurationSettingsResponse storageConfigurationSettings,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("virtualMachineResourceId") @Nullable String virtualMachineResourceId,
        @CustomType.Parameter("wsfcDomainCredentials") @Nullable WsfcDomainCredentialsResponse wsfcDomainCredentials) {
        this.autoBackupSettings = autoBackupSettings;
        this.autoPatchingSettings = autoPatchingSettings;
        this.id = id;
        this.identity = identity;
        this.keyVaultCredentialSettings = keyVaultCredentialSettings;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.serverConfigurationsManagementSettings = serverConfigurationsManagementSettings;
        this.sqlImageOffer = sqlImageOffer;
        this.sqlImageSku = sqlImageSku;
        this.sqlManagement = sqlManagement;
        this.sqlServerLicenseType = sqlServerLicenseType;
        this.sqlVirtualMachineGroupResourceId = sqlVirtualMachineGroupResourceId;
        this.storageConfigurationSettings = storageConfigurationSettings;
        this.tags = tags;
        this.type = type;
        this.virtualMachineResourceId = virtualMachineResourceId;
        this.wsfcDomainCredentials = wsfcDomainCredentials;
    }

    /**
     * Auto backup settings for SQL Server.
     * 
    */
    public Optional<AutoBackupSettingsResponse> getAutoBackupSettings() {
        return Optional.ofNullable(this.autoBackupSettings);
    }
    /**
     * Auto patching settings for applying critical security updates to SQL virtual machine.
     * 
    */
    public Optional<AutoPatchingSettingsResponse> getAutoPatchingSettings() {
        return Optional.ofNullable(this.autoPatchingSettings);
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Azure Active Directory identity of the server.
     * 
    */
    public Optional<ResourceIdentityResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * Key vault credential settings.
     * 
    */
    public Optional<KeyVaultCredentialSettingsResponse> getKeyVaultCredentialSettings() {
        return Optional.ofNullable(this.keyVaultCredentialSettings);
    }
    /**
     * Resource location.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Provisioning state to track the async operation status.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * SQL Server configuration management settings.
     * 
    */
    public Optional<ServerConfigurationsManagementSettingsResponse> getServerConfigurationsManagementSettings() {
        return Optional.ofNullable(this.serverConfigurationsManagementSettings);
    }
    /**
     * SQL image offer. Examples include SQL2016-WS2016, SQL2017-WS2016.
     * 
    */
    public Optional<String> getSqlImageOffer() {
        return Optional.ofNullable(this.sqlImageOffer);
    }
    /**
     * SQL Server edition type.
     * 
    */
    public Optional<String> getSqlImageSku() {
        return Optional.ofNullable(this.sqlImageSku);
    }
    /**
     * SQL Server Management type.
     * 
    */
    public Optional<String> getSqlManagement() {
        return Optional.ofNullable(this.sqlManagement);
    }
    /**
     * SQL Server license type.
     * 
    */
    public Optional<String> getSqlServerLicenseType() {
        return Optional.ofNullable(this.sqlServerLicenseType);
    }
    /**
     * ARM resource id of the SQL virtual machine group this SQL virtual machine is or will be part of.
     * 
    */
    public Optional<String> getSqlVirtualMachineGroupResourceId() {
        return Optional.ofNullable(this.sqlVirtualMachineGroupResourceId);
    }
    /**
     * Storage Configuration Settings.
     * 
    */
    public Optional<StorageConfigurationSettingsResponse> getStorageConfigurationSettings() {
        return Optional.ofNullable(this.storageConfigurationSettings);
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * ARM Resource id of underlying virtual machine created from SQL marketplace image.
     * 
    */
    public Optional<String> getVirtualMachineResourceId() {
        return Optional.ofNullable(this.virtualMachineResourceId);
    }
    /**
     * Domain credentials for setting up Windows Server Failover Cluster for SQL availability group.
     * 
    */
    public Optional<WsfcDomainCredentialsResponse> getWsfcDomainCredentials() {
        return Optional.ofNullable(this.wsfcDomainCredentials);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSqlVirtualMachineResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AutoBackupSettingsResponse autoBackupSettings;
        private @Nullable AutoPatchingSettingsResponse autoPatchingSettings;
        private String id;
        private @Nullable ResourceIdentityResponse identity;
        private @Nullable KeyVaultCredentialSettingsResponse keyVaultCredentialSettings;
        private String location;
        private String name;
        private String provisioningState;
        private @Nullable ServerConfigurationsManagementSettingsResponse serverConfigurationsManagementSettings;
        private @Nullable String sqlImageOffer;
        private @Nullable String sqlImageSku;
        private @Nullable String sqlManagement;
        private @Nullable String sqlServerLicenseType;
        private @Nullable String sqlVirtualMachineGroupResourceId;
        private @Nullable StorageConfigurationSettingsResponse storageConfigurationSettings;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable String virtualMachineResourceId;
        private @Nullable WsfcDomainCredentialsResponse wsfcDomainCredentials;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSqlVirtualMachineResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoBackupSettings = defaults.autoBackupSettings;
    	      this.autoPatchingSettings = defaults.autoPatchingSettings;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.keyVaultCredentialSettings = defaults.keyVaultCredentialSettings;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.serverConfigurationsManagementSettings = defaults.serverConfigurationsManagementSettings;
    	      this.sqlImageOffer = defaults.sqlImageOffer;
    	      this.sqlImageSku = defaults.sqlImageSku;
    	      this.sqlManagement = defaults.sqlManagement;
    	      this.sqlServerLicenseType = defaults.sqlServerLicenseType;
    	      this.sqlVirtualMachineGroupResourceId = defaults.sqlVirtualMachineGroupResourceId;
    	      this.storageConfigurationSettings = defaults.storageConfigurationSettings;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.virtualMachineResourceId = defaults.virtualMachineResourceId;
    	      this.wsfcDomainCredentials = defaults.wsfcDomainCredentials;
        }

        public Builder autoBackupSettings(@Nullable AutoBackupSettingsResponse autoBackupSettings) {
            this.autoBackupSettings = autoBackupSettings;
            return this;
        }
        public Builder autoPatchingSettings(@Nullable AutoPatchingSettingsResponse autoPatchingSettings) {
            this.autoPatchingSettings = autoPatchingSettings;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identity(@Nullable ResourceIdentityResponse identity) {
            this.identity = identity;
            return this;
        }
        public Builder keyVaultCredentialSettings(@Nullable KeyVaultCredentialSettingsResponse keyVaultCredentialSettings) {
            this.keyVaultCredentialSettings = keyVaultCredentialSettings;
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder serverConfigurationsManagementSettings(@Nullable ServerConfigurationsManagementSettingsResponse serverConfigurationsManagementSettings) {
            this.serverConfigurationsManagementSettings = serverConfigurationsManagementSettings;
            return this;
        }
        public Builder sqlImageOffer(@Nullable String sqlImageOffer) {
            this.sqlImageOffer = sqlImageOffer;
            return this;
        }
        public Builder sqlImageSku(@Nullable String sqlImageSku) {
            this.sqlImageSku = sqlImageSku;
            return this;
        }
        public Builder sqlManagement(@Nullable String sqlManagement) {
            this.sqlManagement = sqlManagement;
            return this;
        }
        public Builder sqlServerLicenseType(@Nullable String sqlServerLicenseType) {
            this.sqlServerLicenseType = sqlServerLicenseType;
            return this;
        }
        public Builder sqlVirtualMachineGroupResourceId(@Nullable String sqlVirtualMachineGroupResourceId) {
            this.sqlVirtualMachineGroupResourceId = sqlVirtualMachineGroupResourceId;
            return this;
        }
        public Builder storageConfigurationSettings(@Nullable StorageConfigurationSettingsResponse storageConfigurationSettings) {
            this.storageConfigurationSettings = storageConfigurationSettings;
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
        public Builder virtualMachineResourceId(@Nullable String virtualMachineResourceId) {
            this.virtualMachineResourceId = virtualMachineResourceId;
            return this;
        }
        public Builder wsfcDomainCredentials(@Nullable WsfcDomainCredentialsResponse wsfcDomainCredentials) {
            this.wsfcDomainCredentials = wsfcDomainCredentials;
            return this;
        }        public GetSqlVirtualMachineResult build() {
            return new GetSqlVirtualMachineResult(autoBackupSettings, autoPatchingSettings, id, identity, keyVaultCredentialSettings, location, name, provisioningState, serverConfigurationsManagementSettings, sqlImageOffer, sqlImageSku, sqlManagement, sqlServerLicenseType, sqlVirtualMachineGroupResourceId, storageConfigurationSettings, tags, type, virtualMachineResourceId, wsfcDomainCredentials);
        }
    }
}
