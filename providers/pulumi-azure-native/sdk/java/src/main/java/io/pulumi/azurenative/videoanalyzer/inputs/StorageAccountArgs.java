// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.azurenative.videoanalyzer.inputs.ResourceIdentityArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The details about the associated storage account.
 * 
 */
public final class StorageAccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final StorageAccountArgs Empty = new StorageAccountArgs();

    /**
     * The ID of the storage account resource. Video Analyzer relies on tables, queues, and blobs. The primary storage account must be a Standard Storage account (either Microsoft.ClassicStorage or Microsoft.Storage).
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * A managed identity that Video Analyzer will use to access the storage account.
     * 
     */
    @InputImport(name="identity")
      private final @Nullable Input<ResourceIdentityArgs> identity;

    public Input<ResourceIdentityArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    public StorageAccountArgs(
        @Nullable Input<String> id,
        @Nullable Input<ResourceIdentityArgs> identity) {
        this.id = id;
        this.identity = identity;
    }

    private StorageAccountArgs() {
        this.id = Input.empty();
        this.identity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;
        private @Nullable Input<ResourceIdentityArgs> identity;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setIdentity(@Nullable Input<ResourceIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable ResourceIdentityArgs identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }
        public StorageAccountArgs build() {
            return new StorageAccountArgs(id, identity);
        }
    }
}
