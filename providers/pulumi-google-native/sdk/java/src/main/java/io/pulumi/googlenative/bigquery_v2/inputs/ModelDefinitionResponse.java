// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.bigquery_v2.inputs.BqmlTrainingRunResponse;
import io.pulumi.googlenative.bigquery_v2.inputs.ModelDefinitionModelOptionsResponse;
import java.util.List;
import java.util.Objects;


public final class ModelDefinitionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ModelDefinitionResponse Empty = new ModelDefinitionResponse();

    /**
     * [Output-only, Beta] Model options used for the first training run. These options are immutable for subsequent training runs. Default values are used for any options not specified in the input query.
     * 
     */
    @Import(name="modelOptions", required=true)
      private final ModelDefinitionModelOptionsResponse modelOptions;

    public ModelDefinitionModelOptionsResponse getModelOptions() {
        return this.modelOptions;
    }

    /**
     * [Output-only, Beta] Information about ml training runs, each training run comprises of multiple iterations and there may be multiple training runs for the model if warm start is used or if a user decides to continue a previously cancelled query.
     * 
     */
    @Import(name="trainingRuns", required=true)
      private final List<BqmlTrainingRunResponse> trainingRuns;

    public List<BqmlTrainingRunResponse> getTrainingRuns() {
        return this.trainingRuns;
    }

    public ModelDefinitionResponse(
        ModelDefinitionModelOptionsResponse modelOptions,
        List<BqmlTrainingRunResponse> trainingRuns) {
        this.modelOptions = Objects.requireNonNull(modelOptions, "expected parameter 'modelOptions' to be non-null");
        this.trainingRuns = Objects.requireNonNull(trainingRuns, "expected parameter 'trainingRuns' to be non-null");
    }

    private ModelDefinitionResponse() {
        this.modelOptions = null;
        this.trainingRuns = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelDefinitionModelOptionsResponse modelOptions;
        private List<BqmlTrainingRunResponse> trainingRuns;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.modelOptions = defaults.modelOptions;
    	      this.trainingRuns = defaults.trainingRuns;
        }

        public Builder modelOptions(ModelDefinitionModelOptionsResponse modelOptions) {
            this.modelOptions = Objects.requireNonNull(modelOptions);
            return this;
        }
        public Builder trainingRuns(List<BqmlTrainingRunResponse> trainingRuns) {
            this.trainingRuns = Objects.requireNonNull(trainingRuns);
            return this;
        }
        public Builder trainingRuns(BqmlTrainingRunResponse... trainingRuns) {
            return trainingRuns(List.of(trainingRuns));
        }        public ModelDefinitionResponse build() {
            return new ModelDefinitionResponse(modelOptions, trainingRuns);
        }
    }
}
