// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FaceDetectorPresetResponse extends io.pulumi.resources.InvokeArgs {

    public static final FaceDetectorPresetResponse Empty = new FaceDetectorPresetResponse();

    @InputImport(name="blurType")
    private final @Nullable String blurType;

    public Optional<String> getBlurType() {
        return this.blurType == null ? Optional.empty() : Optional.ofNullable(this.blurType);
    }

    @InputImport(name="experimentalOptions")
    private final @Nullable Map<String,String> experimentalOptions;

    public Map<String,String> getExperimentalOptions() {
        return this.experimentalOptions == null ? Map.of() : this.experimentalOptions;
    }

    @InputImport(name="mode")
    private final @Nullable String mode;

    public Optional<String> getMode() {
        return this.mode == null ? Optional.empty() : Optional.ofNullable(this.mode);
    }

    @InputImport(name="odataType", required=true)
    private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    @InputImport(name="resolution")
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