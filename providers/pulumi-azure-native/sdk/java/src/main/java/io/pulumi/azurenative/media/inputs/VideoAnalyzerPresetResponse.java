// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VideoAnalyzerPresetResponse extends io.pulumi.resources.InvokeArgs {

    public static final VideoAnalyzerPresetResponse Empty = new VideoAnalyzerPresetResponse();

    @InputImport(name="audioLanguage")
    private final @Nullable String audioLanguage;

    public Optional<String> getAudioLanguage() {
        return this.audioLanguage == null ? Optional.empty() : Optional.ofNullable(this.audioLanguage);
    }

    @InputImport(name="experimentalOptions")
    private final @Nullable Map<String,String> experimentalOptions;

    public Map<String,String> getExperimentalOptions() {
        return this.experimentalOptions == null ? Map.of() : this.experimentalOptions;
    }

    @InputImport(name="insightsToExtract")
    private final @Nullable String insightsToExtract;

    public Optional<String> getInsightsToExtract() {
        return this.insightsToExtract == null ? Optional.empty() : Optional.ofNullable(this.insightsToExtract);
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

    public VideoAnalyzerPresetResponse(
        @Nullable String audioLanguage,
        @Nullable Map<String,String> experimentalOptions,
        @Nullable String insightsToExtract,
        @Nullable String mode,
        String odataType) {
        this.audioLanguage = audioLanguage;
        this.experimentalOptions = experimentalOptions;
        this.insightsToExtract = insightsToExtract;
        this.mode = mode;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private VideoAnalyzerPresetResponse() {
        this.audioLanguage = null;
        this.experimentalOptions = Map.of();
        this.insightsToExtract = null;
        this.mode = null;
        this.odataType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VideoAnalyzerPresetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String audioLanguage;
        private @Nullable Map<String,String> experimentalOptions;
        private @Nullable String insightsToExtract;
        private @Nullable String mode;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(VideoAnalyzerPresetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audioLanguage = defaults.audioLanguage;
    	      this.experimentalOptions = defaults.experimentalOptions;
    	      this.insightsToExtract = defaults.insightsToExtract;
    	      this.mode = defaults.mode;
    	      this.odataType = defaults.odataType;
        }

        public Builder setAudioLanguage(@Nullable String audioLanguage) {
            this.audioLanguage = audioLanguage;
            return this;
        }

        public Builder setExperimentalOptions(@Nullable Map<String,String> experimentalOptions) {
            this.experimentalOptions = experimentalOptions;
            return this;
        }

        public Builder setInsightsToExtract(@Nullable String insightsToExtract) {
            this.insightsToExtract = insightsToExtract;
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

        public VideoAnalyzerPresetResponse build() {
            return new VideoAnalyzerPresetResponse(audioLanguage, experimentalOptions, insightsToExtract, mode, odataType);
        }
    }
}
