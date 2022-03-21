// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetStandardArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetStandardArgs Empty = new GetStandardArgs();

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The Security Standard key - unique key for the standard type
     * 
     */
    @Import(name="standardId", required=true)
      private final String standardId;

    public String getStandardId() {
        return this.standardId;
    }

    public GetStandardArgs(
        String resourceGroupName,
        String standardId) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.standardId = Objects.requireNonNull(standardId, "expected parameter 'standardId' to be non-null");
    }

    private GetStandardArgs() {
        this.resourceGroupName = null;
        this.standardId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStandardArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String standardId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStandardArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.standardId = defaults.standardId;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder standardId(String standardId) {
            this.standardId = Objects.requireNonNull(standardId);
            return this;
        }        public GetStandardArgs build() {
            return new GetStandardArgs(resourceGroupName, standardId);
        }
    }
}
