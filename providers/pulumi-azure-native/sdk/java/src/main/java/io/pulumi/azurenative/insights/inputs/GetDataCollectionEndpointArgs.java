// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDataCollectionEndpointArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDataCollectionEndpointArgs Empty = new GetDataCollectionEndpointArgs();

    /**
     * The name of the data collection endpoint. The name is case insensitive.
     * 
     */
    @Import(name="dataCollectionEndpointName", required=true)
      private final String dataCollectionEndpointName;

    public String getDataCollectionEndpointName() {
        return this.dataCollectionEndpointName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetDataCollectionEndpointArgs(
        String dataCollectionEndpointName,
        String resourceGroupName) {
        this.dataCollectionEndpointName = Objects.requireNonNull(dataCollectionEndpointName, "expected parameter 'dataCollectionEndpointName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetDataCollectionEndpointArgs() {
        this.dataCollectionEndpointName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataCollectionEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataCollectionEndpointName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataCollectionEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataCollectionEndpointName = defaults.dataCollectionEndpointName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder dataCollectionEndpointName(String dataCollectionEndpointName) {
            this.dataCollectionEndpointName = Objects.requireNonNull(dataCollectionEndpointName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetDataCollectionEndpointArgs build() {
            return new GetDataCollectionEndpointArgs(dataCollectionEndpointName, resourceGroupName);
        }
    }
}
