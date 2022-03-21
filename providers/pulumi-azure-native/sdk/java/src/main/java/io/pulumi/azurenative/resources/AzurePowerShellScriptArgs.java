// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources;

import io.pulumi.azurenative.resources.enums.CleanupOptions;
import io.pulumi.azurenative.resources.inputs.ContainerConfigurationArgs;
import io.pulumi.azurenative.resources.inputs.EnvironmentVariableArgs;
import io.pulumi.azurenative.resources.inputs.ManagedServiceIdentityArgs;
import io.pulumi.azurenative.resources.inputs.StorageAccountConfigurationArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AzurePowerShellScriptArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzurePowerShellScriptArgs Empty = new AzurePowerShellScriptArgs();

    /**
     * Command line arguments to pass to the script. Arguments are separated by spaces. ex: -Name blue* -Location 'West US 2'
     * 
     */
    @Import(name="arguments")
      private final @Nullable Output<String> arguments;

    public Output<String> getArguments() {
        return this.arguments == null ? Output.empty() : this.arguments;
    }

    /**
     * Azure PowerShell module version to be used.
     * 
     */
    @Import(name="azPowerShellVersion", required=true)
      private final Output<String> azPowerShellVersion;

    public Output<String> getAzPowerShellVersion() {
        return this.azPowerShellVersion;
    }

    /**
     * The clean up preference when the script execution gets in a terminal state. Default setting is 'Always'.
     * 
     */
    @Import(name="cleanupPreference")
      private final @Nullable Output<Either<String,CleanupOptions>> cleanupPreference;

    public Output<Either<String,CleanupOptions>> getCleanupPreference() {
        return this.cleanupPreference == null ? Output.empty() : this.cleanupPreference;
    }

    /**
     * Container settings.
     * 
     */
    @Import(name="containerSettings")
      private final @Nullable Output<ContainerConfigurationArgs> containerSettings;

    public Output<ContainerConfigurationArgs> getContainerSettings() {
        return this.containerSettings == null ? Output.empty() : this.containerSettings;
    }

    /**
     * The environment variables to pass over to the script.
     * 
     */
    @Import(name="environmentVariables")
      private final @Nullable Output<List<EnvironmentVariableArgs>> environmentVariables;

    public Output<List<EnvironmentVariableArgs>> getEnvironmentVariables() {
        return this.environmentVariables == null ? Output.empty() : this.environmentVariables;
    }

    /**
     * Gets or sets how the deployment script should be forced to execute even if the script resource has not changed. Can be current time stamp or a GUID.
     * 
     */
    @Import(name="forceUpdateTag")
      private final @Nullable Output<String> forceUpdateTag;

    public Output<String> getForceUpdateTag() {
        return this.forceUpdateTag == null ? Output.empty() : this.forceUpdateTag;
    }

    /**
     * Optional property. Managed identity to be used for this deployment script. Currently, only user-assigned MSI is supported.
     * 
     */
    @Import(name="identity")
      private final @Nullable Output<ManagedServiceIdentityArgs> identity;

    public Output<ManagedServiceIdentityArgs> getIdentity() {
        return this.identity == null ? Output.empty() : this.identity;
    }

    /**
     * Type of the script.
     * Expected value is 'AzurePowerShell'.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }

    /**
     * The location of the ACI and the storage account for the deployment script.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Uri for the script. This is the entry point for the external script.
     * 
     */
    @Import(name="primaryScriptUri")
      private final @Nullable Output<String> primaryScriptUri;

    public Output<String> getPrimaryScriptUri() {
        return this.primaryScriptUri == null ? Output.empty() : this.primaryScriptUri;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Interval for which the service retains the script resource after it reaches a terminal state. Resource will be deleted when this duration expires. Duration is based on ISO 8601 pattern (for example P1D means one day).
     * 
     */
    @Import(name="retentionInterval", required=true)
      private final Output<String> retentionInterval;

    public Output<String> getRetentionInterval() {
        return this.retentionInterval;
    }

    /**
     * Script body.
     * 
     */
    @Import(name="scriptContent")
      private final @Nullable Output<String> scriptContent;

    public Output<String> getScriptContent() {
        return this.scriptContent == null ? Output.empty() : this.scriptContent;
    }

    /**
     * Name of the deployment script.
     * 
     */
    @Import(name="scriptName")
      private final @Nullable Output<String> scriptName;

    public Output<String> getScriptName() {
        return this.scriptName == null ? Output.empty() : this.scriptName;
    }

    /**
     * Storage Account settings.
     * 
     */
    @Import(name="storageAccountSettings")
      private final @Nullable Output<StorageAccountConfigurationArgs> storageAccountSettings;

    public Output<StorageAccountConfigurationArgs> getStorageAccountSettings() {
        return this.storageAccountSettings == null ? Output.empty() : this.storageAccountSettings;
    }

    /**
     * Supporting files for the external script.
     * 
     */
    @Import(name="supportingScriptUris")
      private final @Nullable Output<List<String>> supportingScriptUris;

    public Output<List<String>> getSupportingScriptUris() {
        return this.supportingScriptUris == null ? Output.empty() : this.supportingScriptUris;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * Maximum allowed script execution time specified in ISO 8601 format. Default value is P1D
     * 
     */
    @Import(name="timeout")
      private final @Nullable Output<String> timeout;

    public Output<String> getTimeout() {
        return this.timeout == null ? Output.empty() : this.timeout;
    }

    public AzurePowerShellScriptArgs(
        @Nullable Output<String> arguments,
        Output<String> azPowerShellVersion,
        @Nullable Output<Either<String,CleanupOptions>> cleanupPreference,
        @Nullable Output<ContainerConfigurationArgs> containerSettings,
        @Nullable Output<List<EnvironmentVariableArgs>> environmentVariables,
        @Nullable Output<String> forceUpdateTag,
        @Nullable Output<ManagedServiceIdentityArgs> identity,
        Output<String> kind,
        @Nullable Output<String> location,
        @Nullable Output<String> primaryScriptUri,
        Output<String> resourceGroupName,
        Output<String> retentionInterval,
        @Nullable Output<String> scriptContent,
        @Nullable Output<String> scriptName,
        @Nullable Output<StorageAccountConfigurationArgs> storageAccountSettings,
        @Nullable Output<List<String>> supportingScriptUris,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> timeout) {
        this.arguments = arguments;
        this.azPowerShellVersion = Objects.requireNonNull(azPowerShellVersion, "expected parameter 'azPowerShellVersion' to be non-null");
        this.cleanupPreference = cleanupPreference == null ? Output.ofLeft("Always") : cleanupPreference;
        this.containerSettings = containerSettings;
        this.environmentVariables = environmentVariables;
        this.forceUpdateTag = forceUpdateTag;
        this.identity = identity;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.location = location;
        this.primaryScriptUri = primaryScriptUri;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.retentionInterval = Objects.requireNonNull(retentionInterval, "expected parameter 'retentionInterval' to be non-null");
        this.scriptContent = scriptContent;
        this.scriptName = scriptName;
        this.storageAccountSettings = storageAccountSettings;
        this.supportingScriptUris = supportingScriptUris;
        this.tags = tags;
        this.timeout = timeout == null ? Output.ofNullable("P1D") : timeout;
    }

    private AzurePowerShellScriptArgs() {
        this.arguments = Output.empty();
        this.azPowerShellVersion = Output.empty();
        this.cleanupPreference = Output.empty();
        this.containerSettings = Output.empty();
        this.environmentVariables = Output.empty();
        this.forceUpdateTag = Output.empty();
        this.identity = Output.empty();
        this.kind = Output.empty();
        this.location = Output.empty();
        this.primaryScriptUri = Output.empty();
        this.resourceGroupName = Output.empty();
        this.retentionInterval = Output.empty();
        this.scriptContent = Output.empty();
        this.scriptName = Output.empty();
        this.storageAccountSettings = Output.empty();
        this.supportingScriptUris = Output.empty();
        this.tags = Output.empty();
        this.timeout = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzurePowerShellScriptArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arguments;
        private Output<String> azPowerShellVersion;
        private @Nullable Output<Either<String,CleanupOptions>> cleanupPreference;
        private @Nullable Output<ContainerConfigurationArgs> containerSettings;
        private @Nullable Output<List<EnvironmentVariableArgs>> environmentVariables;
        private @Nullable Output<String> forceUpdateTag;
        private @Nullable Output<ManagedServiceIdentityArgs> identity;
        private Output<String> kind;
        private @Nullable Output<String> location;
        private @Nullable Output<String> primaryScriptUri;
        private Output<String> resourceGroupName;
        private Output<String> retentionInterval;
        private @Nullable Output<String> scriptContent;
        private @Nullable Output<String> scriptName;
        private @Nullable Output<StorageAccountConfigurationArgs> storageAccountSettings;
        private @Nullable Output<List<String>> supportingScriptUris;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(AzurePowerShellScriptArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arguments = defaults.arguments;
    	      this.azPowerShellVersion = defaults.azPowerShellVersion;
    	      this.cleanupPreference = defaults.cleanupPreference;
    	      this.containerSettings = defaults.containerSettings;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.forceUpdateTag = defaults.forceUpdateTag;
    	      this.identity = defaults.identity;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.primaryScriptUri = defaults.primaryScriptUri;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.retentionInterval = defaults.retentionInterval;
    	      this.scriptContent = defaults.scriptContent;
    	      this.scriptName = defaults.scriptName;
    	      this.storageAccountSettings = defaults.storageAccountSettings;
    	      this.supportingScriptUris = defaults.supportingScriptUris;
    	      this.tags = defaults.tags;
    	      this.timeout = defaults.timeout;
        }

        public Builder arguments(@Nullable Output<String> arguments) {
            this.arguments = arguments;
            return this;
        }
        public Builder arguments(@Nullable String arguments) {
            this.arguments = Output.ofNullable(arguments);
            return this;
        }
        public Builder azPowerShellVersion(Output<String> azPowerShellVersion) {
            this.azPowerShellVersion = Objects.requireNonNull(azPowerShellVersion);
            return this;
        }
        public Builder azPowerShellVersion(String azPowerShellVersion) {
            this.azPowerShellVersion = Output.of(Objects.requireNonNull(azPowerShellVersion));
            return this;
        }
        public Builder cleanupPreference(@Nullable Output<Either<String,CleanupOptions>> cleanupPreference) {
            this.cleanupPreference = cleanupPreference;
            return this;
        }
        public Builder cleanupPreference(@Nullable Either<String,CleanupOptions> cleanupPreference) {
            this.cleanupPreference = Output.ofNullable(cleanupPreference);
            return this;
        }
        public Builder containerSettings(@Nullable Output<ContainerConfigurationArgs> containerSettings) {
            this.containerSettings = containerSettings;
            return this;
        }
        public Builder containerSettings(@Nullable ContainerConfigurationArgs containerSettings) {
            this.containerSettings = Output.ofNullable(containerSettings);
            return this;
        }
        public Builder environmentVariables(@Nullable Output<List<EnvironmentVariableArgs>> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }
        public Builder environmentVariables(@Nullable List<EnvironmentVariableArgs> environmentVariables) {
            this.environmentVariables = Output.ofNullable(environmentVariables);
            return this;
        }
        public Builder environmentVariables(EnvironmentVariableArgs... environmentVariables) {
            return environmentVariables(List.of(environmentVariables));
        }
        public Builder forceUpdateTag(@Nullable Output<String> forceUpdateTag) {
            this.forceUpdateTag = forceUpdateTag;
            return this;
        }
        public Builder forceUpdateTag(@Nullable String forceUpdateTag) {
            this.forceUpdateTag = Output.ofNullable(forceUpdateTag);
            return this;
        }
        public Builder identity(@Nullable Output<ManagedServiceIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }
        public Builder identity(@Nullable ManagedServiceIdentityArgs identity) {
            this.identity = Output.ofNullable(identity);
            return this;
        }
        public Builder kind(Output<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder primaryScriptUri(@Nullable Output<String> primaryScriptUri) {
            this.primaryScriptUri = primaryScriptUri;
            return this;
        }
        public Builder primaryScriptUri(@Nullable String primaryScriptUri) {
            this.primaryScriptUri = Output.ofNullable(primaryScriptUri);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder retentionInterval(Output<String> retentionInterval) {
            this.retentionInterval = Objects.requireNonNull(retentionInterval);
            return this;
        }
        public Builder retentionInterval(String retentionInterval) {
            this.retentionInterval = Output.of(Objects.requireNonNull(retentionInterval));
            return this;
        }
        public Builder scriptContent(@Nullable Output<String> scriptContent) {
            this.scriptContent = scriptContent;
            return this;
        }
        public Builder scriptContent(@Nullable String scriptContent) {
            this.scriptContent = Output.ofNullable(scriptContent);
            return this;
        }
        public Builder scriptName(@Nullable Output<String> scriptName) {
            this.scriptName = scriptName;
            return this;
        }
        public Builder scriptName(@Nullable String scriptName) {
            this.scriptName = Output.ofNullable(scriptName);
            return this;
        }
        public Builder storageAccountSettings(@Nullable Output<StorageAccountConfigurationArgs> storageAccountSettings) {
            this.storageAccountSettings = storageAccountSettings;
            return this;
        }
        public Builder storageAccountSettings(@Nullable StorageAccountConfigurationArgs storageAccountSettings) {
            this.storageAccountSettings = Output.ofNullable(storageAccountSettings);
            return this;
        }
        public Builder supportingScriptUris(@Nullable Output<List<String>> supportingScriptUris) {
            this.supportingScriptUris = supportingScriptUris;
            return this;
        }
        public Builder supportingScriptUris(@Nullable List<String> supportingScriptUris) {
            this.supportingScriptUris = Output.ofNullable(supportingScriptUris);
            return this;
        }
        public Builder supportingScriptUris(String... supportingScriptUris) {
            return supportingScriptUris(List.of(supportingScriptUris));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder timeout(@Nullable Output<String> timeout) {
            this.timeout = timeout;
            return this;
        }
        public Builder timeout(@Nullable String timeout) {
            this.timeout = Output.ofNullable(timeout);
            return this;
        }        public AzurePowerShellScriptArgs build() {
            return new AzurePowerShellScriptArgs(arguments, azPowerShellVersion, cleanupPreference, containerSettings, environmentVariables, forceUpdateTag, identity, kind, location, primaryScriptUri, resourceGroupName, retentionInterval, scriptContent, scriptName, storageAccountSettings, supportingScriptUris, tags, timeout);
        }
    }
}
