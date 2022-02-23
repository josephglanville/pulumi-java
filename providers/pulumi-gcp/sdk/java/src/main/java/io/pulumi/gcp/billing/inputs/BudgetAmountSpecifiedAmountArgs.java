// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.billing.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BudgetAmountSpecifiedAmountArgs extends io.pulumi.resources.ResourceArgs {

    public static final BudgetAmountSpecifiedAmountArgs Empty = new BudgetAmountSpecifiedAmountArgs();

    /**
     * The 3-letter currency code defined in ISO 4217.
     * 
     */
    @InputImport(name="currencyCode")
      private final @Nullable Input<String> currencyCode;

    public Input<String> getCurrencyCode() {
        return this.currencyCode == null ? Input.empty() : this.currencyCode;
    }

    /**
     * Number of nano (10^-9) units of the amount.
     * The value must be between -999,999,999 and +999,999,999
     * inclusive. If units is positive, nanos must be positive or
     * zero. If units is zero, nanos can be positive, zero, or
     * negative. If units is negative, nanos must be negative or
     * zero. For example $-1.75 is represented as units=-1 and
     * nanos=-750,000,000.
     * 
     */
    @InputImport(name="nanos")
      private final @Nullable Input<Integer> nanos;

    public Input<Integer> getNanos() {
        return this.nanos == null ? Input.empty() : this.nanos;
    }

    /**
     * The whole units of the amount. For example if currencyCode
     * is "USD", then 1 unit is one US dollar.
     * 
     */
    @InputImport(name="units")
      private final @Nullable Input<String> units;

    public Input<String> getUnits() {
        return this.units == null ? Input.empty() : this.units;
    }

    public BudgetAmountSpecifiedAmountArgs(
        @Nullable Input<String> currencyCode,
        @Nullable Input<Integer> nanos,
        @Nullable Input<String> units) {
        this.currencyCode = currencyCode;
        this.nanos = nanos;
        this.units = units;
    }

    private BudgetAmountSpecifiedAmountArgs() {
        this.currencyCode = Input.empty();
        this.nanos = Input.empty();
        this.units = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetAmountSpecifiedAmountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> currencyCode;
        private @Nullable Input<Integer> nanos;
        private @Nullable Input<String> units;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetAmountSpecifiedAmountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currencyCode = defaults.currencyCode;
    	      this.nanos = defaults.nanos;
    	      this.units = defaults.units;
        }

        public Builder setCurrencyCode(@Nullable Input<String> currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }

        public Builder setCurrencyCode(@Nullable String currencyCode) {
            this.currencyCode = Input.ofNullable(currencyCode);
            return this;
        }

        public Builder setNanos(@Nullable Input<Integer> nanos) {
            this.nanos = nanos;
            return this;
        }

        public Builder setNanos(@Nullable Integer nanos) {
            this.nanos = Input.ofNullable(nanos);
            return this;
        }

        public Builder setUnits(@Nullable Input<String> units) {
            this.units = units;
            return this;
        }

        public Builder setUnits(@Nullable String units) {
            this.units = Input.ofNullable(units);
            return this;
        }
        public BudgetAmountSpecifiedAmountArgs build() {
            return new BudgetAmountSpecifiedAmountArgs(currencyCode, nanos, units);
        }
    }
}
