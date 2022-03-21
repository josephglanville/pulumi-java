// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProxyAuthGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProxyAuthGetArgs Empty = new ProxyAuthGetArgs();

    /**
     * The type of authentication that the proxy uses for connections from the proxy to the underlying database. One of `SECRETS`.
     * 
     */
    @Import(name="authScheme")
      private final @Nullable Output<String> authScheme;

    public Output<String> getAuthScheme() {
        return this.authScheme == null ? Output.empty() : this.authScheme;
    }

    /**
     * A user-specified description about the authentication used by a proxy to log in as a specific database user.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Whether to require or disallow AWS Identity and Access Management (IAM) authentication for connections to the proxy. One of `DISABLED`, `REQUIRED`.
     * 
     */
    @Import(name="iamAuth")
      private final @Nullable Output<String> iamAuth;

    public Output<String> getIamAuth() {
        return this.iamAuth == null ? Output.empty() : this.iamAuth;
    }

    /**
     * The Amazon Resource Name (ARN) representing the secret that the proxy uses to authenticate to the RDS DB instance or Aurora DB cluster. These secrets are stored within Amazon Secrets Manager.
     * 
     */
    @Import(name="secretArn")
      private final @Nullable Output<String> secretArn;

    public Output<String> getSecretArn() {
        return this.secretArn == null ? Output.empty() : this.secretArn;
    }

    public ProxyAuthGetArgs(
        @Nullable Output<String> authScheme,
        @Nullable Output<String> description,
        @Nullable Output<String> iamAuth,
        @Nullable Output<String> secretArn) {
        this.authScheme = authScheme;
        this.description = description;
        this.iamAuth = iamAuth;
        this.secretArn = secretArn;
    }

    private ProxyAuthGetArgs() {
        this.authScheme = Output.empty();
        this.description = Output.empty();
        this.iamAuth = Output.empty();
        this.secretArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProxyAuthGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> authScheme;
        private @Nullable Output<String> description;
        private @Nullable Output<String> iamAuth;
        private @Nullable Output<String> secretArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ProxyAuthGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authScheme = defaults.authScheme;
    	      this.description = defaults.description;
    	      this.iamAuth = defaults.iamAuth;
    	      this.secretArn = defaults.secretArn;
        }

        public Builder authScheme(@Nullable Output<String> authScheme) {
            this.authScheme = authScheme;
            return this;
        }
        public Builder authScheme(@Nullable String authScheme) {
            this.authScheme = Output.ofNullable(authScheme);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder iamAuth(@Nullable Output<String> iamAuth) {
            this.iamAuth = iamAuth;
            return this;
        }
        public Builder iamAuth(@Nullable String iamAuth) {
            this.iamAuth = Output.ofNullable(iamAuth);
            return this;
        }
        public Builder secretArn(@Nullable Output<String> secretArn) {
            this.secretArn = secretArn;
            return this;
        }
        public Builder secretArn(@Nullable String secretArn) {
            this.secretArn = Output.ofNullable(secretArn);
            return this;
        }        public ProxyAuthGetArgs build() {
            return new ProxyAuthGetArgs(authScheme, description, iamAuth, secretArn);
        }
    }
}
