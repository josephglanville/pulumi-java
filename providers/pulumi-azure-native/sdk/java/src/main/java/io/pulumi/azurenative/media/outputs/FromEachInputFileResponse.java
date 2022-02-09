// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.AudioTrackDescriptorResponse;
import io.pulumi.azurenative.media.outputs.SelectAudioTrackByAttributeResponse;
import io.pulumi.azurenative.media.outputs.SelectAudioTrackByIdResponse;
import io.pulumi.azurenative.media.outputs.SelectVideoTrackByAttributeResponse;
import io.pulumi.azurenative.media.outputs.SelectVideoTrackByIdResponse;
import io.pulumi.azurenative.media.outputs.VideoTrackDescriptorResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class FromEachInputFileResponse {
    private final @Nullable List<Object> includedTracks;
    private final String odataType;

    @OutputCustomType.Constructor({"includedTracks","odataType"})
    private FromEachInputFileResponse(
        @Nullable List<Object> includedTracks,
        String odataType) {
        this.includedTracks = includedTracks;
        this.odataType = Objects.requireNonNull(odataType);
    }

    public List<Object> getIncludedTracks() {
        return this.includedTracks == null ? List.of() : this.includedTracks;
    }
    public String getOdataType() {
        return this.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FromEachInputFileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> includedTracks;
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(FromEachInputFileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.includedTracks = defaults.includedTracks;
    	      this.odataType = defaults.odataType;
        }

        public Builder setIncludedTracks(@Nullable List<Object> includedTracks) {
            this.includedTracks = includedTracks;
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public FromEachInputFileResponse build() {
            return new FromEachInputFileResponse(includedTracks, odataType);
        }
    }
}
