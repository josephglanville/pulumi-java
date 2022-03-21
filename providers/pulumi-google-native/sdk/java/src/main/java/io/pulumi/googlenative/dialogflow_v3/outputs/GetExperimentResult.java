// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3ExperimentDefinitionResponse;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3ExperimentResultResponse;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3RolloutConfigResponse;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3RolloutStateResponse;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3VariantsHistoryResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetExperimentResult {
    /**
     * Creation time of this experiment.
     * 
     */
    private final String createTime;
    /**
     * The definition of the experiment.
     * 
     */
    private final GoogleCloudDialogflowCxV3ExperimentDefinitionResponse definition;
    /**
     * The human-readable description of the experiment.
     * 
     */
    private final String description;
    /**
     * The human-readable name of the experiment (unique in an environment). Limit of 64 characters.
     * 
     */
    private final String displayName;
    /**
     * End time of this experiment.
     * 
     */
    private final String endTime;
    /**
     * Maximum number of days to run the experiment/rollout. If auto-rollout is not enabled, default value and maximum will be 30 days. If auto-rollout is enabled, default value and maximum will be 6 days.
     * 
     */
    private final String experimentLength;
    /**
     * Last update time of this experiment.
     * 
     */
    private final String lastUpdateTime;
    /**
     * The name of the experiment. Format: projects//locations//agents//environments//experiments/..
     * 
     */
    private final String name;
    /**
     * Inference result of the experiment.
     * 
     */
    private final GoogleCloudDialogflowCxV3ExperimentResultResponse result;
    /**
     * The configuration for auto rollout. If set, there should be exactly two variants in the experiment (control variant being the default version of the flow), the traffic allocation for the non-control variant will gradually increase to 100% when conditions are met, and eventually replace the control variant to become the default version of the flow.
     * 
     */
    private final GoogleCloudDialogflowCxV3RolloutConfigResponse rolloutConfig;
    /**
     * The reason why rollout has failed. Should only be set when state is ROLLOUT_FAILED.
     * 
     */
    private final String rolloutFailureReason;
    /**
     * State of the auto rollout process.
     * 
     */
    private final GoogleCloudDialogflowCxV3RolloutStateResponse rolloutState;
    /**
     * Start time of this experiment.
     * 
     */
    private final String startTime;
    /**
     * The current state of the experiment. Transition triggered by Experiments.StartExperiment: DRAFT->RUNNING. Transition triggered by Experiments.CancelExperiment: DRAFT->DONE or RUNNING->DONE.
     * 
     */
    private final String state;
    /**
     * The history of updates to the experiment variants.
     * 
     */
    private final List<GoogleCloudDialogflowCxV3VariantsHistoryResponse> variantsHistory;

    @CustomType.Constructor
    private GetExperimentResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("definition") GoogleCloudDialogflowCxV3ExperimentDefinitionResponse definition,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("endTime") String endTime,
        @CustomType.Parameter("experimentLength") String experimentLength,
        @CustomType.Parameter("lastUpdateTime") String lastUpdateTime,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("result") GoogleCloudDialogflowCxV3ExperimentResultResponse result,
        @CustomType.Parameter("rolloutConfig") GoogleCloudDialogflowCxV3RolloutConfigResponse rolloutConfig,
        @CustomType.Parameter("rolloutFailureReason") String rolloutFailureReason,
        @CustomType.Parameter("rolloutState") GoogleCloudDialogflowCxV3RolloutStateResponse rolloutState,
        @CustomType.Parameter("startTime") String startTime,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("variantsHistory") List<GoogleCloudDialogflowCxV3VariantsHistoryResponse> variantsHistory) {
        this.createTime = createTime;
        this.definition = definition;
        this.description = description;
        this.displayName = displayName;
        this.endTime = endTime;
        this.experimentLength = experimentLength;
        this.lastUpdateTime = lastUpdateTime;
        this.name = name;
        this.result = result;
        this.rolloutConfig = rolloutConfig;
        this.rolloutFailureReason = rolloutFailureReason;
        this.rolloutState = rolloutState;
        this.startTime = startTime;
        this.state = state;
        this.variantsHistory = variantsHistory;
    }

    /**
     * Creation time of this experiment.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * The definition of the experiment.
     * 
    */
    public GoogleCloudDialogflowCxV3ExperimentDefinitionResponse getDefinition() {
        return this.definition;
    }
    /**
     * The human-readable description of the experiment.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The human-readable name of the experiment (unique in an environment). Limit of 64 characters.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * End time of this experiment.
     * 
    */
    public String getEndTime() {
        return this.endTime;
    }
    /**
     * Maximum number of days to run the experiment/rollout. If auto-rollout is not enabled, default value and maximum will be 30 days. If auto-rollout is enabled, default value and maximum will be 6 days.
     * 
    */
    public String getExperimentLength() {
        return this.experimentLength;
    }
    /**
     * Last update time of this experiment.
     * 
    */
    public String getLastUpdateTime() {
        return this.lastUpdateTime;
    }
    /**
     * The name of the experiment. Format: projects//locations//agents//environments//experiments/..
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Inference result of the experiment.
     * 
    */
    public GoogleCloudDialogflowCxV3ExperimentResultResponse getResult() {
        return this.result;
    }
    /**
     * The configuration for auto rollout. If set, there should be exactly two variants in the experiment (control variant being the default version of the flow), the traffic allocation for the non-control variant will gradually increase to 100% when conditions are met, and eventually replace the control variant to become the default version of the flow.
     * 
    */
    public GoogleCloudDialogflowCxV3RolloutConfigResponse getRolloutConfig() {
        return this.rolloutConfig;
    }
    /**
     * The reason why rollout has failed. Should only be set when state is ROLLOUT_FAILED.
     * 
    */
    public String getRolloutFailureReason() {
        return this.rolloutFailureReason;
    }
    /**
     * State of the auto rollout process.
     * 
    */
    public GoogleCloudDialogflowCxV3RolloutStateResponse getRolloutState() {
        return this.rolloutState;
    }
    /**
     * Start time of this experiment.
     * 
    */
    public String getStartTime() {
        return this.startTime;
    }
    /**
     * The current state of the experiment. Transition triggered by Experiments.StartExperiment: DRAFT->RUNNING. Transition triggered by Experiments.CancelExperiment: DRAFT->DONE or RUNNING->DONE.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * The history of updates to the experiment variants.
     * 
    */
    public List<GoogleCloudDialogflowCxV3VariantsHistoryResponse> getVariantsHistory() {
        return this.variantsHistory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExperimentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private GoogleCloudDialogflowCxV3ExperimentDefinitionResponse definition;
        private String description;
        private String displayName;
        private String endTime;
        private String experimentLength;
        private String lastUpdateTime;
        private String name;
        private GoogleCloudDialogflowCxV3ExperimentResultResponse result;
        private GoogleCloudDialogflowCxV3RolloutConfigResponse rolloutConfig;
        private String rolloutFailureReason;
        private GoogleCloudDialogflowCxV3RolloutStateResponse rolloutState;
        private String startTime;
        private String state;
        private List<GoogleCloudDialogflowCxV3VariantsHistoryResponse> variantsHistory;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExperimentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.definition = defaults.definition;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.endTime = defaults.endTime;
    	      this.experimentLength = defaults.experimentLength;
    	      this.lastUpdateTime = defaults.lastUpdateTime;
    	      this.name = defaults.name;
    	      this.result = defaults.result;
    	      this.rolloutConfig = defaults.rolloutConfig;
    	      this.rolloutFailureReason = defaults.rolloutFailureReason;
    	      this.rolloutState = defaults.rolloutState;
    	      this.startTime = defaults.startTime;
    	      this.state = defaults.state;
    	      this.variantsHistory = defaults.variantsHistory;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder definition(GoogleCloudDialogflowCxV3ExperimentDefinitionResponse definition) {
            this.definition = Objects.requireNonNull(definition);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        public Builder experimentLength(String experimentLength) {
            this.experimentLength = Objects.requireNonNull(experimentLength);
            return this;
        }
        public Builder lastUpdateTime(String lastUpdateTime) {
            this.lastUpdateTime = Objects.requireNonNull(lastUpdateTime);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder result(GoogleCloudDialogflowCxV3ExperimentResultResponse result) {
            this.result = Objects.requireNonNull(result);
            return this;
        }
        public Builder rolloutConfig(GoogleCloudDialogflowCxV3RolloutConfigResponse rolloutConfig) {
            this.rolloutConfig = Objects.requireNonNull(rolloutConfig);
            return this;
        }
        public Builder rolloutFailureReason(String rolloutFailureReason) {
            this.rolloutFailureReason = Objects.requireNonNull(rolloutFailureReason);
            return this;
        }
        public Builder rolloutState(GoogleCloudDialogflowCxV3RolloutStateResponse rolloutState) {
            this.rolloutState = Objects.requireNonNull(rolloutState);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder variantsHistory(List<GoogleCloudDialogflowCxV3VariantsHistoryResponse> variantsHistory) {
            this.variantsHistory = Objects.requireNonNull(variantsHistory);
            return this;
        }
        public Builder variantsHistory(GoogleCloudDialogflowCxV3VariantsHistoryResponse... variantsHistory) {
            return variantsHistory(List.of(variantsHistory));
        }        public GetExperimentResult build() {
            return new GetExperimentResult(createTime, definition, description, displayName, endTime, experimentLength, lastUpdateTime, name, result, rolloutConfig, rolloutFailureReason, rolloutState, startTime, state, variantsHistory);
        }
    }
}
