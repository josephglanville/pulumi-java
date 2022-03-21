// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1_StudyConfig_MetricSpecResponse;
import io.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1_StudyConfig_ParameterSpecResponse;
import io.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__AutomatedStoppingConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Represents configuration of a study.
 * 
 */
public final class GoogleCloudMlV1__StudyConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudMlV1__StudyConfigResponse Empty = new GoogleCloudMlV1__StudyConfigResponse();

    /**
     * The search algorithm specified for the study.
     * 
     */
    @Import(name="algorithm", required=true)
      private final String algorithm;

    public String getAlgorithm() {
        return this.algorithm;
    }

    /**
     * Configuration for automated stopping of unpromising Trials.
     * 
     */
    @Import(name="automatedStoppingConfig", required=true)
      private final GoogleCloudMlV1__AutomatedStoppingConfigResponse automatedStoppingConfig;

    public GoogleCloudMlV1__AutomatedStoppingConfigResponse getAutomatedStoppingConfig() {
        return this.automatedStoppingConfig;
    }

    /**
     * Metric specs for the study.
     * 
     */
    @Import(name="metrics", required=true)
      private final List<GoogleCloudMlV1_StudyConfig_MetricSpecResponse> metrics;

    public List<GoogleCloudMlV1_StudyConfig_MetricSpecResponse> getMetrics() {
        return this.metrics;
    }

    /**
     * The set of parameters to tune.
     * 
     */
    @Import(name="parameters", required=true)
      private final List<GoogleCloudMlV1_StudyConfig_ParameterSpecResponse> parameters;

    public List<GoogleCloudMlV1_StudyConfig_ParameterSpecResponse> getParameters() {
        return this.parameters;
    }

    public GoogleCloudMlV1__StudyConfigResponse(
        String algorithm,
        GoogleCloudMlV1__AutomatedStoppingConfigResponse automatedStoppingConfig,
        List<GoogleCloudMlV1_StudyConfig_MetricSpecResponse> metrics,
        List<GoogleCloudMlV1_StudyConfig_ParameterSpecResponse> parameters) {
        this.algorithm = Objects.requireNonNull(algorithm, "expected parameter 'algorithm' to be non-null");
        this.automatedStoppingConfig = Objects.requireNonNull(automatedStoppingConfig, "expected parameter 'automatedStoppingConfig' to be non-null");
        this.metrics = Objects.requireNonNull(metrics, "expected parameter 'metrics' to be non-null");
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
    }

    private GoogleCloudMlV1__StudyConfigResponse() {
        this.algorithm = null;
        this.automatedStoppingConfig = null;
        this.metrics = List.of();
        this.parameters = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__StudyConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String algorithm;
        private GoogleCloudMlV1__AutomatedStoppingConfigResponse automatedStoppingConfig;
        private List<GoogleCloudMlV1_StudyConfig_MetricSpecResponse> metrics;
        private List<GoogleCloudMlV1_StudyConfig_ParameterSpecResponse> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__StudyConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.automatedStoppingConfig = defaults.automatedStoppingConfig;
    	      this.metrics = defaults.metrics;
    	      this.parameters = defaults.parameters;
        }

        public Builder algorithm(String algorithm) {
            this.algorithm = Objects.requireNonNull(algorithm);
            return this;
        }
        public Builder automatedStoppingConfig(GoogleCloudMlV1__AutomatedStoppingConfigResponse automatedStoppingConfig) {
            this.automatedStoppingConfig = Objects.requireNonNull(automatedStoppingConfig);
            return this;
        }
        public Builder metrics(List<GoogleCloudMlV1_StudyConfig_MetricSpecResponse> metrics) {
            this.metrics = Objects.requireNonNull(metrics);
            return this;
        }
        public Builder metrics(GoogleCloudMlV1_StudyConfig_MetricSpecResponse... metrics) {
            return metrics(List.of(metrics));
        }
        public Builder parameters(List<GoogleCloudMlV1_StudyConfig_ParameterSpecResponse> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public Builder parameters(GoogleCloudMlV1_StudyConfig_ParameterSpecResponse... parameters) {
            return parameters(List.of(parameters));
        }        public GoogleCloudMlV1__StudyConfigResponse build() {
            return new GoogleCloudMlV1__StudyConfigResponse(algorithm, automatedStoppingConfig, metrics, parameters);
        }
    }
}
