// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.transcoder_v1.inputs.H264CodecSettingsResponse;
import io.pulumi.googlenative.transcoder_v1.inputs.H265CodecSettingsResponse;
import io.pulumi.googlenative.transcoder_v1.inputs.Vp9CodecSettingsResponse;
import java.util.Objects;


/**
 * Video stream resource.
 * 
 */
public final class VideoStreamResponse extends io.pulumi.resources.InvokeArgs {

    public static final VideoStreamResponse Empty = new VideoStreamResponse();

    /**
     * H264 codec settings.
     * 
     */
    @Import(name="h264", required=true)
      private final H264CodecSettingsResponse h264;

    public H264CodecSettingsResponse getH264() {
        return this.h264;
    }

    /**
     * H265 codec settings.
     * 
     */
    @Import(name="h265", required=true)
      private final H265CodecSettingsResponse h265;

    public H265CodecSettingsResponse getH265() {
        return this.h265;
    }

    /**
     * VP9 codec settings.
     * 
     */
    @Import(name="vp9", required=true)
      private final Vp9CodecSettingsResponse vp9;

    public Vp9CodecSettingsResponse getVp9() {
        return this.vp9;
    }

    public VideoStreamResponse(
        H264CodecSettingsResponse h264,
        H265CodecSettingsResponse h265,
        Vp9CodecSettingsResponse vp9) {
        this.h264 = Objects.requireNonNull(h264, "expected parameter 'h264' to be non-null");
        this.h265 = Objects.requireNonNull(h265, "expected parameter 'h265' to be non-null");
        this.vp9 = Objects.requireNonNull(vp9, "expected parameter 'vp9' to be non-null");
    }

    private VideoStreamResponse() {
        this.h264 = null;
        this.h265 = null;
        this.vp9 = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VideoStreamResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private H264CodecSettingsResponse h264;
        private H265CodecSettingsResponse h265;
        private Vp9CodecSettingsResponse vp9;

        public Builder() {
    	      // Empty
        }

        public Builder(VideoStreamResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.h264 = defaults.h264;
    	      this.h265 = defaults.h265;
    	      this.vp9 = defaults.vp9;
        }

        public Builder h264(H264CodecSettingsResponse h264) {
            this.h264 = Objects.requireNonNull(h264);
            return this;
        }
        public Builder h265(H265CodecSettingsResponse h265) {
            this.h265 = Objects.requireNonNull(h265);
            return this;
        }
        public Builder vp9(Vp9CodecSettingsResponse vp9) {
            this.vp9 = Objects.requireNonNull(vp9);
            return this;
        }        public VideoStreamResponse build() {
            return new VideoStreamResponse(h264, h265, vp9);
        }
    }
}
