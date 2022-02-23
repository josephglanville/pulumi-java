// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetLabAccountRegionalAvailabilityArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetLabAccountRegionalAvailabilityArgs Empty = new GetLabAccountRegionalAvailabilityArgs();

    /**
     * The name of the lab Account.
     * 
     */
    @InputImport(name="labAccountName", required=true)
      private final String labAccountName;

    public String getLabAccountName() {
        return this.labAccountName;
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

    public GetLabAccountRegionalAvailabilityArgs(
        String labAccountName,
        String resourceGroupName) {
        this.labAccountName = Objects.requireNonNull(labAccountName, "expected parameter 'labAccountName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetLabAccountRegionalAvailabilityArgs() {
        this.labAccountName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLabAccountRegionalAvailabilityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String labAccountName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLabAccountRegionalAvailabilityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labAccountName = defaults.labAccountName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setLabAccountName(String labAccountName) {
            this.labAccountName = Objects.requireNonNull(labAccountName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetLabAccountRegionalAvailabilityArgs build() {
            return new GetLabAccountRegionalAvailabilityArgs(labAccountName, resourceGroupName);
        }
    }
}
