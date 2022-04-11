// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UsagePlanQuotaSettingsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final UsagePlanQuotaSettingsGetArgs Empty = new UsagePlanQuotaSettingsGetArgs();

    /**
     * The maximum number of requests that can be made in a given time period.
     * 
     */
    @Import(name="limit", required=true)
      private final Output<Integer> limit;

    public Output<Integer> getLimit() {
        return this.limit;
    }

    /**
     * The number of requests subtracted from the given limit in the initial time period.
     * 
     */
    @Import(name="offset")
      private final @Nullable Output<Integer> offset;

    public Output<Integer> getOffset() {
        return this.offset == null ? Codegen.empty() : this.offset;
    }

    /**
     * The time period in which the limit applies. Valid values are "DAY", "WEEK" or "MONTH".
     * 
     */
    @Import(name="period", required=true)
      private final Output<String> period;

    public Output<String> getPeriod() {
        return this.period;
    }

    public UsagePlanQuotaSettingsGetArgs(
        Output<Integer> limit,
        @Nullable Output<Integer> offset,
        Output<String> period) {
        this.limit = Objects.requireNonNull(limit, "expected parameter 'limit' to be non-null");
        this.offset = offset;
        this.period = Objects.requireNonNull(period, "expected parameter 'period' to be non-null");
    }

    private UsagePlanQuotaSettingsGetArgs() {
        this.limit = Codegen.empty();
        this.offset = Codegen.empty();
        this.period = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UsagePlanQuotaSettingsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> limit;
        private @Nullable Output<Integer> offset;
        private Output<String> period;

        public Builder() {
    	      // Empty
        }

        public Builder(UsagePlanQuotaSettingsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.limit = defaults.limit;
    	      this.offset = defaults.offset;
    	      this.period = defaults.period;
        }

        public Builder limit(Output<Integer> limit) {
            this.limit = Objects.requireNonNull(limit);
            return this;
        }
        public Builder limit(Integer limit) {
            this.limit = Output.of(Objects.requireNonNull(limit));
            return this;
        }
        public Builder offset(@Nullable Output<Integer> offset) {
            this.offset = offset;
            return this;
        }
        public Builder offset(@Nullable Integer offset) {
            this.offset = Codegen.ofNullable(offset);
            return this;
        }
        public Builder period(Output<String> period) {
            this.period = Objects.requireNonNull(period);
            return this;
        }
        public Builder period(String period) {
            this.period = Output.of(Objects.requireNonNull(period));
            return this;
        }        public UsagePlanQuotaSettingsGetArgs build() {
            return new UsagePlanQuotaSettingsGetArgs(limit, offset, period);
        }
    }
}
