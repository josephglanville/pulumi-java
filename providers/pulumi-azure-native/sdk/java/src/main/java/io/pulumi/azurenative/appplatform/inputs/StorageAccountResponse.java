// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * storage resource of type Azure Storage Account.
 * 
 */
public final class StorageAccountResponse extends io.pulumi.resources.InvokeArgs {

    public static final StorageAccountResponse Empty = new StorageAccountResponse();

    /**
     * The account name of the Azure Storage Account.
     * 
     */
    @Import(name="accountName", required=true)
      private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * The type of the storage.
     * Expected value is 'StorageAccount'.
     * 
     */
    @Import(name="storageType", required=true)
      private final String storageType;

    public String getStorageType() {
        return this.storageType;
    }

    public StorageAccountResponse(
        String accountName,
        String storageType) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.storageType = Objects.requireNonNull(storageType, "expected parameter 'storageType' to be non-null");
    }

    private StorageAccountResponse() {
        this.accountName = null;
        this.storageType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageAccountResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String storageType;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageAccountResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.storageType = defaults.storageType;
        }

        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder storageType(String storageType) {
            this.storageType = Objects.requireNonNull(storageType);
            return this;
        }        public StorageAccountResponse build() {
            return new StorageAccountResponse(accountName, storageType);
        }
    }
}
