// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.monitoring_v1.enums.ThresholdColor;
import io.pulumi.googlenative.monitoring_v1.enums.ThresholdDirection;
import io.pulumi.googlenative.monitoring_v1.enums.ThresholdTargetAxis;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines a threshold for categorizing time series values.
 * 
 */
public final class ThresholdArgs extends io.pulumi.resources.ResourceArgs {

    public static final ThresholdArgs Empty = new ThresholdArgs();

    /**
     * The state color for this threshold. Color is not allowed in a XyChart.
     * 
     */
    @Import(name="color")
      private final @Nullable Output<ThresholdColor> color;

    public Output<ThresholdColor> getColor() {
        return this.color == null ? Codegen.empty() : this.color;
    }

    /**
     * The direction for the current threshold. Direction is not allowed in a XyChart.
     * 
     */
    @Import(name="direction")
      private final @Nullable Output<ThresholdDirection> direction;

    public Output<ThresholdDirection> getDirection() {
        return this.direction == null ? Codegen.empty() : this.direction;
    }

    /**
     * A label for the threshold.
     * 
     */
    @Import(name="label")
      private final @Nullable Output<String> label;

    public Output<String> getLabel() {
        return this.label == null ? Codegen.empty() : this.label;
    }

    /**
     * The target axis to use for plotting the threshold. Target axis is not allowed in a Scorecard.
     * 
     */
    @Import(name="targetAxis")
      private final @Nullable Output<ThresholdTargetAxis> targetAxis;

    public Output<ThresholdTargetAxis> getTargetAxis() {
        return this.targetAxis == null ? Codegen.empty() : this.targetAxis;
    }

    /**
     * The value of the threshold. The value should be defined in the native scale of the metric.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<Double> value;

    public Output<Double> getValue() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    public ThresholdArgs(
        @Nullable Output<ThresholdColor> color,
        @Nullable Output<ThresholdDirection> direction,
        @Nullable Output<String> label,
        @Nullable Output<ThresholdTargetAxis> targetAxis,
        @Nullable Output<Double> value) {
        this.color = color;
        this.direction = direction;
        this.label = label;
        this.targetAxis = targetAxis;
        this.value = value;
    }

    private ThresholdArgs() {
        this.color = Codegen.empty();
        this.direction = Codegen.empty();
        this.label = Codegen.empty();
        this.targetAxis = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThresholdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ThresholdColor> color;
        private @Nullable Output<ThresholdDirection> direction;
        private @Nullable Output<String> label;
        private @Nullable Output<ThresholdTargetAxis> targetAxis;
        private @Nullable Output<Double> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ThresholdArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.color = defaults.color;
    	      this.direction = defaults.direction;
    	      this.label = defaults.label;
    	      this.targetAxis = defaults.targetAxis;
    	      this.value = defaults.value;
        }

        public Builder color(@Nullable Output<ThresholdColor> color) {
            this.color = color;
            return this;
        }
        public Builder color(@Nullable ThresholdColor color) {
            this.color = Codegen.ofNullable(color);
            return this;
        }
        public Builder direction(@Nullable Output<ThresholdDirection> direction) {
            this.direction = direction;
            return this;
        }
        public Builder direction(@Nullable ThresholdDirection direction) {
            this.direction = Codegen.ofNullable(direction);
            return this;
        }
        public Builder label(@Nullable Output<String> label) {
            this.label = label;
            return this;
        }
        public Builder label(@Nullable String label) {
            this.label = Codegen.ofNullable(label);
            return this;
        }
        public Builder targetAxis(@Nullable Output<ThresholdTargetAxis> targetAxis) {
            this.targetAxis = targetAxis;
            return this;
        }
        public Builder targetAxis(@Nullable ThresholdTargetAxis targetAxis) {
            this.targetAxis = Codegen.ofNullable(targetAxis);
            return this;
        }
        public Builder value(@Nullable Output<Double> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable Double value) {
            this.value = Codegen.ofNullable(value);
            return this;
        }        public ThresholdArgs build() {
            return new ThresholdArgs(color, direction, label, targetAxis, value);
        }
    }
}
