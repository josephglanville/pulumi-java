// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.enums.LinuxPatchAssessmentMode;
import io.pulumi.azurenative.compute.enums.LinuxVMGuestPatchMode;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies settings related to VM Guest Patching on Linux.
 * 
 */
public final class LinuxPatchSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final LinuxPatchSettingsArgs Empty = new LinuxPatchSettingsArgs();

    /**
     * Specifies the mode of VM Guest Patch Assessment for the IaaS virtual machine.<br /><br /> Possible values are:<br /><br /> **ImageDefault** - You control the timing of patch assessments on a virtual machine. <br /><br /> **AutomaticByPlatform** - The platform will trigger periodic patch assessments. The property provisionVMAgent must be true.
     * 
     */
    @Import(name="assessmentMode")
      private final @Nullable Output<Either<String,LinuxPatchAssessmentMode>> assessmentMode;

    public Output<Either<String,LinuxPatchAssessmentMode>> getAssessmentMode() {
        return this.assessmentMode == null ? Codegen.empty() : this.assessmentMode;
    }

    /**
     * Specifies the mode of VM Guest Patching to IaaS virtual machine or virtual machines associated to virtual machine scale set with OrchestrationMode as Flexible.<br /><br /> Possible values are:<br /><br /> **ImageDefault** - The virtual machine's default patching configuration is used. <br /><br /> **AutomaticByPlatform** - The virtual machine will be automatically updated by the platform. The property provisionVMAgent must be true
     * 
     */
    @Import(name="patchMode")
      private final @Nullable Output<Either<String,LinuxVMGuestPatchMode>> patchMode;

    public Output<Either<String,LinuxVMGuestPatchMode>> getPatchMode() {
        return this.patchMode == null ? Codegen.empty() : this.patchMode;
    }

    public LinuxPatchSettingsArgs(
        @Nullable Output<Either<String,LinuxPatchAssessmentMode>> assessmentMode,
        @Nullable Output<Either<String,LinuxVMGuestPatchMode>> patchMode) {
        this.assessmentMode = assessmentMode;
        this.patchMode = patchMode;
    }

    private LinuxPatchSettingsArgs() {
        this.assessmentMode = Codegen.empty();
        this.patchMode = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinuxPatchSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,LinuxPatchAssessmentMode>> assessmentMode;
        private @Nullable Output<Either<String,LinuxVMGuestPatchMode>> patchMode;

        public Builder() {
    	      // Empty
        }

        public Builder(LinuxPatchSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assessmentMode = defaults.assessmentMode;
    	      this.patchMode = defaults.patchMode;
        }

        public Builder assessmentMode(@Nullable Output<Either<String,LinuxPatchAssessmentMode>> assessmentMode) {
            this.assessmentMode = assessmentMode;
            return this;
        }
        public Builder assessmentMode(@Nullable Either<String,LinuxPatchAssessmentMode> assessmentMode) {
            this.assessmentMode = Codegen.ofNullable(assessmentMode);
            return this;
        }
        public Builder patchMode(@Nullable Output<Either<String,LinuxVMGuestPatchMode>> patchMode) {
            this.patchMode = patchMode;
            return this;
        }
        public Builder patchMode(@Nullable Either<String,LinuxVMGuestPatchMode> patchMode) {
            this.patchMode = Codegen.ofNullable(patchMode);
            return this;
        }        public LinuxPatchSettingsArgs build() {
            return new LinuxPatchSettingsArgs(assessmentMode, patchMode);
        }
    }
}
