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
public final class GetPropertyRulesBuilderRulesV20230105CriterionMatchVariable {
    private @Nullable Boolean locked;
    private @Nullable String lowerBound;
    private @Nullable Boolean matchCaseSensitive;
    private @Nullable String matchOperator;
    private @Nullable Boolean matchWildcard;
    private @Nullable String templateUuid;
    private @Nullable String upperBound;
    private @Nullable String uuid;
    private @Nullable String variableExpression;
    private @Nullable String variableName;
    private @Nullable List<String> variableValues;

    private GetPropertyRulesBuilderRulesV20230105CriterionMatchVariable() {}
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<String> lowerBound() {
        return Optional.ofNullable(this.lowerBound);
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
    public Optional<String> upperBound() {
        return Optional.ofNullable(this.upperBound);
    }
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }
    public Optional<String> variableExpression() {
        return Optional.ofNullable(this.variableExpression);
    }
    public Optional<String> variableName() {
        return Optional.ofNullable(this.variableName);
    }
    public List<String> variableValues() {
        return this.variableValues == null ? List.of() : this.variableValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230105CriterionMatchVariable defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean locked;
        private @Nullable String lowerBound;
        private @Nullable Boolean matchCaseSensitive;
        private @Nullable String matchOperator;
        private @Nullable Boolean matchWildcard;
        private @Nullable String templateUuid;
        private @Nullable String upperBound;
        private @Nullable String uuid;
        private @Nullable String variableExpression;
        private @Nullable String variableName;
        private @Nullable List<String> variableValues;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230105CriterionMatchVariable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locked = defaults.locked;
    	      this.lowerBound = defaults.lowerBound;
    	      this.matchCaseSensitive = defaults.matchCaseSensitive;
    	      this.matchOperator = defaults.matchOperator;
    	      this.matchWildcard = defaults.matchWildcard;
    	      this.templateUuid = defaults.templateUuid;
    	      this.upperBound = defaults.upperBound;
    	      this.uuid = defaults.uuid;
    	      this.variableExpression = defaults.variableExpression;
    	      this.variableName = defaults.variableName;
    	      this.variableValues = defaults.variableValues;
        }

        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {

            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder lowerBound(@Nullable String lowerBound) {

            this.lowerBound = lowerBound;
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
        public Builder upperBound(@Nullable String upperBound) {

            this.upperBound = upperBound;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {

            this.uuid = uuid;
            return this;
        }
        @CustomType.Setter
        public Builder variableExpression(@Nullable String variableExpression) {

            this.variableExpression = variableExpression;
            return this;
        }
        @CustomType.Setter
        public Builder variableName(@Nullable String variableName) {

            this.variableName = variableName;
            return this;
        }
        @CustomType.Setter
        public Builder variableValues(@Nullable List<String> variableValues) {

            this.variableValues = variableValues;
            return this;
        }
        public Builder variableValues(String... variableValues) {
            return variableValues(List.of(variableValues));
        }
        public GetPropertyRulesBuilderRulesV20230105CriterionMatchVariable build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230105CriterionMatchVariable();
            _resultValue.locked = locked;
            _resultValue.lowerBound = lowerBound;
            _resultValue.matchCaseSensitive = matchCaseSensitive;
            _resultValue.matchOperator = matchOperator;
            _resultValue.matchWildcard = matchWildcard;
            _resultValue.templateUuid = templateUuid;
            _resultValue.upperBound = upperBound;
            _resultValue.uuid = uuid;
            _resultValue.variableExpression = variableExpression;
            _resultValue.variableName = variableName;
            _resultValue.variableValues = variableValues;
            return _resultValue;
        }
    }
}
