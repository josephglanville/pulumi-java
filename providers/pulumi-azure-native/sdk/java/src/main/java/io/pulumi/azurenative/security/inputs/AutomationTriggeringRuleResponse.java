// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutomationTriggeringRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final AutomationTriggeringRuleResponse Empty = new AutomationTriggeringRuleResponse();

    @InputImport(name="expectedValue")
    private final @Nullable String expectedValue;

    public Optional<String> getExpectedValue() {
        return this.expectedValue == null ? Optional.empty() : Optional.ofNullable(this.expectedValue);
    }

    @InputImport(name="operator")
    private final @Nullable String operator;

    public Optional<String> getOperator() {
        return this.operator == null ? Optional.empty() : Optional.ofNullable(this.operator);
    }

    @InputImport(name="propertyJPath")
    private final @Nullable String propertyJPath;

    public Optional<String> getPropertyJPath() {
        return this.propertyJPath == null ? Optional.empty() : Optional.ofNullable(this.propertyJPath);
    }

    @InputImport(name="propertyType")
    private final @Nullable String propertyType;

    public Optional<String> getPropertyType() {
        return this.propertyType == null ? Optional.empty() : Optional.ofNullable(this.propertyType);
    }

    public AutomationTriggeringRuleResponse(
        @Nullable String expectedValue,
        @Nullable String operator,
        @Nullable String propertyJPath,
        @Nullable String propertyType) {
        this.expectedValue = expectedValue;
        this.operator = operator;
        this.propertyJPath = propertyJPath;
        this.propertyType = propertyType;
    }

    private AutomationTriggeringRuleResponse() {
        this.expectedValue = null;
        this.operator = null;
        this.propertyJPath = null;
        this.propertyType = null;
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
