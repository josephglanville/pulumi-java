// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.maps.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListAccountKeysArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListAccountKeysArgs Empty = new ListAccountKeysArgs();

    /**
     * The name of the Maps Account.
     * 
     */
    @Import(name="accountName", required=true)
      private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * The name of the Azure Resource Group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public ListAccountKeysArgs(
        String accountName,
        String resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ListAccountKeysArgs() {
        this.accountName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListAccountKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListAccountKeysArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public ListAccountKeysArgs build() {
            return new ListAccountKeysArgs(accountName, resourceGroupName);
        }
    }
}
