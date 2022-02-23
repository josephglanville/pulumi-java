// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.rds.inputs;

import io.pulumi.awsnative.rds.enums.DBProxyAuthFormatAuthScheme;
import io.pulumi.awsnative.rds.enums.DBProxyAuthFormatIAMAuth;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DBProxyAuthFormatArgs extends io.pulumi.resources.ResourceArgs {

    public static final DBProxyAuthFormatArgs Empty = new DBProxyAuthFormatArgs();

    /**
     * The type of authentication that the proxy uses for connections from the proxy to the underlying database.
     * 
     */
    @InputImport(name="authScheme")
      private final @Nullable Input<DBProxyAuthFormatAuthScheme> authScheme;

    public Input<DBProxyAuthFormatAuthScheme> getAuthScheme() {
        return this.authScheme == null ? Input.empty() : this.authScheme;
    }

    /**
     * A user-specified description about the authentication used by a proxy to log in as a specific database user.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Whether to require or disallow AWS Identity and Access Management (IAM) authentication for connections to the proxy.
     * 
     */
    @InputImport(name="iAMAuth")
      private final @Nullable Input<DBProxyAuthFormatIAMAuth> iAMAuth;

    public Input<DBProxyAuthFormatIAMAuth> getIAMAuth() {
        return this.iAMAuth == null ? Input.empty() : this.iAMAuth;
    }

    /**
     * The Amazon Resource Name (ARN) representing the secret that the proxy uses to authenticate to the RDS DB instance or Aurora DB cluster. These secrets are stored within Amazon Secrets Manager.
     * 
     */
    @InputImport(name="secretArn")
      private final @Nullable Input<String> secretArn;

    public Input<String> getSecretArn() {
        return this.secretArn == null ? Input.empty() : this.secretArn;
    }

    /**
     * The name of the database user to which the proxy connects.
     * 
     */
    @InputImport(name="userName")
      private final @Nullable Input<String> userName;

    public Input<String> getUserName() {
        return this.userName == null ? Input.empty() : this.userName;
    }

    public DBProxyAuthFormatArgs(
        @Nullable Input<DBProxyAuthFormatAuthScheme> authScheme,
        @Nullable Input<String> description,
        @Nullable Input<DBProxyAuthFormatIAMAuth> iAMAuth,
        @Nullable Input<String> secretArn,
        @Nullable Input<String> userName) {
        this.authScheme = authScheme;
        this.description = description;
        this.iAMAuth = iAMAuth;
        this.secretArn = secretArn;
        this.userName = userName;
    }

    private DBProxyAuthFormatArgs() {
        this.authScheme = Input.empty();
        this.description = Input.empty();
        this.iAMAuth = Input.empty();
        this.secretArn = Input.empty();
        this.userName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DBProxyAuthFormatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DBProxyAuthFormatAuthScheme> authScheme;
        private @Nullable Input<String> description;
        private @Nullable Input<DBProxyAuthFormatIAMAuth> iAMAuth;
        private @Nullable Input<String> secretArn;
        private @Nullable Input<String> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(DBProxyAuthFormatArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authScheme = defaults.authScheme;
    	      this.description = defaults.description;
    	      this.iAMAuth = defaults.iAMAuth;
    	      this.secretArn = defaults.secretArn;
    	      this.userName = defaults.userName;
        }

        public Builder setAuthScheme(@Nullable Input<DBProxyAuthFormatAuthScheme> authScheme) {
            this.authScheme = authScheme;
            return this;
        }

        public Builder setAuthScheme(@Nullable DBProxyAuthFormatAuthScheme authScheme) {
            this.authScheme = Input.ofNullable(authScheme);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setIAMAuth(@Nullable Input<DBProxyAuthFormatIAMAuth> iAMAuth) {
            this.iAMAuth = iAMAuth;
            return this;
        }

        public Builder setIAMAuth(@Nullable DBProxyAuthFormatIAMAuth iAMAuth) {
            this.iAMAuth = Input.ofNullable(iAMAuth);
            return this;
        }

        public Builder setSecretArn(@Nullable Input<String> secretArn) {
            this.secretArn = secretArn;
            return this;
        }

        public Builder setSecretArn(@Nullable String secretArn) {
            this.secretArn = Input.ofNullable(secretArn);
            return this;
        }

        public Builder setUserName(@Nullable Input<String> userName) {
            this.userName = userName;
            return this;
        }

        public Builder setUserName(@Nullable String userName) {
            this.userName = Input.ofNullable(userName);
            return this;
        }
        public DBProxyAuthFormatArgs build() {
            return new DBProxyAuthFormatArgs(authScheme, description, iAMAuth, secretArn, userName);
        }
    }
}
