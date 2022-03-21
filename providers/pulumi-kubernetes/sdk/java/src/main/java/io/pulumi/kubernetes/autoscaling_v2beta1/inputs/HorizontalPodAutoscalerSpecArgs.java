// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.autoscaling_v2beta1.inputs.CrossVersionObjectReferenceArgs;
import io.pulumi.kubernetes.autoscaling_v2beta1.inputs.MetricSpecArgs;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * HorizontalPodAutoscalerSpec describes the desired functionality of the HorizontalPodAutoscaler.
 * 
 */
public final class HorizontalPodAutoscalerSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final HorizontalPodAutoscalerSpecArgs Empty = new HorizontalPodAutoscalerSpecArgs();

    /**
     * maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale up. It cannot be less that minReplicas.
     * 
     */
    @Import(name="maxReplicas", required=true)
      private final Output<Integer> maxReplicas;

    public Output<Integer> getMaxReplicas() {
        return this.maxReplicas;
    }

    /**
     * metrics contains the specifications for which to use to calculate the desired replica count (the maximum replica count across all metrics will be used).  The desired replica count is calculated multiplying the ratio between the target value and the current value by the current number of pods.  Ergo, metrics used must decrease as the pod count is increased, and vice-versa.  See the individual metric source types for more information about how each type of metric must respond.
     * 
     */
    @Import(name="metrics")
      private final @Nullable Output<List<MetricSpecArgs>> metrics;

    public Output<List<MetricSpecArgs>> getMetrics() {
        return this.metrics == null ? Output.empty() : this.metrics;
    }

    /**
     * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.  It defaults to 1 pod.  minReplicas is allowed to be 0 if the alpha feature gate HPAScaleToZero is enabled and at least one Object or External metric is configured.  Scaling is active as long as at least one metric value is available.
     * 
     */
    @Import(name="minReplicas")
      private final @Nullable Output<Integer> minReplicas;

    public Output<Integer> getMinReplicas() {
        return this.minReplicas == null ? Output.empty() : this.minReplicas;
    }

    /**
     * scaleTargetRef points to the target resource to scale, and is used to the pods for which metrics should be collected, as well as to actually change the replica count.
     * 
     */
    @Import(name="scaleTargetRef", required=true)
      private final Output<CrossVersionObjectReferenceArgs> scaleTargetRef;

    public Output<CrossVersionObjectReferenceArgs> getScaleTargetRef() {
        return this.scaleTargetRef;
    }

    public HorizontalPodAutoscalerSpecArgs(
        Output<Integer> maxReplicas,
        @Nullable Output<List<MetricSpecArgs>> metrics,
        @Nullable Output<Integer> minReplicas,
        Output<CrossVersionObjectReferenceArgs> scaleTargetRef) {
        this.maxReplicas = Objects.requireNonNull(maxReplicas, "expected parameter 'maxReplicas' to be non-null");
        this.metrics = metrics;
        this.minReplicas = minReplicas;
        this.scaleTargetRef = Objects.requireNonNull(scaleTargetRef, "expected parameter 'scaleTargetRef' to be non-null");
    }

    private HorizontalPodAutoscalerSpecArgs() {
        this.maxReplicas = Output.empty();
        this.metrics = Output.empty();
        this.minReplicas = Output.empty();
        this.scaleTargetRef = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HorizontalPodAutoscalerSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> maxReplicas;
        private @Nullable Output<List<MetricSpecArgs>> metrics;
        private @Nullable Output<Integer> minReplicas;
        private Output<CrossVersionObjectReferenceArgs> scaleTargetRef;

        public Builder() {
    	      // Empty
        }

        public Builder(HorizontalPodAutoscalerSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxReplicas = defaults.maxReplicas;
    	      this.metrics = defaults.metrics;
    	      this.minReplicas = defaults.minReplicas;
    	      this.scaleTargetRef = defaults.scaleTargetRef;
        }

        public Builder maxReplicas(Output<Integer> maxReplicas) {
            this.maxReplicas = Objects.requireNonNull(maxReplicas);
            return this;
        }
        public Builder maxReplicas(Integer maxReplicas) {
            this.maxReplicas = Output.of(Objects.requireNonNull(maxReplicas));
            return this;
        }
        public Builder metrics(@Nullable Output<List<MetricSpecArgs>> metrics) {
            this.metrics = metrics;
            return this;
        }
        public Builder metrics(@Nullable List<MetricSpecArgs> metrics) {
            this.metrics = Output.ofNullable(metrics);
            return this;
        }
        public Builder metrics(MetricSpecArgs... metrics) {
            return metrics(List.of(metrics));
        }
        public Builder minReplicas(@Nullable Output<Integer> minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }
        public Builder minReplicas(@Nullable Integer minReplicas) {
            this.minReplicas = Output.ofNullable(minReplicas);
            return this;
        }
        public Builder scaleTargetRef(Output<CrossVersionObjectReferenceArgs> scaleTargetRef) {
            this.scaleTargetRef = Objects.requireNonNull(scaleTargetRef);
            return this;
        }
        public Builder scaleTargetRef(CrossVersionObjectReferenceArgs scaleTargetRef) {
            this.scaleTargetRef = Output.of(Objects.requireNonNull(scaleTargetRef));
            return this;
        }        public HorizontalPodAutoscalerSpecArgs build() {
            return new HorizontalPodAutoscalerSpecArgs(maxReplicas, metrics, minReplicas, scaleTargetRef);
        }
    }
}
