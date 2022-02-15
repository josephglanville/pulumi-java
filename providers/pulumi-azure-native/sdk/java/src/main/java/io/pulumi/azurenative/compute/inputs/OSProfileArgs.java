// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.LinuxConfigurationArgs;
import io.pulumi.azurenative.compute.inputs.VaultSecretGroupArgs;
import io.pulumi.azurenative.compute.inputs.WindowsConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OSProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final OSProfileArgs Empty = new OSProfileArgs();

    @InputImport(name="adminPassword")
    private final @Nullable Input<String> adminPassword;

    public Input<String> getAdminPassword() {
        return this.adminPassword == null ? Input.empty() : this.adminPassword;
    }

    @InputImport(name="adminUsername")
    private final @Nullable Input<String> adminUsername;

    public Input<String> getAdminUsername() {
        return this.adminUsername == null ? Input.empty() : this.adminUsername;
    }

    @InputImport(name="allowExtensionOperations")
    private final @Nullable Input<Boolean> allowExtensionOperations;

    public Input<Boolean> getAllowExtensionOperations() {
        return this.allowExtensionOperations == null ? Input.empty() : this.allowExtensionOperations;
    }

    @InputImport(name="computerName")
    private final @Nullable Input<String> computerName;

    public Input<String> getComputerName() {
        return this.computerName == null ? Input.empty() : this.computerName;
    }

    @InputImport(name="customData")
    private final @Nullable Input<String> customData;

    public Input<String> getCustomData() {
        return this.customData == null ? Input.empty() : this.customData;
    }

    @InputImport(name="linuxConfiguration")
    private final @Nullable Input<LinuxConfigurationArgs> linuxConfiguration;

    public Input<LinuxConfigurationArgs> getLinuxConfiguration() {
        return this.linuxConfiguration == null ? Input.empty() : this.linuxConfiguration;
    }

    @InputImport(name="requireGuestProvisionSignal")
    private final @Nullable Input<Boolean> requireGuestProvisionSignal;

    public Input<Boolean> getRequireGuestProvisionSignal() {
        return this.requireGuestProvisionSignal == null ? Input.empty() : this.requireGuestProvisionSignal;
    }

    @InputImport(name="secrets")
    private final @Nullable Input<List<VaultSecretGroupArgs>> secrets;

    public Input<List<VaultSecretGroupArgs>> getSecrets() {
        return this.secrets == null ? Input.empty() : this.secrets;
    }

    @InputImport(name="windowsConfiguration")
    private final @Nullable Input<WindowsConfigurationArgs> windowsConfiguration;

    public Input<WindowsConfigurationArgs> getWindowsConfiguration() {
        return this.windowsConfiguration == null ? Input.empty() : this.windowsConfiguration;
    }

    public OSProfileArgs(
        @Nullable Input<String> adminPassword,
        @Nullable Input<String> adminUsername,
        @Nullable Input<Boolean> allowExtensionOperations,
        @Nullable Input<String> computerName,
        @Nullable Input<String> customData,
        @Nullable Input<LinuxConfigurationArgs> linuxConfiguration,
        @Nullable Input<Boolean> requireGuestProvisionSignal,
        @Nullable Input<List<VaultSecretGroupArgs>> secrets,
        @Nullable Input<WindowsConfigurationArgs> windowsConfiguration) {
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

    private OSProfileArgs() {
        this.adminPassword = Input.empty();
        this.adminUsername = Input.empty();
        this.allowExtensionOperations = Input.empty();
        this.computerName = Input.empty();
        this.customData = Input.empty();
        this.linuxConfiguration = Input.empty();
        this.requireGuestProvisionSignal = Input.empty();
        this.secrets = Input.empty();
        this.windowsConfiguration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> adminPassword;
        private @Nullable Input<String> adminUsername;
        private @Nullable Input<Boolean> allowExtensionOperations;
        private @Nullable Input<String> computerName;
        private @Nullable Input<String> customData;
        private @Nullable Input<LinuxConfigurationArgs> linuxConfiguration;
        private @Nullable Input<Boolean> requireGuestProvisionSignal;
        private @Nullable Input<List<VaultSecretGroupArgs>> secrets;
        private @Nullable Input<WindowsConfigurationArgs> windowsConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(OSProfileArgs defaults) {
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

        public Builder setAdminPassword(@Nullable Input<String> adminPassword) {
            this.adminPassword = adminPassword;
            return this;
        }

        public Builder setAdminPassword(@Nullable String adminPassword) {
            this.adminPassword = Input.ofNullable(adminPassword);
            return this;
        }

        public Builder setAdminUsername(@Nullable Input<String> adminUsername) {
            this.adminUsername = adminUsername;
            return this;
        }

        public Builder setAdminUsername(@Nullable String adminUsername) {
            this.adminUsername = Input.ofNullable(adminUsername);
            return this;
        }

        public Builder setAllowExtensionOperations(@Nullable Input<Boolean> allowExtensionOperations) {
            this.allowExtensionOperations = allowExtensionOperations;
            return this;
        }

        public Builder setAllowExtensionOperations(@Nullable Boolean allowExtensionOperations) {
            this.allowExtensionOperations = Input.ofNullable(allowExtensionOperations);
            return this;
        }

        public Builder setComputerName(@Nullable Input<String> computerName) {
            this.computerName = computerName;
            return this;
        }

        public Builder setComputerName(@Nullable String computerName) {
            this.computerName = Input.ofNullable(computerName);
            return this;
        }

        public Builder setCustomData(@Nullable Input<String> customData) {
            this.customData = customData;
            return this;
        }

        public Builder setCustomData(@Nullable String customData) {
            this.customData = Input.ofNullable(customData);
            return this;
        }

        public Builder setLinuxConfiguration(@Nullable Input<LinuxConfigurationArgs> linuxConfiguration) {
            this.linuxConfiguration = linuxConfiguration;
            return this;
        }

        public Builder setLinuxConfiguration(@Nullable LinuxConfigurationArgs linuxConfiguration) {
            this.linuxConfiguration = Input.ofNullable(linuxConfiguration);
            return this;
        }

        public Builder setRequireGuestProvisionSignal(@Nullable Input<Boolean> requireGuestProvisionSignal) {
            this.requireGuestProvisionSignal = requireGuestProvisionSignal;
            return this;
        }

        public Builder setRequireGuestProvisionSignal(@Nullable Boolean requireGuestProvisionSignal) {
            this.requireGuestProvisionSignal = Input.ofNullable(requireGuestProvisionSignal);
            return this;
        }

        public Builder setSecrets(@Nullable Input<List<VaultSecretGroupArgs>> secrets) {
            this.secrets = secrets;
            return this;
        }

        public Builder setSecrets(@Nullable List<VaultSecretGroupArgs> secrets) {
            this.secrets = Input.ofNullable(secrets);
            return this;
        }

        public Builder setWindowsConfiguration(@Nullable Input<WindowsConfigurationArgs> windowsConfiguration) {
            this.windowsConfiguration = windowsConfiguration;
            return this;
        }

        public Builder setWindowsConfiguration(@Nullable WindowsConfigurationArgs windowsConfiguration) {
            this.windowsConfiguration = Input.ofNullable(windowsConfiguration);
            return this;
        }

        public OSProfileArgs build() {
            return new OSProfileArgs(adminPassword, adminUsername, allowExtensionOperations, computerName, customData, linuxConfiguration, requireGuestProvisionSignal, secrets, windowsConfiguration);
        }
    }
}