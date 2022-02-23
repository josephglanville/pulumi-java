// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.rds.inputs;

import io.pulumi.awsnative.rds.enums.DBProxyAuthFormatAuthScheme;
import io.pulumi.awsnative.rds.enums.DBProxyAuthFormatIAMAuth;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DBProxyAuthFormat extends io.pulumi.resources.InvokeArgs {

    public static final DBProxyAuthFormat Empty = new DBProxyAuthFormat();

    /**
     * The type of authentication that the proxy uses for connections from the proxy to the underlying database.
     * 
     */
    @InputImport(name="authScheme")
      private final @Nullable DBProxyAuthFormatAuthScheme authScheme;

    public Optional<DBProxyAuthFormatAuthScheme> getAuthScheme() {
        return this.authScheme == null ? Optional.empty() : Optional.ofNullable(this.authScheme);
    }

    /**
     * A user-specified description about the authentication used by a proxy to log in as a specific database user.
     * 
     */
    @InputImport(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Whether to require or disallow AWS Identity and Access Management (IAM) authentication for connections to the proxy.
     * 
     */
    @InputImport(name="iAMAuth")
      private final @Nullable DBProxyAuthFormatIAMAuth iAMAuth;

    public Optional<DBProxyAuthFormatIAMAuth> getIAMAuth() {
        return this.iAMAuth == null ? Optional.empty() : Optional.ofNullable(this.iAMAuth);
    }

    /**
     * The Amazon Resource Name (ARN) representing the secret that the proxy uses to authenticate to the RDS DB instance or Aurora DB cluster. These secrets are stored within Amazon Secrets Manager.
     * 
     */
    @InputImport(name="secretArn")
      private final @Nullable String secretArn;

    public Optional<String> getSecretArn() {
        return this.secretArn == null ? Optional.empty() : Optional.ofNullable(this.secretArn);
    }

    /**
     * The name of the database user to which the proxy connects.
     * 
     */
    @InputImport(name="userName")
      private final @Nullable String userName;

    public Optional<String> getUserName() {
        return this.userName == null ? Optional.empty() : Optional.ofNullable(this.userName);
    }

    public DBProxyAuthFormat(
        @Nullable DBProxyAuthFormatAuthScheme authScheme,
        @Nullable String description,
        @Nullable DBProxyAuthFormatIAMAuth iAMAuth,
        @Nullable String secretArn,
        @Nullable String userName) {
        this.authScheme = authScheme;
        this.description = description;
        this.iAMAuth = iAMAuth;
        this.secretArn = secretArn;
        this.userName = userName;
    }

    private DBProxyAuthFormat() {
        this.authScheme = null;
        this.description = null;
        this.iAMAuth = null;
        this.secretArn = null;
        this.userName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DBProxyAuthFormat defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DBProxyAuthFormatAuthScheme authScheme;
        private @Nullable String description;
        private @Nullable DBProxyAuthFormatIAMAuth iAMAuth;
        private @Nullable String secretArn;
        private @Nullable String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(DBProxyAuthFormat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authScheme = defaults.authScheme;
    	      this.description = defaults.description;
    	      this.iAMAuth = defaults.iAMAuth;
    	      this.secretArn = defaults.secretArn;
    	      this.userName = defaults.userName;
        }

        public Builder setAuthScheme(@Nullable DBProxyAuthFormatAuthScheme authScheme) {
            this.authScheme = authScheme;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setIAMAuth(@Nullable DBProxyAuthFormatIAMAuth iAMAuth) {
            this.iAMAuth = iAMAuth;
            return this;
        }

        public Builder setSecretArn(@Nullable String secretArn) {
            this.secretArn = secretArn;
            return this;
        }

        public Builder setUserName(@Nullable String userName) {
            this.userName = userName;
            return this;
        }
        public DBProxyAuthFormat build() {
            return new DBProxyAuthFormat(authScheme, description, iAMAuth, secretArn, userName);
        }
    }
}
