// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230105BehaviorDatastream {
    private @Nullable String beaconStreamTitle;
    private @Nullable Boolean collectMidgressTraffic;
    private @Nullable String datastreamIds;
    private @Nullable Boolean enabled;
    private @Nullable Boolean locked;
    private @Nullable Boolean logEnabled;
    private @Nullable Integer logStreamName;
    private @Nullable String logStreamTitle;
    private @Nullable Integer samplingPercentage;
    private @Nullable String streamType;
    private @Nullable String templateUuid;
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230105BehaviorDatastream() {}
    public Optional<String> beaconStreamTitle() {
        return Optional.ofNullable(this.beaconStreamTitle);
    }
    public Optional<Boolean> collectMidgressTraffic() {
        return Optional.ofNullable(this.collectMidgressTraffic);
    }
    public Optional<String> datastreamIds() {
        return Optional.ofNullable(this.datastreamIds);
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<Boolean> logEnabled() {
        return Optional.ofNullable(this.logEnabled);
    }
    public Optional<Integer> logStreamName() {
        return Optional.ofNullable(this.logStreamName);
    }
    public Optional<String> logStreamTitle() {
        return Optional.ofNullable(this.logStreamTitle);
    }
    public Optional<Integer> samplingPercentage() {
        return Optional.ofNullable(this.samplingPercentage);
    }
    public Optional<String> streamType() {
        return Optional.ofNullable(this.streamType);
    }
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorDatastream defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String beaconStreamTitle;
        private @Nullable Boolean collectMidgressTraffic;
        private @Nullable String datastreamIds;
        private @Nullable Boolean enabled;
        private @Nullable Boolean locked;
        private @Nullable Boolean logEnabled;
        private @Nullable Integer logStreamName;
        private @Nullable String logStreamTitle;
        private @Nullable Integer samplingPercentage;
        private @Nullable String streamType;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorDatastream defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.beaconStreamTitle = defaults.beaconStreamTitle;
    	      this.collectMidgressTraffic = defaults.collectMidgressTraffic;
    	      this.datastreamIds = defaults.datastreamIds;
    	      this.enabled = defaults.enabled;
    	      this.locked = defaults.locked;
    	      this.logEnabled = defaults.logEnabled;
    	      this.logStreamName = defaults.logStreamName;
    	      this.logStreamTitle = defaults.logStreamTitle;
    	      this.samplingPercentage = defaults.samplingPercentage;
    	      this.streamType = defaults.streamType;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder beaconStreamTitle(@Nullable String beaconStreamTitle) {

            this.beaconStreamTitle = beaconStreamTitle;
            return this;
        }
        @CustomType.Setter
        public Builder collectMidgressTraffic(@Nullable Boolean collectMidgressTraffic) {

            this.collectMidgressTraffic = collectMidgressTraffic;
            return this;
        }
        @CustomType.Setter
        public Builder datastreamIds(@Nullable String datastreamIds) {

            this.datastreamIds = datastreamIds;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {

            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder logEnabled(@Nullable Boolean logEnabled) {

            this.logEnabled = logEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder logStreamName(@Nullable Integer logStreamName) {

            this.logStreamName = logStreamName;
            return this;
        }
        @CustomType.Setter
        public Builder logStreamTitle(@Nullable String logStreamTitle) {

            this.logStreamTitle = logStreamTitle;
            return this;
        }
        @CustomType.Setter
        public Builder samplingPercentage(@Nullable Integer samplingPercentage) {

            this.samplingPercentage = samplingPercentage;
            return this;
        }
        @CustomType.Setter
        public Builder streamType(@Nullable String streamType) {

            this.streamType = streamType;
            return this;
        }
        @CustomType.Setter
        public Builder templateUuid(@Nullable String templateUuid) {

            this.templateUuid = templateUuid;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {

            this.uuid = uuid;
            return this;
        }
        public GetPropertyRulesBuilderRulesV20230105BehaviorDatastream build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230105BehaviorDatastream();
            _resultValue.beaconStreamTitle = beaconStreamTitle;
            _resultValue.collectMidgressTraffic = collectMidgressTraffic;
            _resultValue.datastreamIds = datastreamIds;
            _resultValue.enabled = enabled;
            _resultValue.locked = locked;
            _resultValue.logEnabled = logEnabled;
            _resultValue.logStreamName = logStreamName;
            _resultValue.logStreamTitle = logStreamTitle;
            _resultValue.samplingPercentage = samplingPercentage;
            _resultValue.streamType = streamType;
            _resultValue.templateUuid = templateUuid;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
