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
public final class GetPropertyRulesBuilderRulesV20230530BehaviorCacheKeyQueryParams {
    private @Nullable String behavior;
    private @Nullable Boolean exactMatch;
    private @Nullable Boolean locked;
    private @Nullable List<String> parameters;
    private @Nullable String templateUuid;
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230530BehaviorCacheKeyQueryParams() {}
    public Optional<String> behavior() {
        return Optional.ofNullable(this.behavior);
    }
    public Optional<Boolean> exactMatch() {
        return Optional.ofNullable(this.exactMatch);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public List<String> parameters() {
        return this.parameters == null ? List.of() : this.parameters;
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

    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorCacheKeyQueryParams defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String behavior;
        private @Nullable Boolean exactMatch;
        private @Nullable Boolean locked;
        private @Nullable List<String> parameters;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorCacheKeyQueryParams defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.behavior = defaults.behavior;
    	      this.exactMatch = defaults.exactMatch;
    	      this.locked = defaults.locked;
    	      this.parameters = defaults.parameters;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder behavior(@Nullable String behavior) {

            this.behavior = behavior;
            return this;
        }
        @CustomType.Setter
        public Builder exactMatch(@Nullable Boolean exactMatch) {

            this.exactMatch = exactMatch;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {

            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder parameters(@Nullable List<String> parameters) {

            this.parameters = parameters;
            return this;
        }
        public Builder parameters(String... parameters) {
            return parameters(List.of(parameters));
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
        public GetPropertyRulesBuilderRulesV20230530BehaviorCacheKeyQueryParams build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230530BehaviorCacheKeyQueryParams();
            _resultValue.behavior = behavior;
            _resultValue.exactMatch = exactMatch;
            _resultValue.locked = locked;
            _resultValue.parameters = parameters;
            _resultValue.templateUuid = templateUuid;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
