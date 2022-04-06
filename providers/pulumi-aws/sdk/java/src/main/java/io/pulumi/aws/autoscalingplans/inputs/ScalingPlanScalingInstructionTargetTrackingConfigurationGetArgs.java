// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscalingplans.inputs;

import io.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecificationGetArgs;
import io.pulumi.aws.autoscalingplans.inputs.ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecificationGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ScalingPlanScalingInstructionTargetTrackingConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScalingPlanScalingInstructionTargetTrackingConfigurationGetArgs Empty = new ScalingPlanScalingInstructionTargetTrackingConfigurationGetArgs();

    /**
     * A customized metric. You can specify either `customized_scaling_metric_specification` or `predefined_scaling_metric_specification`.
     * More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_CustomizedScalingMetricSpecification.html).
     * 
     */
    @Import(name="customizedScalingMetricSpecification")
      private final @Nullable Output<ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecificationGetArgs> customizedScalingMetricSpecification;

    public Output<ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecificationGetArgs> getCustomizedScalingMetricSpecification() {
        return this.customizedScalingMetricSpecification == null ? Output.empty() : this.customizedScalingMetricSpecification;
    }

    /**
     * Boolean indicating whether scale in by the target tracking scaling policy is disabled. Defaults to `false`.
     * 
     */
    @Import(name="disableScaleIn")
      private final @Nullable Output<Boolean> disableScaleIn;

    public Output<Boolean> getDisableScaleIn() {
        return this.disableScaleIn == null ? Output.empty() : this.disableScaleIn;
    }

    /**
     * The estimated time, in seconds, until a newly launched instance can contribute to the CloudWatch metrics.
     * This value is used only if the resource is an Auto Scaling group.
     * 
     */
    @Import(name="estimatedInstanceWarmup")
      private final @Nullable Output<Integer> estimatedInstanceWarmup;

    public Output<Integer> getEstimatedInstanceWarmup() {
        return this.estimatedInstanceWarmup == null ? Output.empty() : this.estimatedInstanceWarmup;
    }

    /**
     * A predefined metric. You can specify either `predefined_scaling_metric_specification` or `customized_scaling_metric_specification`.
     * More details can be found in the [AWS Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/plans/APIReference/API_PredefinedScalingMetricSpecification.html).
     * 
     */
    @Import(name="predefinedScalingMetricSpecification")
      private final @Nullable Output<ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecificationGetArgs> predefinedScalingMetricSpecification;

    public Output<ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecificationGetArgs> getPredefinedScalingMetricSpecification() {
        return this.predefinedScalingMetricSpecification == null ? Output.empty() : this.predefinedScalingMetricSpecification;
    }

    /**
     * The amount of time, in seconds, after a scale in activity completes before another scale in activity can start.
     * This value is not used if the scalable resource is an Auto Scaling group.
     * 
     */
    @Import(name="scaleInCooldown")
      private final @Nullable Output<Integer> scaleInCooldown;

    public Output<Integer> getScaleInCooldown() {
        return this.scaleInCooldown == null ? Output.empty() : this.scaleInCooldown;
    }

    /**
     * The amount of time, in seconds, after a scale-out activity completes before another scale-out activity can start.
     * This value is not used if the scalable resource is an Auto Scaling group.
     * 
     */
    @Import(name="scaleOutCooldown")
      private final @Nullable Output<Integer> scaleOutCooldown;

    public Output<Integer> getScaleOutCooldown() {
        return this.scaleOutCooldown == null ? Output.empty() : this.scaleOutCooldown;
    }

    /**
     * The target value for the metric.
     * 
     */
    @Import(name="targetValue", required=true)
      private final Output<Double> targetValue;

    public Output<Double> getTargetValue() {
        return this.targetValue;
    }

    public ScalingPlanScalingInstructionTargetTrackingConfigurationGetArgs(
        @Nullable Output<ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecificationGetArgs> customizedScalingMetricSpecification,
        @Nullable Output<Boolean> disableScaleIn,
        @Nullable Output<Integer> estimatedInstanceWarmup,
        @Nullable Output<ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecificationGetArgs> predefinedScalingMetricSpecification,
        @Nullable Output<Integer> scaleInCooldown,
        @Nullable Output<Integer> scaleOutCooldown,
        Output<Double> targetValue) {
        this.customizedScalingMetricSpecification = customizedScalingMetricSpecification;
        this.disableScaleIn = disableScaleIn;
        this.estimatedInstanceWarmup = estimatedInstanceWarmup;
        this.predefinedScalingMetricSpecification = predefinedScalingMetricSpecification;
        this.scaleInCooldown = scaleInCooldown;
        this.scaleOutCooldown = scaleOutCooldown;
        this.targetValue = Objects.requireNonNull(targetValue, "expected parameter 'targetValue' to be non-null");
    }

    private ScalingPlanScalingInstructionTargetTrackingConfigurationGetArgs() {
        this.customizedScalingMetricSpecification = Output.empty();
        this.disableScaleIn = Output.empty();
        this.estimatedInstanceWarmup = Output.empty();
        this.predefinedScalingMetricSpecification = Output.empty();
        this.scaleInCooldown = Output.empty();
        this.scaleOutCooldown = Output.empty();
        this.targetValue = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScalingPlanScalingInstructionTargetTrackingConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecificationGetArgs> customizedScalingMetricSpecification;
        private @Nullable Output<Boolean> disableScaleIn;
        private @Nullable Output<Integer> estimatedInstanceWarmup;
        private @Nullable Output<ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecificationGetArgs> predefinedScalingMetricSpecification;
        private @Nullable Output<Integer> scaleInCooldown;
        private @Nullable Output<Integer> scaleOutCooldown;
        private Output<Double> targetValue;

        public Builder() {
    	      // Empty
        }

        public Builder(ScalingPlanScalingInstructionTargetTrackingConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customizedScalingMetricSpecification = defaults.customizedScalingMetricSpecification;
    	      this.disableScaleIn = defaults.disableScaleIn;
    	      this.estimatedInstanceWarmup = defaults.estimatedInstanceWarmup;
    	      this.predefinedScalingMetricSpecification = defaults.predefinedScalingMetricSpecification;
    	      this.scaleInCooldown = defaults.scaleInCooldown;
    	      this.scaleOutCooldown = defaults.scaleOutCooldown;
    	      this.targetValue = defaults.targetValue;
        }

        public Builder customizedScalingMetricSpecification(@Nullable Output<ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecificationGetArgs> customizedScalingMetricSpecification) {
            this.customizedScalingMetricSpecification = customizedScalingMetricSpecification;
            return this;
        }
        public Builder customizedScalingMetricSpecification(@Nullable ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecificationGetArgs customizedScalingMetricSpecification) {
            this.customizedScalingMetricSpecification = Output.ofNullable(customizedScalingMetricSpecification);
            return this;
        }
        public Builder disableScaleIn(@Nullable Output<Boolean> disableScaleIn) {
            this.disableScaleIn = disableScaleIn;
            return this;
        }
        public Builder disableScaleIn(@Nullable Boolean disableScaleIn) {
            this.disableScaleIn = Output.ofNullable(disableScaleIn);
            return this;
        }
        public Builder estimatedInstanceWarmup(@Nullable Output<Integer> estimatedInstanceWarmup) {
            this.estimatedInstanceWarmup = estimatedInstanceWarmup;
            return this;
        }
        public Builder estimatedInstanceWarmup(@Nullable Integer estimatedInstanceWarmup) {
            this.estimatedInstanceWarmup = Output.ofNullable(estimatedInstanceWarmup);
            return this;
        }
        public Builder predefinedScalingMetricSpecification(@Nullable Output<ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecificationGetArgs> predefinedScalingMetricSpecification) {
            this.predefinedScalingMetricSpecification = predefinedScalingMetricSpecification;
            return this;
        }
        public Builder predefinedScalingMetricSpecification(@Nullable ScalingPlanScalingInstructionTargetTrackingConfigurationPredefinedScalingMetricSpecificationGetArgs predefinedScalingMetricSpecification) {
            this.predefinedScalingMetricSpecification = Output.ofNullable(predefinedScalingMetricSpecification);
            return this;
        }
        public Builder scaleInCooldown(@Nullable Output<Integer> scaleInCooldown) {
            this.scaleInCooldown = scaleInCooldown;
            return this;
        }
        public Builder scaleInCooldown(@Nullable Integer scaleInCooldown) {
            this.scaleInCooldown = Output.ofNullable(scaleInCooldown);
            return this;
        }
        public Builder scaleOutCooldown(@Nullable Output<Integer> scaleOutCooldown) {
            this.scaleOutCooldown = scaleOutCooldown;
            return this;
        }
        public Builder scaleOutCooldown(@Nullable Integer scaleOutCooldown) {
            this.scaleOutCooldown = Output.ofNullable(scaleOutCooldown);
            return this;
        }
        public Builder targetValue(Output<Double> targetValue) {
            this.targetValue = Objects.requireNonNull(targetValue);
            return this;
        }
        public Builder targetValue(Double targetValue) {
            this.targetValue = Output.of(Objects.requireNonNull(targetValue));
            return this;
        }        public ScalingPlanScalingInstructionTargetTrackingConfigurationGetArgs build() {
            return new ScalingPlanScalingInstructionTargetTrackingConfigurationGetArgs(customizedScalingMetricSpecification, disableScaleIn, estimatedInstanceWarmup, predefinedScalingMetricSpecification, scaleInCooldown, scaleOutCooldown, targetValue);
        }
    }
}