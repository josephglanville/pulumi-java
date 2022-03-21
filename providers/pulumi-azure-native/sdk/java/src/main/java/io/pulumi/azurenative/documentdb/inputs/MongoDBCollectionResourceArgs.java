// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.azurenative.documentdb.inputs.MongoIndexArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Cosmos DB MongoDB collection resource object
 * 
 */
public final class MongoDBCollectionResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final MongoDBCollectionResourceArgs Empty = new MongoDBCollectionResourceArgs();

    /**
     * Analytical TTL.
     * 
     */
    @Import(name="analyticalStorageTtl")
      private final @Nullable Output<Integer> analyticalStorageTtl;

    public Output<Integer> getAnalyticalStorageTtl() {
        return this.analyticalStorageTtl == null ? Output.empty() : this.analyticalStorageTtl;
    }

    /**
     * Name of the Cosmos DB MongoDB collection
     * 
     */
    @Import(name="id", required=true)
      private final Output<String> id;

    public Output<String> getId() {
        return this.id;
    }

    /**
     * List of index keys
     * 
     */
    @Import(name="indexes")
      private final @Nullable Output<List<MongoIndexArgs>> indexes;

    public Output<List<MongoIndexArgs>> getIndexes() {
        return this.indexes == null ? Output.empty() : this.indexes;
    }

    /**
     * A key-value pair of shard keys to be applied for the request.
     * 
     */
    @Import(name="shardKey")
      private final @Nullable Output<Map<String,String>> shardKey;

    public Output<Map<String,String>> getShardKey() {
        return this.shardKey == null ? Output.empty() : this.shardKey;
    }

    public MongoDBCollectionResourceArgs(
        @Nullable Output<Integer> analyticalStorageTtl,
        Output<String> id,
        @Nullable Output<List<MongoIndexArgs>> indexes,
        @Nullable Output<Map<String,String>> shardKey) {
        this.analyticalStorageTtl = analyticalStorageTtl;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.indexes = indexes;
        this.shardKey = shardKey;
    }

    private MongoDBCollectionResourceArgs() {
        this.analyticalStorageTtl = Output.empty();
        this.id = Output.empty();
        this.indexes = Output.empty();
        this.shardKey = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MongoDBCollectionResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> analyticalStorageTtl;
        private Output<String> id;
        private @Nullable Output<List<MongoIndexArgs>> indexes;
        private @Nullable Output<Map<String,String>> shardKey;

        public Builder() {
    	      // Empty
        }

        public Builder(MongoDBCollectionResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.analyticalStorageTtl = defaults.analyticalStorageTtl;
    	      this.id = defaults.id;
    	      this.indexes = defaults.indexes;
    	      this.shardKey = defaults.shardKey;
        }

        public Builder analyticalStorageTtl(@Nullable Output<Integer> analyticalStorageTtl) {
            this.analyticalStorageTtl = analyticalStorageTtl;
            return this;
        }
        public Builder analyticalStorageTtl(@Nullable Integer analyticalStorageTtl) {
            this.analyticalStorageTtl = Output.ofNullable(analyticalStorageTtl);
            return this;
        }
        public Builder id(Output<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder id(String id) {
            this.id = Output.of(Objects.requireNonNull(id));
            return this;
        }
        public Builder indexes(@Nullable Output<List<MongoIndexArgs>> indexes) {
            this.indexes = indexes;
            return this;
        }
        public Builder indexes(@Nullable List<MongoIndexArgs> indexes) {
            this.indexes = Output.ofNullable(indexes);
            return this;
        }
        public Builder indexes(MongoIndexArgs... indexes) {
            return indexes(List.of(indexes));
        }
        public Builder shardKey(@Nullable Output<Map<String,String>> shardKey) {
            this.shardKey = shardKey;
            return this;
        }
        public Builder shardKey(@Nullable Map<String,String> shardKey) {
            this.shardKey = Output.ofNullable(shardKey);
            return this;
        }        public MongoDBCollectionResourceArgs build() {
            return new MongoDBCollectionResourceArgs(analyticalStorageTtl, id, indexes, shardKey);
        }
    }
}
