// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.DatasetFolderArgs;
import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A Rest service dataset.
 * 
 */
public final class RestResourceDatasetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RestResourceDatasetArgs Empty = new RestResourceDatasetArgs();

    /**
     * The additional HTTP headers in the request to the RESTful API. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="additionalHeaders")
      private final @Nullable Output<Object> additionalHeaders;

    public Output<Object> getAdditionalHeaders() {
        return this.additionalHeaders == null ? Codegen.empty() : this.additionalHeaders;
    }

    /**
     * List of tags that can be used for describing the Dataset.
     * 
     */
    @Import(name="annotations")
      private final @Nullable Output<List<Object>> annotations;

    public Output<List<Object>> getAnnotations() {
        return this.annotations == null ? Codegen.empty() : this.annotations;
    }

    /**
     * Dataset description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The folder that this Dataset is in. If not specified, Dataset will appear at the root level.
     * 
     */
    @Import(name="folder")
      private final @Nullable Output<DatasetFolderArgs> folder;

    public Output<DatasetFolderArgs> getFolder() {
        return this.folder == null ? Codegen.empty() : this.folder;
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
     * The pagination rules to compose next page requests. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="paginationRules")
      private final @Nullable Output<Object> paginationRules;

    public Output<Object> getPaginationRules() {
        return this.paginationRules == null ? Codegen.empty() : this.paginationRules;
    }

    /**
     * Parameters for dataset.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;

    public Output<Map<String,ParameterSpecificationArgs>> getParameters() {
        return this.parameters == null ? Codegen.empty() : this.parameters;
    }

    /**
     * The relative URL to the resource that the RESTful API provides. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="relativeUrl")
      private final @Nullable Output<Object> relativeUrl;

    public Output<Object> getRelativeUrl() {
        return this.relativeUrl == null ? Codegen.empty() : this.relativeUrl;
    }

    /**
     * The HTTP request body to the RESTful API if requestMethod is POST. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="requestBody")
      private final @Nullable Output<Object> requestBody;

    public Output<Object> getRequestBody() {
        return this.requestBody == null ? Codegen.empty() : this.requestBody;
    }

    /**
     * The HTTP method used to call the RESTful API. The default is GET. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="requestMethod")
      private final @Nullable Output<Object> requestMethod;

    public Output<Object> getRequestMethod() {
        return this.requestMethod == null ? Codegen.empty() : this.requestMethod;
    }

    /**
     * Columns that define the physical type schema of the dataset. Type: array (or Expression with resultType array), itemType: DatasetSchemaDataElement.
     * 
     */
    @Import(name="schema")
      private final @Nullable Output<Object> schema;

    public Output<Object> getSchema() {
        return this.schema == null ? Codegen.empty() : this.schema;
    }

    /**
     * Columns that define the structure of the dataset. Type: array (or Expression with resultType array), itemType: DatasetDataElement.
     * 
     */
    @Import(name="structure")
      private final @Nullable Output<Object> structure;

    public Output<Object> getStructure() {
        return this.structure == null ? Codegen.empty() : this.structure;
    }

    /**
     * Type of dataset.
     * Expected value is 'RestResource'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public RestResourceDatasetArgs(
        @Nullable Output<Object> additionalHeaders,
        @Nullable Output<List<Object>> annotations,
        @Nullable Output<String> description,
        @Nullable Output<DatasetFolderArgs> folder,
        Output<LinkedServiceReferenceArgs> linkedServiceName,
        @Nullable Output<Object> paginationRules,
        @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Output<Object> relativeUrl,
        @Nullable Output<Object> requestBody,
        @Nullable Output<Object> requestMethod,
        @Nullable Output<Object> schema,
        @Nullable Output<Object> structure,
        Output<String> type) {
        this.additionalHeaders = additionalHeaders;
        this.annotations = annotations;
        this.description = description;
        this.folder = folder;
        this.linkedServiceName = Objects.requireNonNull(linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
        this.paginationRules = paginationRules;
        this.parameters = parameters;
        this.relativeUrl = relativeUrl;
        this.requestBody = requestBody;
        this.requestMethod = requestMethod;
        this.schema = schema;
        this.structure = structure;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private RestResourceDatasetArgs() {
        this.additionalHeaders = Codegen.empty();
        this.annotations = Codegen.empty();
        this.description = Codegen.empty();
        this.folder = Codegen.empty();
        this.linkedServiceName = Codegen.empty();
        this.paginationRules = Codegen.empty();
        this.parameters = Codegen.empty();
        this.relativeUrl = Codegen.empty();
        this.requestBody = Codegen.empty();
        this.requestMethod = Codegen.empty();
        this.schema = Codegen.empty();
        this.structure = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestResourceDatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> additionalHeaders;
        private @Nullable Output<List<Object>> annotations;
        private @Nullable Output<String> description;
        private @Nullable Output<DatasetFolderArgs> folder;
        private Output<LinkedServiceReferenceArgs> linkedServiceName;
        private @Nullable Output<Object> paginationRules;
        private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Output<Object> relativeUrl;
        private @Nullable Output<Object> requestBody;
        private @Nullable Output<Object> requestMethod;
        private @Nullable Output<Object> schema;
        private @Nullable Output<Object> structure;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(RestResourceDatasetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalHeaders = defaults.additionalHeaders;
    	      this.annotations = defaults.annotations;
    	      this.description = defaults.description;
    	      this.folder = defaults.folder;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.paginationRules = defaults.paginationRules;
    	      this.parameters = defaults.parameters;
    	      this.relativeUrl = defaults.relativeUrl;
    	      this.requestBody = defaults.requestBody;
    	      this.requestMethod = defaults.requestMethod;
    	      this.schema = defaults.schema;
    	      this.structure = defaults.structure;
    	      this.type = defaults.type;
        }

        public Builder additionalHeaders(@Nullable Output<Object> additionalHeaders) {
            this.additionalHeaders = additionalHeaders;
            return this;
        }
        public Builder additionalHeaders(@Nullable Object additionalHeaders) {
            this.additionalHeaders = Codegen.ofNullable(additionalHeaders);
            return this;
        }
        public Builder annotations(@Nullable Output<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = Codegen.ofNullable(annotations);
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
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder folder(@Nullable Output<DatasetFolderArgs> folder) {
            this.folder = folder;
            return this;
        }
        public Builder folder(@Nullable DatasetFolderArgs folder) {
            this.folder = Codegen.ofNullable(folder);
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
        public Builder paginationRules(@Nullable Output<Object> paginationRules) {
            this.paginationRules = paginationRules;
            return this;
        }
        public Builder paginationRules(@Nullable Object paginationRules) {
            this.paginationRules = Codegen.ofNullable(paginationRules);
            return this;
        }
        public Builder parameters(@Nullable Output<Map<String,ParameterSpecificationArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable Map<String,ParameterSpecificationArgs> parameters) {
            this.parameters = Codegen.ofNullable(parameters);
            return this;
        }
        public Builder relativeUrl(@Nullable Output<Object> relativeUrl) {
            this.relativeUrl = relativeUrl;
            return this;
        }
        public Builder relativeUrl(@Nullable Object relativeUrl) {
            this.relativeUrl = Codegen.ofNullable(relativeUrl);
            return this;
        }
        public Builder requestBody(@Nullable Output<Object> requestBody) {
            this.requestBody = requestBody;
            return this;
        }
        public Builder requestBody(@Nullable Object requestBody) {
            this.requestBody = Codegen.ofNullable(requestBody);
            return this;
        }
        public Builder requestMethod(@Nullable Output<Object> requestMethod) {
            this.requestMethod = requestMethod;
            return this;
        }
        public Builder requestMethod(@Nullable Object requestMethod) {
            this.requestMethod = Codegen.ofNullable(requestMethod);
            return this;
        }
        public Builder schema(@Nullable Output<Object> schema) {
            this.schema = schema;
            return this;
        }
        public Builder schema(@Nullable Object schema) {
            this.schema = Codegen.ofNullable(schema);
            return this;
        }
        public Builder structure(@Nullable Output<Object> structure) {
            this.structure = structure;
            return this;
        }
        public Builder structure(@Nullable Object structure) {
            this.structure = Codegen.ofNullable(structure);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public RestResourceDatasetArgs build() {
            return new RestResourceDatasetArgs(additionalHeaders, annotations, description, folder, linkedServiceName, paginationRules, parameters, relativeUrl, requestBody, requestMethod, schema, structure, type);
        }
    }
}
