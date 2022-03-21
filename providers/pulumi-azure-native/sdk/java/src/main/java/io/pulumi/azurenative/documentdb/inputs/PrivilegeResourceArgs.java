// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An Azure Cosmos DB Mongo DB Resource.
 * 
 */
public final class PrivilegeResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivilegeResourceArgs Empty = new PrivilegeResourceArgs();

    /**
     * The collection name the role is applied.
     * 
     */
    @Import(name="collection")
      private final @Nullable Output<String> collection;

    public Output<String> getCollection() {
        return this.collection == null ? Output.empty() : this.collection;
    }

    /**
     * The database name the role is applied.
     * 
     */
    @Import(name="db")
      private final @Nullable Output<String> db;

    public Output<String> getDb() {
        return this.db == null ? Output.empty() : this.db;
    }

    public PrivilegeResourceArgs(
        @Nullable Output<String> collection,
        @Nullable Output<String> db) {
        this.collection = collection;
        this.db = db;
    }

    private PrivilegeResourceArgs() {
        this.collection = Output.empty();
        this.db = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivilegeResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> collection;
        private @Nullable Output<String> db;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivilegeResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collection = defaults.collection;
    	      this.db = defaults.db;
        }

        public Builder collection(@Nullable Output<String> collection) {
            this.collection = collection;
            return this;
        }
        public Builder collection(@Nullable String collection) {
            this.collection = Output.ofNullable(collection);
            return this;
        }
        public Builder db(@Nullable Output<String> db) {
            this.db = db;
            return this;
        }
        public Builder db(@Nullable String db) {
            this.db = Output.ofNullable(db);
            return this;
        }        public PrivilegeResourceArgs build() {
            return new PrivilegeResourceArgs(collection, db);
        }
    }
}
