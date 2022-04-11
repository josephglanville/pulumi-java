// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscalingplans.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecificationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecificationGetArgs Empty = new ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecificationGetArgs();

    /**
     * The dimensions of the metric.
     * 
     */
    @Import(name="dimensions")
      private final @Nullable Output<Map<String,String>> dimensions;

    public Output<Map<String,String>> getDimensions() {
        return this.dimensions == null ? Codegen.empty() : this.dimensions;
    }

    /**
     * The name of the metric.
     * 
     */
    @Import(name="metricName", required=true)
      private final Output<String> metricName;

    public Output<String> getMetricName() {
        return this.metricName;
    }

    /**
     * The namespace of the metric.
     * 
     */
    @Import(name="namespace", required=true)
      private final Output<String> namespace;

    public Output<String> getNamespace() {
        return this.namespace;
    }

    /**
     * The statistic of the metric. Valid values: `Average`, `Maximum`, `Minimum`, `SampleCount`, `Sum`.
     * 
     */
    @Import(name="statistic", required=true)
      private final Output<String> statistic;

    public Output<String> getStatistic() {
        return this.statistic;
    }

    /**
     * The unit of the metric.
     * 
     */
    @Import(name="unit")
      private final @Nullable Output<String> unit;

    public Output<String> getUnit() {
        return this.unit == null ? Codegen.empty() : this.unit;
    }

    public ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecificationGetArgs(
        @Nullable Output<Map<String,String>> dimensions,
        Output<String> metricName,
        Output<String> namespace,
        Output<String> statistic,
        @Nullable Output<String> unit) {
        this.dimensions = dimensions;
        this.metricName = Objects.requireNonNull(metricName, "expected parameter 'metricName' to be non-null");
        this.namespace = Objects.requireNonNull(namespace, "expected parameter 'namespace' to be non-null");
        this.statistic = Objects.requireNonNull(statistic, "expected parameter 'statistic' to be non-null");
        this.unit = unit;
    }

    private ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecificationGetArgs() {
        this.dimensions = Codegen.empty();
        this.metricName = Codegen.empty();
        this.namespace = Codegen.empty();
        this.statistic = Codegen.empty();
        this.unit = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecificationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> dimensions;
        private Output<String> metricName;
        private Output<String> namespace;
        private Output<String> statistic;
        private @Nullable Output<String> unit;

        public Builder() {
    	      // Empty
        }

        public Builder(ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecificationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensions = defaults.dimensions;
    	      this.metricName = defaults.metricName;
    	      this.namespace = defaults.namespace;
    	      this.statistic = defaults.statistic;
    	      this.unit = defaults.unit;
        }

        public Builder dimensions(@Nullable Output<Map<String,String>> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public Builder dimensions(@Nullable Map<String,String> dimensions) {
            this.dimensions = Codegen.ofNullable(dimensions);
            return this;
        }
        public Builder metricName(Output<String> metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }
        public Builder metricName(String metricName) {
            this.metricName = Output.of(Objects.requireNonNull(metricName));
            return this;
        }
        public Builder namespace(Output<String> namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }
        public Builder namespace(String namespace) {
            this.namespace = Output.of(Objects.requireNonNull(namespace));
            return this;
        }
        public Builder statistic(Output<String> statistic) {
            this.statistic = Objects.requireNonNull(statistic);
            return this;
        }
        public Builder statistic(String statistic) {
            this.statistic = Output.of(Objects.requireNonNull(statistic));
            return this;
        }
        public Builder unit(@Nullable Output<String> unit) {
            this.unit = unit;
            return this;
        }
        public Builder unit(@Nullable String unit) {
            this.unit = Codegen.ofNullable(unit);
            return this;
        }        public ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecificationGetArgs build() {
            return new ScalingPlanScalingInstructionTargetTrackingConfigurationCustomizedScalingMetricSpecificationGetArgs(dimensions, metricName, namespace, statistic, unit);
        }
    }
}
