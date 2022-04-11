// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.enums.LiveEventEncodingType;
import io.pulumi.azurenative.media.enums.StretchMode;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies the live event type and optional encoding settings for encoding live events.
 * 
 */
public final class LiveEventEncodingArgs extends io.pulumi.resources.ResourceArgs {

    public static final LiveEventEncodingArgs Empty = new LiveEventEncodingArgs();

    /**
     * Live event type. When encodingType is set to None, the service simply passes through the incoming video and audio layer(s) to the output. When encodingType is set to Standard or Premium1080p, a live encoder transcodes the incoming stream into multiple bitrates or layers. See https://go.microsoft.com/fwlink/?linkid=2095101 for more information. This property cannot be modified after the live event is created.
     * 
     */
    @Import(name="encodingType")
      private final @Nullable Output<Either<String,LiveEventEncodingType>> encodingType;

    public Output<Either<String,LiveEventEncodingType>> getEncodingType() {
        return this.encodingType == null ? Codegen.empty() : this.encodingType;
    }

    /**
     * Use an ISO 8601 time value between 0.5 to 20 seconds to specify the output fragment length for the video and audio tracks of an encoding live event. For example, use PT2S to indicate 2 seconds. For the video track it also defines the key frame interval, or the length of a GoP (group of pictures).   If this value is not set for an encoding live event, the fragment duration defaults to 2 seconds. The value cannot be set for pass-through live events.
     * 
     */
    @Import(name="keyFrameInterval")
      private final @Nullable Output<String> keyFrameInterval;

    public Output<String> getKeyFrameInterval() {
        return this.keyFrameInterval == null ? Codegen.empty() : this.keyFrameInterval;
    }

    /**
     * The optional encoding preset name, used when encodingType is not None. This value is specified at creation time and cannot be updated. If the encodingType is set to Standard, then the default preset name is ‘Default720p’. Else if the encodingType is set to Premium1080p, the default preset is ‘Default1080p’.
     * 
     */
    @Import(name="presetName")
      private final @Nullable Output<String> presetName;

    public Output<String> getPresetName() {
        return this.presetName == null ? Codegen.empty() : this.presetName;
    }

    /**
     * Specifies how the input video will be resized to fit the desired output resolution(s). Default is None
     * 
     */
    @Import(name="stretchMode")
      private final @Nullable Output<Either<String,StretchMode>> stretchMode;

    public Output<Either<String,StretchMode>> getStretchMode() {
        return this.stretchMode == null ? Codegen.empty() : this.stretchMode;
    }

    public LiveEventEncodingArgs(
        @Nullable Output<Either<String,LiveEventEncodingType>> encodingType,
        @Nullable Output<String> keyFrameInterval,
        @Nullable Output<String> presetName,
        @Nullable Output<Either<String,StretchMode>> stretchMode) {
        this.encodingType = encodingType;
        this.keyFrameInterval = keyFrameInterval;
        this.presetName = presetName;
        this.stretchMode = stretchMode;
    }

    private LiveEventEncodingArgs() {
        this.encodingType = Codegen.empty();
        this.keyFrameInterval = Codegen.empty();
        this.presetName = Codegen.empty();
        this.stretchMode = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiveEventEncodingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,LiveEventEncodingType>> encodingType;
        private @Nullable Output<String> keyFrameInterval;
        private @Nullable Output<String> presetName;
        private @Nullable Output<Either<String,StretchMode>> stretchMode;

        public Builder() {
    	      // Empty
        }

        public Builder(LiveEventEncodingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encodingType = defaults.encodingType;
    	      this.keyFrameInterval = defaults.keyFrameInterval;
    	      this.presetName = defaults.presetName;
    	      this.stretchMode = defaults.stretchMode;
        }

        public Builder encodingType(@Nullable Output<Either<String,LiveEventEncodingType>> encodingType) {
            this.encodingType = encodingType;
            return this;
        }
        public Builder encodingType(@Nullable Either<String,LiveEventEncodingType> encodingType) {
            this.encodingType = Codegen.ofNullable(encodingType);
            return this;
        }
        public Builder keyFrameInterval(@Nullable Output<String> keyFrameInterval) {
            this.keyFrameInterval = keyFrameInterval;
            return this;
        }
        public Builder keyFrameInterval(@Nullable String keyFrameInterval) {
            this.keyFrameInterval = Codegen.ofNullable(keyFrameInterval);
            return this;
        }
        public Builder presetName(@Nullable Output<String> presetName) {
            this.presetName = presetName;
            return this;
        }
        public Builder presetName(@Nullable String presetName) {
            this.presetName = Codegen.ofNullable(presetName);
            return this;
        }
        public Builder stretchMode(@Nullable Output<Either<String,StretchMode>> stretchMode) {
            this.stretchMode = stretchMode;
            return this;
        }
        public Builder stretchMode(@Nullable Either<String,StretchMode> stretchMode) {
            this.stretchMode = Codegen.ofNullable(stretchMode);
            return this;
        }        public LiveEventEncodingArgs build() {
            return new LiveEventEncodingArgs(encodingType, keyFrameInterval, presetName, stretchMode);
        }
    }
}
