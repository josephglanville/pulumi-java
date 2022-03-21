// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Optional flags used to change how video is published. These are only allowed for topologies where "kind" is set to "live".
 * 
 */
public final class VideoPublishingOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final VideoPublishingOptionsArgs Empty = new VideoPublishingOptionsArgs();

    /**
     * When set to 'true' content will not be archived or recorded. This is used, for example, when the topology is used only for low latency video streaming. Default is 'false'.  If set to 'true', then "disableRtspPublishing" must be set to 'false'.
     * 
     */
    @Import(name="disableArchive")
      private final @Nullable Output<String> disableArchive;

    public Output<String> getDisableArchive() {
        return this.disableArchive == null ? Output.empty() : this.disableArchive;
    }

    /**
     * When set to 'true' the RTSP playback URL will not be published, disabling low latency streaming. This is used, for example, when the topology is used only for archiving content. Default is 'false'.  If set to 'true', then "disableArchive" must be set to 'false'.
     * 
     */
    @Import(name="disableRtspPublishing")
      private final @Nullable Output<String> disableRtspPublishing;

    public Output<String> getDisableRtspPublishing() {
        return this.disableRtspPublishing == null ? Output.empty() : this.disableRtspPublishing;
    }

    public VideoPublishingOptionsArgs(
        @Nullable Output<String> disableArchive,
        @Nullable Output<String> disableRtspPublishing) {
        this.disableArchive = disableArchive;
        this.disableRtspPublishing = disableRtspPublishing;
    }

    private VideoPublishingOptionsArgs() {
        this.disableArchive = Output.empty();
        this.disableRtspPublishing = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VideoPublishingOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> disableArchive;
        private @Nullable Output<String> disableRtspPublishing;

        public Builder() {
    	      // Empty
        }

        public Builder(VideoPublishingOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableArchive = defaults.disableArchive;
    	      this.disableRtspPublishing = defaults.disableRtspPublishing;
        }

        public Builder disableArchive(@Nullable Output<String> disableArchive) {
            this.disableArchive = disableArchive;
            return this;
        }
        public Builder disableArchive(@Nullable String disableArchive) {
            this.disableArchive = Output.ofNullable(disableArchive);
            return this;
        }
        public Builder disableRtspPublishing(@Nullable Output<String> disableRtspPublishing) {
            this.disableRtspPublishing = disableRtspPublishing;
            return this;
        }
        public Builder disableRtspPublishing(@Nullable String disableRtspPublishing) {
            this.disableRtspPublishing = Output.ofNullable(disableRtspPublishing);
            return this;
        }        public VideoPublishingOptionsArgs build() {
            return new VideoPublishingOptionsArgs(disableArchive, disableRtspPublishing);
        }
    }
}
