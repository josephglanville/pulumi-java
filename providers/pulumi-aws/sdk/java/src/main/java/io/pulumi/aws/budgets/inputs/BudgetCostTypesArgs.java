// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.budgets.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BudgetCostTypesArgs extends io.pulumi.resources.ResourceArgs {

    public static final BudgetCostTypesArgs Empty = new BudgetCostTypesArgs();

    /**
     * A boolean value whether to include credits in the cost budget. Defaults to `true`
     * 
     */
    @Import(name="includeCredit")
      private final @Nullable Output<Boolean> includeCredit;

    public Output<Boolean> getIncludeCredit() {
        return this.includeCredit == null ? Output.empty() : this.includeCredit;
    }

    /**
     * Specifies whether a budget includes discounts. Defaults to `true`
     * 
     */
    @Import(name="includeDiscount")
      private final @Nullable Output<Boolean> includeDiscount;

    public Output<Boolean> getIncludeDiscount() {
        return this.includeDiscount == null ? Output.empty() : this.includeDiscount;
    }

    /**
     * A boolean value whether to include other subscription costs in the cost budget. Defaults to `true`
     * 
     */
    @Import(name="includeOtherSubscription")
      private final @Nullable Output<Boolean> includeOtherSubscription;

    public Output<Boolean> getIncludeOtherSubscription() {
        return this.includeOtherSubscription == null ? Output.empty() : this.includeOtherSubscription;
    }

    /**
     * A boolean value whether to include recurring costs in the cost budget. Defaults to `true`
     * 
     */
    @Import(name="includeRecurring")
      private final @Nullable Output<Boolean> includeRecurring;

    public Output<Boolean> getIncludeRecurring() {
        return this.includeRecurring == null ? Output.empty() : this.includeRecurring;
    }

    /**
     * A boolean value whether to include refunds in the cost budget. Defaults to `true`
     * 
     */
    @Import(name="includeRefund")
      private final @Nullable Output<Boolean> includeRefund;

    public Output<Boolean> getIncludeRefund() {
        return this.includeRefund == null ? Output.empty() : this.includeRefund;
    }

    /**
     * A boolean value whether to include subscriptions in the cost budget. Defaults to `true`
     * 
     */
    @Import(name="includeSubscription")
      private final @Nullable Output<Boolean> includeSubscription;

    public Output<Boolean> getIncludeSubscription() {
        return this.includeSubscription == null ? Output.empty() : this.includeSubscription;
    }

    /**
     * A boolean value whether to include support costs in the cost budget. Defaults to `true`
     * 
     */
    @Import(name="includeSupport")
      private final @Nullable Output<Boolean> includeSupport;

    public Output<Boolean> getIncludeSupport() {
        return this.includeSupport == null ? Output.empty() : this.includeSupport;
    }

    /**
     * A boolean value whether to include tax in the cost budget. Defaults to `true`
     * 
     */
    @Import(name="includeTax")
      private final @Nullable Output<Boolean> includeTax;

    public Output<Boolean> getIncludeTax() {
        return this.includeTax == null ? Output.empty() : this.includeTax;
    }

    /**
     * A boolean value whether to include upfront costs in the cost budget. Defaults to `true`
     * 
     */
    @Import(name="includeUpfront")
      private final @Nullable Output<Boolean> includeUpfront;

    public Output<Boolean> getIncludeUpfront() {
        return this.includeUpfront == null ? Output.empty() : this.includeUpfront;
    }

    /**
     * Specifies whether a budget uses the amortized rate. Defaults to `false`
     * 
     */
    @Import(name="useAmortized")
      private final @Nullable Output<Boolean> useAmortized;

    public Output<Boolean> getUseAmortized() {
        return this.useAmortized == null ? Output.empty() : this.useAmortized;
    }

    /**
     * A boolean value whether to use blended costs in the cost budget. Defaults to `false`
     * 
     */
    @Import(name="useBlended")
      private final @Nullable Output<Boolean> useBlended;

    public Output<Boolean> getUseBlended() {
        return this.useBlended == null ? Output.empty() : this.useBlended;
    }

    public BudgetCostTypesArgs(
        @Nullable Output<Boolean> includeCredit,
        @Nullable Output<Boolean> includeDiscount,
        @Nullable Output<Boolean> includeOtherSubscription,
        @Nullable Output<Boolean> includeRecurring,
        @Nullable Output<Boolean> includeRefund,
        @Nullable Output<Boolean> includeSubscription,
        @Nullable Output<Boolean> includeSupport,
        @Nullable Output<Boolean> includeTax,
        @Nullable Output<Boolean> includeUpfront,
        @Nullable Output<Boolean> useAmortized,
        @Nullable Output<Boolean> useBlended) {
        this.includeCredit = includeCredit;
        this.includeDiscount = includeDiscount;
        this.includeOtherSubscription = includeOtherSubscription;
        this.includeRecurring = includeRecurring;
        this.includeRefund = includeRefund;
        this.includeSubscription = includeSubscription;
        this.includeSupport = includeSupport;
        this.includeTax = includeTax;
        this.includeUpfront = includeUpfront;
        this.useAmortized = useAmortized;
        this.useBlended = useBlended;
    }

    private BudgetCostTypesArgs() {
        this.includeCredit = Output.empty();
        this.includeDiscount = Output.empty();
        this.includeOtherSubscription = Output.empty();
        this.includeRecurring = Output.empty();
        this.includeRefund = Output.empty();
        this.includeSubscription = Output.empty();
        this.includeSupport = Output.empty();
        this.includeTax = Output.empty();
        this.includeUpfront = Output.empty();
        this.useAmortized = Output.empty();
        this.useBlended = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetCostTypesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> includeCredit;
        private @Nullable Output<Boolean> includeDiscount;
        private @Nullable Output<Boolean> includeOtherSubscription;
        private @Nullable Output<Boolean> includeRecurring;
        private @Nullable Output<Boolean> includeRefund;
        private @Nullable Output<Boolean> includeSubscription;
        private @Nullable Output<Boolean> includeSupport;
        private @Nullable Output<Boolean> includeTax;
        private @Nullable Output<Boolean> includeUpfront;
        private @Nullable Output<Boolean> useAmortized;
        private @Nullable Output<Boolean> useBlended;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetCostTypesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.includeCredit = defaults.includeCredit;
    	      this.includeDiscount = defaults.includeDiscount;
    	      this.includeOtherSubscription = defaults.includeOtherSubscription;
    	      this.includeRecurring = defaults.includeRecurring;
    	      this.includeRefund = defaults.includeRefund;
    	      this.includeSubscription = defaults.includeSubscription;
    	      this.includeSupport = defaults.includeSupport;
    	      this.includeTax = defaults.includeTax;
    	      this.includeUpfront = defaults.includeUpfront;
    	      this.useAmortized = defaults.useAmortized;
    	      this.useBlended = defaults.useBlended;
        }

        public Builder includeCredit(@Nullable Output<Boolean> includeCredit) {
            this.includeCredit = includeCredit;
            return this;
        }
        public Builder includeCredit(@Nullable Boolean includeCredit) {
            this.includeCredit = Output.ofNullable(includeCredit);
            return this;
        }
        public Builder includeDiscount(@Nullable Output<Boolean> includeDiscount) {
            this.includeDiscount = includeDiscount;
            return this;
        }
        public Builder includeDiscount(@Nullable Boolean includeDiscount) {
            this.includeDiscount = Output.ofNullable(includeDiscount);
            return this;
        }
        public Builder includeOtherSubscription(@Nullable Output<Boolean> includeOtherSubscription) {
            this.includeOtherSubscription = includeOtherSubscription;
            return this;
        }
        public Builder includeOtherSubscription(@Nullable Boolean includeOtherSubscription) {
            this.includeOtherSubscription = Output.ofNullable(includeOtherSubscription);
            return this;
        }
        public Builder includeRecurring(@Nullable Output<Boolean> includeRecurring) {
            this.includeRecurring = includeRecurring;
            return this;
        }
        public Builder includeRecurring(@Nullable Boolean includeRecurring) {
            this.includeRecurring = Output.ofNullable(includeRecurring);
            return this;
        }
        public Builder includeRefund(@Nullable Output<Boolean> includeRefund) {
            this.includeRefund = includeRefund;
            return this;
        }
        public Builder includeRefund(@Nullable Boolean includeRefund) {
            this.includeRefund = Output.ofNullable(includeRefund);
            return this;
        }
        public Builder includeSubscription(@Nullable Output<Boolean> includeSubscription) {
            this.includeSubscription = includeSubscription;
            return this;
        }
        public Builder includeSubscription(@Nullable Boolean includeSubscription) {
            this.includeSubscription = Output.ofNullable(includeSubscription);
            return this;
        }
        public Builder includeSupport(@Nullable Output<Boolean> includeSupport) {
            this.includeSupport = includeSupport;
            return this;
        }
        public Builder includeSupport(@Nullable Boolean includeSupport) {
            this.includeSupport = Output.ofNullable(includeSupport);
            return this;
        }
        public Builder includeTax(@Nullable Output<Boolean> includeTax) {
            this.includeTax = includeTax;
            return this;
        }
        public Builder includeTax(@Nullable Boolean includeTax) {
            this.includeTax = Output.ofNullable(includeTax);
            return this;
        }
        public Builder includeUpfront(@Nullable Output<Boolean> includeUpfront) {
            this.includeUpfront = includeUpfront;
            return this;
        }
        public Builder includeUpfront(@Nullable Boolean includeUpfront) {
            this.includeUpfront = Output.ofNullable(includeUpfront);
            return this;
        }
        public Builder useAmortized(@Nullable Output<Boolean> useAmortized) {
            this.useAmortized = useAmortized;
            return this;
        }
        public Builder useAmortized(@Nullable Boolean useAmortized) {
            this.useAmortized = Output.ofNullable(useAmortized);
            return this;
        }
        public Builder useBlended(@Nullable Output<Boolean> useBlended) {
            this.useBlended = useBlended;
            return this;
        }
        public Builder useBlended(@Nullable Boolean useBlended) {
            this.useBlended = Output.ofNullable(useBlended);
            return this;
        }        public BudgetCostTypesArgs build() {
            return new BudgetCostTypesArgs(includeCredit, includeDiscount, includeOtherSubscription, includeRecurring, includeRefund, includeSubscription, includeSupport, includeTax, includeUpfront, useAmortized, useBlended);
        }
    }
}