// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.DatasetResponseFolder;
import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SapOpenHubTableDatasetResponse extends io.pulumi.resources.InvokeArgs {

    public static final SapOpenHubTableDatasetResponse Empty = new SapOpenHubTableDatasetResponse();

    @InputImport(name="annotations")
    private final @Nullable List<Object> annotations;

    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }

    @InputImport(name="baseRequestId")
    private final @Nullable Object baseRequestId;

    public Optional<Object> getBaseRequestId() {
        return this.baseRequestId == null ? Optional.empty() : Optional.ofNullable(this.baseRequestId);
    }

    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    @InputImport(name="excludeLastRequest")
    private final @Nullable Object excludeLastRequest;

    public Optional<Object> getExcludeLastRequest() {
        return this.excludeLastRequest == null ? Optional.empty() : Optional.ofNullable(this.excludeLastRequest);
    }

    @InputImport(name="folder")
    private final @Nullable DatasetResponseFolder folder;

    public Optional<DatasetResponseFolder> getFolder() {
        return this.folder == null ? Optional.empty() : Optional.ofNullable(this.folder);
    }

    @InputImport(name="linkedServiceName", required=true)
    private final LinkedServiceReferenceResponse linkedServiceName;

    public LinkedServiceReferenceResponse getLinkedServiceName() {
        return this.linkedServiceName;
    }

    @InputImport(name="openHubDestinationName", required=true)
    private final Object openHubDestinationName;

    public Object getOpenHubDestinationName() {
        return this.openHubDestinationName;
    }

    @InputImport(name="parameters")
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;

    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }

    @InputImport(name="schema")
    private final @Nullable Object schema;

    public Optional<Object> getSchema() {
        return this.schema == null ? Optional.empty() : Optional.ofNullable(this.schema);
    }

    @InputImport(name="structure")
    private final @Nullable Object structure;

    public Optional<Object> getStructure() {
        return this.structure == null ? Optional.empty() : Optional.ofNullable(this.structure);
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public SapOpenHubTableDatasetResponse(
        @Nullable List<Object> annotations,
        @Nullable Object baseRequestId,
        @Nullable String description,
        @Nullable Object excludeLastRequest,
        @Nullable DatasetResponseFolder folder,
        LinkedServiceReferenceResponse linkedServiceName,
        Object openHubDestinationName,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Object schema,
        @Nullable Object structure,
        String type) {
        this.annotations = annotations;
        this.baseRequestId = baseRequestId;
        this.description = description;
        this.excludeLastRequest = excludeLastRequest;
        this.folder = folder;
        this.linkedServiceName = Objects.requireNonNull(linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
        this.openHubDestinationName = Objects.requireNonNull(openHubDestinationName, "expected parameter 'openHubDestinationName' to be non-null");
        this.parameters = parameters;
        this.schema = schema;
        this.structure = structure;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private SapOpenHubTableDatasetResponse() {
        this.annotations = List.of();
        this.baseRequestId = null;
        this.description = null;
        this.excludeLastRequest = null;
        this.folder = null;
        this.linkedServiceName = null;
        this.openHubDestinationName = null;
        this.parameters = Map.of();
        this.schema = null;
        this.structure = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SapOpenHubTableDatasetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable Object baseRequestId;
        private @Nullable String description;
        private @Nullable Object excludeLastRequest;
        private @Nullable DatasetResponseFolder folder;
        private LinkedServiceReferenceResponse linkedServiceName;
        private Object openHubDestinationName;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Object schema;
        private @Nullable Object structure;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SapOpenHubTableDatasetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.baseRequestId = defaults.baseRequestId;
    	      this.description = defaults.description;
    	      this.excludeLastRequest = defaults.excludeLastRequest;
    	      this.folder = defaults.folder;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.openHubDestinationName = defaults.openHubDestinationName;
    	      this.parameters = defaults.parameters;
    	      this.schema = defaults.schema;
    	      this.structure = defaults.structure;
    	      this.type = defaults.type;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setBaseRequestId(@Nullable Object baseRequestId) {
            this.baseRequestId = baseRequestId;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setExcludeLastRequest(@Nullable Object excludeLastRequest) {
            this.excludeLastRequest = excludeLastRequest;
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

        public Builder setOpenHubDestinationName(Object openHubDestinationName) {
            this.openHubDestinationName = Objects.requireNonNull(openHubDestinationName);
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
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

        public SapOpenHubTableDatasetResponse build() {
            return new SapOpenHubTableDatasetResponse(annotations, baseRequestId, description, excludeLastRequest, folder, linkedServiceName, openHubDestinationName, parameters, schema, structure, type);
        }
    }
}
