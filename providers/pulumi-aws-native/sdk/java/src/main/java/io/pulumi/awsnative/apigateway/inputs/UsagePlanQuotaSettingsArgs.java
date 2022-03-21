// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UsagePlanQuotaSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final UsagePlanQuotaSettingsArgs Empty = new UsagePlanQuotaSettingsArgs();

    /**
     * The maximum number of requests that users can make within the specified time period.
     * 
     */
    @Import(name="limit")
      private final @Nullable Output<Integer> limit;

    public Output<Integer> getLimit() {
        return this.limit == null ? Output.empty() : this.limit;
    }

    /**
     * For the initial time period, the number of requests to subtract from the specified limit. When you first implement a usage plan, the plan might start in the middle of the week or month. With this property, you can decrease the limit for this initial time period.
     * 
     */
    @Import(name="offset")
      private final @Nullable Output<Integer> offset;

    public Output<Integer> getOffset() {
        return this.offset == null ? Output.empty() : this.offset;
    }

    /**
     * The time period for which the maximum limit of requests applies, such as DAY or WEEK. For valid values, see the period property for the UsagePlan resource in the Amazon API Gateway REST API Reference.
     * 
     */
    @Import(name="period")
      private final @Nullable Output<String> period;

    public Output<String> getPeriod() {
        return this.period == null ? Output.empty() : this.period;
    }

    public UsagePlanQuotaSettingsArgs(
        @Nullable Output<Integer> limit,
        @Nullable Output<Integer> offset,
        @Nullable Output<String> period) {
        this.limit = limit;
        this.offset = offset;
        this.period = period;
    }

    private UsagePlanQuotaSettingsArgs() {
        this.limit = Output.empty();
        this.offset = Output.empty();
        this.period = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UsagePlanQuotaSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> limit;
        private @Nullable Output<Integer> offset;
        private @Nullable Output<String> period;

        public Builder() {
    	      // Empty
        }

        public Builder(UsagePlanQuotaSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.limit = defaults.limit;
    	      this.offset = defaults.offset;
    	      this.period = defaults.period;
        }

        public Builder limit(@Nullable Output<Integer> limit) {
            this.limit = limit;
            return this;
        }
        public Builder limit(@Nullable Integer limit) {
            this.limit = Output.ofNullable(limit);
            return this;
        }
        public Builder offset(@Nullable Output<Integer> offset) {
            this.offset = offset;
            return this;
        }
        public Builder offset(@Nullable Integer offset) {
            this.offset = Output.ofNullable(offset);
            return this;
        }
        public Builder period(@Nullable Output<String> period) {
            this.period = period;
            return this;
        }
        public Builder period(@Nullable String period) {
            this.period = Output.ofNullable(period);
            return this;
        }        public UsagePlanQuotaSettingsArgs build() {
            return new UsagePlanQuotaSettingsArgs(limit, offset, period);
        }
    }
}
