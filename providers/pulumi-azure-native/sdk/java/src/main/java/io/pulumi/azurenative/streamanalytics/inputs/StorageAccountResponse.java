// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StorageAccountResponse extends io.pulumi.resources.InvokeArgs {

    public static final StorageAccountResponse Empty = new StorageAccountResponse();

    @InputImport(name="accountKey")
    private final @Nullable String accountKey;

    public Optional<String> getAccountKey() {
        return this.accountKey == null ? Optional.empty() : Optional.ofNullable(this.accountKey);
    }

    @InputImport(name="accountName")
    private final @Nullable String accountName;

    public Optional<String> getAccountName() {
        return this.accountName == null ? Optional.empty() : Optional.ofNullable(this.accountName);
    }

    public StorageAccountResponse(
        @Nullable String accountKey,
        @Nullable String accountName) {
        this.accountKey = accountKey;
        this.accountName = accountName;
    }

    private StorageAccountResponse() {
        this.accountKey = null;
        this.accountName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageAccountResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accountKey;
        private @Nullable String accountName;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageAccountResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountKey = defaults.accountKey;
    	      this.accountName = defaults.accountName;
        }

        public Builder setAccountKey(@Nullable String accountKey) {
            this.accountKey = accountKey;
            return this;
        }

        public Builder setAccountName(@Nullable String accountName) {
            this.accountName = accountName;
            return this;
        }

        public StorageAccountResponse build() {
            return new StorageAccountResponse(accountKey, accountName);
        }
    }
}
