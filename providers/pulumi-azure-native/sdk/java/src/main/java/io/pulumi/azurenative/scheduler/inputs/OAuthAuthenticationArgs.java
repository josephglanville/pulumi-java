// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OAuthAuthenticationArgs extends io.pulumi.resources.ResourceArgs {

    public static final OAuthAuthenticationArgs Empty = new OAuthAuthenticationArgs();

    /**
     * Gets or sets the audience.
     * 
     */
    @InputImport(name="audience")
      private final @Nullable Input<String> audience;

    public Input<String> getAudience() {
        return this.audience == null ? Input.empty() : this.audience;
    }

    /**
     * Gets or sets the client identifier.
     * 
     */
    @InputImport(name="clientId")
      private final @Nullable Input<String> clientId;

    public Input<String> getClientId() {
        return this.clientId == null ? Input.empty() : this.clientId;
    }

    /**
     * Gets or sets the secret, return value will always be empty.
     * 
     */
    @InputImport(name="secret")
      private final @Nullable Input<String> secret;

    public Input<String> getSecret() {
        return this.secret == null ? Input.empty() : this.secret;
    }

    /**
     * Gets or sets the tenant.
     * 
     */
    @InputImport(name="tenant")
      private final @Nullable Input<String> tenant;

    public Input<String> getTenant() {
        return this.tenant == null ? Input.empty() : this.tenant;
    }

    /**
     * Gets or sets the HTTP authentication type.
     * Expected value is 'ActiveDirectoryOAuth'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public OAuthAuthenticationArgs(
        @Nullable Input<String> audience,
        @Nullable Input<String> clientId,
        @Nullable Input<String> secret,
        @Nullable Input<String> tenant,
        Input<String> type) {
        this.audience = audience;
        this.clientId = clientId;
        this.secret = secret;
        this.tenant = tenant;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private OAuthAuthenticationArgs() {
        this.audience = Input.empty();
        this.clientId = Input.empty();
        this.secret = Input.empty();
        this.tenant = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OAuthAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> audience;
        private @Nullable Input<String> clientId;
        private @Nullable Input<String> secret;
        private @Nullable Input<String> tenant;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(OAuthAuthenticationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audience = defaults.audience;
    	      this.clientId = defaults.clientId;
    	      this.secret = defaults.secret;
    	      this.tenant = defaults.tenant;
    	      this.type = defaults.type;
        }

        public Builder setAudience(@Nullable Input<String> audience) {
            this.audience = audience;
            return this;
        }

        public Builder setAudience(@Nullable String audience) {
            this.audience = Input.ofNullable(audience);
            return this;
        }

        public Builder setClientId(@Nullable Input<String> clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder setClientId(@Nullable String clientId) {
            this.clientId = Input.ofNullable(clientId);
            return this;
        }

        public Builder setSecret(@Nullable Input<String> secret) {
            this.secret = secret;
            return this;
        }

        public Builder setSecret(@Nullable String secret) {
            this.secret = Input.ofNullable(secret);
            return this;
        }

        public Builder setTenant(@Nullable Input<String> tenant) {
            this.tenant = tenant;
            return this;
        }

        public Builder setTenant(@Nullable String tenant) {
            this.tenant = Input.ofNullable(tenant);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public OAuthAuthenticationArgs build() {
            return new OAuthAuthenticationArgs(audience, clientId, secret, tenant, type);
        }
    }
}
