// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.DatasetResponseFolder;
import io.pulumi.azurenative.datafactory.outputs.LinkedServiceReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.ParameterSpecificationResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RestResourceDatasetResponse {
    private final @Nullable Object additionalHeaders;
    private final @Nullable List<Object> annotations;
    private final @Nullable String description;
    private final @Nullable DatasetResponseFolder folder;
    private final LinkedServiceReferenceResponse linkedServiceName;
    private final @Nullable Object paginationRules;
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    private final @Nullable Object relativeUrl;
    private final @Nullable Object requestBody;
    private final @Nullable Object requestMethod;
    private final @Nullable Object schema;
    private final @Nullable Object structure;
    private final String type;

    @OutputCustomType.Constructor({"additionalHeaders","annotations","description","folder","linkedServiceName","paginationRules","parameters","relativeUrl","requestBody","requestMethod","schema","structure","type"})
    private RestResourceDatasetResponse(
        @Nullable Object additionalHeaders,
        @Nullable List<Object> annotations,
        @Nullable String description,
        @Nullable DatasetResponseFolder folder,
        LinkedServiceReferenceResponse linkedServiceName,
        @Nullable Object paginationRules,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Object relativeUrl,
        @Nullable Object requestBody,
        @Nullable Object requestMethod,
        @Nullable Object schema,
        @Nullable Object structure,
        String type) {
        this.additionalHeaders = additionalHeaders;
        this.annotations = annotations;
        this.description = description;
        this.folder = folder;
        this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
        this.paginationRules = paginationRules;
        this.parameters = parameters;
        this.relativeUrl = relativeUrl;
        this.requestBody = requestBody;
        this.requestMethod = requestMethod;
        this.schema = schema;
        this.structure = structure;
        this.type = Objects.requireNonNull(type);
    }

    public Optional<Object> getAdditionalHeaders() {
        return Optional.ofNullable(this.additionalHeaders);
    }
    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<DatasetResponseFolder> getFolder() {
        return Optional.ofNullable(this.folder);
    }
    public LinkedServiceReferenceResponse getLinkedServiceName() {
        return this.linkedServiceName;
    }
    public Optional<Object> getPaginationRules() {
        return Optional.ofNullable(this.paginationRules);
    }
    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    public Optional<Object> getRelativeUrl() {
        return Optional.ofNullable(this.relativeUrl);
    }
    public Optional<Object> getRequestBody() {
        return Optional.ofNullable(this.requestBody);
    }
    public Optional<Object> getRequestMethod() {
        return Optional.ofNullable(this.requestMethod);
    }
    public Optional<Object> getSchema() {
        return Optional.ofNullable(this.schema);
    }
    public Optional<Object> getStructure() {
        return Optional.ofNullable(this.structure);
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestResourceDatasetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object additionalHeaders;
        private @Nullable List<Object> annotations;
        private @Nullable String description;
        private @Nullable DatasetResponseFolder folder;
        private LinkedServiceReferenceResponse linkedServiceName;
        private @Nullable Object paginationRules;
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

        public Builder(RestResourceDatasetResponse defaults) {
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

        public Builder setAdditionalHeaders(@Nullable Object additionalHeaders) {
            this.additionalHeaders = additionalHeaders;
            return this;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setFolder(@Nullable DatasetResponseFolder folder) {
            this.folder = folder;
            return this;
        }

        public Builder setLinkedServiceName(LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
            return this;
        }

        public Builder setPaginationRules(@Nullable Object paginationRules) {
            this.paginationRules = paginationRules;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setRelativeUrl(@Nullable Object relativeUrl) {
            this.relativeUrl = relativeUrl;
            return this;
        }

        public Builder setRequestBody(@Nullable Object requestBody) {
            this.requestBody = requestBody;
            return this;
        }

        public Builder setRequestMethod(@Nullable Object requestMethod) {
            this.requestMethod = requestMethod;
            return this;
        }

        public Builder setSchema(@Nullable Object schema) {
            this.schema = schema;
            return this;
        }

        public Builder setStructure(@Nullable Object structure) {
            this.structure = structure;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public RestResourceDatasetResponse build() {
            return new RestResourceDatasetResponse(additionalHeaders, annotations, description, folder, linkedServiceName, paginationRules, parameters, relativeUrl, requestBody, requestMethod, schema, structure, type);
        }
    }
}
