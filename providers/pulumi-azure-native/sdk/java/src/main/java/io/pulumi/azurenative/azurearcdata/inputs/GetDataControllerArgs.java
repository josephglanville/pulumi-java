// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurearcdata.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetDataControllerArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDataControllerArgs Empty = new GetDataControllerArgs();

    @InputImport(name="dataControllerName", required=true)
      private final String dataControllerName;

    public String getDataControllerName() {
        return this.dataControllerName;
    }

    /**
     * The name of the Azure resource group
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetDataControllerArgs(
        String dataControllerName,
        String resourceGroupName) {
        this.dataControllerName = Objects.requireNonNull(dataControllerName, "expected parameter 'dataControllerName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetDataControllerArgs() {
        this.dataControllerName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataControllerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataControllerName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataControllerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataControllerName = defaults.dataControllerName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setDataControllerName(String dataControllerName) {
            this.dataControllerName = Objects.requireNonNull(dataControllerName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetDataControllerArgs build() {
            return new GetDataControllerArgs(dataControllerName, resourceGroupName);
        }
    }
}
