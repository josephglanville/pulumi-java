// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.RectangleResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VideoOverlayResponse {
    private final @Nullable Double audioGainLevel;
    private final @Nullable RectangleResponse cropRectangle;
    private final @Nullable String end;
    private final @Nullable String fadeInDuration;
    private final @Nullable String fadeOutDuration;
    private final String inputLabel;
    private final String odataType;
    private final @Nullable Double opacity;
    private final @Nullable RectangleResponse position;
    private final @Nullable String start;

    @OutputCustomType.Constructor({"audioGainLevel","cropRectangle","end","fadeInDuration","fadeOutDuration","inputLabel","odataType","opacity","position","start"})
    private VideoOverlayResponse(
        @Nullable Double audioGainLevel,
        @Nullable RectangleResponse cropRectangle,
        @Nullable String end,
        @Nullable String fadeInDuration,
        @Nullable String fadeOutDuration,
        String inputLabel,
        String odataType,
        @Nullable Double opacity,
        @Nullable RectangleResponse position,
        @Nullable String start) {
        this.audioGainLevel = audioGainLevel;
        this.cropRectangle = cropRectangle;
        this.end = end;
        this.fadeInDuration = fadeInDuration;
        this.fadeOutDuration = fadeOutDuration;
        this.inputLabel = Objects.requireNonNull(inputLabel);
        this.odataType = Objects.requireNonNull(odataType);
        this.opacity = opacity;
        this.position = position;
        this.start = start;
    }

    public Optional<Double> getAudioGainLevel() {
        return Optional.ofNullable(this.audioGainLevel);
    }
    public Optional<RectangleResponse> getCropRectangle() {
        return Optional.ofNullable(this.cropRectangle);
    }
    public Optional<String> getEnd() {
        return Optional.ofNullable(this.end);
    }
    public Optional<String> getFadeInDuration() {
        return Optional.ofNullable(this.fadeInDuration);
    }
    public Optional<String> getFadeOutDuration() {
        return Optional.ofNullable(this.fadeOutDuration);
    }
    public String getInputLabel() {
        return this.inputLabel;
    }
    public String getOdataType() {
        return this.odataType;
    }
    public Optional<Double> getOpacity() {
        return Optional.ofNullable(this.opacity);
    }
    public Optional<RectangleResponse> getPosition() {
        return Optional.ofNullable(this.position);
    }
    public Optional<String> getStart() {
        return Optional.ofNullable(this.start);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VideoOverlayResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double audioGainLevel;
        private @Nullable RectangleResponse cropRectangle;
        private @Nullable String end;
        private @Nullable String fadeInDuration;
        private @Nullable String fadeOutDuration;
        private String inputLabel;
        private String odataType;
        private @Nullable Double opacity;
        private @Nullable RectangleResponse position;
        private @Nullable String start;

        public Builder() {
    	      // Empty
        }

        public Builder(VideoOverlayResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audioGainLevel = defaults.audioGainLevel;
    	      this.cropRectangle = defaults.cropRectangle;
    	      this.end = defaults.end;
    	      this.fadeInDuration = defaults.fadeInDuration;
    	      this.fadeOutDuration = defaults.fadeOutDuration;
    	      this.inputLabel = defaults.inputLabel;
    	      this.odataType = defaults.odataType;
    	      this.opacity = defaults.opacity;
    	      this.position = defaults.position;
    	      this.start = defaults.start;
        }

        public Builder setAudioGainLevel(@Nullable Double audioGainLevel) {
            this.audioGainLevel = audioGainLevel;
            return this;
        }

        public Builder setCropRectangle(@Nullable RectangleResponse cropRectangle) {
            this.cropRectangle = cropRectangle;
            return this;
        }

        public Builder setEnd(@Nullable String end) {
            this.end = end;
            return this;
        }

        public Builder setFadeInDuration(@Nullable String fadeInDuration) {
            this.fadeInDuration = fadeInDuration;
            return this;
        }

        public Builder setFadeOutDuration(@Nullable String fadeOutDuration) {
            this.fadeOutDuration = fadeOutDuration;
            return this;
        }

        public Builder setInputLabel(String inputLabel) {
            this.inputLabel = Objects.requireNonNull(inputLabel);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setOpacity(@Nullable Double opacity) {
            this.opacity = opacity;
            return this;
        }

        public Builder setPosition(@Nullable RectangleResponse position) {
            this.position = position;
            return this;
        }

        public Builder setStart(@Nullable String start) {
            this.start = start;
            return this;
        }

        public VideoOverlayResponse build() {
            return new VideoOverlayResponse(audioGainLevel, cropRectangle, end, fadeInDuration, fadeOutDuration, inputLabel, odataType, opacity, position, start);
        }
    }
}
