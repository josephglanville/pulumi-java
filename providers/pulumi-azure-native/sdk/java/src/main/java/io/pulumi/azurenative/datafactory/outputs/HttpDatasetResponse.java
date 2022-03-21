// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.AvroFormatResponse;
import io.pulumi.azurenative.datafactory.outputs.DatasetCompressionResponse;
import io.pulumi.azurenative.datafactory.outputs.DatasetResponseFolder;
import io.pulumi.azurenative.datafactory.outputs.JsonFormatResponse;
import io.pulumi.azurenative.datafactory.outputs.LinkedServiceReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.OrcFormatResponse;
import io.pulumi.azurenative.datafactory.outputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.outputs.ParquetFormatResponse;
import io.pulumi.azurenative.datafactory.outputs.TextFormatResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HttpDatasetResponse {
    /**
     * The headers for the HTTP Request. e.g. request-header-name-1:request-header-value-1
     * ...
     * request-header-name-n:request-header-value-n Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object additionalHeaders;
    /**
     * List of tags that can be used for describing the Dataset.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * The data compression method used on files.
     * 
     */
    private final @Nullable DatasetCompressionResponse compression;
    /**
     * Dataset description.
     * 
     */
    private final @Nullable String description;
    /**
     * The folder that this Dataset is in. If not specified, Dataset will appear at the root level.
     * 
     */
    private final @Nullable DatasetResponseFolder folder;
    /**
     * The format of files.
     * 
     */
    private final @Nullable Object format;
    /**
     * Linked service reference.
     * 
     */
    private final LinkedServiceReferenceResponse linkedServiceName;
    /**
     * Parameters for dataset.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * The relative URL based on the URL in the HttpLinkedService refers to an HTTP file Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object relativeUrl;
    /**
     * The body for the HTTP request. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object requestBody;
    /**
     * The HTTP method for the HTTP request. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object requestMethod;
    /**
     * Columns that define the physical type schema of the dataset. Type: array (or Expression with resultType array), itemType: DatasetSchemaDataElement.
     * 
     */
    private final @Nullable Object schema;
    /**
     * Columns that define the structure of the dataset. Type: array (or Expression with resultType array), itemType: DatasetDataElement.
     * 
     */
    private final @Nullable Object structure;
    /**
     * Type of dataset.
     * Expected value is 'HttpFile'.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private HttpDatasetResponse(
        @CustomType.Parameter("additionalHeaders") @Nullable Object additionalHeaders,
        @CustomType.Parameter("annotations") @Nullable List<Object> annotations,
        @CustomType.Parameter("compression") @Nullable DatasetCompressionResponse compression,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("folder") @Nullable DatasetResponseFolder folder,
        @CustomType.Parameter("format") @Nullable Object format,
        @CustomType.Parameter("linkedServiceName") LinkedServiceReferenceResponse linkedServiceName,
        @CustomType.Parameter("parameters") @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @CustomType.Parameter("relativeUrl") @Nullable Object relativeUrl,
        @CustomType.Parameter("requestBody") @Nullable Object requestBody,
        @CustomType.Parameter("requestMethod") @Nullable Object requestMethod,
        @CustomType.Parameter("schema") @Nullable Object schema,
        @CustomType.Parameter("structure") @Nullable Object structure,
        @CustomType.Parameter("type") String type) {
        this.additionalHeaders = additionalHeaders;
        this.annotations = annotations;
        this.compression = compression;
        this.description = description;
        this.folder = folder;
        this.format = format;
        this.linkedServiceName = linkedServiceName;
        this.parameters = parameters;
        this.relativeUrl = relativeUrl;
        this.requestBody = requestBody;
        this.requestMethod = requestMethod;
        this.schema = schema;
        this.structure = structure;
        this.type = type;
    }

    /**
     * The headers for the HTTP Request. e.g. request-header-name-1:request-header-value-1
     * ...
     * request-header-name-n:request-header-value-n Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getAdditionalHeaders() {
        return Optional.ofNullable(this.additionalHeaders);
    }
    /**
     * List of tags that can be used for describing the Dataset.
     * 
    */
    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * The data compression method used on files.
     * 
    */
    public Optional<DatasetCompressionResponse> getCompression() {
        return Optional.ofNullable(this.compression);
    }
    /**
     * Dataset description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The folder that this Dataset is in. If not specified, Dataset will appear at the root level.
     * 
    */
    public Optional<DatasetResponseFolder> getFolder() {
        return Optional.ofNullable(this.folder);
    }
    /**
     * The format of files.
     * 
    */
    public Optional<Object> getFormat() {
        return Optional.ofNullable(this.format);
    }
    /**
     * Linked service reference.
     * 
    */
    public LinkedServiceReferenceResponse getLinkedServiceName() {
        return this.linkedServiceName;
    }
    /**
     * Parameters for dataset.
     * 
    */
    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * The relative URL based on the URL in the HttpLinkedService refers to an HTTP file Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getRelativeUrl() {
        return Optional.ofNullable(this.relativeUrl);
    }
    /**
     * The body for the HTTP request. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getRequestBody() {
        return Optional.ofNullable(this.requestBody);
    }
    /**
     * The HTTP method for the HTTP request. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getRequestMethod() {
        return Optional.ofNullable(this.requestMethod);
    }
    /**
     * Columns that define the physical type schema of the dataset. Type: array (or Expression with resultType array), itemType: DatasetSchemaDataElement.
     * 
    */
    public Optional<Object> getSchema() {
        return Optional.ofNullable(this.schema);
    }
    /**
     * Columns that define the structure of the dataset. Type: array (or Expression with resultType array), itemType: DatasetDataElement.
     * 
    */
    public Optional<Object> getStructure() {
        return Optional.ofNullable(this.structure);
    }
    /**
     * Type of dataset.
     * Expected value is 'HttpFile'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpDatasetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object additionalHeaders;
        private @Nullable List<Object> annotations;
        private @Nullable DatasetCompressionResponse compression;
        private @Nullable String description;
        private @Nullable DatasetResponseFolder folder;
        private @Nullable Object format;
        private LinkedServiceReferenceResponse linkedServiceName;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Object relativeUrl;
        private @Nullable Object requestBody;
        private @Nullable Object requestMethod;
        private @Nullable Object schema;
        private @Nullable Object structure;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpDatasetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalHeaders = defaults.additionalHeaders;
    	      this.annotations = defaults.annotations;
    	      this.compression = defaults.compression;
    	      this.description = defaults.description;
    	      this.folder = defaults.folder;
    	      this.format = defaults.format;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.parameters = defaults.parameters;
    	      this.relativeUrl = defaults.relativeUrl;
    	      this.requestBody = defaults.requestBody;
    	      this.requestMethod = defaults.requestMethod;
    	      this.schema = defaults.schema;
    	      this.structure = defaults.structure;
    	      this.type = defaults.type;
        }

        public Builder additionalHeaders(@Nullable Object additionalHeaders) {
            this.additionalHeaders = additionalHeaders;
            return this;
        }
        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder compression(@Nullable DatasetCompressionResponse compression) {
            this.compression = compression;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder folder(@Nullable DatasetResponseFolder folder) {
            this.folder = folder;
            return this;
        }
        public Builder format(@Nullable Object format) {
            this.format = format;
            return this;
        }
        public Builder linkedServiceName(LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
            return this;
        }
        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder relativeUrl(@Nullable Object relativeUrl) {
            this.relativeUrl = relativeUrl;
            return this;
        }
        public Builder requestBody(@Nullable Object requestBody) {
            this.requestBody = requestBody;
            return this;
        }
        public Builder requestMethod(@Nullable Object requestMethod) {
            this.requestMethod = requestMethod;
            return this;
        }
        public Builder schema(@Nullable Object schema) {
            this.schema = schema;
            return this;
        }
        public Builder structure(@Nullable Object structure) {
            this.structure = structure;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public HttpDatasetResponse build() {
            return new HttpDatasetResponse(additionalHeaders, annotations, compression, description, folder, format, linkedServiceName, parameters, relativeUrl, requestBody, requestMethod, schema, structure, type);
        }
    }
}
