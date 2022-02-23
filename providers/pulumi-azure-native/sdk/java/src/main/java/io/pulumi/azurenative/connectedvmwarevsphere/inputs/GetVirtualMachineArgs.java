// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetVirtualMachineArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetVirtualMachineArgs Empty = new GetVirtualMachineArgs();

    /**
     * The Resource Group Name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the virtual machine resource.
     * 
     */
    @InputImport(name="virtualMachineName", required=true)
      private final String virtualMachineName;

    public String getVirtualMachineName() {
        return this.virtualMachineName;
    }

    public GetVirtualMachineArgs(
        String resourceGroupName,
        String virtualMachineName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.virtualMachineName = Objects.requireNonNull(virtualMachineName, "expected parameter 'virtualMachineName' to be non-null");
    }

    private GetVirtualMachineArgs() {
        this.resourceGroupName = null;
        this.virtualMachineName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualMachineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String virtualMachineName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualMachineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.virtualMachineName = defaults.virtualMachineName;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setVirtualMachineName(String virtualMachineName) {
            this.virtualMachineName = Objects.requireNonNull(virtualMachineName);
            return this;
        }
        public GetVirtualMachineArgs build() {
            return new GetVirtualMachineArgs(resourceGroupName, virtualMachineName);
        }
    }
}
