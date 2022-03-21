// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserPoolClientTokenValidityUnitsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserPoolClientTokenValidityUnitsGetArgs Empty = new UserPoolClientTokenValidityUnitsGetArgs();

    /**
     * Time unit in for the value in `access_token_validity`, defaults to `hours`.
     * 
     */
    @Import(name="accessToken")
      private final @Nullable Output<String> accessToken;

    public Output<String> getAccessToken() {
        return this.accessToken == null ? Output.empty() : this.accessToken;
    }

    /**
     * Time unit in for the value in `id_token_validity`, defaults to `hours`.
     * 
     */
    @Import(name="idToken")
      private final @Nullable Output<String> idToken;

    public Output<String> getIdToken() {
        return this.idToken == null ? Output.empty() : this.idToken;
    }

    /**
     * Time unit in for the value in `refresh_token_validity`, defaults to `days`.
     * 
     */
    @Import(name="refreshToken")
      private final @Nullable Output<String> refreshToken;

    public Output<String> getRefreshToken() {
        return this.refreshToken == null ? Output.empty() : this.refreshToken;
    }

    public UserPoolClientTokenValidityUnitsGetArgs(
        @Nullable Output<String> accessToken,
        @Nullable Output<String> idToken,
        @Nullable Output<String> refreshToken) {
        this.accessToken = accessToken;
        this.idToken = idToken;
        this.refreshToken = refreshToken;
    }

    private UserPoolClientTokenValidityUnitsGetArgs() {
        this.accessToken = Output.empty();
        this.idToken = Output.empty();
        this.refreshToken = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolClientTokenValidityUnitsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accessToken;
        private @Nullable Output<String> idToken;
        private @Nullable Output<String> refreshToken;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolClientTokenValidityUnitsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.idToken = defaults.idToken;
    	      this.refreshToken = defaults.refreshToken;
        }

        public Builder accessToken(@Nullable Output<String> accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public Builder accessToken(@Nullable String accessToken) {
            this.accessToken = Output.ofNullable(accessToken);
            return this;
        }
        public Builder idToken(@Nullable Output<String> idToken) {
            this.idToken = idToken;
            return this;
        }
        public Builder idToken(@Nullable String idToken) {
            this.idToken = Output.ofNullable(idToken);
            return this;
        }
        public Builder refreshToken(@Nullable Output<String> refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }
        public Builder refreshToken(@Nullable String refreshToken) {
            this.refreshToken = Output.ofNullable(refreshToken);
            return this;
        }        public UserPoolClientTokenValidityUnitsGetArgs build() {
            return new UserPoolClientTokenValidityUnitsGetArgs(accessToken, idToken, refreshToken);
        }
    }
}
