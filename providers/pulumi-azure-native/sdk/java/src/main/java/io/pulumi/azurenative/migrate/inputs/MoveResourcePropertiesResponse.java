// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.azurenative.migrate.inputs.AvailabilitySetResourceSettingsResponse;
import io.pulumi.azurenative.migrate.inputs.DiskEncryptionSetResourceSettingsResponse;
import io.pulumi.azurenative.migrate.inputs.KeyVaultResourceSettingsResponse;
import io.pulumi.azurenative.migrate.inputs.LoadBalancerResourceSettingsResponse;
import io.pulumi.azurenative.migrate.inputs.MoveResourceDependencyOverrideResponse;
import io.pulumi.azurenative.migrate.inputs.MoveResourceDependencyResponse;
import io.pulumi.azurenative.migrate.inputs.MoveResourcePropertiesResponseErrors;
import io.pulumi.azurenative.migrate.inputs.MoveResourcePropertiesResponseMoveStatus;
import io.pulumi.azurenative.migrate.inputs.NetworkInterfaceResourceSettingsResponse;
import io.pulumi.azurenative.migrate.inputs.NetworkSecurityGroupResourceSettingsResponse;
import io.pulumi.azurenative.migrate.inputs.PublicIPAddressResourceSettingsResponse;
import io.pulumi.azurenative.migrate.inputs.ResourceGroupResourceSettingsResponse;
import io.pulumi.azurenative.migrate.inputs.SqlDatabaseResourceSettingsResponse;
import io.pulumi.azurenative.migrate.inputs.SqlElasticPoolResourceSettingsResponse;
import io.pulumi.azurenative.migrate.inputs.SqlServerResourceSettingsResponse;
import io.pulumi.azurenative.migrate.inputs.VirtualMachineResourceSettingsResponse;
import io.pulumi.azurenative.migrate.inputs.VirtualNetworkResourceSettingsResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the move resource properties.
 * 
 */
public final class MoveResourcePropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final MoveResourcePropertiesResponse Empty = new MoveResourcePropertiesResponse();

    /**
     * Gets or sets the move resource dependencies.
     * 
     */
    @Import(name="dependsOn", required=true)
      private final List<MoveResourceDependencyResponse> dependsOn;

    public List<MoveResourceDependencyResponse> getDependsOn() {
        return this.dependsOn;
    }

    /**
     * Gets or sets the move resource dependencies overrides.
     * 
     */
    @Import(name="dependsOnOverrides")
      private final @Nullable List<MoveResourceDependencyOverrideResponse> dependsOnOverrides;

    public List<MoveResourceDependencyOverrideResponse> getDependsOnOverrides() {
        return this.dependsOnOverrides == null ? List.of() : this.dependsOnOverrides;
    }

    /**
     * Defines the move resource errors.
     * 
     */
    @Import(name="errors", required=true)
      private final MoveResourcePropertiesResponseErrors errors;

    public MoveResourcePropertiesResponseErrors getErrors() {
        return this.errors;
    }

    /**
     * Gets or sets the existing target ARM Id of the resource.
     * 
     */
    @Import(name="existingTargetId")
      private final @Nullable String existingTargetId;

    public Optional<String> getExistingTargetId() {
        return this.existingTargetId == null ? Optional.empty() : Optional.ofNullable(this.existingTargetId);
    }

    /**
     * Gets a value indicating whether the resolve action is required over the move collection.
     * 
     */
    @Import(name="isResolveRequired", required=true)
      private final Boolean isResolveRequired;

    public Boolean getIsResolveRequired() {
        return this.isResolveRequired;
    }

    /**
     * Defines the move resource status.
     * 
     */
    @Import(name="moveStatus", required=true)
      private final MoveResourcePropertiesResponseMoveStatus moveStatus;

    public MoveResourcePropertiesResponseMoveStatus getMoveStatus() {
        return this.moveStatus;
    }

    /**
     * Defines the provisioning states.
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Gets or sets the resource settings.
     * 
     */
    @Import(name="resourceSettings")
      private final @Nullable Object resourceSettings;

    public Object getResourceSettings() {
        return this.resourceSettings == null ? null : this.resourceSettings;
    }

    /**
     * Gets or sets the Source ARM Id of the resource.
     * 
     */
    @Import(name="sourceId", required=true)
      private final String sourceId;

    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * Gets or sets the source resource settings.
     * 
     */
    @Import(name="sourceResourceSettings", required=true)
      private final Object sourceResourceSettings;

    public Object getSourceResourceSettings() {
        return this.sourceResourceSettings;
    }

    /**
     * Gets or sets the Target ARM Id of the resource.
     * 
     */
    @Import(name="targetId", required=true)
      private final String targetId;

    public String getTargetId() {
        return this.targetId;
    }

    public MoveResourcePropertiesResponse(
        List<MoveResourceDependencyResponse> dependsOn,
        @Nullable List<MoveResourceDependencyOverrideResponse> dependsOnOverrides,
        MoveResourcePropertiesResponseErrors errors,
        @Nullable String existingTargetId,
        Boolean isResolveRequired,
        MoveResourcePropertiesResponseMoveStatus moveStatus,
        String provisioningState,
        @Nullable Object resourceSettings,
        String sourceId,
        Object sourceResourceSettings,
        String targetId) {
        this.dependsOn = Objects.requireNonNull(dependsOn, "expected parameter 'dependsOn' to be non-null");
        this.dependsOnOverrides = dependsOnOverrides;
        this.errors = Objects.requireNonNull(errors, "expected parameter 'errors' to be non-null");
        this.existingTargetId = existingTargetId;
        this.isResolveRequired = Objects.requireNonNull(isResolveRequired, "expected parameter 'isResolveRequired' to be non-null");
        this.moveStatus = Objects.requireNonNull(moveStatus, "expected parameter 'moveStatus' to be non-null");
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.resourceSettings = resourceSettings;
        this.sourceId = Objects.requireNonNull(sourceId, "expected parameter 'sourceId' to be non-null");
        this.sourceResourceSettings = Objects.requireNonNull(sourceResourceSettings, "expected parameter 'sourceResourceSettings' to be non-null");
        this.targetId = Objects.requireNonNull(targetId, "expected parameter 'targetId' to be non-null");
    }

    private MoveResourcePropertiesResponse() {
        this.dependsOn = List.of();
        this.dependsOnOverrides = List.of();
        this.errors = null;
        this.existingTargetId = null;
        this.isResolveRequired = null;
        this.moveStatus = null;
        this.provisioningState = null;
        this.resourceSettings = null;
        this.sourceId = null;
        this.sourceResourceSettings = null;
        this.targetId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MoveResourcePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<MoveResourceDependencyResponse> dependsOn;
        private @Nullable List<MoveResourceDependencyOverrideResponse> dependsOnOverrides;
        private MoveResourcePropertiesResponseErrors errors;
        private @Nullable String existingTargetId;
        private Boolean isResolveRequired;
        private MoveResourcePropertiesResponseMoveStatus moveStatus;
        private String provisioningState;
        private @Nullable Object resourceSettings;
        private String sourceId;
        private Object sourceResourceSettings;
        private String targetId;

        public Builder() {
    	      // Empty
        }

        public Builder(MoveResourcePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dependsOn = defaults.dependsOn;
    	      this.dependsOnOverrides = defaults.dependsOnOverrides;
    	      this.errors = defaults.errors;
    	      this.existingTargetId = defaults.existingTargetId;
    	      this.isResolveRequired = defaults.isResolveRequired;
    	      this.moveStatus = defaults.moveStatus;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceSettings = defaults.resourceSettings;
    	      this.sourceId = defaults.sourceId;
    	      this.sourceResourceSettings = defaults.sourceResourceSettings;
    	      this.targetId = defaults.targetId;
        }

        public Builder dependsOn(List<MoveResourceDependencyResponse> dependsOn) {
            this.dependsOn = Objects.requireNonNull(dependsOn);
            return this;
        }
        public Builder dependsOn(MoveResourceDependencyResponse... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }
        public Builder dependsOnOverrides(@Nullable List<MoveResourceDependencyOverrideResponse> dependsOnOverrides) {
            this.dependsOnOverrides = dependsOnOverrides;
            return this;
        }
        public Builder dependsOnOverrides(MoveResourceDependencyOverrideResponse... dependsOnOverrides) {
            return dependsOnOverrides(List.of(dependsOnOverrides));
        }
        public Builder errors(MoveResourcePropertiesResponseErrors errors) {
            this.errors = Objects.requireNonNull(errors);
            return this;
        }
        public Builder existingTargetId(@Nullable String existingTargetId) {
            this.existingTargetId = existingTargetId;
            return this;
        }
        public Builder isResolveRequired(Boolean isResolveRequired) {
            this.isResolveRequired = Objects.requireNonNull(isResolveRequired);
            return this;
        }
        public Builder moveStatus(MoveResourcePropertiesResponseMoveStatus moveStatus) {
            this.moveStatus = Objects.requireNonNull(moveStatus);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder resourceSettings(@Nullable Object resourceSettings) {
            this.resourceSettings = resourceSettings;
            return this;
        }
        public Builder sourceId(String sourceId) {
            this.sourceId = Objects.requireNonNull(sourceId);
            return this;
        }
        public Builder sourceResourceSettings(Object sourceResourceSettings) {
            this.sourceResourceSettings = Objects.requireNonNull(sourceResourceSettings);
            return this;
        }
        public Builder targetId(String targetId) {
            this.targetId = Objects.requireNonNull(targetId);
            return this;
        }        public MoveResourcePropertiesResponse build() {
            return new MoveResourcePropertiesResponse(dependsOn, dependsOnOverrides, errors, existingTargetId, isResolveRequired, moveStatus, provisioningState, resourceSettings, sourceId, sourceResourceSettings, targetId);
        }
    }
}
