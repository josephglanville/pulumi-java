// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.enums.AuthenticationType;
import io.pulumi.azurenative.datamigration.enums.SqlSourcePlatform;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Information for connecting to SQL database server
 * 
 */
public final class SqlConnectionInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlConnectionInfoArgs Empty = new SqlConnectionInfoArgs();

    /**
     * Additional connection settings
     * 
     */
    @Import(name="additionalSettings")
      private final @Nullable Output<String> additionalSettings;

    public Output<String> getAdditionalSettings() {
        return this.additionalSettings == null ? Output.empty() : this.additionalSettings;
    }

    /**
     * Authentication type to use for connection
     * 
     */
    @Import(name="authentication")
      private final @Nullable Output<Either<String,AuthenticationType>> authentication;

    public Output<Either<String,AuthenticationType>> getAuthentication() {
        return this.authentication == null ? Output.empty() : this.authentication;
    }

    /**
     * Data source in the format Protocol:MachineName\SQLServerInstanceName,PortNumber
     * 
     */
    @Import(name="dataSource", required=true)
      private final Output<String> dataSource;

    public Output<String> getDataSource() {
        return this.dataSource;
    }

    /**
     * Whether to encrypt the connection
     * 
     */
    @Import(name="encryptConnection")
      private final @Nullable Output<Boolean> encryptConnection;

    public Output<Boolean> getEncryptConnection() {
        return this.encryptConnection == null ? Output.empty() : this.encryptConnection;
    }

    /**
     * Password credential.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<String> password;

    public Output<String> getPassword() {
        return this.password == null ? Output.empty() : this.password;
    }

    /**
     * Server platform type for connection
     * 
     */
    @Import(name="platform")
      private final @Nullable Output<Either<String,SqlSourcePlatform>> platform;

    public Output<Either<String,SqlSourcePlatform>> getPlatform() {
        return this.platform == null ? Output.empty() : this.platform;
    }

    /**
     * Whether to trust the server certificate
     * 
     */
    @Import(name="trustServerCertificate")
      private final @Nullable Output<Boolean> trustServerCertificate;

    public Output<Boolean> getTrustServerCertificate() {
        return this.trustServerCertificate == null ? Output.empty() : this.trustServerCertificate;
    }

    /**
     * Type of connection info
     * Expected value is 'SqlConnectionInfo'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    /**
     * User name
     * 
     */
    @Import(name="userName")
      private final @Nullable Output<String> userName;

    public Output<String> getUserName() {
        return this.userName == null ? Output.empty() : this.userName;
    }

    public SqlConnectionInfoArgs(
        @Nullable Output<String> additionalSettings,
        @Nullable Output<Either<String,AuthenticationType>> authentication,
        Output<String> dataSource,
        @Nullable Output<Boolean> encryptConnection,
        @Nullable Output<String> password,
        @Nullable Output<Either<String,SqlSourcePlatform>> platform,
        @Nullable Output<Boolean> trustServerCertificate,
        Output<String> type,
        @Nullable Output<String> userName) {
        this.additionalSettings = additionalSettings;
        this.authentication = authentication;
        this.dataSource = Objects.requireNonNull(dataSource, "expected parameter 'dataSource' to be non-null");
        this.encryptConnection = encryptConnection == null ? Output.ofNullable(true) : encryptConnection;
        this.password = password;
        this.platform = platform;
        this.trustServerCertificate = trustServerCertificate == null ? Output.ofNullable(false) : trustServerCertificate;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userName = userName;
    }

    private SqlConnectionInfoArgs() {
        this.additionalSettings = Output.empty();
        this.authentication = Output.empty();
        this.dataSource = Output.empty();
        this.encryptConnection = Output.empty();
        this.password = Output.empty();
        this.platform = Output.empty();
        this.trustServerCertificate = Output.empty();
        this.type = Output.empty();
        this.userName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlConnectionInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> additionalSettings;
        private @Nullable Output<Either<String,AuthenticationType>> authentication;
        private Output<String> dataSource;
        private @Nullable Output<Boolean> encryptConnection;
        private @Nullable Output<String> password;
        private @Nullable Output<Either<String,SqlSourcePlatform>> platform;
        private @Nullable Output<Boolean> trustServerCertificate;
        private Output<String> type;
        private @Nullable Output<String> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlConnectionInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalSettings = defaults.additionalSettings;
    	      this.authentication = defaults.authentication;
    	      this.dataSource = defaults.dataSource;
    	      this.encryptConnection = defaults.encryptConnection;
    	      this.password = defaults.password;
    	      this.platform = defaults.platform;
    	      this.trustServerCertificate = defaults.trustServerCertificate;
    	      this.type = defaults.type;
    	      this.userName = defaults.userName;
        }

        public Builder additionalSettings(@Nullable Output<String> additionalSettings) {
            this.additionalSettings = additionalSettings;
            return this;
        }
        public Builder additionalSettings(@Nullable String additionalSettings) {
            this.additionalSettings = Output.ofNullable(additionalSettings);
            return this;
        }
        public Builder authentication(@Nullable Output<Either<String,AuthenticationType>> authentication) {
            this.authentication = authentication;
            return this;
        }
        public Builder authentication(@Nullable Either<String,AuthenticationType> authentication) {
            this.authentication = Output.ofNullable(authentication);
            return this;
        }
        public Builder dataSource(Output<String> dataSource) {
            this.dataSource = Objects.requireNonNull(dataSource);
            return this;
        }
        public Builder dataSource(String dataSource) {
            this.dataSource = Output.of(Objects.requireNonNull(dataSource));
            return this;
        }
        public Builder encryptConnection(@Nullable Output<Boolean> encryptConnection) {
            this.encryptConnection = encryptConnection;
            return this;
        }
        public Builder encryptConnection(@Nullable Boolean encryptConnection) {
            this.encryptConnection = Output.ofNullable(encryptConnection);
            return this;
        }
        public Builder password(@Nullable Output<String> password) {
            this.password = password;
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = Output.ofNullable(password);
            return this;
        }
        public Builder platform(@Nullable Output<Either<String,SqlSourcePlatform>> platform) {
            this.platform = platform;
            return this;
        }
        public Builder platform(@Nullable Either<String,SqlSourcePlatform> platform) {
            this.platform = Output.ofNullable(platform);
            return this;
        }
        public Builder trustServerCertificate(@Nullable Output<Boolean> trustServerCertificate) {
            this.trustServerCertificate = trustServerCertificate;
            return this;
        }
        public Builder trustServerCertificate(@Nullable Boolean trustServerCertificate) {
            this.trustServerCertificate = Output.ofNullable(trustServerCertificate);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder userName(@Nullable Output<String> userName) {
            this.userName = userName;
            return this;
        }
        public Builder userName(@Nullable String userName) {
            this.userName = Output.ofNullable(userName);
            return this;
        }        public SqlConnectionInfoArgs build() {
            return new SqlConnectionInfoArgs(additionalSettings, authentication, dataSource, encryptConnection, password, platform, trustServerCertificate, type, userName);
        }
    }
}
