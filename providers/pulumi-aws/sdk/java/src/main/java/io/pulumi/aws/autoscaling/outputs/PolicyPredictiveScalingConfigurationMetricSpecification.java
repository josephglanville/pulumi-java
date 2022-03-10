// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling.outputs;

import io.pulumi.aws.autoscaling.outputs.PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedLoadMetricSpecification;
import io.pulumi.aws.autoscaling.outputs.PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedMetricPairSpecification;
import io.pulumi.aws.autoscaling.outputs.PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecification;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PolicyPredictiveScalingConfigurationMetricSpecification {
    /**
     * The load metric specification.
     * 
     */
    private final @Nullable PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedLoadMetricSpecification predefinedLoadMetricSpecification;
    /**
     * The metric pair specification from which Amazon EC2 Auto Scaling determines the appropriate scaling metric and load metric to use.
     * 
     */
    private final @Nullable PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedMetricPairSpecification predefinedMetricPairSpecification;
    /**
     * The scaling metric specification.
     * 
     */
    private final @Nullable PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecification predefinedScalingMetricSpecification;
    /**
     * The target value for the metric.
     * 
     */
    private final Integer targetValue;

    @OutputCustomType.Constructor
    private PolicyPredictiveScalingConfigurationMetricSpecification(
        @OutputCustomType.Parameter("predefinedLoadMetricSpecification") @Nullable PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedLoadMetricSpecification predefinedLoadMetricSpecification,
        @OutputCustomType.Parameter("predefinedMetricPairSpecification") @Nullable PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedMetricPairSpecification predefinedMetricPairSpecification,
        @OutputCustomType.Parameter("predefinedScalingMetricSpecification") @Nullable PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecification predefinedScalingMetricSpecification,
        @OutputCustomType.Parameter("targetValue") Integer targetValue) {
        this.predefinedLoadMetricSpecification = predefinedLoadMetricSpecification;
        this.predefinedMetricPairSpecification = predefinedMetricPairSpecification;
        this.predefinedScalingMetricSpecification = predefinedScalingMetricSpecification;
        this.targetValue = targetValue;
    }

    /**
     * The load metric specification.
     * 
    */
    public Optional<PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedLoadMetricSpecification> getPredefinedLoadMetricSpecification() {
        return Optional.ofNullable(this.predefinedLoadMetricSpecification);
    }
    /**
     * The metric pair specification from which Amazon EC2 Auto Scaling determines the appropriate scaling metric and load metric to use.
     * 
    */
    public Optional<PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedMetricPairSpecification> getPredefinedMetricPairSpecification() {
        return Optional.ofNullable(this.predefinedMetricPairSpecification);
    }
    /**
     * The scaling metric specification.
     * 
    */
    public Optional<PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecification> getPredefinedScalingMetricSpecification() {
        return Optional.ofNullable(this.predefinedScalingMetricSpecification);
    }
    /**
     * The target value for the metric.
     * 
    */
    public Integer getTargetValue() {
        return this.targetValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyPredictiveScalingConfigurationMetricSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedLoadMetricSpecification predefinedLoadMetricSpecification;
        private @Nullable PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedMetricPairSpecification predefinedMetricPairSpecification;
        private @Nullable PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecification predefinedScalingMetricSpecification;
        private Integer targetValue;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyPredictiveScalingConfigurationMetricSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.predefinedLoadMetricSpecification = defaults.predefinedLoadMetricSpecification;
    	      this.predefinedMetricPairSpecification = defaults.predefinedMetricPairSpecification;
    	      this.predefinedScalingMetricSpecification = defaults.predefinedScalingMetricSpecification;
    	      this.targetValue = defaults.targetValue;
        }

        public Builder setPredefinedLoadMetricSpecification(@Nullable PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedLoadMetricSpecification predefinedLoadMetricSpecification) {
            this.predefinedLoadMetricSpecification = predefinedLoadMetricSpecification;
            return this;
        }

        public Builder setPredefinedMetricPairSpecification(@Nullable PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedMetricPairSpecification predefinedMetricPairSpecification) {
            this.predefinedMetricPairSpecification = predefinedMetricPairSpecification;
            return this;
        }

        public Builder setPredefinedScalingMetricSpecification(@Nullable PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecification predefinedScalingMetricSpecification) {
            this.predefinedScalingMetricSpecification = predefinedScalingMetricSpecification;
            return this;
        }

        public Builder setTargetValue(Integer targetValue) {
            this.targetValue = Objects.requireNonNull(targetValue);
            return this;
        }
        public PolicyPredictiveScalingConfigurationMetricSpecification build() {
            return new PolicyPredictiveScalingConfigurationMetricSpecification(predefinedLoadMetricSpecification, predefinedMetricPairSpecification, predefinedScalingMetricSpecification, targetValue);
        }
    }
}
