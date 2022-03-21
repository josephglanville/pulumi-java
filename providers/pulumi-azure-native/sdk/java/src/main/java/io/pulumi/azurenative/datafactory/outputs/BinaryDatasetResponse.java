// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.AmazonS3CompatibleLocationResponse;
import io.pulumi.azurenative.datafactory.outputs.AmazonS3LocationResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureBlobFSLocationResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureBlobStorageLocationResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureDataLakeStoreLocationResponse;
import io.pulumi.azurenative.datafactory.outputs.AzureFileStorageLocationResponse;
import io.pulumi.azurenative.datafactory.outputs.DatasetCompressionResponse;
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
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BinaryDatasetResponse {
    /**
     * List of tags that can be used for describing the Dataset.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * The data compression method used for the binary dataset.
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
     * Linked service reference.
     * 
     */
    private final LinkedServiceReferenceResponse linkedServiceName;
    /**
     * The location of the Binary storage.
     * 
     */
    private final Object location;
    /**
     * Parameters for dataset.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
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
     * Expected value is 'Binary'.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private BinaryDatasetResponse(
        @CustomType.Parameter("annotations") @Nullable List<Object> annotations,
        @CustomType.Parameter("compression") @Nullable DatasetCompressionResponse compression,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("folder") @Nullable DatasetResponseFolder folder,
        @CustomType.Parameter("linkedServiceName") LinkedServiceReferenceResponse linkedServiceName,
        @CustomType.Parameter("location") Object location,
        @CustomType.Parameter("parameters") @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @CustomType.Parameter("schema") @Nullable Object schema,
        @CustomType.Parameter("structure") @Nullable Object structure,
        @CustomType.Parameter("type") String type) {
        this.annotations = annotations;
        this.compression = compression;
        this.description = description;
        this.folder = folder;
        this.linkedServiceName = linkedServiceName;
        this.location = location;
        this.parameters = parameters;
        this.schema = schema;
        this.structure = structure;
        this.type = type;
    }

    /**
     * List of tags that can be used for describing the Dataset.
     * 
    */
    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * The data compression method used for the binary dataset.
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
     * Linked service reference.
     * 
    */
    public LinkedServiceReferenceResponse getLinkedServiceName() {
        return this.linkedServiceName;
    }
    /**
     * The location of the Binary storage.
     * 
    */
    public Object getLocation() {
        return this.location;
    }
    /**
     * Parameters for dataset.
     * 
    */
    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
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
     * Expected value is 'Binary'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BinaryDatasetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable DatasetCompressionResponse compression;
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

        public Builder(BinaryDatasetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.compression = defaults.compression;
    	      this.description = defaults.description;
    	      this.folder = defaults.folder;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.location = defaults.location;
    	      this.parameters = defaults.parameters;
    	      this.schema = defaults.schema;
    	      this.structure = defaults.structure;
    	      this.type = defaults.type;
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
        public Builder linkedServiceName(LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
            return this;
        }
        public Builder location(Object location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
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
        }        public BinaryDatasetResponse build() {
            return new BinaryDatasetResponse(annotations, compression, description, folder, linkedServiceName, location, parameters, schema, structure, type);
        }
    }
}
