// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.AmazonS3CompatibleLocationResponse;
import io.pulumi.azurenative.datafactory.outputs.AmazonS3LocationResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureBlobFSLocationResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureBlobStorageLocationResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureDataLakeStoreLocationResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureFileStorageLocationResponse;
import io.pulumi.azurenative.datafactory.outputs.DatasetResponseFolder;
import io.pulumi.azurenative.datafactory.outputs.FileServerLocationResponse;
import io.pulumi.azurenative.datafactory.outputs.FtpServerLocationResponse;
import io.pulumi.azurenative.datafactory.outputs.GoogleCloudStorageLocationResponse;
import io.pulumi.azurenative.datafactory.outputs.HdfsLocationResponse;
import io.pulumi.azurenative.datafactory.outputs.HttpServerLocationResponse;
import io.pulumi.azurenative.datafactory.outputs.LinkedServiceReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.OracleCloudStorageLocationResponse;
import io.pulumi.azurenative.datafactory.outputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.outputs.SftpLocationResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AvroDatasetResponse {
    private final @Nullable List<Object> annotations;
    private final @Nullable Object avroCompressionCodec;
    private final @Nullable Integer avroCompressionLevel;
    private final @Nullable String description;
    private final @Nullable DatasetResponseFolder folder;
    private final LinkedServiceReferenceResponse linkedServiceName;
    private final Object location;
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    private final @Nullable Object schema;
    private final @Nullable Object structure;
    private final String type;

    @OutputCustomType.Constructor({"annotations","avroCompressionCodec","avroCompressionLevel","description","folder","linkedServiceName","location","parameters","schema","structure","type"})
    private AvroDatasetResponse(
        @Nullable List<Object> annotations,
        @Nullable Object avroCompressionCodec,
        @Nullable Integer avroCompressionLevel,
        @Nullable String description,
        @Nullable DatasetResponseFolder folder,
        LinkedServiceReferenceResponse linkedServiceName,
        Object location,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Object schema,
        @Nullable Object structure,
        String type) {
        this.annotations = annotations;
        this.avroCompressionCodec = avroCompressionCodec;
        this.avroCompressionLevel = avroCompressionLevel;
        this.description = description;
        this.folder = folder;
        this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
        this.location = Objects.requireNonNull(location);
        this.parameters = parameters;
        this.schema = schema;
        this.structure = structure;
        this.type = Objects.requireNonNull(type);
    }

    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    public Optional<Object> getAvroCompressionCodec() {
        return Optional.ofNullable(this.avroCompressionCodec);
    }
    public Optional<Integer> getAvroCompressionLevel() {
        return Optional.ofNullable(this.avroCompressionLevel);
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
    public Object getLocation() {
        return this.location;
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

    public static Builder builder(AvroDatasetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable Object avroCompressionCodec;
        private @Nullable Integer avroCompressionLevel;
        private @Nullable String description;
        private @Nullable DatasetResponseFolder folder;
        private LinkedServiceReferenceResponse linkedServiceName;
        private Object location;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Object schema;
        private @Nullable Object structure;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AvroDatasetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.avroCompressionCodec = defaults.avroCompressionCodec;
    	      this.avroCompressionLevel = defaults.avroCompressionLevel;
    	      this.description = defaults.description;
    	      this.folder = defaults.folder;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.location = defaults.location;
    	      this.parameters = defaults.parameters;
    	      this.schema = defaults.schema;
    	      this.structure = defaults.structure;
    	      this.type = defaults.type;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAvroCompressionCodec(@Nullable Object avroCompressionCodec) {
            this.avroCompressionCodec = avroCompressionCodec;
            return this;
        }

        public Builder setAvroCompressionLevel(@Nullable Integer avroCompressionLevel) {
            this.avroCompressionLevel = avroCompressionLevel;
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

        public Builder setLocation(Object location) {
            this.location = Objects.requireNonNull(location);
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

        public AvroDatasetResponse build() {
            return new AvroDatasetResponse(annotations, avroCompressionCodec, avroCompressionLevel, description, folder, linkedServiceName, location, parameters, schema, structure, type);
        }
    }
}
