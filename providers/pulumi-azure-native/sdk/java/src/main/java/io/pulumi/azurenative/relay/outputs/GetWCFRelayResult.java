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
public final class GetWCFRelayResult {
    private final String createdAt;
    private final String id;
    private final Boolean isDynamic;
    private final Integer listenerCount;
    private final String name;
    private final @Nullable String relayType;
    private final @Nullable Boolean requiresClientAuthorization;
    private final @Nullable Boolean requiresTransportSecurity;
    private final String type;
    private final String updatedAt;
    private final @Nullable String userMetadata;

    @OutputCustomType.Constructor({"createdAt","id","isDynamic","listenerCount","name","relayType","requiresClientAuthorization","requiresTransportSecurity","type","updatedAt","userMetadata"})
    private GetWCFRelayResult(
        String createdAt,
        String id,
        Boolean isDynamic,
        Integer listenerCount,
        String name,
        @Nullable String relayType,
        @Nullable Boolean requiresClientAuthorization,
        @Nullable Boolean requiresTransportSecurity,
        String type,
        String updatedAt,
        @Nullable String userMetadata) {
        this.createdAt = Objects.requireNonNull(createdAt);
        this.id = Objects.requireNonNull(id);
        this.isDynamic = Objects.requireNonNull(isDynamic);
        this.listenerCount = Objects.requireNonNull(listenerCount);
        this.name = Objects.requireNonNull(name);
        this.relayType = relayType;
        this.requiresClientAuthorization = requiresClientAuthorization;
        this.requiresTransportSecurity = requiresTransportSecurity;
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
    public Boolean getIsDynamic() {
        return this.isDynamic;
    }
    public Integer getListenerCount() {
        return this.listenerCount;
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getRelayType() {
        return Optional.ofNullable(this.relayType);
    }
    public Optional<Boolean> getRequiresClientAuthorization() {
        return Optional.ofNullable(this.requiresClientAuthorization);
    }
    public Optional<Boolean> getRequiresTransportSecurity() {
        return Optional.ofNullable(this.requiresTransportSecurity);
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

    public static Builder builder(GetWCFRelayResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdAt;
        private String id;
        private Boolean isDynamic;
        private Integer listenerCount;
        private String name;
        private @Nullable String relayType;
        private @Nullable Boolean requiresClientAuthorization;
        private @Nullable Boolean requiresTransportSecurity;
        private String type;
        private String updatedAt;
        private @Nullable String userMetadata;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWCFRelayResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.id = defaults.id;
    	      this.isDynamic = defaults.isDynamic;
    	      this.listenerCount = defaults.listenerCount;
    	      this.name = defaults.name;
    	      this.relayType = defaults.relayType;
    	      this.requiresClientAuthorization = defaults.requiresClientAuthorization;
    	      this.requiresTransportSecurity = defaults.requiresTransportSecurity;
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

        public Builder setIsDynamic(Boolean isDynamic) {
            this.isDynamic = Objects.requireNonNull(isDynamic);
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

        public Builder setRelayType(@Nullable String relayType) {
            this.relayType = relayType;
            return this;
        }

        public Builder setRequiresClientAuthorization(@Nullable Boolean requiresClientAuthorization) {
            this.requiresClientAuthorization = requiresClientAuthorization;
            return this;
        }

        public Builder setRequiresTransportSecurity(@Nullable Boolean requiresTransportSecurity) {
            this.requiresTransportSecurity = requiresTransportSecurity;
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

        public GetWCFRelayResult build() {
            return new GetWCFRelayResult(createdAt, id, isDynamic, listenerCount, name, relayType, requiresClientAuthorization, requiresTransportSecurity, type, updatedAt, userMetadata);
        }
    }
}
