// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * 2D normalized coordinates. Default: `{0.0, 0.0}`
 * 
 */
public final class NormalizedCoordinateArgs extends io.pulumi.resources.ResourceArgs {

    public static final NormalizedCoordinateArgs Empty = new NormalizedCoordinateArgs();

    /**
     * Normalized x coordinate.
     * 
     */
    @Import(name="x")
      private final @Nullable Output<Double> x;

    public Output<Double> getX() {
        return this.x == null ? Output.empty() : this.x;
    }

    /**
     * Normalized y coordinate.
     * 
     */
    @Import(name="y")
      private final @Nullable Output<Double> y;

    public Output<Double> getY() {
        return this.y == null ? Output.empty() : this.y;
    }

    public NormalizedCoordinateArgs(
        @Nullable Output<Double> x,
        @Nullable Output<Double> y) {
        this.x = x;
        this.y = y;
    }

    private NormalizedCoordinateArgs() {
        this.x = Output.empty();
        this.y = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NormalizedCoordinateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Double> x;
        private @Nullable Output<Double> y;

        public Builder() {
    	      // Empty
        }

        public Builder(NormalizedCoordinateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.x = defaults.x;
    	      this.y = defaults.y;
        }

        public Builder x(@Nullable Output<Double> x) {
            this.x = x;
            return this;
        }
        public Builder x(@Nullable Double x) {
            this.x = Output.ofNullable(x);
            return this;
        }
        public Builder y(@Nullable Output<Double> y) {
            this.y = y;
            return this;
        }
        public Builder y(@Nullable Double y) {
            this.y = Output.ofNullable(y);
            return this;
        }        public NormalizedCoordinateArgs build() {
            return new NormalizedCoordinateArgs(x, y);
        }
    }
}
