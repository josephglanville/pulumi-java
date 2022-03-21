// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.servicemanagement_v1.outputs.MetricRuleResponse;
import io.pulumi.googlenative.servicemanagement_v1.outputs.QuotaLimitResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class QuotaResponse {
    /**
     * List of `QuotaLimit` definitions for the service.
     * 
     */
    private final List<QuotaLimitResponse> limits;
    /**
     * List of `MetricRule` definitions, each one mapping a selected method to one or more metrics.
     * 
     */
    private final List<MetricRuleResponse> metricRules;

    @CustomType.Constructor
    private QuotaResponse(
        @CustomType.Parameter("limits") List<QuotaLimitResponse> limits,
        @CustomType.Parameter("metricRules") List<MetricRuleResponse> metricRules) {
        this.limits = limits;
        this.metricRules = metricRules;
    }

    /**
     * List of `QuotaLimit` definitions for the service.
     * 
    */
    public List<QuotaLimitResponse> getLimits() {
        return this.limits;
    }
    /**
     * List of `MetricRule` definitions, each one mapping a selected method to one or more metrics.
     * 
    */
    public List<MetricRuleResponse> getMetricRules() {
        return this.metricRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QuotaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<QuotaLimitResponse> limits;
        private List<MetricRuleResponse> metricRules;

        public Builder() {
    	      // Empty
        }

        public Builder(QuotaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.limits = defaults.limits;
    	      this.metricRules = defaults.metricRules;
        }

        public Builder limits(List<QuotaLimitResponse> limits) {
            this.limits = Objects.requireNonNull(limits);
            return this;
        }
        public Builder limits(QuotaLimitResponse... limits) {
            return limits(List.of(limits));
        }
        public Builder metricRules(List<MetricRuleResponse> metricRules) {
            this.metricRules = Objects.requireNonNull(metricRules);
            return this;
        }
        public Builder metricRules(MetricRuleResponse... metricRules) {
            return metricRules(List.of(metricRules));
        }        public QuotaResponse build() {
            return new QuotaResponse(limits, metricRules);
        }
    }
}
