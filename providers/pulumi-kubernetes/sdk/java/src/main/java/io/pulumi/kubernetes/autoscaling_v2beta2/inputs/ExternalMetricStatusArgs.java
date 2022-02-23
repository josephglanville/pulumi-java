// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.autoscaling_v2beta2.inputs.MetricIdentifierArgs;
import io.pulumi.kubernetes.autoscaling_v2beta2.inputs.MetricValueStatusArgs;
import java.util.Objects;


/**
 * ExternalMetricStatus indicates the current value of a global metric not associated with any Kubernetes object.
 * 
 */
public final class ExternalMetricStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExternalMetricStatusArgs Empty = new ExternalMetricStatusArgs();

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

    public ExternalMetricStatusArgs(
        Input<MetricValueStatusArgs> current,
        Input<MetricIdentifierArgs> metric) {
        this.current = Objects.requireNonNull(current, "expected parameter 'current' to be non-null");
        this.metric = Objects.requireNonNull(metric, "expected parameter 'metric' to be non-null");
    }

    private ExternalMetricStatusArgs() {
        this.current = Input.empty();
        this.metric = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExternalMetricStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<MetricValueStatusArgs> current;
        private Input<MetricIdentifierArgs> metric;

        public Builder() {
    	      // Empty
        }

        public Builder(ExternalMetricStatusArgs defaults) {
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
        public ExternalMetricStatusArgs build() {
            return new ExternalMetricStatusArgs(current, metric);
        }
    }
}
