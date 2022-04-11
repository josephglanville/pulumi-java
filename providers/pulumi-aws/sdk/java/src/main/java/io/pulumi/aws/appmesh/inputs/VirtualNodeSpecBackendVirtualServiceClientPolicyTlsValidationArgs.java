// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationArgs Empty = new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationArgs();

    /**
     * The SANs for a TLS validation context.
     * 
     */
    @Import(name="subjectAlternativeNames")
      private final @Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesArgs> subjectAlternativeNames;

    public Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesArgs> getSubjectAlternativeNames() {
        return this.subjectAlternativeNames == null ? Codegen.empty() : this.subjectAlternativeNames;
    }

    /**
     * The TLS validation context trust.
     * 
     */
    @Import(name="trust", required=true)
      private final Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustArgs> trust;

    public Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustArgs> getTrust() {
        return this.trust;
    }

    public VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationArgs(
        @Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesArgs> subjectAlternativeNames,
        Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustArgs> trust) {
        this.subjectAlternativeNames = subjectAlternativeNames;
        this.trust = Objects.requireNonNull(trust, "expected parameter 'trust' to be non-null");
    }

    private VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationArgs() {
        this.subjectAlternativeNames = Codegen.empty();
        this.trust = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesArgs> subjectAlternativeNames;
        private Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustArgs> trust;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subjectAlternativeNames = defaults.subjectAlternativeNames;
    	      this.trust = defaults.trust;
        }

        public Builder subjectAlternativeNames(@Nullable Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesArgs> subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }
        public Builder subjectAlternativeNames(@Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNamesArgs subjectAlternativeNames) {
            this.subjectAlternativeNames = Codegen.ofNullable(subjectAlternativeNames);
            return this;
        }
        public Builder trust(Output<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustArgs> trust) {
            this.trust = Objects.requireNonNull(trust);
            return this;
        }
        public Builder trust(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrustArgs trust) {
            this.trust = Output.of(Objects.requireNonNull(trust));
            return this;
        }        public VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationArgs build() {
            return new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationArgs(subjectAlternativeNames, trust);
        }
    }
}
