// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPreStepLinuxExecStepConfigGetArgs;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentPatchConfigPreStepWindowsExecStepConfigGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PatchDeploymentPatchConfigPreStepGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PatchDeploymentPatchConfigPreStepGetArgs Empty = new PatchDeploymentPatchConfigPreStepGetArgs();

    /**
     * The ExecStepConfig for all Linux VMs targeted by the PatchJob.
     * Structure is documented below.
     * 
     */
    @Import(name="linuxExecStepConfig")
      private final @Nullable Output<PatchDeploymentPatchConfigPreStepLinuxExecStepConfigGetArgs> linuxExecStepConfig;

    public Output<PatchDeploymentPatchConfigPreStepLinuxExecStepConfigGetArgs> getLinuxExecStepConfig() {
        return this.linuxExecStepConfig == null ? Codegen.empty() : this.linuxExecStepConfig;
    }

    /**
     * The ExecStepConfig for all Windows VMs targeted by the PatchJob.
     * Structure is documented below.
     * 
     */
    @Import(name="windowsExecStepConfig")
      private final @Nullable Output<PatchDeploymentPatchConfigPreStepWindowsExecStepConfigGetArgs> windowsExecStepConfig;

    public Output<PatchDeploymentPatchConfigPreStepWindowsExecStepConfigGetArgs> getWindowsExecStepConfig() {
        return this.windowsExecStepConfig == null ? Codegen.empty() : this.windowsExecStepConfig;
    }

    public PatchDeploymentPatchConfigPreStepGetArgs(
        @Nullable Output<PatchDeploymentPatchConfigPreStepLinuxExecStepConfigGetArgs> linuxExecStepConfig,
        @Nullable Output<PatchDeploymentPatchConfigPreStepWindowsExecStepConfigGetArgs> windowsExecStepConfig) {
        this.linuxExecStepConfig = linuxExecStepConfig;
        this.windowsExecStepConfig = windowsExecStepConfig;
    }

    private PatchDeploymentPatchConfigPreStepGetArgs() {
        this.linuxExecStepConfig = Codegen.empty();
        this.windowsExecStepConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentPatchConfigPreStepGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<PatchDeploymentPatchConfigPreStepLinuxExecStepConfigGetArgs> linuxExecStepConfig;
        private @Nullable Output<PatchDeploymentPatchConfigPreStepWindowsExecStepConfigGetArgs> windowsExecStepConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentPatchConfigPreStepGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linuxExecStepConfig = defaults.linuxExecStepConfig;
    	      this.windowsExecStepConfig = defaults.windowsExecStepConfig;
        }

        public Builder linuxExecStepConfig(@Nullable Output<PatchDeploymentPatchConfigPreStepLinuxExecStepConfigGetArgs> linuxExecStepConfig) {
            this.linuxExecStepConfig = linuxExecStepConfig;
            return this;
        }
        public Builder linuxExecStepConfig(@Nullable PatchDeploymentPatchConfigPreStepLinuxExecStepConfigGetArgs linuxExecStepConfig) {
            this.linuxExecStepConfig = Codegen.ofNullable(linuxExecStepConfig);
            return this;
        }
        public Builder windowsExecStepConfig(@Nullable Output<PatchDeploymentPatchConfigPreStepWindowsExecStepConfigGetArgs> windowsExecStepConfig) {
            this.windowsExecStepConfig = windowsExecStepConfig;
            return this;
        }
        public Builder windowsExecStepConfig(@Nullable PatchDeploymentPatchConfigPreStepWindowsExecStepConfigGetArgs windowsExecStepConfig) {
            this.windowsExecStepConfig = Codegen.ofNullable(windowsExecStepConfig);
            return this;
        }        public PatchDeploymentPatchConfigPreStepGetArgs build() {
            return new PatchDeploymentPatchConfigPreStepGetArgs(linuxExecStepConfig, windowsExecStepConfig);
        }
    }
}
