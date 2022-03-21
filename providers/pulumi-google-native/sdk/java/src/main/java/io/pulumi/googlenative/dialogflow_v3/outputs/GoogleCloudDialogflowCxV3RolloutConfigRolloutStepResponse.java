// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3RolloutConfigRolloutStepResponse {
    /**
     * The name of the rollout step;
     * 
     */
    private final String displayName;
    /**
     * The minimum time that this step should last. Should be longer than 1 hour. If not set, the default minimum duration for each step will be 1 hour.
     * 
     */
    private final String minDuration;
    /**
     * The percentage of traffic allocated to the flow version of this rollout step. (0%, 100%].
     * 
     */
    private final Integer trafficPercent;

    @CustomType.Constructor
    private GoogleCloudDialogflowCxV3RolloutConfigRolloutStepResponse(
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("minDuration") String minDuration,
        @CustomType.Parameter("trafficPercent") Integer trafficPercent) {
        this.displayName = displayName;
        this.minDuration = minDuration;
        this.trafficPercent = trafficPercent;
    }

    /**
     * The name of the rollout step;
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The minimum time that this step should last. Should be longer than 1 hour. If not set, the default minimum duration for each step will be 1 hour.
     * 
    */
    public String getMinDuration() {
        return this.minDuration;
    }
    /**
     * The percentage of traffic allocated to the flow version of this rollout step. (0%, 100%].
     * 
    */
    public Integer getTrafficPercent() {
        return this.trafficPercent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3RolloutConfigRolloutStepResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String minDuration;
        private Integer trafficPercent;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3RolloutConfigRolloutStepResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.minDuration = defaults.minDuration;
    	      this.trafficPercent = defaults.trafficPercent;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder minDuration(String minDuration) {
            this.minDuration = Objects.requireNonNull(minDuration);
            return this;
        }
        public Builder trafficPercent(Integer trafficPercent) {
            this.trafficPercent = Objects.requireNonNull(trafficPercent);
            return this;
        }        public GoogleCloudDialogflowCxV3RolloutConfigRolloutStepResponse build() {
            return new GoogleCloudDialogflowCxV3RolloutConfigRolloutStepResponse(displayName, minDuration, trafficPercent);
        }
    }
}
