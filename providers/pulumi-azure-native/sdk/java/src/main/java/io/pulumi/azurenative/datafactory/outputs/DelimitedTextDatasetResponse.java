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
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DelimitedTextDatasetResponse {
    /**
     * List of tags that can be used for describing the Dataset.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * The column delimiter. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object columnDelimiter;
    /**
     * The data compressionCodec. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object compressionCodec;
    /**
     * The data compression method used for DelimitedText.
     * 
     */
    private final @Nullable Object compressionLevel;
    /**
     * Dataset description.
     * 
     */
    private final @Nullable String description;
    /**
     * The code page name of the preferred encoding. If miss, the default value is UTF-8, unless BOM denotes another Unicode encoding. Refer to the name column of the table in the following link to set supported values: https://msdn.microsoft.com/library/system.text.encoding.aspx. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object encodingName;
    /**
     * The escape character. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object escapeChar;
    /**
     * When used as input, treat the first row of data as headers. When used as output,write the headers into the output as the first row of data. The default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object firstRowAsHeader;
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
     * The location of the delimited text storage.
     * 
     */
    private final Object location;
    /**
     * The null value string. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object nullValue;
    /**
     * Parameters for dataset.
     * 
     */
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    /**
     * The quote character. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object quoteChar;
    /**
     * The row delimiter. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object rowDelimiter;
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
     * Expected value is 'DelimitedText'.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private DelimitedTextDatasetResponse(
        @CustomType.Parameter("annotations") @Nullable List<Object> annotations,
        @CustomType.Parameter("columnDelimiter") @Nullable Object columnDelimiter,
        @CustomType.Parameter("compressionCodec") @Nullable Object compressionCodec,
        @CustomType.Parameter("compressionLevel") @Nullable Object compressionLevel,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("encodingName") @Nullable Object encodingName,
        @CustomType.Parameter("escapeChar") @Nullable Object escapeChar,
        @CustomType.Parameter("firstRowAsHeader") @Nullable Object firstRowAsHeader,
        @CustomType.Parameter("folder") @Nullable DatasetResponseFolder folder,
        @CustomType.Parameter("linkedServiceName") LinkedServiceReferenceResponse linkedServiceName,
        @CustomType.Parameter("location") Object location,
        @CustomType.Parameter("nullValue") @Nullable Object nullValue,
        @CustomType.Parameter("parameters") @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @CustomType.Parameter("quoteChar") @Nullable Object quoteChar,
        @CustomType.Parameter("rowDelimiter") @Nullable Object rowDelimiter,
        @CustomType.Parameter("schema") @Nullable Object schema,
        @CustomType.Parameter("structure") @Nullable Object structure,
        @CustomType.Parameter("type") String type) {
        this.annotations = annotations;
        this.columnDelimiter = columnDelimiter;
        this.compressionCodec = compressionCodec;
        this.compressionLevel = compressionLevel;
        this.description = description;
        this.encodingName = encodingName;
        this.escapeChar = escapeChar;
        this.firstRowAsHeader = firstRowAsHeader;
        this.folder = folder;
        this.linkedServiceName = linkedServiceName;
        this.location = location;
        this.nullValue = nullValue;
        this.parameters = parameters;
        this.quoteChar = quoteChar;
        this.rowDelimiter = rowDelimiter;
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
     * The column delimiter. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getColumnDelimiter() {
        return Optional.ofNullable(this.columnDelimiter);
    }
    /**
     * The data compressionCodec. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getCompressionCodec() {
        return Optional.ofNullable(this.compressionCodec);
    }
    /**
     * The data compression method used for DelimitedText.
     * 
    */
    public Optional<Object> getCompressionLevel() {
        return Optional.ofNullable(this.compressionLevel);
    }
    /**
     * Dataset description.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The code page name of the preferred encoding. If miss, the default value is UTF-8, unless BOM denotes another Unicode encoding. Refer to the name column of the table in the following link to set supported values: https://msdn.microsoft.com/library/system.text.encoding.aspx. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getEncodingName() {
        return Optional.ofNullable(this.encodingName);
    }
    /**
     * The escape character. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getEscapeChar() {
        return Optional.ofNullable(this.escapeChar);
    }
    /**
     * When used as input, treat the first row of data as headers. When used as output,write the headers into the output as the first row of data. The default value is false. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> getFirstRowAsHeader() {
        return Optional.ofNullable(this.firstRowAsHeader);
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
     * The location of the delimited text storage.
     * 
    */
    public Object getLocation() {
        return this.location;
    }
    /**
     * The null value string. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getNullValue() {
        return Optional.ofNullable(this.nullValue);
    }
    /**
     * Parameters for dataset.
     * 
    */
    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * The quote character. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getQuoteChar() {
        return Optional.ofNullable(this.quoteChar);
    }
    /**
     * The row delimiter. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getRowDelimiter() {
        return Optional.ofNullable(this.rowDelimiter);
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
     * Expected value is 'DelimitedText'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DelimitedTextDatasetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable Object columnDelimiter;
        private @Nullable Object compressionCodec;
        private @Nullable Object compressionLevel;
        private @Nullable String description;
        private @Nullable Object encodingName;
        private @Nullable Object escapeChar;
        private @Nullable Object firstRowAsHeader;
        private @Nullable DatasetResponseFolder folder;
        private LinkedServiceReferenceResponse linkedServiceName;
        private Object location;
        private @Nullable Object nullValue;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Object quoteChar;
        private @Nullable Object rowDelimiter;
        private @Nullable Object schema;
        private @Nullable Object structure;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DelimitedTextDatasetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.columnDelimiter = defaults.columnDelimiter;
    	      this.compressionCodec = defaults.compressionCodec;
    	      this.compressionLevel = defaults.compressionLevel;
    	      this.description = defaults.description;
    	      this.encodingName = defaults.encodingName;
    	      this.escapeChar = defaults.escapeChar;
    	      this.firstRowAsHeader = defaults.firstRowAsHeader;
    	      this.folder = defaults.folder;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.location = defaults.location;
    	      this.nullValue = defaults.nullValue;
    	      this.parameters = defaults.parameters;
    	      this.quoteChar = defaults.quoteChar;
    	      this.rowDelimiter = defaults.rowDelimiter;
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
        public Builder columnDelimiter(@Nullable Object columnDelimiter) {
            this.columnDelimiter = columnDelimiter;
            return this;
        }
        public Builder compressionCodec(@Nullable Object compressionCodec) {
            this.compressionCodec = compressionCodec;
            return this;
        }
        public Builder compressionLevel(@Nullable Object compressionLevel) {
            this.compressionLevel = compressionLevel;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder encodingName(@Nullable Object encodingName) {
            this.encodingName = encodingName;
            return this;
        }
        public Builder escapeChar(@Nullable Object escapeChar) {
            this.escapeChar = escapeChar;
            return this;
        }
        public Builder firstRowAsHeader(@Nullable Object firstRowAsHeader) {
            this.firstRowAsHeader = firstRowAsHeader;
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
        public Builder nullValue(@Nullable Object nullValue) {
            this.nullValue = nullValue;
            return this;
        }
        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder quoteChar(@Nullable Object quoteChar) {
            this.quoteChar = quoteChar;
            return this;
        }
        public Builder rowDelimiter(@Nullable Object rowDelimiter) {
            this.rowDelimiter = rowDelimiter;
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
        }        public DelimitedTextDatasetResponse build() {
            return new DelimitedTextDatasetResponse(annotations, columnDelimiter, compressionCodec, compressionLevel, description, encodingName, escapeChar, firstRowAsHeader, folder, linkedServiceName, location, nullValue, parameters, quoteChar, rowDelimiter, schema, structure, type);
        }
    }
}
