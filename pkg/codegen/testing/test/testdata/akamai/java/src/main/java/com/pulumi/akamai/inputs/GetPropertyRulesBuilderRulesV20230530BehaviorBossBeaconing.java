// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530BehaviorBossBeaconing extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorBossBeaconing Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorBossBeaconing();

    @Import(name="conditionalErrorPattern")
    private @Nullable String conditionalErrorPattern;

    public Optional<String> conditionalErrorPattern() {
        return Optional.ofNullable(this.conditionalErrorPattern);
    }

    @Import(name="conditionalHttpStatuses")
    private @Nullable List<String> conditionalHttpStatuses;

    public Optional<List<String>> conditionalHttpStatuses() {
        return Optional.ofNullable(this.conditionalHttpStatuses);
    }

    @Import(name="conditionalSamplingFrequency")
    private @Nullable String conditionalSamplingFrequency;

    public Optional<String> conditionalSamplingFrequency() {
        return Optional.ofNullable(this.conditionalSamplingFrequency);
    }

    @Import(name="cpcodes")
    private @Nullable String cpcodes;

    public Optional<String> cpcodes() {
        return Optional.ofNullable(this.cpcodes);
    }

    @Import(name="enabled")
    private @Nullable Boolean enabled;

    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="forwardType")
    private @Nullable String forwardType;

    public Optional<String> forwardType() {
        return Optional.ofNullable(this.forwardType);
    }

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="requestType")
    private @Nullable String requestType;

    public Optional<String> requestType() {
        return Optional.ofNullable(this.requestType);
    }

    @Import(name="samplingFrequency")
    private @Nullable String samplingFrequency;

    public Optional<String> samplingFrequency() {
        return Optional.ofNullable(this.samplingFrequency);
    }

    @Import(name="templateUuid")
    private @Nullable String templateUuid;

    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="uuid")
    private @Nullable String uuid;

    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private GetPropertyRulesBuilderRulesV20230530BehaviorBossBeaconing() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorBossBeaconing(GetPropertyRulesBuilderRulesV20230530BehaviorBossBeaconing $) {
        this.conditionalErrorPattern = $.conditionalErrorPattern;
        this.conditionalHttpStatuses = $.conditionalHttpStatuses;
        this.conditionalSamplingFrequency = $.conditionalSamplingFrequency;
        this.cpcodes = $.cpcodes;
        this.enabled = $.enabled;
        this.forwardType = $.forwardType;
        this.locked = $.locked;
        this.requestType = $.requestType;
        this.samplingFrequency = $.samplingFrequency;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorBossBeaconing defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorBossBeaconing $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorBossBeaconing();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorBossBeaconing defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorBossBeaconing(Objects.requireNonNull(defaults));
        }

        public Builder conditionalErrorPattern(@Nullable String conditionalErrorPattern) {
            $.conditionalErrorPattern = conditionalErrorPattern;
            return this;
        }

        public Builder conditionalHttpStatuses(@Nullable List<String> conditionalHttpStatuses) {
            $.conditionalHttpStatuses = conditionalHttpStatuses;
            return this;
        }

        public Builder conditionalHttpStatuses(String... conditionalHttpStatuses) {
            return conditionalHttpStatuses(List.of(conditionalHttpStatuses));
        }

        public Builder conditionalSamplingFrequency(@Nullable String conditionalSamplingFrequency) {
            $.conditionalSamplingFrequency = conditionalSamplingFrequency;
            return this;
        }

        public Builder cpcodes(@Nullable String cpcodes) {
            $.cpcodes = cpcodes;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder forwardType(@Nullable String forwardType) {
            $.forwardType = forwardType;
            return this;
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder requestType(@Nullable String requestType) {
            $.requestType = requestType;
            return this;
        }

        public Builder samplingFrequency(@Nullable String samplingFrequency) {
            $.samplingFrequency = samplingFrequency;
            return this;
        }

        public Builder templateUuid(@Nullable String templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder uuid(@Nullable String uuid) {
            $.uuid = uuid;
            return this;
        }

        public GetPropertyRulesBuilderRulesV20230530BehaviorBossBeaconing build() {
            return $;
        }
    }

}
