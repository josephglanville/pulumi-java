// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivilegeResponseResource extends io.pulumi.resources.InvokeArgs {

    public static final PrivilegeResponseResource Empty = new PrivilegeResponseResource();

    @InputImport(name="collection")
    private final @Nullable String collection;

    public Optional<String> getCollection() {
        return this.collection == null ? Optional.empty() : Optional.ofNullable(this.collection);
    }

    @InputImport(name="db")
    private final @Nullable String db;

    public Optional<String> getDb() {
        return this.db == null ? Optional.empty() : Optional.ofNullable(this.db);
    }

    public PrivilegeResponseResource(
        @Nullable String collection,
        @Nullable String db) {
        this.collection = collection;
        this.db = db;
    }

    private PrivilegeResponseResource() {
        this.collection = null;
        this.db = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivilegeResponseResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String collection;
        private @Nullable String db;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivilegeResponseResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collection = defaults.collection;
    	      this.db = defaults.db;
        }

        public Builder setCollection(@Nullable String collection) {
            this.collection = collection;
            return this;
        }

        public Builder setDb(@Nullable String db) {
            this.db = db;
            return this;
        }

        public PrivilegeResponseResource build() {
            return new PrivilegeResponseResource(collection, db);
        }
    }
}
