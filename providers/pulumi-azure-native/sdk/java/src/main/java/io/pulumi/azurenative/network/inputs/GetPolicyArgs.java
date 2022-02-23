// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPolicyArgs Empty = new GetPolicyArgs();

    /**
     * The name of the Web Application Firewall Policy.
     * 
     */
    @InputImport(name="policyName", required=true)
      private final String policyName;

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetPolicyArgs(
        String policyName,
        String resourceGroupName) {
        this.policyName = Objects.requireNonNull(policyName, "expected parameter 'policyName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetPolicyArgs() {
        this.policyName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String policyName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policyName = defaults.policyName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setPolicyName(String policyName) {
            this.policyName = Objects.requireNonNull(policyName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetPolicyArgs build() {
            return new GetPolicyArgs(policyName, resourceGroupName);
        }
    }
}
