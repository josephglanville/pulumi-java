// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudchannel_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.cloudchannel_v1.outputs.GoogleCloudChannelV1RenewalSettingsResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudChannelV1CommitmentSettingsResponse {
    private final String endTime;
    private final GoogleCloudChannelV1RenewalSettingsResponse renewalSettings;
    private final String startTime;

    @OutputCustomType.Constructor({"endTime","renewalSettings","startTime"})
    private GoogleCloudChannelV1CommitmentSettingsResponse(
        String endTime,
        GoogleCloudChannelV1RenewalSettingsResponse renewalSettings,
        String startTime) {
        this.endTime = Objects.requireNonNull(endTime);
        this.renewalSettings = Objects.requireNonNull(renewalSettings);
        this.startTime = Objects.requireNonNull(startTime);
    }

    public String getEndTime() {
        return this.endTime;
    }
    public GoogleCloudChannelV1RenewalSettingsResponse getRenewalSettings() {
        return this.renewalSettings;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudChannelV1CommitmentSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endTime;
        private GoogleCloudChannelV1RenewalSettingsResponse renewalSettings;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudChannelV1CommitmentSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.renewalSettings = defaults.renewalSettings;
    	      this.startTime = defaults.startTime;
        }

        public Builder setEndTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder setRenewalSettings(GoogleCloudChannelV1RenewalSettingsResponse renewalSettings) {
            this.renewalSettings = Objects.requireNonNull(renewalSettings);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public GoogleCloudChannelV1CommitmentSettingsResponse build() {
            return new GoogleCloudChannelV1CommitmentSettingsResponse(endTime, renewalSettings, startTime);
        }
    }
}