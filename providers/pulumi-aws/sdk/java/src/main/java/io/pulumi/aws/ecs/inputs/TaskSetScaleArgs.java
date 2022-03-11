// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskSetScaleArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskSetScaleArgs Empty = new TaskSetScaleArgs();

    /**
     * The unit of measure for the scale value. Default: `PERCENT`.
     * 
     */
    @InputImport(name="unit")
      private final @Nullable Output<String> unit;

    public Output<String> getUnit() {
        return this.unit == null ? Output.empty() : this.unit;
    }

    /**
     * The value, specified as a percent total of a service's `desiredCount`, to scale the task set. Defaults to `0` if not specified. Accepted values are numbers between 0.0 and 100.0.
     * 
     */
    @InputImport(name="value")
      private final @Nullable Output<Double> value;

    public Output<Double> getValue() {
        return this.value == null ? Output.empty() : this.value;
    }

    public TaskSetScaleArgs(
        @Nullable Output<String> unit,
        @Nullable Output<Double> value) {
        this.unit = unit;
        this.value = value;
    }

    private TaskSetScaleArgs() {
        this.unit = Output.empty();
        this.value = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskSetScaleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> unit;
        private @Nullable Output<Double> value;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskSetScaleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.unit = defaults.unit;
    	      this.value = defaults.value;
        }

        public Builder unit(@Nullable Output<String> unit) {
            this.unit = unit;
            return this;
        }

        public Builder unit(@Nullable String unit) {
            this.unit = Output.ofNullable(unit);
            return this;
        }

        public Builder value(@Nullable Output<Double> value) {
            this.value = value;
            return this;
        }

        public Builder value(@Nullable Double value) {
            this.value = Output.ofNullable(value);
            return this;
        }
        public TaskSetScaleArgs build() {
            return new TaskSetScaleArgs(unit, value);
        }
    }
}
