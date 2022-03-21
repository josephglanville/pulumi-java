// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobCopySourceTable {
    /**
     * The ID of the dataset containing this model.
     * 
     */
    private final @Nullable String datasetId;
    /**
     * The ID of the project containing this model.
     * 
     */
    private final @Nullable String projectId;
    /**
     * The table. Can be specified `{{table_id}}` if `project_id` and `dataset_id` are also set,
     * or of the form `projects/{{project}}/datasets/{{dataset_id}}/tables/{{table_id}}` if not.
     * 
     */
    private final String tableId;

    @CustomType.Constructor
    private JobCopySourceTable(
        @CustomType.Parameter("datasetId") @Nullable String datasetId,
        @CustomType.Parameter("projectId") @Nullable String projectId,
        @CustomType.Parameter("tableId") String tableId) {
        this.datasetId = datasetId;
        this.projectId = projectId;
        this.tableId = tableId;
    }

    /**
     * The ID of the dataset containing this model.
     * 
    */
    public Optional<String> getDatasetId() {
        return Optional.ofNullable(this.datasetId);
    }
    /**
     * The ID of the project containing this model.
     * 
    */
    public Optional<String> getProjectId() {
        return Optional.ofNullable(this.projectId);
    }
    /**
     * The table. Can be specified `{{table_id}}` if `project_id` and `dataset_id` are also set,
     * or of the form `projects/{{project}}/datasets/{{dataset_id}}/tables/{{table_id}}` if not.
     * 
    */
    public String getTableId() {
        return this.tableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobCopySourceTable defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String datasetId;
        private @Nullable String projectId;
        private String tableId;

        public Builder() {
    	      // Empty
        }

        public Builder(JobCopySourceTable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.projectId = defaults.projectId;
    	      this.tableId = defaults.tableId;
        }

        public Builder datasetId(@Nullable String datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public Builder projectId(@Nullable String projectId) {
            this.projectId = projectId;
            return this;
        }
        public Builder tableId(String tableId) {
            this.tableId = Objects.requireNonNull(tableId);
            return this;
        }        public JobCopySourceTable build() {
            return new JobCopySourceTable(datasetId, projectId, tableId);
        }
    }
}
