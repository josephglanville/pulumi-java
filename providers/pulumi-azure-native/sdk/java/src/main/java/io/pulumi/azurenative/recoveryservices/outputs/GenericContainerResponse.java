// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.GenericContainerExtendedInfoResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GenericContainerResponse {
    private final @Nullable String backupManagementType;
    private final String containerType;
    private final @Nullable GenericContainerExtendedInfoResponse extendedInformation;
    private final @Nullable String fabricName;
    private final @Nullable String friendlyName;
    private final @Nullable String healthStatus;
    private final @Nullable String registrationStatus;

    @OutputCustomType.Constructor({"backupManagementType","containerType","extendedInformation","fabricName","friendlyName","healthStatus","registrationStatus"})
    private GenericContainerResponse(
        @Nullable String backupManagementType,
        String containerType,
        @Nullable GenericContainerExtendedInfoResponse extendedInformation,
        @Nullable String fabricName,
        @Nullable String friendlyName,
        @Nullable String healthStatus,
        @Nullable String registrationStatus) {
        this.backupManagementType = backupManagementType;
        this.containerType = Objects.requireNonNull(containerType);
        this.extendedInformation = extendedInformation;
        this.fabricName = fabricName;
        this.friendlyName = friendlyName;
        this.healthStatus = healthStatus;
        this.registrationStatus = registrationStatus;
    }

    public Optional<String> getBackupManagementType() {
        return Optional.ofNullable(this.backupManagementType);
    }
    public String getContainerType() {
        return this.containerType;
    }
    public Optional<GenericContainerExtendedInfoResponse> getExtendedInformation() {
        return Optional.ofNullable(this.extendedInformation);
    }
    public Optional<String> getFabricName() {
        return Optional.ofNullable(this.fabricName);
    }
    public Optional<String> getFriendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }
    public Optional<String> getHealthStatus() {
        return Optional.ofNullable(this.healthStatus);
    }
    public Optional<String> getRegistrationStatus() {
        return Optional.ofNullable(this.registrationStatus);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GenericContainerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String backupManagementType;
        private String containerType;
        private @Nullable GenericContainerExtendedInfoResponse extendedInformation;
        private @Nullable String fabricName;
        private @Nullable String friendlyName;
        private @Nullable String healthStatus;
        private @Nullable String registrationStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(GenericContainerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.containerType = defaults.containerType;
    	      this.extendedInformation = defaults.extendedInformation;
    	      this.fabricName = defaults.fabricName;
    	      this.friendlyName = defaults.friendlyName;
    	      this.healthStatus = defaults.healthStatus;
    	      this.registrationStatus = defaults.registrationStatus;
        }

        public Builder setBackupManagementType(@Nullable String backupManagementType) {
            this.backupManagementType = backupManagementType;
            return this;
        }

        public Builder setContainerType(String containerType) {
            this.containerType = Objects.requireNonNull(containerType);
            return this;
        }

        public Builder setExtendedInformation(@Nullable GenericContainerExtendedInfoResponse extendedInformation) {
            this.extendedInformation = extendedInformation;
            return this;
        }

        public Builder setFabricName(@Nullable String fabricName) {
            this.fabricName = fabricName;
            return this;
        }

        public Builder setFriendlyName(@Nullable String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder setHealthStatus(@Nullable String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }

        public Builder setRegistrationStatus(@Nullable String registrationStatus) {
            this.registrationStatus = registrationStatus;
            return this;
        }

        public GenericContainerResponse build() {
            return new GenericContainerResponse(backupManagementType, containerType, extendedInformation, fabricName, friendlyName, healthStatus, registrationStatus);
        }
    }
}