// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateAuthorityActivationArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateAuthorityActivationArgs Empty = new CertificateAuthorityActivationArgs();

    /**
     * Certificate Authority certificate that will be installed in the Certificate Authority.
     * 
     */
    @Import(name="certificate", required=true)
      private final Output<String> certificate;

    public Output<String> getCertificate() {
        return this.certificate;
    }

    /**
     * Arn of the Certificate Authority.
     * 
     */
    @Import(name="certificateAuthorityArn", required=true)
      private final Output<String> certificateAuthorityArn;

    public Output<String> getCertificateAuthorityArn() {
        return this.certificateAuthorityArn;
    }

    /**
     * Certificate chain for the Certificate Authority certificate.
     * 
     */
    @Import(name="certificateChain")
      private final @Nullable Output<String> certificateChain;

    public Output<String> getCertificateChain() {
        return this.certificateChain == null ? Output.empty() : this.certificateChain;
    }

    /**
     * The status of the Certificate Authority.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    public CertificateAuthorityActivationArgs(
        Output<String> certificate,
        Output<String> certificateAuthorityArn,
        @Nullable Output<String> certificateChain,
        @Nullable Output<String> status) {
        this.certificate = Objects.requireNonNull(certificate, "expected parameter 'certificate' to be non-null");
        this.certificateAuthorityArn = Objects.requireNonNull(certificateAuthorityArn, "expected parameter 'certificateAuthorityArn' to be non-null");
        this.certificateChain = certificateChain;
        this.status = status;
    }

    private CertificateAuthorityActivationArgs() {
        this.certificate = Output.empty();
        this.certificateAuthorityArn = Output.empty();
        this.certificateChain = Output.empty();
        this.status = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateAuthorityActivationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> certificate;
        private Output<String> certificateAuthorityArn;
        private @Nullable Output<String> certificateChain;
        private @Nullable Output<String> status;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateAuthorityActivationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.certificateAuthorityArn = defaults.certificateAuthorityArn;
    	      this.certificateChain = defaults.certificateChain;
    	      this.status = defaults.status;
        }

        public Builder certificate(Output<String> certificate) {
            this.certificate = Objects.requireNonNull(certificate);
            return this;
        }
        public Builder certificate(String certificate) {
            this.certificate = Output.of(Objects.requireNonNull(certificate));
            return this;
        }
        public Builder certificateAuthorityArn(Output<String> certificateAuthorityArn) {
            this.certificateAuthorityArn = Objects.requireNonNull(certificateAuthorityArn);
            return this;
        }
        public Builder certificateAuthorityArn(String certificateAuthorityArn) {
            this.certificateAuthorityArn = Output.of(Objects.requireNonNull(certificateAuthorityArn));
            return this;
        }
        public Builder certificateChain(@Nullable Output<String> certificateChain) {
            this.certificateChain = certificateChain;
            return this;
        }
        public Builder certificateChain(@Nullable String certificateChain) {
            this.certificateChain = Output.ofNullable(certificateChain);
            return this;
        }
        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = Output.ofNullable(status);
            return this;
        }        public CertificateAuthorityActivationArgs build() {
            return new CertificateAuthorityActivationArgs(certificate, certificateAuthorityArn, certificateChain, status);
        }
    }
}
