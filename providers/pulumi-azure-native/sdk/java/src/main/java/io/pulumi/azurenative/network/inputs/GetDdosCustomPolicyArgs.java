// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetDdosCustomPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDdosCustomPolicyArgs Empty = new GetDdosCustomPolicyArgs();

    /**
     * The name of the DDoS custom policy.
     * 
     */
    @InputImport(name="ddosCustomPolicyName", required=true)
      private final String ddosCustomPolicyName;

    public String getDdosCustomPolicyName() {
        return this.ddosCustomPolicyName;
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

    public GetDdosCustomPolicyArgs(
        String ddosCustomPolicyName,
        String resourceGroupName) {
        this.ddosCustomPolicyName = Objects.requireNonNull(ddosCustomPolicyName, "expected parameter 'ddosCustomPolicyName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetDdosCustomPolicyArgs() {
        this.ddosCustomPolicyName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDdosCustomPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ddosCustomPolicyName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDdosCustomPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ddosCustomPolicyName = defaults.ddosCustomPolicyName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setDdosCustomPolicyName(String ddosCustomPolicyName) {
            this.ddosCustomPolicyName = Objects.requireNonNull(ddosCustomPolicyName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetDdosCustomPolicyArgs build() {
            return new GetDdosCustomPolicyArgs(ddosCustomPolicyName, resourceGroupName);
        }
    }
}
