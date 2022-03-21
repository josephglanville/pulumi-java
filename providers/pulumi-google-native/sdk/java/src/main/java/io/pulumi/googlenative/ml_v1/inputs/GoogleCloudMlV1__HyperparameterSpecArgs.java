// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.ml_v1.enums.GoogleCloudMlV1__HyperparameterSpecAlgorithm;
import io.pulumi.googlenative.ml_v1.enums.GoogleCloudMlV1__HyperparameterSpecGoal;
import io.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__ParameterSpecArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a set of hyperparameters to optimize.
 * 
 */
public final class GoogleCloudMlV1__HyperparameterSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudMlV1__HyperparameterSpecArgs Empty = new GoogleCloudMlV1__HyperparameterSpecArgs();

    /**
     * Optional. The search algorithm specified for the hyperparameter tuning job. Uses the default AI Platform hyperparameter tuning algorithm if unspecified.
     * 
     */
    @Import(name="algorithm")
      private final @Nullable Output<GoogleCloudMlV1__HyperparameterSpecAlgorithm> algorithm;

    public Output<GoogleCloudMlV1__HyperparameterSpecAlgorithm> getAlgorithm() {
        return this.algorithm == null ? Output.empty() : this.algorithm;
    }

    /**
     * Optional. Indicates if the hyperparameter tuning job enables auto trial early stopping.
     * 
     */
    @Import(name="enableTrialEarlyStopping")
      private final @Nullable Output<Boolean> enableTrialEarlyStopping;

    public Output<Boolean> getEnableTrialEarlyStopping() {
        return this.enableTrialEarlyStopping == null ? Output.empty() : this.enableTrialEarlyStopping;
    }

    /**
     * The type of goal to use for tuning. Available types are `MAXIMIZE` and `MINIMIZE`. Defaults to `MAXIMIZE`.
     * 
     */
    @Import(name="goal", required=true)
      private final Output<GoogleCloudMlV1__HyperparameterSpecGoal> goal;

    public Output<GoogleCloudMlV1__HyperparameterSpecGoal> getGoal() {
        return this.goal;
    }

    /**
     * Optional. The TensorFlow summary tag name to use for optimizing trials. For current versions of TensorFlow, this tag name should exactly match what is shown in TensorBoard, including all scopes. For versions of TensorFlow prior to 0.12, this should be only the tag passed to tf.Summary. By default, "training/hptuning/metric" will be used.
     * 
     */
    @Import(name="hyperparameterMetricTag")
      private final @Nullable Output<String> hyperparameterMetricTag;

    public Output<String> getHyperparameterMetricTag() {
        return this.hyperparameterMetricTag == null ? Output.empty() : this.hyperparameterMetricTag;
    }

    /**
     * Optional. The number of failed trials that need to be seen before failing the hyperparameter tuning job. You can specify this field to override the default failing criteria for AI Platform hyperparameter tuning jobs. Defaults to zero, which means the service decides when a hyperparameter job should fail.
     * 
     */
    @Import(name="maxFailedTrials")
      private final @Nullable Output<Integer> maxFailedTrials;

    public Output<Integer> getMaxFailedTrials() {
        return this.maxFailedTrials == null ? Output.empty() : this.maxFailedTrials;
    }

    /**
     * Optional. The number of training trials to run concurrently. You can reduce the time it takes to perform hyperparameter tuning by adding trials in parallel. However, each trail only benefits from the information gained in completed trials. That means that a trial does not get access to the results of trials running at the same time, which could reduce the quality of the overall optimization. Each trial will use the same scale tier and machine types. Defaults to one.
     * 
     */
    @Import(name="maxParallelTrials")
      private final @Nullable Output<Integer> maxParallelTrials;

    public Output<Integer> getMaxParallelTrials() {
        return this.maxParallelTrials == null ? Output.empty() : this.maxParallelTrials;
    }

    /**
     * Optional. How many training trials should be attempted to optimize the specified hyperparameters. Defaults to one.
     * 
     */
    @Import(name="maxTrials")
      private final @Nullable Output<Integer> maxTrials;

    public Output<Integer> getMaxTrials() {
        return this.maxTrials == null ? Output.empty() : this.maxTrials;
    }

    /**
     * The set of parameters to tune.
     * 
     */
    @Import(name="params", required=true)
      private final Output<List<GoogleCloudMlV1__ParameterSpecArgs>> params;

    public Output<List<GoogleCloudMlV1__ParameterSpecArgs>> getParams() {
        return this.params;
    }

    /**
     * Optional. The prior hyperparameter tuning job id that users hope to continue with. The job id will be used to find the corresponding vizier study guid and resume the study.
     * 
     */
    @Import(name="resumePreviousJobId")
      private final @Nullable Output<String> resumePreviousJobId;

    public Output<String> getResumePreviousJobId() {
        return this.resumePreviousJobId == null ? Output.empty() : this.resumePreviousJobId;
    }

    public GoogleCloudMlV1__HyperparameterSpecArgs(
        @Nullable Output<GoogleCloudMlV1__HyperparameterSpecAlgorithm> algorithm,
        @Nullable Output<Boolean> enableTrialEarlyStopping,
        Output<GoogleCloudMlV1__HyperparameterSpecGoal> goal,
        @Nullable Output<String> hyperparameterMetricTag,
        @Nullable Output<Integer> maxFailedTrials,
        @Nullable Output<Integer> maxParallelTrials,
        @Nullable Output<Integer> maxTrials,
        Output<List<GoogleCloudMlV1__ParameterSpecArgs>> params,
        @Nullable Output<String> resumePreviousJobId) {
        this.algorithm = algorithm;
        this.enableTrialEarlyStopping = enableTrialEarlyStopping;
        this.goal = Objects.requireNonNull(goal, "expected parameter 'goal' to be non-null");
        this.hyperparameterMetricTag = hyperparameterMetricTag;
        this.maxFailedTrials = maxFailedTrials;
        this.maxParallelTrials = maxParallelTrials;
        this.maxTrials = maxTrials;
        this.params = Objects.requireNonNull(params, "expected parameter 'params' to be non-null");
        this.resumePreviousJobId = resumePreviousJobId;
    }

    private GoogleCloudMlV1__HyperparameterSpecArgs() {
        this.algorithm = Output.empty();
        this.enableTrialEarlyStopping = Output.empty();
        this.goal = Output.empty();
        this.hyperparameterMetricTag = Output.empty();
        this.maxFailedTrials = Output.empty();
        this.maxParallelTrials = Output.empty();
        this.maxTrials = Output.empty();
        this.params = Output.empty();
        this.resumePreviousJobId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__HyperparameterSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GoogleCloudMlV1__HyperparameterSpecAlgorithm> algorithm;
        private @Nullable Output<Boolean> enableTrialEarlyStopping;
        private Output<GoogleCloudMlV1__HyperparameterSpecGoal> goal;
        private @Nullable Output<String> hyperparameterMetricTag;
        private @Nullable Output<Integer> maxFailedTrials;
        private @Nullable Output<Integer> maxParallelTrials;
        private @Nullable Output<Integer> maxTrials;
        private Output<List<GoogleCloudMlV1__ParameterSpecArgs>> params;
        private @Nullable Output<String> resumePreviousJobId;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__HyperparameterSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.enableTrialEarlyStopping = defaults.enableTrialEarlyStopping;
    	      this.goal = defaults.goal;
    	      this.hyperparameterMetricTag = defaults.hyperparameterMetricTag;
    	      this.maxFailedTrials = defaults.maxFailedTrials;
    	      this.maxParallelTrials = defaults.maxParallelTrials;
    	      this.maxTrials = defaults.maxTrials;
    	      this.params = defaults.params;
    	      this.resumePreviousJobId = defaults.resumePreviousJobId;
        }

        public Builder algorithm(@Nullable Output<GoogleCloudMlV1__HyperparameterSpecAlgorithm> algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public Builder algorithm(@Nullable GoogleCloudMlV1__HyperparameterSpecAlgorithm algorithm) {
            this.algorithm = Output.ofNullable(algorithm);
            return this;
        }
        public Builder enableTrialEarlyStopping(@Nullable Output<Boolean> enableTrialEarlyStopping) {
            this.enableTrialEarlyStopping = enableTrialEarlyStopping;
            return this;
        }
        public Builder enableTrialEarlyStopping(@Nullable Boolean enableTrialEarlyStopping) {
            this.enableTrialEarlyStopping = Output.ofNullable(enableTrialEarlyStopping);
            return this;
        }
        public Builder goal(Output<GoogleCloudMlV1__HyperparameterSpecGoal> goal) {
            this.goal = Objects.requireNonNull(goal);
            return this;
        }
        public Builder goal(GoogleCloudMlV1__HyperparameterSpecGoal goal) {
            this.goal = Output.of(Objects.requireNonNull(goal));
            return this;
        }
        public Builder hyperparameterMetricTag(@Nullable Output<String> hyperparameterMetricTag) {
            this.hyperparameterMetricTag = hyperparameterMetricTag;
            return this;
        }
        public Builder hyperparameterMetricTag(@Nullable String hyperparameterMetricTag) {
            this.hyperparameterMetricTag = Output.ofNullable(hyperparameterMetricTag);
            return this;
        }
        public Builder maxFailedTrials(@Nullable Output<Integer> maxFailedTrials) {
            this.maxFailedTrials = maxFailedTrials;
            return this;
        }
        public Builder maxFailedTrials(@Nullable Integer maxFailedTrials) {
            this.maxFailedTrials = Output.ofNullable(maxFailedTrials);
            return this;
        }
        public Builder maxParallelTrials(@Nullable Output<Integer> maxParallelTrials) {
            this.maxParallelTrials = maxParallelTrials;
            return this;
        }
        public Builder maxParallelTrials(@Nullable Integer maxParallelTrials) {
            this.maxParallelTrials = Output.ofNullable(maxParallelTrials);
            return this;
        }
        public Builder maxTrials(@Nullable Output<Integer> maxTrials) {
            this.maxTrials = maxTrials;
            return this;
        }
        public Builder maxTrials(@Nullable Integer maxTrials) {
            this.maxTrials = Output.ofNullable(maxTrials);
            return this;
        }
        public Builder params(Output<List<GoogleCloudMlV1__ParameterSpecArgs>> params) {
            this.params = Objects.requireNonNull(params);
            return this;
        }
        public Builder params(List<GoogleCloudMlV1__ParameterSpecArgs> params) {
            this.params = Output.of(Objects.requireNonNull(params));
            return this;
        }
        public Builder params(GoogleCloudMlV1__ParameterSpecArgs... params) {
            return params(List.of(params));
        }
        public Builder resumePreviousJobId(@Nullable Output<String> resumePreviousJobId) {
            this.resumePreviousJobId = resumePreviousJobId;
            return this;
        }
        public Builder resumePreviousJobId(@Nullable String resumePreviousJobId) {
            this.resumePreviousJobId = Output.ofNullable(resumePreviousJobId);
            return this;
        }        public GoogleCloudMlV1__HyperparameterSpecArgs build() {
            return new GoogleCloudMlV1__HyperparameterSpecArgs(algorithm, enableTrialEarlyStopping, goal, hyperparameterMetricTag, maxFailedTrials, maxParallelTrials, maxTrials, params, resumePreviousJobId);
        }
    }
}
