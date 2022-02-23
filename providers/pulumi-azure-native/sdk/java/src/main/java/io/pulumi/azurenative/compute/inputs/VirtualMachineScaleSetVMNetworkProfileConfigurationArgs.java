// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.VirtualMachineScaleSetNetworkConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a virtual machine scale set VM network profile.
 * 
 */
public final class VirtualMachineScaleSetVMNetworkProfileConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualMachineScaleSetVMNetworkProfileConfigurationArgs Empty = new VirtualMachineScaleSetVMNetworkProfileConfigurationArgs();

    /**
     * The list of network configurations.
     * 
     */
    @InputImport(name="networkInterfaceConfigurations")
      private final @Nullable Input<List<VirtualMachineScaleSetNetworkConfigurationArgs>> networkInterfaceConfigurations;

    public Input<List<VirtualMachineScaleSetNetworkConfigurationArgs>> getNetworkInterfaceConfigurations() {
        return this.networkInterfaceConfigurations == null ? Input.empty() : this.networkInterfaceConfigurations;
    }

    public VirtualMachineScaleSetVMNetworkProfileConfigurationArgs(@Nullable Input<List<VirtualMachineScaleSetNetworkConfigurationArgs>> networkInterfaceConfigurations) {
        this.networkInterfaceConfigurations = networkInterfaceConfigurations;
    }

    private VirtualMachineScaleSetVMNetworkProfileConfigurationArgs() {
        this.networkInterfaceConfigurations = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetVMNetworkProfileConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<VirtualMachineScaleSetNetworkConfigurationArgs>> networkInterfaceConfigurations;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetVMNetworkProfileConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkInterfaceConfigurations = defaults.networkInterfaceConfigurations;
        }

        public Builder setNetworkInterfaceConfigurations(@Nullable Input<List<VirtualMachineScaleSetNetworkConfigurationArgs>> networkInterfaceConfigurations) {
            this.networkInterfaceConfigurations = networkInterfaceConfigurations;
            return this;
        }

        public Builder setNetworkInterfaceConfigurations(@Nullable List<VirtualMachineScaleSetNetworkConfigurationArgs> networkInterfaceConfigurations) {
            this.networkInterfaceConfigurations = Input.ofNullable(networkInterfaceConfigurations);
            return this;
        }
        public VirtualMachineScaleSetVMNetworkProfileConfigurationArgs build() {
            return new VirtualMachineScaleSetVMNetworkProfileConfigurationArgs(networkInterfaceConfigurations);
        }
    }
}
