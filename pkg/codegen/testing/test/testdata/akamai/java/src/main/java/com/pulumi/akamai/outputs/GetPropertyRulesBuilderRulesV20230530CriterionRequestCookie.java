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
public final class GetPropertyRulesBuilderRulesV20230530CriterionRequestCookie {
    private @Nullable String cookieName;
    private @Nullable Boolean locked;
    private @Nullable Integer lowerBound;
    private @Nullable Boolean matchCaseSensitiveName;
    private @Nullable Boolean matchCaseSensitiveValue;
    private @Nullable String matchOperator;
    private @Nullable Boolean matchWildcardName;
    private @Nullable Boolean matchWildcardValue;
    private @Nullable String templateUuid;
    private @Nullable Integer upperBound;
    private @Nullable String uuid;
    private @Nullable String value;

    private GetPropertyRulesBuilderRulesV20230530CriterionRequestCookie() {}
    public Optional<String> cookieName() {
        return Optional.ofNullable(this.cookieName);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<Integer> lowerBound() {
        return Optional.ofNullable(this.lowerBound);
    }
    public Optional<Boolean> matchCaseSensitiveName() {
        return Optional.ofNullable(this.matchCaseSensitiveName);
    }
    public Optional<Boolean> matchCaseSensitiveValue() {
        return Optional.ofNullable(this.matchCaseSensitiveValue);
    }
    public Optional<String> matchOperator() {
        return Optional.ofNullable(this.matchOperator);
    }
    public Optional<Boolean> matchWildcardName() {
        return Optional.ofNullable(this.matchWildcardName);
    }
    public Optional<Boolean> matchWildcardValue() {
        return Optional.ofNullable(this.matchWildcardValue);
    }
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    public Optional<Integer> upperBound() {
        return Optional.ofNullable(this.upperBound);
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

    public static Builder builder(GetPropertyRulesBuilderRulesV20230530CriterionRequestCookie defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String cookieName;
        private @Nullable Boolean locked;
        private @Nullable Integer lowerBound;
        private @Nullable Boolean matchCaseSensitiveName;
        private @Nullable Boolean matchCaseSensitiveValue;
        private @Nullable String matchOperator;
        private @Nullable Boolean matchWildcardName;
        private @Nullable Boolean matchWildcardValue;
        private @Nullable String templateUuid;
        private @Nullable Integer upperBound;
        private @Nullable String uuid;
        private @Nullable String value;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230530CriterionRequestCookie defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookieName = defaults.cookieName;
    	      this.locked = defaults.locked;
    	      this.lowerBound = defaults.lowerBound;
    	      this.matchCaseSensitiveName = defaults.matchCaseSensitiveName;
    	      this.matchCaseSensitiveValue = defaults.matchCaseSensitiveValue;
    	      this.matchOperator = defaults.matchOperator;
    	      this.matchWildcardName = defaults.matchWildcardName;
    	      this.matchWildcardValue = defaults.matchWildcardValue;
    	      this.templateUuid = defaults.templateUuid;
    	      this.upperBound = defaults.upperBound;
    	      this.uuid = defaults.uuid;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder cookieName(@Nullable String cookieName) {

            this.cookieName = cookieName;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {

            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder lowerBound(@Nullable Integer lowerBound) {

            this.lowerBound = lowerBound;
            return this;
        }
        @CustomType.Setter
        public Builder matchCaseSensitiveName(@Nullable Boolean matchCaseSensitiveName) {

            this.matchCaseSensitiveName = matchCaseSensitiveName;
            return this;
        }
        @CustomType.Setter
        public Builder matchCaseSensitiveValue(@Nullable Boolean matchCaseSensitiveValue) {

            this.matchCaseSensitiveValue = matchCaseSensitiveValue;
            return this;
        }
        @CustomType.Setter
        public Builder matchOperator(@Nullable String matchOperator) {

            this.matchOperator = matchOperator;
            return this;
        }
        @CustomType.Setter
        public Builder matchWildcardName(@Nullable Boolean matchWildcardName) {

            this.matchWildcardName = matchWildcardName;
            return this;
        }
        @CustomType.Setter
        public Builder matchWildcardValue(@Nullable Boolean matchWildcardValue) {

            this.matchWildcardValue = matchWildcardValue;
            return this;
        }
        @CustomType.Setter
        public Builder templateUuid(@Nullable String templateUuid) {

            this.templateUuid = templateUuid;
            return this;
        }
        @CustomType.Setter
        public Builder upperBound(@Nullable Integer upperBound) {

            this.upperBound = upperBound;
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
        public GetPropertyRulesBuilderRulesV20230530CriterionRequestCookie build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230530CriterionRequestCookie();
            _resultValue.cookieName = cookieName;
            _resultValue.locked = locked;
            _resultValue.lowerBound = lowerBound;
            _resultValue.matchCaseSensitiveName = matchCaseSensitiveName;
            _resultValue.matchCaseSensitiveValue = matchCaseSensitiveValue;
            _resultValue.matchOperator = matchOperator;
            _resultValue.matchWildcardName = matchWildcardName;
            _resultValue.matchWildcardValue = matchWildcardValue;
            _resultValue.templateUuid = templateUuid;
            _resultValue.upperBound = upperBound;
            _resultValue.uuid = uuid;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
