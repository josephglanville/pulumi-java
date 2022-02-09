// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ExpressRouteCircuitAuthorizationResponse {
    private final @Nullable String authorizationKey;
    private final @Nullable String authorizationUseStatus;
    private final String etag;
    private final @Nullable String id;
    private final @Nullable String name;
    private final String provisioningState;
    private final String type;

    @OutputCustomType.Constructor({"authorizationKey","authorizationUseStatus","etag","id","name","provisioningState","type"})
    private ExpressRouteCircuitAuthorizationResponse(
        @Nullable String authorizationKey,
        @Nullable String authorizationUseStatus,
        String etag,
        @Nullable String id,
        @Nullable String name,
        String provisioningState,
        String type) {
        this.authorizationKey = authorizationKey;
        this.authorizationUseStatus = authorizationUseStatus;
        this.etag = Objects.requireNonNull(etag);
        this.id = id;
        this.name = name;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.type = Objects.requireNonNull(type);
    }

    public Optional<String> getAuthorizationKey() {
        return Optional.ofNullable(this.authorizationKey);
    }
    public Optional<String> getAuthorizationUseStatus() {
        return Optional.ofNullable(this.authorizationUseStatus);
    }
    public String getEtag() {
        return this.etag;
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpressRouteCircuitAuthorizationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authorizationKey;
        private @Nullable String authorizationUseStatus;
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpressRouteCircuitAuthorizationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationKey = defaults.authorizationKey;
    	      this.authorizationUseStatus = defaults.authorizationUseStatus;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder setAuthorizationKey(@Nullable String authorizationKey) {
            this.authorizationKey = authorizationKey;
            return this;
        }

        public Builder setAuthorizationUseStatus(@Nullable String authorizationUseStatus) {
            this.authorizationUseStatus = authorizationUseStatus;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public ExpressRouteCircuitAuthorizationResponse build() {
            return new ExpressRouteCircuitAuthorizationResponse(authorizationKey, authorizationUseStatus, etag, id, name, provisioningState, type);
        }
    }
}
