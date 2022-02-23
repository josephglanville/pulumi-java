// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * API OAuth2 Authentication settings details.
 * 
 */
public final class OAuth2AuthenticationSettingsContractResponse extends io.pulumi.resources.InvokeArgs {

    public static final OAuth2AuthenticationSettingsContractResponse Empty = new OAuth2AuthenticationSettingsContractResponse();

    /**
     * OAuth authorization server identifier.
     * 
     */
    @InputImport(name="authorizationServerId")
      private final @Nullable String authorizationServerId;

    public Optional<String> getAuthorizationServerId() {
        return this.authorizationServerId == null ? Optional.empty() : Optional.ofNullable(this.authorizationServerId);
    }

    /**
     * operations scope.
     * 
     */
    @InputImport(name="scope")
      private final @Nullable String scope;

    public Optional<String> getScope() {
        return this.scope == null ? Optional.empty() : Optional.ofNullable(this.scope);
    }

    public OAuth2AuthenticationSettingsContractResponse(
        @Nullable String authorizationServerId,
        @Nullable String scope) {
        this.authorizationServerId = authorizationServerId;
        this.scope = scope;
    }

    private OAuth2AuthenticationSettingsContractResponse() {
        this.authorizationServerId = null;
        this.scope = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OAuth2AuthenticationSettingsContractResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authorizationServerId;
        private @Nullable String scope;

        public Builder() {
    	      // Empty
        }

        public Builder(OAuth2AuthenticationSettingsContractResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationServerId = defaults.authorizationServerId;
    	      this.scope = defaults.scope;
        }

        public Builder setAuthorizationServerId(@Nullable String authorizationServerId) {
            this.authorizationServerId = authorizationServerId;
            return this;
        }

        public Builder setScope(@Nullable String scope) {
            this.scope = scope;
            return this;
        }
        public OAuth2AuthenticationSettingsContractResponse build() {
            return new OAuth2AuthenticationSettingsContractResponse(authorizationServerId, scope);
        }
    }
}
