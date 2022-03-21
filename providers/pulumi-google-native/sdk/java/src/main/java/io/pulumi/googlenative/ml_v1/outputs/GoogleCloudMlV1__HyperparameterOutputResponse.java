// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse;
import io.pulumi.googlenative.ml_v1.outputs.GoogleCloudMlV1__BuiltInAlgorithmOutputResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GoogleCloudMlV1__HyperparameterOutputResponse {
    /**
     * All recorded object metrics for this trial. This field is not currently populated.
     * 
     */
    private final List<GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse> allMetrics;
    /**
     * Details related to built-in algorithms jobs. Only set for trials of built-in algorithms jobs that have succeeded.
     * 
     */
    private final GoogleCloudMlV1__BuiltInAlgorithmOutputResponse builtInAlgorithmOutput;
    /**
     * End time for the trial.
     * 
     */
    private final String endTime;
    /**
     * The final objective metric seen for this trial.
     * 
     */
    private final GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse finalMetric;
    /**
     * The hyperparameters given to this trial.
     * 
     */
    private final Map<String,String> hyperparameters;
    /**
     * True if the trial is stopped early.
     * 
     */
    private final Boolean isTrialStoppedEarly;
    /**
     * Start time for the trial.
     * 
     */
    private final String startTime;
    /**
     * The detailed state of the trial.
     * 
     */
    private final String state;
    /**
     * The trial id for these results.
     * 
     */
    private final String trialId;
    /**
     * URIs for accessing [interactive shells](https://cloud.google.com/ai-platform/training/docs/monitor-debug-interactive-shell) (one URI for each training node). Only available if this trial is part of a hyperparameter tuning job and the job's training_input.enable_web_access is `true`. The keys are names of each node in the training job; for example, `master-replica-0` for the master node, `worker-replica-0` for the first worker, and `ps-replica-0` for the first parameter server. The values are the URIs for each node's interactive shell.
     * 
     */
    private final Map<String,String> webAccessUris;

    @CustomType.Constructor
    private GoogleCloudMlV1__HyperparameterOutputResponse(
        @CustomType.Parameter("allMetrics") List<GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse> allMetrics,
        @CustomType.Parameter("builtInAlgorithmOutput") GoogleCloudMlV1__BuiltInAlgorithmOutputResponse builtInAlgorithmOutput,
        @CustomType.Parameter("endTime") String endTime,
        @CustomType.Parameter("finalMetric") GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse finalMetric,
        @CustomType.Parameter("hyperparameters") Map<String,String> hyperparameters,
        @CustomType.Parameter("isTrialStoppedEarly") Boolean isTrialStoppedEarly,
        @CustomType.Parameter("startTime") String startTime,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("trialId") String trialId,
        @CustomType.Parameter("webAccessUris") Map<String,String> webAccessUris) {
        this.allMetrics = allMetrics;
        this.builtInAlgorithmOutput = builtInAlgorithmOutput;
        this.endTime = endTime;
        this.finalMetric = finalMetric;
        this.hyperparameters = hyperparameters;
        this.isTrialStoppedEarly = isTrialStoppedEarly;
        this.startTime = startTime;
        this.state = state;
        this.trialId = trialId;
        this.webAccessUris = webAccessUris;
    }

    /**
     * All recorded object metrics for this trial. This field is not currently populated.
     * 
    */
    public List<GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse> getAllMetrics() {
        return this.allMetrics;
    }
    /**
     * Details related to built-in algorithms jobs. Only set for trials of built-in algorithms jobs that have succeeded.
     * 
    */
    public GoogleCloudMlV1__BuiltInAlgorithmOutputResponse getBuiltInAlgorithmOutput() {
        return this.builtInAlgorithmOutput;
    }
    /**
     * End time for the trial.
     * 
    */
    public String getEndTime() {
        return this.endTime;
    }
    /**
     * The final objective metric seen for this trial.
     * 
    */
    public GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse getFinalMetric() {
        return this.finalMetric;
    }
    /**
     * The hyperparameters given to this trial.
     * 
    */
    public Map<String,String> getHyperparameters() {
        return this.hyperparameters;
    }
    /**
     * True if the trial is stopped early.
     * 
    */
    public Boolean getIsTrialStoppedEarly() {
        return this.isTrialStoppedEarly;
    }
    /**
     * Start time for the trial.
     * 
    */
    public String getStartTime() {
        return this.startTime;
    }
    /**
     * The detailed state of the trial.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * The trial id for these results.
     * 
    */
    public String getTrialId() {
        return this.trialId;
    }
    /**
     * URIs for accessing [interactive shells](https://cloud.google.com/ai-platform/training/docs/monitor-debug-interactive-shell) (one URI for each training node). Only available if this trial is part of a hyperparameter tuning job and the job's training_input.enable_web_access is `true`. The keys are names of each node in the training job; for example, `master-replica-0` for the master node, `worker-replica-0` for the first worker, and `ps-replica-0` for the first parameter server. The values are the URIs for each node's interactive shell.
     * 
    */
    public Map<String,String> getWebAccessUris() {
        return this.webAccessUris;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__HyperparameterOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse> allMetrics;
        private GoogleCloudMlV1__BuiltInAlgorithmOutputResponse builtInAlgorithmOutput;
        private String endTime;
        private GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse finalMetric;
        private Map<String,String> hyperparameters;
        private Boolean isTrialStoppedEarly;
        private String startTime;
        private String state;
        private String trialId;
        private Map<String,String> webAccessUris;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__HyperparameterOutputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allMetrics = defaults.allMetrics;
    	      this.builtInAlgorithmOutput = defaults.builtInAlgorithmOutput;
    	      this.endTime = defaults.endTime;
    	      this.finalMetric = defaults.finalMetric;
    	      this.hyperparameters = defaults.hyperparameters;
    	      this.isTrialStoppedEarly = defaults.isTrialStoppedEarly;
    	      this.startTime = defaults.startTime;
    	      this.state = defaults.state;
    	      this.trialId = defaults.trialId;
    	      this.webAccessUris = defaults.webAccessUris;
        }

        public Builder allMetrics(List<GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse> allMetrics) {
            this.allMetrics = Objects.requireNonNull(allMetrics);
            return this;
        }
        public Builder allMetrics(GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse... allMetrics) {
            return allMetrics(List.of(allMetrics));
        }
        public Builder builtInAlgorithmOutput(GoogleCloudMlV1__BuiltInAlgorithmOutputResponse builtInAlgorithmOutput) {
            this.builtInAlgorithmOutput = Objects.requireNonNull(builtInAlgorithmOutput);
            return this;
        }
        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        public Builder finalMetric(GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse finalMetric) {
            this.finalMetric = Objects.requireNonNull(finalMetric);
            return this;
        }
        public Builder hyperparameters(Map<String,String> hyperparameters) {
            this.hyperparameters = Objects.requireNonNull(hyperparameters);
            return this;
        }
        public Builder isTrialStoppedEarly(Boolean isTrialStoppedEarly) {
            this.isTrialStoppedEarly = Objects.requireNonNull(isTrialStoppedEarly);
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
        public Builder trialId(String trialId) {
            this.trialId = Objects.requireNonNull(trialId);
            return this;
        }
        public Builder webAccessUris(Map<String,String> webAccessUris) {
            this.webAccessUris = Objects.requireNonNull(webAccessUris);
            return this;
        }        public GoogleCloudMlV1__HyperparameterOutputResponse build() {
            return new GoogleCloudMlV1__HyperparameterOutputResponse(allMetrics, builtInAlgorithmOutput, endTime, finalMetric, hyperparameters, isTrialStoppedEarly, startTime, state, trialId, webAccessUris);
        }
    }
}
