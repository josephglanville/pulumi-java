// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Select audio tracks from the input by specifying a track identifier.
 * 
 */
public final class SelectAudioTrackByIdResponse extends io.pulumi.resources.InvokeArgs {

    public static final SelectAudioTrackByIdResponse Empty = new SelectAudioTrackByIdResponse();

    /**
     * Optional designation for single channel audio tracks.  Can be used to combine the tracks into stereo or multi-channel audio tracks.
     * 
     */
    @Import(name="channelMapping")
      private final @Nullable String channelMapping;

    public Optional<String> getChannelMapping() {
        return this.channelMapping == null ? Optional.empty() : Optional.ofNullable(this.channelMapping);
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.SelectAudioTrackById'.
     * 
     */
    @Import(name="odataType", required=true)
      private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    /**
     * Track identifier to select
     * 
     */
    @Import(name="trackId", required=true)
      private final Double trackId;

    public Double getTrackId() {
        return this.trackId;
    }

    public SelectAudioTrackByIdResponse(
        @Nullable String channelMapping,
        String odataType,
        Double trackId) {
        this.channelMapping = channelMapping;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.trackId = Objects.requireNonNull(trackId, "expected parameter 'trackId' to be non-null");
    }

    private SelectAudioTrackByIdResponse() {
        this.channelMapping = null;
        this.odataType = null;
        this.trackId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SelectAudioTrackByIdResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String channelMapping;
        private String odataType;
        private Double trackId;

        public Builder() {
    	      // Empty
        }

        public Builder(SelectAudioTrackByIdResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelMapping = defaults.channelMapping;
    	      this.odataType = defaults.odataType;
    	      this.trackId = defaults.trackId;
        }

        public Builder channelMapping(@Nullable String channelMapping) {
            this.channelMapping = channelMapping;
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder trackId(Double trackId) {
            this.trackId = Objects.requireNonNull(trackId);
            return this;
        }        public SelectAudioTrackByIdResponse build() {
            return new SelectAudioTrackByIdResponse(channelMapping, odataType, trackId);
        }
    }
}
