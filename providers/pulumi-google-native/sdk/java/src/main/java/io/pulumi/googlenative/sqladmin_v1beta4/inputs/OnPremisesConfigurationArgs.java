// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1beta4.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.sqladmin_v1beta4.inputs.InstanceReferenceArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * On-premises instance configuration.
 * 
 */
public final class OnPremisesConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final OnPremisesConfigurationArgs Empty = new OnPremisesConfigurationArgs();

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
     * The dump file to create the Cloud SQL replica.
     * 
     */
    @Import(name="dumpFilePath")
      private final @Nullable Output<String> dumpFilePath;

    public Output<String> getDumpFilePath() {
        return this.dumpFilePath == null ? Output.empty() : this.dumpFilePath;
    }

    /**
     * The host and port of the on-premises instance in host:port format
     * 
     */
    @Import(name="hostPort")
      private final @Nullable Output<String> hostPort;

    public Output<String> getHostPort() {
        return this.hostPort == null ? Output.empty() : this.hostPort;
    }

    /**
     * This is always `sql#onPremisesConfiguration`.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    /**
     * The password for connecting to on-premises instance.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<String> password;

    public Output<String> getPassword() {
        return this.password == null ? Output.empty() : this.password;
    }

    /**
     * The reference to Cloud SQL instance if the source is Cloud SQL.
     * 
     */
    @Import(name="sourceInstance")
      private final @Nullable Output<InstanceReferenceArgs> sourceInstance;

    public Output<InstanceReferenceArgs> getSourceInstance() {
        return this.sourceInstance == null ? Output.empty() : this.sourceInstance;
    }

    /**
     * The username for connecting to on-premises instance.
     * 
     */
    @Import(name="username")
      private final @Nullable Output<String> username;

    public Output<String> getUsername() {
        return this.username == null ? Output.empty() : this.username;
    }

    public OnPremisesConfigurationArgs(
        @Nullable Output<String> caCertificate,
        @Nullable Output<String> clientCertificate,
        @Nullable Output<String> clientKey,
        @Nullable Output<String> dumpFilePath,
        @Nullable Output<String> hostPort,
        @Nullable Output<String> kind,
        @Nullable Output<String> password,
        @Nullable Output<InstanceReferenceArgs> sourceInstance,
        @Nullable Output<String> username) {
        this.caCertificate = caCertificate;
        this.clientCertificate = clientCertificate;
        this.clientKey = clientKey;
        this.dumpFilePath = dumpFilePath;
        this.hostPort = hostPort;
        this.kind = kind;
        this.password = password;
        this.sourceInstance = sourceInstance;
        this.username = username;
    }

    private OnPremisesConfigurationArgs() {
        this.caCertificate = Output.empty();
        this.clientCertificate = Output.empty();
        this.clientKey = Output.empty();
        this.dumpFilePath = Output.empty();
        this.hostPort = Output.empty();
        this.kind = Output.empty();
        this.password = Output.empty();
        this.sourceInstance = Output.empty();
        this.username = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OnPremisesConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> caCertificate;
        private @Nullable Output<String> clientCertificate;
        private @Nullable Output<String> clientKey;
        private @Nullable Output<String> dumpFilePath;
        private @Nullable Output<String> hostPort;
        private @Nullable Output<String> kind;
        private @Nullable Output<String> password;
        private @Nullable Output<InstanceReferenceArgs> sourceInstance;
        private @Nullable Output<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(OnPremisesConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caCertificate = defaults.caCertificate;
    	      this.clientCertificate = defaults.clientCertificate;
    	      this.clientKey = defaults.clientKey;
    	      this.dumpFilePath = defaults.dumpFilePath;
    	      this.hostPort = defaults.hostPort;
    	      this.kind = defaults.kind;
    	      this.password = defaults.password;
    	      this.sourceInstance = defaults.sourceInstance;
    	      this.username = defaults.username;
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
        public Builder dumpFilePath(@Nullable Output<String> dumpFilePath) {
            this.dumpFilePath = dumpFilePath;
            return this;
        }
        public Builder dumpFilePath(@Nullable String dumpFilePath) {
            this.dumpFilePath = Output.ofNullable(dumpFilePath);
            return this;
        }
        public Builder hostPort(@Nullable Output<String> hostPort) {
            this.hostPort = hostPort;
            return this;
        }
        public Builder hostPort(@Nullable String hostPort) {
            this.hostPort = Output.ofNullable(hostPort);
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
        public Builder password(@Nullable Output<String> password) {
            this.password = password;
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = Output.ofNullable(password);
            return this;
        }
        public Builder sourceInstance(@Nullable Output<InstanceReferenceArgs> sourceInstance) {
            this.sourceInstance = sourceInstance;
            return this;
        }
        public Builder sourceInstance(@Nullable InstanceReferenceArgs sourceInstance) {
            this.sourceInstance = Output.ofNullable(sourceInstance);
            return this;
        }
        public Builder username(@Nullable Output<String> username) {
            this.username = username;
            return this;
        }
        public Builder username(@Nullable String username) {
            this.username = Output.ofNullable(username);
            return this;
        }        public OnPremisesConfigurationArgs build() {
            return new OnPremisesConfigurationArgs(caCertificate, clientCertificate, clientKey, dumpFilePath, hostPort, kind, password, sourceInstance, username);
        }
    }
}
