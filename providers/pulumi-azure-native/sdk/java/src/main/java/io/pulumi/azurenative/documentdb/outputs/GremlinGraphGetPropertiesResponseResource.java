// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.azurenative.documentdb.outputs.ConflictResolutionPolicyResponse;
import io.pulumi.azurenative.documentdb.outputs.ContainerPartitionKeyResponse;
import io.pulumi.azurenative.documentdb.outputs.IndexingPolicyResponse;
import io.pulumi.azurenative.documentdb.outputs.UniqueKeyPolicyResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GremlinGraphGetPropertiesResponseResource {
    private final @Nullable ConflictResolutionPolicyResponse conflictResolutionPolicy;
    private final @Nullable Integer defaultTtl;
    private final String etag;
    private final String id;
    private final @Nullable IndexingPolicyResponse indexingPolicy;
    private final @Nullable ContainerPartitionKeyResponse partitionKey;
    private final String rid;
    private final Double ts;
    private final @Nullable UniqueKeyPolicyResponse uniqueKeyPolicy;

    @OutputCustomType.Constructor({"conflictResolutionPolicy","defaultTtl","etag","id","indexingPolicy","partitionKey","rid","ts","uniqueKeyPolicy"})
    private GremlinGraphGetPropertiesResponseResource(
        @Nullable ConflictResolutionPolicyResponse conflictResolutionPolicy,
        @Nullable Integer defaultTtl,
        String etag,
        String id,
        @Nullable IndexingPolicyResponse indexingPolicy,
        @Nullable ContainerPartitionKeyResponse partitionKey,
        String rid,
        Double ts,
        @Nullable UniqueKeyPolicyResponse uniqueKeyPolicy) {
        this.conflictResolutionPolicy = conflictResolutionPolicy;
        this.defaultTtl = defaultTtl;
        this.etag = Objects.requireNonNull(etag);
        this.id = Objects.requireNonNull(id);
        this.indexingPolicy = indexingPolicy;
        this.partitionKey = partitionKey;
        this.rid = Objects.requireNonNull(rid);
        this.ts = Objects.requireNonNull(ts);
        this.uniqueKeyPolicy = uniqueKeyPolicy;
    }

    public Optional<ConflictResolutionPolicyResponse> getConflictResolutionPolicy() {
        return Optional.ofNullable(this.conflictResolutionPolicy);
    }
    public Optional<Integer> getDefaultTtl() {
        return Optional.ofNullable(this.defaultTtl);
    }
    public String getEtag() {
        return this.etag;
    }
    public String getId() {
        return this.id;
    }
    public Optional<IndexingPolicyResponse> getIndexingPolicy() {
        return Optional.ofNullable(this.indexingPolicy);
    }
    public Optional<ContainerPartitionKeyResponse> getPartitionKey() {
        return Optional.ofNullable(this.partitionKey);
    }
    public String getRid() {
        return this.rid;
    }
    public Double getTs() {
        return this.ts;
    }
    public Optional<UniqueKeyPolicyResponse> getUniqueKeyPolicy() {
        return Optional.ofNullable(this.uniqueKeyPolicy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GremlinGraphGetPropertiesResponseResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ConflictResolutionPolicyResponse conflictResolutionPolicy;
        private @Nullable Integer defaultTtl;
        private String etag;
        private String id;
        private @Nullable IndexingPolicyResponse indexingPolicy;
        private @Nullable ContainerPartitionKeyResponse partitionKey;
        private String rid;
        private Double ts;
        private @Nullable UniqueKeyPolicyResponse uniqueKeyPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(GremlinGraphGetPropertiesResponseResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conflictResolutionPolicy = defaults.conflictResolutionPolicy;
    	      this.defaultTtl = defaults.defaultTtl;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.indexingPolicy = defaults.indexingPolicy;
    	      this.partitionKey = defaults.partitionKey;
    	      this.rid = defaults.rid;
    	      this.ts = defaults.ts;
    	      this.uniqueKeyPolicy = defaults.uniqueKeyPolicy;
        }

        public Builder setConflictResolutionPolicy(@Nullable ConflictResolutionPolicyResponse conflictResolutionPolicy) {
            this.conflictResolutionPolicy = conflictResolutionPolicy;
            return this;
        }

        public Builder setDefaultTtl(@Nullable Integer defaultTtl) {
            this.defaultTtl = defaultTtl;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIndexingPolicy(@Nullable IndexingPolicyResponse indexingPolicy) {
            this.indexingPolicy = indexingPolicy;
            return this;
        }

        public Builder setPartitionKey(@Nullable ContainerPartitionKeyResponse partitionKey) {
            this.partitionKey = partitionKey;
            return this;
        }

        public Builder setRid(String rid) {
            this.rid = Objects.requireNonNull(rid);
            return this;
        }

        public Builder setTs(Double ts) {
            this.ts = Objects.requireNonNull(ts);
            return this;
        }

        public Builder setUniqueKeyPolicy(@Nullable UniqueKeyPolicyResponse uniqueKeyPolicy) {
            this.uniqueKeyPolicy = uniqueKeyPolicy;
            return this;
        }

        public GremlinGraphGetPropertiesResponseResource build() {
            return new GremlinGraphGetPropertiesResponseResource(conflictResolutionPolicy, defaultTtl, etag, id, indexingPolicy, partitionKey, rid, ts, uniqueKeyPolicy);
        }
    }
}
