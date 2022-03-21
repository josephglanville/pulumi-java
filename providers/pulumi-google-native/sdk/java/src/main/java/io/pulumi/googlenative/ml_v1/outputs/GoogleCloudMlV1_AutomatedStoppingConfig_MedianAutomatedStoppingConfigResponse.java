// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GoogleCloudMlV1_AutomatedStoppingConfig_MedianAutomatedStoppingConfigResponse {
    /**
     * If true, the median automated stopping rule applies to measurement.use_elapsed_time, which means the elapsed_time field of the current trial's latest measurement is used to compute the median objective value for each completed trial.
     * 
     */
    private final Boolean useElapsedTime;

    @CustomType.Constructor
    private GoogleCloudMlV1_AutomatedStoppingConfig_MedianAutomatedStoppingConfigResponse(@CustomType.Parameter("useElapsedTime") Boolean useElapsedTime) {
        this.useElapsedTime = useElapsedTime;
    }

    /**
     * If true, the median automated stopping rule applies to measurement.use_elapsed_time, which means the elapsed_time field of the current trial's latest measurement is used to compute the median objective value for each completed trial.
     * 
    */
    public Boolean getUseElapsedTime() {
        return this.useElapsedTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1_AutomatedStoppingConfig_MedianAutomatedStoppingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean useElapsedTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1_AutomatedStoppingConfig_MedianAutomatedStoppingConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.useElapsedTime = defaults.useElapsedTime;
        }

        public Builder useElapsedTime(Boolean useElapsedTime) {
            this.useElapsedTime = Objects.requireNonNull(useElapsedTime);
            return this;
        }        public GoogleCloudMlV1_AutomatedStoppingConfig_MedianAutomatedStoppingConfigResponse build() {
            return new GoogleCloudMlV1_AutomatedStoppingConfig_MedianAutomatedStoppingConfigResponse(useElapsedTime);
        }
    }
}
