// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetNetworkExperimentProfileResult {
    private final @Nullable String enabledState;
    private final @Nullable String etag;
    private final String id;
    private final @Nullable String location;
    private final String name;
    private final String resourceState;
    private final @Nullable Map<String,String> tags;
    private final String type;

    @OutputCustomType.Constructor({"enabledState","etag","id","location","name","resourceState","tags","type"})
    private GetNetworkExperimentProfileResult(
        @Nullable String enabledState,
        @Nullable String etag,
        String id,
        @Nullable String location,
        String name,
        String resourceState,
        @Nullable Map<String,String> tags,
        String type) {
        this.enabledState = enabledState;
        this.etag = etag;
        this.id = Objects.requireNonNull(id);
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.resourceState = Objects.requireNonNull(resourceState);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    public Optional<String> getEnabledState() {
        return Optional.ofNullable(this.enabledState);
    }
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    public String getId() {
        return this.id;
    }
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    public String getName() {
        return this.name;
    }
    public String getResourceState() {
        return this.resourceState;
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkExperimentProfileResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String enabledState;
        private @Nullable String etag;
        private String id;
        private @Nullable String location;
        private String name;
        private String resourceState;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkExperimentProfileResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabledState = defaults.enabledState;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.resourceState = defaults.resourceState;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setEnabledState(@Nullable String enabledState) {
            this.enabledState = enabledState;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setResourceState(String resourceState) {
            this.resourceState = Objects.requireNonNull(resourceState);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetNetworkExperimentProfileResult build() {
            return new GetNetworkExperimentProfileResult(enabledState, etag, id, location, name, resourceState, tags, type);
        }
    }
}
