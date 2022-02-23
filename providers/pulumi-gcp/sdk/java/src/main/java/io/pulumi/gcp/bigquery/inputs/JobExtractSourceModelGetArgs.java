// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class JobExtractSourceModelGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobExtractSourceModelGetArgs Empty = new JobExtractSourceModelGetArgs();

    /**
     * The ID of the dataset containing this model.
     * 
     */
    @InputImport(name="datasetId", required=true)
      private final Input<String> datasetId;

    public Input<String> getDatasetId() {
        return this.datasetId;
    }

    /**
     * The ID of the model.
     * 
     */
    @InputImport(name="modelId", required=true)
      private final Input<String> modelId;

    public Input<String> getModelId() {
        return this.modelId;
    }

    /**
     * The ID of the project containing this model.
     * 
     */
    @InputImport(name="projectId", required=true)
      private final Input<String> projectId;

    public Input<String> getProjectId() {
        return this.projectId;
    }

    public JobExtractSourceModelGetArgs(
        Input<String> datasetId,
        Input<String> modelId,
        Input<String> projectId) {
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.modelId = Objects.requireNonNull(modelId, "expected parameter 'modelId' to be non-null");
        this.projectId = Objects.requireNonNull(projectId, "expected parameter 'projectId' to be non-null");
    }

    private JobExtractSourceModelGetArgs() {
        this.datasetId = Input.empty();
        this.modelId = Input.empty();
        this.projectId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobExtractSourceModelGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> datasetId;
        private Input<String> modelId;
        private Input<String> projectId;

        public Builder() {
    	      // Empty
        }

        public Builder(JobExtractSourceModelGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.modelId = defaults.modelId;
    	      this.projectId = defaults.projectId;
        }

        public Builder setDatasetId(Input<String> datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }

        public Builder setDatasetId(String datasetId) {
            this.datasetId = Input.of(Objects.requireNonNull(datasetId));
            return this;
        }

        public Builder setModelId(Input<String> modelId) {
            this.modelId = Objects.requireNonNull(modelId);
            return this;
        }

        public Builder setModelId(String modelId) {
            this.modelId = Input.of(Objects.requireNonNull(modelId));
            return this;
        }

        public Builder setProjectId(Input<String> projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }

        public Builder setProjectId(String projectId) {
            this.projectId = Input.of(Objects.requireNonNull(projectId));
            return this;
        }
        public JobExtractSourceModelGetArgs build() {
            return new JobExtractSourceModelGetArgs(datasetId, modelId, projectId);
        }
    }
}
