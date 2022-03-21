// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateCertificateDescriptionCertFingerprintArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateCertificateDescriptionCertFingerprintArgs Empty = new CertificateCertificateDescriptionCertFingerprintArgs();

    @Import(name="sha256Hash")
      private final @Nullable Output<String> sha256Hash;

    public Output<String> getSha256Hash() {
        return this.sha256Hash == null ? Output.empty() : this.sha256Hash;
    }

    public CertificateCertificateDescriptionCertFingerprintArgs(@Nullable Output<String> sha256Hash) {
        this.sha256Hash = sha256Hash;
    }

    private CertificateCertificateDescriptionCertFingerprintArgs() {
        this.sha256Hash = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateCertificateDescriptionCertFingerprintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> sha256Hash;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateCertificateDescriptionCertFingerprintArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sha256Hash = defaults.sha256Hash;
        }

        public Builder sha256Hash(@Nullable Output<String> sha256Hash) {
            this.sha256Hash = sha256Hash;
            return this;
        }
        public Builder sha256Hash(@Nullable String sha256Hash) {
            this.sha256Hash = Output.ofNullable(sha256Hash);
            return this;
        }        public CertificateCertificateDescriptionCertFingerprintArgs build() {
            return new CertificateCertificateDescriptionCertFingerprintArgs(sha256Hash);
        }
    }
}
