// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVirtualMachineRunCommandByVirtualMachineArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetVirtualMachineRunCommandByVirtualMachineArgs Empty = new GetVirtualMachineRunCommandByVirtualMachineArgs();

    /**
     * The expand expression to apply on the operation.
     * 
     */
    @InputImport(name="expand")
      private final @Nullable String expand;

    public Optional<String> getExpand() {
        return this.expand == null ? Optional.empty() : Optional.ofNullable(this.expand);
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
     * The name of the virtual machine run command.
     * 
     */
    @InputImport(name="runCommandName", required=true)
      private final String runCommandName;

    public String getRunCommandName() {
        return this.runCommandName;
    }

    /**
     * The name of the virtual machine containing the run command.
     * 
     */
    @InputImport(name="vmName", required=true)
      private final String vmName;

    public String getVmName() {
        return this.vmName;
    }

    public GetVirtualMachineRunCommandByVirtualMachineArgs(
        @Nullable String expand,
        String resourceGroupName,
        String runCommandName,
        String vmName) {
        this.expand = expand;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.runCommandName = Objects.requireNonNull(runCommandName, "expected parameter 'runCommandName' to be non-null");
        this.vmName = Objects.requireNonNull(vmName, "expected parameter 'vmName' to be non-null");
    }

    private GetVirtualMachineRunCommandByVirtualMachineArgs() {
        this.expand = null;
        this.resourceGroupName = null;
        this.runCommandName = null;
        this.vmName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualMachineRunCommandByVirtualMachineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expand;
        private String resourceGroupName;
        private String runCommandName;
        private String vmName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualMachineRunCommandByVirtualMachineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expand = defaults.expand;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.runCommandName = defaults.runCommandName;
    	      this.vmName = defaults.vmName;
        }

        public Builder setExpand(@Nullable String expand) {
            this.expand = expand;
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setRunCommandName(String runCommandName) {
            this.runCommandName = Objects.requireNonNull(runCommandName);
            return this;
        }

        public Builder setVmName(String vmName) {
            this.vmName = Objects.requireNonNull(vmName);
            return this;
        }
        public GetVirtualMachineRunCommandByVirtualMachineArgs build() {
            return new GetVirtualMachineRunCommandByVirtualMachineArgs(expand, resourceGroupName, runCommandName, vmName);
        }
    }
}
