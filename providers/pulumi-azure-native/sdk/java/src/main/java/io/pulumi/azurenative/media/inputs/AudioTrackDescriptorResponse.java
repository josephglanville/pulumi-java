// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A TrackSelection to select audio tracks.
 * 
 */
public final class AudioTrackDescriptorResponse extends io.pulumi.resources.InvokeArgs {

    public static final AudioTrackDescriptorResponse Empty = new AudioTrackDescriptorResponse();

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
     * Expected value is '#Microsoft.Media.AudioTrackDescriptor'.
     * 
     */
    @Import(name="odataType", required=true)
      private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    public AudioTrackDescriptorResponse(
        @Nullable String channelMapping,
        String odataType) {
        this.channelMapping = channelMapping;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private AudioTrackDescriptorResponse() {
        this.channelMapping = null;
        this.odataType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AudioTrackDescriptorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String channelMapping;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(AudioTrackDescriptorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelMapping = defaults.channelMapping;
    	      this.odataType = defaults.odataType;
        }

        public Builder channelMapping(@Nullable String channelMapping) {
            this.channelMapping = channelMapping;
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }        public AudioTrackDescriptorResponse build() {
            return new AudioTrackDescriptorResponse(channelMapping, odataType);
        }
    }
}
