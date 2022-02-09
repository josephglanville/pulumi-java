// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class H265LayerResponse extends io.pulumi.resources.InvokeArgs {

    public static final H265LayerResponse Empty = new H265LayerResponse();

    @InputImport(name="adaptiveBFrame")
    private final @Nullable Boolean adaptiveBFrame;

    public Optional<Boolean> getAdaptiveBFrame() {
        return this.adaptiveBFrame == null ? Optional.empty() : Optional.ofNullable(this.adaptiveBFrame);
    }

    @InputImport(name="bFrames")
    private final @Nullable Integer bFrames;

    public Optional<Integer> getBFrames() {
        return this.bFrames == null ? Optional.empty() : Optional.ofNullable(this.bFrames);
    }

    @InputImport(name="bitrate", required=true)
    private final Integer bitrate;

    public Integer getBitrate() {
        return this.bitrate;
    }

    @InputImport(name="bufferWindow")
    private final @Nullable String bufferWindow;

    public Optional<String> getBufferWindow() {
        return this.bufferWindow == null ? Optional.empty() : Optional.ofNullable(this.bufferWindow);
    }

    @InputImport(name="frameRate")
    private final @Nullable String frameRate;

    public Optional<String> getFrameRate() {
        return this.frameRate == null ? Optional.empty() : Optional.ofNullable(this.frameRate);
    }

    @InputImport(name="height")
    private final @Nullable String height;

    public Optional<String> getHeight() {
        return this.height == null ? Optional.empty() : Optional.ofNullable(this.height);
    }

    @InputImport(name="label")
    private final @Nullable String label;

    public Optional<String> getLabel() {
        return this.label == null ? Optional.empty() : Optional.ofNullable(this.label);
    }

    @InputImport(name="level")
    private final @Nullable String level;

    public Optional<String> getLevel() {
        return this.level == null ? Optional.empty() : Optional.ofNullable(this.level);
    }

    @InputImport(name="maxBitrate")
    private final @Nullable Integer maxBitrate;

    public Optional<Integer> getMaxBitrate() {
        return this.maxBitrate == null ? Optional.empty() : Optional.ofNullable(this.maxBitrate);
    }

    @InputImport(name="odataType", required=true)
    private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    @InputImport(name="profile")
    private final @Nullable String profile;

    public Optional<String> getProfile() {
        return this.profile == null ? Optional.empty() : Optional.ofNullable(this.profile);
    }

    @InputImport(name="referenceFrames")
    private final @Nullable Integer referenceFrames;

    public Optional<Integer> getReferenceFrames() {
        return this.referenceFrames == null ? Optional.empty() : Optional.ofNullable(this.referenceFrames);
    }

    @InputImport(name="slices")
    private final @Nullable Integer slices;

    public Optional<Integer> getSlices() {
        return this.slices == null ? Optional.empty() : Optional.ofNullable(this.slices);
    }

    @InputImport(name="width")
    private final @Nullable String width;

    public Optional<String> getWidth() {
        return this.width == null ? Optional.empty() : Optional.ofNullable(this.width);
    }

    public H265LayerResponse(
        @Nullable Boolean adaptiveBFrame,
        @Nullable Integer bFrames,
        Integer bitrate,
        @Nullable String bufferWindow,
        @Nullable String frameRate,
        @Nullable String height,
        @Nullable String label,
        @Nullable String level,
        @Nullable Integer maxBitrate,
        String odataType,
        @Nullable String profile,
        @Nullable Integer referenceFrames,
        @Nullable Integer slices,
        @Nullable String width) {
        this.adaptiveBFrame = adaptiveBFrame;
        this.bFrames = bFrames;
        this.bitrate = Objects.requireNonNull(bitrate, "expected parameter 'bitrate' to be non-null");
        this.bufferWindow = bufferWindow;
        this.frameRate = frameRate;
        this.height = height;
        this.label = label;
        this.level = level;
        this.maxBitrate = maxBitrate;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.profile = profile;
        this.referenceFrames = referenceFrames;
        this.slices = slices;
        this.width = width;
    }

    private H265LayerResponse() {
        this.adaptiveBFrame = null;
        this.bFrames = null;
        this.bitrate = null;
        this.bufferWindow = null;
        this.frameRate = null;
        this.height = null;
        this.label = null;
        this.level = null;
        this.maxBitrate = null;
        this.odataType = null;
        this.profile = null;
        this.referenceFrames = null;
        this.slices = null;
        this.width = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(H265LayerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean adaptiveBFrame;
        private @Nullable Integer bFrames;
        private Integer bitrate;
        private @Nullable String bufferWindow;
        private @Nullable String frameRate;
        private @Nullable String height;
        private @Nullable String label;
        private @Nullable String level;
        private @Nullable Integer maxBitrate;
        private String odataType;
        private @Nullable String profile;
        private @Nullable Integer referenceFrames;
        private @Nullable Integer slices;
        private @Nullable String width;

        public Builder() {
    	      // Empty
        }

        public Builder(H265LayerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adaptiveBFrame = defaults.adaptiveBFrame;
    	      this.bFrames = defaults.bFrames;
    	      this.bitrate = defaults.bitrate;
    	      this.bufferWindow = defaults.bufferWindow;
    	      this.frameRate = defaults.frameRate;
    	      this.height = defaults.height;
    	      this.label = defaults.label;
    	      this.level = defaults.level;
    	      this.maxBitrate = defaults.maxBitrate;
    	      this.odataType = defaults.odataType;
    	      this.profile = defaults.profile;
    	      this.referenceFrames = defaults.referenceFrames;
    	      this.slices = defaults.slices;
    	      this.width = defaults.width;
        }

        public Builder setAdaptiveBFrame(@Nullable Boolean adaptiveBFrame) {
            this.adaptiveBFrame = adaptiveBFrame;
            return this;
        }

        public Builder setBFrames(@Nullable Integer bFrames) {
            this.bFrames = bFrames;
            return this;
        }

        public Builder setBitrate(Integer bitrate) {
            this.bitrate = Objects.requireNonNull(bitrate);
            return this;
        }

        public Builder setBufferWindow(@Nullable String bufferWindow) {
            this.bufferWindow = bufferWindow;
            return this;
        }

        public Builder setFrameRate(@Nullable String frameRate) {
            this.frameRate = frameRate;
            return this;
        }

        public Builder setHeight(@Nullable String height) {
            this.height = height;
            return this;
        }

        public Builder setLabel(@Nullable String label) {
            this.label = label;
            return this;
        }

        public Builder setLevel(@Nullable String level) {
            this.level = level;
            return this;
        }

        public Builder setMaxBitrate(@Nullable Integer maxBitrate) {
            this.maxBitrate = maxBitrate;
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setProfile(@Nullable String profile) {
            this.profile = profile;
            return this;
        }

        public Builder setReferenceFrames(@Nullable Integer referenceFrames) {
            this.referenceFrames = referenceFrames;
            return this;
        }

        public Builder setSlices(@Nullable Integer slices) {
            this.slices = slices;
            return this;
        }

        public Builder setWidth(@Nullable String width) {
            this.width = width;
            return this;
        }

        public H265LayerResponse build() {
            return new H265LayerResponse(adaptiveBFrame, bFrames, bitrate, bufferWindow, frameRate, height, label, level, maxBitrate, odataType, profile, referenceFrames, slices, width);
        }
    }
}
