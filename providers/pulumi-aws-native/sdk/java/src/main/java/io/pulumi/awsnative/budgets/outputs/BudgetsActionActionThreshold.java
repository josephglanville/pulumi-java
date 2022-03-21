// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.budgets.outputs;

import io.pulumi.awsnative.budgets.enums.BudgetsActionActionThresholdType;
import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class BudgetsActionActionThreshold {
    private final BudgetsActionActionThresholdType type;
    private final Double value;

    @CustomType.Constructor
    private BudgetsActionActionThreshold(
        @CustomType.Parameter("type") BudgetsActionActionThresholdType type,
        @CustomType.Parameter("value") Double value) {
        this.type = type;
        this.value = value;
    }

    public BudgetsActionActionThresholdType getType() {
        return this.type;
    }
    public Double getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetsActionActionThreshold defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BudgetsActionActionThresholdType type;
        private Double value;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetsActionActionThreshold defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder type(BudgetsActionActionThresholdType type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder value(Double value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public BudgetsActionActionThreshold build() {
            return new BudgetsActionActionThreshold(type, value);
        }
    }
}
