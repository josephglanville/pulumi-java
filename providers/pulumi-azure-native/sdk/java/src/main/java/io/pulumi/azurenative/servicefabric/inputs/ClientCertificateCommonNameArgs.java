// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class ClientCertificateCommonNameArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClientCertificateCommonNameArgs Empty = new ClientCertificateCommonNameArgs();

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

    @InputImport(name="isAdmin", required=true)
    private final Input<Boolean> isAdmin;

    public Input<Boolean> getIsAdmin() {
        return this.isAdmin;
    }

    public ClientCertificateCommonNameArgs(
        Input<String> certificateCommonName,
        Input<String> certificateIssuerThumbprint,
        Input<Boolean> isAdmin) {
        this.certificateCommonName = Objects.requireNonNull(certificateCommonName, "expected parameter 'certificateCommonName' to be non-null");
        this.certificateIssuerThumbprint = Objects.requireNonNull(certificateIssuerThumbprint, "expected parameter 'certificateIssuerThumbprint' to be non-null");
        this.isAdmin = Objects.requireNonNull(isAdmin, "expected parameter 'isAdmin' to be non-null");
    }

    private ClientCertificateCommonNameArgs() {
        this.certificateCommonName = Input.empty();
        this.certificateIssuerThumbprint = Input.empty();
        this.isAdmin = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientCertificateCommonNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> certificateCommonName;
        private Input<String> certificateIssuerThumbprint;
        private Input<Boolean> isAdmin;

        public Builder() {
    	      // Empty
        }

        public Builder(ClientCertificateCommonNameArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateCommonName = defaults.certificateCommonName;
    	      this.certificateIssuerThumbprint = defaults.certificateIssuerThumbprint;
    	      this.isAdmin = defaults.isAdmin;
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

        public Builder setIsAdmin(Input<Boolean> isAdmin) {
            this.isAdmin = Objects.requireNonNull(isAdmin);
            return this;
        }

        public Builder setIsAdmin(Boolean isAdmin) {
            this.isAdmin = Input.of(Objects.requireNonNull(isAdmin));
            return this;
        }

        public ClientCertificateCommonNameArgs build() {
            return new ClientCertificateCommonNameArgs(certificateCommonName, certificateIssuerThumbprint, isAdmin);
        }
    }
}
