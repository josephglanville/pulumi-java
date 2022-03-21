// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datamigration_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SslConfigResponse {
    /**
     * Input only. The x509 PEM-encoded certificate of the CA that signed the source database server's certificate. The replica will use this certificate to verify it's connecting to the right host.
     * 
     */
    private final String caCertificate;
    /**
     * Input only. The x509 PEM-encoded certificate that will be used by the replica to authenticate against the source database server.If this field is used then the 'client_key' field is mandatory.
     * 
     */
    private final String clientCertificate;
    /**
     * Input only. The unencrypted PKCS#1 or PKCS#8 PEM-encoded private key associated with the Client Certificate. If this field is used then the 'client_certificate' field is mandatory.
     * 
     */
    private final String clientKey;
    /**
     * The ssl config type according to 'client_key', 'client_certificate' and 'ca_certificate'.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private SslConfigResponse(
        @CustomType.Parameter("caCertificate") String caCertificate,
        @CustomType.Parameter("clientCertificate") String clientCertificate,
        @CustomType.Parameter("clientKey") String clientKey,
        @CustomType.Parameter("type") String type) {
        this.caCertificate = caCertificate;
        this.clientCertificate = clientCertificate;
        this.clientKey = clientKey;
        this.type = type;
    }

    /**
     * Input only. The x509 PEM-encoded certificate of the CA that signed the source database server's certificate. The replica will use this certificate to verify it's connecting to the right host.
     * 
    */
    public String getCaCertificate() {
        return this.caCertificate;
    }
    /**
     * Input only. The x509 PEM-encoded certificate that will be used by the replica to authenticate against the source database server.If this field is used then the 'client_key' field is mandatory.
     * 
    */
    public String getClientCertificate() {
        return this.clientCertificate;
    }
    /**
     * Input only. The unencrypted PKCS#1 or PKCS#8 PEM-encoded private key associated with the Client Certificate. If this field is used then the 'client_certificate' field is mandatory.
     * 
    */
    public String getClientKey() {
        return this.clientKey;
    }
    /**
     * The ssl config type according to 'client_key', 'client_certificate' and 'ca_certificate'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SslConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String caCertificate;
        private String clientCertificate;
        private String clientKey;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SslConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caCertificate = defaults.caCertificate;
    	      this.clientCertificate = defaults.clientCertificate;
    	      this.clientKey = defaults.clientKey;
    	      this.type = defaults.type;
        }

        public Builder caCertificate(String caCertificate) {
            this.caCertificate = Objects.requireNonNull(caCertificate);
            return this;
        }
        public Builder clientCertificate(String clientCertificate) {
            this.clientCertificate = Objects.requireNonNull(clientCertificate);
            return this;
        }
        public Builder clientKey(String clientKey) {
            this.clientKey = Objects.requireNonNull(clientKey);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public SslConfigResponse build() {
            return new SslConfigResponse(caCertificate, clientCertificate, clientKey, type);
        }
    }
}
