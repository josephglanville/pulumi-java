// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AlertPolicyConditionConditionAbsentTriggerGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AlertPolicyConditionConditionAbsentTriggerGetArgs Empty = new AlertPolicyConditionConditionAbsentTriggerGetArgs();

    /**
     * The absolute number of time series
     * that must fail the predicate for the
     * condition to be triggered.
     * 
     */
    @InputImport(name="count")
      private final @Nullable Input<Integer> count;

    public Input<Integer> getCount() {
        return this.count == null ? Input.empty() : this.count;
    }

    /**
     * The percentage of time series that
     * must fail the predicate for the
     * condition to be triggered.
     * 
     */
    @InputImport(name="percent")
      private final @Nullable Input<Double> percent;

    public Input<Double> getPercent() {
        return this.percent == null ? Input.empty() : this.percent;
    }

    public AlertPolicyConditionConditionAbsentTriggerGetArgs(
        @Nullable Input<Integer> count,
        @Nullable Input<Double> percent) {
        this.count = count;
        this.percent = percent;
    }

    private AlertPolicyConditionConditionAbsentTriggerGetArgs() {
        this.count = Input.empty();
        this.percent = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertPolicyConditionConditionAbsentTriggerGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> count;
        private @Nullable Input<Double> percent;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertPolicyConditionConditionAbsentTriggerGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.percent = defaults.percent;
        }

        public Builder setCount(@Nullable Input<Integer> count) {
            this.count = count;
            return this;
        }

        public Builder setCount(@Nullable Integer count) {
            this.count = Input.ofNullable(count);
            return this;
        }

        public Builder setPercent(@Nullable Input<Double> percent) {
            this.percent = percent;
            return this;
        }

        public Builder setPercent(@Nullable Double percent) {
            this.percent = Input.ofNullable(percent);
            return this;
        }
        public AlertPolicyConditionConditionAbsentTriggerGetArgs build() {
            return new AlertPolicyConditionConditionAbsentTriggerGetArgs(count, percent);
        }
    }
}
