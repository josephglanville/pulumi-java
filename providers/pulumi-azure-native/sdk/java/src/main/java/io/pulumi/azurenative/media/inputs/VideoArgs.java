// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.enums.StretchMode;
import io.pulumi.azurenative.media.enums.VideoSyncMode;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the basic properties for encoding the input video.
 * 
 */
public final class VideoArgs extends io.pulumi.resources.ResourceArgs {

    public static final VideoArgs Empty = new VideoArgs();

    /**
     * The distance between two key frames. The value should be non-zero in the range [0.5, 20] seconds, specified in ISO 8601 format. The default is 2 seconds(PT2S). Note that this setting is ignored if VideoSyncMode.Passthrough is set, where the KeyFrameInterval value will follow the input source setting.
     * 
     */
    @Import(name="keyFrameInterval")
      private final @Nullable Output<String> keyFrameInterval;

    public Output<String> getKeyFrameInterval() {
        return this.keyFrameInterval == null ? Codegen.empty() : this.keyFrameInterval;
    }

    /**
     * An optional label for the codec. The label can be used to control muxing behavior.
     * 
     */
    @Import(name="label")
      private final @Nullable Output<String> label;

    public Output<String> getLabel() {
        return this.label == null ? Codegen.empty() : this.label;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.Video'.
     * 
     */
    @Import(name="odataType", required=true)
      private final Output<String> odataType;

    public Output<String> getOdataType() {
        return this.odataType;
    }

    /**
     * The resizing mode - how the input video will be resized to fit the desired output resolution(s). Default is AutoSize
     * 
     */
    @Import(name="stretchMode")
      private final @Nullable Output<Either<String,StretchMode>> stretchMode;

    public Output<Either<String,StretchMode>> getStretchMode() {
        return this.stretchMode == null ? Codegen.empty() : this.stretchMode;
    }

    /**
     * The Video Sync Mode
     * 
     */
    @Import(name="syncMode")
      private final @Nullable Output<Either<String,VideoSyncMode>> syncMode;

    public Output<Either<String,VideoSyncMode>> getSyncMode() {
        return this.syncMode == null ? Codegen.empty() : this.syncMode;
    }

    public VideoArgs(
        @Nullable Output<String> keyFrameInterval,
        @Nullable Output<String> label,
        Output<String> odataType,
        @Nullable Output<Either<String,StretchMode>> stretchMode,
        @Nullable Output<Either<String,VideoSyncMode>> syncMode) {
        this.keyFrameInterval = keyFrameInterval;
        this.label = label;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.stretchMode = stretchMode;
        this.syncMode = syncMode;
    }

    private VideoArgs() {
        this.keyFrameInterval = Codegen.empty();
        this.label = Codegen.empty();
        this.odataType = Codegen.empty();
        this.stretchMode = Codegen.empty();
        this.syncMode = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VideoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> keyFrameInterval;
        private @Nullable Output<String> label;
        private Output<String> odataType;
        private @Nullable Output<Either<String,StretchMode>> stretchMode;
        private @Nullable Output<Either<String,VideoSyncMode>> syncMode;

        public Builder() {
    	      // Empty
        }

        public Builder(VideoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyFrameInterval = defaults.keyFrameInterval;
    	      this.label = defaults.label;
    	      this.odataType = defaults.odataType;
    	      this.stretchMode = defaults.stretchMode;
    	      this.syncMode = defaults.syncMode;
        }

        public Builder keyFrameInterval(@Nullable Output<String> keyFrameInterval) {
            this.keyFrameInterval = keyFrameInterval;
            return this;
        }
        public Builder keyFrameInterval(@Nullable String keyFrameInterval) {
            this.keyFrameInterval = Codegen.ofNullable(keyFrameInterval);
            return this;
        }
        public Builder label(@Nullable Output<String> label) {
            this.label = label;
            return this;
        }
        public Builder label(@Nullable String label) {
            this.label = Codegen.ofNullable(label);
            return this;
        }
        public Builder odataType(Output<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Output.of(Objects.requireNonNull(odataType));
            return this;
        }
        public Builder stretchMode(@Nullable Output<Either<String,StretchMode>> stretchMode) {
            this.stretchMode = stretchMode;
            return this;
        }
        public Builder stretchMode(@Nullable Either<String,StretchMode> stretchMode) {
            this.stretchMode = Codegen.ofNullable(stretchMode);
            return this;
        }
        public Builder syncMode(@Nullable Output<Either<String,VideoSyncMode>> syncMode) {
            this.syncMode = syncMode;
            return this;
        }
        public Builder syncMode(@Nullable Either<String,VideoSyncMode> syncMode) {
            this.syncMode = Codegen.ofNullable(syncMode);
            return this;
        }        public VideoArgs build() {
            return new VideoArgs(keyFrameInterval, label, odataType, stretchMode, syncMode);
        }
    }
}
