// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAppSlotConfigurationNamesArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAppSlotConfigurationNamesArgs Empty = new WebAppSlotConfigurationNamesArgs();

    /**
     * List of application settings names.
     * 
     */
    @InputImport(name="appSettingNames")
      private final @Nullable Input<List<String>> appSettingNames;

    public Input<List<String>> getAppSettingNames() {
        return this.appSettingNames == null ? Input.empty() : this.appSettingNames;
    }

    /**
     * List of external Azure storage account identifiers.
     * 
     */
    @InputImport(name="azureStorageConfigNames")
      private final @Nullable Input<List<String>> azureStorageConfigNames;

    public Input<List<String>> getAzureStorageConfigNames() {
        return this.azureStorageConfigNames == null ? Input.empty() : this.azureStorageConfigNames;
    }

    /**
     * List of connection string names.
     * 
     */
    @InputImport(name="connectionStringNames")
      private final @Nullable Input<List<String>> connectionStringNames;

    public Input<List<String>> getConnectionStringNames() {
        return this.connectionStringNames == null ? Input.empty() : this.connectionStringNames;
    }

    /**
     * Kind of resource.
     * 
     */
    @InputImport(name="kind")
      private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * Name of the app.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public WebAppSlotConfigurationNamesArgs(
        @Nullable Input<List<String>> appSettingNames,
        @Nullable Input<List<String>> azureStorageConfigNames,
        @Nullable Input<List<String>> connectionStringNames,
        @Nullable Input<String> kind,
        Input<String> name,
        Input<String> resourceGroupName) {
        this.appSettingNames = appSettingNames;
        this.azureStorageConfigNames = azureStorageConfigNames;
        this.connectionStringNames = connectionStringNames;
        this.kind = kind;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private WebAppSlotConfigurationNamesArgs() {
        this.appSettingNames = Input.empty();
        this.azureStorageConfigNames = Input.empty();
        this.connectionStringNames = Input.empty();
        this.kind = Input.empty();
        this.name = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAppSlotConfigurationNamesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> appSettingNames;
        private @Nullable Input<List<String>> azureStorageConfigNames;
        private @Nullable Input<List<String>> connectionStringNames;
        private @Nullable Input<String> kind;
        private Input<String> name;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAppSlotConfigurationNamesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appSettingNames = defaults.appSettingNames;
    	      this.azureStorageConfigNames = defaults.azureStorageConfigNames;
    	      this.connectionStringNames = defaults.connectionStringNames;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAppSettingNames(@Nullable Input<List<String>> appSettingNames) {
            this.appSettingNames = appSettingNames;
            return this;
        }

        public Builder setAppSettingNames(@Nullable List<String> appSettingNames) {
            this.appSettingNames = Input.ofNullable(appSettingNames);
            return this;
        }

        public Builder setAzureStorageConfigNames(@Nullable Input<List<String>> azureStorageConfigNames) {
            this.azureStorageConfigNames = azureStorageConfigNames;
            return this;
        }

        public Builder setAzureStorageConfigNames(@Nullable List<String> azureStorageConfigNames) {
            this.azureStorageConfigNames = Input.ofNullable(azureStorageConfigNames);
            return this;
        }

        public Builder setConnectionStringNames(@Nullable Input<List<String>> connectionStringNames) {
            this.connectionStringNames = connectionStringNames;
            return this;
        }

        public Builder setConnectionStringNames(@Nullable List<String> connectionStringNames) {
            this.connectionStringNames = Input.ofNullable(connectionStringNames);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
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
        public WebAppSlotConfigurationNamesArgs build() {
            return new WebAppSlotConfigurationNamesArgs(appSettingNames, azureStorageConfigNames, connectionStringNames, kind, name, resourceGroupName);
        }
    }
}
