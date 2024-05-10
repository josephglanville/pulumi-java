// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230105CriterionUserAgent {
    private @Nullable Boolean locked;
    private @Nullable Boolean matchCaseSensitive;
    private @Nullable String matchOperator;
    private @Nullable Boolean matchWildcard;
    private @Nullable String templateUuid;
    private @Nullable String uuid;
    private @Nullable List<String> values;

    private GetPropertyRulesBuilderRulesV20230105CriterionUserAgent() {}
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<Boolean> matchCaseSensitive() {
        return Optional.ofNullable(this.matchCaseSensitive);
    }
    public Optional<String> matchOperator() {
        return Optional.ofNullable(this.matchOperator);
    }
    public Optional<Boolean> matchWildcard() {
        return Optional.ofNullable(this.matchWildcard);
    }
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }
    public List<String> values() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230105CriterionUserAgent defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean locked;
        private @Nullable Boolean matchCaseSensitive;
        private @Nullable String matchOperator;
        private @Nullable Boolean matchWildcard;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        private @Nullable List<String> values;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230105CriterionUserAgent defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locked = defaults.locked;
    	      this.matchCaseSensitive = defaults.matchCaseSensitive;
    	      this.matchOperator = defaults.matchOperator;
    	      this.matchWildcard = defaults.matchWildcard;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {

            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder matchCaseSensitive(@Nullable Boolean matchCaseSensitive) {

            this.matchCaseSensitive = matchCaseSensitive;
            return this;
        }
        @CustomType.Setter
        public Builder matchOperator(@Nullable String matchOperator) {

            this.matchOperator = matchOperator;
            return this;
        }
        @CustomType.Setter
        public Builder matchWildcard(@Nullable Boolean matchWildcard) {

            this.matchWildcard = matchWildcard;
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
        @CustomType.Setter
        public Builder values(@Nullable List<String> values) {

            this.values = values;
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }
        public GetPropertyRulesBuilderRulesV20230105CriterionUserAgent build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230105CriterionUserAgent();
            _resultValue.locked = locked;
            _resultValue.matchCaseSensitive = matchCaseSensitive;
            _resultValue.matchOperator = matchOperator;
            _resultValue.matchWildcard = matchWildcard;
            _resultValue.templateUuid = templateUuid;
            _resultValue.uuid = uuid;
            _resultValue.values = values;
            return _resultValue;
        }
    }
}
