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
public final class GetPropertyRulesBuilderRulesV20230530BehaviorModifyIncomingResponseHeader {
    private @Nullable String action;
    private @Nullable Boolean avoidDuplicateHeaders;
    private @Nullable String customHeaderName;
    private @Nullable String headerValue;
    private @Nullable Boolean locked;
    private @Nullable String newHeaderValue;
    private @Nullable String standardAddHeaderName;
    private @Nullable String standardDeleteHeaderName;
    private @Nullable String standardModifyHeaderName;
    private @Nullable String standardPassHeaderName;
    private @Nullable String templateUuid;
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230530BehaviorModifyIncomingResponseHeader() {}
    public Optional<String> action() {
        return Optional.ofNullable(this.action);
    }
    public Optional<Boolean> avoidDuplicateHeaders() {
        return Optional.ofNullable(this.avoidDuplicateHeaders);
    }
    public Optional<String> customHeaderName() {
        return Optional.ofNullable(this.customHeaderName);
    }
    public Optional<String> headerValue() {
        return Optional.ofNullable(this.headerValue);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<String> newHeaderValue() {
        return Optional.ofNullable(this.newHeaderValue);
    }
    public Optional<String> standardAddHeaderName() {
        return Optional.ofNullable(this.standardAddHeaderName);
    }
    public Optional<String> standardDeleteHeaderName() {
        return Optional.ofNullable(this.standardDeleteHeaderName);
    }
    public Optional<String> standardModifyHeaderName() {
        return Optional.ofNullable(this.standardModifyHeaderName);
    }
    public Optional<String> standardPassHeaderName() {
        return Optional.ofNullable(this.standardPassHeaderName);
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

    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorModifyIncomingResponseHeader defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String action;
        private @Nullable Boolean avoidDuplicateHeaders;
        private @Nullable String customHeaderName;
        private @Nullable String headerValue;
        private @Nullable Boolean locked;
        private @Nullable String newHeaderValue;
        private @Nullable String standardAddHeaderName;
        private @Nullable String standardDeleteHeaderName;
        private @Nullable String standardModifyHeaderName;
        private @Nullable String standardPassHeaderName;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorModifyIncomingResponseHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.avoidDuplicateHeaders = defaults.avoidDuplicateHeaders;
    	      this.customHeaderName = defaults.customHeaderName;
    	      this.headerValue = defaults.headerValue;
    	      this.locked = defaults.locked;
    	      this.newHeaderValue = defaults.newHeaderValue;
    	      this.standardAddHeaderName = defaults.standardAddHeaderName;
    	      this.standardDeleteHeaderName = defaults.standardDeleteHeaderName;
    	      this.standardModifyHeaderName = defaults.standardModifyHeaderName;
    	      this.standardPassHeaderName = defaults.standardPassHeaderName;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder action(@Nullable String action) {

            this.action = action;
            return this;
        }
        @CustomType.Setter
        public Builder avoidDuplicateHeaders(@Nullable Boolean avoidDuplicateHeaders) {

            this.avoidDuplicateHeaders = avoidDuplicateHeaders;
            return this;
        }
        @CustomType.Setter
        public Builder customHeaderName(@Nullable String customHeaderName) {

            this.customHeaderName = customHeaderName;
            return this;
        }
        @CustomType.Setter
        public Builder headerValue(@Nullable String headerValue) {

            this.headerValue = headerValue;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {

            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder newHeaderValue(@Nullable String newHeaderValue) {

            this.newHeaderValue = newHeaderValue;
            return this;
        }
        @CustomType.Setter
        public Builder standardAddHeaderName(@Nullable String standardAddHeaderName) {

            this.standardAddHeaderName = standardAddHeaderName;
            return this;
        }
        @CustomType.Setter
        public Builder standardDeleteHeaderName(@Nullable String standardDeleteHeaderName) {

            this.standardDeleteHeaderName = standardDeleteHeaderName;
            return this;
        }
        @CustomType.Setter
        public Builder standardModifyHeaderName(@Nullable String standardModifyHeaderName) {

            this.standardModifyHeaderName = standardModifyHeaderName;
            return this;
        }
        @CustomType.Setter
        public Builder standardPassHeaderName(@Nullable String standardPassHeaderName) {

            this.standardPassHeaderName = standardPassHeaderName;
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
        public GetPropertyRulesBuilderRulesV20230530BehaviorModifyIncomingResponseHeader build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230530BehaviorModifyIncomingResponseHeader();
            _resultValue.action = action;
            _resultValue.avoidDuplicateHeaders = avoidDuplicateHeaders;
            _resultValue.customHeaderName = customHeaderName;
            _resultValue.headerValue = headerValue;
            _resultValue.locked = locked;
            _resultValue.newHeaderValue = newHeaderValue;
            _resultValue.standardAddHeaderName = standardAddHeaderName;
            _resultValue.standardDeleteHeaderName = standardDeleteHeaderName;
            _resultValue.standardModifyHeaderName = standardModifyHeaderName;
            _resultValue.standardPassHeaderName = standardPassHeaderName;
            _resultValue.templateUuid = templateUuid;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
