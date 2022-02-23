// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.autoscaling_v2beta2.inputs.MetricIdentifierArgs;
import io.pulumi.kubernetes.autoscaling_v2beta2.inputs.MetricTargetArgs;
import java.util.Objects;


/**
 * ExternalMetricSource indicates how to scale on a metric not associated with any Kubernetes object (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).
 * 
 */
public final class ExternalMetricSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExternalMetricSourceArgs Empty = new ExternalMetricSourceArgs();

    /**
     * metric identifies the target metric by name and selector
     * 
     */
    @InputImport(name="metric", required=true)
      private final Input<MetricIdentifierArgs> metric;

    public Input<MetricIdentifierArgs> getMetric() {
        return this.metric;
    }

    /**
     * target specifies the target value for the given metric
     * 
     */
    @InputImport(name="target", required=true)
      private final Input<MetricTargetArgs> target;

    public Input<MetricTargetArgs> getTarget() {
        return this.target;
    }

    public ExternalMetricSourceArgs(
        Input<MetricIdentifierArgs> metric,
        Input<MetricTargetArgs> target) {
        this.metric = Objects.requireNonNull(metric, "expected parameter 'metric' to be non-null");
        this.target = Objects.requireNonNull(target, "expected parameter 'target' to be non-null");
    }

    private ExternalMetricSourceArgs() {
        this.metric = Input.empty();
        this.target = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExternalMetricSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<MetricIdentifierArgs> metric;
        private Input<MetricTargetArgs> target;

        public Builder() {
    	      // Empty
        }

        public Builder(ExternalMetricSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metric = defaults.metric;
    	      this.target = defaults.target;
        }

        public Builder setMetric(Input<MetricIdentifierArgs> metric) {
            this.metric = Objects.requireNonNull(metric);
            return this;
        }

        public Builder setMetric(MetricIdentifierArgs metric) {
            this.metric = Input.of(Objects.requireNonNull(metric));
            return this;
        }

        public Builder setTarget(Input<MetricTargetArgs> target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }

        public Builder setTarget(MetricTargetArgs target) {
            this.target = Input.of(Objects.requireNonNull(target));
            return this;
        }
        public ExternalMetricSourceArgs build() {
            return new ExternalMetricSourceArgs(metric, target);
        }
    }
}
