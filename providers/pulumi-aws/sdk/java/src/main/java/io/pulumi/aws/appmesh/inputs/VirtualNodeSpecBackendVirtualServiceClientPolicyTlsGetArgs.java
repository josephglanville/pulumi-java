// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateGetArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecBackendVirtualServiceClientPolicyTlsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendVirtualServiceClientPolicyTlsGetArgs Empty = new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsGetArgs();

    /**
     * The listener's TLS certificate.
     * 
     */
    @InputImport(name="certificate")
      private final @Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateGetArgs> certificate;

    public Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateGetArgs> getCertificate() {
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
      private final Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationGetArgs> validation;

    public Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationGetArgs> getValidation() {
        return this.validation;
    }

    public VirtualNodeSpecBackendVirtualServiceClientPolicyTlsGetArgs(
        @Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateGetArgs> certificate,
        @Nullable Output<Boolean> enforce,
        @Nullable Output<List<Integer>> ports,
        Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationGetArgs> validation) {
        this.certificate = certificate;
        this.enforce = enforce;
        this.ports = ports;
        this.validation = Objects.requireNonNull(validation, "expected parameter 'validation' to be non-null");
    }

    private VirtualNodeSpecBackendVirtualServiceClientPolicyTlsGetArgs() {
        this.certificate = Output.empty();
        this.enforce = Output.empty();
        this.ports = Output.empty();
        this.validation = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateGetArgs> certificate;
        private @Nullable Output<Boolean> enforce;
        private @Nullable Output<List<Integer>> ports;
        private Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationGetArgs> validation;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.enforce = defaults.enforce;
    	      this.ports = defaults.ports;
    	      this.validation = defaults.validation;
        }

        public Builder certificate(@Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateGetArgs> certificate) {
            this.certificate = certificate;
            return this;
        }

        public Builder certificate(@Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsCertificateGetArgs certificate) {
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

        public Builder validation(Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationGetArgs> validation) {
            this.validation = Objects.requireNonNull(validation);
            return this;
        }

        public Builder validation(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationGetArgs validation) {
            this.validation = Output.of(Objects.requireNonNull(validation));
            return this;
        }
        public VirtualNodeSpecBackendVirtualServiceClientPolicyTlsGetArgs build() {
            return new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsGetArgs(certificate, enforce, ports, validation);
        }
    }
}
