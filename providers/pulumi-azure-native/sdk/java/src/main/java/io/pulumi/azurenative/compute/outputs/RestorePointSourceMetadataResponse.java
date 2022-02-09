// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.DiagnosticsProfileResponse;
import io.pulumi.azurenative.compute.outputs.HardwareProfileResponse;
import io.pulumi.azurenative.compute.outputs.OSProfileResponse;
import io.pulumi.azurenative.compute.outputs.RestorePointSourceVMStorageProfileResponse;
import io.pulumi.azurenative.compute.outputs.SecurityProfileResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RestorePointSourceMetadataResponse {
    private final @Nullable DiagnosticsProfileResponse diagnosticsProfile;
    private final @Nullable HardwareProfileResponse hardwareProfile;
    private final @Nullable String licenseType;
    private final @Nullable String location;
    private final @Nullable OSProfileResponse osProfile;
    private final @Nullable SecurityProfileResponse securityProfile;
    private final @Nullable RestorePointSourceVMStorageProfileResponse storageProfile;
    private final @Nullable String vmId;

    @OutputCustomType.Constructor({"diagnosticsProfile","hardwareProfile","licenseType","location","osProfile","securityProfile","storageProfile","vmId"})
    private RestorePointSourceMetadataResponse(
        @Nullable DiagnosticsProfileResponse diagnosticsProfile,
        @Nullable HardwareProfileResponse hardwareProfile,
        @Nullable String licenseType,
        @Nullable String location,
        @Nullable OSProfileResponse osProfile,
        @Nullable SecurityProfileResponse securityProfile,
        @Nullable RestorePointSourceVMStorageProfileResponse storageProfile,
        @Nullable String vmId) {
        this.diagnosticsProfile = diagnosticsProfile;
        this.hardwareProfile = hardwareProfile;
        this.licenseType = licenseType;
        this.location = location;
        this.osProfile = osProfile;
        this.securityProfile = securityProfile;
        this.storageProfile = storageProfile;
        this.vmId = vmId;
    }

    public Optional<DiagnosticsProfileResponse> getDiagnosticsProfile() {
        return Optional.ofNullable(this.diagnosticsProfile);
    }
    public Optional<HardwareProfileResponse> getHardwareProfile() {
        return Optional.ofNullable(this.hardwareProfile);
    }
    public Optional<String> getLicenseType() {
        return Optional.ofNullable(this.licenseType);
    }
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    public Optional<OSProfileResponse> getOsProfile() {
        return Optional.ofNullable(this.osProfile);
    }
    public Optional<SecurityProfileResponse> getSecurityProfile() {
        return Optional.ofNullable(this.securityProfile);
    }
    public Optional<RestorePointSourceVMStorageProfileResponse> getStorageProfile() {
        return Optional.ofNullable(this.storageProfile);
    }
    public Optional<String> getVmId() {
        return Optional.ofNullable(this.vmId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestorePointSourceMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DiagnosticsProfileResponse diagnosticsProfile;
        private @Nullable HardwareProfileResponse hardwareProfile;
        private @Nullable String licenseType;
        private @Nullable String location;
        private @Nullable OSProfileResponse osProfile;
        private @Nullable SecurityProfileResponse securityProfile;
        private @Nullable RestorePointSourceVMStorageProfileResponse storageProfile;
        private @Nullable String vmId;

        public Builder() {
    	      // Empty
        }

        public Builder(RestorePointSourceMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diagnosticsProfile = defaults.diagnosticsProfile;
    	      this.hardwareProfile = defaults.hardwareProfile;
    	      this.licenseType = defaults.licenseType;
    	      this.location = defaults.location;
    	      this.osProfile = defaults.osProfile;
    	      this.securityProfile = defaults.securityProfile;
    	      this.storageProfile = defaults.storageProfile;
    	      this.vmId = defaults.vmId;
        }

        public Builder setDiagnosticsProfile(@Nullable DiagnosticsProfileResponse diagnosticsProfile) {
            this.diagnosticsProfile = diagnosticsProfile;
            return this;
        }

        public Builder setHardwareProfile(@Nullable HardwareProfileResponse hardwareProfile) {
            this.hardwareProfile = hardwareProfile;
            return this;
        }

        public Builder setLicenseType(@Nullable String licenseType) {
            this.licenseType = licenseType;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setOsProfile(@Nullable OSProfileResponse osProfile) {
            this.osProfile = osProfile;
            return this;
        }

        public Builder setSecurityProfile(@Nullable SecurityProfileResponse securityProfile) {
            this.securityProfile = securityProfile;
            return this;
        }

        public Builder setStorageProfile(@Nullable RestorePointSourceVMStorageProfileResponse storageProfile) {
            this.storageProfile = storageProfile;
            return this;
        }

        public Builder setVmId(@Nullable String vmId) {
            this.vmId = vmId;
            return this;
        }

        public RestorePointSourceMetadataResponse build() {
            return new RestorePointSourceMetadataResponse(diagnosticsProfile, hardwareProfile, licenseType, location, osProfile, securityProfile, storageProfile, vmId);
        }
    }
}
