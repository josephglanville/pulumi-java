// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.bigquery.inputs.TableEncryptionConfigurationArgs;
import io.pulumi.gcp.bigquery.inputs.TableExternalDataConfigurationArgs;
import io.pulumi.gcp.bigquery.inputs.TableMaterializedViewArgs;
import io.pulumi.gcp.bigquery.inputs.TableRangePartitioningArgs;
import io.pulumi.gcp.bigquery.inputs.TableTimePartitioningArgs;
import io.pulumi.gcp.bigquery.inputs.TableViewArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableArgs Empty = new TableArgs();

    /**
     * Specifies column names to use for data clustering.
     * Up to four top-level columns are allowed, and should be specified in
     * descending priority order.
     * 
     */
    @Import(name="clusterings")
      private final @Nullable Output<List<String>> clusterings;

    public Output<List<String>> getClusterings() {
        return this.clusterings == null ? Output.empty() : this.clusterings;
    }

    /**
     * The dataset ID to create the table in.
     * Changing this forces a new resource to be created.
     * 
     */
    @Import(name="datasetId", required=true)
      private final Output<String> datasetId;

    public Output<String> getDatasetId() {
        return this.datasetId;
    }

    /**
     * Whether or not to allow the provider to destroy the instance. Unless this field is set to false
     * in state, a `=destroy` or `=update` that would delete the instance will fail.
     * 
     */
    @Import(name="deletionProtection")
      private final @Nullable Output<Boolean> deletionProtection;

    public Output<Boolean> getDeletionProtection() {
        return this.deletionProtection == null ? Output.empty() : this.deletionProtection;
    }

    /**
     * The field description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Specifies how the table should be encrypted.
     * If left blank, the table will be encrypted with a Google-managed key; that process
     * is transparent to the user.  Structure is documented below.
     * 
     */
    @Import(name="encryptionConfiguration")
      private final @Nullable Output<TableEncryptionConfigurationArgs> encryptionConfiguration;

    public Output<TableEncryptionConfigurationArgs> getEncryptionConfiguration() {
        return this.encryptionConfiguration == null ? Output.empty() : this.encryptionConfiguration;
    }

    /**
     * The time when this table expires, in
     * milliseconds since the epoch. If not present, the table will persist
     * indefinitely. Expired tables will be deleted and their storage
     * reclaimed.
     * 
     */
    @Import(name="expirationTime")
      private final @Nullable Output<Integer> expirationTime;

    public Output<Integer> getExpirationTime() {
        return this.expirationTime == null ? Output.empty() : this.expirationTime;
    }

    /**
     * Describes the data format,
     * location, and other properties of a table stored outside of BigQuery.
     * By defining these properties, the data source can then be queried as
     * if it were a standard BigQuery table. Structure is documented below.
     * 
     */
    @Import(name="externalDataConfiguration")
      private final @Nullable Output<TableExternalDataConfigurationArgs> externalDataConfiguration;

    public Output<TableExternalDataConfigurationArgs> getExternalDataConfiguration() {
        return this.externalDataConfiguration == null ? Output.empty() : this.externalDataConfiguration;
    }

    /**
     * A descriptive name for the table.
     * 
     */
    @Import(name="friendlyName")
      private final @Nullable Output<String> friendlyName;

    public Output<String> getFriendlyName() {
        return this.friendlyName == null ? Output.empty() : this.friendlyName;
    }

    /**
     * A mapping of labels to assign to the resource.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * If specified, configures this table as a materialized view.
     * Structure is documented below.
     * 
     */
    @Import(name="materializedView")
      private final @Nullable Output<TableMaterializedViewArgs> materializedView;

    public Output<TableMaterializedViewArgs> getMaterializedView() {
        return this.materializedView == null ? Output.empty() : this.materializedView;
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * If specified, configures range-based
     * partitioning for this table. Structure is documented below.
     * 
     */
    @Import(name="rangePartitioning")
      private final @Nullable Output<TableRangePartitioningArgs> rangePartitioning;

    public Output<TableRangePartitioningArgs> getRangePartitioning() {
        return this.rangePartitioning == null ? Output.empty() : this.rangePartitioning;
    }

    /**
     * A JSON schema for the external table. Schema is required
     * for CSV and JSON formats if autodetect is not on. Schema is disallowed
     * for Google Cloud Bigtable, Cloud Datastore backups, Avro, ORC and Parquet formats.
     * ~>**NOTE:** Because this field expects a JSON string, any changes to the
     * string will create a diff, even if the JSON itself hasn't changed.
     * Furthermore drift for this field cannot not be detected because BigQuery
     * only uses this schema to compute the effective schema for the table, therefore
     * any changes on the configured value will force the table to be recreated.
     * This schema is effectively only applied when creating a table from an external
     * datasource, after creation the computed schema will be stored in
     * `google_bigquery_table.schema`
     * 
     */
    @Import(name="schema")
      private final @Nullable Output<String> schema;

    public Output<String> getSchema() {
        return this.schema == null ? Output.empty() : this.schema;
    }

    /**
     * A unique ID for the resource.
     * Changing this forces a new resource to be created.
     * 
     */
    @Import(name="tableId", required=true)
      private final Output<String> tableId;

    public Output<String> getTableId() {
        return this.tableId;
    }

    /**
     * If specified, configures time-based
     * partitioning for this table. Structure is documented below.
     * 
     */
    @Import(name="timePartitioning")
      private final @Nullable Output<TableTimePartitioningArgs> timePartitioning;

    public Output<TableTimePartitioningArgs> getTimePartitioning() {
        return this.timePartitioning == null ? Output.empty() : this.timePartitioning;
    }

    /**
     * If specified, configures this table as a view.
     * Structure is documented below.
     * 
     */
    @Import(name="view")
      private final @Nullable Output<TableViewArgs> view;

    public Output<TableViewArgs> getView() {
        return this.view == null ? Output.empty() : this.view;
    }

    public TableArgs(
        @Nullable Output<List<String>> clusterings,
        Output<String> datasetId,
        @Nullable Output<Boolean> deletionProtection,
        @Nullable Output<String> description,
        @Nullable Output<TableEncryptionConfigurationArgs> encryptionConfiguration,
        @Nullable Output<Integer> expirationTime,
        @Nullable Output<TableExternalDataConfigurationArgs> externalDataConfiguration,
        @Nullable Output<String> friendlyName,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<TableMaterializedViewArgs> materializedView,
        @Nullable Output<String> project,
        @Nullable Output<TableRangePartitioningArgs> rangePartitioning,
        @Nullable Output<String> schema,
        Output<String> tableId,
        @Nullable Output<TableTimePartitioningArgs> timePartitioning,
        @Nullable Output<TableViewArgs> view) {
        this.clusterings = clusterings;
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.deletionProtection = deletionProtection;
        this.description = description;
        this.encryptionConfiguration = encryptionConfiguration;
        this.expirationTime = expirationTime;
        this.externalDataConfiguration = externalDataConfiguration;
        this.friendlyName = friendlyName;
        this.labels = labels;
        this.materializedView = materializedView;
        this.project = project;
        this.rangePartitioning = rangePartitioning;
        this.schema = schema;
        this.tableId = Objects.requireNonNull(tableId, "expected parameter 'tableId' to be non-null");
        this.timePartitioning = timePartitioning;
        this.view = view;
    }

    private TableArgs() {
        this.clusterings = Output.empty();
        this.datasetId = Output.empty();
        this.deletionProtection = Output.empty();
        this.description = Output.empty();
        this.encryptionConfiguration = Output.empty();
        this.expirationTime = Output.empty();
        this.externalDataConfiguration = Output.empty();
        this.friendlyName = Output.empty();
        this.labels = Output.empty();
        this.materializedView = Output.empty();
        this.project = Output.empty();
        this.rangePartitioning = Output.empty();
        this.schema = Output.empty();
        this.tableId = Output.empty();
        this.timePartitioning = Output.empty();
        this.view = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> clusterings;
        private Output<String> datasetId;
        private @Nullable Output<Boolean> deletionProtection;
        private @Nullable Output<String> description;
        private @Nullable Output<TableEncryptionConfigurationArgs> encryptionConfiguration;
        private @Nullable Output<Integer> expirationTime;
        private @Nullable Output<TableExternalDataConfigurationArgs> externalDataConfiguration;
        private @Nullable Output<String> friendlyName;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<TableMaterializedViewArgs> materializedView;
        private @Nullable Output<String> project;
        private @Nullable Output<TableRangePartitioningArgs> rangePartitioning;
        private @Nullable Output<String> schema;
        private Output<String> tableId;
        private @Nullable Output<TableTimePartitioningArgs> timePartitioning;
        private @Nullable Output<TableViewArgs> view;

        public Builder() {
    	      // Empty
        }

        public Builder(TableArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterings = defaults.clusterings;
    	      this.datasetId = defaults.datasetId;
    	      this.deletionProtection = defaults.deletionProtection;
    	      this.description = defaults.description;
    	      this.encryptionConfiguration = defaults.encryptionConfiguration;
    	      this.expirationTime = defaults.expirationTime;
    	      this.externalDataConfiguration = defaults.externalDataConfiguration;
    	      this.friendlyName = defaults.friendlyName;
    	      this.labels = defaults.labels;
    	      this.materializedView = defaults.materializedView;
    	      this.project = defaults.project;
    	      this.rangePartitioning = defaults.rangePartitioning;
    	      this.schema = defaults.schema;
    	      this.tableId = defaults.tableId;
    	      this.timePartitioning = defaults.timePartitioning;
    	      this.view = defaults.view;
        }

        public Builder clusterings(@Nullable Output<List<String>> clusterings) {
            this.clusterings = clusterings;
            return this;
        }
        public Builder clusterings(@Nullable List<String> clusterings) {
            this.clusterings = Output.ofNullable(clusterings);
            return this;
        }
        public Builder clusterings(String... clusterings) {
            return clusterings(List.of(clusterings));
        }
        public Builder datasetId(Output<String> datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }
        public Builder datasetId(String datasetId) {
            this.datasetId = Output.of(Objects.requireNonNull(datasetId));
            return this;
        }
        public Builder deletionProtection(@Nullable Output<Boolean> deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Builder deletionProtection(@Nullable Boolean deletionProtection) {
            this.deletionProtection = Output.ofNullable(deletionProtection);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder encryptionConfiguration(@Nullable Output<TableEncryptionConfigurationArgs> encryptionConfiguration) {
            this.encryptionConfiguration = encryptionConfiguration;
            return this;
        }
        public Builder encryptionConfiguration(@Nullable TableEncryptionConfigurationArgs encryptionConfiguration) {
            this.encryptionConfiguration = Output.ofNullable(encryptionConfiguration);
            return this;
        }
        public Builder expirationTime(@Nullable Output<Integer> expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public Builder expirationTime(@Nullable Integer expirationTime) {
            this.expirationTime = Output.ofNullable(expirationTime);
            return this;
        }
        public Builder externalDataConfiguration(@Nullable Output<TableExternalDataConfigurationArgs> externalDataConfiguration) {
            this.externalDataConfiguration = externalDataConfiguration;
            return this;
        }
        public Builder externalDataConfiguration(@Nullable TableExternalDataConfigurationArgs externalDataConfiguration) {
            this.externalDataConfiguration = Output.ofNullable(externalDataConfiguration);
            return this;
        }
        public Builder friendlyName(@Nullable Output<String> friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }
        public Builder friendlyName(@Nullable String friendlyName) {
            this.friendlyName = Output.ofNullable(friendlyName);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }
        public Builder materializedView(@Nullable Output<TableMaterializedViewArgs> materializedView) {
            this.materializedView = materializedView;
            return this;
        }
        public Builder materializedView(@Nullable TableMaterializedViewArgs materializedView) {
            this.materializedView = Output.ofNullable(materializedView);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder rangePartitioning(@Nullable Output<TableRangePartitioningArgs> rangePartitioning) {
            this.rangePartitioning = rangePartitioning;
            return this;
        }
        public Builder rangePartitioning(@Nullable TableRangePartitioningArgs rangePartitioning) {
            this.rangePartitioning = Output.ofNullable(rangePartitioning);
            return this;
        }
        public Builder schema(@Nullable Output<String> schema) {
            this.schema = schema;
            return this;
        }
        public Builder schema(@Nullable String schema) {
            this.schema = Output.ofNullable(schema);
            return this;
        }
        public Builder tableId(Output<String> tableId) {
            this.tableId = Objects.requireNonNull(tableId);
            return this;
        }
        public Builder tableId(String tableId) {
            this.tableId = Output.of(Objects.requireNonNull(tableId));
            return this;
        }
        public Builder timePartitioning(@Nullable Output<TableTimePartitioningArgs> timePartitioning) {
            this.timePartitioning = timePartitioning;
            return this;
        }
        public Builder timePartitioning(@Nullable TableTimePartitioningArgs timePartitioning) {
            this.timePartitioning = Output.ofNullable(timePartitioning);
            return this;
        }
        public Builder view(@Nullable Output<TableViewArgs> view) {
            this.view = view;
            return this;
        }
        public Builder view(@Nullable TableViewArgs view) {
            this.view = Output.ofNullable(view);
            return this;
        }        public TableArgs build() {
            return new TableArgs(clusterings, datasetId, deletionProtection, description, encryptionConfiguration, expirationTime, externalDataConfiguration, friendlyName, labels, materializedView, project, rangePartitioning, schema, tableId, timePartitioning, view);
        }
    }
}
