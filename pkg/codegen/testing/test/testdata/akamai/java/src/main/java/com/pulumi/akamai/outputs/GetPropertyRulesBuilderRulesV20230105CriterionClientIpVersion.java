// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230105CriterionClientIpVersion {
    private @Nullable Boolean locked;
    private @Nullable String templateUuid;
    private @Nullable Boolean useXForwardedFor;
    private @Nullable String uuid;
    private @Nullable String value;

    private GetPropertyRulesBuilderRulesV20230105CriterionClientIpVersion() {}
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    public Optional<Boolean> useXForwardedFor() {
        return Optional.ofNullable(this.useXForwardedFor);
    }
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230105CriterionClientIpVersion defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean locked;
        private @Nullable String templateUuid;
        private @Nullable Boolean useXForwardedFor;
        private @Nullable String uuid;
        private @Nullable String value;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230105CriterionClientIpVersion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locked = defaults.locked;
    	      this.templateUuid = defaults.templateUuid;
    	      this.useXForwardedFor = defaults.useXForwardedFor;
    	      this.uuid = defaults.uuid;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {

            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder templateUuid(@Nullable String templateUuid) {

            this.templateUuid = templateUuid;
            return this;
        }
        @CustomType.Setter
        public Builder useXForwardedFor(@Nullable Boolean useXForwardedFor) {

            this.useXForwardedFor = useXForwardedFor;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {

            this.uuid = uuid;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {

            this.value = value;
            return this;
        }
        public GetPropertyRulesBuilderRulesV20230105CriterionClientIpVersion build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230105CriterionClientIpVersion();
            _resultValue.locked = locked;
            _resultValue.templateUuid = templateUuid;
            _resultValue.useXForwardedFor = useXForwardedFor;
            _resultValue.uuid = uuid;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
