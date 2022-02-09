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
public final class MongoDbAtlasCollectionDatasetResponse {
    private final @Nullable List<Object> annotations;
    private final Object collection;
    private final @Nullable String description;
    private final @Nullable DatasetResponseFolder folder;
    private final LinkedServiceReferenceResponse linkedServiceName;
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    private final @Nullable Object schema;
    private final @Nullable Object structure;
    private final String type;

    @OutputCustomType.Constructor({"annotations","collection","description","folder","linkedServiceName","parameters","schema","structure","type"})
    private MongoDbAtlasCollectionDatasetResponse(
        @Nullable List<Object> annotations,
        Object collection,
        @Nullable String description,
        @Nullable DatasetResponseFolder folder,
        LinkedServiceReferenceResponse linkedServiceName,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Object schema,
        @Nullable Object structure,
        String type) {
        this.annotations = annotations;
        this.collection = Objects.requireNonNull(collection);
        this.description = description;
        this.folder = folder;
        this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
        this.parameters = parameters;
        this.schema = schema;
        this.structure = structure;
        this.type = Objects.requireNonNull(type);
    }

    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    public Object getCollection() {
        return this.collection;
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
    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
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

    public static Builder builder(MongoDbAtlasCollectionDatasetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private Object collection;
        private @Nullable String description;
        private @Nullable DatasetResponseFolder folder;
        private LinkedServiceReferenceResponse linkedServiceName;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Object schema;
        private @Nullable Object structure;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(MongoDbAtlasCollectionDatasetResponse defaults) {
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

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setCollection(Object collection) {
            this.collection = Objects.requireNonNull(collection);
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

        public MongoDbAtlasCollectionDatasetResponse build() {
            return new MongoDbAtlasCollectionDatasetResponse(annotations, collection, description, folder, linkedServiceName, parameters, schema, structure, type);
        }
    }
}
