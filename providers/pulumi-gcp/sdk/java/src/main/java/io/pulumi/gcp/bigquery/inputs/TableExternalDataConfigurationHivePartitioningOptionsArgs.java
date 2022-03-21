// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableExternalDataConfigurationHivePartitioningOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableExternalDataConfigurationHivePartitioningOptionsArgs Empty = new TableExternalDataConfigurationHivePartitioningOptionsArgs();

    /**
     * When set, what mode of hive partitioning to use when
     * reading data. The following modes are supported.
     * * AUTO: automatically infer partition key name(s) and type(s).
     * * STRINGS: automatically infer partition key name(s). All types are
     *   Not all storage formats support hive partitioning. Requesting hive
     *   partitioning on an unsupported format will lead to an error.
     *   Currently supported formats are: JSON, CSV, ORC, Avro and Parquet.
     * * CUSTOM: when set to `CUSTOM`, you must encode the partition key schema within the `source_uri_prefix` by setting `source_uri_prefix` to `gs://bucket/path_to_table/{key1:TYPE1}/{key2:TYPE2}/{key3:TYPE3}`.
     * 
     */
    @Import(name="mode")
      private final @Nullable Output<String> mode;

    public Output<String> getMode() {
        return this.mode == null ? Output.empty() : this.mode;
    }

    /**
     * If set to true, queries over this table
     * require a partition filter that can be used for partition elimination to be
     * specified.
     * 
     */
    @Import(name="requirePartitionFilter")
      private final @Nullable Output<Boolean> requirePartitionFilter;

    public Output<Boolean> getRequirePartitionFilter() {
        return this.requirePartitionFilter == null ? Output.empty() : this.requirePartitionFilter;
    }

    /**
     * When hive partition detection is requested,
     * a common for all source uris must be required. The prefix must end immediately
     * before the partition key encoding begins. For example, consider files following
     * this data layout. `gs://bucket/path_to_table/dt=2019-06-01/country=USA/id=7/file.avro`
     * `gs://bucket/path_to_table/dt=2019-05-31/country=CA/id=3/file.avro` When hive
     * partitioning is requested with either AUTO or STRINGS detection, the common prefix
     * can be either of `gs://bucket/path_to_table` or `gs://bucket/path_to_table/`.
     * Note that when `mode` is set to `CUSTOM`, you must encode the partition key schema within the `source_uri_prefix` by setting `source_uri_prefix` to `gs://bucket/path_to_table/{key1:TYPE1}/{key2:TYPE2}/{key3:TYPE3}`.
     * 
     */
    @Import(name="sourceUriPrefix")
      private final @Nullable Output<String> sourceUriPrefix;

    public Output<String> getSourceUriPrefix() {
        return this.sourceUriPrefix == null ? Output.empty() : this.sourceUriPrefix;
    }

    public TableExternalDataConfigurationHivePartitioningOptionsArgs(
        @Nullable Output<String> mode,
        @Nullable Output<Boolean> requirePartitionFilter,
        @Nullable Output<String> sourceUriPrefix) {
        this.mode = mode;
        this.requirePartitionFilter = requirePartitionFilter;
        this.sourceUriPrefix = sourceUriPrefix;
    }

    private TableExternalDataConfigurationHivePartitioningOptionsArgs() {
        this.mode = Output.empty();
        this.requirePartitionFilter = Output.empty();
        this.sourceUriPrefix = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableExternalDataConfigurationHivePartitioningOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> mode;
        private @Nullable Output<Boolean> requirePartitionFilter;
        private @Nullable Output<String> sourceUriPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(TableExternalDataConfigurationHivePartitioningOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.requirePartitionFilter = defaults.requirePartitionFilter;
    	      this.sourceUriPrefix = defaults.sourceUriPrefix;
        }

        public Builder mode(@Nullable Output<String> mode) {
            this.mode = mode;
            return this;
        }
        public Builder mode(@Nullable String mode) {
            this.mode = Output.ofNullable(mode);
            return this;
        }
        public Builder requirePartitionFilter(@Nullable Output<Boolean> requirePartitionFilter) {
            this.requirePartitionFilter = requirePartitionFilter;
            return this;
        }
        public Builder requirePartitionFilter(@Nullable Boolean requirePartitionFilter) {
            this.requirePartitionFilter = Output.ofNullable(requirePartitionFilter);
            return this;
        }
        public Builder sourceUriPrefix(@Nullable Output<String> sourceUriPrefix) {
            this.sourceUriPrefix = sourceUriPrefix;
            return this;
        }
        public Builder sourceUriPrefix(@Nullable String sourceUriPrefix) {
            this.sourceUriPrefix = Output.ofNullable(sourceUriPrefix);
            return this;
        }        public TableExternalDataConfigurationHivePartitioningOptionsArgs build() {
            return new TableExternalDataConfigurationHivePartitioningOptionsArgs(mode, requirePartitionFilter, sourceUriPrefix);
        }
    }
}
