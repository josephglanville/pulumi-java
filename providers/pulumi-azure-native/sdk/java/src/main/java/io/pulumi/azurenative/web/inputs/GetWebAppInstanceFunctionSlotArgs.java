// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetWebAppInstanceFunctionSlotArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetWebAppInstanceFunctionSlotArgs Empty = new GetWebAppInstanceFunctionSlotArgs();

    /**
     * Function name.
     * 
     */
    @InputImport(name="functionName", required=true)
      private final String functionName;

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * Site name.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the deployment slot.
     * 
     */
    @InputImport(name="slot", required=true)
      private final String slot;

    public String getSlot() {
        return this.slot;
    }

    public GetWebAppInstanceFunctionSlotArgs(
        String functionName,
        String name,
        String resourceGroupName,
        String slot) {
        this.functionName = Objects.requireNonNull(functionName, "expected parameter 'functionName' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.slot = Objects.requireNonNull(slot, "expected parameter 'slot' to be non-null");
    }

    private GetWebAppInstanceFunctionSlotArgs() {
        this.functionName = null;
        this.name = null;
        this.resourceGroupName = null;
        this.slot = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppInstanceFunctionSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String functionName;
        private String name;
        private String resourceGroupName;
        private String slot;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppInstanceFunctionSlotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionName = defaults.functionName;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.slot = defaults.slot;
        }

        public Builder setFunctionName(String functionName) {
            this.functionName = Objects.requireNonNull(functionName);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setSlot(String slot) {
            this.slot = Objects.requireNonNull(slot);
            return this;
        }
        public GetWebAppInstanceFunctionSlotArgs build() {
            return new GetWebAppInstanceFunctionSlotArgs(functionName, name, resourceGroupName, slot);
        }
    }
}
