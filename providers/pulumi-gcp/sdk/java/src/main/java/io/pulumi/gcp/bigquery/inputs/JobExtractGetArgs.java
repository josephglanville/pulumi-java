// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.bigquery.inputs.JobExtractSourceModelGetArgs;
import io.pulumi.gcp.bigquery.inputs.JobExtractSourceTableGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobExtractGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobExtractGetArgs Empty = new JobExtractGetArgs();

    /**
     * The compression type to use for exported files. Possible values include GZIP, DEFLATE, SNAPPY, and NONE.
     * The default value is NONE. DEFLATE and SNAPPY are only supported for Avro.
     * 
     */
    @InputImport(name="compression")
      private final @Nullable Input<String> compression;

    public Input<String> getCompression() {
        return this.compression == null ? Input.empty() : this.compression;
    }

    /**
     * The exported file format. Possible values include CSV, NEWLINE_DELIMITED_JSON and AVRO for tables and SAVED_MODEL for models.
     * The default value for tables is CSV. Tables with nested or repeated fields cannot be exported as CSV.
     * The default value for models is SAVED_MODEL.
     * 
     */
    @InputImport(name="destinationFormat")
      private final @Nullable Input<String> destinationFormat;

    public Input<String> getDestinationFormat() {
        return this.destinationFormat == null ? Input.empty() : this.destinationFormat;
    }

    /**
     * A list of fully-qualified Google Cloud Storage URIs where the extracted table should be written.
     * 
     */
    @InputImport(name="destinationUris", required=true)
      private final Input<List<String>> destinationUris;

    public Input<List<String>> getDestinationUris() {
        return this.destinationUris;
    }

    /**
     * When extracting data in CSV format, this defines the delimiter to use between fields in the exported data.
     * Default is ','
     * 
     */
    @InputImport(name="fieldDelimiter")
      private final @Nullable Input<String> fieldDelimiter;

    public Input<String> getFieldDelimiter() {
        return this.fieldDelimiter == null ? Input.empty() : this.fieldDelimiter;
    }

    /**
     * Whether to print out a header row in the results. Default is true.
     * 
     */
    @InputImport(name="printHeader")
      private final @Nullable Input<Boolean> printHeader;

    public Input<Boolean> getPrintHeader() {
        return this.printHeader == null ? Input.empty() : this.printHeader;
    }

    /**
     * A reference to the model being exported.
     * Structure is documented below.
     * 
     */
    @InputImport(name="sourceModel")
      private final @Nullable Input<JobExtractSourceModelGetArgs> sourceModel;

    public Input<JobExtractSourceModelGetArgs> getSourceModel() {
        return this.sourceModel == null ? Input.empty() : this.sourceModel;
    }

    /**
     * A reference to the table being exported.
     * Structure is documented below.
     * 
     */
    @InputImport(name="sourceTable")
      private final @Nullable Input<JobExtractSourceTableGetArgs> sourceTable;

    public Input<JobExtractSourceTableGetArgs> getSourceTable() {
        return this.sourceTable == null ? Input.empty() : this.sourceTable;
    }

    /**
     * Whether to use logical types when extracting to AVRO format.
     * 
     */
    @InputImport(name="useAvroLogicalTypes")
      private final @Nullable Input<Boolean> useAvroLogicalTypes;

    public Input<Boolean> getUseAvroLogicalTypes() {
        return this.useAvroLogicalTypes == null ? Input.empty() : this.useAvroLogicalTypes;
    }

    public JobExtractGetArgs(
        @Nullable Input<String> compression,
        @Nullable Input<String> destinationFormat,
        Input<List<String>> destinationUris,
        @Nullable Input<String> fieldDelimiter,
        @Nullable Input<Boolean> printHeader,
        @Nullable Input<JobExtractSourceModelGetArgs> sourceModel,
        @Nullable Input<JobExtractSourceTableGetArgs> sourceTable,
        @Nullable Input<Boolean> useAvroLogicalTypes) {
        this.compression = compression;
        this.destinationFormat = destinationFormat;
        this.destinationUris = Objects.requireNonNull(destinationUris, "expected parameter 'destinationUris' to be non-null");
        this.fieldDelimiter = fieldDelimiter;
        this.printHeader = printHeader;
        this.sourceModel = sourceModel;
        this.sourceTable = sourceTable;
        this.useAvroLogicalTypes = useAvroLogicalTypes;
    }

    private JobExtractGetArgs() {
        this.compression = Input.empty();
        this.destinationFormat = Input.empty();
        this.destinationUris = Input.empty();
        this.fieldDelimiter = Input.empty();
        this.printHeader = Input.empty();
        this.sourceModel = Input.empty();
        this.sourceTable = Input.empty();
        this.useAvroLogicalTypes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobExtractGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> compression;
        private @Nullable Input<String> destinationFormat;
        private Input<List<String>> destinationUris;
        private @Nullable Input<String> fieldDelimiter;
        private @Nullable Input<Boolean> printHeader;
        private @Nullable Input<JobExtractSourceModelGetArgs> sourceModel;
        private @Nullable Input<JobExtractSourceTableGetArgs> sourceTable;
        private @Nullable Input<Boolean> useAvroLogicalTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(JobExtractGetArgs defaults) {
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

        public Builder setCompression(@Nullable Input<String> compression) {
            this.compression = compression;
            return this;
        }

        public Builder setCompression(@Nullable String compression) {
            this.compression = Input.ofNullable(compression);
            return this;
        }

        public Builder setDestinationFormat(@Nullable Input<String> destinationFormat) {
            this.destinationFormat = destinationFormat;
            return this;
        }

        public Builder setDestinationFormat(@Nullable String destinationFormat) {
            this.destinationFormat = Input.ofNullable(destinationFormat);
            return this;
        }

        public Builder setDestinationUris(Input<List<String>> destinationUris) {
            this.destinationUris = Objects.requireNonNull(destinationUris);
            return this;
        }

        public Builder setDestinationUris(List<String> destinationUris) {
            this.destinationUris = Input.of(Objects.requireNonNull(destinationUris));
            return this;
        }

        public Builder setFieldDelimiter(@Nullable Input<String> fieldDelimiter) {
            this.fieldDelimiter = fieldDelimiter;
            return this;
        }

        public Builder setFieldDelimiter(@Nullable String fieldDelimiter) {
            this.fieldDelimiter = Input.ofNullable(fieldDelimiter);
            return this;
        }

        public Builder setPrintHeader(@Nullable Input<Boolean> printHeader) {
            this.printHeader = printHeader;
            return this;
        }

        public Builder setPrintHeader(@Nullable Boolean printHeader) {
            this.printHeader = Input.ofNullable(printHeader);
            return this;
        }

        public Builder setSourceModel(@Nullable Input<JobExtractSourceModelGetArgs> sourceModel) {
            this.sourceModel = sourceModel;
            return this;
        }

        public Builder setSourceModel(@Nullable JobExtractSourceModelGetArgs sourceModel) {
            this.sourceModel = Input.ofNullable(sourceModel);
            return this;
        }

        public Builder setSourceTable(@Nullable Input<JobExtractSourceTableGetArgs> sourceTable) {
            this.sourceTable = sourceTable;
            return this;
        }

        public Builder setSourceTable(@Nullable JobExtractSourceTableGetArgs sourceTable) {
            this.sourceTable = Input.ofNullable(sourceTable);
            return this;
        }

        public Builder setUseAvroLogicalTypes(@Nullable Input<Boolean> useAvroLogicalTypes) {
            this.useAvroLogicalTypes = useAvroLogicalTypes;
            return this;
        }

        public Builder setUseAvroLogicalTypes(@Nullable Boolean useAvroLogicalTypes) {
            this.useAvroLogicalTypes = Input.ofNullable(useAvroLogicalTypes);
            return this;
        }
        public JobExtractGetArgs build() {
            return new JobExtractGetArgs(compression, destinationFormat, destinationUris, fieldDelimiter, printHeader, sourceModel, sourceTable, useAvroLogicalTypes);
        }
    }
}
