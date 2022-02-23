// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Cosmos DB MongoDB collection resource object
 * 
 */
public final class MongoIndexKeysArgs extends io.pulumi.resources.ResourceArgs {

    public static final MongoIndexKeysArgs Empty = new MongoIndexKeysArgs();

    /**
     * List of keys for each MongoDB collection in the Azure Cosmos DB service
     * 
     */
    @InputImport(name="keys")
      private final @Nullable Input<List<String>> keys;

    public Input<List<String>> getKeys() {
        return this.keys == null ? Input.empty() : this.keys;
    }

    public MongoIndexKeysArgs(@Nullable Input<List<String>> keys) {
        this.keys = keys;
    }

    private MongoIndexKeysArgs() {
        this.keys = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MongoIndexKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> keys;

        public Builder() {
    	      // Empty
        }

        public Builder(MongoIndexKeysArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keys = defaults.keys;
        }

        public Builder setKeys(@Nullable Input<List<String>> keys) {
            this.keys = keys;
            return this;
        }

        public Builder setKeys(@Nullable List<String> keys) {
            this.keys = Input.ofNullable(keys);
            return this;
        }
        public MongoIndexKeysArgs build() {
            return new MongoIndexKeysArgs(keys);
        }
    }
}
