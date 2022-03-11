// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.billingbudgets_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.billingbudgets_v1.inputs.GoogleTypeDateArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * All date times begin at 12 AM US and Canadian Pacific Time (UTC-8).
 * 
 */
public final class GoogleCloudBillingBudgetsV1CustomPeriodArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudBillingBudgetsV1CustomPeriodArgs Empty = new GoogleCloudBillingBudgetsV1CustomPeriodArgs();

    /**
     * Optional. The end date of the time period. Budgets with elapsed end date won't be processed. If unset, specifies to track all usage incurred since the start_date.
     * 
     */
    @InputImport(name="endDate")
      private final @Nullable Output<GoogleTypeDateArgs> endDate;

    public Output<GoogleTypeDateArgs> getEndDate() {
        return this.endDate == null ? Output.empty() : this.endDate;
    }

    /**
     * The start date must be after January 1, 2017.
     * 
     */
    @InputImport(name="startDate", required=true)
      private final Output<GoogleTypeDateArgs> startDate;

    public Output<GoogleTypeDateArgs> getStartDate() {
        return this.startDate;
    }

    public GoogleCloudBillingBudgetsV1CustomPeriodArgs(
        @Nullable Output<GoogleTypeDateArgs> endDate,
        Output<GoogleTypeDateArgs> startDate) {
        this.endDate = endDate;
        this.startDate = Objects.requireNonNull(startDate, "expected parameter 'startDate' to be non-null");
    }

    private GoogleCloudBillingBudgetsV1CustomPeriodArgs() {
        this.endDate = Output.empty();
        this.startDate = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudBillingBudgetsV1CustomPeriodArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GoogleTypeDateArgs> endDate;
        private Output<GoogleTypeDateArgs> startDate;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudBillingBudgetsV1CustomPeriodArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endDate = defaults.endDate;
    	      this.startDate = defaults.startDate;
        }

        public Builder endDate(@Nullable Output<GoogleTypeDateArgs> endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder endDate(@Nullable GoogleTypeDateArgs endDate) {
            this.endDate = Output.ofNullable(endDate);
            return this;
        }

        public Builder startDate(Output<GoogleTypeDateArgs> startDate) {
            this.startDate = Objects.requireNonNull(startDate);
            return this;
        }

        public Builder startDate(GoogleTypeDateArgs startDate) {
            this.startDate = Output.of(Objects.requireNonNull(startDate));
            return this;
        }
        public GoogleCloudBillingBudgetsV1CustomPeriodArgs build() {
            return new GoogleCloudBillingBudgetsV1CustomPeriodArgs(endDate, startDate);
        }
    }
}
