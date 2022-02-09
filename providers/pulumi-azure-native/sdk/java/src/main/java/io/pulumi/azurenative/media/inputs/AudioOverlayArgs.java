// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AudioOverlayArgs extends io.pulumi.resources.ResourceArgs {

    public static final AudioOverlayArgs Empty = new AudioOverlayArgs();

    @InputImport(name="audioGainLevel")
    private final @Nullable Input<Double> audioGainLevel;

    public Input<Double> getAudioGainLevel() {
        return this.audioGainLevel == null ? Input.empty() : this.audioGainLevel;
    }

    @InputImport(name="end")
    private final @Nullable Input<String> end;

    public Input<String> getEnd() {
        return this.end == null ? Input.empty() : this.end;
    }

    @InputImport(name="fadeInDuration")
    private final @Nullable Input<String> fadeInDuration;

    public Input<String> getFadeInDuration() {
        return this.fadeInDuration == null ? Input.empty() : this.fadeInDuration;
    }

    @InputImport(name="fadeOutDuration")
    private final @Nullable Input<String> fadeOutDuration;

    public Input<String> getFadeOutDuration() {
        return this.fadeOutDuration == null ? Input.empty() : this.fadeOutDuration;
    }

    @InputImport(name="inputLabel", required=true)
    private final Input<String> inputLabel;

    public Input<String> getInputLabel() {
        return this.inputLabel;
    }

    @InputImport(name="odataType", required=true)
    private final Input<String> odataType;

    public Input<String> getOdataType() {
        return this.odataType;
    }

    @InputImport(name="start")
    private final @Nullable Input<String> start;

    public Input<String> getStart() {
        return this.start == null ? Input.empty() : this.start;
    }

    public AudioOverlayArgs(
        @Nullable Input<Double> audioGainLevel,
        @Nullable Input<String> end,
        @Nullable Input<String> fadeInDuration,
        @Nullable Input<String> fadeOutDuration,
        Input<String> inputLabel,
        Input<String> odataType,
        @Nullable Input<String> start) {
        this.audioGainLevel = audioGainLevel;
        this.end = end;
        this.fadeInDuration = fadeInDuration;
        this.fadeOutDuration = fadeOutDuration;
        this.inputLabel = Objects.requireNonNull(inputLabel, "expected parameter 'inputLabel' to be non-null");
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.start = start;
    }

    private AudioOverlayArgs() {
        this.audioGainLevel = Input.empty();
        this.end = Input.empty();
        this.fadeInDuration = Input.empty();
        this.fadeOutDuration = Input.empty();
        this.inputLabel = Input.empty();
        this.odataType = Input.empty();
        this.start = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AudioOverlayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Double> audioGainLevel;
        private @Nullable Input<String> end;
        private @Nullable Input<String> fadeInDuration;
        private @Nullable Input<String> fadeOutDuration;
        private Input<String> inputLabel;
        private Input<String> odataType;
        private @Nullable Input<String> start;

        public Builder() {
    	      // Empty
        }

        public Builder(AudioOverlayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audioGainLevel = defaults.audioGainLevel;
    	      this.end = defaults.end;
    	      this.fadeInDuration = defaults.fadeInDuration;
    	      this.fadeOutDuration = defaults.fadeOutDuration;
    	      this.inputLabel = defaults.inputLabel;
    	      this.odataType = defaults.odataType;
    	      this.start = defaults.start;
        }

        public Builder setAudioGainLevel(@Nullable Input<Double> audioGainLevel) {
            this.audioGainLevel = audioGainLevel;
            return this;
        }

        public Builder setAudioGainLevel(@Nullable Double audioGainLevel) {
            this.audioGainLevel = Input.ofNullable(audioGainLevel);
            return this;
        }

        public Builder setEnd(@Nullable Input<String> end) {
            this.end = end;
            return this;
        }

        public Builder setEnd(@Nullable String end) {
            this.end = Input.ofNullable(end);
            return this;
        }

        public Builder setFadeInDuration(@Nullable Input<String> fadeInDuration) {
            this.fadeInDuration = fadeInDuration;
            return this;
        }

        public Builder setFadeInDuration(@Nullable String fadeInDuration) {
            this.fadeInDuration = Input.ofNullable(fadeInDuration);
            return this;
        }

        public Builder setFadeOutDuration(@Nullable Input<String> fadeOutDuration) {
            this.fadeOutDuration = fadeOutDuration;
            return this;
        }

        public Builder setFadeOutDuration(@Nullable String fadeOutDuration) {
            this.fadeOutDuration = Input.ofNullable(fadeOutDuration);
            return this;
        }

        public Builder setInputLabel(Input<String> inputLabel) {
            this.inputLabel = Objects.requireNonNull(inputLabel);
            return this;
        }

        public Builder setInputLabel(String inputLabel) {
            this.inputLabel = Input.of(Objects.requireNonNull(inputLabel));
            return this;
        }

        public Builder setOdataType(Input<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Input.of(Objects.requireNonNull(odataType));
            return this;
        }

        public Builder setStart(@Nullable Input<String> start) {
            this.start = start;
            return this;
        }

        public Builder setStart(@Nullable String start) {
            this.start = Input.ofNullable(start);
            return this;
        }

        public AudioOverlayArgs build() {
            return new AudioOverlayArgs(audioGainLevel, end, fadeInDuration, fadeOutDuration, inputLabel, odataType, start);
        }
    }
}
