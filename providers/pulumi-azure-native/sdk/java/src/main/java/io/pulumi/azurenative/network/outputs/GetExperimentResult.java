// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ExperimentEndpointResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetExperimentResult {
    private final @Nullable String description;
    private final @Nullable String enabledState;
    private final @Nullable ExperimentEndpointResponse endpointA;
    private final @Nullable ExperimentEndpointResponse endpointB;
    private final String id;
    private final @Nullable String location;
    private final String name;
    private final String resourceState;
    private final String scriptFileUri;
    private final String status;
    private final @Nullable Map<String,String> tags;
    private final String type;

    @OutputCustomType.Constructor({"description","enabledState","endpointA","endpointB","id","location","name","resourceState","scriptFileUri","status","tags","type"})
    private GetExperimentResult(
        @Nullable String description,
        @Nullable String enabledState,
        @Nullable ExperimentEndpointResponse endpointA,
        @Nullable ExperimentEndpointResponse endpointB,
        String id,
        @Nullable String location,
        String name,
        String resourceState,
        String scriptFileUri,
        String status,
        @Nullable Map<String,String> tags,
        String type) {
        this.description = description;
        this.enabledState = enabledState;
        this.endpointA = endpointA;
        this.endpointB = endpointB;
        this.id = Objects.requireNonNull(id);
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.resourceState = Objects.requireNonNull(resourceState);
        this.scriptFileUri = Objects.requireNonNull(scriptFileUri);
        this.status = Objects.requireNonNull(status);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> getEnabledState() {
        return Optional.ofNullable(this.enabledState);
    }
    public Optional<ExperimentEndpointResponse> getEndpointA() {
        return Optional.ofNullable(this.endpointA);
    }
    public Optional<ExperimentEndpointResponse> getEndpointB() {
        return Optional.ofNullable(this.endpointB);
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
    public String getScriptFileUri() {
        return this.scriptFileUri;
    }
    public String getStatus() {
        return this.status;
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

    public static Builder builder(GetExperimentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable String enabledState;
        private @Nullable ExperimentEndpointResponse endpointA;
        private @Nullable ExperimentEndpointResponse endpointB;
        private String id;
        private @Nullable String location;
        private String name;
        private String resourceState;
        private String scriptFileUri;
        private String status;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExperimentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.enabledState = defaults.enabledState;
    	      this.endpointA = defaults.endpointA;
    	      this.endpointB = defaults.endpointB;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.resourceState = defaults.resourceState;
    	      this.scriptFileUri = defaults.scriptFileUri;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEnabledState(@Nullable String enabledState) {
            this.enabledState = enabledState;
            return this;
        }

        public Builder setEndpointA(@Nullable ExperimentEndpointResponse endpointA) {
            this.endpointA = endpointA;
            return this;
        }

        public Builder setEndpointB(@Nullable ExperimentEndpointResponse endpointB) {
            this.endpointB = endpointB;
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

        public Builder setScriptFileUri(String scriptFileUri) {
            this.scriptFileUri = Objects.requireNonNull(scriptFileUri);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
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

        public GetExperimentResult build() {
            return new GetExperimentResult(description, enabledState, endpointA, endpointB, id, location, name, resourceState, scriptFileUri, status, tags, type);
        }
    }
}
