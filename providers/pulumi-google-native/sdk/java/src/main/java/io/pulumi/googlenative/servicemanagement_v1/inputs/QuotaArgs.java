// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.servicemanagement_v1.inputs.MetricRuleArgs;
import io.pulumi.googlenative.servicemanagement_v1.inputs.QuotaLimitArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class QuotaArgs extends io.pulumi.resources.ResourceArgs {

    public static final QuotaArgs Empty = new QuotaArgs();

    @InputImport(name="limits")
    private final @Nullable Input<List<QuotaLimitArgs>> limits;

    public Input<List<QuotaLimitArgs>> getLimits() {
        return this.limits == null ? Input.empty() : this.limits;
    }

    @InputImport(name="metricRules")
    private final @Nullable Input<List<MetricRuleArgs>> metricRules;

    public Input<List<MetricRuleArgs>> getMetricRules() {
        return this.metricRules == null ? Input.empty() : this.metricRules;
    }

    public QuotaArgs(
        @Nullable Input<List<QuotaLimitArgs>> limits,
        @Nullable Input<List<MetricRuleArgs>> metricRules) {
        this.limits = limits;
        this.metricRules = metricRules;
    }

    private QuotaArgs() {
        this.limits = Input.empty();
        this.metricRules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QuotaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<QuotaLimitArgs>> limits;
        private @Nullable Input<List<MetricRuleArgs>> metricRules;

        public Builder() {
    	      // Empty
        }

        public Builder(QuotaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.limits = defaults.limits;
    	      this.metricRules = defaults.metricRules;
        }

        public Builder setLimits(@Nullable Input<List<QuotaLimitArgs>> limits) {
            this.limits = limits;
            return this;
        }

        public Builder setLimits(@Nullable List<QuotaLimitArgs> limits) {
            this.limits = Input.ofNullable(limits);
            return this;
        }

        public Builder setMetricRules(@Nullable Input<List<MetricRuleArgs>> metricRules) {
            this.metricRules = metricRules;
            return this;
        }

        public Builder setMetricRules(@Nullable List<MetricRuleArgs> metricRules) {
            this.metricRules = Input.ofNullable(metricRules);
            return this;
        }

        public QuotaArgs build() {
            return new QuotaArgs(limits, metricRules);
        }
    }
}