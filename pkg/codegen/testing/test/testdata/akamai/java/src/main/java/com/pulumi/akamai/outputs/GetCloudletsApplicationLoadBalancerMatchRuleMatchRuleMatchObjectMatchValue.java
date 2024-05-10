// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetCloudletsApplicationLoadBalancerMatchRuleMatchRuleMatchObjectMatchValueOptions;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCloudletsApplicationLoadBalancerMatchRuleMatchRuleMatchObjectMatchValue {
    private @Nullable String name;
    private @Nullable Boolean nameCaseSensitive;
    private @Nullable Boolean nameHasWildcard;
    private @Nullable GetCloudletsApplicationLoadBalancerMatchRuleMatchRuleMatchObjectMatchValueOptions options;
    private String type;
    private @Nullable List<String> values;

    private GetCloudletsApplicationLoadBalancerMatchRuleMatchRuleMatchObjectMatchValue() {}
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<Boolean> nameCaseSensitive() {
        return Optional.ofNullable(this.nameCaseSensitive);
    }
    public Optional<Boolean> nameHasWildcard() {
        return Optional.ofNullable(this.nameHasWildcard);
    }
    public Optional<GetCloudletsApplicationLoadBalancerMatchRuleMatchRuleMatchObjectMatchValueOptions> options() {
        return Optional.ofNullable(this.options);
    }
    public String type() {
        return this.type;
    }
    public List<String> values() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudletsApplicationLoadBalancerMatchRuleMatchRuleMatchObjectMatchValue defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private @Nullable Boolean nameCaseSensitive;
        private @Nullable Boolean nameHasWildcard;
        private @Nullable GetCloudletsApplicationLoadBalancerMatchRuleMatchRuleMatchObjectMatchValueOptions options;
        private String type;
        private @Nullable List<String> values;
        public Builder() {}
        public Builder(GetCloudletsApplicationLoadBalancerMatchRuleMatchRuleMatchObjectMatchValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.nameCaseSensitive = defaults.nameCaseSensitive;
    	      this.nameHasWildcard = defaults.nameHasWildcard;
    	      this.options = defaults.options;
    	      this.type = defaults.type;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder nameCaseSensitive(@Nullable Boolean nameCaseSensitive) {

            this.nameCaseSensitive = nameCaseSensitive;
            return this;
        }
        @CustomType.Setter
        public Builder nameHasWildcard(@Nullable Boolean nameHasWildcard) {

            this.nameHasWildcard = nameHasWildcard;
            return this;
        }
        @CustomType.Setter
        public Builder options(@Nullable GetCloudletsApplicationLoadBalancerMatchRuleMatchRuleMatchObjectMatchValueOptions options) {

            this.options = options;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetCloudletsApplicationLoadBalancerMatchRuleMatchRuleMatchObjectMatchValue", "type");
            }
            this.type = type;
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
        public GetCloudletsApplicationLoadBalancerMatchRuleMatchRuleMatchObjectMatchValue build() {
            final var _resultValue = new GetCloudletsApplicationLoadBalancerMatchRuleMatchRuleMatchObjectMatchValue();
            _resultValue.name = name;
            _resultValue.nameCaseSensitive = nameCaseSensitive;
            _resultValue.nameHasWildcard = nameHasWildcard;
            _resultValue.options = options;
            _resultValue.type = type;
            _resultValue.values = values;
            return _resultValue;
        }
    }
}
