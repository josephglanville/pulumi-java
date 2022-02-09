// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VideoPublishingOptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final VideoPublishingOptionsResponse Empty = new VideoPublishingOptionsResponse();

    @InputImport(name="disableArchive")
    private final @Nullable String disableArchive;

    public Optional<String> getDisableArchive() {
        return this.disableArchive == null ? Optional.empty() : Optional.ofNullable(this.disableArchive);
    }

    @InputImport(name="disableRtspPublishing")
    private final @Nullable String disableRtspPublishing;

    public Optional<String> getDisableRtspPublishing() {
        return this.disableRtspPublishing == null ? Optional.empty() : Optional.ofNullable(this.disableRtspPublishing);
    }

    public VideoPublishingOptionsResponse(
        @Nullable String disableArchive,
        @Nullable String disableRtspPublishing) {
        this.disableArchive = disableArchive;
        this.disableRtspPublishing = disableRtspPublishing;
    }

    private VideoPublishingOptionsResponse() {
        this.disableArchive = null;
        this.disableRtspPublishing = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VideoPublishingOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String disableArchive;
        private @Nullable String disableRtspPublishing;

        public Builder() {
    	      // Empty
        }

        public Builder(VideoPublishingOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableArchive = defaults.disableArchive;
    	      this.disableRtspPublishing = defaults.disableRtspPublishing;
        }

        public Builder setDisableArchive(@Nullable String disableArchive) {
            this.disableArchive = disableArchive;
            return this;
        }

        public Builder setDisableRtspPublishing(@Nullable String disableRtspPublishing) {
            this.disableRtspPublishing = disableRtspPublishing;
            return this;
        }

        public VideoPublishingOptionsResponse build() {
            return new VideoPublishingOptionsResponse(disableArchive, disableRtspPublishing);
        }
    }
}
