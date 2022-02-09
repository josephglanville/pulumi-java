// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetLinkedServiceResult {
    private final String id;
    private final String name;
    private final @Nullable String provisioningState;
    private final @Nullable String resourceId;
    private final @Nullable Map<String,String> tags;
    private final String type;
    private final @Nullable String writeAccessResourceId;

    @OutputCustomType.Constructor({"id","name","provisioningState","resourceId","tags","type","writeAccessResourceId"})
    private GetLinkedServiceResult(
        String id,
        String name,
        @Nullable String provisioningState,
        @Nullable String resourceId,
        @Nullable Map<String,String> tags,
        String type,
        @Nullable String writeAccessResourceId) {
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.provisioningState = provisioningState;
        this.resourceId = resourceId;
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.writeAccessResourceId = writeAccessResourceId;
    }

    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    public Optional<String> getResourceId() {
        return Optional.ofNullable(this.resourceId);
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getType() {
        return this.type;
    }
    public Optional<String> getWriteAccessResourceId() {
        return Optional.ofNullable(this.writeAccessResourceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLinkedServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private @Nullable String provisioningState;
        private @Nullable String resourceId;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable String writeAccessResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLinkedServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceId = defaults.resourceId;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.writeAccessResourceId = defaults.writeAccessResourceId;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
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

        public Builder setWriteAccessResourceId(@Nullable String writeAccessResourceId) {
            this.writeAccessResourceId = writeAccessResourceId;
            return this;
        }

        public GetLinkedServiceResult build() {
            return new GetLinkedServiceResult(id, name, provisioningState, resourceId, tags, type, writeAccessResourceId);
        }
    }
}
