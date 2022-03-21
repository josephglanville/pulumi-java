// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.azurenative.migrate.inputs.AvailabilitySetResourceSettingsArgs;
import io.pulumi.azurenative.migrate.inputs.DiskEncryptionSetResourceSettingsArgs;
import io.pulumi.azurenative.migrate.inputs.KeyVaultResourceSettingsArgs;
import io.pulumi.azurenative.migrate.inputs.LoadBalancerResourceSettingsArgs;
import io.pulumi.azurenative.migrate.inputs.MoveResourceDependencyOverrideArgs;
import io.pulumi.azurenative.migrate.inputs.NetworkInterfaceResourceSettingsArgs;
import io.pulumi.azurenative.migrate.inputs.NetworkSecurityGroupResourceSettingsArgs;
import io.pulumi.azurenative.migrate.inputs.PublicIPAddressResourceSettingsArgs;
import io.pulumi.azurenative.migrate.inputs.ResourceGroupResourceSettingsArgs;
import io.pulumi.azurenative.migrate.inputs.SqlDatabaseResourceSettingsArgs;
import io.pulumi.azurenative.migrate.inputs.SqlElasticPoolResourceSettingsArgs;
import io.pulumi.azurenative.migrate.inputs.SqlServerResourceSettingsArgs;
import io.pulumi.azurenative.migrate.inputs.VirtualMachineResourceSettingsArgs;
import io.pulumi.azurenative.migrate.inputs.VirtualNetworkResourceSettingsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the move resource properties.
 * 
 */
public final class MoveResourcePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final MoveResourcePropertiesArgs Empty = new MoveResourcePropertiesArgs();

    /**
     * Gets or sets the move resource dependencies overrides.
     * 
     */
    @Import(name="dependsOnOverrides")
      private final @Nullable Output<List<MoveResourceDependencyOverrideArgs>> dependsOnOverrides;

    public Output<List<MoveResourceDependencyOverrideArgs>> getDependsOnOverrides() {
        return this.dependsOnOverrides == null ? Output.empty() : this.dependsOnOverrides;
    }

    /**
     * Gets or sets the existing target ARM Id of the resource.
     * 
     */
    @Import(name="existingTargetId")
      private final @Nullable Output<String> existingTargetId;

    public Output<String> getExistingTargetId() {
        return this.existingTargetId == null ? Output.empty() : this.existingTargetId;
    }

    /**
     * Gets or sets the resource settings.
     * 
     */
    @Import(name="resourceSettings")
      private final @Nullable Output<Object> resourceSettings;

    public Output<Object> getResourceSettings() {
        return this.resourceSettings == null ? Output.empty() : this.resourceSettings;
    }

    /**
     * Gets or sets the Source ARM Id of the resource.
     * 
     */
    @Import(name="sourceId", required=true)
      private final Output<String> sourceId;

    public Output<String> getSourceId() {
        return this.sourceId;
    }

    public MoveResourcePropertiesArgs(
        @Nullable Output<List<MoveResourceDependencyOverrideArgs>> dependsOnOverrides,
        @Nullable Output<String> existingTargetId,
        @Nullable Output<Object> resourceSettings,
        Output<String> sourceId) {
        this.dependsOnOverrides = dependsOnOverrides;
        this.existingTargetId = existingTargetId;
        this.resourceSettings = resourceSettings;
        this.sourceId = Objects.requireNonNull(sourceId, "expected parameter 'sourceId' to be non-null");
    }

    private MoveResourcePropertiesArgs() {
        this.dependsOnOverrides = Output.empty();
        this.existingTargetId = Output.empty();
        this.resourceSettings = Output.empty();
        this.sourceId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MoveResourcePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<MoveResourceDependencyOverrideArgs>> dependsOnOverrides;
        private @Nullable Output<String> existingTargetId;
        private @Nullable Output<Object> resourceSettings;
        private Output<String> sourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(MoveResourcePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dependsOnOverrides = defaults.dependsOnOverrides;
    	      this.existingTargetId = defaults.existingTargetId;
    	      this.resourceSettings = defaults.resourceSettings;
    	      this.sourceId = defaults.sourceId;
        }

        public Builder dependsOnOverrides(@Nullable Output<List<MoveResourceDependencyOverrideArgs>> dependsOnOverrides) {
            this.dependsOnOverrides = dependsOnOverrides;
            return this;
        }
        public Builder dependsOnOverrides(@Nullable List<MoveResourceDependencyOverrideArgs> dependsOnOverrides) {
            this.dependsOnOverrides = Output.ofNullable(dependsOnOverrides);
            return this;
        }
        public Builder dependsOnOverrides(MoveResourceDependencyOverrideArgs... dependsOnOverrides) {
            return dependsOnOverrides(List.of(dependsOnOverrides));
        }
        public Builder existingTargetId(@Nullable Output<String> existingTargetId) {
            this.existingTargetId = existingTargetId;
            return this;
        }
        public Builder existingTargetId(@Nullable String existingTargetId) {
            this.existingTargetId = Output.ofNullable(existingTargetId);
            return this;
        }
        public Builder resourceSettings(@Nullable Output<Object> resourceSettings) {
            this.resourceSettings = resourceSettings;
            return this;
        }
        public Builder resourceSettings(@Nullable Object resourceSettings) {
            this.resourceSettings = Output.ofNullable(resourceSettings);
            return this;
        }
        public Builder sourceId(Output<String> sourceId) {
            this.sourceId = Objects.requireNonNull(sourceId);
            return this;
        }
        public Builder sourceId(String sourceId) {
            this.sourceId = Output.of(Objects.requireNonNull(sourceId));
            return this;
        }        public MoveResourcePropertiesArgs build() {
            return new MoveResourcePropertiesArgs(dependsOnOverrides, existingTargetId, resourceSettings, sourceId);
        }
    }
}
