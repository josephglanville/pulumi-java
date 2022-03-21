// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTransformArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTransformArgs Empty = new GetTransformArgs();

    /**
     * The Media Services account name.
     * 
     */
    @Import(name="accountName", required=true)
      private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * The name of the resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The Transform name.
     * 
     */
    @Import(name="transformName", required=true)
      private final String transformName;

    public String getTransformName() {
        return this.transformName;
    }

    public GetTransformArgs(
        String accountName,
        String resourceGroupName,
        String transformName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.transformName = Objects.requireNonNull(transformName, "expected parameter 'transformName' to be non-null");
    }

    private GetTransformArgs() {
        this.accountName = null;
        this.resourceGroupName = null;
        this.transformName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransformArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String resourceGroupName;
        private String transformName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTransformArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.transformName = defaults.transformName;
        }

        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder transformName(String transformName) {
            this.transformName = Objects.requireNonNull(transformName);
            return this;
        }        public GetTransformArgs build() {
            return new GetTransformArgs(accountName, resourceGroupName, transformName);
        }
    }
}
