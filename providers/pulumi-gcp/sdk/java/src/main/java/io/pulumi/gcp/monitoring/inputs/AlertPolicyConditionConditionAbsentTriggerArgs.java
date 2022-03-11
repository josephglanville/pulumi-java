// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AlertPolicyConditionConditionAbsentTriggerArgs extends io.pulumi.resources.ResourceArgs {

    public static final AlertPolicyConditionConditionAbsentTriggerArgs Empty = new AlertPolicyConditionConditionAbsentTriggerArgs();

    /**
     * The absolute number of time series
     * that must fail the predicate for the
     * condition to be triggered.
     * 
     */
    @InputImport(name="count")
      private final @Nullable Output<Integer> count;

    public Output<Integer> getCount() {
        return this.count == null ? Output.empty() : this.count;
    }

    /**
     * The percentage of time series that
     * must fail the predicate for the
     * condition to be triggered.
     * 
     */
    @InputImport(name="percent")
      private final @Nullable Output<Double> percent;

    public Output<Double> getPercent() {
        return this.percent == null ? Output.empty() : this.percent;
    }

    public AlertPolicyConditionConditionAbsentTriggerArgs(
        @Nullable Output<Integer> count,
        @Nullable Output<Double> percent) {
        this.count = count;
        this.percent = percent;
    }

    private AlertPolicyConditionConditionAbsentTriggerArgs() {
        this.count = Output.empty();
        this.percent = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertPolicyConditionConditionAbsentTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> count;
        private @Nullable Output<Double> percent;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertPolicyConditionConditionAbsentTriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.percent = defaults.percent;
        }

        public Builder count(@Nullable Output<Integer> count) {
            this.count = count;
            return this;
        }

        public Builder count(@Nullable Integer count) {
            this.count = Output.ofNullable(count);
            return this;
        }

        public Builder percent(@Nullable Output<Double> percent) {
            this.percent = percent;
            return this;
        }

        public Builder percent(@Nullable Double percent) {
            this.percent = Output.ofNullable(percent);
            return this;
        }
        public AlertPolicyConditionConditionAbsentTriggerArgs build() {
            return new AlertPolicyConditionConditionAbsentTriggerArgs(count, percent);
        }
    }
}
