// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CatalogTablePartitionIndex {
    /**
     * Name of the partition index.
     * 
     */
    private final String indexName;
    private final @Nullable String indexStatus;
    /**
     * Keys for the partition index.
     * 
     */
    private final List<String> keys;

    @OutputCustomType.Constructor
    private CatalogTablePartitionIndex(
        @OutputCustomType.Parameter("indexName") String indexName,
        @OutputCustomType.Parameter("indexStatus") @Nullable String indexStatus,
        @OutputCustomType.Parameter("keys") List<String> keys) {
        this.indexName = indexName;
        this.indexStatus = indexStatus;
        this.keys = keys;
    }

    /**
     * Name of the partition index.
     * 
    */
    public String getIndexName() {
        return this.indexName;
    }
    public Optional<String> getIndexStatus() {
        return Optional.ofNullable(this.indexStatus);
    }
    /**
     * Keys for the partition index.
     * 
    */
    public List<String> getKeys() {
        return this.keys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CatalogTablePartitionIndex defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String indexName;
        private @Nullable String indexStatus;
        private List<String> keys;

        public Builder() {
    	      // Empty
        }

        public Builder(CatalogTablePartitionIndex defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.indexName = defaults.indexName;
    	      this.indexStatus = defaults.indexStatus;
    	      this.keys = defaults.keys;
        }

        public Builder setIndexName(String indexName) {
            this.indexName = Objects.requireNonNull(indexName);
            return this;
        }

        public Builder setIndexStatus(@Nullable String indexStatus) {
            this.indexStatus = indexStatus;
            return this;
        }

        public Builder setKeys(List<String> keys) {
            this.keys = Objects.requireNonNull(keys);
            return this;
        }
        public CatalogTablePartitionIndex build() {
            return new CatalogTablePartitionIndex(indexName, indexStatus, keys);
        }
    }
}
