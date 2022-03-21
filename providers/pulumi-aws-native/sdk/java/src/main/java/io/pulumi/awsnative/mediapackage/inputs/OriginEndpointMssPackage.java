// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.inputs;

import io.pulumi.awsnative.mediapackage.inputs.OriginEndpointMssEncryption;
import io.pulumi.awsnative.mediapackage.inputs.OriginEndpointStreamSelection;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A Microsoft Smooth Streaming (MSS) packaging configuration.
 * 
 */
public final class OriginEndpointMssPackage extends io.pulumi.resources.InvokeArgs {

    public static final OriginEndpointMssPackage Empty = new OriginEndpointMssPackage();

    @Import(name="encryption")
      private final @Nullable OriginEndpointMssEncryption encryption;

    public Optional<OriginEndpointMssEncryption> getEncryption() {
        return this.encryption == null ? Optional.empty() : Optional.ofNullable(this.encryption);
    }

    /**
     * The time window (in seconds) contained in each manifest.
     * 
     */
    @Import(name="manifestWindowSeconds")
      private final @Nullable Integer manifestWindowSeconds;

    public Optional<Integer> getManifestWindowSeconds() {
        return this.manifestWindowSeconds == null ? Optional.empty() : Optional.ofNullable(this.manifestWindowSeconds);
    }

    /**
     * The duration (in seconds) of each segment.
     * 
     */
    @Import(name="segmentDurationSeconds")
      private final @Nullable Integer segmentDurationSeconds;

    public Optional<Integer> getSegmentDurationSeconds() {
        return this.segmentDurationSeconds == null ? Optional.empty() : Optional.ofNullable(this.segmentDurationSeconds);
    }

    @Import(name="streamSelection")
      private final @Nullable OriginEndpointStreamSelection streamSelection;

    public Optional<OriginEndpointStreamSelection> getStreamSelection() {
        return this.streamSelection == null ? Optional.empty() : Optional.ofNullable(this.streamSelection);
    }

    public OriginEndpointMssPackage(
        @Nullable OriginEndpointMssEncryption encryption,
        @Nullable Integer manifestWindowSeconds,
        @Nullable Integer segmentDurationSeconds,
        @Nullable OriginEndpointStreamSelection streamSelection) {
        this.encryption = encryption;
        this.manifestWindowSeconds = manifestWindowSeconds;
        this.segmentDurationSeconds = segmentDurationSeconds;
        this.streamSelection = streamSelection;
    }

    private OriginEndpointMssPackage() {
        this.encryption = null;
        this.manifestWindowSeconds = null;
        this.segmentDurationSeconds = null;
        this.streamSelection = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginEndpointMssPackage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable OriginEndpointMssEncryption encryption;
        private @Nullable Integer manifestWindowSeconds;
        private @Nullable Integer segmentDurationSeconds;
        private @Nullable OriginEndpointStreamSelection streamSelection;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginEndpointMssPackage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryption = defaults.encryption;
    	      this.manifestWindowSeconds = defaults.manifestWindowSeconds;
    	      this.segmentDurationSeconds = defaults.segmentDurationSeconds;
    	      this.streamSelection = defaults.streamSelection;
        }

        public Builder encryption(@Nullable OriginEndpointMssEncryption encryption) {
            this.encryption = encryption;
            return this;
        }
        public Builder manifestWindowSeconds(@Nullable Integer manifestWindowSeconds) {
            this.manifestWindowSeconds = manifestWindowSeconds;
            return this;
        }
        public Builder segmentDurationSeconds(@Nullable Integer segmentDurationSeconds) {
            this.segmentDurationSeconds = segmentDurationSeconds;
            return this;
        }
        public Builder streamSelection(@Nullable OriginEndpointStreamSelection streamSelection) {
            this.streamSelection = streamSelection;
            return this;
        }        public OriginEndpointMssPackage build() {
            return new OriginEndpointMssPackage(encryption, manifestWindowSeconds, segmentDurationSeconds, streamSelection);
        }
    }
}
