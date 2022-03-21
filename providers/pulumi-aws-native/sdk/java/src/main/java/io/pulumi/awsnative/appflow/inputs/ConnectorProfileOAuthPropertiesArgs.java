// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectorProfileOAuthPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorProfileOAuthPropertiesArgs Empty = new ConnectorProfileOAuthPropertiesArgs();

    @Import(name="authCodeUrl")
      private final @Nullable Output<String> authCodeUrl;

    public Output<String> getAuthCodeUrl() {
        return this.authCodeUrl == null ? Output.empty() : this.authCodeUrl;
    }

    @Import(name="oAuthScopes")
      private final @Nullable Output<List<String>> oAuthScopes;

    public Output<List<String>> getOAuthScopes() {
        return this.oAuthScopes == null ? Output.empty() : this.oAuthScopes;
    }

    @Import(name="tokenUrl")
      private final @Nullable Output<String> tokenUrl;

    public Output<String> getTokenUrl() {
        return this.tokenUrl == null ? Output.empty() : this.tokenUrl;
    }

    public ConnectorProfileOAuthPropertiesArgs(
        @Nullable Output<String> authCodeUrl,
        @Nullable Output<List<String>> oAuthScopes,
        @Nullable Output<String> tokenUrl) {
        this.authCodeUrl = authCodeUrl;
        this.oAuthScopes = oAuthScopes;
        this.tokenUrl = tokenUrl;
    }

    private ConnectorProfileOAuthPropertiesArgs() {
        this.authCodeUrl = Output.empty();
        this.oAuthScopes = Output.empty();
        this.tokenUrl = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileOAuthPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> authCodeUrl;
        private @Nullable Output<List<String>> oAuthScopes;
        private @Nullable Output<String> tokenUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileOAuthPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authCodeUrl = defaults.authCodeUrl;
    	      this.oAuthScopes = defaults.oAuthScopes;
    	      this.tokenUrl = defaults.tokenUrl;
        }

        public Builder authCodeUrl(@Nullable Output<String> authCodeUrl) {
            this.authCodeUrl = authCodeUrl;
            return this;
        }
        public Builder authCodeUrl(@Nullable String authCodeUrl) {
            this.authCodeUrl = Output.ofNullable(authCodeUrl);
            return this;
        }
        public Builder oAuthScopes(@Nullable Output<List<String>> oAuthScopes) {
            this.oAuthScopes = oAuthScopes;
            return this;
        }
        public Builder oAuthScopes(@Nullable List<String> oAuthScopes) {
            this.oAuthScopes = Output.ofNullable(oAuthScopes);
            return this;
        }
        public Builder oAuthScopes(String... oAuthScopes) {
            return oAuthScopes(List.of(oAuthScopes));
        }
        public Builder tokenUrl(@Nullable Output<String> tokenUrl) {
            this.tokenUrl = tokenUrl;
            return this;
        }
        public Builder tokenUrl(@Nullable String tokenUrl) {
            this.tokenUrl = Output.ofNullable(tokenUrl);
            return this;
        }        public ConnectorProfileOAuthPropertiesArgs build() {
            return new ConnectorProfileOAuthPropertiesArgs(authCodeUrl, oAuthScopes, tokenUrl);
        }
    }
}
