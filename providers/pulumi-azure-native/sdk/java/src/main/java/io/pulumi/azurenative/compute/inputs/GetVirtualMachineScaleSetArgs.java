// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVirtualMachineScaleSetArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetVirtualMachineScaleSetArgs Empty = new GetVirtualMachineScaleSetArgs();

    /**
     * The expand expression to apply on the operation. 'UserData' retrieves the UserData property of the VM scale set that was provided by the user during the VM scale set Create/Update operation
     * 
     */
    @Import(name="expand")
      private final @Nullable String expand;

    public Optional<String> getExpand() {
        return this.expand == null ? Optional.empty() : Optional.ofNullable(this.expand);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the VM scale set.
     * 
     */
    @Import(name="vmScaleSetName", required=true)
      private final String vmScaleSetName;

    public String getVmScaleSetName() {
        return this.vmScaleSetName;
    }

    public GetVirtualMachineScaleSetArgs(
        @Nullable String expand,
        String resourceGroupName,
        String vmScaleSetName) {
        this.expand = expand;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.vmScaleSetName = Objects.requireNonNull(vmScaleSetName, "expected parameter 'vmScaleSetName' to be non-null");
    }

    private GetVirtualMachineScaleSetArgs() {
        this.expand = null;
        this.resourceGroupName = null;
        this.vmScaleSetName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualMachineScaleSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expand;
        private String resourceGroupName;
        private String vmScaleSetName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualMachineScaleSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expand = defaults.expand;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.vmScaleSetName = defaults.vmScaleSetName;
        }

        public Builder expand(@Nullable String expand) {
            this.expand = expand;
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder vmScaleSetName(String vmScaleSetName) {
            this.vmScaleSetName = Objects.requireNonNull(vmScaleSetName);
            return this;
        }        public GetVirtualMachineScaleSetArgs build() {
            return new GetVirtualMachineScaleSetArgs(expand, resourceGroupName, vmScaleSetName);
        }
    }
}
