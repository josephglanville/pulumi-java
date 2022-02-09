// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AvroFormatResponse;
import io.pulumi.azurenative.datafactory.inputs.DatasetCompressionResponse;
import io.pulumi.azurenative.datafactory.inputs.DatasetResponseFolder;
import io.pulumi.azurenative.datafactory.inputs.JsonFormatResponse;
import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.OrcFormatResponse;
import io.pulumi.azurenative.datafactory.inputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.inputs.ParquetFormatResponse;
import io.pulumi.azurenative.datafactory.inputs.TextFormatResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AmazonS3DatasetResponse extends io.pulumi.resources.InvokeArgs {

    public static final AmazonS3DatasetResponse Empty = new AmazonS3DatasetResponse();

    @InputImport(name="annotations")
    private final @Nullable List<Object> annotations;

    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }

    @InputImport(name="bucketName", required=true)
    private final Object bucketName;

    public Object getBucketName() {
        return this.bucketName;
    }

    @InputImport(name="compression")
    private final @Nullable DatasetCompressionResponse compression;

    public Optional<DatasetCompressionResponse> getCompression() {
        return this.compression == null ? Optional.empty() : Optional.ofNullable(this.compression);
    }

    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    @InputImport(name="folder")
    private final @Nullable DatasetResponseFolder folder;

    public Optional<DatasetResponseFolder> getFolder() {
        return this.folder == null ? Optional.empty() : Optional.ofNullable(this.folder);
    }

    @InputImport(name="format")
    private final @Nullable Object format;

    public Object getFormat() {
        return this.format == null ? null : this.format;
    }

    @InputImport(name="key")
    private final @Nullable Object key;

    public Optional<Object> getKey() {
        return this.key == null ? Optional.empty() : Optional.ofNullable(this.key);
    }

    @InputImport(name="linkedServiceName", required=true)
    private final LinkedServiceReferenceResponse linkedServiceName;

    public LinkedServiceReferenceResponse getLinkedServiceName() {
        return this.linkedServiceName;
    }

    @InputImport(name="modifiedDatetimeEnd")
    private final @Nullable Object modifiedDatetimeEnd;

    public Optional<Object> getModifiedDatetimeEnd() {
        return this.modifiedDatetimeEnd == null ? Optional.empty() : Optional.ofNullable(this.modifiedDatetimeEnd);
    }

    @InputImport(name="modifiedDatetimeStart")
    private final @Nullable Object modifiedDatetimeStart;

    public Optional<Object> getModifiedDatetimeStart() {
        return this.modifiedDatetimeStart == null ? Optional.empty() : Optional.ofNullable(this.modifiedDatetimeStart);
    }

    @InputImport(name="parameters")
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;

    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }

    @InputImport(name="prefix")
    private final @Nullable Object prefix;

    public Optional<Object> getPrefix() {
        return this.prefix == null ? Optional.empty() : Optional.ofNullable(this.prefix);
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

    @InputImport(name="version")
    private final @Nullable Object version;

    public Optional<Object> getVersion() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public AmazonS3DatasetResponse(
        @Nullable List<Object> annotations,
        Object bucketName,
        @Nullable DatasetCompressionResponse compression,
        @Nullable String description,
        @Nullable DatasetResponseFolder folder,
        @Nullable Object format,
        @Nullable Object key,
        LinkedServiceReferenceResponse linkedServiceName,
        @Nullable Object modifiedDatetimeEnd,
        @Nullable Object modifiedDatetimeStart,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Object prefix,
        @Nullable Object schema,
        @Nullable Object structure,
        String type,
        @Nullable Object version) {
        this.annotations = annotations;
        this.bucketName = Objects.requireNonNull(bucketName, "expected parameter 'bucketName' to be non-null");
        this.compression = compression;
        this.description = description;
        this.folder = folder;
        this.format = format;
        this.key = key;
        this.linkedServiceName = Objects.requireNonNull(linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
        this.modifiedDatetimeEnd = modifiedDatetimeEnd;
        this.modifiedDatetimeStart = modifiedDatetimeStart;
        this.parameters = parameters;
        this.prefix = prefix;
        this.schema = schema;
        this.structure = structure;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.version = version;
    }

    private AmazonS3DatasetResponse() {
        this.annotations = List.of();
        this.bucketName = null;
        this.compression = null;
        this.description = null;
        this.folder = null;
        this.format = null;
        this.key = null;
        this.linkedServiceName = null;
        this.modifiedDatetimeEnd = null;
        this.modifiedDatetimeStart = null;
        this.parameters = Map.of();
        this.prefix = null;
        this.schema = null;
        this.structure = null;
        this.type = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AmazonS3DatasetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private Object bucketName;
        private @Nullable DatasetCompressionResponse compression;
        private @Nullable String description;
        private @Nullable DatasetResponseFolder folder;
        private @Nullable Object format;
        private @Nullable Object key;
        private LinkedServiceReferenceResponse linkedServiceName;
        private @Nullable Object modifiedDatetimeEnd;
        private @Nullable Object modifiedDatetimeStart;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Object prefix;
        private @Nullable Object schema;
        private @Nullable Object structure;
        private String type;
        private @Nullable Object version;

        public Builder() {
    	      // Empty
        }

        public Builder(AmazonS3DatasetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.bucketName = defaults.bucketName;
    	      this.compression = defaults.compression;
    	      this.description = defaults.description;
    	      this.folder = defaults.folder;
    	      this.format = defaults.format;
    	      this.key = defaults.key;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.modifiedDatetimeEnd = defaults.modifiedDatetimeEnd;
    	      this.modifiedDatetimeStart = defaults.modifiedDatetimeStart;
    	      this.parameters = defaults.parameters;
    	      this.prefix = defaults.prefix;
    	      this.schema = defaults.schema;
    	      this.structure = defaults.structure;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setBucketName(Object bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }

        public Builder setCompression(@Nullable DatasetCompressionResponse compression) {
            this.compression = compression;
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

        public Builder setFormat(@Nullable Object format) {
            this.format = format;
            return this;
        }

        public Builder setKey(@Nullable Object key) {
            this.key = key;
            return this;
        }

        public Builder setLinkedServiceName(LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
            return this;
        }

        public Builder setModifiedDatetimeEnd(@Nullable Object modifiedDatetimeEnd) {
            this.modifiedDatetimeEnd = modifiedDatetimeEnd;
            return this;
        }

        public Builder setModifiedDatetimeStart(@Nullable Object modifiedDatetimeStart) {
            this.modifiedDatetimeStart = modifiedDatetimeStart;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setPrefix(@Nullable Object prefix) {
            this.prefix = prefix;
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

        public Builder setVersion(@Nullable Object version) {
            this.version = version;
            return this;
        }

        public AmazonS3DatasetResponse build() {
            return new AmazonS3DatasetResponse(annotations, bucketName, compression, description, folder, format, key, linkedServiceName, modifiedDatetimeEnd, modifiedDatetimeStart, parameters, prefix, schema, structure, type, version);
        }
    }
}
