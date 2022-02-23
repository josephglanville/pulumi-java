// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.inputs.DomainJupyterServerAppSettingsArgs;
import io.pulumi.awsnative.sagemaker.inputs.DomainKernelGatewayAppSettingsArgs;
import io.pulumi.awsnative.sagemaker.inputs.DomainSharingSettingsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A collection of settings that apply to users of Amazon SageMaker Studio. These settings are specified when the CreateUserProfile API is called, and as DefaultUserSettings when the CreateDomain API is called.
 * 
 */
public final class DomainUserSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainUserSettingsArgs Empty = new DomainUserSettingsArgs();

    /**
     * The user profile Amazon Resource Name (ARN).
     * 
     */
    @InputImport(name="executionRole")
      private final @Nullable Input<String> executionRole;

    public Input<String> getExecutionRole() {
        return this.executionRole == null ? Input.empty() : this.executionRole;
    }

    /**
     * The Jupyter server's app settings.
     * 
     */
    @InputImport(name="jupyterServerAppSettings")
      private final @Nullable Input<DomainJupyterServerAppSettingsArgs> jupyterServerAppSettings;

    public Input<DomainJupyterServerAppSettingsArgs> getJupyterServerAppSettings() {
        return this.jupyterServerAppSettings == null ? Input.empty() : this.jupyterServerAppSettings;
    }

    /**
     * The kernel gateway app settings.
     * 
     */
    @InputImport(name="kernelGatewayAppSettings")
      private final @Nullable Input<DomainKernelGatewayAppSettingsArgs> kernelGatewayAppSettings;

    public Input<DomainKernelGatewayAppSettingsArgs> getKernelGatewayAppSettings() {
        return this.kernelGatewayAppSettings == null ? Input.empty() : this.kernelGatewayAppSettings;
    }

    /**
     * The security groups for the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
     * 
     */
    @InputImport(name="securityGroups")
      private final @Nullable Input<List<String>> securityGroups;

    public Input<List<String>> getSecurityGroups() {
        return this.securityGroups == null ? Input.empty() : this.securityGroups;
    }

    /**
     * The sharing settings.
     * 
     */
    @InputImport(name="sharingSettings")
      private final @Nullable Input<DomainSharingSettingsArgs> sharingSettings;

    public Input<DomainSharingSettingsArgs> getSharingSettings() {
        return this.sharingSettings == null ? Input.empty() : this.sharingSettings;
    }

    public DomainUserSettingsArgs(
        @Nullable Input<String> executionRole,
        @Nullable Input<DomainJupyterServerAppSettingsArgs> jupyterServerAppSettings,
        @Nullable Input<DomainKernelGatewayAppSettingsArgs> kernelGatewayAppSettings,
        @Nullable Input<List<String>> securityGroups,
        @Nullable Input<DomainSharingSettingsArgs> sharingSettings) {
        this.executionRole = executionRole;
        this.jupyterServerAppSettings = jupyterServerAppSettings;
        this.kernelGatewayAppSettings = kernelGatewayAppSettings;
        this.securityGroups = securityGroups;
        this.sharingSettings = sharingSettings;
    }

    private DomainUserSettingsArgs() {
        this.executionRole = Input.empty();
        this.jupyterServerAppSettings = Input.empty();
        this.kernelGatewayAppSettings = Input.empty();
        this.securityGroups = Input.empty();
        this.sharingSettings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainUserSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> executionRole;
        private @Nullable Input<DomainJupyterServerAppSettingsArgs> jupyterServerAppSettings;
        private @Nullable Input<DomainKernelGatewayAppSettingsArgs> kernelGatewayAppSettings;
        private @Nullable Input<List<String>> securityGroups;
        private @Nullable Input<DomainSharingSettingsArgs> sharingSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainUserSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executionRole = defaults.executionRole;
    	      this.jupyterServerAppSettings = defaults.jupyterServerAppSettings;
    	      this.kernelGatewayAppSettings = defaults.kernelGatewayAppSettings;
    	      this.securityGroups = defaults.securityGroups;
    	      this.sharingSettings = defaults.sharingSettings;
        }

        public Builder setExecutionRole(@Nullable Input<String> executionRole) {
            this.executionRole = executionRole;
            return this;
        }

        public Builder setExecutionRole(@Nullable String executionRole) {
            this.executionRole = Input.ofNullable(executionRole);
            return this;
        }

        public Builder setJupyterServerAppSettings(@Nullable Input<DomainJupyterServerAppSettingsArgs> jupyterServerAppSettings) {
            this.jupyterServerAppSettings = jupyterServerAppSettings;
            return this;
        }

        public Builder setJupyterServerAppSettings(@Nullable DomainJupyterServerAppSettingsArgs jupyterServerAppSettings) {
            this.jupyterServerAppSettings = Input.ofNullable(jupyterServerAppSettings);
            return this;
        }

        public Builder setKernelGatewayAppSettings(@Nullable Input<DomainKernelGatewayAppSettingsArgs> kernelGatewayAppSettings) {
            this.kernelGatewayAppSettings = kernelGatewayAppSettings;
            return this;
        }

        public Builder setKernelGatewayAppSettings(@Nullable DomainKernelGatewayAppSettingsArgs kernelGatewayAppSettings) {
            this.kernelGatewayAppSettings = Input.ofNullable(kernelGatewayAppSettings);
            return this;
        }

        public Builder setSecurityGroups(@Nullable Input<List<String>> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        public Builder setSecurityGroups(@Nullable List<String> securityGroups) {
            this.securityGroups = Input.ofNullable(securityGroups);
            return this;
        }

        public Builder setSharingSettings(@Nullable Input<DomainSharingSettingsArgs> sharingSettings) {
            this.sharingSettings = sharingSettings;
            return this;
        }

        public Builder setSharingSettings(@Nullable DomainSharingSettingsArgs sharingSettings) {
            this.sharingSettings = Input.ofNullable(sharingSettings);
            return this;
        }
        public DomainUserSettingsArgs build() {
            return new DomainUserSettingsArgs(executionRole, jupyterServerAppSettings, kernelGatewayAppSettings, securityGroups, sharingSettings);
        }
    }
}
