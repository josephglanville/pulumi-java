// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The authorization properties for accessing the source code repository.
 * 
 */
public final class AuthInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final AuthInfoResponse Empty = new AuthInfoResponse();

    /**
     * Time in seconds that the token remains valid
     * 
     */
    @Import(name="expiresIn")
      private final @Nullable Integer expiresIn;

    public Optional<Integer> getExpiresIn() {
        return this.expiresIn == null ? Optional.empty() : Optional.ofNullable(this.expiresIn);
    }

    /**
     * The refresh token used to refresh the access token.
     * 
     */
    @Import(name="refreshToken")
      private final @Nullable String refreshToken;

    public Optional<String> getRefreshToken() {
        return this.refreshToken == null ? Optional.empty() : Optional.ofNullable(this.refreshToken);
    }

    /**
     * The scope of the access token.
     * 
     */
    @Import(name="scope")
      private final @Nullable String scope;

    public Optional<String> getScope() {
        return this.scope == null ? Optional.empty() : Optional.ofNullable(this.scope);
    }

    /**
     * The access token used to access the source control provider.
     * 
     */
    @Import(name="token", required=true)
      private final String token;

    public String getToken() {
        return this.token;
    }

    /**
     * The type of Auth token.
     * 
     */
    @Import(name="tokenType", required=true)
      private final String tokenType;

    public String getTokenType() {
        return this.tokenType;
    }

    public AuthInfoResponse(
        @Nullable Integer expiresIn,
        @Nullable String refreshToken,
        @Nullable String scope,
        String token,
        String tokenType) {
        this.expiresIn = expiresIn;
        this.refreshToken = refreshToken;
        this.scope = scope;
        this.token = Objects.requireNonNull(token, "expected parameter 'token' to be non-null");
        this.tokenType = Objects.requireNonNull(tokenType, "expected parameter 'tokenType' to be non-null");
    }

    private AuthInfoResponse() {
        this.expiresIn = null;
        this.refreshToken = null;
        this.scope = null;
        this.token = null;
        this.tokenType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer expiresIn;
        private @Nullable String refreshToken;
        private @Nullable String scope;
        private String token;
        private String tokenType;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expiresIn = defaults.expiresIn;
    	      this.refreshToken = defaults.refreshToken;
    	      this.scope = defaults.scope;
    	      this.token = defaults.token;
    	      this.tokenType = defaults.tokenType;
        }

        public Builder expiresIn(@Nullable Integer expiresIn) {
            this.expiresIn = expiresIn;
            return this;
        }
        public Builder refreshToken(@Nullable String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }
        public Builder scope(@Nullable String scope) {
            this.scope = scope;
            return this;
        }
        public Builder token(String token) {
            this.token = Objects.requireNonNull(token);
            return this;
        }
        public Builder tokenType(String tokenType) {
            this.tokenType = Objects.requireNonNull(tokenType);
            return this;
        }        public AuthInfoResponse build() {
            return new AuthInfoResponse(expiresIn, refreshToken, scope, token, tokenType);
        }
    }
}
