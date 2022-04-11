// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SpotFleetTotalLocalStorageGBRequestArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpotFleetTotalLocalStorageGBRequestArgs Empty = new SpotFleetTotalLocalStorageGBRequestArgs();

    @Import(name="max")
      private final @Nullable Output<Double> max;

    public Output<Double> getMax() {
        return this.max == null ? Codegen.empty() : this.max;
    }

    @Import(name="min")
      private final @Nullable Output<Double> min;

    public Output<Double> getMin() {
        return this.min == null ? Codegen.empty() : this.min;
    }

    public SpotFleetTotalLocalStorageGBRequestArgs(
        @Nullable Output<Double> max,
        @Nullable Output<Double> min) {
        this.max = max;
        this.min = min;
    }

    private SpotFleetTotalLocalStorageGBRequestArgs() {
        this.max = Codegen.empty();
        this.min = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetTotalLocalStorageGBRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Double> max;
        private @Nullable Output<Double> min;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetTotalLocalStorageGBRequestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.max = defaults.max;
    	      this.min = defaults.min;
        }

        public Builder max(@Nullable Output<Double> max) {
            this.max = max;
            return this;
        }
        public Builder max(@Nullable Double max) {
            this.max = Codegen.ofNullable(max);
            return this;
        }
        public Builder min(@Nullable Output<Double> min) {
            this.min = min;
            return this;
        }
        public Builder min(@Nullable Double min) {
            this.min = Codegen.ofNullable(min);
            return this;
        }        public SpotFleetTotalLocalStorageGBRequestArgs build() {
            return new SpotFleetTotalLocalStorageGBRequestArgs(max, min);
        }
    }
}
