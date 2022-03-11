// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The protection policy of a virtual machine scale set VM.
 * 
 */
public final class VirtualMachineScaleSetVMProtectionPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualMachineScaleSetVMProtectionPolicyArgs Empty = new VirtualMachineScaleSetVMProtectionPolicyArgs();

    /**
     * Indicates that the virtual machine scale set VM shouldn't be considered for deletion during a scale-in operation.
     * 
     */
    @InputImport(name="protectFromScaleIn")
      private final @Nullable Output<Boolean> protectFromScaleIn;

    public Output<Boolean> getProtectFromScaleIn() {
        return this.protectFromScaleIn == null ? Output.empty() : this.protectFromScaleIn;
    }

    /**
     * Indicates that model updates or actions (including scale-in) initiated on the virtual machine scale set should not be applied to the virtual machine scale set VM.
     * 
     */
    @InputImport(name="protectFromScaleSetActions")
      private final @Nullable Output<Boolean> protectFromScaleSetActions;

    public Output<Boolean> getProtectFromScaleSetActions() {
        return this.protectFromScaleSetActions == null ? Output.empty() : this.protectFromScaleSetActions;
    }

    public VirtualMachineScaleSetVMProtectionPolicyArgs(
        @Nullable Output<Boolean> protectFromScaleIn,
        @Nullable Output<Boolean> protectFromScaleSetActions) {
        this.protectFromScaleIn = protectFromScaleIn;
        this.protectFromScaleSetActions = protectFromScaleSetActions;
    }

    private VirtualMachineScaleSetVMProtectionPolicyArgs() {
        this.protectFromScaleIn = Output.empty();
        this.protectFromScaleSetActions = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetVMProtectionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> protectFromScaleIn;
        private @Nullable Output<Boolean> protectFromScaleSetActions;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetVMProtectionPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.protectFromScaleIn = defaults.protectFromScaleIn;
    	      this.protectFromScaleSetActions = defaults.protectFromScaleSetActions;
        }

        public Builder protectFromScaleIn(@Nullable Output<Boolean> protectFromScaleIn) {
            this.protectFromScaleIn = protectFromScaleIn;
            return this;
        }

        public Builder protectFromScaleIn(@Nullable Boolean protectFromScaleIn) {
            this.protectFromScaleIn = Output.ofNullable(protectFromScaleIn);
            return this;
        }

        public Builder protectFromScaleSetActions(@Nullable Output<Boolean> protectFromScaleSetActions) {
            this.protectFromScaleSetActions = protectFromScaleSetActions;
            return this;
        }

        public Builder protectFromScaleSetActions(@Nullable Boolean protectFromScaleSetActions) {
            this.protectFromScaleSetActions = Output.ofNullable(protectFromScaleSetActions);
            return this;
        }
        public VirtualMachineScaleSetVMProtectionPolicyArgs build() {
            return new VirtualMachineScaleSetVMProtectionPolicyArgs(protectFromScaleIn, protectFromScaleSetActions);
        }
    }
}
