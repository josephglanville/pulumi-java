// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSdsArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSdsArgs Empty = new VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSdsArgs();

    /**
     * The name of the secret for a virtual node's Transport Layer Security (TLS) Secret Discovery Service validation context trust.
     * 
     */
    @Import(name="secretName", required=true)
      private final Output<String> secretName;

    public Output<String> getSecretName() {
        return this.secretName;
    }

    public VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSdsArgs(Output<String> secretName) {
        this.secretName = Objects.requireNonNull(secretName, "expected parameter 'secretName' to be non-null");
    }

    private VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSdsArgs() {
        this.secretName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSdsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> secretName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSdsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretName = defaults.secretName;
        }

        public Builder secretName(Output<String> secretName) {
            this.secretName = Objects.requireNonNull(secretName);
            return this;
        }
        public Builder secretName(String secretName) {
            this.secretName = Output.of(Objects.requireNonNull(secretName));
            return this;
        }        public VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSdsArgs build() {
            return new VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustSdsArgs(secretName);
        }
    }
}
