// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.azurenative.security.enums.Operator;
import io.pulumi.azurenative.security.enums.PropertyType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A rule which is evaluated upon event interception. The rule is configured by comparing a specific value from the event model to an expected value. This comparison is done by using one of the supported operators set.
 * 
 */
public final class AutomationTriggeringRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutomationTriggeringRuleArgs Empty = new AutomationTriggeringRuleArgs();

    /**
     * The expected value.
     * 
     */
    @InputImport(name="expectedValue")
      private final @Nullable Input<String> expectedValue;

    public Input<String> getExpectedValue() {
        return this.expectedValue == null ? Input.empty() : this.expectedValue;
    }

    /**
     * A valid comparer operator to use. A case-insensitive comparison will be applied for String PropertyType.
     * 
     */
    @InputImport(name="operator")
      private final @Nullable Input<Either<String,Operator>> operator;

    public Input<Either<String,Operator>> getOperator() {
        return this.operator == null ? Input.empty() : this.operator;
    }

    /**
     * The JPath of the entity model property that should be checked.
     * 
     */
    @InputImport(name="propertyJPath")
      private final @Nullable Input<String> propertyJPath;

    public Input<String> getPropertyJPath() {
        return this.propertyJPath == null ? Input.empty() : this.propertyJPath;
    }

    /**
     * The data type of the compared operands (string, integer, floating point number or a boolean [true/false]]
     * 
     */
    @InputImport(name="propertyType")
      private final @Nullable Input<Either<String,PropertyType>> propertyType;

    public Input<Either<String,PropertyType>> getPropertyType() {
        return this.propertyType == null ? Input.empty() : this.propertyType;
    }

    public AutomationTriggeringRuleArgs(
        @Nullable Input<String> expectedValue,
        @Nullable Input<Either<String,Operator>> operator,
        @Nullable Input<String> propertyJPath,
        @Nullable Input<Either<String,PropertyType>> propertyType) {
        this.expectedValue = expectedValue;
        this.operator = operator;
        this.propertyJPath = propertyJPath;
        this.propertyType = propertyType;
    }

    private AutomationTriggeringRuleArgs() {
        this.expectedValue = Input.empty();
        this.operator = Input.empty();
        this.propertyJPath = Input.empty();
        this.propertyType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationTriggeringRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> expectedValue;
        private @Nullable Input<Either<String,Operator>> operator;
        private @Nullable Input<String> propertyJPath;
        private @Nullable Input<Either<String,PropertyType>> propertyType;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomationTriggeringRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expectedValue = defaults.expectedValue;
    	      this.operator = defaults.operator;
    	      this.propertyJPath = defaults.propertyJPath;
    	      this.propertyType = defaults.propertyType;
        }

        public Builder setExpectedValue(@Nullable Input<String> expectedValue) {
            this.expectedValue = expectedValue;
            return this;
        }

        public Builder setExpectedValue(@Nullable String expectedValue) {
            this.expectedValue = Input.ofNullable(expectedValue);
            return this;
        }

        public Builder setOperator(@Nullable Input<Either<String,Operator>> operator) {
            this.operator = operator;
            return this;
        }

        public Builder setOperator(@Nullable Either<String,Operator> operator) {
            this.operator = Input.ofNullable(operator);
            return this;
        }

        public Builder setPropertyJPath(@Nullable Input<String> propertyJPath) {
            this.propertyJPath = propertyJPath;
            return this;
        }

        public Builder setPropertyJPath(@Nullable String propertyJPath) {
            this.propertyJPath = Input.ofNullable(propertyJPath);
            return this;
        }

        public Builder setPropertyType(@Nullable Input<Either<String,PropertyType>> propertyType) {
            this.propertyType = propertyType;
            return this;
        }

        public Builder setPropertyType(@Nullable Either<String,PropertyType> propertyType) {
            this.propertyType = Input.ofNullable(propertyType);
            return this;
        }
        public AutomationTriggeringRuleArgs build() {
            return new AutomationTriggeringRuleArgs(expectedValue, operator, propertyJPath, propertyType);
        }
    }
}
