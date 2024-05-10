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
public final class GetPropertyRulesBuilderRulesV20230105CriterionTokenAuthorization {
    private @Nullable Boolean locked;
    private @Nullable String matchOperator;
    private @Nullable List<String> statusLists;
    private @Nullable String templateUuid;
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230105CriterionTokenAuthorization() {}
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<String> matchOperator() {
        return Optional.ofNullable(this.matchOperator);
    }
    public List<String> statusLists() {
        return this.statusLists == null ? List.of() : this.statusLists;
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

    public static Builder builder(GetPropertyRulesBuilderRulesV20230105CriterionTokenAuthorization defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean locked;
        private @Nullable String matchOperator;
        private @Nullable List<String> statusLists;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230105CriterionTokenAuthorization defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locked = defaults.locked;
    	      this.matchOperator = defaults.matchOperator;
    	      this.statusLists = defaults.statusLists;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {

            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder matchOperator(@Nullable String matchOperator) {

            this.matchOperator = matchOperator;
            return this;
        }
        @CustomType.Setter
        public Builder statusLists(@Nullable List<String> statusLists) {

            this.statusLists = statusLists;
            return this;
        }
        public Builder statusLists(String... statusLists) {
            return statusLists(List.of(statusLists));
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
        public GetPropertyRulesBuilderRulesV20230105CriterionTokenAuthorization build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230105CriterionTokenAuthorization();
            _resultValue.locked = locked;
            _resultValue.matchOperator = matchOperator;
            _resultValue.statusLists = statusLists;
            _resultValue.templateUuid = templateUuid;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
