// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot;

import io.pulumi.awsnative.iot.enums.CertificateMode;
import io.pulumi.awsnative.iot.enums.CertificateStatus;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateArgs Empty = new CertificateArgs();

    @InputImport(name="cACertificatePem")
      private final @Nullable Output<String> cACertificatePem;

    public Output<String> getCACertificatePem() {
        return this.cACertificatePem == null ? Output.empty() : this.cACertificatePem;
    }

    @InputImport(name="certificateMode")
      private final @Nullable Output<CertificateMode> certificateMode;

    public Output<CertificateMode> getCertificateMode() {
        return this.certificateMode == null ? Output.empty() : this.certificateMode;
    }

    @InputImport(name="certificatePem")
      private final @Nullable Output<String> certificatePem;

    public Output<String> getCertificatePem() {
        return this.certificatePem == null ? Output.empty() : this.certificatePem;
    }

    @InputImport(name="certificateSigningRequest")
      private final @Nullable Output<String> certificateSigningRequest;

    public Output<String> getCertificateSigningRequest() {
        return this.certificateSigningRequest == null ? Output.empty() : this.certificateSigningRequest;
    }

    @InputImport(name="status", required=true)
      private final Output<CertificateStatus> status;

    public Output<CertificateStatus> getStatus() {
        return this.status;
    }

    public CertificateArgs(
        @Nullable Output<String> cACertificatePem,
        @Nullable Output<CertificateMode> certificateMode,
        @Nullable Output<String> certificatePem,
        @Nullable Output<String> certificateSigningRequest,
        Output<CertificateStatus> status) {
        this.cACertificatePem = cACertificatePem;
        this.certificateMode = certificateMode;
        this.certificatePem = certificatePem;
        this.certificateSigningRequest = certificateSigningRequest;
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private CertificateArgs() {
        this.cACertificatePem = Output.empty();
        this.certificateMode = Output.empty();
        this.certificatePem = Output.empty();
        this.certificateSigningRequest = Output.empty();
        this.status = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cACertificatePem;
        private @Nullable Output<CertificateMode> certificateMode;
        private @Nullable Output<String> certificatePem;
        private @Nullable Output<String> certificateSigningRequest;
        private Output<CertificateStatus> status;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cACertificatePem = defaults.cACertificatePem;
    	      this.certificateMode = defaults.certificateMode;
    	      this.certificatePem = defaults.certificatePem;
    	      this.certificateSigningRequest = defaults.certificateSigningRequest;
    	      this.status = defaults.status;
        }

        public Builder cACertificatePem(@Nullable Output<String> cACertificatePem) {
            this.cACertificatePem = cACertificatePem;
            return this;
        }

        public Builder cACertificatePem(@Nullable String cACertificatePem) {
            this.cACertificatePem = Output.ofNullable(cACertificatePem);
            return this;
        }

        public Builder certificateMode(@Nullable Output<CertificateMode> certificateMode) {
            this.certificateMode = certificateMode;
            return this;
        }

        public Builder certificateMode(@Nullable CertificateMode certificateMode) {
            this.certificateMode = Output.ofNullable(certificateMode);
            return this;
        }

        public Builder certificatePem(@Nullable Output<String> certificatePem) {
            this.certificatePem = certificatePem;
            return this;
        }

        public Builder certificatePem(@Nullable String certificatePem) {
            this.certificatePem = Output.ofNullable(certificatePem);
            return this;
        }

        public Builder certificateSigningRequest(@Nullable Output<String> certificateSigningRequest) {
            this.certificateSigningRequest = certificateSigningRequest;
            return this;
        }

        public Builder certificateSigningRequest(@Nullable String certificateSigningRequest) {
            this.certificateSigningRequest = Output.ofNullable(certificateSigningRequest);
            return this;
        }

        public Builder status(Output<CertificateStatus> status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder status(CertificateStatus status) {
            this.status = Output.of(Objects.requireNonNull(status));
            return this;
        }
        public CertificateArgs build() {
            return new CertificateArgs(cACertificatePem, certificateMode, certificatePem, certificateSigningRequest, status);
        }
    }
}
