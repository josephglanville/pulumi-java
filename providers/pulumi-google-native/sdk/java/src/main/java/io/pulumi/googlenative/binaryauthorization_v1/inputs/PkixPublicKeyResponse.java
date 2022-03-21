// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.binaryauthorization_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A public key in the PkixPublicKey format (see https://tools.ietf.org/html/rfc5280#section-4.1.2.7 for details). Public keys of this type are typically textually encoded using the PEM format.
 * 
 */
public final class PkixPublicKeyResponse extends io.pulumi.resources.InvokeArgs {

    public static final PkixPublicKeyResponse Empty = new PkixPublicKeyResponse();

    /**
     * A PEM-encoded public key, as described in https://tools.ietf.org/html/rfc7468#section-13
     * 
     */
    @Import(name="publicKeyPem", required=true)
      private final String publicKeyPem;

    public String getPublicKeyPem() {
        return this.publicKeyPem;
    }

    /**
     * The signature algorithm used to verify a message against a signature using this key. These signature algorithm must match the structure and any object identifiers encoded in `public_key_pem` (i.e. this algorithm must match that of the public key).
     * 
     */
    @Import(name="signatureAlgorithm", required=true)
      private final String signatureAlgorithm;

    public String getSignatureAlgorithm() {
        return this.signatureAlgorithm;
    }

    public PkixPublicKeyResponse(
        String publicKeyPem,
        String signatureAlgorithm) {
        this.publicKeyPem = Objects.requireNonNull(publicKeyPem, "expected parameter 'publicKeyPem' to be non-null");
        this.signatureAlgorithm = Objects.requireNonNull(signatureAlgorithm, "expected parameter 'signatureAlgorithm' to be non-null");
    }

    private PkixPublicKeyResponse() {
        this.publicKeyPem = null;
        this.signatureAlgorithm = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PkixPublicKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String publicKeyPem;
        private String signatureAlgorithm;

        public Builder() {
    	      // Empty
        }

        public Builder(PkixPublicKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicKeyPem = defaults.publicKeyPem;
    	      this.signatureAlgorithm = defaults.signatureAlgorithm;
        }

        public Builder publicKeyPem(String publicKeyPem) {
            this.publicKeyPem = Objects.requireNonNull(publicKeyPem);
            return this;
        }
        public Builder signatureAlgorithm(String signatureAlgorithm) {
            this.signatureAlgorithm = Objects.requireNonNull(signatureAlgorithm);
            return this;
        }        public PkixPublicKeyResponse build() {
            return new PkixPublicKeyResponse(publicKeyPem, signatureAlgorithm);
        }
    }
}
