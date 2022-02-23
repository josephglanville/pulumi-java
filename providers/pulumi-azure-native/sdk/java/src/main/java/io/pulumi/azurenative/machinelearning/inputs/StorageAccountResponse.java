// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Access information for a storage account.
 * 
 */
public final class StorageAccountResponse extends io.pulumi.resources.InvokeArgs {

    public static final StorageAccountResponse Empty = new StorageAccountResponse();

    /**
     * Specifies the key used to access the storage account.
     * 
     */
    @InputImport(name="key")
      private final @Nullable String key;

    public Optional<String> getKey() {
        return this.key == null ? Optional.empty() : Optional.ofNullable(this.key);
    }

    /**
     * Specifies the name of the storage account.
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    public StorageAccountResponse(
        @Nullable String key,
        @Nullable String name) {
        this.key = key;
        this.name = name;
    }

    private StorageAccountResponse() {
        this.key = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageAccountResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String key;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageAccountResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.name = defaults.name;
        }

        public Builder setKey(@Nullable String key) {
            this.key = key;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }
        public StorageAccountResponse build() {
            return new StorageAccountResponse(key, name);
        }
    }
}
