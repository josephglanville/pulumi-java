// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.transcoder_v1.inputs.NormalizedCoordinateArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Display static overlay object.
 * 
 */
public final class AnimationStaticArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnimationStaticArgs Empty = new AnimationStaticArgs();

    /**
     * The time to start displaying the overlay object, in seconds. Default: 0
     * 
     */
    @InputImport(name="startTimeOffset")
      private final @Nullable Output<String> startTimeOffset;

    public Output<String> getStartTimeOffset() {
        return this.startTimeOffset == null ? Output.empty() : this.startTimeOffset;
    }

    /**
     * Normalized coordinates based on output video resolution. Valid values: `0.0`–`1.0`. `xy` is the upper-left coordinate of the overlay object. For example, use the x and y coordinates {0,0} to position the top-left corner of the overlay animation in the top-left corner of the output video.
     * 
     */
    @InputImport(name="xy")
      private final @Nullable Output<NormalizedCoordinateArgs> xy;

    public Output<NormalizedCoordinateArgs> getXy() {
        return this.xy == null ? Output.empty() : this.xy;
    }

    public AnimationStaticArgs(
        @Nullable Output<String> startTimeOffset,
        @Nullable Output<NormalizedCoordinateArgs> xy) {
        this.startTimeOffset = startTimeOffset;
        this.xy = xy;
    }

    private AnimationStaticArgs() {
        this.startTimeOffset = Output.empty();
        this.xy = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnimationStaticArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> startTimeOffset;
        private @Nullable Output<NormalizedCoordinateArgs> xy;

        public Builder() {
    	      // Empty
        }

        public Builder(AnimationStaticArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.startTimeOffset = defaults.startTimeOffset;
    	      this.xy = defaults.xy;
        }

        public Builder startTimeOffset(@Nullable Output<String> startTimeOffset) {
            this.startTimeOffset = startTimeOffset;
            return this;
        }

        public Builder startTimeOffset(@Nullable String startTimeOffset) {
            this.startTimeOffset = Output.ofNullable(startTimeOffset);
            return this;
        }

        public Builder xy(@Nullable Output<NormalizedCoordinateArgs> xy) {
            this.xy = xy;
            return this;
        }

        public Builder xy(@Nullable NormalizedCoordinateArgs xy) {
            this.xy = Output.ofNullable(xy);
            return this;
        }
        public AnimationStaticArgs build() {
            return new AnimationStaticArgs(startTimeOffset, xy);
        }
    }
}
