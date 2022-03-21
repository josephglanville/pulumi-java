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
public final class AzureBlobDatasetResponse {
    /**
     * List of tags that can be used for describing the Dataset.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * The data compression method used for the blob storage.
     * 
     */
    private final @Nullable DatasetCompressionResponse compression;
    /**
     * Dataset description.
     * 
     */
    private final @Nullable String description;
    /**
     * The name of the Azure Blob. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object fileName;
    /**
     * The folder that this Dataset is in. If not specified, Dataset will appear at the root level.
     * 
     */
    private final @Nullable DatasetResponseFolder folder;
    /**
     * The path of the Azure Blob storage. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object folderPath;
    /**
     * The format of the Azure Blob storage.
     * 
     */
    private final @Nullable Object format;
    /**
     * Linked service reference.
     * 
     */
    private final LinkedServiceReferenceResponse linkedServiceName;
    /**
     * The end of Azure Blob's modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object modifiedDatetimeEnd;
    /**
     * The start of Azure Blob's modified datetime. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object modifiedDatetimeStart;
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
     * The root of blob path. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object tableRootLocation;
    /**
     * Type of dataset.
     * Expected value is 'AzureBlob'.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private AzureBlobDatasetResponse(
        @CustomType.Parameter("annotations") @Nullable List<Object> annotations,
        @CustomType.Parameter("compression") @Nullable DatasetCompressionResponse compression,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("fileName") @Nullable Object fileName,
        @CustomType.Parameter("folder") @Nullable DatasetResponseFolder folder,
        @CustomType.Parameter("folderPath") @Nullable Object folderPath,
        @CustomType.Parameter("format") @Nullable Object format,
        @CustomType.Parameter("linkedServiceName") LinkedServiceReferenceResponse linkedServiceName,
        @CustomType.Parameter("modifiedDatetimeEnd") @Nullable Object modifiedDatetimeEnd,
        @CustomType.Parameter("modifiedDatetimeStart") @Nullable Object modifiedDatetimeStart,
        @CustomType.Parameter("parameters") @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @CustomType.Parameter("schema") @Nullable Object schema,
        @CustomType.Parameter("structure") @Nullable Object structure,
        @CustomType.Parameter("tableRootLocation") @Nullable Object tableRootLocation,
        @CustomType.Parameter("type") String type) {
        this.annotations = annotations;
        this.compression = compression;
        this.description = description;
        this.fileName = fileName;
        this.folder = folder;
        this.folderPath = folderPath;
        this.format = format;
        this.linkedServiceName = linkedServiceName;
        this.modifiedDatetimeEnd = modifiedDatetimeEnd;
        this.modifiedDatetimeStart = modifiedDatetimeStart;
        this.parameters = parameters;
        this.schema = schema;
        this.structure = structure;
        this.tableRootLocation = tableRootLocation;
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
     * The data compression method used for the blob storage.
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
     * The name of the Azure Blob. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getFileName() {
        return Optional.ofNullable(this.fileName);
    }
    /**
     * The folder that this Dataset is in. If not specified, Dataset will appear at the root level.
     * 
    */
    public Optional<DatasetResponseFolder> getFolder() {
        return Optional.ofNullable(this.folder);
    }
    /**
     * The path of the Azure Blob storage. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getFolderPath() {
        return Optional.ofNullable(this.folderPath);
    }
    /**
     * The format of the Azure Blob storage.
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
     * The end of Azure Blob's modified datetime. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getModifiedDatetimeEnd() {
        return Optional.ofNullable(this.modifiedDatetimeEnd);
    }
    /**
     * The start of Azure Blob's modified datetime. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getModifiedDatetimeStart() {
        return Optional.ofNullable(this.modifiedDatetimeStart);
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
     * The root of blob path. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getTableRootLocation() {
        return Optional.ofNullable(this.tableRootLocation);
    }
    /**
     * Type of dataset.
     * Expected value is 'AzureBlob'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureBlobDatasetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable DatasetCompressionResponse compression;
        private @Nullable String description;
        private @Nullable Object fileName;
        private @Nullable DatasetResponseFolder folder;
        private @Nullable Object folderPath;
        private @Nullable Object format;
        private LinkedServiceReferenceResponse linkedServiceName;
        private @Nullable Object modifiedDatetimeEnd;
        private @Nullable Object modifiedDatetimeStart;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Object schema;
        private @Nullable Object structure;
        private @Nullable Object tableRootLocation;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureBlobDatasetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.compression = defaults.compression;
    	      this.description = defaults.description;
    	      this.fileName = defaults.fileName;
    	      this.folder = defaults.folder;
    	      this.folderPath = defaults.folderPath;
    	      this.format = defaults.format;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.modifiedDatetimeEnd = defaults.modifiedDatetimeEnd;
    	      this.modifiedDatetimeStart = defaults.modifiedDatetimeStart;
    	      this.parameters = defaults.parameters;
    	      this.schema = defaults.schema;
    	      this.structure = defaults.structure;
    	      this.tableRootLocation = defaults.tableRootLocation;
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
        public Builder fileName(@Nullable Object fileName) {
            this.fileName = fileName;
            return this;
        }
        public Builder folder(@Nullable DatasetResponseFolder folder) {
            this.folder = folder;
            return this;
        }
        public Builder folderPath(@Nullable Object folderPath) {
            this.folderPath = folderPath;
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
        public Builder modifiedDatetimeEnd(@Nullable Object modifiedDatetimeEnd) {
            this.modifiedDatetimeEnd = modifiedDatetimeEnd;
            return this;
        }
        public Builder modifiedDatetimeStart(@Nullable Object modifiedDatetimeStart) {
            this.modifiedDatetimeStart = modifiedDatetimeStart;
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
        public Builder tableRootLocation(@Nullable Object tableRootLocation) {
            this.tableRootLocation = tableRootLocation;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public AzureBlobDatasetResponse build() {
            return new AzureBlobDatasetResponse(annotations, compression, description, fileName, folder, folderPath, format, linkedServiceName, modifiedDatetimeEnd, modifiedDatetimeStart, parameters, schema, structure, tableRootLocation, type);
        }
    }
}
