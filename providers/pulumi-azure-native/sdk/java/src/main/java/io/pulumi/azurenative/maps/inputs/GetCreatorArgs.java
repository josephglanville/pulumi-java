// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.maps.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetCreatorArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetCreatorArgs Empty = new GetCreatorArgs();

    /**
     * The name of the Maps Account.
     * 
     */
    @InputImport(name="accountName", required=true)
      private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * The name of the Maps Creator instance.
     * 
     */
    @InputImport(name="creatorName", required=true)
      private final String creatorName;

    public String getCreatorName() {
        return this.creatorName;
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

    public GetCreatorArgs(
        String accountName,
        String creatorName,
        String resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.creatorName = Objects.requireNonNull(creatorName, "expected parameter 'creatorName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetCreatorArgs() {
        this.accountName = null;
        this.creatorName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCreatorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String creatorName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCreatorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.creatorName = defaults.creatorName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setCreatorName(String creatorName) {
            this.creatorName = Objects.requireNonNull(creatorName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetCreatorArgs build() {
            return new GetCreatorArgs(accountName, creatorName, resourceGroupName);
        }
    }
}
