// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elastictranscoder.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PresetVideoGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PresetVideoGetArgs Empty = new PresetVideoGetArgs();

    /**
     * The display aspect ratio of the video in the output file. Valid values are: `auto`, `1:1`, `4:3`, `3:2`, `16:9`. (Note; to better control resolution and aspect ratio of output videos, we recommend that you use the values `max_width`, `max_height`, `sizing_policy`, `padding_policy`, and `display_aspect_ratio` instead of `resolution` and `aspect_ratio`.)
     * 
     */
    @InputImport(name="aspectRatio")
      private final @Nullable Output<String> aspectRatio;

    public Output<String> getAspectRatio() {
        return this.aspectRatio == null ? Output.empty() : this.aspectRatio;
    }

    /**
     * The bit rate of the video stream in the output file, in kilobits/second. You can configure variable bit rate or constant bit rate encoding.
     * 
     */
    @InputImport(name="bitRate")
      private final @Nullable Output<String> bitRate;

    public Output<String> getBitRate() {
        return this.bitRate == null ? Output.empty() : this.bitRate;
    }

    /**
     * The video codec for the output file. Valid values are `gif`, `H.264`, `mpeg2`, `vp8`, and `vp9`.
     * 
     */
    @InputImport(name="codec")
      private final @Nullable Output<String> codec;

    public Output<String> getCodec() {
        return this.codec == null ? Output.empty() : this.codec;
    }

    /**
     * The value that Elastic Transcoder adds to the metadata in the output file. If you set DisplayAspectRatio to auto, Elastic Transcoder chooses an aspect ratio that ensures square pixels. If you specify another option, Elastic Transcoder sets that value in the output file.
     * 
     */
    @InputImport(name="displayAspectRatio")
      private final @Nullable Output<String> displayAspectRatio;

    public Output<String> getDisplayAspectRatio() {
        return this.displayAspectRatio == null ? Output.empty() : this.displayAspectRatio;
    }

    /**
     * Whether to use a fixed value for Video:FixedGOP. Not applicable for containers of type gif. Valid values are true and false. Also known as, Fixed Number of Frames Between Keyframes.
     * 
     */
    @InputImport(name="fixedGop")
      private final @Nullable Output<String> fixedGop;

    public Output<String> getFixedGop() {
        return this.fixedGop == null ? Output.empty() : this.fixedGop;
    }

    /**
     * The frames per second for the video stream in the output file. The following values are valid: `auto`, `10`, `15`, `23.97`, `24`, `25`, `29.97`, `30`, `50`, `60`.
     * 
     */
    @InputImport(name="frameRate")
      private final @Nullable Output<String> frameRate;

    public Output<String> getFrameRate() {
        return this.frameRate == null ? Output.empty() : this.frameRate;
    }

    /**
     * The maximum number of frames between key frames. Not applicable for containers of type gif.
     * 
     */
    @InputImport(name="keyframesMaxDist")
      private final @Nullable Output<String> keyframesMaxDist;

    public Output<String> getKeyframesMaxDist() {
        return this.keyframesMaxDist == null ? Output.empty() : this.keyframesMaxDist;
    }

    /**
     * If you specify auto for FrameRate, Elastic Transcoder uses the frame rate of the input video for the frame rate of the output video, up to the maximum frame rate. If you do not specify a MaxFrameRate, Elastic Transcoder will use a default of 30.
     * 
     */
    @InputImport(name="maxFrameRate")
      private final @Nullable Output<String> maxFrameRate;

    public Output<String> getMaxFrameRate() {
        return this.maxFrameRate == null ? Output.empty() : this.maxFrameRate;
    }

    /**
     * The maximum height of the output video in pixels. If you specify auto, Elastic Transcoder uses 1080 (Full HD) as the default value. If you specify a numeric value, enter an even integer between 96 and 3072, inclusive.
     * 
     */
    @InputImport(name="maxHeight")
      private final @Nullable Output<String> maxHeight;

    public Output<String> getMaxHeight() {
        return this.maxHeight == null ? Output.empty() : this.maxHeight;
    }

    /**
     * The maximum width of the output video in pixels. If you specify auto, Elastic Transcoder uses 1920 (Full HD) as the default value. If you specify a numeric value, enter an even integer between 128 and 4096, inclusive.
     * 
     */
    @InputImport(name="maxWidth")
      private final @Nullable Output<String> maxWidth;

    public Output<String> getMaxWidth() {
        return this.maxWidth == null ? Output.empty() : this.maxWidth;
    }

    /**
     * When you set PaddingPolicy to Pad, Elastic Transcoder might add black bars to the top and bottom and/or left and right sides of the output video to make the total size of the output video match the values that you specified for `max_width` and `max_height`.
     * 
     */
    @InputImport(name="paddingPolicy")
      private final @Nullable Output<String> paddingPolicy;

    public Output<String> getPaddingPolicy() {
        return this.paddingPolicy == null ? Output.empty() : this.paddingPolicy;
    }

    /**
     * The width and height of the video in the output file, in pixels. Valid values are `auto` and `widthxheight`. (see note for `aspect_ratio`)
     * 
     */
    @InputImport(name="resolution")
      private final @Nullable Output<String> resolution;

    public Output<String> getResolution() {
        return this.resolution == null ? Output.empty() : this.resolution;
    }

    /**
     * A value that controls scaling of the output video. Valid values are: `Fit`, `Fill`, `Stretch`, `Keep`, `ShrinkToFit`, `ShrinkToFill`.
     * 
     */
    @InputImport(name="sizingPolicy")
      private final @Nullable Output<String> sizingPolicy;

    public Output<String> getSizingPolicy() {
        return this.sizingPolicy == null ? Output.empty() : this.sizingPolicy;
    }

    public PresetVideoGetArgs(
        @Nullable Output<String> aspectRatio,
        @Nullable Output<String> bitRate,
        @Nullable Output<String> codec,
        @Nullable Output<String> displayAspectRatio,
        @Nullable Output<String> fixedGop,
        @Nullable Output<String> frameRate,
        @Nullable Output<String> keyframesMaxDist,
        @Nullable Output<String> maxFrameRate,
        @Nullable Output<String> maxHeight,
        @Nullable Output<String> maxWidth,
        @Nullable Output<String> paddingPolicy,
        @Nullable Output<String> resolution,
        @Nullable Output<String> sizingPolicy) {
        this.aspectRatio = aspectRatio;
        this.bitRate = bitRate;
        this.codec = codec;
        this.displayAspectRatio = displayAspectRatio;
        this.fixedGop = fixedGop;
        this.frameRate = frameRate;
        this.keyframesMaxDist = keyframesMaxDist;
        this.maxFrameRate = maxFrameRate;
        this.maxHeight = maxHeight;
        this.maxWidth = maxWidth;
        this.paddingPolicy = paddingPolicy;
        this.resolution = resolution;
        this.sizingPolicy = sizingPolicy;
    }

    private PresetVideoGetArgs() {
        this.aspectRatio = Output.empty();
        this.bitRate = Output.empty();
        this.codec = Output.empty();
        this.displayAspectRatio = Output.empty();
        this.fixedGop = Output.empty();
        this.frameRate = Output.empty();
        this.keyframesMaxDist = Output.empty();
        this.maxFrameRate = Output.empty();
        this.maxHeight = Output.empty();
        this.maxWidth = Output.empty();
        this.paddingPolicy = Output.empty();
        this.resolution = Output.empty();
        this.sizingPolicy = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PresetVideoGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> aspectRatio;
        private @Nullable Output<String> bitRate;
        private @Nullable Output<String> codec;
        private @Nullable Output<String> displayAspectRatio;
        private @Nullable Output<String> fixedGop;
        private @Nullable Output<String> frameRate;
        private @Nullable Output<String> keyframesMaxDist;
        private @Nullable Output<String> maxFrameRate;
        private @Nullable Output<String> maxHeight;
        private @Nullable Output<String> maxWidth;
        private @Nullable Output<String> paddingPolicy;
        private @Nullable Output<String> resolution;
        private @Nullable Output<String> sizingPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(PresetVideoGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aspectRatio = defaults.aspectRatio;
    	      this.bitRate = defaults.bitRate;
    	      this.codec = defaults.codec;
    	      this.displayAspectRatio = defaults.displayAspectRatio;
    	      this.fixedGop = defaults.fixedGop;
    	      this.frameRate = defaults.frameRate;
    	      this.keyframesMaxDist = defaults.keyframesMaxDist;
    	      this.maxFrameRate = defaults.maxFrameRate;
    	      this.maxHeight = defaults.maxHeight;
    	      this.maxWidth = defaults.maxWidth;
    	      this.paddingPolicy = defaults.paddingPolicy;
    	      this.resolution = defaults.resolution;
    	      this.sizingPolicy = defaults.sizingPolicy;
        }

        public Builder aspectRatio(@Nullable Output<String> aspectRatio) {
            this.aspectRatio = aspectRatio;
            return this;
        }

        public Builder aspectRatio(@Nullable String aspectRatio) {
            this.aspectRatio = Output.ofNullable(aspectRatio);
            return this;
        }

        public Builder bitRate(@Nullable Output<String> bitRate) {
            this.bitRate = bitRate;
            return this;
        }

        public Builder bitRate(@Nullable String bitRate) {
            this.bitRate = Output.ofNullable(bitRate);
            return this;
        }

        public Builder codec(@Nullable Output<String> codec) {
            this.codec = codec;
            return this;
        }

        public Builder codec(@Nullable String codec) {
            this.codec = Output.ofNullable(codec);
            return this;
        }

        public Builder displayAspectRatio(@Nullable Output<String> displayAspectRatio) {
            this.displayAspectRatio = displayAspectRatio;
            return this;
        }

        public Builder displayAspectRatio(@Nullable String displayAspectRatio) {
            this.displayAspectRatio = Output.ofNullable(displayAspectRatio);
            return this;
        }

        public Builder fixedGop(@Nullable Output<String> fixedGop) {
            this.fixedGop = fixedGop;
            return this;
        }

        public Builder fixedGop(@Nullable String fixedGop) {
            this.fixedGop = Output.ofNullable(fixedGop);
            return this;
        }

        public Builder frameRate(@Nullable Output<String> frameRate) {
            this.frameRate = frameRate;
            return this;
        }

        public Builder frameRate(@Nullable String frameRate) {
            this.frameRate = Output.ofNullable(frameRate);
            return this;
        }

        public Builder keyframesMaxDist(@Nullable Output<String> keyframesMaxDist) {
            this.keyframesMaxDist = keyframesMaxDist;
            return this;
        }

        public Builder keyframesMaxDist(@Nullable String keyframesMaxDist) {
            this.keyframesMaxDist = Output.ofNullable(keyframesMaxDist);
            return this;
        }

        public Builder maxFrameRate(@Nullable Output<String> maxFrameRate) {
            this.maxFrameRate = maxFrameRate;
            return this;
        }

        public Builder maxFrameRate(@Nullable String maxFrameRate) {
            this.maxFrameRate = Output.ofNullable(maxFrameRate);
            return this;
        }

        public Builder maxHeight(@Nullable Output<String> maxHeight) {
            this.maxHeight = maxHeight;
            return this;
        }

        public Builder maxHeight(@Nullable String maxHeight) {
            this.maxHeight = Output.ofNullable(maxHeight);
            return this;
        }

        public Builder maxWidth(@Nullable Output<String> maxWidth) {
            this.maxWidth = maxWidth;
            return this;
        }

        public Builder maxWidth(@Nullable String maxWidth) {
            this.maxWidth = Output.ofNullable(maxWidth);
            return this;
        }

        public Builder paddingPolicy(@Nullable Output<String> paddingPolicy) {
            this.paddingPolicy = paddingPolicy;
            return this;
        }

        public Builder paddingPolicy(@Nullable String paddingPolicy) {
            this.paddingPolicy = Output.ofNullable(paddingPolicy);
            return this;
        }

        public Builder resolution(@Nullable Output<String> resolution) {
            this.resolution = resolution;
            return this;
        }

        public Builder resolution(@Nullable String resolution) {
            this.resolution = Output.ofNullable(resolution);
            return this;
        }

        public Builder sizingPolicy(@Nullable Output<String> sizingPolicy) {
            this.sizingPolicy = sizingPolicy;
            return this;
        }

        public Builder sizingPolicy(@Nullable String sizingPolicy) {
            this.sizingPolicy = Output.ofNullable(sizingPolicy);
            return this;
        }
        public PresetVideoGetArgs build() {
            return new PresetVideoGetArgs(aspectRatio, bitRate, codec, displayAspectRatio, fixedGop, frameRate, keyframesMaxDist, maxFrameRate, maxHeight, maxWidth, paddingPolicy, resolution, sizingPolicy);
        }
    }
}
