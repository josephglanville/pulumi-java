// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricArgs;
import io.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__BuiltInAlgorithmOutputArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents the result of a single hyperparameter tuning trial from a training job. The TrainingOutput object that is returned on successful completion of a training job with hyperparameter tuning includes a list of HyperparameterOutput objects, one for each successful trial.
 * 
 */
public final class GoogleCloudMlV1__HyperparameterOutputArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudMlV1__HyperparameterOutputArgs Empty = new GoogleCloudMlV1__HyperparameterOutputArgs();

    /**
     * All recorded object metrics for this trial. This field is not currently populated.
     * 
     */
    @Import(name="allMetrics")
      private final @Nullable Output<List<GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricArgs>> allMetrics;

    public Output<List<GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricArgs>> getAllMetrics() {
        return this.allMetrics == null ? Codegen.empty() : this.allMetrics;
    }

    /**
     * Details related to built-in algorithms jobs. Only set for trials of built-in algorithms jobs that have succeeded.
     * 
     */
    @Import(name="builtInAlgorithmOutput")
      private final @Nullable Output<GoogleCloudMlV1__BuiltInAlgorithmOutputArgs> builtInAlgorithmOutput;

    public Output<GoogleCloudMlV1__BuiltInAlgorithmOutputArgs> getBuiltInAlgorithmOutput() {
        return this.builtInAlgorithmOutput == null ? Codegen.empty() : this.builtInAlgorithmOutput;
    }

    /**
     * The final objective metric seen for this trial.
     * 
     */
    @Import(name="finalMetric")
      private final @Nullable Output<GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricArgs> finalMetric;

    public Output<GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricArgs> getFinalMetric() {
        return this.finalMetric == null ? Codegen.empty() : this.finalMetric;
    }

    /**
     * The hyperparameters given to this trial.
     * 
     */
    @Import(name="hyperparameters")
      private final @Nullable Output<Map<String,String>> hyperparameters;

    public Output<Map<String,String>> getHyperparameters() {
        return this.hyperparameters == null ? Codegen.empty() : this.hyperparameters;
    }

    /**
     * True if the trial is stopped early.
     * 
     */
    @Import(name="isTrialStoppedEarly")
      private final @Nullable Output<Boolean> isTrialStoppedEarly;

    public Output<Boolean> getIsTrialStoppedEarly() {
        return this.isTrialStoppedEarly == null ? Codegen.empty() : this.isTrialStoppedEarly;
    }

    /**
     * The trial id for these results.
     * 
     */
    @Import(name="trialId")
      private final @Nullable Output<String> trialId;

    public Output<String> getTrialId() {
        return this.trialId == null ? Codegen.empty() : this.trialId;
    }

    /**
     * URIs for accessing [interactive shells](https://cloud.google.com/ai-platform/training/docs/monitor-debug-interactive-shell) (one URI for each training node). Only available if this trial is part of a hyperparameter tuning job and the job's training_input.enable_web_access is `true`. The keys are names of each node in the training job; for example, `master-replica-0` for the master node, `worker-replica-0` for the first worker, and `ps-replica-0` for the first parameter server. The values are the URIs for each node's interactive shell.
     * 
     */
    @Import(name="webAccessUris")
      private final @Nullable Output<Map<String,String>> webAccessUris;

    public Output<Map<String,String>> getWebAccessUris() {
        return this.webAccessUris == null ? Codegen.empty() : this.webAccessUris;
    }

    public GoogleCloudMlV1__HyperparameterOutputArgs(
        @Nullable Output<List<GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricArgs>> allMetrics,
        @Nullable Output<GoogleCloudMlV1__BuiltInAlgorithmOutputArgs> builtInAlgorithmOutput,
        @Nullable Output<GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricArgs> finalMetric,
        @Nullable Output<Map<String,String>> hyperparameters,
        @Nullable Output<Boolean> isTrialStoppedEarly,
        @Nullable Output<String> trialId,
        @Nullable Output<Map<String,String>> webAccessUris) {
        this.allMetrics = allMetrics;
        this.builtInAlgorithmOutput = builtInAlgorithmOutput;
        this.finalMetric = finalMetric;
        this.hyperparameters = hyperparameters;
        this.isTrialStoppedEarly = isTrialStoppedEarly;
        this.trialId = trialId;
        this.webAccessUris = webAccessUris;
    }

    private GoogleCloudMlV1__HyperparameterOutputArgs() {
        this.allMetrics = Codegen.empty();
        this.builtInAlgorithmOutput = Codegen.empty();
        this.finalMetric = Codegen.empty();
        this.hyperparameters = Codegen.empty();
        this.isTrialStoppedEarly = Codegen.empty();
        this.trialId = Codegen.empty();
        this.webAccessUris = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__HyperparameterOutputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricArgs>> allMetrics;
        private @Nullable Output<GoogleCloudMlV1__BuiltInAlgorithmOutputArgs> builtInAlgorithmOutput;
        private @Nullable Output<GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricArgs> finalMetric;
        private @Nullable Output<Map<String,String>> hyperparameters;
        private @Nullable Output<Boolean> isTrialStoppedEarly;
        private @Nullable Output<String> trialId;
        private @Nullable Output<Map<String,String>> webAccessUris;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__HyperparameterOutputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allMetrics = defaults.allMetrics;
    	      this.builtInAlgorithmOutput = defaults.builtInAlgorithmOutput;
    	      this.finalMetric = defaults.finalMetric;
    	      this.hyperparameters = defaults.hyperparameters;
    	      this.isTrialStoppedEarly = defaults.isTrialStoppedEarly;
    	      this.trialId = defaults.trialId;
    	      this.webAccessUris = defaults.webAccessUris;
        }

        public Builder allMetrics(@Nullable Output<List<GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricArgs>> allMetrics) {
            this.allMetrics = allMetrics;
            return this;
        }
        public Builder allMetrics(@Nullable List<GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricArgs> allMetrics) {
            this.allMetrics = Codegen.ofNullable(allMetrics);
            return this;
        }
        public Builder allMetrics(GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricArgs... allMetrics) {
            return allMetrics(List.of(allMetrics));
        }
        public Builder builtInAlgorithmOutput(@Nullable Output<GoogleCloudMlV1__BuiltInAlgorithmOutputArgs> builtInAlgorithmOutput) {
            this.builtInAlgorithmOutput = builtInAlgorithmOutput;
            return this;
        }
        public Builder builtInAlgorithmOutput(@Nullable GoogleCloudMlV1__BuiltInAlgorithmOutputArgs builtInAlgorithmOutput) {
            this.builtInAlgorithmOutput = Codegen.ofNullable(builtInAlgorithmOutput);
            return this;
        }
        public Builder finalMetric(@Nullable Output<GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricArgs> finalMetric) {
            this.finalMetric = finalMetric;
            return this;
        }
        public Builder finalMetric(@Nullable GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricArgs finalMetric) {
            this.finalMetric = Codegen.ofNullable(finalMetric);
            return this;
        }
        public Builder hyperparameters(@Nullable Output<Map<String,String>> hyperparameters) {
            this.hyperparameters = hyperparameters;
            return this;
        }
        public Builder hyperparameters(@Nullable Map<String,String> hyperparameters) {
            this.hyperparameters = Codegen.ofNullable(hyperparameters);
            return this;
        }
        public Builder isTrialStoppedEarly(@Nullable Output<Boolean> isTrialStoppedEarly) {
            this.isTrialStoppedEarly = isTrialStoppedEarly;
            return this;
        }
        public Builder isTrialStoppedEarly(@Nullable Boolean isTrialStoppedEarly) {
            this.isTrialStoppedEarly = Codegen.ofNullable(isTrialStoppedEarly);
            return this;
        }
        public Builder trialId(@Nullable Output<String> trialId) {
            this.trialId = trialId;
            return this;
        }
        public Builder trialId(@Nullable String trialId) {
            this.trialId = Codegen.ofNullable(trialId);
            return this;
        }
        public Builder webAccessUris(@Nullable Output<Map<String,String>> webAccessUris) {
            this.webAccessUris = webAccessUris;
            return this;
        }
        public Builder webAccessUris(@Nullable Map<String,String> webAccessUris) {
            this.webAccessUris = Codegen.ofNullable(webAccessUris);
            return this;
        }        public GoogleCloudMlV1__HyperparameterOutputArgs build() {
            return new GoogleCloudMlV1__HyperparameterOutputArgs(allMetrics, builtInAlgorithmOutput, finalMetric, hyperparameters, isTrialStoppedEarly, trialId, webAccessUris);
        }
    }
}
