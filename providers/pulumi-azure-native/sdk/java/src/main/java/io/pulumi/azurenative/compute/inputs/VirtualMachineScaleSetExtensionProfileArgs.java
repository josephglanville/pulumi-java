// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.VirtualMachineScaleSetExtensionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a virtual machine scale set extension profile.
 * 
 */
public final class VirtualMachineScaleSetExtensionProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualMachineScaleSetExtensionProfileArgs Empty = new VirtualMachineScaleSetExtensionProfileArgs();

    /**
     * The virtual machine scale set child extension resources.
     * 
     */
    @Import(name="extensions")
      private final @Nullable Output<List<VirtualMachineScaleSetExtensionArgs>> extensions;

    public Output<List<VirtualMachineScaleSetExtensionArgs>> getExtensions() {
        return this.extensions == null ? Output.empty() : this.extensions;
    }

    /**
     * Specifies the time alloted for all extensions to start. The time duration should be between 15 minutes and 120 minutes (inclusive) and should be specified in ISO 8601 format. The default value is 90 minutes (PT1H30M). <br><br> Minimum api-version: 2020-06-01
     * 
     */
    @Import(name="extensionsTimeBudget")
      private final @Nullable Output<String> extensionsTimeBudget;

    public Output<String> getExtensionsTimeBudget() {
        return this.extensionsTimeBudget == null ? Output.empty() : this.extensionsTimeBudget;
    }

    public VirtualMachineScaleSetExtensionProfileArgs(
        @Nullable Output<List<VirtualMachineScaleSetExtensionArgs>> extensions,
        @Nullable Output<String> extensionsTimeBudget) {
        this.extensions = extensions;
        this.extensionsTimeBudget = extensionsTimeBudget;
    }

    private VirtualMachineScaleSetExtensionProfileArgs() {
        this.extensions = Output.empty();
        this.extensionsTimeBudget = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetExtensionProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<VirtualMachineScaleSetExtensionArgs>> extensions;
        private @Nullable Output<String> extensionsTimeBudget;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetExtensionProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extensions = defaults.extensions;
    	      this.extensionsTimeBudget = defaults.extensionsTimeBudget;
        }

        public Builder extensions(@Nullable Output<List<VirtualMachineScaleSetExtensionArgs>> extensions) {
            this.extensions = extensions;
            return this;
        }
        public Builder extensions(@Nullable List<VirtualMachineScaleSetExtensionArgs> extensions) {
            this.extensions = Output.ofNullable(extensions);
            return this;
        }
        public Builder extensions(VirtualMachineScaleSetExtensionArgs... extensions) {
            return extensions(List.of(extensions));
        }
        public Builder extensionsTimeBudget(@Nullable Output<String> extensionsTimeBudget) {
            this.extensionsTimeBudget = extensionsTimeBudget;
            return this;
        }
        public Builder extensionsTimeBudget(@Nullable String extensionsTimeBudget) {
            this.extensionsTimeBudget = Output.ofNullable(extensionsTimeBudget);
            return this;
        }        public VirtualMachineScaleSetExtensionProfileArgs build() {
            return new VirtualMachineScaleSetExtensionProfileArgs(extensions, extensionsTimeBudget);
        }
    }
}
