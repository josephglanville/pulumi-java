// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.LinuxConfigurationArgs;
import io.pulumi.azurenative.compute.inputs.VaultSecretGroupArgs;
import io.pulumi.azurenative.compute.inputs.WindowsConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a virtual machine scale set OS profile.
 * 
 */
public final class VirtualMachineScaleSetOSProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualMachineScaleSetOSProfileArgs Empty = new VirtualMachineScaleSetOSProfileArgs();

    /**
     * Specifies the password of the administrator account. <br><br> **Minimum-length (Windows):** 8 characters <br><br> **Minimum-length (Linux):** 6 characters <br><br> **Max-length (Windows):** 123 characters <br><br> **Max-length (Linux):** 72 characters <br><br> **Complexity requirements:** 3 out of 4 conditions below need to be fulfilled <br> Has lower characters <br>Has upper characters <br> Has a digit <br> Has a special character (Regex match [\W_]) <br><br> **Disallowed values:** "abc@123", "P@$$w0rd", "P@ssw0rd", "P@ssword123", "Pa$$word", "pass@word1", "Password!", "Password1", "Password22", "iloveyou!" <br><br> For resetting the password, see [How to reset the Remote Desktop service or its login password in a Windows VM](https://docs.microsoft.com/troubleshoot/azure/virtual-machines/reset-rdp) <br><br> For resetting root password, see [Manage users, SSH, and check or repair disks on Azure Linux VMs using the VMAccess Extension](https://docs.microsoft.com/troubleshoot/azure/virtual-machines/troubleshoot-ssh-connection)
     * 
     */
    @Import(name="adminPassword")
      private final @Nullable Output<String> adminPassword;

    public Output<String> getAdminPassword() {
        return this.adminPassword == null ? Codegen.empty() : this.adminPassword;
    }

    /**
     * Specifies the name of the administrator account. <br><br> **Windows-only restriction:** Cannot end in "." <br><br> **Disallowed values:** "administrator", "admin", "user", "user1", "test", "user2", "test1", "user3", "admin1", "1", "123", "a", "actuser", "adm", "admin2", "aspnet", "backup", "console", "david", "guest", "john", "owner", "root", "server", "sql", "support", "support_388945a0", "sys", "test2", "test3", "user4", "user5". <br><br> **Minimum-length (Linux):** 1  character <br><br> **Max-length (Linux):** 64 characters <br><br> **Max-length (Windows):** 20 characters
     * 
     */
    @Import(name="adminUsername")
      private final @Nullable Output<String> adminUsername;

    public Output<String> getAdminUsername() {
        return this.adminUsername == null ? Codegen.empty() : this.adminUsername;
    }

    /**
     * Specifies the computer name prefix for all of the virtual machines in the scale set. Computer name prefixes must be 1 to 15 characters long.
     * 
     */
    @Import(name="computerNamePrefix")
      private final @Nullable Output<String> computerNamePrefix;

    public Output<String> getComputerNamePrefix() {
        return this.computerNamePrefix == null ? Codegen.empty() : this.computerNamePrefix;
    }

    /**
     * Specifies a base-64 encoded string of custom data. The base-64 encoded string is decoded to a binary array that is saved as a file on the Virtual Machine. The maximum length of the binary array is 65535 bytes. <br><br> For using cloud-init for your VM, see [Using cloud-init to customize a Linux VM during creation](https://docs.microsoft.com/azure/virtual-machines/linux/using-cloud-init)
     * 
     */
    @Import(name="customData")
      private final @Nullable Output<String> customData;

    public Output<String> getCustomData() {
        return this.customData == null ? Codegen.empty() : this.customData;
    }

    /**
     * Specifies the Linux operating system settings on the virtual machine. <br><br>For a list of supported Linux distributions, see [Linux on Azure-Endorsed Distributions](https://docs.microsoft.com/azure/virtual-machines/linux/endorsed-distros).
     * 
     */
    @Import(name="linuxConfiguration")
      private final @Nullable Output<LinuxConfigurationArgs> linuxConfiguration;

    public Output<LinuxConfigurationArgs> getLinuxConfiguration() {
        return this.linuxConfiguration == null ? Codegen.empty() : this.linuxConfiguration;
    }

    /**
     * Specifies set of certificates that should be installed onto the virtual machines in the scale set. To install certificates on a virtual machine it is recommended to use the [Azure Key Vault virtual machine extension for Linux](https://docs.microsoft.com/azure/virtual-machines/extensions/key-vault-linux) or the [Azure Key Vault virtual machine extension for Windows](https://docs.microsoft.com/azure/virtual-machines/extensions/key-vault-windows).
     * 
     */
    @Import(name="secrets")
      private final @Nullable Output<List<VaultSecretGroupArgs>> secrets;

    public Output<List<VaultSecretGroupArgs>> getSecrets() {
        return this.secrets == null ? Codegen.empty() : this.secrets;
    }

    /**
     * Specifies Windows operating system settings on the virtual machine.
     * 
     */
    @Import(name="windowsConfiguration")
      private final @Nullable Output<WindowsConfigurationArgs> windowsConfiguration;

    public Output<WindowsConfigurationArgs> getWindowsConfiguration() {
        return this.windowsConfiguration == null ? Codegen.empty() : this.windowsConfiguration;
    }

    public VirtualMachineScaleSetOSProfileArgs(
        @Nullable Output<String> adminPassword,
        @Nullable Output<String> adminUsername,
        @Nullable Output<String> computerNamePrefix,
        @Nullable Output<String> customData,
        @Nullable Output<LinuxConfigurationArgs> linuxConfiguration,
        @Nullable Output<List<VaultSecretGroupArgs>> secrets,
        @Nullable Output<WindowsConfigurationArgs> windowsConfiguration) {
        this.adminPassword = adminPassword;
        this.adminUsername = adminUsername;
        this.computerNamePrefix = computerNamePrefix;
        this.customData = customData;
        this.linuxConfiguration = linuxConfiguration;
        this.secrets = secrets;
        this.windowsConfiguration = windowsConfiguration;
    }

    private VirtualMachineScaleSetOSProfileArgs() {
        this.adminPassword = Codegen.empty();
        this.adminUsername = Codegen.empty();
        this.computerNamePrefix = Codegen.empty();
        this.customData = Codegen.empty();
        this.linuxConfiguration = Codegen.empty();
        this.secrets = Codegen.empty();
        this.windowsConfiguration = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetOSProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> adminPassword;
        private @Nullable Output<String> adminUsername;
        private @Nullable Output<String> computerNamePrefix;
        private @Nullable Output<String> customData;
        private @Nullable Output<LinuxConfigurationArgs> linuxConfiguration;
        private @Nullable Output<List<VaultSecretGroupArgs>> secrets;
        private @Nullable Output<WindowsConfigurationArgs> windowsConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetOSProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminPassword = defaults.adminPassword;
    	      this.adminUsername = defaults.adminUsername;
    	      this.computerNamePrefix = defaults.computerNamePrefix;
    	      this.customData = defaults.customData;
    	      this.linuxConfiguration = defaults.linuxConfiguration;
    	      this.secrets = defaults.secrets;
    	      this.windowsConfiguration = defaults.windowsConfiguration;
        }

        public Builder adminPassword(@Nullable Output<String> adminPassword) {
            this.adminPassword = adminPassword;
            return this;
        }
        public Builder adminPassword(@Nullable String adminPassword) {
            this.adminPassword = Codegen.ofNullable(adminPassword);
            return this;
        }
        public Builder adminUsername(@Nullable Output<String> adminUsername) {
            this.adminUsername = adminUsername;
            return this;
        }
        public Builder adminUsername(@Nullable String adminUsername) {
            this.adminUsername = Codegen.ofNullable(adminUsername);
            return this;
        }
        public Builder computerNamePrefix(@Nullable Output<String> computerNamePrefix) {
            this.computerNamePrefix = computerNamePrefix;
            return this;
        }
        public Builder computerNamePrefix(@Nullable String computerNamePrefix) {
            this.computerNamePrefix = Codegen.ofNullable(computerNamePrefix);
            return this;
        }
        public Builder customData(@Nullable Output<String> customData) {
            this.customData = customData;
            return this;
        }
        public Builder customData(@Nullable String customData) {
            this.customData = Codegen.ofNullable(customData);
            return this;
        }
        public Builder linuxConfiguration(@Nullable Output<LinuxConfigurationArgs> linuxConfiguration) {
            this.linuxConfiguration = linuxConfiguration;
            return this;
        }
        public Builder linuxConfiguration(@Nullable LinuxConfigurationArgs linuxConfiguration) {
            this.linuxConfiguration = Codegen.ofNullable(linuxConfiguration);
            return this;
        }
        public Builder secrets(@Nullable Output<List<VaultSecretGroupArgs>> secrets) {
            this.secrets = secrets;
            return this;
        }
        public Builder secrets(@Nullable List<VaultSecretGroupArgs> secrets) {
            this.secrets = Codegen.ofNullable(secrets);
            return this;
        }
        public Builder secrets(VaultSecretGroupArgs... secrets) {
            return secrets(List.of(secrets));
        }
        public Builder windowsConfiguration(@Nullable Output<WindowsConfigurationArgs> windowsConfiguration) {
            this.windowsConfiguration = windowsConfiguration;
            return this;
        }
        public Builder windowsConfiguration(@Nullable WindowsConfigurationArgs windowsConfiguration) {
            this.windowsConfiguration = Codegen.ofNullable(windowsConfiguration);
            return this;
        }        public VirtualMachineScaleSetOSProfileArgs build() {
            return new VirtualMachineScaleSetOSProfileArgs(adminPassword, adminUsername, computerNamePrefix, customData, linuxConfiguration, secrets, windowsConfiguration);
        }
    }
}
