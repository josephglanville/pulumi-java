// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListLocalUserKeysArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListLocalUserKeysArgs Empty = new ListLocalUserKeysArgs();

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
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of local user. The username must contain lowercase letters and numbers only. It must be unique only within the storage account.
     * 
     */
    @Import(name="username", required=true)
      private final String username;

    public String getUsername() {
        return this.username;
    }

    public ListLocalUserKeysArgs(
        String accountName,
        String resourceGroupName,
        String username) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private ListLocalUserKeysArgs() {
        this.accountName = null;
        this.resourceGroupName = null;
        this.username = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListLocalUserKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String resourceGroupName;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(ListLocalUserKeysArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.username = defaults.username;
        }

        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }        public ListLocalUserKeysArgs build() {
            return new ListLocalUserKeysArgs(accountName, resourceGroupName, username);
        }
    }
}
