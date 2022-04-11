// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datamigration_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * SSL configuration information.
 * 
 */
public final class SslConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final SslConfigArgs Empty = new SslConfigArgs();

    /**
     * Input only. The x509 PEM-encoded certificate of the CA that signed the source database server's certificate. The replica will use this certificate to verify it's connecting to the right host.
     * 
     */
    @Import(name="caCertificate", required=true)
      private final Output<String> caCertificate;

    public Output<String> getCaCertificate() {
        return this.caCertificate;
    }

    /**
     * Input only. The x509 PEM-encoded certificate that will be used by the replica to authenticate against the source database server.If this field is used then the 'client_key' field is mandatory.
     * 
     */
    @Import(name="clientCertificate")
      private final @Nullable Output<String> clientCertificate;

    public Output<String> getClientCertificate() {
        return this.clientCertificate == null ? Codegen.empty() : this.clientCertificate;
    }

    /**
     * Input only. The unencrypted PKCS#1 or PKCS#8 PEM-encoded private key associated with the Client Certificate. If this field is used then the 'client_certificate' field is mandatory.
     * 
     */
    @Import(name="clientKey")
      private final @Nullable Output<String> clientKey;

    public Output<String> getClientKey() {
        return this.clientKey == null ? Codegen.empty() : this.clientKey;
    }

    public SslConfigArgs(
        Output<String> caCertificate,
        @Nullable Output<String> clientCertificate,
        @Nullable Output<String> clientKey) {
        this.caCertificate = Objects.requireNonNull(caCertificate, "expected parameter 'caCertificate' to be non-null");
        this.clientCertificate = clientCertificate;
        this.clientKey = clientKey;
    }

    private SslConfigArgs() {
        this.caCertificate = Codegen.empty();
        this.clientCertificate = Codegen.empty();
        this.clientKey = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SslConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> caCertificate;
        private @Nullable Output<String> clientCertificate;
        private @Nullable Output<String> clientKey;

        public Builder() {
    	      // Empty
        }

        public Builder(SslConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caCertificate = defaults.caCertificate;
    	      this.clientCertificate = defaults.clientCertificate;
    	      this.clientKey = defaults.clientKey;
        }

        public Builder caCertificate(Output<String> caCertificate) {
            this.caCertificate = Objects.requireNonNull(caCertificate);
            return this;
        }
        public Builder caCertificate(String caCertificate) {
            this.caCertificate = Output.of(Objects.requireNonNull(caCertificate));
            return this;
        }
        public Builder clientCertificate(@Nullable Output<String> clientCertificate) {
            this.clientCertificate = clientCertificate;
            return this;
        }
        public Builder clientCertificate(@Nullable String clientCertificate) {
            this.clientCertificate = Codegen.ofNullable(clientCertificate);
            return this;
        }
        public Builder clientKey(@Nullable Output<String> clientKey) {
            this.clientKey = clientKey;
            return this;
        }
        public Builder clientKey(@Nullable String clientKey) {
            this.clientKey = Codegen.ofNullable(clientKey);
            return this;
        }        public SslConfigArgs build() {
            return new SslConfigArgs(caCertificate, clientCertificate, clientKey);
        }
    }
}
