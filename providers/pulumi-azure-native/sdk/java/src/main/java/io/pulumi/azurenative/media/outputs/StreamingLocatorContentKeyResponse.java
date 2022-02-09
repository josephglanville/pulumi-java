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
public final class StreamingLocatorContentKeyResponse {
    private final String id;
    private final @Nullable String labelReferenceInStreamingPolicy;
    private final String policyName;
    private final List<TrackSelectionResponse> tracks;
    private final String type;
    private final @Nullable String value;

    @OutputCustomType.Constructor({"id","labelReferenceInStreamingPolicy","policyName","tracks","type","value"})
    private StreamingLocatorContentKeyResponse(
        String id,
        @Nullable String labelReferenceInStreamingPolicy,
        String policyName,
        List<TrackSelectionResponse> tracks,
        String type,
        @Nullable String value) {
        this.id = Objects.requireNonNull(id);
        this.labelReferenceInStreamingPolicy = labelReferenceInStreamingPolicy;
        this.policyName = Objects.requireNonNull(policyName);
        this.tracks = Objects.requireNonNull(tracks);
        this.type = Objects.requireNonNull(type);
        this.value = value;
    }

    public String getId() {
        return this.id;
    }
    public Optional<String> getLabelReferenceInStreamingPolicy() {
        return Optional.ofNullable(this.labelReferenceInStreamingPolicy);
    }
    public String getPolicyName() {
        return this.policyName;
    }
    public List<TrackSelectionResponse> getTracks() {
        return this.tracks;
    }
    public String getType() {
        return this.type;
    }
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamingLocatorContentKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String labelReferenceInStreamingPolicy;
        private String policyName;
        private List<TrackSelectionResponse> tracks;
        private String type;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamingLocatorContentKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.labelReferenceInStreamingPolicy = defaults.labelReferenceInStreamingPolicy;
    	      this.policyName = defaults.policyName;
    	      this.tracks = defaults.tracks;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLabelReferenceInStreamingPolicy(@Nullable String labelReferenceInStreamingPolicy) {
            this.labelReferenceInStreamingPolicy = labelReferenceInStreamingPolicy;
            return this;
        }

        public Builder setPolicyName(String policyName) {
            this.policyName = Objects.requireNonNull(policyName);
            return this;
        }

        public Builder setTracks(List<TrackSelectionResponse> tracks) {
            this.tracks = Objects.requireNonNull(tracks);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }

        public StreamingLocatorContentKeyResponse build() {
            return new StreamingLocatorContentKeyResponse(id, labelReferenceInStreamingPolicy, policyName, tracks, type, value);
        }
    }
}
