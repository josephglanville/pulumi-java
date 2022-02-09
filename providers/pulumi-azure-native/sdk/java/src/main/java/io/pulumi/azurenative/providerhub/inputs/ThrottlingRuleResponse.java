// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.azurenative.providerhub.inputs.ThrottlingMetricResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ThrottlingRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final ThrottlingRuleResponse Empty = new ThrottlingRuleResponse();

    @InputImport(name="action", required=true)
    private final String action;

    public String getAction() {
        return this.action;
    }

    @InputImport(name="metrics", required=true)
    private final List<ThrottlingMetricResponse> metrics;

    public List<ThrottlingMetricResponse> getMetrics() {
        return this.metrics;
    }

    @InputImport(name="requiredFeatures")
    private final @Nullable List<String> requiredFeatures;

    public List<String> getRequiredFeatures() {
        return this.requiredFeatures == null ? List.of() : this.requiredFeatures;
    }

    public ThrottlingRuleResponse(
        String action,
        List<ThrottlingMetricResponse> metrics,
        @Nullable List<String> requiredFeatures) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.metrics = Objects.requireNonNull(metrics, "expected parameter 'metrics' to be non-null");
        this.requiredFeatures = requiredFeatures;
    }

    private ThrottlingRuleResponse() {
        this.action = null;
        this.metrics = List.of();
        this.requiredFeatures = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThrottlingRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private List<ThrottlingMetricResponse> metrics;
        private @Nullable List<String> requiredFeatures;

        public Builder() {
    	      // Empty
        }

        public Builder(ThrottlingRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.metrics = defaults.metrics;
    	      this.requiredFeatures = defaults.requiredFeatures;
        }

        public Builder setAction(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setMetrics(List<ThrottlingMetricResponse> metrics) {
            this.metrics = Objects.requireNonNull(metrics);
            return this;
        }

        public Builder setRequiredFeatures(@Nullable List<String> requiredFeatures) {
            this.requiredFeatures = requiredFeatures;
            return this;
        }

        public ThrottlingRuleResponse build() {
            return new ThrottlingRuleResponse(action, metrics, requiredFeatures);
        }
    }
}
