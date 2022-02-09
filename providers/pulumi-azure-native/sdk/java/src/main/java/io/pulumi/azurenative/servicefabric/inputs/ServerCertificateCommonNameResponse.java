// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ServerCertificateCommonNameResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServerCertificateCommonNameResponse Empty = new ServerCertificateCommonNameResponse();

    @InputImport(name="certificateCommonName", required=true)
    private final String certificateCommonName;

    public String getCertificateCommonName() {
        return this.certificateCommonName;
    }

    @InputImport(name="certificateIssuerThumbprint", required=true)
    private final String certificateIssuerThumbprint;

    public String getCertificateIssuerThumbprint() {
        return this.certificateIssuerThumbprint;
    }

    public ServerCertificateCommonNameResponse(
        String certificateCommonName,
        String certificateIssuerThumbprint) {
        this.certificateCommonName = Objects.requireNonNull(certificateCommonName, "expected parameter 'certificateCommonName' to be non-null");
        this.certificateIssuerThumbprint = Objects.requireNonNull(certificateIssuerThumbprint, "expected parameter 'certificateIssuerThumbprint' to be non-null");
    }

    private ServerCertificateCommonNameResponse() {
        this.certificateCommonName = null;
        this.certificateIssuerThumbprint = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerCertificateCommonNameResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificateCommonName;
        private String certificateIssuerThumbprint;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerCertificateCommonNameResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateCommonName = defaults.certificateCommonName;
    	      this.certificateIssuerThumbprint = defaults.certificateIssuerThumbprint;
        }

        public Builder setCertificateCommonName(String certificateCommonName) {
            this.certificateCommonName = Objects.requireNonNull(certificateCommonName);
            return this;
        }

        public Builder setCertificateIssuerThumbprint(String certificateIssuerThumbprint) {
            this.certificateIssuerThumbprint = Objects.requireNonNull(certificateIssuerThumbprint);
            return this;
        }

        public ServerCertificateCommonNameResponse build() {
            return new ServerCertificateCommonNameResponse(certificateCommonName, certificateIssuerThumbprint);
        }
    }
}
