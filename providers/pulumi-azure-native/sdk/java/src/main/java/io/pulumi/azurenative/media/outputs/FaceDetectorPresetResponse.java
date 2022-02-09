// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FaceDetectorPresetResponse {
    private final @Nullable String blurType;
    private final @Nullable Map<String,String> experimentalOptions;
    private final @Nullable String mode;
    private final String odataType;
    private final @Nullable String resolution;

    @OutputCustomType.Constructor({"blurType","experimentalOptions","mode","odataType","resolution"})
    private FaceDetectorPresetResponse(
        @Nullable String blurType,
        @Nullable Map<String,String> experimentalOptions,
        @Nullable String mode,
        String odataType,
        @Nullable String resolution) {
        this.blurType = blurType;
        this.experimentalOptions = experimentalOptions;
        this.mode = mode;
        this.odataType = Objects.requireNonNull(odataType);
        this.resolution = resolution;
    }

    public Optional<String> getBlurType() {
        return Optional.ofNullable(this.blurType);
    }
    public Map<String,String> getExperimentalOptions() {
        return this.experimentalOptions == null ? Map.of() : this.experimentalOptions;
    }
    public Optional<String> getMode() {
        return Optional.ofNullable(this.mode);
    }
    public String getOdataType() {
        return this.odataType;
    }
    public Optional<String> getResolution() {
        return Optional.ofNullable(this.resolution);
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

        public Builder setBlurType(@Nullable String blurType) {
            this.blurType = blurType;
            return this;
        }

        public Builder setExperimentalOptions(@Nullable Map<String,String> experimentalOptions) {
            this.experimentalOptions = experimentalOptions;
            return this;
        }

        public Builder setMode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setResolution(@Nullable String resolution) {
            this.resolution = resolution;
            return this;
        }

        public FaceDetectorPresetResponse build() {
            return new FaceDetectorPresetResponse(blurType, experimentalOptions, mode, odataType, resolution);
        }
    }
}
