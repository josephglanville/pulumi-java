// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.H264LayerResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class H264VideoResponse extends io.pulumi.resources.InvokeArgs {

    public static final H264VideoResponse Empty = new H264VideoResponse();

    @InputImport(name="complexity")
    private final @Nullable String complexity;

    public Optional<String> getComplexity() {
        return this.complexity == null ? Optional.empty() : Optional.ofNullable(this.complexity);
    }

    @InputImport(name="keyFrameInterval")
    private final @Nullable String keyFrameInterval;

    public Optional<String> getKeyFrameInterval() {
        return this.keyFrameInterval == null ? Optional.empty() : Optional.ofNullable(this.keyFrameInterval);
    }

    @InputImport(name="label")
    private final @Nullable String label;

    public Optional<String> getLabel() {
        return this.label == null ? Optional.empty() : Optional.ofNullable(this.label);
    }

    @InputImport(name="layers")
    private final @Nullable List<H264LayerResponse> layers;

    public List<H264LayerResponse> getLayers() {
        return this.layers == null ? List.of() : this.layers;
    }

    @InputImport(name="odataType", required=true)
    private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    @InputImport(name="sceneChangeDetection")
    private final @Nullable Boolean sceneChangeDetection;

    public Optional<Boolean> getSceneChangeDetection() {
        return this.sceneChangeDetection == null ? Optional.empty() : Optional.ofNullable(this.sceneChangeDetection);
    }

    @InputImport(name="stretchMode")
    private final @Nullable String stretchMode;

    public Optional<String> getStretchMode() {
        return this.stretchMode == null ? Optional.empty() : Optional.ofNullable(this.stretchMode);
    }

    @InputImport(name="syncMode")
    private final @Nullable String syncMode;

    public Optional<String> getSyncMode() {
        return this.syncMode == null ? Optional.empty() : Optional.ofNullable(this.syncMode);
    }

    public H264VideoResponse(
        @Nullable String complexity,
        @Nullable String keyFrameInterval,
        @Nullable String label,
        @Nullable List<H264LayerResponse> layers,
        String odataType,
        @Nullable Boolean sceneChangeDetection,
        @Nullable String stretchMode,
        @Nullable String syncMode) {
        this.complexity = complexity;
        this.keyFrameInterval = keyFrameInterval;
        this.label = label;
        this.layers = layers;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.sceneChangeDetection = sceneChangeDetection;
        this.stretchMode = stretchMode;
        this.syncMode = syncMode;
    }

    private H264VideoResponse() {
        this.complexity = null;
        this.keyFrameInterval = null;
        this.label = null;
        this.layers = List.of();
        this.odataType = null;
        this.sceneChangeDetection = null;
        this.stretchMode = null;
        this.syncMode = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(H264VideoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String complexity;
        private @Nullable String keyFrameInterval;
        private @Nullable String label;
        private @Nullable List<H264LayerResponse> layers;
        private String odataType;
        private @Nullable Boolean sceneChangeDetection;
        private @Nullable String stretchMode;
        private @Nullable String syncMode;

        public Builder() {
    	      // Empty
        }

        public Builder(H264VideoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.complexity = defaults.complexity;
    	      this.keyFrameInterval = defaults.keyFrameInterval;
    	      this.label = defaults.label;
    	      this.layers = defaults.layers;
    	      this.odataType = defaults.odataType;
    	      this.sceneChangeDetection = defaults.sceneChangeDetection;
    	      this.stretchMode = defaults.stretchMode;
    	      this.syncMode = defaults.syncMode;
        }

        public Builder setComplexity(@Nullable String complexity) {
            this.complexity = complexity;
            return this;
        }

        public Builder setKeyFrameInterval(@Nullable String keyFrameInterval) {
            this.keyFrameInterval = keyFrameInterval;
            return this;
        }

        public Builder setLabel(@Nullable String label) {
            this.label = label;
            return this;
        }

        public Builder setLayers(@Nullable List<H264LayerResponse> layers) {
            this.layers = layers;
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setSceneChangeDetection(@Nullable Boolean sceneChangeDetection) {
            this.sceneChangeDetection = sceneChangeDetection;
            return this;
        }

        public Builder setStretchMode(@Nullable String stretchMode) {
            this.stretchMode = stretchMode;
            return this;
        }

        public Builder setSyncMode(@Nullable String syncMode) {
            this.syncMode = syncMode;
            return this;
        }

        public H264VideoResponse build() {
            return new H264VideoResponse(complexity, keyFrameInterval, label, layers, odataType, sceneChangeDetection, stretchMode, syncMode);
        }
    }
}
