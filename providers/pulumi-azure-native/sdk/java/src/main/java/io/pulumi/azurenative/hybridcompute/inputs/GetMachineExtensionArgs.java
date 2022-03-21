// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridcompute.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetMachineExtensionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetMachineExtensionArgs Empty = new GetMachineExtensionArgs();

    /**
     * The name of the machine extension.
     * 
     */
    @Import(name="extensionName", required=true)
      private final String extensionName;

    public String getExtensionName() {
        return this.extensionName;
    }

    /**
     * The name of the machine containing the extension.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
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

    public GetMachineExtensionArgs(
        String extensionName,
        String name,
        String resourceGroupName) {
        this.extensionName = Objects.requireNonNull(extensionName, "expected parameter 'extensionName' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetMachineExtensionArgs() {
        this.extensionName = null;
        this.name = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMachineExtensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String extensionName;
        private String name;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMachineExtensionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extensionName = defaults.extensionName;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder extensionName(String extensionName) {
            this.extensionName = Objects.requireNonNull(extensionName);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetMachineExtensionArgs build() {
            return new GetMachineExtensionArgs(extensionName, name, resourceGroupName);
        }
    }
}
