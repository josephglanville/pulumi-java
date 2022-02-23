// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.inputs;

import io.pulumi.awsnative.mediapackage.enums.OriginEndpointAdsOnDeliveryRestrictions;
import io.pulumi.awsnative.mediapackage.enums.OriginEndpointHlsPackageAdMarkers;
import io.pulumi.awsnative.mediapackage.enums.OriginEndpointHlsPackageAdTriggersItem;
import io.pulumi.awsnative.mediapackage.enums.OriginEndpointHlsPackagePlaylistType;
import io.pulumi.awsnative.mediapackage.inputs.OriginEndpointHlsEncryption;
import io.pulumi.awsnative.mediapackage.inputs.OriginEndpointStreamSelection;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An HTTP Live Streaming (HLS) packaging configuration.
 * 
 */
public final class OriginEndpointHlsPackage extends io.pulumi.resources.InvokeArgs {

    public static final OriginEndpointHlsPackage Empty = new OriginEndpointHlsPackage();

    /**
     * This setting controls how ad markers are included in the packaged OriginEndpoint. "NONE" will omit all SCTE-35 ad markers from the output. "PASSTHROUGH" causes the manifest to contain a copy of the SCTE-35 ad markers (comments) taken directly from the input HTTP Live Streaming (HLS) manifest. "SCTE35_ENHANCED" generates ad markers and blackout tags based on SCTE-35 messages in the input source. "DATERANGE" inserts EXT-X-DATERANGE tags to signal ad and program transition events in HLS and CMAF manifests. For this option, you must set a programDateTimeIntervalSeconds value that is greater than 0.
     * 
     */
    @InputImport(name="adMarkers")
      private final @Nullable OriginEndpointHlsPackageAdMarkers adMarkers;

    public Optional<OriginEndpointHlsPackageAdMarkers> getAdMarkers() {
        return this.adMarkers == null ? Optional.empty() : Optional.ofNullable(this.adMarkers);
    }

    /**
     * A list of SCTE-35 message types that are treated as ad markers in the output.  If empty, no ad markers are output.  Specify multiple items to create ad markers for all of the included message types.
     * 
     */
    @InputImport(name="adTriggers")
      private final @Nullable List<OriginEndpointHlsPackageAdTriggersItem> adTriggers;

    public List<OriginEndpointHlsPackageAdTriggersItem> getAdTriggers() {
        return this.adTriggers == null ? List.of() : this.adTriggers;
    }

    @InputImport(name="adsOnDeliveryRestrictions")
      private final @Nullable OriginEndpointAdsOnDeliveryRestrictions adsOnDeliveryRestrictions;

    public Optional<OriginEndpointAdsOnDeliveryRestrictions> getAdsOnDeliveryRestrictions() {
        return this.adsOnDeliveryRestrictions == null ? Optional.empty() : Optional.ofNullable(this.adsOnDeliveryRestrictions);
    }

    @InputImport(name="encryption")
      private final @Nullable OriginEndpointHlsEncryption encryption;

    public Optional<OriginEndpointHlsEncryption> getEncryption() {
        return this.encryption == null ? Optional.empty() : Optional.ofNullable(this.encryption);
    }

    /**
     * When enabled, an I-Frame only stream will be included in the output.
     * 
     */
    @InputImport(name="includeIframeOnlyStream")
      private final @Nullable Boolean includeIframeOnlyStream;

    public Optional<Boolean> getIncludeIframeOnlyStream() {
        return this.includeIframeOnlyStream == null ? Optional.empty() : Optional.ofNullable(this.includeIframeOnlyStream);
    }

    /**
     * The HTTP Live Streaming (HLS) playlist type. When either "EVENT" or "VOD" is specified, a corresponding EXT-X-PLAYLIST-TYPE entry will be included in the media playlist.
     * 
     */
    @InputImport(name="playlistType")
      private final @Nullable OriginEndpointHlsPackagePlaylistType playlistType;

    public Optional<OriginEndpointHlsPackagePlaylistType> getPlaylistType() {
        return this.playlistType == null ? Optional.empty() : Optional.ofNullable(this.playlistType);
    }

    /**
     * Time window (in seconds) contained in each parent manifest.
     * 
     */
    @InputImport(name="playlistWindowSeconds")
      private final @Nullable Integer playlistWindowSeconds;

    public Optional<Integer> getPlaylistWindowSeconds() {
        return this.playlistWindowSeconds == null ? Optional.empty() : Optional.ofNullable(this.playlistWindowSeconds);
    }

    /**
     * The interval (in seconds) between each EXT-X-PROGRAM-DATE-TIME tag inserted into manifests. Additionally, when an interval is specified ID3Timed Metadata messages will be generated every 5 seconds using the ingest time of the content. If the interval is not specified, or set to 0, then no EXT-X-PROGRAM-DATE-TIME tags will be inserted into manifests and no ID3Timed Metadata messages will be generated. Note that irrespective of this parameter, if any ID3 Timed Metadata is found in HTTP Live Streaming (HLS) input, it will be passed through to HLS output.
     * 
     */
    @InputImport(name="programDateTimeIntervalSeconds")
      private final @Nullable Integer programDateTimeIntervalSeconds;

    public Optional<Integer> getProgramDateTimeIntervalSeconds() {
        return this.programDateTimeIntervalSeconds == null ? Optional.empty() : Optional.ofNullable(this.programDateTimeIntervalSeconds);
    }

    /**
     * Duration (in seconds) of each fragment. Actual fragments will be rounded to the nearest multiple of the source fragment duration.
     * 
     */
    @InputImport(name="segmentDurationSeconds")
      private final @Nullable Integer segmentDurationSeconds;

    public Optional<Integer> getSegmentDurationSeconds() {
        return this.segmentDurationSeconds == null ? Optional.empty() : Optional.ofNullable(this.segmentDurationSeconds);
    }

    @InputImport(name="streamSelection")
      private final @Nullable OriginEndpointStreamSelection streamSelection;

    public Optional<OriginEndpointStreamSelection> getStreamSelection() {
        return this.streamSelection == null ? Optional.empty() : Optional.ofNullable(this.streamSelection);
    }

    /**
     * When enabled, audio streams will be placed in rendition groups in the output.
     * 
     */
    @InputImport(name="useAudioRenditionGroup")
      private final @Nullable Boolean useAudioRenditionGroup;

    public Optional<Boolean> getUseAudioRenditionGroup() {
        return this.useAudioRenditionGroup == null ? Optional.empty() : Optional.ofNullable(this.useAudioRenditionGroup);
    }

    public OriginEndpointHlsPackage(
        @Nullable OriginEndpointHlsPackageAdMarkers adMarkers,
        @Nullable List<OriginEndpointHlsPackageAdTriggersItem> adTriggers,
        @Nullable OriginEndpointAdsOnDeliveryRestrictions adsOnDeliveryRestrictions,
        @Nullable OriginEndpointHlsEncryption encryption,
        @Nullable Boolean includeIframeOnlyStream,
        @Nullable OriginEndpointHlsPackagePlaylistType playlistType,
        @Nullable Integer playlistWindowSeconds,
        @Nullable Integer programDateTimeIntervalSeconds,
        @Nullable Integer segmentDurationSeconds,
        @Nullable OriginEndpointStreamSelection streamSelection,
        @Nullable Boolean useAudioRenditionGroup) {
        this.adMarkers = adMarkers;
        this.adTriggers = adTriggers;
        this.adsOnDeliveryRestrictions = adsOnDeliveryRestrictions;
        this.encryption = encryption;
        this.includeIframeOnlyStream = includeIframeOnlyStream;
        this.playlistType = playlistType;
        this.playlistWindowSeconds = playlistWindowSeconds;
        this.programDateTimeIntervalSeconds = programDateTimeIntervalSeconds;
        this.segmentDurationSeconds = segmentDurationSeconds;
        this.streamSelection = streamSelection;
        this.useAudioRenditionGroup = useAudioRenditionGroup;
    }

    private OriginEndpointHlsPackage() {
        this.adMarkers = null;
        this.adTriggers = List.of();
        this.adsOnDeliveryRestrictions = null;
        this.encryption = null;
        this.includeIframeOnlyStream = null;
        this.playlistType = null;
        this.playlistWindowSeconds = null;
        this.programDateTimeIntervalSeconds = null;
        this.segmentDurationSeconds = null;
        this.streamSelection = null;
        this.useAudioRenditionGroup = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginEndpointHlsPackage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable OriginEndpointHlsPackageAdMarkers adMarkers;
        private @Nullable List<OriginEndpointHlsPackageAdTriggersItem> adTriggers;
        private @Nullable OriginEndpointAdsOnDeliveryRestrictions adsOnDeliveryRestrictions;
        private @Nullable OriginEndpointHlsEncryption encryption;
        private @Nullable Boolean includeIframeOnlyStream;
        private @Nullable OriginEndpointHlsPackagePlaylistType playlistType;
        private @Nullable Integer playlistWindowSeconds;
        private @Nullable Integer programDateTimeIntervalSeconds;
        private @Nullable Integer segmentDurationSeconds;
        private @Nullable OriginEndpointStreamSelection streamSelection;
        private @Nullable Boolean useAudioRenditionGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginEndpointHlsPackage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adMarkers = defaults.adMarkers;
    	      this.adTriggers = defaults.adTriggers;
    	      this.adsOnDeliveryRestrictions = defaults.adsOnDeliveryRestrictions;
    	      this.encryption = defaults.encryption;
    	      this.includeIframeOnlyStream = defaults.includeIframeOnlyStream;
    	      this.playlistType = defaults.playlistType;
    	      this.playlistWindowSeconds = defaults.playlistWindowSeconds;
    	      this.programDateTimeIntervalSeconds = defaults.programDateTimeIntervalSeconds;
    	      this.segmentDurationSeconds = defaults.segmentDurationSeconds;
    	      this.streamSelection = defaults.streamSelection;
    	      this.useAudioRenditionGroup = defaults.useAudioRenditionGroup;
        }

        public Builder setAdMarkers(@Nullable OriginEndpointHlsPackageAdMarkers adMarkers) {
            this.adMarkers = adMarkers;
            return this;
        }

        public Builder setAdTriggers(@Nullable List<OriginEndpointHlsPackageAdTriggersItem> adTriggers) {
            this.adTriggers = adTriggers;
            return this;
        }

        public Builder setAdsOnDeliveryRestrictions(@Nullable OriginEndpointAdsOnDeliveryRestrictions adsOnDeliveryRestrictions) {
            this.adsOnDeliveryRestrictions = adsOnDeliveryRestrictions;
            return this;
        }

        public Builder setEncryption(@Nullable OriginEndpointHlsEncryption encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder setIncludeIframeOnlyStream(@Nullable Boolean includeIframeOnlyStream) {
            this.includeIframeOnlyStream = includeIframeOnlyStream;
            return this;
        }

        public Builder setPlaylistType(@Nullable OriginEndpointHlsPackagePlaylistType playlistType) {
            this.playlistType = playlistType;
            return this;
        }

        public Builder setPlaylistWindowSeconds(@Nullable Integer playlistWindowSeconds) {
            this.playlistWindowSeconds = playlistWindowSeconds;
            return this;
        }

        public Builder setProgramDateTimeIntervalSeconds(@Nullable Integer programDateTimeIntervalSeconds) {
            this.programDateTimeIntervalSeconds = programDateTimeIntervalSeconds;
            return this;
        }

        public Builder setSegmentDurationSeconds(@Nullable Integer segmentDurationSeconds) {
            this.segmentDurationSeconds = segmentDurationSeconds;
            return this;
        }

        public Builder setStreamSelection(@Nullable OriginEndpointStreamSelection streamSelection) {
            this.streamSelection = streamSelection;
            return this;
        }

        public Builder setUseAudioRenditionGroup(@Nullable Boolean useAudioRenditionGroup) {
            this.useAudioRenditionGroup = useAudioRenditionGroup;
            return this;
        }
        public OriginEndpointHlsPackage build() {
            return new OriginEndpointHlsPackage(adMarkers, adTriggers, adsOnDeliveryRestrictions, encryption, includeIframeOnlyStream, playlistType, playlistWindowSeconds, programDateTimeIntervalSeconds, segmentDurationSeconds, streamSelection, useAudioRenditionGroup);
        }
    }
}
