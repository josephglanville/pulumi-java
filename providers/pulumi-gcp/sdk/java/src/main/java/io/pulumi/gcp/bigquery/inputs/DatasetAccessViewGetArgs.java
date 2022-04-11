// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class DatasetAccessViewGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetAccessViewGetArgs Empty = new DatasetAccessViewGetArgs();

    /**
     * The ID of the dataset containing this table.
     * 
     */
    @Import(name="datasetId", required=true)
      private final Output<String> datasetId;

    public Output<String> getDatasetId() {
        return this.datasetId;
    }

    /**
     * The ID of the project containing this table.
     * 
     */
    @Import(name="projectId", required=true)
      private final Output<String> projectId;

    public Output<String> getProjectId() {
        return this.projectId;
    }

    /**
     * The ID of the table. The ID must contain only letters (a-z,
     * A-Z), numbers (0-9), or underscores (_). The maximum length
     * is 1,024 characters.
     * 
     */
    @Import(name="tableId", required=true)
      private final Output<String> tableId;

    public Output<String> getTableId() {
        return this.tableId;
    }

    public DatasetAccessViewGetArgs(
        Output<String> datasetId,
        Output<String> projectId,
        Output<String> tableId) {
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.projectId = Objects.requireNonNull(projectId, "expected parameter 'projectId' to be non-null");
        this.tableId = Objects.requireNonNull(tableId, "expected parameter 'tableId' to be non-null");
    }

    private DatasetAccessViewGetArgs() {
        this.datasetId = Codegen.empty();
        this.projectId = Codegen.empty();
        this.tableId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetAccessViewGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> datasetId;
        private Output<String> projectId;
        private Output<String> tableId;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetAccessViewGetArgs defaults) {
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
        public Builder tableId(Output<String> tableId) {
            this.tableId = Objects.requireNonNull(tableId);
            return this;
        }
        public Builder tableId(String tableId) {
            this.tableId = Output.of(Objects.requireNonNull(tableId));
            return this;
        }        public DatasetAccessViewGetArgs build() {
            return new DatasetAccessViewGetArgs(datasetId, projectId, tableId);
        }
    }
}
