// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.enums.StretchMode;
import io.pulumi.azurenative.media.enums.VideoSyncMode;
import io.pulumi.azurenative.media.inputs.PngLayerArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PngImageArgs extends io.pulumi.resources.ResourceArgs {

    public static final PngImageArgs Empty = new PngImageArgs();

    @InputImport(name="keyFrameInterval")
    private final @Nullable Input<String> keyFrameInterval;

    public Input<String> getKeyFrameInterval() {
        return this.keyFrameInterval == null ? Input.empty() : this.keyFrameInterval;
    }

    @InputImport(name="label")
    private final @Nullable Input<String> label;

    public Input<String> getLabel() {
        return this.label == null ? Input.empty() : this.label;
    }

    @InputImport(name="layers")
    private final @Nullable Input<List<PngLayerArgs>> layers;

    public Input<List<PngLayerArgs>> getLayers() {
        return this.layers == null ? Input.empty() : this.layers;
    }

    @InputImport(name="odataType", required=true)
    private final Input<String> odataType;

    public Input<String> getOdataType() {
        return this.odataType;
    }

    @InputImport(name="range")
    private final @Nullable Input<String> range;

    public Input<String> getRange() {
        return this.range == null ? Input.empty() : this.range;
    }

    @InputImport(name="start", required=true)
    private final Input<String> start;

    public Input<String> getStart() {
        return this.start;
    }

    @InputImport(name="step")
    private final @Nullable Input<String> step;

    public Input<String> getStep() {
        return this.step == null ? Input.empty() : this.step;
    }

    @InputImport(name="stretchMode")
    private final @Nullable Input<Either<String,StretchMode>> stretchMode;

    public Input<Either<String,StretchMode>> getStretchMode() {
        return this.stretchMode == null ? Input.empty() : this.stretchMode;
    }

    @InputImport(name="syncMode")
    private final @Nullable Input<Either<String,VideoSyncMode>> syncMode;

    public Input<Either<String,VideoSyncMode>> getSyncMode() {
        return this.syncMode == null ? Input.empty() : this.syncMode;
    }

    public PngImageArgs(
        @Nullable Input<String> keyFrameInterval,
        @Nullable Input<String> label,
        @Nullable Input<List<PngLayerArgs>> layers,
        Input<String> odataType,
        @Nullable Input<String> range,
        Input<String> start,
        @Nullable Input<String> step,
        @Nullable Input<Either<String,StretchMode>> stretchMode,
        @Nullable Input<Either<String,VideoSyncMode>> syncMode) {
        this.keyFrameInterval = keyFrameInterval;
        this.label = label;
        this.layers = layers;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.range = range;
        this.start = Objects.requireNonNull(start, "expected parameter 'start' to be non-null");
        this.step = step;
        this.stretchMode = stretchMode;
        this.syncMode = syncMode;
    }

    private PngImageArgs() {
        this.keyFrameInterval = Input.empty();
        this.label = Input.empty();
        this.layers = Input.empty();
        this.odataType = Input.empty();
        this.range = Input.empty();
        this.start = Input.empty();
        this.step = Input.empty();
        this.stretchMode = Input.empty();
        this.syncMode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PngImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> keyFrameInterval;
        private @Nullable Input<String> label;
        private @Nullable Input<List<PngLayerArgs>> layers;
        private Input<String> odataType;
        private @Nullable Input<String> range;
        private Input<String> start;
        private @Nullable Input<String> step;
        private @Nullable Input<Either<String,StretchMode>> stretchMode;
        private @Nullable Input<Either<String,VideoSyncMode>> syncMode;

        public Builder() {
    	      // Empty
        }

        public Builder(PngImageArgs defaults) {
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

        public Builder setKeyFrameInterval(@Nullable Input<String> keyFrameInterval) {
            this.keyFrameInterval = keyFrameInterval;
            return this;
        }

        public Builder setKeyFrameInterval(@Nullable String keyFrameInterval) {
            this.keyFrameInterval = Input.ofNullable(keyFrameInterval);
            return this;
        }

        public Builder setLabel(@Nullable Input<String> label) {
            this.label = label;
            return this;
        }

        public Builder setLabel(@Nullable String label) {
            this.label = Input.ofNullable(label);
            return this;
        }

        public Builder setLayers(@Nullable Input<List<PngLayerArgs>> layers) {
            this.layers = layers;
            return this;
        }

        public Builder setLayers(@Nullable List<PngLayerArgs> layers) {
            this.layers = Input.ofNullable(layers);
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

        public Builder setRange(@Nullable Input<String> range) {
            this.range = range;
            return this;
        }

        public Builder setRange(@Nullable String range) {
            this.range = Input.ofNullable(range);
            return this;
        }

        public Builder setStart(Input<String> start) {
            this.start = Objects.requireNonNull(start);
            return this;
        }

        public Builder setStart(String start) {
            this.start = Input.of(Objects.requireNonNull(start));
            return this;
        }

        public Builder setStep(@Nullable Input<String> step) {
            this.step = step;
            return this;
        }

        public Builder setStep(@Nullable String step) {
            this.step = Input.ofNullable(step);
            return this;
        }

        public Builder setStretchMode(@Nullable Input<Either<String,StretchMode>> stretchMode) {
            this.stretchMode = stretchMode;
            return this;
        }

        public Builder setStretchMode(@Nullable Either<String,StretchMode> stretchMode) {
            this.stretchMode = Input.ofNullable(stretchMode);
            return this;
        }

        public Builder setSyncMode(@Nullable Input<Either<String,VideoSyncMode>> syncMode) {
            this.syncMode = syncMode;
            return this;
        }

        public Builder setSyncMode(@Nullable Either<String,VideoSyncMode> syncMode) {
            this.syncMode = Input.ofNullable(syncMode);
            return this;
        }

        public PngImageArgs build() {
            return new PngImageArgs(keyFrameInterval, label, layers, odataType, range, start, step, stretchMode, syncMode);
        }
    }
}
