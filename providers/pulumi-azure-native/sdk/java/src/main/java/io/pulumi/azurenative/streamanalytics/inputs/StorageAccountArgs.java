// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties that are associated with an Azure Storage account
 * 
 */
public final class StorageAccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final StorageAccountArgs Empty = new StorageAccountArgs();

    /**
     * The account key for the Azure Storage account. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @InputImport(name="accountKey")
      private final @Nullable Input<String> accountKey;

    public Input<String> getAccountKey() {
        return this.accountKey == null ? Input.empty() : this.accountKey;
    }

    /**
     * The name of the Azure Storage account. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @InputImport(name="accountName")
      private final @Nullable Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName == null ? Input.empty() : this.accountName;
    }

    public StorageAccountArgs(
        @Nullable Input<String> accountKey,
        @Nullable Input<String> accountName) {
        this.accountKey = accountKey;
        this.accountName = accountName;
    }

    private StorageAccountArgs() {
        this.accountKey = Input.empty();
        this.accountName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accountKey;
        private @Nullable Input<String> accountName;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountKey = defaults.accountKey;
    	      this.accountName = defaults.accountName;
        }

        public Builder setAccountKey(@Nullable Input<String> accountKey) {
            this.accountKey = accountKey;
            return this;
        }

        public Builder setAccountKey(@Nullable String accountKey) {
            this.accountKey = Input.ofNullable(accountKey);
            return this;
        }

        public Builder setAccountName(@Nullable Input<String> accountName) {
            this.accountName = accountName;
            return this;
        }

        public Builder setAccountName(@Nullable String accountName) {
            this.accountName = Input.ofNullable(accountName);
            return this;
        }
        public StorageAccountArgs build() {
            return new StorageAccountArgs(accountKey, accountName);
        }
    }
}
