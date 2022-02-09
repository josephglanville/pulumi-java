// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetNetworkArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetNetworkArgs Empty = new GetNetworkArgs();

    @InputImport(name="networkResourceName", required=true)
    private final String networkResourceName;

    public String getNetworkResourceName() {
        return this.networkResourceName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetNetworkArgs(
        String networkResourceName,
        String resourceGroupName) {
        this.networkResourceName = Objects.requireNonNull(networkResourceName, "expected parameter 'networkResourceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetNetworkArgs() {
        this.networkResourceName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String networkResourceName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkResourceName = defaults.networkResourceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setNetworkResourceName(String networkResourceName) {
            this.networkResourceName = Objects.requireNonNull(networkResourceName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetNetworkArgs build() {
            return new GetNetworkArgs(networkResourceName, resourceGroupName);
        }
    }
}
