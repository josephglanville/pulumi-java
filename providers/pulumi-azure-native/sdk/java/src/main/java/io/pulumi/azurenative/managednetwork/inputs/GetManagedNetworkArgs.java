// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managednetwork.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetManagedNetworkArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetManagedNetworkArgs Empty = new GetManagedNetworkArgs();

    @InputImport(name="managedNetworkName", required=true)
    private final String managedNetworkName;

    public String getManagedNetworkName() {
        return this.managedNetworkName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetManagedNetworkArgs(
        String managedNetworkName,
        String resourceGroupName) {
        this.managedNetworkName = Objects.requireNonNull(managedNetworkName, "expected parameter 'managedNetworkName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetManagedNetworkArgs() {
        this.managedNetworkName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagedNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String managedNetworkName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagedNetworkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managedNetworkName = defaults.managedNetworkName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setManagedNetworkName(String managedNetworkName) {
            this.managedNetworkName = Objects.requireNonNull(managedNetworkName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetManagedNetworkArgs build() {
            return new GetManagedNetworkArgs(managedNetworkName, resourceGroupName);
        }
    }
}
