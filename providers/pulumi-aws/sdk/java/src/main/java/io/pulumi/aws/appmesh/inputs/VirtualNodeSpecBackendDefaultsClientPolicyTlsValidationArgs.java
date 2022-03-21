// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationArgs Empty = new VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationArgs();

    /**
     * The SANs for a TLS validation context.
     * 
     */
    @Import(name="subjectAlternativeNames")
      private final @Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesArgs> subjectAlternativeNames;

    public Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesArgs> getSubjectAlternativeNames() {
        return this.subjectAlternativeNames == null ? Output.empty() : this.subjectAlternativeNames;
    }

    /**
     * The TLS validation context trust.
     * 
     */
    @Import(name="trust", required=true)
      private final Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustArgs> trust;

    public Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustArgs> getTrust() {
        return this.trust;
    }

    public VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationArgs(
        @Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesArgs> subjectAlternativeNames,
        Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustArgs> trust) {
        this.subjectAlternativeNames = subjectAlternativeNames;
        this.trust = Objects.requireNonNull(trust, "expected parameter 'trust' to be non-null");
    }

    private VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationArgs() {
        this.subjectAlternativeNames = Output.empty();
        this.trust = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesArgs> subjectAlternativeNames;
        private Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustArgs> trust;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subjectAlternativeNames = defaults.subjectAlternativeNames;
    	      this.trust = defaults.trust;
        }

        public Builder subjectAlternativeNames(@Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesArgs> subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }
        public Builder subjectAlternativeNames(@Nullable VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesArgs subjectAlternativeNames) {
            this.subjectAlternativeNames = Output.ofNullable(subjectAlternativeNames);
            return this;
        }
        public Builder trust(Output<VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustArgs> trust) {
            this.trust = Objects.requireNonNull(trust);
            return this;
        }
        public Builder trust(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustArgs trust) {
            this.trust = Output.of(Objects.requireNonNull(trust));
            return this;
        }        public VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationArgs build() {
            return new VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationArgs(subjectAlternativeNames, trust);
        }
    }
}
