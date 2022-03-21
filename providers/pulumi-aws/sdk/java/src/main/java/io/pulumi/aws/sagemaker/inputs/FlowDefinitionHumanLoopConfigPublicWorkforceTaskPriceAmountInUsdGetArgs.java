// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdGetArgs Empty = new FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdGetArgs();

    /**
     * The fractional portion, in cents, of the amount. Valid value range between `0` and `99`.
     * 
     */
    @Import(name="cents")
      private final @Nullable Output<Integer> cents;

    public Output<Integer> getCents() {
        return this.cents == null ? Output.empty() : this.cents;
    }

    /**
     * The whole number of dollars in the amount. Valid value range between `0` and `2`.
     * 
     */
    @Import(name="dollars")
      private final @Nullable Output<Integer> dollars;

    public Output<Integer> getDollars() {
        return this.dollars == null ? Output.empty() : this.dollars;
    }

    /**
     * Fractions of a cent, in tenths. Valid value range between `0` and `9`.
     * 
     */
    @Import(name="tenthFractionsOfACent")
      private final @Nullable Output<Integer> tenthFractionsOfACent;

    public Output<Integer> getTenthFractionsOfACent() {
        return this.tenthFractionsOfACent == null ? Output.empty() : this.tenthFractionsOfACent;
    }

    public FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdGetArgs(
        @Nullable Output<Integer> cents,
        @Nullable Output<Integer> dollars,
        @Nullable Output<Integer> tenthFractionsOfACent) {
        this.cents = cents;
        this.dollars = dollars;
        this.tenthFractionsOfACent = tenthFractionsOfACent;
    }

    private FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdGetArgs() {
        this.cents = Output.empty();
        this.dollars = Output.empty();
        this.tenthFractionsOfACent = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> cents;
        private @Nullable Output<Integer> dollars;
        private @Nullable Output<Integer> tenthFractionsOfACent;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cents = defaults.cents;
    	      this.dollars = defaults.dollars;
    	      this.tenthFractionsOfACent = defaults.tenthFractionsOfACent;
        }

        public Builder cents(@Nullable Output<Integer> cents) {
            this.cents = cents;
            return this;
        }
        public Builder cents(@Nullable Integer cents) {
            this.cents = Output.ofNullable(cents);
            return this;
        }
        public Builder dollars(@Nullable Output<Integer> dollars) {
            this.dollars = dollars;
            return this;
        }
        public Builder dollars(@Nullable Integer dollars) {
            this.dollars = Output.ofNullable(dollars);
            return this;
        }
        public Builder tenthFractionsOfACent(@Nullable Output<Integer> tenthFractionsOfACent) {
            this.tenthFractionsOfACent = tenthFractionsOfACent;
            return this;
        }
        public Builder tenthFractionsOfACent(@Nullable Integer tenthFractionsOfACent) {
            this.tenthFractionsOfACent = Output.ofNullable(tenthFractionsOfACent);
            return this;
        }        public FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdGetArgs build() {
            return new FlowDefinitionHumanLoopConfigPublicWorkforceTaskPriceAmountInUsdGetArgs(cents, dollars, tenthFractionsOfACent);
        }
    }
}
