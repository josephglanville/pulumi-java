// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.jobs_v4.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.jobs_v4.enums.CompensationEntryType;
import io.pulumi.googlenative.jobs_v4.enums.CompensationEntryUnit;
import io.pulumi.googlenative.jobs_v4.inputs.CompensationRangeArgs;
import io.pulumi.googlenative.jobs_v4.inputs.MoneyArgs;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A compensation entry that represents one component of compensation, such as base pay, bonus, or other compensation type. Annualization: One compensation entry can be annualized if - it contains valid amount or range. - and its expected_units_per_year is set or can be derived. Its annualized range is determined as (amount or range) times expected_units_per_year.
 * 
 */
public final class CompensationEntryArgs extends io.pulumi.resources.ResourceArgs {

    public static final CompensationEntryArgs Empty = new CompensationEntryArgs();

    /**
     * Compensation amount.
     * 
     */
    @Import(name="amount")
      private final @Nullable Output<MoneyArgs> amount;

    public Output<MoneyArgs> getAmount() {
        return this.amount == null ? Codegen.empty() : this.amount;
    }

    /**
     * Compensation description. For example, could indicate equity terms or provide additional context to an estimated bonus.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Expected number of units paid each year. If not specified, when Job.employment_types is FULLTIME, a default value is inferred based on unit. Default values: - HOURLY: 2080 - DAILY: 260 - WEEKLY: 52 - MONTHLY: 12 - ANNUAL: 1
     * 
     */
    @Import(name="expectedUnitsPerYear")
      private final @Nullable Output<Double> expectedUnitsPerYear;

    public Output<Double> getExpectedUnitsPerYear() {
        return this.expectedUnitsPerYear == null ? Codegen.empty() : this.expectedUnitsPerYear;
    }

    /**
     * Compensation range.
     * 
     */
    @Import(name="range")
      private final @Nullable Output<CompensationRangeArgs> range;

    public Output<CompensationRangeArgs> getRange() {
        return this.range == null ? Codegen.empty() : this.range;
    }

    /**
     * Compensation type. Default is CompensationType.COMPENSATION_TYPE_UNSPECIFIED.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<CompensationEntryType> type;

    public Output<CompensationEntryType> getType() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    /**
     * Frequency of the specified amount. Default is CompensationUnit.COMPENSATION_UNIT_UNSPECIFIED.
     * 
     */
    @Import(name="unit")
      private final @Nullable Output<CompensationEntryUnit> unit;

    public Output<CompensationEntryUnit> getUnit() {
        return this.unit == null ? Codegen.empty() : this.unit;
    }

    public CompensationEntryArgs(
        @Nullable Output<MoneyArgs> amount,
        @Nullable Output<String> description,
        @Nullable Output<Double> expectedUnitsPerYear,
        @Nullable Output<CompensationRangeArgs> range,
        @Nullable Output<CompensationEntryType> type,
        @Nullable Output<CompensationEntryUnit> unit) {
        this.amount = amount;
        this.description = description;
        this.expectedUnitsPerYear = expectedUnitsPerYear;
        this.range = range;
        this.type = type;
        this.unit = unit;
    }

    private CompensationEntryArgs() {
        this.amount = Codegen.empty();
        this.description = Codegen.empty();
        this.expectedUnitsPerYear = Codegen.empty();
        this.range = Codegen.empty();
        this.type = Codegen.empty();
        this.unit = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CompensationEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<MoneyArgs> amount;
        private @Nullable Output<String> description;
        private @Nullable Output<Double> expectedUnitsPerYear;
        private @Nullable Output<CompensationRangeArgs> range;
        private @Nullable Output<CompensationEntryType> type;
        private @Nullable Output<CompensationEntryUnit> unit;

        public Builder() {
    	      // Empty
        }

        public Builder(CompensationEntryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amount = defaults.amount;
    	      this.description = defaults.description;
    	      this.expectedUnitsPerYear = defaults.expectedUnitsPerYear;
    	      this.range = defaults.range;
    	      this.type = defaults.type;
    	      this.unit = defaults.unit;
        }

        public Builder amount(@Nullable Output<MoneyArgs> amount) {
            this.amount = amount;
            return this;
        }
        public Builder amount(@Nullable MoneyArgs amount) {
            this.amount = Codegen.ofNullable(amount);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder expectedUnitsPerYear(@Nullable Output<Double> expectedUnitsPerYear) {
            this.expectedUnitsPerYear = expectedUnitsPerYear;
            return this;
        }
        public Builder expectedUnitsPerYear(@Nullable Double expectedUnitsPerYear) {
            this.expectedUnitsPerYear = Codegen.ofNullable(expectedUnitsPerYear);
            return this;
        }
        public Builder range(@Nullable Output<CompensationRangeArgs> range) {
            this.range = range;
            return this;
        }
        public Builder range(@Nullable CompensationRangeArgs range) {
            this.range = Codegen.ofNullable(range);
            return this;
        }
        public Builder type(@Nullable Output<CompensationEntryType> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable CompensationEntryType type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }
        public Builder unit(@Nullable Output<CompensationEntryUnit> unit) {
            this.unit = unit;
            return this;
        }
        public Builder unit(@Nullable CompensationEntryUnit unit) {
            this.unit = Codegen.ofNullable(unit);
            return this;
        }        public CompensationEntryArgs build() {
            return new CompensationEntryArgs(amount, description, expectedUnitsPerYear, range, type, unit);
        }
    }
}
