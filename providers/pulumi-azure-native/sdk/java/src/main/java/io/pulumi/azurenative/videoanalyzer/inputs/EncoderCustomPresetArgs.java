// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.azurenative.videoanalyzer.inputs.AudioEncoderAacArgs;
import io.pulumi.azurenative.videoanalyzer.inputs.VideoEncoderH264Args;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a custom preset for encoding the input content using the encoder processor.
 * 
 */
public final class EncoderCustomPresetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EncoderCustomPresetArgs Empty = new EncoderCustomPresetArgs();

    /**
     * Describes a custom preset for encoding audio.
     * 
     */
    @Import(name="audioEncoder")
      private final @Nullable Output<AudioEncoderAacArgs> audioEncoder;

    public Output<AudioEncoderAacArgs> getAudioEncoder() {
        return this.audioEncoder == null ? Output.empty() : this.audioEncoder;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.EncoderCustomPreset'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    /**
     * Describes a custom preset for encoding video.
     * 
     */
    @Import(name="videoEncoder")
      private final @Nullable Output<VideoEncoderH264Args> videoEncoder;

    public Output<VideoEncoderH264Args> getVideoEncoder() {
        return this.videoEncoder == null ? Output.empty() : this.videoEncoder;
    }

    public EncoderCustomPresetArgs(
        @Nullable Output<AudioEncoderAacArgs> audioEncoder,
        Output<String> type,
        @Nullable Output<VideoEncoderH264Args> videoEncoder) {
        this.audioEncoder = audioEncoder;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.videoEncoder = videoEncoder;
    }

    private EncoderCustomPresetArgs() {
        this.audioEncoder = Output.empty();
        this.type = Output.empty();
        this.videoEncoder = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncoderCustomPresetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AudioEncoderAacArgs> audioEncoder;
        private Output<String> type;
        private @Nullable Output<VideoEncoderH264Args> videoEncoder;

        public Builder() {
    	      // Empty
        }

        public Builder(EncoderCustomPresetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audioEncoder = defaults.audioEncoder;
    	      this.type = defaults.type;
    	      this.videoEncoder = defaults.videoEncoder;
        }

        public Builder audioEncoder(@Nullable Output<AudioEncoderAacArgs> audioEncoder) {
            this.audioEncoder = audioEncoder;
            return this;
        }
        public Builder audioEncoder(@Nullable AudioEncoderAacArgs audioEncoder) {
            this.audioEncoder = Output.ofNullable(audioEncoder);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder videoEncoder(@Nullable Output<VideoEncoderH264Args> videoEncoder) {
            this.videoEncoder = videoEncoder;
            return this;
        }
        public Builder videoEncoder(@Nullable VideoEncoderH264Args videoEncoder) {
            this.videoEncoder = Output.ofNullable(videoEncoder);
            return this;
        }        public EncoderCustomPresetArgs build() {
            return new EncoderCustomPresetArgs(audioEncoder, type, videoEncoder);
        }
    }
}
