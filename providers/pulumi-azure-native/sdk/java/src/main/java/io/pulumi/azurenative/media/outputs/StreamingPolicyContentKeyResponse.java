// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.TrackSelectionResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class StreamingPolicyContentKeyResponse {
    private final @Nullable String label;
    private final @Nullable String policyName;
    private final @Nullable List<TrackSelectionResponse> tracks;

    @OutputCustomType.Constructor({"label","policyName","tracks"})
    private StreamingPolicyContentKeyResponse(
        @Nullable String label,
        @Nullable String policyName,
        @Nullable List<TrackSelectionResponse> tracks) {
        this.label = label;
        this.policyName = policyName;
        this.tracks = tracks;
    }

    public Optional<String> getLabel() {
        return Optional.ofNullable(this.label);
    }
    public Optional<String> getPolicyName() {
        return Optional.ofNullable(this.policyName);
    }
    public List<TrackSelectionResponse> getTracks() {
        return this.tracks == null ? List.of() : this.tracks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamingPolicyContentKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String label;
        private @Nullable String policyName;
        private @Nullable List<TrackSelectionResponse> tracks;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamingPolicyContentKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.label = defaults.label;
    	      this.policyName = defaults.policyName;
    	      this.tracks = defaults.tracks;
        }

        public Builder setLabel(@Nullable String label) {
            this.label = label;
            return this;
        }

        public Builder setPolicyName(@Nullable String policyName) {
            this.policyName = policyName;
            return this;
        }

        public Builder setTracks(@Nullable List<TrackSelectionResponse> tracks) {
            this.tracks = tracks;
            return this;
        }

        public StreamingPolicyContentKeyResponse build() {
            return new StreamingPolicyContentKeyResponse(label, policyName, tracks);
        }
    }
}
