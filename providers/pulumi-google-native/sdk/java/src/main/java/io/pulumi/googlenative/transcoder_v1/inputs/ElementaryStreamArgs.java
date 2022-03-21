// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.transcoder_v1.inputs.AudioStreamArgs;
import io.pulumi.googlenative.transcoder_v1.inputs.TextStreamArgs;
import io.pulumi.googlenative.transcoder_v1.inputs.VideoStreamArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Encoding of an input file such as an audio, video, or text track. Elementary streams must be packaged before mapping and sharing between different output formats.
 * 
 */
public final class ElementaryStreamArgs extends io.pulumi.resources.ResourceArgs {

    public static final ElementaryStreamArgs Empty = new ElementaryStreamArgs();

    /**
     * Encoding of an audio stream.
     * 
     */
    @Import(name="audioStream")
      private final @Nullable Output<AudioStreamArgs> audioStream;

    public Output<AudioStreamArgs> getAudioStream() {
        return this.audioStream == null ? Output.empty() : this.audioStream;
    }

    /**
     * A unique key for this elementary stream.
     * 
     */
    @Import(name="key")
      private final @Nullable Output<String> key;

    public Output<String> getKey() {
        return this.key == null ? Output.empty() : this.key;
    }

    /**
     * Encoding of a text stream. For example, closed captions or subtitles.
     * 
     */
    @Import(name="textStream")
      private final @Nullable Output<TextStreamArgs> textStream;

    public Output<TextStreamArgs> getTextStream() {
        return this.textStream == null ? Output.empty() : this.textStream;
    }

    /**
     * Encoding of a video stream.
     * 
     */
    @Import(name="videoStream")
      private final @Nullable Output<VideoStreamArgs> videoStream;

    public Output<VideoStreamArgs> getVideoStream() {
        return this.videoStream == null ? Output.empty() : this.videoStream;
    }

    public ElementaryStreamArgs(
        @Nullable Output<AudioStreamArgs> audioStream,
        @Nullable Output<String> key,
        @Nullable Output<TextStreamArgs> textStream,
        @Nullable Output<VideoStreamArgs> videoStream) {
        this.audioStream = audioStream;
        this.key = key;
        this.textStream = textStream;
        this.videoStream = videoStream;
    }

    private ElementaryStreamArgs() {
        this.audioStream = Output.empty();
        this.key = Output.empty();
        this.textStream = Output.empty();
        this.videoStream = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElementaryStreamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AudioStreamArgs> audioStream;
        private @Nullable Output<String> key;
        private @Nullable Output<TextStreamArgs> textStream;
        private @Nullable Output<VideoStreamArgs> videoStream;

        public Builder() {
    	      // Empty
        }

        public Builder(ElementaryStreamArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audioStream = defaults.audioStream;
    	      this.key = defaults.key;
    	      this.textStream = defaults.textStream;
    	      this.videoStream = defaults.videoStream;
        }

        public Builder audioStream(@Nullable Output<AudioStreamArgs> audioStream) {
            this.audioStream = audioStream;
            return this;
        }
        public Builder audioStream(@Nullable AudioStreamArgs audioStream) {
            this.audioStream = Output.ofNullable(audioStream);
            return this;
        }
        public Builder key(@Nullable Output<String> key) {
            this.key = key;
            return this;
        }
        public Builder key(@Nullable String key) {
            this.key = Output.ofNullable(key);
            return this;
        }
        public Builder textStream(@Nullable Output<TextStreamArgs> textStream) {
            this.textStream = textStream;
            return this;
        }
        public Builder textStream(@Nullable TextStreamArgs textStream) {
            this.textStream = Output.ofNullable(textStream);
            return this;
        }
        public Builder videoStream(@Nullable Output<VideoStreamArgs> videoStream) {
            this.videoStream = videoStream;
            return this;
        }
        public Builder videoStream(@Nullable VideoStreamArgs videoStream) {
            this.videoStream = Output.ofNullable(videoStream);
            return this;
        }        public ElementaryStreamArgs build() {
            return new ElementaryStreamArgs(audioStream, key, textStream, videoStream);
        }
    }
}
