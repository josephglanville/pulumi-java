// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.outputs;

import io.pulumi.azurenative.videoanalyzer.outputs.AudioEncoderAacResponse;
import io.pulumi.azurenative.videoanalyzer.outputs.VideoEncoderH264Response;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EncoderCustomPresetResponse {
    private final @Nullable AudioEncoderAacResponse audioEncoder;
    private final String type;
    private final @Nullable VideoEncoderH264Response videoEncoder;

    @OutputCustomType.Constructor({"audioEncoder","type","videoEncoder"})
    private EncoderCustomPresetResponse(
        @Nullable AudioEncoderAacResponse audioEncoder,
        String type,
        @Nullable VideoEncoderH264Response videoEncoder) {
        this.audioEncoder = audioEncoder;
        this.type = Objects.requireNonNull(type);
        this.videoEncoder = videoEncoder;
    }

    public Optional<AudioEncoderAacResponse> getAudioEncoder() {
        return Optional.ofNullable(this.audioEncoder);
    }
    public String getType() {
        return this.type;
    }
    public Optional<VideoEncoderH264Response> getVideoEncoder() {
        return Optional.ofNullable(this.videoEncoder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncoderCustomPresetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AudioEncoderAacResponse audioEncoder;
        private String type;
        private @Nullable VideoEncoderH264Response videoEncoder;

        public Builder() {
    	      // Empty
        }

        public Builder(EncoderCustomPresetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audioEncoder = defaults.audioEncoder;
    	      this.type = defaults.type;
    	      this.videoEncoder = defaults.videoEncoder;
        }

        public Builder setAudioEncoder(@Nullable AudioEncoderAacResponse audioEncoder) {
            this.audioEncoder = audioEncoder;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVideoEncoder(@Nullable VideoEncoderH264Response videoEncoder) {
            this.videoEncoder = videoEncoder;
            return this;
        }

        public EncoderCustomPresetResponse build() {
            return new EncoderCustomPresetResponse(audioEncoder, type, videoEncoder);
        }
    }
}
