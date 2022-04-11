// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.consumption.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The start and end date for a budget.
 * 
 */
public final class BudgetTimePeriodArgs extends io.pulumi.resources.ResourceArgs {

    public static final BudgetTimePeriodArgs Empty = new BudgetTimePeriodArgs();

    /**
     * The end date for the budget. If not provided, we default this to 10 years from the start date.
     * 
     */
    @Import(name="endDate")
      private final @Nullable Output<String> endDate;

    public Output<String> getEndDate() {
        return this.endDate == null ? Codegen.empty() : this.endDate;
    }

    /**
     * The start date for the budget.
     * 
     */
    @Import(name="startDate", required=true)
      private final Output<String> startDate;

    public Output<String> getStartDate() {
        return this.startDate;
    }

    public BudgetTimePeriodArgs(
        @Nullable Output<String> endDate,
        Output<String> startDate) {
        this.endDate = endDate;
        this.startDate = Objects.requireNonNull(startDate, "expected parameter 'startDate' to be non-null");
    }

    private BudgetTimePeriodArgs() {
        this.endDate = Codegen.empty();
        this.startDate = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetTimePeriodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> endDate;
        private Output<String> startDate;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetTimePeriodArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endDate = defaults.endDate;
    	      this.startDate = defaults.startDate;
        }

        public Builder endDate(@Nullable Output<String> endDate) {
            this.endDate = endDate;
            return this;
        }
        public Builder endDate(@Nullable String endDate) {
            this.endDate = Codegen.ofNullable(endDate);
            return this;
        }
        public Builder startDate(Output<String> startDate) {
            this.startDate = Objects.requireNonNull(startDate);
            return this;
        }
        public Builder startDate(String startDate) {
            this.startDate = Output.of(Objects.requireNonNull(startDate));
            return this;
        }        public BudgetTimePeriodArgs build() {
            return new BudgetTimePeriodArgs(endDate, startDate);
        }
    }
}
