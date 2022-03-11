// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateCertificateDescriptionConfigValueKeyUsageExtendedKeyUsageArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateCertificateDescriptionConfigValueKeyUsageExtendedKeyUsageArgs Empty = new CertificateCertificateDescriptionConfigValueKeyUsageExtendedKeyUsageArgs();

    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.2. Officially described as "TLS WWW client authentication", though regularly used for non-WWW TLS.
     * 
     */
    @InputImport(name="clientAuth")
      private final @Nullable Output<Boolean> clientAuth;

    public Output<Boolean> getClientAuth() {
        return this.clientAuth == null ? Output.empty() : this.clientAuth;
    }

    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.3. Officially described as "Signing of downloadable executable code client authentication".
     * 
     */
    @InputImport(name="codeSigning")
      private final @Nullable Output<Boolean> codeSigning;

    public Output<Boolean> getCodeSigning() {
        return this.codeSigning == null ? Output.empty() : this.codeSigning;
    }

    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.4. Officially described as "Email protection".
     * 
     */
    @InputImport(name="emailProtection")
      private final @Nullable Output<Boolean> emailProtection;

    public Output<Boolean> getEmailProtection() {
        return this.emailProtection == null ? Output.empty() : this.emailProtection;
    }

    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.9. Officially described as "Signing OCSP responses".
     * 
     */
    @InputImport(name="ocspSigning")
      private final @Nullable Output<Boolean> ocspSigning;

    public Output<Boolean> getOcspSigning() {
        return this.ocspSigning == null ? Output.empty() : this.ocspSigning;
    }

    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.1. Officially described as "TLS WWW server authentication", though regularly used for non-WWW TLS.
     * 
     */
    @InputImport(name="serverAuth")
      private final @Nullable Output<Boolean> serverAuth;

    public Output<Boolean> getServerAuth() {
        return this.serverAuth == null ? Output.empty() : this.serverAuth;
    }

    /**
     * Corresponds to OID 1.3.6.1.5.5.7.3.8. Officially described as "Binding the hash of an object to a time".
     * 
     */
    @InputImport(name="timeStamping")
      private final @Nullable Output<Boolean> timeStamping;

    public Output<Boolean> getTimeStamping() {
        return this.timeStamping == null ? Output.empty() : this.timeStamping;
    }

    public CertificateCertificateDescriptionConfigValueKeyUsageExtendedKeyUsageArgs(
        @Nullable Output<Boolean> clientAuth,
        @Nullable Output<Boolean> codeSigning,
        @Nullable Output<Boolean> emailProtection,
        @Nullable Output<Boolean> ocspSigning,
        @Nullable Output<Boolean> serverAuth,
        @Nullable Output<Boolean> timeStamping) {
        this.clientAuth = clientAuth;
        this.codeSigning = codeSigning;
        this.emailProtection = emailProtection;
        this.ocspSigning = ocspSigning;
        this.serverAuth = serverAuth;
        this.timeStamping = timeStamping;
    }

    private CertificateCertificateDescriptionConfigValueKeyUsageExtendedKeyUsageArgs() {
        this.clientAuth = Output.empty();
        this.codeSigning = Output.empty();
        this.emailProtection = Output.empty();
        this.ocspSigning = Output.empty();
        this.serverAuth = Output.empty();
        this.timeStamping = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateCertificateDescriptionConfigValueKeyUsageExtendedKeyUsageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> clientAuth;
        private @Nullable Output<Boolean> codeSigning;
        private @Nullable Output<Boolean> emailProtection;
        private @Nullable Output<Boolean> ocspSigning;
        private @Nullable Output<Boolean> serverAuth;
        private @Nullable Output<Boolean> timeStamping;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateCertificateDescriptionConfigValueKeyUsageExtendedKeyUsageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientAuth = defaults.clientAuth;
    	      this.codeSigning = defaults.codeSigning;
    	      this.emailProtection = defaults.emailProtection;
    	      this.ocspSigning = defaults.ocspSigning;
    	      this.serverAuth = defaults.serverAuth;
    	      this.timeStamping = defaults.timeStamping;
        }

        public Builder clientAuth(@Nullable Output<Boolean> clientAuth) {
            this.clientAuth = clientAuth;
            return this;
        }

        public Builder clientAuth(@Nullable Boolean clientAuth) {
            this.clientAuth = Output.ofNullable(clientAuth);
            return this;
        }

        public Builder codeSigning(@Nullable Output<Boolean> codeSigning) {
            this.codeSigning = codeSigning;
            return this;
        }

        public Builder codeSigning(@Nullable Boolean codeSigning) {
            this.codeSigning = Output.ofNullable(codeSigning);
            return this;
        }

        public Builder emailProtection(@Nullable Output<Boolean> emailProtection) {
            this.emailProtection = emailProtection;
            return this;
        }

        public Builder emailProtection(@Nullable Boolean emailProtection) {
            this.emailProtection = Output.ofNullable(emailProtection);
            return this;
        }

        public Builder ocspSigning(@Nullable Output<Boolean> ocspSigning) {
            this.ocspSigning = ocspSigning;
            return this;
        }

        public Builder ocspSigning(@Nullable Boolean ocspSigning) {
            this.ocspSigning = Output.ofNullable(ocspSigning);
            return this;
        }

        public Builder serverAuth(@Nullable Output<Boolean> serverAuth) {
            this.serverAuth = serverAuth;
            return this;
        }

        public Builder serverAuth(@Nullable Boolean serverAuth) {
            this.serverAuth = Output.ofNullable(serverAuth);
            return this;
        }

        public Builder timeStamping(@Nullable Output<Boolean> timeStamping) {
            this.timeStamping = timeStamping;
            return this;
        }

        public Builder timeStamping(@Nullable Boolean timeStamping) {
            this.timeStamping = Output.ofNullable(timeStamping);
            return this;
        }
        public CertificateCertificateDescriptionConfigValueKeyUsageExtendedKeyUsageArgs build() {
            return new CertificateCertificateDescriptionConfigValueKeyUsageExtendedKeyUsageArgs(clientAuth, codeSigning, emailProtection, ocspSigning, serverAuth, timeStamping);
        }
    }
}
