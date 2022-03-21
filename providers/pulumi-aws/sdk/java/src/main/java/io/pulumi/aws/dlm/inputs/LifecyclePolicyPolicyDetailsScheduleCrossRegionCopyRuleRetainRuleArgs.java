// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dlm.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleArgs Empty = new LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleArgs();

    /**
     * The amount of time to retain each snapshot. The maximum is 100 years. This is equivalent to 1200 months, 5200 weeks, or 36500 days.
     * 
     */
    @Import(name="interval", required=true)
      private final Output<Integer> interval;

    public Output<Integer> getInterval() {
        return this.interval;
    }

    /**
     * The unit of time for time-based retention. Valid values: `DAYS`, `WEEKS`, `MONTHS`, or `YEARS`.
     * 
     */
    @Import(name="intervalUnit", required=true)
      private final Output<String> intervalUnit;

    public Output<String> getIntervalUnit() {
        return this.intervalUnit;
    }

    public LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleArgs(
        Output<Integer> interval,
        Output<String> intervalUnit) {
        this.interval = Objects.requireNonNull(interval, "expected parameter 'interval' to be non-null");
        this.intervalUnit = Objects.requireNonNull(intervalUnit, "expected parameter 'intervalUnit' to be non-null");
    }

    private LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleArgs() {
        this.interval = Output.empty();
        this.intervalUnit = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> interval;
        private Output<String> intervalUnit;

        public Builder() {
    	      // Empty
        }

        public Builder(LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interval = defaults.interval;
    	      this.intervalUnit = defaults.intervalUnit;
        }

        public Builder interval(Output<Integer> interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }
        public Builder interval(Integer interval) {
            this.interval = Output.of(Objects.requireNonNull(interval));
            return this;
        }
        public Builder intervalUnit(Output<String> intervalUnit) {
            this.intervalUnit = Objects.requireNonNull(intervalUnit);
            return this;
        }
        public Builder intervalUnit(String intervalUnit) {
            this.intervalUnit = Output.of(Objects.requireNonNull(intervalUnit));
            return this;
        }        public LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleArgs build() {
            return new LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleArgs(interval, intervalUnit);
        }
    }
}
