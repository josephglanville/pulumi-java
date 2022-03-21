// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.VirtualNodeSpecListenerTlsValidationSubjectAlternativeNames;
import io.pulumi.aws.appmesh.outputs.VirtualNodeSpecListenerTlsValidationTrust;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualNodeSpecListenerTlsValidation {
    /**
     * The SANs for a TLS validation context.
     * 
     */
    private final @Nullable VirtualNodeSpecListenerTlsValidationSubjectAlternativeNames subjectAlternativeNames;
    /**
     * The TLS validation context trust.
     * 
     */
    private final VirtualNodeSpecListenerTlsValidationTrust trust;

    @CustomType.Constructor
    private VirtualNodeSpecListenerTlsValidation(
        @CustomType.Parameter("subjectAlternativeNames") @Nullable VirtualNodeSpecListenerTlsValidationSubjectAlternativeNames subjectAlternativeNames,
        @CustomType.Parameter("trust") VirtualNodeSpecListenerTlsValidationTrust trust) {
        this.subjectAlternativeNames = subjectAlternativeNames;
        this.trust = trust;
    }

    /**
     * The SANs for a TLS validation context.
     * 
    */
    public Optional<VirtualNodeSpecListenerTlsValidationSubjectAlternativeNames> getSubjectAlternativeNames() {
        return Optional.ofNullable(this.subjectAlternativeNames);
    }
    /**
     * The TLS validation context trust.
     * 
    */
    public VirtualNodeSpecListenerTlsValidationTrust getTrust() {
        return this.trust;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerTlsValidation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VirtualNodeSpecListenerTlsValidationSubjectAlternativeNames subjectAlternativeNames;
        private VirtualNodeSpecListenerTlsValidationTrust trust;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerTlsValidation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subjectAlternativeNames = defaults.subjectAlternativeNames;
    	      this.trust = defaults.trust;
        }

        public Builder subjectAlternativeNames(@Nullable VirtualNodeSpecListenerTlsValidationSubjectAlternativeNames subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }
        public Builder trust(VirtualNodeSpecListenerTlsValidationTrust trust) {
            this.trust = Objects.requireNonNull(trust);
            return this;
        }        public VirtualNodeSpecListenerTlsValidation build() {
            return new VirtualNodeSpecListenerTlsValidation(subjectAlternativeNames, trust);
        }
    }
}
