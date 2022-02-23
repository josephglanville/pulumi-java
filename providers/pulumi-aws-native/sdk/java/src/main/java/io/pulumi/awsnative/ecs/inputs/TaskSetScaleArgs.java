// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.inputs;

import io.pulumi.awsnative.ecs.enums.TaskSetScaleUnit;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskSetScaleArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskSetScaleArgs Empty = new TaskSetScaleArgs();

    /**
     * The unit of measure for the scale value.
     * 
     */
    @InputImport(name="unit")
      private final @Nullable Input<TaskSetScaleUnit> unit;

    public Input<TaskSetScaleUnit> getUnit() {
        return this.unit == null ? Input.empty() : this.unit;
    }

    /**
     * The value, specified as a percent total of a service's desiredCount, to scale the task set. Accepted values are numbers between 0 and 100.
     * 
     */
    @InputImport(name="value")
      private final @Nullable Input<Double> value;

    public Input<Double> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public TaskSetScaleArgs(
        @Nullable Input<TaskSetScaleUnit> unit,
        @Nullable Input<Double> value) {
        this.unit = unit;
        this.value = value;
    }

    private TaskSetScaleArgs() {
        this.unit = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskSetScaleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<TaskSetScaleUnit> unit;
        private @Nullable Input<Double> value;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskSetScaleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.unit = defaults.unit;
    	      this.value = defaults.value;
        }

        public Builder setUnit(@Nullable Input<TaskSetScaleUnit> unit) {
            this.unit = unit;
            return this;
        }

        public Builder setUnit(@Nullable TaskSetScaleUnit unit) {
            this.unit = Input.ofNullable(unit);
            return this;
        }

        public Builder setValue(@Nullable Input<Double> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable Double value) {
            this.value = Input.ofNullable(value);
            return this;
        }
        public TaskSetScaleArgs build() {
            return new TaskSetScaleArgs(unit, value);
        }
    }
}
