// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1_AutomatedStoppingConfig_DecayCurveAutomatedStoppingConfigResponse;
import io.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1_AutomatedStoppingConfig_MedianAutomatedStoppingConfigResponse;
import java.util.Objects;


/**
 * Configuration for Automated Early Stopping of Trials. If no implementation_config is set, automated early stopping will not be run.
 * 
 */
public final class GoogleCloudMlV1__AutomatedStoppingConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudMlV1__AutomatedStoppingConfigResponse Empty = new GoogleCloudMlV1__AutomatedStoppingConfigResponse();

    @Import(name="decayCurveStoppingConfig", required=true)
      private final GoogleCloudMlV1_AutomatedStoppingConfig_DecayCurveAutomatedStoppingConfigResponse decayCurveStoppingConfig;

    public GoogleCloudMlV1_AutomatedStoppingConfig_DecayCurveAutomatedStoppingConfigResponse getDecayCurveStoppingConfig() {
        return this.decayCurveStoppingConfig;
    }

    @Import(name="medianAutomatedStoppingConfig", required=true)
      private final GoogleCloudMlV1_AutomatedStoppingConfig_MedianAutomatedStoppingConfigResponse medianAutomatedStoppingConfig;

    public GoogleCloudMlV1_AutomatedStoppingConfig_MedianAutomatedStoppingConfigResponse getMedianAutomatedStoppingConfig() {
        return this.medianAutomatedStoppingConfig;
    }

    public GoogleCloudMlV1__AutomatedStoppingConfigResponse(
        GoogleCloudMlV1_AutomatedStoppingConfig_DecayCurveAutomatedStoppingConfigResponse decayCurveStoppingConfig,
        GoogleCloudMlV1_AutomatedStoppingConfig_MedianAutomatedStoppingConfigResponse medianAutomatedStoppingConfig) {
        this.decayCurveStoppingConfig = Objects.requireNonNull(decayCurveStoppingConfig, "expected parameter 'decayCurveStoppingConfig' to be non-null");
        this.medianAutomatedStoppingConfig = Objects.requireNonNull(medianAutomatedStoppingConfig, "expected parameter 'medianAutomatedStoppingConfig' to be non-null");
    }

    private GoogleCloudMlV1__AutomatedStoppingConfigResponse() {
        this.decayCurveStoppingConfig = null;
        this.medianAutomatedStoppingConfig = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__AutomatedStoppingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudMlV1_AutomatedStoppingConfig_DecayCurveAutomatedStoppingConfigResponse decayCurveStoppingConfig;
        private GoogleCloudMlV1_AutomatedStoppingConfig_MedianAutomatedStoppingConfigResponse medianAutomatedStoppingConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__AutomatedStoppingConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.decayCurveStoppingConfig = defaults.decayCurveStoppingConfig;
    	      this.medianAutomatedStoppingConfig = defaults.medianAutomatedStoppingConfig;
        }

        public Builder decayCurveStoppingConfig(GoogleCloudMlV1_AutomatedStoppingConfig_DecayCurveAutomatedStoppingConfigResponse decayCurveStoppingConfig) {
            this.decayCurveStoppingConfig = Objects.requireNonNull(decayCurveStoppingConfig);
            return this;
        }
        public Builder medianAutomatedStoppingConfig(GoogleCloudMlV1_AutomatedStoppingConfig_MedianAutomatedStoppingConfigResponse medianAutomatedStoppingConfig) {
            this.medianAutomatedStoppingConfig = Objects.requireNonNull(medianAutomatedStoppingConfig);
            return this;
        }        public GoogleCloudMlV1__AutomatedStoppingConfigResponse build() {
            return new GoogleCloudMlV1__AutomatedStoppingConfigResponse(decayCurveStoppingConfig, medianAutomatedStoppingConfig);
        }
    }
}
