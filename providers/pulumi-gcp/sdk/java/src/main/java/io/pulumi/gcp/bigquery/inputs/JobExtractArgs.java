// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.bigquery.inputs.JobExtractSourceModelArgs;
import io.pulumi.gcp.bigquery.inputs.JobExtractSourceTableArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobExtractArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobExtractArgs Empty = new JobExtractArgs();

    /**
     * The compression type to use for exported files. Possible values include GZIP, DEFLATE, SNAPPY, and NONE.
     * The default value is NONE. DEFLATE and SNAPPY are only supported for Avro.
     * 
     */
    @Import(name="compression")
      private final @Nullable Output<String> compression;

    public Output<String> getCompression() {
        return this.compression == null ? Output.empty() : this.compression;
    }

    /**
     * The exported file format. Possible values include CSV, NEWLINE_DELIMITED_JSON and AVRO for tables and SAVED_MODEL for models.
     * The default value for tables is CSV. Tables with nested or repeated fields cannot be exported as CSV.
     * The default value for models is SAVED_MODEL.
     * 
     */
    @Import(name="destinationFormat")
      private final @Nullable Output<String> destinationFormat;

    public Output<String> getDestinationFormat() {
        return this.destinationFormat == null ? Output.empty() : this.destinationFormat;
    }

    /**
     * A list of fully-qualified Google Cloud Storage URIs where the extracted table should be written.
     * 
     */
    @Import(name="destinationUris", required=true)
      private final Output<List<String>> destinationUris;

    public Output<List<String>> getDestinationUris() {
        return this.destinationUris;
    }

    /**
     * When extracting data in CSV format, this defines the delimiter to use between fields in the exported data.
     * Default is ','
     * 
     */
    @Import(name="fieldDelimiter")
      private final @Nullable Output<String> fieldDelimiter;

    public Output<String> getFieldDelimiter() {
        return this.fieldDelimiter == null ? Output.empty() : this.fieldDelimiter;
    }

    /**
     * Whether to print out a header row in the results. Default is true.
     * 
     */
    @Import(name="printHeader")
      private final @Nullable Output<Boolean> printHeader;

    public Output<Boolean> getPrintHeader() {
        return this.printHeader == null ? Output.empty() : this.printHeader;
    }

    /**
     * A reference to the model being exported.
     * Structure is documented below.
     * 
     */
    @Import(name="sourceModel")
      private final @Nullable Output<JobExtractSourceModelArgs> sourceModel;

    public Output<JobExtractSourceModelArgs> getSourceModel() {
        return this.sourceModel == null ? Output.empty() : this.sourceModel;
    }

    /**
     * A reference to the table being exported.
     * Structure is documented below.
     * 
     */
    @Import(name="sourceTable")
      private final @Nullable Output<JobExtractSourceTableArgs> sourceTable;

    public Output<JobExtractSourceTableArgs> getSourceTable() {
        return this.sourceTable == null ? Output.empty() : this.sourceTable;
    }

    /**
     * Whether to use logical types when extracting to AVRO format.
     * 
     */
    @Import(name="useAvroLogicalTypes")
      private final @Nullable Output<Boolean> useAvroLogicalTypes;

    public Output<Boolean> getUseAvroLogicalTypes() {
        return this.useAvroLogicalTypes == null ? Output.empty() : this.useAvroLogicalTypes;
    }

    public JobExtractArgs(
        @Nullable Output<String> compression,
        @Nullable Output<String> destinationFormat,
        Output<List<String>> destinationUris,
        @Nullable Output<String> fieldDelimiter,
        @Nullable Output<Boolean> printHeader,
        @Nullable Output<JobExtractSourceModelArgs> sourceModel,
        @Nullable Output<JobExtractSourceTableArgs> sourceTable,
        @Nullable Output<Boolean> useAvroLogicalTypes) {
        this.compression = compression;
        this.destinationFormat = destinationFormat;
        this.destinationUris = Objects.requireNonNull(destinationUris, "expected parameter 'destinationUris' to be non-null");
        this.fieldDelimiter = fieldDelimiter;
        this.printHeader = printHeader;
        this.sourceModel = sourceModel;
        this.sourceTable = sourceTable;
        this.useAvroLogicalTypes = useAvroLogicalTypes;
    }

    private JobExtractArgs() {
        this.compression = Output.empty();
        this.destinationFormat = Output.empty();
        this.destinationUris = Output.empty();
        this.fieldDelimiter = Output.empty();
        this.printHeader = Output.empty();
        this.sourceModel = Output.empty();
        this.sourceTable = Output.empty();
        this.useAvroLogicalTypes = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobExtractArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> compression;
        private @Nullable Output<String> destinationFormat;
        private Output<List<String>> destinationUris;
        private @Nullable Output<String> fieldDelimiter;
        private @Nullable Output<Boolean> printHeader;
        private @Nullable Output<JobExtractSourceModelArgs> sourceModel;
        private @Nullable Output<JobExtractSourceTableArgs> sourceTable;
        private @Nullable Output<Boolean> useAvroLogicalTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(JobExtractArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compression = defaults.compression;
    	      this.destinationFormat = defaults.destinationFormat;
    	      this.destinationUris = defaults.destinationUris;
    	      this.fieldDelimiter = defaults.fieldDelimiter;
    	      this.printHeader = defaults.printHeader;
    	      this.sourceModel = defaults.sourceModel;
    	      this.sourceTable = defaults.sourceTable;
    	      this.useAvroLogicalTypes = defaults.useAvroLogicalTypes;
        }

        public Builder compression(@Nullable Output<String> compression) {
            this.compression = compression;
            return this;
        }
        public Builder compression(@Nullable String compression) {
            this.compression = Output.ofNullable(compression);
            return this;
        }
        public Builder destinationFormat(@Nullable Output<String> destinationFormat) {
            this.destinationFormat = destinationFormat;
            return this;
        }
        public Builder destinationFormat(@Nullable String destinationFormat) {
            this.destinationFormat = Output.ofNullable(destinationFormat);
            return this;
        }
        public Builder destinationUris(Output<List<String>> destinationUris) {
            this.destinationUris = Objects.requireNonNull(destinationUris);
            return this;
        }
        public Builder destinationUris(List<String> destinationUris) {
            this.destinationUris = Output.of(Objects.requireNonNull(destinationUris));
            return this;
        }
        public Builder destinationUris(String... destinationUris) {
            return destinationUris(List.of(destinationUris));
        }
        public Builder fieldDelimiter(@Nullable Output<String> fieldDelimiter) {
            this.fieldDelimiter = fieldDelimiter;
            return this;
        }
        public Builder fieldDelimiter(@Nullable String fieldDelimiter) {
            this.fieldDelimiter = Output.ofNullable(fieldDelimiter);
            return this;
        }
        public Builder printHeader(@Nullable Output<Boolean> printHeader) {
            this.printHeader = printHeader;
            return this;
        }
        public Builder printHeader(@Nullable Boolean printHeader) {
            this.printHeader = Output.ofNullable(printHeader);
            return this;
        }
        public Builder sourceModel(@Nullable Output<JobExtractSourceModelArgs> sourceModel) {
            this.sourceModel = sourceModel;
            return this;
        }
        public Builder sourceModel(@Nullable JobExtractSourceModelArgs sourceModel) {
            this.sourceModel = Output.ofNullable(sourceModel);
            return this;
        }
        public Builder sourceTable(@Nullable Output<JobExtractSourceTableArgs> sourceTable) {
            this.sourceTable = sourceTable;
            return this;
        }
        public Builder sourceTable(@Nullable JobExtractSourceTableArgs sourceTable) {
            this.sourceTable = Output.ofNullable(sourceTable);
            return this;
        }
        public Builder useAvroLogicalTypes(@Nullable Output<Boolean> useAvroLogicalTypes) {
            this.useAvroLogicalTypes = useAvroLogicalTypes;
            return this;
        }
        public Builder useAvroLogicalTypes(@Nullable Boolean useAvroLogicalTypes) {
            this.useAvroLogicalTypes = Output.ofNullable(useAvroLogicalTypes);
            return this;
        }        public JobExtractArgs build() {
            return new JobExtractArgs(compression, destinationFormat, destinationUris, fieldDelimiter, printHeader, sourceModel, sourceTable, useAvroLogicalTypes);
        }
    }
}
