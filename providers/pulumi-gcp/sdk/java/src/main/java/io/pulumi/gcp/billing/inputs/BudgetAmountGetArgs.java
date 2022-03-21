// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.billing.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.billing.inputs.BudgetAmountSpecifiedAmountGetArgs;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BudgetAmountGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BudgetAmountGetArgs Empty = new BudgetAmountGetArgs();

    /**
     * Configures a budget amount that is automatically set to 100% of
     * last period's spend.
     * Boolean. Set value to true to use. Do not set to false, instead
     * use the `specified_amount` block.
     * 
     */
    @Import(name="lastPeriodAmount")
      private final @Nullable Output<Boolean> lastPeriodAmount;

    public Output<Boolean> getLastPeriodAmount() {
        return this.lastPeriodAmount == null ? Output.empty() : this.lastPeriodAmount;
    }

    /**
     * A specified amount to use as the budget. currencyCode is
     * optional. If specified, it must match the currency of the
     * billing account. The currencyCode is provided on output.
     * Structure is documented below.
     * 
     */
    @Import(name="specifiedAmount")
      private final @Nullable Output<BudgetAmountSpecifiedAmountGetArgs> specifiedAmount;

    public Output<BudgetAmountSpecifiedAmountGetArgs> getSpecifiedAmount() {
        return this.specifiedAmount == null ? Output.empty() : this.specifiedAmount;
    }

    public BudgetAmountGetArgs(
        @Nullable Output<Boolean> lastPeriodAmount,
        @Nullable Output<BudgetAmountSpecifiedAmountGetArgs> specifiedAmount) {
        this.lastPeriodAmount = lastPeriodAmount;
        this.specifiedAmount = specifiedAmount;
    }

    private BudgetAmountGetArgs() {
        this.lastPeriodAmount = Output.empty();
        this.specifiedAmount = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetAmountGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> lastPeriodAmount;
        private @Nullable Output<BudgetAmountSpecifiedAmountGetArgs> specifiedAmount;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetAmountGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastPeriodAmount = defaults.lastPeriodAmount;
    	      this.specifiedAmount = defaults.specifiedAmount;
        }

        public Builder lastPeriodAmount(@Nullable Output<Boolean> lastPeriodAmount) {
            this.lastPeriodAmount = lastPeriodAmount;
            return this;
        }
        public Builder lastPeriodAmount(@Nullable Boolean lastPeriodAmount) {
            this.lastPeriodAmount = Output.ofNullable(lastPeriodAmount);
            return this;
        }
        public Builder specifiedAmount(@Nullable Output<BudgetAmountSpecifiedAmountGetArgs> specifiedAmount) {
            this.specifiedAmount = specifiedAmount;
            return this;
        }
        public Builder specifiedAmount(@Nullable BudgetAmountSpecifiedAmountGetArgs specifiedAmount) {
            this.specifiedAmount = Output.ofNullable(specifiedAmount);
            return this;
        }        public BudgetAmountGetArgs build() {
            return new BudgetAmountGetArgs(lastPeriodAmount, specifiedAmount);
        }
    }
}
