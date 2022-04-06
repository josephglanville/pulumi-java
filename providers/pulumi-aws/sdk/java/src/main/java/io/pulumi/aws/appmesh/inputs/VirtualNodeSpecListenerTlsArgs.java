// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsCertificateArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecListenerTlsValidationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecListenerTlsArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecListenerTlsArgs Empty = new VirtualNodeSpecListenerTlsArgs();

    /**
     * The listener's TLS certificate.
     * 
     */
    @Import(name="certificate", required=true)
      private final Output<VirtualNodeSpecListenerTlsCertificateArgs> certificate;

    public Output<VirtualNodeSpecListenerTlsCertificateArgs> getCertificate() {
        return this.certificate;
    }

    /**
     * The listener's TLS mode. Valid values: `DISABLED`, `PERMISSIVE`, `STRICT`.
     * 
     */
    @Import(name="mode", required=true)
      private final Output<String> mode;

    public Output<String> getMode() {
        return this.mode;
    }

    /**
     * The listener's Transport Layer Security (TLS) validation context.
     * 
     */
    @Import(name="validation")
      private final @Nullable Output<VirtualNodeSpecListenerTlsValidationArgs> validation;

    public Output<VirtualNodeSpecListenerTlsValidationArgs> getValidation() {
        return this.validation == null ? Output.empty() : this.validation;
    }

    public VirtualNodeSpecListenerTlsArgs(
        Output<VirtualNodeSpecListenerTlsCertificateArgs> certificate,
        Output<String> mode,
        @Nullable Output<VirtualNodeSpecListenerTlsValidationArgs> validation) {
        this.certificate = Objects.requireNonNull(certificate, "expected parameter 'certificate' to be non-null");
        this.mode = Objects.requireNonNull(mode, "expected parameter 'mode' to be non-null");
        this.validation = validation;
    }

    private VirtualNodeSpecListenerTlsArgs() {
        this.certificate = Output.empty();
        this.mode = Output.empty();
        this.validation = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerTlsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<VirtualNodeSpecListenerTlsCertificateArgs> certificate;
        private Output<String> mode;
        private @Nullable Output<VirtualNodeSpecListenerTlsValidationArgs> validation;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerTlsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.mode = defaults.mode;
    	      this.validation = defaults.validation;
        }

        public Builder certificate(Output<VirtualNodeSpecListenerTlsCertificateArgs> certificate) {
            this.certificate = Objects.requireNonNull(certificate);
            return this;
        }
        public Builder certificate(VirtualNodeSpecListenerTlsCertificateArgs certificate) {
            this.certificate = Output.of(Objects.requireNonNull(certificate));
            return this;
        }
        public Builder mode(Output<String> mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        public Builder mode(String mode) {
            this.mode = Output.of(Objects.requireNonNull(mode));
            return this;
        }
        public Builder validation(@Nullable Output<VirtualNodeSpecListenerTlsValidationArgs> validation) {
            this.validation = validation;
            return this;
        }
        public Builder validation(@Nullable VirtualNodeSpecListenerTlsValidationArgs validation) {
            this.validation = Output.ofNullable(validation);
            return this;
        }        public VirtualNodeSpecListenerTlsArgs build() {
            return new VirtualNodeSpecListenerTlsArgs(certificate, mode, validation);
        }
    }
}