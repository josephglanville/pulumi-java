// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigTableGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigTableGetArgs Empty = new PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigTableGetArgs();

    /**
     * Dataset ID of the table.
     * 
     */
    @Import(name="datasetId", required=true)
      private final Output<String> datasetId;

    public Output<String> getDatasetId() {
        return this.datasetId;
    }

    /**
     * The Google Cloud Platform project ID of the project containing the table.
     * 
     */
    @Import(name="projectId", required=true)
      private final Output<String> projectId;

    public Output<String> getProjectId() {
        return this.projectId;
    }

    /**
     * Name of the table. If is not set a new one will be generated for you with the following format:
     * `dlp_googleapis_yyyy_mm_dd_[dlp_job_id]`. Pacific timezone will be used for generating the date details.
     * 
     */
    @Import(name="tableId")
      private final @Nullable Output<String> tableId;

    public Output<String> getTableId() {
        return this.tableId == null ? Output.empty() : this.tableId;
    }

    public PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigTableGetArgs(
        Output<String> datasetId,
        Output<String> projectId,
        @Nullable Output<String> tableId) {
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.projectId = Objects.requireNonNull(projectId, "expected parameter 'projectId' to be non-null");
        this.tableId = tableId;
    }

    private PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigTableGetArgs() {
        this.datasetId = Output.empty();
        this.projectId = Output.empty();
        this.tableId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigTableGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> datasetId;
        private Output<String> projectId;
        private @Nullable Output<String> tableId;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigTableGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.projectId = defaults.projectId;
    	      this.tableId = defaults.tableId;
        }

        public Builder datasetId(Output<String> datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }
        public Builder datasetId(String datasetId) {
            this.datasetId = Output.of(Objects.requireNonNull(datasetId));
            return this;
        }
        public Builder projectId(Output<String> projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        public Builder projectId(String projectId) {
            this.projectId = Output.of(Objects.requireNonNull(projectId));
            return this;
        }
        public Builder tableId(@Nullable Output<String> tableId) {
            this.tableId = tableId;
            return this;
        }
        public Builder tableId(@Nullable String tableId) {
            this.tableId = Output.ofNullable(tableId);
            return this;
        }        public PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigTableGetArgs build() {
            return new PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigTableGetArgs(datasetId, projectId, tableId);
        }
    }
}
