// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.DatasetFolderArgs;
import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The path of the SAP ECC OData entity.
 * 
 */
public final class SapEccResourceDatasetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SapEccResourceDatasetArgs Empty = new SapEccResourceDatasetArgs();

    /**
     * List of tags that can be used for describing the Dataset.
     * 
     */
    @Import(name="annotations")
      private final @Nullable Output<List<Object>> annotations;

    public Output<List<Object>> getAnnotations() {
        return this.annotations == null ? Output.empty() : this.annotations;
    }

    /**
     * Dataset description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The folder that this Dataset is in. If not specified, Dataset will appear at the root level.
     * 
     */
    @Import(name="folder")
      private final @Nullable Output<DatasetFolderArgs> folder;

    public Output<DatasetFolderArgs> getFolder() {
        return this.folder == null ? Output.empty() : this.folder;
    }

    /**
     * Linked service reference.
     * 
     */
    @Import(name="linkedServiceName", required=true)
      private final Output<LinkedServiceReferenceArgs> linkedServiceName;

    public Output<LinkedServiceReferenceArgs> getLinkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * Parameters for dataset.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;

    public Output<Map<String,ParameterSpecificationArgs>> getParameters() {
        return this.parameters == null ? Output.empty() : this.parameters;
    }

    /**
     * The path of the SAP ECC OData entity. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="path", required=true)
      private final Output<Object> path;

    public Output<Object> getPath() {
        return this.path;
    }

    /**
     * Columns that define the physical type schema of the dataset. Type: array (or Expression with resultType array), itemType: DatasetSchemaDataElement.
     * 
     */
    @Import(name="schema")
      private final @Nullable Output<Object> schema;

    public Output<Object> getSchema() {
        return this.schema == null ? Output.empty() : this.schema;
    }

    /**
     * Columns that define the structure of the dataset. Type: array (or Expression with resultType array), itemType: DatasetDataElement.
     * 
     */
    @Import(name="structure")
      private final @Nullable Output<Object> structure;

    public Output<Object> getStructure() {
        return this.structure == null ? Output.empty() : this.structure;
    }

    /**
     * Type of dataset.
     * Expected value is 'SapEccResource'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public SapEccResourceDatasetArgs(
        @Nullable Output<List<Object>> annotations,
        @Nullable Output<String> description,
        @Nullable Output<DatasetFolderArgs> folder,
        Output<LinkedServiceReferenceArgs> linkedServiceName,
        @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters,
        Output<Object> path,
        @Nullable Output<Object> schema,
        @Nullable Output<Object> structure,
        Output<String> type) {
        this.annotations = annotations;
        this.description = description;
        this.folder = folder;
        this.linkedServiceName = Objects.requireNonNull(linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
        this.parameters = parameters;
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.schema = schema;
        this.structure = structure;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private SapEccResourceDatasetArgs() {
        this.annotations = Output.empty();
        this.description = Output.empty();
        this.folder = Output.empty();
        this.linkedServiceName = Output.empty();
        this.parameters = Output.empty();
        this.path = Output.empty();
        this.schema = Output.empty();
        this.structure = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SapEccResourceDatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Object>> annotations;
        private @Nullable Output<String> description;
        private @Nullable Output<DatasetFolderArgs> folder;
        private Output<LinkedServiceReferenceArgs> linkedServiceName;
        private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;
        private Output<Object> path;
        private @Nullable Output<Object> schema;
        private @Nullable Output<Object> structure;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(SapEccResourceDatasetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.description = defaults.description;
    	      this.folder = defaults.folder;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.parameters = defaults.parameters;
    	      this.path = defaults.path;
    	      this.schema = defaults.schema;
    	      this.structure = defaults.structure;
    	      this.type = defaults.type;
        }

        public Builder annotations(@Nullable Output<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = Output.ofNullable(annotations);
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder folder(@Nullable Output<DatasetFolderArgs> folder) {
            this.folder = folder;
            return this;
        }
        public Builder folder(@Nullable DatasetFolderArgs folder) {
            this.folder = Output.ofNullable(folder);
            return this;
        }
        public Builder linkedServiceName(Output<LinkedServiceReferenceArgs> linkedServiceName) {
            this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
            return this;
        }
        public Builder linkedServiceName(LinkedServiceReferenceArgs linkedServiceName) {
            this.linkedServiceName = Output.of(Objects.requireNonNull(linkedServiceName));
            return this;
        }
        public Builder parameters(@Nullable Output<Map<String,ParameterSpecificationArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable Map<String,ParameterSpecificationArgs> parameters) {
            this.parameters = Output.ofNullable(parameters);
            return this;
        }
        public Builder path(Output<Object> path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder path(Object path) {
            this.path = Output.of(Objects.requireNonNull(path));
            return this;
        }
        public Builder schema(@Nullable Output<Object> schema) {
            this.schema = schema;
            return this;
        }
        public Builder schema(@Nullable Object schema) {
            this.schema = Output.ofNullable(schema);
            return this;
        }
        public Builder structure(@Nullable Output<Object> structure) {
            this.structure = structure;
            return this;
        }
        public Builder structure(@Nullable Object structure) {
            this.structure = Output.ofNullable(structure);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public SapEccResourceDatasetArgs build() {
            return new SapEccResourceDatasetArgs(annotations, description, folder, linkedServiceName, parameters, path, schema, structure, type);
        }
    }
}
