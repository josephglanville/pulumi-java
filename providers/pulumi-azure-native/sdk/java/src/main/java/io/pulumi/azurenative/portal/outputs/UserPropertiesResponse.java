// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal.outputs;

import io.pulumi.azurenative.portal.outputs.StorageProfileResponse;
import io.pulumi.azurenative.portal.outputs.TerminalSettingsResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class UserPropertiesResponse {
    private final String preferredLocation;
    private final String preferredOsType;
    private final String preferredShellType;
    private final StorageProfileResponse storageProfile;
    private final TerminalSettingsResponse terminalSettings;

    @OutputCustomType.Constructor({"preferredLocation","preferredOsType","preferredShellType","storageProfile","terminalSettings"})
    private UserPropertiesResponse(
        String preferredLocation,
        String preferredOsType,
        String preferredShellType,
        StorageProfileResponse storageProfile,
        TerminalSettingsResponse terminalSettings) {
        this.preferredLocation = Objects.requireNonNull(preferredLocation);
        this.preferredOsType = Objects.requireNonNull(preferredOsType);
        this.preferredShellType = Objects.requireNonNull(preferredShellType);
        this.storageProfile = Objects.requireNonNull(storageProfile);
        this.terminalSettings = Objects.requireNonNull(terminalSettings);
    }

    public String getPreferredLocation() {
        return this.preferredLocation;
    }
    public String getPreferredOsType() {
        return this.preferredOsType;
    }
    public String getPreferredShellType() {
        return this.preferredShellType;
    }
    public StorageProfileResponse getStorageProfile() {
        return this.storageProfile;
    }
    public TerminalSettingsResponse getTerminalSettings() {
        return this.terminalSettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String preferredLocation;
        private String preferredOsType;
        private String preferredShellType;
        private StorageProfileResponse storageProfile;
        private TerminalSettingsResponse terminalSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preferredLocation = defaults.preferredLocation;
    	      this.preferredOsType = defaults.preferredOsType;
    	      this.preferredShellType = defaults.preferredShellType;
    	      this.storageProfile = defaults.storageProfile;
    	      this.terminalSettings = defaults.terminalSettings;
        }

        public Builder setPreferredLocation(String preferredLocation) {
            this.preferredLocation = Objects.requireNonNull(preferredLocation);
            return this;
        }

        public Builder setPreferredOsType(String preferredOsType) {
            this.preferredOsType = Objects.requireNonNull(preferredOsType);
            return this;
        }

        public Builder setPreferredShellType(String preferredShellType) {
            this.preferredShellType = Objects.requireNonNull(preferredShellType);
            return this;
        }

        public Builder setStorageProfile(StorageProfileResponse storageProfile) {
            this.storageProfile = Objects.requireNonNull(storageProfile);
            return this;
        }

        public Builder setTerminalSettings(TerminalSettingsResponse terminalSettings) {
            this.terminalSettings = Objects.requireNonNull(terminalSettings);
            return this;
        }

        public UserPropertiesResponse build() {
            return new UserPropertiesResponse(preferredLocation, preferredOsType, preferredShellType, storageProfile, terminalSettings);
        }
    }
}