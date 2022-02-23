// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetExpressRouteCrossConnectionPeeringArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetExpressRouteCrossConnectionPeeringArgs Empty = new GetExpressRouteCrossConnectionPeeringArgs();

    /**
     * The name of the ExpressRouteCrossConnection.
     * 
     */
    @InputImport(name="crossConnectionName", required=true)
      private final String crossConnectionName;

    public String getCrossConnectionName() {
        return this.crossConnectionName;
    }

    /**
     * The name of the peering.
     * 
     */
    @InputImport(name="peeringName", required=true)
      private final String peeringName;

    public String getPeeringName() {
        return this.peeringName;
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

    public GetExpressRouteCrossConnectionPeeringArgs(
        String crossConnectionName,
        String peeringName,
        String resourceGroupName) {
        this.crossConnectionName = Objects.requireNonNull(crossConnectionName, "expected parameter 'crossConnectionName' to be non-null");
        this.peeringName = Objects.requireNonNull(peeringName, "expected parameter 'peeringName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetExpressRouteCrossConnectionPeeringArgs() {
        this.crossConnectionName = null;
        this.peeringName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExpressRouteCrossConnectionPeeringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String crossConnectionName;
        private String peeringName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExpressRouteCrossConnectionPeeringArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crossConnectionName = defaults.crossConnectionName;
    	      this.peeringName = defaults.peeringName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setCrossConnectionName(String crossConnectionName) {
            this.crossConnectionName = Objects.requireNonNull(crossConnectionName);
            return this;
        }

        public Builder setPeeringName(String peeringName) {
            this.peeringName = Objects.requireNonNull(peeringName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetExpressRouteCrossConnectionPeeringArgs build() {
            return new GetExpressRouteCrossConnectionPeeringArgs(crossConnectionName, peeringName, resourceGroupName);
        }
    }
}
