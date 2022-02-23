// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class CaPoolIssuancePolicyAllowedKeyTypeEllipticCurveArgs extends io.pulumi.resources.ResourceArgs {

    public static final CaPoolIssuancePolicyAllowedKeyTypeEllipticCurveArgs Empty = new CaPoolIssuancePolicyAllowedKeyTypeEllipticCurveArgs();

    /**
     * The algorithm used.
     * Possible values are `ECDSA_P256`, `ECDSA_P384`, and `EDDSA_25519`.
     * 
     */
    @InputImport(name="signatureAlgorithm", required=true)
      private final Input<String> signatureAlgorithm;

    public Input<String> getSignatureAlgorithm() {
        return this.signatureAlgorithm;
    }

    public CaPoolIssuancePolicyAllowedKeyTypeEllipticCurveArgs(Input<String> signatureAlgorithm) {
        this.signatureAlgorithm = Objects.requireNonNull(signatureAlgorithm, "expected parameter 'signatureAlgorithm' to be non-null");
    }

    private CaPoolIssuancePolicyAllowedKeyTypeEllipticCurveArgs() {
        this.signatureAlgorithm = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CaPoolIssuancePolicyAllowedKeyTypeEllipticCurveArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> signatureAlgorithm;

        public Builder() {
    	      // Empty
        }

        public Builder(CaPoolIssuancePolicyAllowedKeyTypeEllipticCurveArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.signatureAlgorithm = defaults.signatureAlgorithm;
        }

        public Builder setSignatureAlgorithm(Input<String> signatureAlgorithm) {
            this.signatureAlgorithm = Objects.requireNonNull(signatureAlgorithm);
            return this;
        }

        public Builder setSignatureAlgorithm(String signatureAlgorithm) {
            this.signatureAlgorithm = Input.of(Objects.requireNonNull(signatureAlgorithm));
            return this;
        }
        public CaPoolIssuancePolicyAllowedKeyTypeEllipticCurveArgs build() {
            return new CaPoolIssuancePolicyAllowedKeyTypeEllipticCurveArgs(signatureAlgorithm);
        }
    }
}
