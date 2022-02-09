// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ServerCertificateCommonNameArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServerCertificateCommonNameArgs Empty = new ServerCertificateCommonNameArgs();

    @InputImport(name="certificateCommonName", required=true)
    private final Input<String> certificateCommonName;

    public Input<String> getCertificateCommonName() {
        return this.certificateCommonName;
    }

    @InputImport(name="certificateIssuerThumbprint", required=true)
    private final Input<String> certificateIssuerThumbprint;

    public Input<String> getCertificateIssuerThumbprint() {
        return this.certificateIssuerThumbprint;
    }

    public ServerCertificateCommonNameArgs(
        Input<String> certificateCommonName,
        Input<String> certificateIssuerThumbprint) {
        this.certificateCommonName = Objects.requireNonNull(certificateCommonName, "expected parameter 'certificateCommonName' to be non-null");
        this.certificateIssuerThumbprint = Objects.requireNonNull(certificateIssuerThumbprint, "expected parameter 'certificateIssuerThumbprint' to be non-null");
    }

    private ServerCertificateCommonNameArgs() {
        this.certificateCommonName = Input.empty();
        this.certificateIssuerThumbprint = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerCertificateCommonNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> certificateCommonName;
        private Input<String> certificateIssuerThumbprint;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerCertificateCommonNameArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateCommonName = defaults.certificateCommonName;
    	      this.certificateIssuerThumbprint = defaults.certificateIssuerThumbprint;
        }

        public Builder setCertificateCommonName(Input<String> certificateCommonName) {
            this.certificateCommonName = Objects.requireNonNull(certificateCommonName);
            return this;
        }

        public Builder setCertificateCommonName(String certificateCommonName) {
            this.certificateCommonName = Input.of(Objects.requireNonNull(certificateCommonName));
            return this;
        }

        public Builder setCertificateIssuerThumbprint(Input<String> certificateIssuerThumbprint) {
            this.certificateIssuerThumbprint = Objects.requireNonNull(certificateIssuerThumbprint);
            return this;
        }

        public Builder setCertificateIssuerThumbprint(String certificateIssuerThumbprint) {
            this.certificateIssuerThumbprint = Input.of(Objects.requireNonNull(certificateIssuerThumbprint));
            return this;
        }

        public ServerCertificateCommonNameArgs build() {
            return new ServerCertificateCommonNameArgs(certificateCommonName, certificateIssuerThumbprint);
        }
    }
}
