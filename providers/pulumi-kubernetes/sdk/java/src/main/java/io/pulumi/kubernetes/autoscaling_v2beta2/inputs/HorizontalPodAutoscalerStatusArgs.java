// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.autoscaling_v2beta2.inputs.HorizontalPodAutoscalerConditionArgs;
import io.pulumi.kubernetes.autoscaling_v2beta2.inputs.MetricStatusArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * HorizontalPodAutoscalerStatus describes the current status of a horizontal pod autoscaler.
 * 
 */
public final class HorizontalPodAutoscalerStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final HorizontalPodAutoscalerStatusArgs Empty = new HorizontalPodAutoscalerStatusArgs();

    /**
     * conditions is the set of conditions required for this autoscaler to scale its target, and indicates whether or not those conditions are met.
     * 
     */
    @Import(name="conditions")
      private final @Nullable Output<List<HorizontalPodAutoscalerConditionArgs>> conditions;

    public Output<List<HorizontalPodAutoscalerConditionArgs>> getConditions() {
        return this.conditions == null ? Output.empty() : this.conditions;
    }

    /**
     * currentMetrics is the last read state of the metrics used by this autoscaler.
     * 
     */
    @Import(name="currentMetrics")
      private final @Nullable Output<List<MetricStatusArgs>> currentMetrics;

    public Output<List<MetricStatusArgs>> getCurrentMetrics() {
        return this.currentMetrics == null ? Output.empty() : this.currentMetrics;
    }

    /**
     * currentReplicas is current number of replicas of pods managed by this autoscaler, as last seen by the autoscaler.
     * 
     */
    @Import(name="currentReplicas", required=true)
      private final Output<Integer> currentReplicas;

    public Output<Integer> getCurrentReplicas() {
        return this.currentReplicas;
    }

    /**
     * desiredReplicas is the desired number of replicas of pods managed by this autoscaler, as last calculated by the autoscaler.
     * 
     */
    @Import(name="desiredReplicas", required=true)
      private final Output<Integer> desiredReplicas;

    public Output<Integer> getDesiredReplicas() {
        return this.desiredReplicas;
    }

    /**
     * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods, used by the autoscaler to control how often the number of pods is changed.
     * 
     */
    @Import(name="lastScaleTime")
      private final @Nullable Output<String> lastScaleTime;

    public Output<String> getLastScaleTime() {
        return this.lastScaleTime == null ? Output.empty() : this.lastScaleTime;
    }

    /**
     * observedGeneration is the most recent generation observed by this autoscaler.
     * 
     */
    @Import(name="observedGeneration")
      private final @Nullable Output<Integer> observedGeneration;

    public Output<Integer> getObservedGeneration() {
        return this.observedGeneration == null ? Output.empty() : this.observedGeneration;
    }

    public HorizontalPodAutoscalerStatusArgs(
        @Nullable Output<List<HorizontalPodAutoscalerConditionArgs>> conditions,
        @Nullable Output<List<MetricStatusArgs>> currentMetrics,
        Output<Integer> currentReplicas,
        Output<Integer> desiredReplicas,
        @Nullable Output<String> lastScaleTime,
        @Nullable Output<Integer> observedGeneration) {
        this.conditions = conditions;
        this.currentMetrics = currentMetrics;
        this.currentReplicas = Objects.requireNonNull(currentReplicas, "expected parameter 'currentReplicas' to be non-null");
        this.desiredReplicas = Objects.requireNonNull(desiredReplicas, "expected parameter 'desiredReplicas' to be non-null");
        this.lastScaleTime = lastScaleTime;
        this.observedGeneration = observedGeneration;
    }

    private HorizontalPodAutoscalerStatusArgs() {
        this.conditions = Output.empty();
        this.currentMetrics = Output.empty();
        this.currentReplicas = Output.empty();
        this.desiredReplicas = Output.empty();
        this.lastScaleTime = Output.empty();
        this.observedGeneration = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HorizontalPodAutoscalerStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<HorizontalPodAutoscalerConditionArgs>> conditions;
        private @Nullable Output<List<MetricStatusArgs>> currentMetrics;
        private Output<Integer> currentReplicas;
        private Output<Integer> desiredReplicas;
        private @Nullable Output<String> lastScaleTime;
        private @Nullable Output<Integer> observedGeneration;

        public Builder() {
    	      // Empty
        }

        public Builder(HorizontalPodAutoscalerStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.currentMetrics = defaults.currentMetrics;
    	      this.currentReplicas = defaults.currentReplicas;
    	      this.desiredReplicas = defaults.desiredReplicas;
    	      this.lastScaleTime = defaults.lastScaleTime;
    	      this.observedGeneration = defaults.observedGeneration;
        }

        public Builder conditions(@Nullable Output<List<HorizontalPodAutoscalerConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }
        public Builder conditions(@Nullable List<HorizontalPodAutoscalerConditionArgs> conditions) {
            this.conditions = Output.ofNullable(conditions);
            return this;
        }
        public Builder conditions(HorizontalPodAutoscalerConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }
        public Builder currentMetrics(@Nullable Output<List<MetricStatusArgs>> currentMetrics) {
            this.currentMetrics = currentMetrics;
            return this;
        }
        public Builder currentMetrics(@Nullable List<MetricStatusArgs> currentMetrics) {
            this.currentMetrics = Output.ofNullable(currentMetrics);
            return this;
        }
        public Builder currentMetrics(MetricStatusArgs... currentMetrics) {
            return currentMetrics(List.of(currentMetrics));
        }
        public Builder currentReplicas(Output<Integer> currentReplicas) {
            this.currentReplicas = Objects.requireNonNull(currentReplicas);
            return this;
        }
        public Builder currentReplicas(Integer currentReplicas) {
            this.currentReplicas = Output.of(Objects.requireNonNull(currentReplicas));
            return this;
        }
        public Builder desiredReplicas(Output<Integer> desiredReplicas) {
            this.desiredReplicas = Objects.requireNonNull(desiredReplicas);
            return this;
        }
        public Builder desiredReplicas(Integer desiredReplicas) {
            this.desiredReplicas = Output.of(Objects.requireNonNull(desiredReplicas));
            return this;
        }
        public Builder lastScaleTime(@Nullable Output<String> lastScaleTime) {
            this.lastScaleTime = lastScaleTime;
            return this;
        }
        public Builder lastScaleTime(@Nullable String lastScaleTime) {
            this.lastScaleTime = Output.ofNullable(lastScaleTime);
            return this;
        }
        public Builder observedGeneration(@Nullable Output<Integer> observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }
        public Builder observedGeneration(@Nullable Integer observedGeneration) {
            this.observedGeneration = Output.ofNullable(observedGeneration);
            return this;
        }        public HorizontalPodAutoscalerStatusArgs build() {
            return new HorizontalPodAutoscalerStatusArgs(conditions, currentMetrics, currentReplicas, desiredReplicas, lastScaleTime, observedGeneration);
        }
    }
}
