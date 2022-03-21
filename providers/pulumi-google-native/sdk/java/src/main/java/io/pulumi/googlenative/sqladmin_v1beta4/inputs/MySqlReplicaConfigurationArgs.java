// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1beta4.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Read-replica configuration specific to MySQL databases.
 * 
 */
public final class MySqlReplicaConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final MySqlReplicaConfigurationArgs Empty = new MySqlReplicaConfigurationArgs();

    /**
     * PEM representation of the trusted CA's x509 certificate.
     * 
     */
    @Import(name="caCertificate")
      private final @Nullable Output<String> caCertificate;

    public Output<String> getCaCertificate() {
        return this.caCertificate == null ? Output.empty() : this.caCertificate;
    }

    /**
     * PEM representation of the replica's x509 certificate.
     * 
     */
    @Import(name="clientCertificate")
      private final @Nullable Output<String> clientCertificate;

    public Output<String> getClientCertificate() {
        return this.clientCertificate == null ? Output.empty() : this.clientCertificate;
    }

    /**
     * PEM representation of the replica's private key. The corresponsing public key is encoded in the client's certificate.
     * 
     */
    @Import(name="clientKey")
      private final @Nullable Output<String> clientKey;

    public Output<String> getClientKey() {
        return this.clientKey == null ? Output.empty() : this.clientKey;
    }

    /**
     * Seconds to wait between connect retries. MySQL's default is 60 seconds.
     * 
     */
    @Import(name="connectRetryInterval")
      private final @Nullable Output<Integer> connectRetryInterval;

    public Output<Integer> getConnectRetryInterval() {
        return this.connectRetryInterval == null ? Output.empty() : this.connectRetryInterval;
    }

    /**
     * Path to a SQL dump file in Google Cloud Storage from which the replica instance is to be created. The URI is in the form gs://bucketName/fileName. Compressed gzip files (.gz) are also supported. Dumps have the binlog co-ordinates from which replication begins. This can be accomplished by setting --master-data to 1 when using mysqldump.
     * 
     */
    @Import(name="dumpFilePath")
      private final @Nullable Output<String> dumpFilePath;

    public Output<String> getDumpFilePath() {
        return this.dumpFilePath == null ? Output.empty() : this.dumpFilePath;
    }

    /**
     * This is always `sql#mysqlReplicaConfiguration`.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    /**
     * Interval in milliseconds between replication heartbeats.
     * 
     */
    @Import(name="masterHeartbeatPeriod")
      private final @Nullable Output<String> masterHeartbeatPeriod;

    public Output<String> getMasterHeartbeatPeriod() {
        return this.masterHeartbeatPeriod == null ? Output.empty() : this.masterHeartbeatPeriod;
    }

    /**
     * The password for the replication connection.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<String> password;

    public Output<String> getPassword() {
        return this.password == null ? Output.empty() : this.password;
    }

    /**
     * A list of permissible ciphers to use for SSL encryption.
     * 
     */
    @Import(name="sslCipher")
      private final @Nullable Output<String> sslCipher;

    public Output<String> getSslCipher() {
        return this.sslCipher == null ? Output.empty() : this.sslCipher;
    }

    /**
     * The username for the replication connection.
     * 
     */
    @Import(name="username")
      private final @Nullable Output<String> username;

    public Output<String> getUsername() {
        return this.username == null ? Output.empty() : this.username;
    }

    /**
     * Whether or not to check the primary instance's Common Name value in the certificate that it sends during the SSL handshake.
     * 
     */
    @Import(name="verifyServerCertificate")
      private final @Nullable Output<Boolean> verifyServerCertificate;

    public Output<Boolean> getVerifyServerCertificate() {
        return this.verifyServerCertificate == null ? Output.empty() : this.verifyServerCertificate;
    }

    public MySqlReplicaConfigurationArgs(
        @Nullable Output<String> caCertificate,
        @Nullable Output<String> clientCertificate,
        @Nullable Output<String> clientKey,
        @Nullable Output<Integer> connectRetryInterval,
        @Nullable Output<String> dumpFilePath,
        @Nullable Output<String> kind,
        @Nullable Output<String> masterHeartbeatPeriod,
        @Nullable Output<String> password,
        @Nullable Output<String> sslCipher,
        @Nullable Output<String> username,
        @Nullable Output<Boolean> verifyServerCertificate) {
        this.caCertificate = caCertificate;
        this.clientCertificate = clientCertificate;
        this.clientKey = clientKey;
        this.connectRetryInterval = connectRetryInterval;
        this.dumpFilePath = dumpFilePath;
        this.kind = kind;
        this.masterHeartbeatPeriod = masterHeartbeatPeriod;
        this.password = password;
        this.sslCipher = sslCipher;
        this.username = username;
        this.verifyServerCertificate = verifyServerCertificate;
    }

    private MySqlReplicaConfigurationArgs() {
        this.caCertificate = Output.empty();
        this.clientCertificate = Output.empty();
        this.clientKey = Output.empty();
        this.connectRetryInterval = Output.empty();
        this.dumpFilePath = Output.empty();
        this.kind = Output.empty();
        this.masterHeartbeatPeriod = Output.empty();
        this.password = Output.empty();
        this.sslCipher = Output.empty();
        this.username = Output.empty();
        this.verifyServerCertificate = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MySqlReplicaConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> caCertificate;
        private @Nullable Output<String> clientCertificate;
        private @Nullable Output<String> clientKey;
        private @Nullable Output<Integer> connectRetryInterval;
        private @Nullable Output<String> dumpFilePath;
        private @Nullable Output<String> kind;
        private @Nullable Output<String> masterHeartbeatPeriod;
        private @Nullable Output<String> password;
        private @Nullable Output<String> sslCipher;
        private @Nullable Output<String> username;
        private @Nullable Output<Boolean> verifyServerCertificate;

        public Builder() {
    	      // Empty
        }

        public Builder(MySqlReplicaConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caCertificate = defaults.caCertificate;
    	      this.clientCertificate = defaults.clientCertificate;
    	      this.clientKey = defaults.clientKey;
    	      this.connectRetryInterval = defaults.connectRetryInterval;
    	      this.dumpFilePath = defaults.dumpFilePath;
    	      this.kind = defaults.kind;
    	      this.masterHeartbeatPeriod = defaults.masterHeartbeatPeriod;
    	      this.password = defaults.password;
    	      this.sslCipher = defaults.sslCipher;
    	      this.username = defaults.username;
    	      this.verifyServerCertificate = defaults.verifyServerCertificate;
        }

        public Builder caCertificate(@Nullable Output<String> caCertificate) {
            this.caCertificate = caCertificate;
            return this;
        }
        public Builder caCertificate(@Nullable String caCertificate) {
            this.caCertificate = Output.ofNullable(caCertificate);
            return this;
        }
        public Builder clientCertificate(@Nullable Output<String> clientCertificate) {
            this.clientCertificate = clientCertificate;
            return this;
        }
        public Builder clientCertificate(@Nullable String clientCertificate) {
            this.clientCertificate = Output.ofNullable(clientCertificate);
            return this;
        }
        public Builder clientKey(@Nullable Output<String> clientKey) {
            this.clientKey = clientKey;
            return this;
        }
        public Builder clientKey(@Nullable String clientKey) {
            this.clientKey = Output.ofNullable(clientKey);
            return this;
        }
        public Builder connectRetryInterval(@Nullable Output<Integer> connectRetryInterval) {
            this.connectRetryInterval = connectRetryInterval;
            return this;
        }
        public Builder connectRetryInterval(@Nullable Integer connectRetryInterval) {
            this.connectRetryInterval = Output.ofNullable(connectRetryInterval);
            return this;
        }
        public Builder dumpFilePath(@Nullable Output<String> dumpFilePath) {
            this.dumpFilePath = dumpFilePath;
            return this;
        }
        public Builder dumpFilePath(@Nullable String dumpFilePath) {
            this.dumpFilePath = Output.ofNullable(dumpFilePath);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Output.ofNullable(kind);
            return this;
        }
        public Builder masterHeartbeatPeriod(@Nullable Output<String> masterHeartbeatPeriod) {
            this.masterHeartbeatPeriod = masterHeartbeatPeriod;
            return this;
        }
        public Builder masterHeartbeatPeriod(@Nullable String masterHeartbeatPeriod) {
            this.masterHeartbeatPeriod = Output.ofNullable(masterHeartbeatPeriod);
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
        public Builder sslCipher(@Nullable Output<String> sslCipher) {
            this.sslCipher = sslCipher;
            return this;
        }
        public Builder sslCipher(@Nullable String sslCipher) {
            this.sslCipher = Output.ofNullable(sslCipher);
            return this;
        }
        public Builder username(@Nullable Output<String> username) {
            this.username = username;
            return this;
        }
        public Builder username(@Nullable String username) {
            this.username = Output.ofNullable(username);
            return this;
        }
        public Builder verifyServerCertificate(@Nullable Output<Boolean> verifyServerCertificate) {
            this.verifyServerCertificate = verifyServerCertificate;
            return this;
        }
        public Builder verifyServerCertificate(@Nullable Boolean verifyServerCertificate) {
            this.verifyServerCertificate = Output.ofNullable(verifyServerCertificate);
            return this;
        }        public MySqlReplicaConfigurationArgs build() {
            return new MySqlReplicaConfigurationArgs(caCertificate, clientCertificate, clientKey, connectRetryInterval, dumpFilePath, kind, masterHeartbeatPeriod, password, sslCipher, username, verifyServerCertificate);
        }
    }
}
