// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.DatasetFolderArgs;
import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The MongoDB database dataset.
 * 
 */
public final class MongoDbV2CollectionDatasetArgs extends io.pulumi.resources.ResourceArgs {

    public static final MongoDbV2CollectionDatasetArgs Empty = new MongoDbV2CollectionDatasetArgs();

    /**
     * List of tags that can be used for describing the Dataset.
     * 
     */
    @InputImport(name="annotations")
      private final @Nullable Input<List<Object>> annotations;

    public Input<List<Object>> getAnnotations() {
        return this.annotations == null ? Input.empty() : this.annotations;
    }

    /**
     * The collection name of the MongoDB database. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="collection", required=true)
      private final Input<Object> collection;

    public Input<Object> getCollection() {
        return this.collection;
    }

    /**
     * Dataset description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The folder that this Dataset is in. If not specified, Dataset will appear at the root level.
     * 
     */
    @InputImport(name="folder")
      private final @Nullable Input<DatasetFolderArgs> folder;

    public Input<DatasetFolderArgs> getFolder() {
        return this.folder == null ? Input.empty() : this.folder;
    }

    /**
     * Linked service reference.
     * 
     */
    @InputImport(name="linkedServiceName", required=true)
      private final Input<LinkedServiceReferenceArgs> linkedServiceName;

    public Input<LinkedServiceReferenceArgs> getLinkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * Parameters for dataset.
     * 
     */
    @InputImport(name="parameters")
      private final @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;

    public Input<Map<String,ParameterSpecificationArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * Columns that define the physical type schema of the dataset. Type: array (or Expression with resultType array), itemType: DatasetSchemaDataElement.
     * 
     */
    @InputImport(name="schema")
      private final @Nullable Input<Object> schema;

    public Input<Object> getSchema() {
        return this.schema == null ? Input.empty() : this.schema;
    }

    /**
     * Columns that define the structure of the dataset. Type: array (or Expression with resultType array), itemType: DatasetDataElement.
     * 
     */
    @InputImport(name="structure")
      private final @Nullable Input<Object> structure;

    public Input<Object> getStructure() {
        return this.structure == null ? Input.empty() : this.structure;
    }

    /**
     * Type of dataset.
     * Expected value is 'MongoDbV2Collection'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public MongoDbV2CollectionDatasetArgs(
        @Nullable Input<List<Object>> annotations,
        Input<Object> collection,
        @Nullable Input<String> description,
        @Nullable Input<DatasetFolderArgs> folder,
        Input<LinkedServiceReferenceArgs> linkedServiceName,
        @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Input<Object> schema,
        @Nullable Input<Object> structure,
        Input<String> type) {
        this.annotations = annotations;
        this.collection = Objects.requireNonNull(collection, "expected parameter 'collection' to be non-null");
        this.description = description;
        this.folder = folder;
        this.linkedServiceName = Objects.requireNonNull(linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
        this.parameters = parameters;
        this.schema = schema;
        this.structure = structure;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private MongoDbV2CollectionDatasetArgs() {
        this.annotations = Input.empty();
        this.collection = Input.empty();
        this.description = Input.empty();
        this.folder = Input.empty();
        this.linkedServiceName = Input.empty();
        this.parameters = Input.empty();
        this.schema = Input.empty();
        this.structure = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MongoDbV2CollectionDatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Object>> annotations;
        private Input<Object> collection;
        private @Nullable Input<String> description;
        private @Nullable Input<DatasetFolderArgs> folder;
        private Input<LinkedServiceReferenceArgs> linkedServiceName;
        private @Nullable Input<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Input<Object> schema;
        private @Nullable Input<Object> structure;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(MongoDbV2CollectionDatasetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.collection = defaults.collection;
    	      this.description = defaults.description;
    	      this.folder = defaults.folder;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.parameters = defaults.parameters;
    	      this.schema = defaults.schema;
    	      this.structure = defaults.structure;
    	      this.type = defaults.type;
        }

        public Builder setAnnotations(@Nullable Input<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = Input.ofNullable(annotations);
            return this;
        }

        public Builder setCollection(Input<Object> collection) {
            this.collection = Objects.requireNonNull(collection);
            return this;
        }

        public Builder setCollection(Object collection) {
            this.collection = Input.of(Objects.requireNonNull(collection));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setFolder(@Nullable Input<DatasetFolderArgs> folder) {
            this.folder = folder;
            return this;
        }

        public Builder setFolder(@Nullable DatasetFolderArgs folder) {
            this.folder = Input.ofNullable(folder);
            return this;
        }

        public Builder setLinkedServiceName(Input<LinkedServiceReferenceArgs> linkedServiceName) {
            this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
            return this;
        }

        public Builder setLinkedServiceName(LinkedServiceReferenceArgs linkedServiceName) {
            this.linkedServiceName = Input.of(Objects.requireNonNull(linkedServiceName));
            return this;
        }

        public Builder setParameters(@Nullable Input<Map<String,ParameterSpecificationArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder setSchema(@Nullable Input<Object> schema) {
            this.schema = schema;
            return this;
        }

        public Builder setSchema(@Nullable Object schema) {
            this.schema = Input.ofNullable(schema);
            return this;
        }

        public Builder setStructure(@Nullable Input<Object> structure) {
            this.structure = structure;
            return this;
        }

        public Builder setStructure(@Nullable Object structure) {
            this.structure = Input.ofNullable(structure);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public MongoDbV2CollectionDatasetArgs build() {
            return new MongoDbV2CollectionDatasetArgs(annotations, collection, description, folder, linkedServiceName, parameters, schema, structure, type);
        }
    }
}
