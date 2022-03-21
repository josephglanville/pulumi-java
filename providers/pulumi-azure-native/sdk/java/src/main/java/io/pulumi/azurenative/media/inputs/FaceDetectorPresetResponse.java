// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes all the settings to be used when analyzing a video in order to detect (and optionally redact) all the faces present.
 * 
 */
public final class FaceDetectorPresetResponse extends io.pulumi.resources.InvokeArgs {

    public static final FaceDetectorPresetResponse Empty = new FaceDetectorPresetResponse();

    /**
     * Blur type
     * 
     */
    @Import(name="blurType")
      private final @Nullable String blurType;

    public Optional<String> getBlurType() {
        return this.blurType == null ? Optional.empty() : Optional.ofNullable(this.blurType);
    }

    /**
     * Dictionary containing key value pairs for parameters not exposed in the preset itself
     * 
     */
    @Import(name="experimentalOptions")
      private final @Nullable Map<String,String> experimentalOptions;

    public Map<String,String> getExperimentalOptions() {
        return this.experimentalOptions == null ? Map.of() : this.experimentalOptions;
    }

    /**
     * This mode provides the ability to choose between the following settings: 1) Analyze - For detection only.This mode generates a metadata JSON file marking appearances of faces throughout the video.Where possible, appearances of the same person are assigned the same ID. 2) Combined - Additionally redacts(blurs) detected faces. 3) Redact - This enables a 2-pass process, allowing for selective redaction of a subset of detected faces.It takes in the metadata file from a prior analyze pass, along with the source video, and a user-selected subset of IDs that require redaction.
     * 
     */
    @Import(name="mode")
      private final @Nullable String mode;

    public Optional<String> getMode() {
        return this.mode == null ? Optional.empty() : Optional.ofNullable(this.mode);
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.FaceDetectorPreset'.
     * 
     */
    @Import(name="odataType", required=true)
      private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    /**
     * Specifies the maximum resolution at which your video is analyzed. The default behavior is "SourceResolution," which will keep the input video at its original resolution when analyzed. Using "StandardDefinition" will resize input videos to standard definition while preserving the appropriate aspect ratio. It will only resize if the video is of higher resolution. For example, a 1920x1080 input would be scaled to 640x360 before processing. Switching to "StandardDefinition" will reduce the time it takes to process high resolution video. It may also reduce the cost of using this component (see https://azure.microsoft.com/en-us/pricing/details/media-services/#analytics for details). However, faces that end up being too small in the resized video may not be detected.
     * 
     */
    @Import(name="resolution")
      private final @Nullable String resolution;

    public Optional<String> getResolution() {
        return this.resolution == null ? Optional.empty() : Optional.ofNullable(this.resolution);
    }

    public FaceDetectorPresetResponse(
        @Nullable String blurType,
        @Nullable Map<String,String> experimentalOptions,
        @Nullable String mode,
        String odataType,
        @Nullable String resolution) {
        this.blurType = blurType;
        this.experimentalOptions = experimentalOptions;
        this.mode = mode;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.resolution = resolution;
    }

    private FaceDetectorPresetResponse() {
        this.blurType = null;
        this.experimentalOptions = Map.of();
        this.mode = null;
        this.odataType = null;
        this.resolution = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FaceDetectorPresetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String blurType;
        private @Nullable Map<String,String> experimentalOptions;
        private @Nullable String mode;
        private String odataType;
        private @Nullable String resolution;

        public Builder() {
    	      // Empty
        }

        public Builder(FaceDetectorPresetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blurType = defaults.blurType;
    	      this.experimentalOptions = defaults.experimentalOptions;
    	      this.mode = defaults.mode;
    	      this.odataType = defaults.odataType;
    	      this.resolution = defaults.resolution;
        }

        public Builder blurType(@Nullable String blurType) {
            this.blurType = blurType;
            return this;
        }
        public Builder experimentalOptions(@Nullable Map<String,String> experimentalOptions) {
            this.experimentalOptions = experimentalOptions;
            return this;
        }
        public Builder mode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder resolution(@Nullable String resolution) {
            this.resolution = resolution;
            return this;
        }        public FaceDetectorPresetResponse build() {
            return new FaceDetectorPresetResponse(blurType, experimentalOptions, mode, odataType, resolution);
        }
    }
}
