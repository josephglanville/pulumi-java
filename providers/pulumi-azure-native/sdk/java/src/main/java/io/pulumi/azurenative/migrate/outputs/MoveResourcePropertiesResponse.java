// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.azurenative.migrate.outputs.AvailabilitySetResourceSettingsResponse;
import io.pulumi.azurenative.migrate.outputs.DiskEncryptionSetResourceSettingsResponse;
import io.pulumi.azurenative.migrate.outputs.KeyVaultResourceSettingsResponse;
import io.pulumi.azurenative.migrate.outputs.LoadBalancerResourceSettingsResponse;
import io.pulumi.azurenative.migrate.outputs.MoveResourceDependencyOverrideResponse;
import io.pulumi.azurenative.migrate.outputs.MoveResourceDependencyResponse;
import io.pulumi.azurenative.migrate.outputs.MoveResourcePropertiesResponseErrors;
import io.pulumi.azurenative.migrate.outputs.MoveResourcePropertiesResponseMoveStatus;
import io.pulumi.azurenative.migrate.outputs.NetworkInterfaceResourceSettingsResponse;
import io.pulumi.azurenative.migrate.outputs.NetworkSecurityGroupResourceSettingsResponse;
import io.pulumi.azurenative.migrate.outputs.PublicIPAddressResourceSettingsResponse;
import io.pulumi.azurenative.migrate.outputs.ResourceGroupResourceSettingsResponse;
import io.pulumi.azurenative.migrate.outputs.SqlDatabaseResourceSettingsResponse;
import io.pulumi.azurenative.migrate.outputs.SqlElasticPoolResourceSettingsResponse;
import io.pulumi.azurenative.migrate.outputs.SqlServerResourceSettingsResponse;
import io.pulumi.azurenative.migrate.outputs.VirtualMachineResourceSettingsResponse;
import io.pulumi.azurenative.migrate.outputs.VirtualNetworkResourceSettingsResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MoveResourcePropertiesResponse {
    private final List<MoveResourceDependencyResponse> dependsOn;
    private final @Nullable List<MoveResourceDependencyOverrideResponse> dependsOnOverrides;
    private final MoveResourcePropertiesResponseErrors errors;
    private final @Nullable String existingTargetId;
    private final Boolean isResolveRequired;
    private final MoveResourcePropertiesResponseMoveStatus moveStatus;
    private final String provisioningState;
    private final @Nullable Object resourceSettings;
    private final String sourceId;
    private final Object sourceResourceSettings;
    private final String targetId;

    @OutputCustomType.Constructor({"dependsOn","dependsOnOverrides","errors","existingTargetId","isResolveRequired","moveStatus","provisioningState","resourceSettings","sourceId","sourceResourceSettings","targetId"})
    private MoveResourcePropertiesResponse(
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
        this.dependsOn = Objects.requireNonNull(dependsOn);
        this.dependsOnOverrides = dependsOnOverrides;
        this.errors = Objects.requireNonNull(errors);
        this.existingTargetId = existingTargetId;
        this.isResolveRequired = Objects.requireNonNull(isResolveRequired);
        this.moveStatus = Objects.requireNonNull(moveStatus);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.resourceSettings = resourceSettings;
        this.sourceId = Objects.requireNonNull(sourceId);
        this.sourceResourceSettings = Objects.requireNonNull(sourceResourceSettings);
        this.targetId = Objects.requireNonNull(targetId);
    }

    public List<MoveResourceDependencyResponse> getDependsOn() {
        return this.dependsOn;
    }
    public List<MoveResourceDependencyOverrideResponse> getDependsOnOverrides() {
        return this.dependsOnOverrides == null ? List.of() : this.dependsOnOverrides;
    }
    public MoveResourcePropertiesResponseErrors getErrors() {
        return this.errors;
    }
    public Optional<String> getExistingTargetId() {
        return Optional.ofNullable(this.existingTargetId);
    }
    public Boolean getIsResolveRequired() {
        return this.isResolveRequired;
    }
    public MoveResourcePropertiesResponseMoveStatus getMoveStatus() {
        return this.moveStatus;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public Optional<Object> getResourceSettings() {
        return Optional.ofNullable(this.resourceSettings);
    }
    public String getSourceId() {
        return this.sourceId;
    }
    public Object getSourceResourceSettings() {
        return this.sourceResourceSettings;
    }
    public String getTargetId() {
        return this.targetId;
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

        public Builder setDependsOn(List<MoveResourceDependencyResponse> dependsOn) {
            this.dependsOn = Objects.requireNonNull(dependsOn);
            return this;
        }

        public Builder setDependsOnOverrides(@Nullable List<MoveResourceDependencyOverrideResponse> dependsOnOverrides) {
            this.dependsOnOverrides = dependsOnOverrides;
            return this;
        }

        public Builder setErrors(MoveResourcePropertiesResponseErrors errors) {
            this.errors = Objects.requireNonNull(errors);
            return this;
        }

        public Builder setExistingTargetId(@Nullable String existingTargetId) {
            this.existingTargetId = existingTargetId;
            return this;
        }

        public Builder setIsResolveRequired(Boolean isResolveRequired) {
            this.isResolveRequired = Objects.requireNonNull(isResolveRequired);
            return this;
        }

        public Builder setMoveStatus(MoveResourcePropertiesResponseMoveStatus moveStatus) {
            this.moveStatus = Objects.requireNonNull(moveStatus);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setResourceSettings(@Nullable Object resourceSettings) {
            this.resourceSettings = resourceSettings;
            return this;
        }

        public Builder setSourceId(String sourceId) {
            this.sourceId = Objects.requireNonNull(sourceId);
            return this;
        }

        public Builder setSourceResourceSettings(Object sourceResourceSettings) {
            this.sourceResourceSettings = Objects.requireNonNull(sourceResourceSettings);
            return this;
        }

        public Builder setTargetId(String targetId) {
            this.targetId = Objects.requireNonNull(targetId);
            return this;
        }

        public MoveResourcePropertiesResponse build() {
            return new MoveResourcePropertiesResponse(dependsOn, dependsOnOverrides, errors, existingTargetId, isResolveRequired, moveStatus, provisioningState, resourceSettings, sourceId, sourceResourceSettings, targetId);
        }
    }
}