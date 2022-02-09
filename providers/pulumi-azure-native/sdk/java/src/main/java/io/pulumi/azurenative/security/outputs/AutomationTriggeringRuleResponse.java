// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AutomationTriggeringRuleResponse {
    private final @Nullable String expectedValue;
    private final @Nullable String operator;
    private final @Nullable String propertyJPath;
    private final @Nullable String propertyType;

    @OutputCustomType.Constructor({"expectedValue","operator","propertyJPath","propertyType"})
    private AutomationTriggeringRuleResponse(
        @Nullable String expectedValue,
        @Nullable String operator,
        @Nullable String propertyJPath,
        @Nullable String propertyType) {
        this.expectedValue = expectedValue;
        this.operator = operator;
        this.propertyJPath = propertyJPath;
        this.propertyType = propertyType;
    }

    public Optional<String> getExpectedValue() {
        return Optional.ofNullable(this.expectedValue);
    }
    public Optional<String> getOperator() {
        return Optional.ofNullable(this.operator);
    }
    public Optional<String> getPropertyJPath() {
        return Optional.ofNullable(this.propertyJPath);
    }
    public Optional<String> getPropertyType() {
        return Optional.ofNullable(this.propertyType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationTriggeringRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expectedValue;
        private @Nullable String operator;
        private @Nullable String propertyJPath;
        private @Nullable String propertyType;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomationTriggeringRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expectedValue = defaults.expectedValue;
    	      this.operator = defaults.operator;
    	      this.propertyJPath = defaults.propertyJPath;
    	      this.propertyType = defaults.propertyType;
        }

        public Builder setExpectedValue(@Nullable String expectedValue) {
            this.expectedValue = expectedValue;
            return this;
        }

        public Builder setOperator(@Nullable String operator) {
            this.operator = operator;
            return this;
        }

        public Builder setPropertyJPath(@Nullable String propertyJPath) {
            this.propertyJPath = propertyJPath;
            return this;
        }

        public Builder setPropertyType(@Nullable String propertyType) {
            this.propertyType = propertyType;
            return this;
        }

        public AutomationTriggeringRuleResponse build() {
            return new AutomationTriggeringRuleResponse(expectedValue, operator, propertyJPath, propertyType);
        }
    }
}
