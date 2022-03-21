// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsJupyterServerAppSettingsGetArgs;
import io.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsKernelGatewayAppSettingsGetArgs;
import io.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsSharingSettingsGetArgs;
import io.pulumi.aws.sagemaker.inputs.DomainDefaultUserSettingsTensorBoardAppSettingsGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainDefaultUserSettingsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainDefaultUserSettingsGetArgs Empty = new DomainDefaultUserSettingsGetArgs();

    /**
     * The execution role ARN for the user.
     * 
     */
    @Import(name="executionRole", required=true)
      private final Output<String> executionRole;

    public Output<String> getExecutionRole() {
        return this.executionRole;
    }

    /**
     * The Jupyter server's app settings. See Jupyter Server App Settings below.
     * 
     */
    @Import(name="jupyterServerAppSettings")
      private final @Nullable Output<DomainDefaultUserSettingsJupyterServerAppSettingsGetArgs> jupyterServerAppSettings;

    public Output<DomainDefaultUserSettingsJupyterServerAppSettingsGetArgs> getJupyterServerAppSettings() {
        return this.jupyterServerAppSettings == null ? Output.empty() : this.jupyterServerAppSettings;
    }

    /**
     * The kernel gateway app settings. See Kernel Gateway App Settings below.
     * 
     */
    @Import(name="kernelGatewayAppSettings")
      private final @Nullable Output<DomainDefaultUserSettingsKernelGatewayAppSettingsGetArgs> kernelGatewayAppSettings;

    public Output<DomainDefaultUserSettingsKernelGatewayAppSettingsGetArgs> getKernelGatewayAppSettings() {
        return this.kernelGatewayAppSettings == null ? Output.empty() : this.kernelGatewayAppSettings;
    }

    /**
     * The security groups.
     * 
     */
    @Import(name="securityGroups")
      private final @Nullable Output<List<String>> securityGroups;

    public Output<List<String>> getSecurityGroups() {
        return this.securityGroups == null ? Output.empty() : this.securityGroups;
    }

    /**
     * The sharing settings. See Sharing Settings below.
     * 
     */
    @Import(name="sharingSettings")
      private final @Nullable Output<DomainDefaultUserSettingsSharingSettingsGetArgs> sharingSettings;

    public Output<DomainDefaultUserSettingsSharingSettingsGetArgs> getSharingSettings() {
        return this.sharingSettings == null ? Output.empty() : this.sharingSettings;
    }

    /**
     * The TensorBoard app settings. See TensorBoard App Settings below.
     * 
     */
    @Import(name="tensorBoardAppSettings")
      private final @Nullable Output<DomainDefaultUserSettingsTensorBoardAppSettingsGetArgs> tensorBoardAppSettings;

    public Output<DomainDefaultUserSettingsTensorBoardAppSettingsGetArgs> getTensorBoardAppSettings() {
        return this.tensorBoardAppSettings == null ? Output.empty() : this.tensorBoardAppSettings;
    }

    public DomainDefaultUserSettingsGetArgs(
        Output<String> executionRole,
        @Nullable Output<DomainDefaultUserSettingsJupyterServerAppSettingsGetArgs> jupyterServerAppSettings,
        @Nullable Output<DomainDefaultUserSettingsKernelGatewayAppSettingsGetArgs> kernelGatewayAppSettings,
        @Nullable Output<List<String>> securityGroups,
        @Nullable Output<DomainDefaultUserSettingsSharingSettingsGetArgs> sharingSettings,
        @Nullable Output<DomainDefaultUserSettingsTensorBoardAppSettingsGetArgs> tensorBoardAppSettings) {
        this.executionRole = Objects.requireNonNull(executionRole, "expected parameter 'executionRole' to be non-null");
        this.jupyterServerAppSettings = jupyterServerAppSettings;
        this.kernelGatewayAppSettings = kernelGatewayAppSettings;
        this.securityGroups = securityGroups;
        this.sharingSettings = sharingSettings;
        this.tensorBoardAppSettings = tensorBoardAppSettings;
    }

    private DomainDefaultUserSettingsGetArgs() {
        this.executionRole = Output.empty();
        this.jupyterServerAppSettings = Output.empty();
        this.kernelGatewayAppSettings = Output.empty();
        this.securityGroups = Output.empty();
        this.sharingSettings = Output.empty();
        this.tensorBoardAppSettings = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainDefaultUserSettingsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> executionRole;
        private @Nullable Output<DomainDefaultUserSettingsJupyterServerAppSettingsGetArgs> jupyterServerAppSettings;
        private @Nullable Output<DomainDefaultUserSettingsKernelGatewayAppSettingsGetArgs> kernelGatewayAppSettings;
        private @Nullable Output<List<String>> securityGroups;
        private @Nullable Output<DomainDefaultUserSettingsSharingSettingsGetArgs> sharingSettings;
        private @Nullable Output<DomainDefaultUserSettingsTensorBoardAppSettingsGetArgs> tensorBoardAppSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainDefaultUserSettingsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executionRole = defaults.executionRole;
    	      this.jupyterServerAppSettings = defaults.jupyterServerAppSettings;
    	      this.kernelGatewayAppSettings = defaults.kernelGatewayAppSettings;
    	      this.securityGroups = defaults.securityGroups;
    	      this.sharingSettings = defaults.sharingSettings;
    	      this.tensorBoardAppSettings = defaults.tensorBoardAppSettings;
        }

        public Builder executionRole(Output<String> executionRole) {
            this.executionRole = Objects.requireNonNull(executionRole);
            return this;
        }
        public Builder executionRole(String executionRole) {
            this.executionRole = Output.of(Objects.requireNonNull(executionRole));
            return this;
        }
        public Builder jupyterServerAppSettings(@Nullable Output<DomainDefaultUserSettingsJupyterServerAppSettingsGetArgs> jupyterServerAppSettings) {
            this.jupyterServerAppSettings = jupyterServerAppSettings;
            return this;
        }
        public Builder jupyterServerAppSettings(@Nullable DomainDefaultUserSettingsJupyterServerAppSettingsGetArgs jupyterServerAppSettings) {
            this.jupyterServerAppSettings = Output.ofNullable(jupyterServerAppSettings);
            return this;
        }
        public Builder kernelGatewayAppSettings(@Nullable Output<DomainDefaultUserSettingsKernelGatewayAppSettingsGetArgs> kernelGatewayAppSettings) {
            this.kernelGatewayAppSettings = kernelGatewayAppSettings;
            return this;
        }
        public Builder kernelGatewayAppSettings(@Nullable DomainDefaultUserSettingsKernelGatewayAppSettingsGetArgs kernelGatewayAppSettings) {
            this.kernelGatewayAppSettings = Output.ofNullable(kernelGatewayAppSettings);
            return this;
        }
        public Builder securityGroups(@Nullable Output<List<String>> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }
        public Builder securityGroups(@Nullable List<String> securityGroups) {
            this.securityGroups = Output.ofNullable(securityGroups);
            return this;
        }
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }
        public Builder sharingSettings(@Nullable Output<DomainDefaultUserSettingsSharingSettingsGetArgs> sharingSettings) {
            this.sharingSettings = sharingSettings;
            return this;
        }
        public Builder sharingSettings(@Nullable DomainDefaultUserSettingsSharingSettingsGetArgs sharingSettings) {
            this.sharingSettings = Output.ofNullable(sharingSettings);
            return this;
        }
        public Builder tensorBoardAppSettings(@Nullable Output<DomainDefaultUserSettingsTensorBoardAppSettingsGetArgs> tensorBoardAppSettings) {
            this.tensorBoardAppSettings = tensorBoardAppSettings;
            return this;
        }
        public Builder tensorBoardAppSettings(@Nullable DomainDefaultUserSettingsTensorBoardAppSettingsGetArgs tensorBoardAppSettings) {
            this.tensorBoardAppSettings = Output.ofNullable(tensorBoardAppSettings);
            return this;
        }        public DomainDefaultUserSettingsGetArgs build() {
            return new DomainDefaultUserSettingsGetArgs(executionRole, jupyterServerAppSettings, kernelGatewayAppSettings, securityGroups, sharingSettings, tensorBoardAppSettings);
        }
    }
}
