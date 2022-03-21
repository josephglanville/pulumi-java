// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudchannel_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudChannelV1TrialSettingsResponse {
    /**
     * Date when the trial ends. The value is in milliseconds using the UNIX Epoch format. See an example [Epoch converter](https://www.epochconverter.com).
     * 
     */
    private final String endTime;
    /**
     * Determines if the entitlement is in a trial or not: * `true` - The entitlement is in trial. * `false` - The entitlement is not in trial.
     * 
     */
    private final Boolean trial;

    @CustomType.Constructor
    private GoogleCloudChannelV1TrialSettingsResponse(
        @CustomType.Parameter("endTime") String endTime,
        @CustomType.Parameter("trial") Boolean trial) {
        this.endTime = endTime;
        this.trial = trial;
    }

    /**
     * Date when the trial ends. The value is in milliseconds using the UNIX Epoch format. See an example [Epoch converter](https://www.epochconverter.com).
     * 
    */
    public String getEndTime() {
        return this.endTime;
    }
    /**
     * Determines if the entitlement is in a trial or not: * `true` - The entitlement is in trial. * `false` - The entitlement is not in trial.
     * 
    */
    public Boolean getTrial() {
        return this.trial;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudChannelV1TrialSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endTime;
        private Boolean trial;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudChannelV1TrialSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.trial = defaults.trial;
        }

        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        public Builder trial(Boolean trial) {
            this.trial = Objects.requireNonNull(trial);
            return this;
        }        public GoogleCloudChannelV1TrialSettingsResponse build() {
            return new GoogleCloudChannelV1TrialSettingsResponse(endTime, trial);
        }
    }
}
