// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.LinuxConfigurationResponse;
import io.pulumi.azurenative.compute.outputs.VaultSecretGroupResponse;
import io.pulumi.azurenative.compute.outputs.WindowsConfigurationResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OSProfileResponse {
    private final @Nullable String adminPassword;
    private final @Nullable String adminUsername;
    private final @Nullable Boolean allowExtensionOperations;
    private final @Nullable String computerName;
    private final @Nullable String customData;
    private final @Nullable LinuxConfigurationResponse linuxConfiguration;
    private final @Nullable Boolean requireGuestProvisionSignal;
    private final @Nullable List<VaultSecretGroupResponse> secrets;
    private final @Nullable WindowsConfigurationResponse windowsConfiguration;

    @OutputCustomType.Constructor({"adminPassword","adminUsername","allowExtensionOperations","computerName","customData","linuxConfiguration","requireGuestProvisionSignal","secrets","windowsConfiguration"})
    private OSProfileResponse(
        @Nullable String adminPassword,
        @Nullable String adminUsername,
        @Nullable Boolean allowExtensionOperations,
        @Nullable String computerName,
        @Nullable String customData,
        @Nullable LinuxConfigurationResponse linuxConfiguration,
        @Nullable Boolean requireGuestProvisionSignal,
        @Nullable List<VaultSecretGroupResponse> secrets,
        @Nullable WindowsConfigurationResponse windowsConfiguration) {
        this.adminPassword = adminPassword;
        this.adminUsername = adminUsername;
        this.allowExtensionOperations = allowExtensionOperations;
        this.computerName = computerName;
        this.customData = customData;
        this.linuxConfiguration = linuxConfiguration;
        this.requireGuestProvisionSignal = requireGuestProvisionSignal;
        this.secrets = secrets;
        this.windowsConfiguration = windowsConfiguration;
    }

    public Optional<String> getAdminPassword() {
        return Optional.ofNullable(this.adminPassword);
    }
    public Optional<String> getAdminUsername() {
        return Optional.ofNullable(this.adminUsername);
    }
    public Optional<Boolean> getAllowExtensionOperations() {
        return Optional.ofNullable(this.allowExtensionOperations);
    }
    public Optional<String> getComputerName() {
        return Optional.ofNullable(this.computerName);
    }
    public Optional<String> getCustomData() {
        return Optional.ofNullable(this.customData);
    }
    public Optional<LinuxConfigurationResponse> getLinuxConfiguration() {
        return Optional.ofNullable(this.linuxConfiguration);
    }
    public Optional<Boolean> getRequireGuestProvisionSignal() {
        return Optional.ofNullable(this.requireGuestProvisionSignal);
    }
    public List<VaultSecretGroupResponse> getSecrets() {
        return this.secrets == null ? List.of() : this.secrets;
    }
    public Optional<WindowsConfigurationResponse> getWindowsConfiguration() {
        return Optional.ofNullable(this.windowsConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String adminPassword;
        private @Nullable String adminUsername;
        private @Nullable Boolean allowExtensionOperations;
        private @Nullable String computerName;
        private @Nullable String customData;
        private @Nullable LinuxConfigurationResponse linuxConfiguration;
        private @Nullable Boolean requireGuestProvisionSignal;
        private @Nullable List<VaultSecretGroupResponse> secrets;
        private @Nullable WindowsConfigurationResponse windowsConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(OSProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminPassword = defaults.adminPassword;
    	      this.adminUsername = defaults.adminUsername;
    	      this.allowExtensionOperations = defaults.allowExtensionOperations;
    	      this.computerName = defaults.computerName;
    	      this.customData = defaults.customData;
    	      this.linuxConfiguration = defaults.linuxConfiguration;
    	      this.requireGuestProvisionSignal = defaults.requireGuestProvisionSignal;
    	      this.secrets = defaults.secrets;
    	      this.windowsConfiguration = defaults.windowsConfiguration;
        }

        public Builder setAdminPassword(@Nullable String adminPassword) {
            this.adminPassword = adminPassword;
            return this;
        }

        public Builder setAdminUsername(@Nullable String adminUsername) {
            this.adminUsername = adminUsername;
            return this;
        }

        public Builder setAllowExtensionOperations(@Nullable Boolean allowExtensionOperations) {
            this.allowExtensionOperations = allowExtensionOperations;
            return this;
        }

        public Builder setComputerName(@Nullable String computerName) {
            this.computerName = computerName;
            return this;
        }

        public Builder setCustomData(@Nullable String customData) {
            this.customData = customData;
            return this;
        }

        public Builder setLinuxConfiguration(@Nullable LinuxConfigurationResponse linuxConfiguration) {
            this.linuxConfiguration = linuxConfiguration;
            return this;
        }

        public Builder setRequireGuestProvisionSignal(@Nullable Boolean requireGuestProvisionSignal) {
            this.requireGuestProvisionSignal = requireGuestProvisionSignal;
            return this;
        }

        public Builder setSecrets(@Nullable List<VaultSecretGroupResponse> secrets) {
            this.secrets = secrets;
            return this;
        }

        public Builder setWindowsConfiguration(@Nullable WindowsConfigurationResponse windowsConfiguration) {
            this.windowsConfiguration = windowsConfiguration;
            return this;
        }

        public OSProfileResponse build() {
            return new OSProfileResponse(adminPassword, adminUsername, allowExtensionOperations, computerName, customData, linuxConfiguration, requireGuestProvisionSignal, secrets, windowsConfiguration);
        }
    }
}
