// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class StorageAccountResponse {
    private final String accountName;
    private final String storageType;

    @OutputCustomType.Constructor({"accountName","storageType"})
    private StorageAccountResponse(
        String accountName,
        String storageType) {
        this.accountName = Objects.requireNonNull(accountName);
        this.storageType = Objects.requireNonNull(storageType);
    }

    public String getAccountName() {
        return this.accountName;
    }
    public String getStorageType() {
        return this.storageType;
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

        public Builder setAccountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setStorageType(String storageType) {
            this.storageType = Objects.requireNonNull(storageType);
            return this;
        }

        public StorageAccountResponse build() {
            return new StorageAccountResponse(accountName, storageType);
        }
    }
}
