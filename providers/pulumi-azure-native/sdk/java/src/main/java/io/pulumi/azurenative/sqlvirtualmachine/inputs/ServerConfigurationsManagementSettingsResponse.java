// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sqlvirtualmachine.inputs;

import io.pulumi.azurenative.sqlvirtualmachine.inputs.AdditionalFeaturesServerConfigurationsResponse;
import io.pulumi.azurenative.sqlvirtualmachine.inputs.SqlConnectivityUpdateSettingsResponse;
import io.pulumi.azurenative.sqlvirtualmachine.inputs.SqlStorageUpdateSettingsResponse;
import io.pulumi.azurenative.sqlvirtualmachine.inputs.SqlWorkloadTypeUpdateSettingsResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Set the connectivity, storage and workload settings.
 * 
 */
public final class ServerConfigurationsManagementSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServerConfigurationsManagementSettingsResponse Empty = new ServerConfigurationsManagementSettingsResponse();

    /**
     * Additional SQL feature settings.
     * 
     */
    @InputImport(name="additionalFeaturesServerConfigurations")
      private final @Nullable AdditionalFeaturesServerConfigurationsResponse additionalFeaturesServerConfigurations;

    public Optional<AdditionalFeaturesServerConfigurationsResponse> getAdditionalFeaturesServerConfigurations() {
        return this.additionalFeaturesServerConfigurations == null ? Optional.empty() : Optional.ofNullable(this.additionalFeaturesServerConfigurations);
    }

    /**
     * SQL connectivity type settings.
     * 
     */
    @InputImport(name="sqlConnectivityUpdateSettings")
      private final @Nullable SqlConnectivityUpdateSettingsResponse sqlConnectivityUpdateSettings;

    public Optional<SqlConnectivityUpdateSettingsResponse> getSqlConnectivityUpdateSettings() {
        return this.sqlConnectivityUpdateSettings == null ? Optional.empty() : Optional.ofNullable(this.sqlConnectivityUpdateSettings);
    }

    /**
     * SQL storage update settings.
     * 
     */
    @InputImport(name="sqlStorageUpdateSettings")
      private final @Nullable SqlStorageUpdateSettingsResponse sqlStorageUpdateSettings;

    public Optional<SqlStorageUpdateSettingsResponse> getSqlStorageUpdateSettings() {
        return this.sqlStorageUpdateSettings == null ? Optional.empty() : Optional.ofNullable(this.sqlStorageUpdateSettings);
    }

    /**
     * SQL workload type settings.
     * 
     */
    @InputImport(name="sqlWorkloadTypeUpdateSettings")
      private final @Nullable SqlWorkloadTypeUpdateSettingsResponse sqlWorkloadTypeUpdateSettings;

    public Optional<SqlWorkloadTypeUpdateSettingsResponse> getSqlWorkloadTypeUpdateSettings() {
        return this.sqlWorkloadTypeUpdateSettings == null ? Optional.empty() : Optional.ofNullable(this.sqlWorkloadTypeUpdateSettings);
    }

    public ServerConfigurationsManagementSettingsResponse(
        @Nullable AdditionalFeaturesServerConfigurationsResponse additionalFeaturesServerConfigurations,
        @Nullable SqlConnectivityUpdateSettingsResponse sqlConnectivityUpdateSettings,
        @Nullable SqlStorageUpdateSettingsResponse sqlStorageUpdateSettings,
        @Nullable SqlWorkloadTypeUpdateSettingsResponse sqlWorkloadTypeUpdateSettings) {
        this.additionalFeaturesServerConfigurations = additionalFeaturesServerConfigurations;
        this.sqlConnectivityUpdateSettings = sqlConnectivityUpdateSettings;
        this.sqlStorageUpdateSettings = sqlStorageUpdateSettings;
        this.sqlWorkloadTypeUpdateSettings = sqlWorkloadTypeUpdateSettings;
    }

    private ServerConfigurationsManagementSettingsResponse() {
        this.additionalFeaturesServerConfigurations = null;
        this.sqlConnectivityUpdateSettings = null;
        this.sqlStorageUpdateSettings = null;
        this.sqlWorkloadTypeUpdateSettings = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerConfigurationsManagementSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AdditionalFeaturesServerConfigurationsResponse additionalFeaturesServerConfigurations;
        private @Nullable SqlConnectivityUpdateSettingsResponse sqlConnectivityUpdateSettings;
        private @Nullable SqlStorageUpdateSettingsResponse sqlStorageUpdateSettings;
        private @Nullable SqlWorkloadTypeUpdateSettingsResponse sqlWorkloadTypeUpdateSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerConfigurationsManagementSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalFeaturesServerConfigurations = defaults.additionalFeaturesServerConfigurations;
    	      this.sqlConnectivityUpdateSettings = defaults.sqlConnectivityUpdateSettings;
    	      this.sqlStorageUpdateSettings = defaults.sqlStorageUpdateSettings;
    	      this.sqlWorkloadTypeUpdateSettings = defaults.sqlWorkloadTypeUpdateSettings;
        }

        public Builder setAdditionalFeaturesServerConfigurations(@Nullable AdditionalFeaturesServerConfigurationsResponse additionalFeaturesServerConfigurations) {
            this.additionalFeaturesServerConfigurations = additionalFeaturesServerConfigurations;
            return this;
        }

        public Builder setSqlConnectivityUpdateSettings(@Nullable SqlConnectivityUpdateSettingsResponse sqlConnectivityUpdateSettings) {
            this.sqlConnectivityUpdateSettings = sqlConnectivityUpdateSettings;
            return this;
        }

        public Builder setSqlStorageUpdateSettings(@Nullable SqlStorageUpdateSettingsResponse sqlStorageUpdateSettings) {
            this.sqlStorageUpdateSettings = sqlStorageUpdateSettings;
            return this;
        }

        public Builder setSqlWorkloadTypeUpdateSettings(@Nullable SqlWorkloadTypeUpdateSettingsResponse sqlWorkloadTypeUpdateSettings) {
            this.sqlWorkloadTypeUpdateSettings = sqlWorkloadTypeUpdateSettings;
            return this;
        }
        public ServerConfigurationsManagementSettingsResponse build() {
            return new ServerConfigurationsManagementSettingsResponse(additionalFeaturesServerConfigurations, sqlConnectivityUpdateSettings, sqlStorageUpdateSettings, sqlWorkloadTypeUpdateSettings);
        }
    }
}
