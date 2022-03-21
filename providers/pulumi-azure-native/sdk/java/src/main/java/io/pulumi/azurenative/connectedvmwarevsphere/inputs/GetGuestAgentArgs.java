// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetGuestAgentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetGuestAgentArgs Empty = new GetGuestAgentArgs();

    /**
     * Name of the GuestAgent.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The Resource Group Name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the vm.
     * 
     */
    @Import(name="virtualMachineName", required=true)
      private final String virtualMachineName;

    public String getVirtualMachineName() {
        return this.virtualMachineName;
    }

    public GetGuestAgentArgs(
        String name,
        String resourceGroupName,
        String virtualMachineName) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.virtualMachineName = Objects.requireNonNull(virtualMachineName, "expected parameter 'virtualMachineName' to be non-null");
    }

    private GetGuestAgentArgs() {
        this.name = null;
        this.resourceGroupName = null;
        this.virtualMachineName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGuestAgentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String resourceGroupName;
        private String virtualMachineName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGuestAgentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.virtualMachineName = defaults.virtualMachineName;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder virtualMachineName(String virtualMachineName) {
            this.virtualMachineName = Objects.requireNonNull(virtualMachineName);
            return this;
        }        public GetGuestAgentArgs build() {
            return new GetGuestAgentArgs(name, resourceGroupName, virtualMachineName);
        }
    }
}
