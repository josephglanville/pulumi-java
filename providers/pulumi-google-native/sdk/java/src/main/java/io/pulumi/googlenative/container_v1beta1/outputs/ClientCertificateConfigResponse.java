// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class ClientCertificateConfigResponse {
    /**
     * Issue a client certificate.
     * 
     */
    private final Boolean issueClientCertificate;

    @CustomType.Constructor
    private ClientCertificateConfigResponse(@CustomType.Parameter("issueClientCertificate") Boolean issueClientCertificate) {
        this.issueClientCertificate = issueClientCertificate;
    }

    /**
     * Issue a client certificate.
     * 
    */
    public Boolean getIssueClientCertificate() {
        return this.issueClientCertificate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientCertificateConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean issueClientCertificate;

        public Builder() {
    	      // Empty
        }

        public Builder(ClientCertificateConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.issueClientCertificate = defaults.issueClientCertificate;
        }

        public Builder issueClientCertificate(Boolean issueClientCertificate) {
            this.issueClientCertificate = Objects.requireNonNull(issueClientCertificate);
            return this;
        }        public ClientCertificateConfigResponse build() {
            return new ClientCertificateConfigResponse(issueClientCertificate);
        }
    }
}
