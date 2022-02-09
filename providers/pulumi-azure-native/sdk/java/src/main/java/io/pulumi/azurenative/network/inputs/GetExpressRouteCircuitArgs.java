// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetExpressRouteCircuitArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetExpressRouteCircuitArgs Empty = new GetExpressRouteCircuitArgs();

    @InputImport(name="circuitName", required=true)
    private final String circuitName;

    public String getCircuitName() {
        return this.circuitName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetExpressRouteCircuitArgs(
        String circuitName,
        String resourceGroupName) {
        this.circuitName = Objects.requireNonNull(circuitName, "expected parameter 'circuitName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetExpressRouteCircuitArgs() {
        this.circuitName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExpressRouteCircuitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String circuitName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExpressRouteCircuitArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.circuitName = defaults.circuitName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setCircuitName(String circuitName) {
            this.circuitName = Objects.requireNonNull(circuitName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetExpressRouteCircuitArgs build() {
            return new GetExpressRouteCircuitArgs(circuitName, resourceGroupName);
        }
    }
}
