// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.relay.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetHybridConnectionResult {
    private final String createdAt;
    private final String id;
    private final Integer listenerCount;
    private final String name;
    private final @Nullable Boolean requiresClientAuthorization;
    private final String type;
    private final String updatedAt;
    private final @Nullable String userMetadata;

    @OutputCustomType.Constructor({"createdAt","id","listenerCount","name","requiresClientAuthorization","type","updatedAt","userMetadata"})
    private GetHybridConnectionResult(
        String createdAt,
        String id,
        Integer listenerCount,
        String name,
        @Nullable Boolean requiresClientAuthorization,
        String type,
        String updatedAt,
        @Nullable String userMetadata) {
        this.createdAt = Objects.requireNonNull(createdAt);
        this.id = Objects.requireNonNull(id);
        this.listenerCount = Objects.requireNonNull(listenerCount);
        this.name = Objects.requireNonNull(name);
        this.requiresClientAuthorization = requiresClientAuthorization;
        this.type = Objects.requireNonNull(type);
        this.updatedAt = Objects.requireNonNull(updatedAt);
        this.userMetadata = userMetadata;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }
    public String getId() {
        return this.id;
    }
    public Integer getListenerCount() {
        return this.listenerCount;
    }
    public String getName() {
        return this.name;
    }
    public Optional<Boolean> getRequiresClientAuthorization() {
        return Optional.ofNullable(this.requiresClientAuthorization);
    }
    public String getType() {
        return this.type;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }
    public Optional<String> getUserMetadata() {
        return Optional.ofNullable(this.userMetadata);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHybridConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdAt;
        private String id;
        private Integer listenerCount;
        private String name;
        private @Nullable Boolean requiresClientAuthorization;
        private String type;
        private String updatedAt;
        private @Nullable String userMetadata;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHybridConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.id = defaults.id;
    	      this.listenerCount = defaults.listenerCount;
    	      this.name = defaults.name;
    	      this.requiresClientAuthorization = defaults.requiresClientAuthorization;
    	      this.type = defaults.type;
    	      this.updatedAt = defaults.updatedAt;
    	      this.userMetadata = defaults.userMetadata;
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setListenerCount(Integer listenerCount) {
            this.listenerCount = Objects.requireNonNull(listenerCount);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRequiresClientAuthorization(@Nullable Boolean requiresClientAuthorization) {
            this.requiresClientAuthorization = requiresClientAuthorization;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUpdatedAt(String updatedAt) {
            this.updatedAt = Objects.requireNonNull(updatedAt);
            return this;
        }

        public Builder setUserMetadata(@Nullable String userMetadata) {
            this.userMetadata = userMetadata;
            return this;
        }

        public GetHybridConnectionResult build() {
            return new GetHybridConnectionResult(createdAt, id, listenerCount, name, requiresClientAuthorization, type, updatedAt, userMetadata);
        }
    }
}
