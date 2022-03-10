// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.budgets.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BudgetActionActionThreshold {
    /**
     * The type of threshold for a notification. Valid values are `PERCENTAGE` or `ABSOLUTE_VALUE`.
     * 
     */
    private final String actionThresholdType;
    /**
     * The threshold of a notification.
     * 
     */
    private final Double actionThresholdValue;

    @OutputCustomType.Constructor
    private BudgetActionActionThreshold(
        @OutputCustomType.Parameter("actionThresholdType") String actionThresholdType,
        @OutputCustomType.Parameter("actionThresholdValue") Double actionThresholdValue) {
        this.actionThresholdType = actionThresholdType;
        this.actionThresholdValue = actionThresholdValue;
    }

    /**
     * The type of threshold for a notification. Valid values are `PERCENTAGE` or `ABSOLUTE_VALUE`.
     * 
    */
    public String getActionThresholdType() {
        return this.actionThresholdType;
    }
    /**
     * The threshold of a notification.
     * 
    */
    public Double getActionThresholdValue() {
        return this.actionThresholdValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetActionActionThreshold defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String actionThresholdType;
        private Double actionThresholdValue;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetActionActionThreshold defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionThresholdType = defaults.actionThresholdType;
    	      this.actionThresholdValue = defaults.actionThresholdValue;
        }

        public Builder setActionThresholdType(String actionThresholdType) {
            this.actionThresholdType = Objects.requireNonNull(actionThresholdType);
            return this;
        }

        public Builder setActionThresholdValue(Double actionThresholdValue) {
            this.actionThresholdValue = Objects.requireNonNull(actionThresholdValue);
            return this;
        }
        public BudgetActionActionThreshold build() {
            return new BudgetActionActionThreshold(actionThresholdType, actionThresholdValue);
        }
    }
}
