// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.dynamodb.outputs;

import io.pulumi.awsnative.dynamodb.outputs.GlobalTableKeySchema;
import io.pulumi.awsnative.dynamodb.outputs.GlobalTableProjection;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GlobalTableLocalSecondaryIndex {
    private final String indexName;
    private final List<GlobalTableKeySchema> keySchema;
    private final GlobalTableProjection projection;

    @CustomType.Constructor
    private GlobalTableLocalSecondaryIndex(
        @CustomType.Parameter("indexName") String indexName,
        @CustomType.Parameter("keySchema") List<GlobalTableKeySchema> keySchema,
        @CustomType.Parameter("projection") GlobalTableProjection projection) {
        this.indexName = indexName;
        this.keySchema = keySchema;
        this.projection = projection;
    }

    public String getIndexName() {
        return this.indexName;
    }
    public List<GlobalTableKeySchema> getKeySchema() {
        return this.keySchema;
    }
    public GlobalTableProjection getProjection() {
        return this.projection;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalTableLocalSecondaryIndex defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String indexName;
        private List<GlobalTableKeySchema> keySchema;
        private GlobalTableProjection projection;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalTableLocalSecondaryIndex defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.indexName = defaults.indexName;
    	      this.keySchema = defaults.keySchema;
    	      this.projection = defaults.projection;
        }

        public Builder indexName(String indexName) {
            this.indexName = Objects.requireNonNull(indexName);
            return this;
        }
        public Builder keySchema(List<GlobalTableKeySchema> keySchema) {
            this.keySchema = Objects.requireNonNull(keySchema);
            return this;
        }
        public Builder keySchema(GlobalTableKeySchema... keySchema) {
            return keySchema(List.of(keySchema));
        }
        public Builder projection(GlobalTableProjection projection) {
            this.projection = Objects.requireNonNull(projection);
            return this;
        }        public GlobalTableLocalSecondaryIndex build() {
            return new GlobalTableLocalSecondaryIndex(indexName, keySchema, projection);
        }
    }
}
