// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.enums.TokenType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The authorization properties for accessing the source code repository.
 * 
 */
public final class AuthInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final AuthInfoArgs Empty = new AuthInfoArgs();

    /**
     * Time in seconds that the token remains valid
     * 
     */
    @Import(name="expiresIn")
      private final @Nullable Output<Integer> expiresIn;

    public Output<Integer> getExpiresIn() {
        return this.expiresIn == null ? Output.empty() : this.expiresIn;
    }

    /**
     * The refresh token used to refresh the access token.
     * 
     */
    @Import(name="refreshToken")
      private final @Nullable Output<String> refreshToken;

    public Output<String> getRefreshToken() {
        return this.refreshToken == null ? Output.empty() : this.refreshToken;
    }

    /**
     * The scope of the access token.
     * 
     */
    @Import(name="scope")
      private final @Nullable Output<String> scope;

    public Output<String> getScope() {
        return this.scope == null ? Output.empty() : this.scope;
    }

    /**
     * The access token used to access the source control provider.
     * 
     */
    @Import(name="token", required=true)
      private final Output<String> token;

    public Output<String> getToken() {
        return this.token;
    }

    /**
     * The type of Auth token.
     * 
     */
    @Import(name="tokenType", required=true)
      private final Output<Either<String,TokenType>> tokenType;

    public Output<Either<String,TokenType>> getTokenType() {
        return this.tokenType;
    }

    public AuthInfoArgs(
        @Nullable Output<Integer> expiresIn,
        @Nullable Output<String> refreshToken,
        @Nullable Output<String> scope,
        Output<String> token,
        Output<Either<String,TokenType>> tokenType) {
        this.expiresIn = expiresIn;
        this.refreshToken = refreshToken;
        this.scope = scope;
        this.token = Objects.requireNonNull(token, "expected parameter 'token' to be non-null");
        this.tokenType = Objects.requireNonNull(tokenType, "expected parameter 'tokenType' to be non-null");
    }

    private AuthInfoArgs() {
        this.expiresIn = Output.empty();
        this.refreshToken = Output.empty();
        this.scope = Output.empty();
        this.token = Output.empty();
        this.tokenType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> expiresIn;
        private @Nullable Output<String> refreshToken;
        private @Nullable Output<String> scope;
        private Output<String> token;
        private Output<Either<String,TokenType>> tokenType;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expiresIn = defaults.expiresIn;
    	      this.refreshToken = defaults.refreshToken;
    	      this.scope = defaults.scope;
    	      this.token = defaults.token;
    	      this.tokenType = defaults.tokenType;
        }

        public Builder expiresIn(@Nullable Output<Integer> expiresIn) {
            this.expiresIn = expiresIn;
            return this;
        }
        public Builder expiresIn(@Nullable Integer expiresIn) {
            this.expiresIn = Output.ofNullable(expiresIn);
            return this;
        }
        public Builder refreshToken(@Nullable Output<String> refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }
        public Builder refreshToken(@Nullable String refreshToken) {
            this.refreshToken = Output.ofNullable(refreshToken);
            return this;
        }
        public Builder scope(@Nullable Output<String> scope) {
            this.scope = scope;
            return this;
        }
        public Builder scope(@Nullable String scope) {
            this.scope = Output.ofNullable(scope);
            return this;
        }
        public Builder token(Output<String> token) {
            this.token = Objects.requireNonNull(token);
            return this;
        }
        public Builder token(String token) {
            this.token = Output.of(Objects.requireNonNull(token));
            return this;
        }
        public Builder tokenType(Output<Either<String,TokenType>> tokenType) {
            this.tokenType = Objects.requireNonNull(tokenType);
            return this;
        }
        public Builder tokenType(Either<String,TokenType> tokenType) {
            this.tokenType = Output.of(Objects.requireNonNull(tokenType));
            return this;
        }        public AuthInfoArgs build() {
            return new AuthInfoArgs(expiresIn, refreshToken, scope, token, tokenType);
        }
    }
}
