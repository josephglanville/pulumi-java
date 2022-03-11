// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecBackendDefaultsClientPolicyTlsArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendDefaultsClientPolicyTlsArgs Empty = new VirtualNodeSpecBackendDefaultsClientPolicyTlsArgs();

    /**
     * The listener's TLS certificate.
     * 
     */
    @InputImport(name="certificate")
      private final @Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateArgs> certificate;

    public Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateArgs> getCertificate() {
        return this.certificate == null ? Output.empty() : this.certificate;
    }

    /**
     * Whether the policy is enforced. Default is `true`.
     * 
     */
    @InputImport(name="enforce")
      private final @Nullable Output<Boolean> enforce;

    public Output<Boolean> getEnforce() {
        return this.enforce == null ? Output.empty() : this.enforce;
    }

    /**
     * One or more ports that the policy is enforced for.
     * 
     */
    @InputImport(name="ports")
      private final @Nullable Output<List<Integer>> ports;

    public Output<List<Integer>> getPorts() {
        return this.ports == null ? Output.empty() : this.ports;
    }

    /**
     * The listener's Transport Layer Security (TLS) validation context.
     * 
     */
    @InputImport(name="validation", required=true)
      private final Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationArgs> validation;

    public Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationArgs> getValidation() {
        return this.validation;
    }

    public VirtualNodeSpecBackendDefaultsClientPolicyTlsArgs(
        @Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateArgs> certificate,
        @Nullable Output<Boolean> enforce,
        @Nullable Output<List<Integer>> ports,
        Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationArgs> validation) {
        this.certificate = certificate;
        this.enforce = enforce;
        this.ports = ports;
        this.validation = Objects.requireNonNull(validation, "expected parameter 'validation' to be non-null");
    }

    private VirtualNodeSpecBackendDefaultsClientPolicyTlsArgs() {
        this.certificate = Output.empty();
        this.enforce = Output.empty();
        this.ports = Output.empty();
        this.validation = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateArgs> certificate;
        private @Nullable Output<Boolean> enforce;
        private @Nullable Output<List<Integer>> ports;
        private Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationArgs> validation;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.enforce = defaults.enforce;
    	      this.ports = defaults.ports;
    	      this.validation = defaults.validation;
        }

        public Builder certificate(@Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateArgs> certificate) {
            this.certificate = certificate;
            return this;
        }

        public Builder certificate(@Nullable VirtualNodeSpecBackendDefaultsClientPolicyTlsCertificateArgs certificate) {
            this.certificate = Output.ofNullable(certificate);
            return this;
        }

        public Builder enforce(@Nullable Output<Boolean> enforce) {
            this.enforce = enforce;
            return this;
        }

        public Builder enforce(@Nullable Boolean enforce) {
            this.enforce = Output.ofNullable(enforce);
            return this;
        }

        public Builder ports(@Nullable Output<List<Integer>> ports) {
            this.ports = ports;
            return this;
        }

        public Builder ports(@Nullable List<Integer> ports) {
            this.ports = Output.ofNullable(ports);
            return this;
        }

        public Builder validation(Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationArgs> validation) {
            this.validation = Objects.requireNonNull(validation);
            return this;
        }

        public Builder validation(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationArgs validation) {
            this.validation = Output.of(Objects.requireNonNull(validation));
            return this;
        }
        public VirtualNodeSpecBackendDefaultsClientPolicyTlsArgs build() {
            return new VirtualNodeSpecBackendDefaultsClientPolicyTlsArgs(certificate, enforce, ports, validation);
        }
    }
}
