// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.autoscaling_v2beta2.inputs.MetricIdentifierArgs;
import io.pulumi.kubernetes.autoscaling_v2beta2.inputs.MetricTargetArgs;
import java.util.Objects;


/**
 * PodsMetricSource indicates how to scale on a metric describing each pod in the current scale target (for example, transactions-processed-per-second). The values will be averaged together before being compared to the target value.
 * 
 */
public final class PodsMetricSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final PodsMetricSourceArgs Empty = new PodsMetricSourceArgs();

    /**
     * metric identifies the target metric by name and selector
     * 
     */
    @Import(name="metric", required=true)
      private final Output<MetricIdentifierArgs> metric;

    public Output<MetricIdentifierArgs> getMetric() {
        return this.metric;
    }

    /**
     * target specifies the target value for the given metric
     * 
     */
    @Import(name="target", required=true)
      private final Output<MetricTargetArgs> target;

    public Output<MetricTargetArgs> getTarget() {
        return this.target;
    }

    public PodsMetricSourceArgs(
        Output<MetricIdentifierArgs> metric,
        Output<MetricTargetArgs> target) {
        this.metric = Objects.requireNonNull(metric, "expected parameter 'metric' to be non-null");
        this.target = Objects.requireNonNull(target, "expected parameter 'target' to be non-null");
    }

    private PodsMetricSourceArgs() {
        this.metric = Codegen.empty();
        this.target = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodsMetricSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<MetricIdentifierArgs> metric;
        private Output<MetricTargetArgs> target;

        public Builder() {
    	      // Empty
        }

        public Builder(PodsMetricSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metric = defaults.metric;
    	      this.target = defaults.target;
        }

        public Builder metric(Output<MetricIdentifierArgs> metric) {
            this.metric = Objects.requireNonNull(metric);
            return this;
        }
        public Builder metric(MetricIdentifierArgs metric) {
            this.metric = Output.of(Objects.requireNonNull(metric));
            return this;
        }
        public Builder target(Output<MetricTargetArgs> target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        public Builder target(MetricTargetArgs target) {
            this.target = Output.of(Objects.requireNonNull(target));
            return this;
        }        public PodsMetricSourceArgs build() {
            return new PodsMetricSourceArgs(metric, target);
        }
    }
}
