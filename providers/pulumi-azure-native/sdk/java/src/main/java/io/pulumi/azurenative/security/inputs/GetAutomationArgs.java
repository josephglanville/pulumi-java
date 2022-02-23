// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetAutomationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAutomationArgs Empty = new GetAutomationArgs();

    /**
     * The security automation name.
     * 
     */
    @InputImport(name="automationName", required=true)
      private final String automationName;

    public String getAutomationName() {
        return this.automationName;
    }

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetAutomationArgs(
        String automationName,
        String resourceGroupName) {
        this.automationName = Objects.requireNonNull(automationName, "expected parameter 'automationName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetAutomationArgs() {
        this.automationName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAutomationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String automationName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAutomationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automationName = defaults.automationName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAutomationName(String automationName) {
            this.automationName = Objects.requireNonNull(automationName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetAutomationArgs build() {
            return new GetAutomationArgs(automationName, resourceGroupName);
        }
    }
}
