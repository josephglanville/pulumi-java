// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ModelReferenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final ModelReferenceResponse Empty = new ModelReferenceResponse();

    /**
     * [Required] The ID of the dataset containing this model.
     * 
     */
    @Import(name="datasetId", required=true)
      private final String datasetId;

    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * [Required] The ID of the model. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 1,024 characters.
     * 
     */
    @Import(name="modelId", required=true)
      private final String modelId;

    public String getModelId() {
        return this.modelId;
    }

    /**
     * [Required] The ID of the project containing this model.
     * 
     */
    @Import(name="project", required=true)
      private final String project;

    public String getProject() {
        return this.project;
    }

    public ModelReferenceResponse(
        String datasetId,
        String modelId,
        String project) {
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.modelId = Objects.requireNonNull(modelId, "expected parameter 'modelId' to be non-null");
        this.project = Objects.requireNonNull(project, "expected parameter 'project' to be non-null");
    }

    private ModelReferenceResponse() {
        this.datasetId = null;
        this.modelId = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String datasetId;
        private String modelId;
        private String project;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.modelId = defaults.modelId;
    	      this.project = defaults.project;
        }

        public Builder datasetId(String datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }
        public Builder modelId(String modelId) {
            this.modelId = Objects.requireNonNull(modelId);
            return this;
        }
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }        public ModelReferenceResponse build() {
            return new ModelReferenceResponse(datasetId, modelId, project);
        }
    }
}
