// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.autoscaling_v2beta2.inputs.MetricIdentifierArgs;
import io.pulumi.kubernetes.autoscaling_v2beta2.inputs.MetricValueStatusArgs;
import java.util.Objects;


/**
 * PodsMetricStatus indicates the current value of a metric describing each pod in the current scale target (for example, transactions-processed-per-second).
 * 
 */
public final class PodsMetricStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final PodsMetricStatusArgs Empty = new PodsMetricStatusArgs();

    /**
     * current contains the current value for the given metric
     * 
     */
    @InputImport(name="current", required=true)
      private final Input<MetricValueStatusArgs> current;

    public Input<MetricValueStatusArgs> getCurrent() {
        return this.current;
    }

    /**
     * metric identifies the target metric by name and selector
     * 
     */
    @InputImport(name="metric", required=true)
      private final Input<MetricIdentifierArgs> metric;

    public Input<MetricIdentifierArgs> getMetric() {
        return this.metric;
    }

    public PodsMetricStatusArgs(
        Input<MetricValueStatusArgs> current,
        Input<MetricIdentifierArgs> metric) {
        this.current = Objects.requireNonNull(current, "expected parameter 'current' to be non-null");
        this.metric = Objects.requireNonNull(metric, "expected parameter 'metric' to be non-null");
    }

    private PodsMetricStatusArgs() {
        this.current = Input.empty();
        this.metric = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodsMetricStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<MetricValueStatusArgs> current;
        private Input<MetricIdentifierArgs> metric;

        public Builder() {
    	      // Empty
        }

        public Builder(PodsMetricStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.current = defaults.current;
    	      this.metric = defaults.metric;
        }

        public Builder setCurrent(Input<MetricValueStatusArgs> current) {
            this.current = Objects.requireNonNull(current);
            return this;
        }

        public Builder setCurrent(MetricValueStatusArgs current) {
            this.current = Input.of(Objects.requireNonNull(current));
            return this;
        }

        public Builder setMetric(Input<MetricIdentifierArgs> metric) {
            this.metric = Objects.requireNonNull(metric);
            return this;
        }

        public Builder setMetric(MetricIdentifierArgs metric) {
            this.metric = Input.of(Objects.requireNonNull(metric));
            return this;
        }
        public PodsMetricStatusArgs build() {
            return new PodsMetricStatusArgs(current, metric);
        }
    }
}
