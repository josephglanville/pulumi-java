// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBlobServicePropertiesArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBlobServicePropertiesArgs Empty = new GetBlobServicePropertiesArgs();

    /**
     * The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * 
     */
    @Import(name="accountName", required=true)
      private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * The name of the blob Service within the specified storage account. Blob Service Name must be 'default'
     * 
     */
    @Import(name="blobServicesName", required=true)
      private final String blobServicesName;

    public String getBlobServicesName() {
        return this.blobServicesName;
    }

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetBlobServicePropertiesArgs(
        String accountName,
        String blobServicesName,
        String resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.blobServicesName = Objects.requireNonNull(blobServicesName, "expected parameter 'blobServicesName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetBlobServicePropertiesArgs() {
        this.accountName = null;
        this.blobServicesName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBlobServicePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String blobServicesName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBlobServicePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.blobServicesName = defaults.blobServicesName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder blobServicesName(String blobServicesName) {
            this.blobServicesName = Objects.requireNonNull(blobServicesName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetBlobServicePropertiesArgs build() {
            return new GetBlobServicePropertiesArgs(accountName, blobServicesName, resourceGroupName);
        }
    }
}
