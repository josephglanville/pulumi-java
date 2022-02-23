// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVirtualMachineScaleSetVMArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetVirtualMachineScaleSetVMArgs Empty = new GetVirtualMachineScaleSetVMArgs();

    /**
     * The expand expression to apply on the operation. 'InstanceView' will retrieve the instance view of the virtual machine. 'UserData' will retrieve the UserData of the virtual machine.
     * 
     */
    @InputImport(name="expand")
      private final @Nullable String expand;

    public Optional<String> getExpand() {
        return this.expand == null ? Optional.empty() : Optional.ofNullable(this.expand);
    }

    /**
     * The instance ID of the virtual machine.
     * 
     */
    @InputImport(name="instanceId", required=true)
      private final String instanceId;

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the VM scale set.
     * 
     */
    @InputImport(name="vmScaleSetName", required=true)
      private final String vmScaleSetName;

    public String getVmScaleSetName() {
        return this.vmScaleSetName;
    }

    public GetVirtualMachineScaleSetVMArgs(
        @Nullable String expand,
        String instanceId,
        String resourceGroupName,
        String vmScaleSetName) {
        this.expand = expand;
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.vmScaleSetName = Objects.requireNonNull(vmScaleSetName, "expected parameter 'vmScaleSetName' to be non-null");
    }

    private GetVirtualMachineScaleSetVMArgs() {
        this.expand = null;
        this.instanceId = null;
        this.resourceGroupName = null;
        this.vmScaleSetName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualMachineScaleSetVMArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expand;
        private String instanceId;
        private String resourceGroupName;
        private String vmScaleSetName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualMachineScaleSetVMArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expand = defaults.expand;
    	      this.instanceId = defaults.instanceId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.vmScaleSetName = defaults.vmScaleSetName;
        }

        public Builder setExpand(@Nullable String expand) {
            this.expand = expand;
            return this;
        }

        public Builder setInstanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setVmScaleSetName(String vmScaleSetName) {
            this.vmScaleSetName = Objects.requireNonNull(vmScaleSetName);
            return this;
        }
        public GetVirtualMachineScaleSetVMArgs build() {
            return new GetVirtualMachineScaleSetVMArgs(expand, instanceId, resourceGroupName, vmScaleSetName);
        }
    }
}
