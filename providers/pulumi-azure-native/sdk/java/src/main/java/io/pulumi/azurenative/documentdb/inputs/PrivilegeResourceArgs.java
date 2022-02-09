// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrivilegeResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivilegeResourceArgs Empty = new PrivilegeResourceArgs();

    @InputImport(name="collection")
    private final @Nullable Input<String> collection;

    public Input<String> getCollection() {
        return this.collection == null ? Input.empty() : this.collection;
    }

    @InputImport(name="db")
    private final @Nullable Input<String> db;

    public Input<String> getDb() {
        return this.db == null ? Input.empty() : this.db;
    }

    public PrivilegeResourceArgs(
        @Nullable Input<String> collection,
        @Nullable Input<String> db) {
        this.collection = collection;
        this.db = db;
    }

    private PrivilegeResourceArgs() {
        this.collection = Input.empty();
        this.db = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivilegeResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> collection;
        private @Nullable Input<String> db;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivilegeResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collection = defaults.collection;
    	      this.db = defaults.db;
        }

        public Builder setCollection(@Nullable Input<String> collection) {
            this.collection = collection;
            return this;
        }

        public Builder setCollection(@Nullable String collection) {
            this.collection = Input.ofNullable(collection);
            return this;
        }

        public Builder setDb(@Nullable Input<String> db) {
            this.db = db;
            return this;
        }

        public Builder setDb(@Nullable String db) {
            this.db = Input.ofNullable(db);
            return this;
        }

        public PrivilegeResourceArgs build() {
            return new PrivilegeResourceArgs(collection, db);
        }
    }
}
