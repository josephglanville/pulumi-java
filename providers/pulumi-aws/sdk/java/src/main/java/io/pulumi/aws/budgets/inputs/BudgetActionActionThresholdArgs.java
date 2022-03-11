// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.budgets.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


public final class BudgetActionActionThresholdArgs extends io.pulumi.resources.ResourceArgs {

    public static final BudgetActionActionThresholdArgs Empty = new BudgetActionActionThresholdArgs();

    /**
     * The type of threshold for a notification. Valid values are `PERCENTAGE` or `ABSOLUTE_VALUE`.
     * 
     */
    @InputImport(name="actionThresholdType", required=true)
      private final Output<String> actionThresholdType;

    public Output<String> getActionThresholdType() {
        return this.actionThresholdType;
    }

    /**
     * The threshold of a notification.
     * 
     */
    @InputImport(name="actionThresholdValue", required=true)
      private final Output<Double> actionThresholdValue;

    public Output<Double> getActionThresholdValue() {
        return this.actionThresholdValue;
    }

    public BudgetActionActionThresholdArgs(
        Output<String> actionThresholdType,
        Output<Double> actionThresholdValue) {
        this.actionThresholdType = Objects.requireNonNull(actionThresholdType, "expected parameter 'actionThresholdType' to be non-null");
        this.actionThresholdValue = Objects.requireNonNull(actionThresholdValue, "expected parameter 'actionThresholdValue' to be non-null");
    }

    private BudgetActionActionThresholdArgs() {
        this.actionThresholdType = Output.empty();
        this.actionThresholdValue = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetActionActionThresholdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> actionThresholdType;
        private Output<Double> actionThresholdValue;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetActionActionThresholdArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionThresholdType = defaults.actionThresholdType;
    	      this.actionThresholdValue = defaults.actionThresholdValue;
        }

        public Builder actionThresholdType(Output<String> actionThresholdType) {
            this.actionThresholdType = Objects.requireNonNull(actionThresholdType);
            return this;
        }

        public Builder actionThresholdType(String actionThresholdType) {
            this.actionThresholdType = Output.of(Objects.requireNonNull(actionThresholdType));
            return this;
        }

        public Builder actionThresholdValue(Output<Double> actionThresholdValue) {
            this.actionThresholdValue = Objects.requireNonNull(actionThresholdValue);
            return this;
        }

        public Builder actionThresholdValue(Double actionThresholdValue) {
            this.actionThresholdValue = Output.of(Objects.requireNonNull(actionThresholdValue));
            return this;
        }
        public BudgetActionActionThresholdArgs build() {
            return new BudgetActionActionThresholdArgs(actionThresholdType, actionThresholdValue);
        }
    }
}
