// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firestore_v1beta2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.firestore_v1beta2.enums.IndexQueryScope;
import io.pulumi.googlenative.firestore_v1beta2.inputs.GoogleFirestoreAdminV1beta2IndexFieldArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IndexArgs extends io.pulumi.resources.ResourceArgs {

    public static final IndexArgs Empty = new IndexArgs();

    @InputImport(name="collectionGroupId", required=true)
      private final Output<String> collectionGroupId;

    public Output<String> getCollectionGroupId() {
        return this.collectionGroupId;
    }

    @InputImport(name="databaseId", required=true)
      private final Output<String> databaseId;

    public Output<String> getDatabaseId() {
        return this.databaseId;
    }

    /**
     * The fields supported by this index. For composite indexes, this is always 2 or more fields. The last field entry is always for the field path `__name__`. If, on creation, `__name__` was not specified as the last field, it will be added automatically with the same direction as that of the last field defined. If the final field in a composite index is not directional, the `__name__` will be ordered ASCENDING (unless explicitly specified). For single field indexes, this will always be exactly one entry with a field path equal to the field path of the associated field.
     * 
     */
    @InputImport(name="fields")
      private final @Nullable Output<List<GoogleFirestoreAdminV1beta2IndexFieldArgs>> fields;

    public Output<List<GoogleFirestoreAdminV1beta2IndexFieldArgs>> getFields() {
        return this.fields == null ? Output.empty() : this.fields;
    }

    @InputImport(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Indexes with a collection query scope specified allow queries against a collection that is the child of a specific document, specified at query time, and that has the same collection id. Indexes with a collection group query scope specified allow queries against all collections descended from a specific document, specified at query time, and that have the same collection id as this index.
     * 
     */
    @InputImport(name="queryScope")
      private final @Nullable Output<IndexQueryScope> queryScope;

    public Output<IndexQueryScope> getQueryScope() {
        return this.queryScope == null ? Output.empty() : this.queryScope;
    }

    public IndexArgs(
        Output<String> collectionGroupId,
        Output<String> databaseId,
        @Nullable Output<List<GoogleFirestoreAdminV1beta2IndexFieldArgs>> fields,
        @Nullable Output<String> project,
        @Nullable Output<IndexQueryScope> queryScope) {
        this.collectionGroupId = Objects.requireNonNull(collectionGroupId, "expected parameter 'collectionGroupId' to be non-null");
        this.databaseId = Objects.requireNonNull(databaseId, "expected parameter 'databaseId' to be non-null");
        this.fields = fields;
        this.project = project;
        this.queryScope = queryScope;
    }

    private IndexArgs() {
        this.collectionGroupId = Output.empty();
        this.databaseId = Output.empty();
        this.fields = Output.empty();
        this.project = Output.empty();
        this.queryScope = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IndexArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> collectionGroupId;
        private Output<String> databaseId;
        private @Nullable Output<List<GoogleFirestoreAdminV1beta2IndexFieldArgs>> fields;
        private @Nullable Output<String> project;
        private @Nullable Output<IndexQueryScope> queryScope;

        public Builder() {
    	      // Empty
        }

        public Builder(IndexArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collectionGroupId = defaults.collectionGroupId;
    	      this.databaseId = defaults.databaseId;
    	      this.fields = defaults.fields;
    	      this.project = defaults.project;
    	      this.queryScope = defaults.queryScope;
        }

        public Builder collectionGroupId(Output<String> collectionGroupId) {
            this.collectionGroupId = Objects.requireNonNull(collectionGroupId);
            return this;
        }

        public Builder collectionGroupId(String collectionGroupId) {
            this.collectionGroupId = Output.of(Objects.requireNonNull(collectionGroupId));
            return this;
        }

        public Builder databaseId(Output<String> databaseId) {
            this.databaseId = Objects.requireNonNull(databaseId);
            return this;
        }

        public Builder databaseId(String databaseId) {
            this.databaseId = Output.of(Objects.requireNonNull(databaseId));
            return this;
        }

        public Builder fields(@Nullable Output<List<GoogleFirestoreAdminV1beta2IndexFieldArgs>> fields) {
            this.fields = fields;
            return this;
        }

        public Builder fields(@Nullable List<GoogleFirestoreAdminV1beta2IndexFieldArgs> fields) {
            this.fields = Output.ofNullable(fields);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder queryScope(@Nullable Output<IndexQueryScope> queryScope) {
            this.queryScope = queryScope;
            return this;
        }

        public Builder queryScope(@Nullable IndexQueryScope queryScope) {
            this.queryScope = Output.ofNullable(queryScope);
            return this;
        }
        public IndexArgs build() {
            return new IndexArgs(collectionGroupId, databaseId, fields, project, queryScope);
        }
    }
}
