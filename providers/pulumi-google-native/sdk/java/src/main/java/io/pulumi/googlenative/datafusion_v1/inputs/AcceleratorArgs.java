// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datafusion_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.datafusion_v1.enums.AcceleratorAcceleratorType;
import io.pulumi.googlenative.datafusion_v1.enums.AcceleratorState;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Identifies Data Fusion accelerators for an instance.
 * 
 */
public final class AcceleratorArgs extends io.pulumi.resources.ResourceArgs {

    public static final AcceleratorArgs Empty = new AcceleratorArgs();

    /**
     * The type of an accelator for a CDF instance.
     * 
     */
    @Import(name="acceleratorType")
      private final @Nullable Output<AcceleratorAcceleratorType> acceleratorType;

    public Output<AcceleratorAcceleratorType> getAcceleratorType() {
        return this.acceleratorType == null ? Output.empty() : this.acceleratorType;
    }

    /**
     * The state of the accelerator
     * 
     */
    @Import(name="state")
      private final @Nullable Output<AcceleratorState> state;

    public Output<AcceleratorState> getState() {
        return this.state == null ? Output.empty() : this.state;
    }

    public AcceleratorArgs(
        @Nullable Output<AcceleratorAcceleratorType> acceleratorType,
        @Nullable Output<AcceleratorState> state) {
        this.acceleratorType = acceleratorType;
        this.state = state;
    }

    private AcceleratorArgs() {
        this.acceleratorType = Output.empty();
        this.state = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AcceleratorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AcceleratorAcceleratorType> acceleratorType;
        private @Nullable Output<AcceleratorState> state;

        public Builder() {
    	      // Empty
        }

        public Builder(AcceleratorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorType = defaults.acceleratorType;
    	      this.state = defaults.state;
        }

        public Builder acceleratorType(@Nullable Output<AcceleratorAcceleratorType> acceleratorType) {
            this.acceleratorType = acceleratorType;
            return this;
        }
        public Builder acceleratorType(@Nullable AcceleratorAcceleratorType acceleratorType) {
            this.acceleratorType = Output.ofNullable(acceleratorType);
            return this;
        }
        public Builder state(@Nullable Output<AcceleratorState> state) {
            this.state = state;
            return this;
        }
        public Builder state(@Nullable AcceleratorState state) {
            this.state = Output.ofNullable(state);
            return this;
        }        public AcceleratorArgs build() {
            return new AcceleratorArgs(acceleratorType, state);
        }
    }
}
