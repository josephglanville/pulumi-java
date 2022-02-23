// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetGraphResourceGraphArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetGraphResourceGraphArgs Empty = new GetGraphResourceGraphArgs();

    /**
     * Cosmos DB database account name.
     * 
     */
    @InputImport(name="accountName", required=true)
      private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * Cosmos DB graph resource name.
     * 
     */
    @InputImport(name="graphName", required=true)
      private final String graphName;

    public String getGraphName() {
        return this.graphName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetGraphResourceGraphArgs(
        String accountName,
        String graphName,
        String resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.graphName = Objects.requireNonNull(graphName, "expected parameter 'graphName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetGraphResourceGraphArgs() {
        this.accountName = null;
        this.graphName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGraphResourceGraphArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String graphName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGraphResourceGraphArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.graphName = defaults.graphName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setGraphName(String graphName) {
            this.graphName = Objects.requireNonNull(graphName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetGraphResourceGraphArgs build() {
            return new GetGraphResourceGraphArgs(accountName, graphName, resourceGroupName);
        }
    }
}
