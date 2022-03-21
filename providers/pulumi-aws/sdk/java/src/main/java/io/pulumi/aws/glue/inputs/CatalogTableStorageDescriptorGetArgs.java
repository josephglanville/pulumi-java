// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorColumnGetArgs;
import io.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorSchemaReferenceGetArgs;
import io.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorSerDeInfoGetArgs;
import io.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorSkewedInfoGetArgs;
import io.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorSortColumnGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CatalogTableStorageDescriptorGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CatalogTableStorageDescriptorGetArgs Empty = new CatalogTableStorageDescriptorGetArgs();

    /**
     * List of reducer grouping columns, clustering columns, and bucketing columns in the table.
     * 
     */
    @Import(name="bucketColumns")
      private final @Nullable Output<List<String>> bucketColumns;

    public Output<List<String>> getBucketColumns() {
        return this.bucketColumns == null ? Output.empty() : this.bucketColumns;
    }

    /**
     * Configuration block for columns in the table. See `columns` below.
     * 
     */
    @Import(name="columns")
      private final @Nullable Output<List<CatalogTableStorageDescriptorColumnGetArgs>> columns;

    public Output<List<CatalogTableStorageDescriptorColumnGetArgs>> getColumns() {
        return this.columns == null ? Output.empty() : this.columns;
    }

    /**
     * Whether the data in the table is compressed.
     * 
     */
    @Import(name="compressed")
      private final @Nullable Output<Boolean> compressed;

    public Output<Boolean> getCompressed() {
        return this.compressed == null ? Output.empty() : this.compressed;
    }

    /**
     * Input format: SequenceFileInputFormat (binary), or TextInputFormat, or a custom format.
     * 
     */
    @Import(name="inputFormat")
      private final @Nullable Output<String> inputFormat;

    public Output<String> getInputFormat() {
        return this.inputFormat == null ? Output.empty() : this.inputFormat;
    }

    /**
     * Physical location of the table. By default this takes the form of the warehouse location, followed by the database location in the warehouse, followed by the table name.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Must be specified if the table contains any dimension columns.
     * 
     */
    @Import(name="numberOfBuckets")
      private final @Nullable Output<Integer> numberOfBuckets;

    public Output<Integer> getNumberOfBuckets() {
        return this.numberOfBuckets == null ? Output.empty() : this.numberOfBuckets;
    }

    /**
     * Output format: SequenceFileOutputFormat (binary), or IgnoreKeyTextOutputFormat, or a custom format.
     * 
     */
    @Import(name="outputFormat")
      private final @Nullable Output<String> outputFormat;

    public Output<String> getOutputFormat() {
        return this.outputFormat == null ? Output.empty() : this.outputFormat;
    }

    /**
     * Map of initialization parameters for the SerDe, in key-value form.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<Map<String,String>> parameters;

    public Output<Map<String,String>> getParameters() {
        return this.parameters == null ? Output.empty() : this.parameters;
    }

    /**
     * Object that references a schema stored in the AWS Glue Schema Registry. When creating a table, you can pass an empty list of columns for the schema, and instead use a schema reference. See Schema Reference below.
     * 
     */
    @Import(name="schemaReference")
      private final @Nullable Output<CatalogTableStorageDescriptorSchemaReferenceGetArgs> schemaReference;

    public Output<CatalogTableStorageDescriptorSchemaReferenceGetArgs> getSchemaReference() {
        return this.schemaReference == null ? Output.empty() : this.schemaReference;
    }

    /**
     * Configuration block for serialization and deserialization ("SerDe") information. See `ser_de_info` below.
     * 
     */
    @Import(name="serDeInfo")
      private final @Nullable Output<CatalogTableStorageDescriptorSerDeInfoGetArgs> serDeInfo;

    public Output<CatalogTableStorageDescriptorSerDeInfoGetArgs> getSerDeInfo() {
        return this.serDeInfo == null ? Output.empty() : this.serDeInfo;
    }

    /**
     * Configuration block with information about values that appear very frequently in a column (skewed values). See `skewed_info` below.
     * 
     */
    @Import(name="skewedInfo")
      private final @Nullable Output<CatalogTableStorageDescriptorSkewedInfoGetArgs> skewedInfo;

    public Output<CatalogTableStorageDescriptorSkewedInfoGetArgs> getSkewedInfo() {
        return this.skewedInfo == null ? Output.empty() : this.skewedInfo;
    }

    /**
     * Configuration block for the sort order of each bucket in the table. See `sort_columns` below.
     * 
     */
    @Import(name="sortColumns")
      private final @Nullable Output<List<CatalogTableStorageDescriptorSortColumnGetArgs>> sortColumns;

    public Output<List<CatalogTableStorageDescriptorSortColumnGetArgs>> getSortColumns() {
        return this.sortColumns == null ? Output.empty() : this.sortColumns;
    }

    /**
     * Whether the table data is stored in subdirectories.
     * 
     */
    @Import(name="storedAsSubDirectories")
      private final @Nullable Output<Boolean> storedAsSubDirectories;

    public Output<Boolean> getStoredAsSubDirectories() {
        return this.storedAsSubDirectories == null ? Output.empty() : this.storedAsSubDirectories;
    }

    public CatalogTableStorageDescriptorGetArgs(
        @Nullable Output<List<String>> bucketColumns,
        @Nullable Output<List<CatalogTableStorageDescriptorColumnGetArgs>> columns,
        @Nullable Output<Boolean> compressed,
        @Nullable Output<String> inputFormat,
        @Nullable Output<String> location,
        @Nullable Output<Integer> numberOfBuckets,
        @Nullable Output<String> outputFormat,
        @Nullable Output<Map<String,String>> parameters,
        @Nullable Output<CatalogTableStorageDescriptorSchemaReferenceGetArgs> schemaReference,
        @Nullable Output<CatalogTableStorageDescriptorSerDeInfoGetArgs> serDeInfo,
        @Nullable Output<CatalogTableStorageDescriptorSkewedInfoGetArgs> skewedInfo,
        @Nullable Output<List<CatalogTableStorageDescriptorSortColumnGetArgs>> sortColumns,
        @Nullable Output<Boolean> storedAsSubDirectories) {
        this.bucketColumns = bucketColumns;
        this.columns = columns;
        this.compressed = compressed;
        this.inputFormat = inputFormat;
        this.location = location;
        this.numberOfBuckets = numberOfBuckets;
        this.outputFormat = outputFormat;
        this.parameters = parameters;
        this.schemaReference = schemaReference;
        this.serDeInfo = serDeInfo;
        this.skewedInfo = skewedInfo;
        this.sortColumns = sortColumns;
        this.storedAsSubDirectories = storedAsSubDirectories;
    }

    private CatalogTableStorageDescriptorGetArgs() {
        this.bucketColumns = Output.empty();
        this.columns = Output.empty();
        this.compressed = Output.empty();
        this.inputFormat = Output.empty();
        this.location = Output.empty();
        this.numberOfBuckets = Output.empty();
        this.outputFormat = Output.empty();
        this.parameters = Output.empty();
        this.schemaReference = Output.empty();
        this.serDeInfo = Output.empty();
        this.skewedInfo = Output.empty();
        this.sortColumns = Output.empty();
        this.storedAsSubDirectories = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CatalogTableStorageDescriptorGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> bucketColumns;
        private @Nullable Output<List<CatalogTableStorageDescriptorColumnGetArgs>> columns;
        private @Nullable Output<Boolean> compressed;
        private @Nullable Output<String> inputFormat;
        private @Nullable Output<String> location;
        private @Nullable Output<Integer> numberOfBuckets;
        private @Nullable Output<String> outputFormat;
        private @Nullable Output<Map<String,String>> parameters;
        private @Nullable Output<CatalogTableStorageDescriptorSchemaReferenceGetArgs> schemaReference;
        private @Nullable Output<CatalogTableStorageDescriptorSerDeInfoGetArgs> serDeInfo;
        private @Nullable Output<CatalogTableStorageDescriptorSkewedInfoGetArgs> skewedInfo;
        private @Nullable Output<List<CatalogTableStorageDescriptorSortColumnGetArgs>> sortColumns;
        private @Nullable Output<Boolean> storedAsSubDirectories;

        public Builder() {
    	      // Empty
        }

        public Builder(CatalogTableStorageDescriptorGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketColumns = defaults.bucketColumns;
    	      this.columns = defaults.columns;
    	      this.compressed = defaults.compressed;
    	      this.inputFormat = defaults.inputFormat;
    	      this.location = defaults.location;
    	      this.numberOfBuckets = defaults.numberOfBuckets;
    	      this.outputFormat = defaults.outputFormat;
    	      this.parameters = defaults.parameters;
    	      this.schemaReference = defaults.schemaReference;
    	      this.serDeInfo = defaults.serDeInfo;
    	      this.skewedInfo = defaults.skewedInfo;
    	      this.sortColumns = defaults.sortColumns;
    	      this.storedAsSubDirectories = defaults.storedAsSubDirectories;
        }

        public Builder bucketColumns(@Nullable Output<List<String>> bucketColumns) {
            this.bucketColumns = bucketColumns;
            return this;
        }
        public Builder bucketColumns(@Nullable List<String> bucketColumns) {
            this.bucketColumns = Output.ofNullable(bucketColumns);
            return this;
        }
        public Builder bucketColumns(String... bucketColumns) {
            return bucketColumns(List.of(bucketColumns));
        }
        public Builder columns(@Nullable Output<List<CatalogTableStorageDescriptorColumnGetArgs>> columns) {
            this.columns = columns;
            return this;
        }
        public Builder columns(@Nullable List<CatalogTableStorageDescriptorColumnGetArgs> columns) {
            this.columns = Output.ofNullable(columns);
            return this;
        }
        public Builder columns(CatalogTableStorageDescriptorColumnGetArgs... columns) {
            return columns(List.of(columns));
        }
        public Builder compressed(@Nullable Output<Boolean> compressed) {
            this.compressed = compressed;
            return this;
        }
        public Builder compressed(@Nullable Boolean compressed) {
            this.compressed = Output.ofNullable(compressed);
            return this;
        }
        public Builder inputFormat(@Nullable Output<String> inputFormat) {
            this.inputFormat = inputFormat;
            return this;
        }
        public Builder inputFormat(@Nullable String inputFormat) {
            this.inputFormat = Output.ofNullable(inputFormat);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder numberOfBuckets(@Nullable Output<Integer> numberOfBuckets) {
            this.numberOfBuckets = numberOfBuckets;
            return this;
        }
        public Builder numberOfBuckets(@Nullable Integer numberOfBuckets) {
            this.numberOfBuckets = Output.ofNullable(numberOfBuckets);
            return this;
        }
        public Builder outputFormat(@Nullable Output<String> outputFormat) {
            this.outputFormat = outputFormat;
            return this;
        }
        public Builder outputFormat(@Nullable String outputFormat) {
            this.outputFormat = Output.ofNullable(outputFormat);
            return this;
        }
        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable Map<String,String> parameters) {
            this.parameters = Output.ofNullable(parameters);
            return this;
        }
        public Builder schemaReference(@Nullable Output<CatalogTableStorageDescriptorSchemaReferenceGetArgs> schemaReference) {
            this.schemaReference = schemaReference;
            return this;
        }
        public Builder schemaReference(@Nullable CatalogTableStorageDescriptorSchemaReferenceGetArgs schemaReference) {
            this.schemaReference = Output.ofNullable(schemaReference);
            return this;
        }
        public Builder serDeInfo(@Nullable Output<CatalogTableStorageDescriptorSerDeInfoGetArgs> serDeInfo) {
            this.serDeInfo = serDeInfo;
            return this;
        }
        public Builder serDeInfo(@Nullable CatalogTableStorageDescriptorSerDeInfoGetArgs serDeInfo) {
            this.serDeInfo = Output.ofNullable(serDeInfo);
            return this;
        }
        public Builder skewedInfo(@Nullable Output<CatalogTableStorageDescriptorSkewedInfoGetArgs> skewedInfo) {
            this.skewedInfo = skewedInfo;
            return this;
        }
        public Builder skewedInfo(@Nullable CatalogTableStorageDescriptorSkewedInfoGetArgs skewedInfo) {
            this.skewedInfo = Output.ofNullable(skewedInfo);
            return this;
        }
        public Builder sortColumns(@Nullable Output<List<CatalogTableStorageDescriptorSortColumnGetArgs>> sortColumns) {
            this.sortColumns = sortColumns;
            return this;
        }
        public Builder sortColumns(@Nullable List<CatalogTableStorageDescriptorSortColumnGetArgs> sortColumns) {
            this.sortColumns = Output.ofNullable(sortColumns);
            return this;
        }
        public Builder sortColumns(CatalogTableStorageDescriptorSortColumnGetArgs... sortColumns) {
            return sortColumns(List.of(sortColumns));
        }
        public Builder storedAsSubDirectories(@Nullable Output<Boolean> storedAsSubDirectories) {
            this.storedAsSubDirectories = storedAsSubDirectories;
            return this;
        }
        public Builder storedAsSubDirectories(@Nullable Boolean storedAsSubDirectories) {
            this.storedAsSubDirectories = Output.ofNullable(storedAsSubDirectories);
            return this;
        }        public CatalogTableStorageDescriptorGetArgs build() {
            return new CatalogTableStorageDescriptorGetArgs(bucketColumns, columns, compressed, inputFormat, location, numberOfBuckets, outputFormat, parameters, schemaReference, serDeInfo, skewedInfo, sortColumns, storedAsSubDirectories);
        }
    }
}
