// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.PngLayerResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PngImageResponse {
    private final @Nullable String keyFrameInterval;
    private final @Nullable String label;
    private final @Nullable List<PngLayerResponse> layers;
    private final String odataType;
    private final @Nullable String range;
    private final String start;
    private final @Nullable String step;
    private final @Nullable String stretchMode;
    private final @Nullable String syncMode;

    @OutputCustomType.Constructor({"keyFrameInterval","label","layers","odataType","range","start","step","stretchMode","syncMode"})
    private PngImageResponse(
        @Nullable String keyFrameInterval,
        @Nullable String label,
        @Nullable List<PngLayerResponse> layers,
        String odataType,
        @Nullable String range,
        String start,
        @Nullable String step,
        @Nullable String stretchMode,
        @Nullable String syncMode) {
        this.keyFrameInterval = keyFrameInterval;
        this.label = label;
        this.layers = layers;
        this.odataType = Objects.requireNonNull(odataType);
        this.range = range;
        this.start = Objects.requireNonNull(start);
        this.step = step;
        this.stretchMode = stretchMode;
        this.syncMode = syncMode;
    }

    public Optional<String> getKeyFrameInterval() {
        return Optional.ofNullable(this.keyFrameInterval);
    }
    public Optional<String> getLabel() {
        return Optional.ofNullable(this.label);
    }
    public List<PngLayerResponse> getLayers() {
        return this.layers == null ? List.of() : this.layers;
    }
    public String getOdataType() {
        return this.odataType;
    }
    public Optional<String> getRange() {
        return Optional.ofNullable(this.range);
    }
    public String getStart() {
        return this.start;
    }
    public Optional<String> getStep() {
        return Optional.ofNullable(this.step);
    }
    public Optional<String> getStretchMode() {
        return Optional.ofNullable(this.stretchMode);
    }
    public Optional<String> getSyncMode() {
        return Optional.ofNullable(this.syncMode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PngImageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyFrameInterval;
        private @Nullable String label;
        private @Nullable List<PngLayerResponse> layers;
        private String odataType;
        private @Nullable String range;
        private String start;
        private @Nullable String step;
        private @Nullable String stretchMode;
        private @Nullable String syncMode;

        public Builder() {
    	      // Empty
        }

        public Builder(PngImageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyFrameInterval = defaults.keyFrameInterval;
    	      this.label = defaults.label;
    	      this.layers = defaults.layers;
    	      this.odataType = defaults.odataType;
    	      this.range = defaults.range;
    	      this.start = defaults.start;
    	      this.step = defaults.step;
    	      this.stretchMode = defaults.stretchMode;
    	      this.syncMode = defaults.syncMode;
        }

        public Builder setKeyFrameInterval(@Nullable String keyFrameInterval) {
            this.keyFrameInterval = keyFrameInterval;
            return this;
        }

        public Builder setLabel(@Nullable String label) {
            this.label = label;
            return this;
        }

        public Builder setLayers(@Nullable List<PngLayerResponse> layers) {
            this.layers = layers;
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setRange(@Nullable String range) {
            this.range = range;
            return this;
        }

        public Builder setStart(String start) {
            this.start = Objects.requireNonNull(start);
            return this;
        }

        public Builder setStep(@Nullable String step) {
            this.step = step;
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

        public PngImageResponse build() {
            return new PngImageResponse(keyFrameInterval, label, layers, odataType, range, start, step, stretchMode, syncMode);
        }
    }
}
