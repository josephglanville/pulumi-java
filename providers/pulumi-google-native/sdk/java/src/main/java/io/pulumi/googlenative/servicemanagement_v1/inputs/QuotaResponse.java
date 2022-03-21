// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.servicemanagement_v1.inputs.MetricRuleResponse;
import io.pulumi.googlenative.servicemanagement_v1.inputs.QuotaLimitResponse;
import java.util.List;
import java.util.Objects;


/**
 * Quota configuration helps to achieve fairness and budgeting in service usage. The metric based quota configuration works this way: - The service configuration defines a set of metrics. - For API calls, the quota.metric_rules maps methods to metrics with corresponding costs. - The quota.limits defines limits on the metrics, which will be used for quota checks at runtime. An example quota configuration in yaml format: quota: limits: - name: apiWriteQpsPerProject metric: library.googleapis.com/write_calls unit: "1/min/{project}" # rate limit for consumer projects values: STANDARD: 10000 # The metric rules bind all methods to the read_calls metric, # except for the UpdateBook and DeleteBook methods. These two methods # are mapped to the write_calls metric, with the UpdateBook method # consuming at twice rate as the DeleteBook method. metric_rules: - selector: "*" metric_costs: library.googleapis.com/read_calls: 1 - selector: google.example.library.v1.LibraryService.UpdateBook metric_costs: library.googleapis.com/write_calls: 2 - selector: google.example.library.v1.LibraryService.DeleteBook metric_costs: library.googleapis.com/write_calls: 1 Corresponding Metric definition: metrics: - name: library.googleapis.com/read_calls display_name: Read requests metric_kind: DELTA value_type: INT64 - name: library.googleapis.com/write_calls display_name: Write requests metric_kind: DELTA value_type: INT64
 * 
 */
public final class QuotaResponse extends io.pulumi.resources.InvokeArgs {

    public static final QuotaResponse Empty = new QuotaResponse();

    /**
     * List of `QuotaLimit` definitions for the service.
     * 
     */
    @Import(name="limits", required=true)
      private final List<QuotaLimitResponse> limits;

    public List<QuotaLimitResponse> getLimits() {
        return this.limits;
    }

    /**
     * List of `MetricRule` definitions, each one mapping a selected method to one or more metrics.
     * 
     */
    @Import(name="metricRules", required=true)
      private final List<MetricRuleResponse> metricRules;

    public List<MetricRuleResponse> getMetricRules() {
        return this.metricRules;
    }

    public QuotaResponse(
        List<QuotaLimitResponse> limits,
        List<MetricRuleResponse> metricRules) {
        this.limits = Objects.requireNonNull(limits, "expected parameter 'limits' to be non-null");
        this.metricRules = Objects.requireNonNull(metricRules, "expected parameter 'metricRules' to be non-null");
    }

    private QuotaResponse() {
        this.limits = List.of();
        this.metricRules = List.of();
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
