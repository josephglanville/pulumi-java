// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.bigquery_v2.outputs.BqmlIterationResultResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.BqmlTrainingRunTrainingOptionsResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class BqmlTrainingRunResponse {
    /**
     * [Output-only, Beta] List of each iteration results.
     * 
     */
    private final List<BqmlIterationResultResponse> iterationResults;
    /**
     * [Output-only, Beta] Training run start time in milliseconds since the epoch.
     * 
     */
    private final String startTime;
    /**
     * [Output-only, Beta] Different state applicable for a training run. IN PROGRESS: Training run is in progress. FAILED: Training run ended due to a non-retryable failure. SUCCEEDED: Training run successfully completed. CANCELLED: Training run cancelled by the user.
     * 
     */
    private final String state;
    /**
     * [Output-only, Beta] Training options used by this training run. These options are mutable for subsequent training runs. Default values are explicitly stored for options not specified in the input query of the first training run. For subsequent training runs, any option not explicitly specified in the input query will be copied from the previous training run.
     * 
     */
    private final BqmlTrainingRunTrainingOptionsResponse trainingOptions;

    @CustomType.Constructor
    private BqmlTrainingRunResponse(
        @CustomType.Parameter("iterationResults") List<BqmlIterationResultResponse> iterationResults,
        @CustomType.Parameter("startTime") String startTime,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("trainingOptions") BqmlTrainingRunTrainingOptionsResponse trainingOptions) {
        this.iterationResults = iterationResults;
        this.startTime = startTime;
        this.state = state;
        this.trainingOptions = trainingOptions;
    }

    /**
     * [Output-only, Beta] List of each iteration results.
     * 
    */
    public List<BqmlIterationResultResponse> getIterationResults() {
        return this.iterationResults;
    }
    /**
     * [Output-only, Beta] Training run start time in milliseconds since the epoch.
     * 
    */
    public String getStartTime() {
        return this.startTime;
    }
    /**
     * [Output-only, Beta] Different state applicable for a training run. IN PROGRESS: Training run is in progress. FAILED: Training run ended due to a non-retryable failure. SUCCEEDED: Training run successfully completed. CANCELLED: Training run cancelled by the user.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * [Output-only, Beta] Training options used by this training run. These options are mutable for subsequent training runs. Default values are explicitly stored for options not specified in the input query of the first training run. For subsequent training runs, any option not explicitly specified in the input query will be copied from the previous training run.
     * 
    */
    public BqmlTrainingRunTrainingOptionsResponse getTrainingOptions() {
        return this.trainingOptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BqmlTrainingRunResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<BqmlIterationResultResponse> iterationResults;
        private String startTime;
        private String state;
        private BqmlTrainingRunTrainingOptionsResponse trainingOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(BqmlTrainingRunResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iterationResults = defaults.iterationResults;
    	      this.startTime = defaults.startTime;
    	      this.state = defaults.state;
    	      this.trainingOptions = defaults.trainingOptions;
        }

        public Builder iterationResults(List<BqmlIterationResultResponse> iterationResults) {
            this.iterationResults = Objects.requireNonNull(iterationResults);
            return this;
        }
        public Builder iterationResults(BqmlIterationResultResponse... iterationResults) {
            return iterationResults(List.of(iterationResults));
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder trainingOptions(BqmlTrainingRunTrainingOptionsResponse trainingOptions) {
            this.trainingOptions = Objects.requireNonNull(trainingOptions);
            return this;
        }        public BqmlTrainingRunResponse build() {
            return new BqmlTrainingRunResponse(iterationResults, startTime, state, trainingOptions);
        }
    }
}
