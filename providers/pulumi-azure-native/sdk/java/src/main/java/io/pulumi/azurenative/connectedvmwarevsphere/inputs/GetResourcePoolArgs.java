// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetResourcePoolArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetResourcePoolArgs Empty = new GetResourcePoolArgs();

    /**
     * The Resource Group Name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the resourcePool.
     * 
     */
    @Import(name="resourcePoolName", required=true)
      private final String resourcePoolName;

    public String getResourcePoolName() {
        return this.resourcePoolName;
    }

    public GetResourcePoolArgs(
        String resourceGroupName,
        String resourcePoolName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourcePoolName = Objects.requireNonNull(resourcePoolName, "expected parameter 'resourcePoolName' to be non-null");
    }

    private GetResourcePoolArgs() {
        this.resourceGroupName = null;
        this.resourcePoolName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourcePoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String resourcePoolName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourcePoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourcePoolName = defaults.resourcePoolName;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourcePoolName(String resourcePoolName) {
            this.resourcePoolName = Objects.requireNonNull(resourcePoolName);
            return this;
        }        public GetResourcePoolArgs build() {
            return new GetResourcePoolArgs(resourceGroupName, resourcePoolName);
        }
    }
}
