// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RulesEngineMatchConditionResponse {
    private final @Nullable Boolean negateCondition;
    private final List<String> rulesEngineMatchValue;
    private final String rulesEngineMatchVariable;
    private final String rulesEngineOperator;
    private final @Nullable String selector;
    private final @Nullable List<String> transforms;

    @OutputCustomType.Constructor({"negateCondition","rulesEngineMatchValue","rulesEngineMatchVariable","rulesEngineOperator","selector","transforms"})
    private RulesEngineMatchConditionResponse(
        @Nullable Boolean negateCondition,
        List<String> rulesEngineMatchValue,
        String rulesEngineMatchVariable,
        String rulesEngineOperator,
        @Nullable String selector,
        @Nullable List<String> transforms) {
        this.negateCondition = negateCondition;
        this.rulesEngineMatchValue = Objects.requireNonNull(rulesEngineMatchValue);
        this.rulesEngineMatchVariable = Objects.requireNonNull(rulesEngineMatchVariable);
        this.rulesEngineOperator = Objects.requireNonNull(rulesEngineOperator);
        this.selector = selector;
        this.transforms = transforms;
    }

    public Optional<Boolean> getNegateCondition() {
        return Optional.ofNullable(this.negateCondition);
    }
    public List<String> getRulesEngineMatchValue() {
        return this.rulesEngineMatchValue;
    }
    public String getRulesEngineMatchVariable() {
        return this.rulesEngineMatchVariable;
    }
    public String getRulesEngineOperator() {
        return this.rulesEngineOperator;
    }
    public Optional<String> getSelector() {
        return Optional.ofNullable(this.selector);
    }
    public List<String> getTransforms() {
        return this.transforms == null ? List.of() : this.transforms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesEngineMatchConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean negateCondition;
        private List<String> rulesEngineMatchValue;
        private String rulesEngineMatchVariable;
        private String rulesEngineOperator;
        private @Nullable String selector;
        private @Nullable List<String> transforms;

        public Builder() {
    	      // Empty
        }

        public Builder(RulesEngineMatchConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.negateCondition = defaults.negateCondition;
    	      this.rulesEngineMatchValue = defaults.rulesEngineMatchValue;
    	      this.rulesEngineMatchVariable = defaults.rulesEngineMatchVariable;
    	      this.rulesEngineOperator = defaults.rulesEngineOperator;
    	      this.selector = defaults.selector;
    	      this.transforms = defaults.transforms;
        }

        public Builder setNegateCondition(@Nullable Boolean negateCondition) {
            this.negateCondition = negateCondition;
            return this;
        }

        public Builder setRulesEngineMatchValue(List<String> rulesEngineMatchValue) {
            this.rulesEngineMatchValue = Objects.requireNonNull(rulesEngineMatchValue);
            return this;
        }

        public Builder setRulesEngineMatchVariable(String rulesEngineMatchVariable) {
            this.rulesEngineMatchVariable = Objects.requireNonNull(rulesEngineMatchVariable);
            return this;
        }

        public Builder setRulesEngineOperator(String rulesEngineOperator) {
            this.rulesEngineOperator = Objects.requireNonNull(rulesEngineOperator);
            return this;
        }

        public Builder setSelector(@Nullable String selector) {
            this.selector = selector;
            return this;
        }

        public Builder setTransforms(@Nullable List<String> transforms) {
            this.transforms = transforms;
            return this;
        }

        public RulesEngineMatchConditionResponse build() {
            return new RulesEngineMatchConditionResponse(negateCondition, rulesEngineMatchValue, rulesEngineMatchVariable, rulesEngineOperator, selector, transforms);
        }
    }
}
