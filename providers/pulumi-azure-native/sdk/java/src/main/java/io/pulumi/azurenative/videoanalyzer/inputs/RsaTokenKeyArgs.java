// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.azurenative.videoanalyzer.enums.AccessPolicyRsaAlgo;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Required validation properties for tokens generated with RSA algorithm.
 * 
 */
public final class RsaTokenKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RsaTokenKeyArgs Empty = new RsaTokenKeyArgs();

    /**
     * RSA algorithm to be used: RS256, RS384 or RS512.
     * 
     */
    @Import(name="alg", required=true)
      private final Output<Either<String,AccessPolicyRsaAlgo>> alg;

    public Output<Either<String,AccessPolicyRsaAlgo>> getAlg() {
        return this.alg;
    }

    /**
     * RSA public key exponent.
     * 
     */
    @Import(name="e", required=true)
      private final Output<String> e;

    public Output<String> getE() {
        return this.e;
    }

    /**
     * JWT token key id. Validation keys are looked up based on the key id present on the JWT token header.
     * 
     */
    @Import(name="kid", required=true)
      private final Output<String> kid;

    public Output<String> getKid() {
        return this.kid;
    }

    /**
     * RSA public key modulus.
     * 
     */
    @Import(name="n", required=true)
      private final Output<String> n;

    public Output<String> getN() {
        return this.n;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.RsaTokenKey'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public RsaTokenKeyArgs(
        Output<Either<String,AccessPolicyRsaAlgo>> alg,
        Output<String> e,
        Output<String> kid,
        Output<String> n,
        Output<String> type) {
        this.alg = Objects.requireNonNull(alg, "expected parameter 'alg' to be non-null");
        this.e = Objects.requireNonNull(e, "expected parameter 'e' to be non-null");
        this.kid = Objects.requireNonNull(kid, "expected parameter 'kid' to be non-null");
        this.n = Objects.requireNonNull(n, "expected parameter 'n' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private RsaTokenKeyArgs() {
        this.alg = Output.empty();
        this.e = Output.empty();
        this.kid = Output.empty();
        this.n = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RsaTokenKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Either<String,AccessPolicyRsaAlgo>> alg;
        private Output<String> e;
        private Output<String> kid;
        private Output<String> n;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(RsaTokenKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alg = defaults.alg;
    	      this.e = defaults.e;
    	      this.kid = defaults.kid;
    	      this.n = defaults.n;
    	      this.type = defaults.type;
        }

        public Builder alg(Output<Either<String,AccessPolicyRsaAlgo>> alg) {
            this.alg = Objects.requireNonNull(alg);
            return this;
        }
        public Builder alg(Either<String,AccessPolicyRsaAlgo> alg) {
            this.alg = Output.of(Objects.requireNonNull(alg));
            return this;
        }
        public Builder e(Output<String> e) {
            this.e = Objects.requireNonNull(e);
            return this;
        }
        public Builder e(String e) {
            this.e = Output.of(Objects.requireNonNull(e));
            return this;
        }
        public Builder kid(Output<String> kid) {
            this.kid = Objects.requireNonNull(kid);
            return this;
        }
        public Builder kid(String kid) {
            this.kid = Output.of(Objects.requireNonNull(kid));
            return this;
        }
        public Builder n(Output<String> n) {
            this.n = Objects.requireNonNull(n);
            return this;
        }
        public Builder n(String n) {
            this.n = Output.of(Objects.requireNonNull(n));
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public RsaTokenKeyArgs build() {
            return new RsaTokenKeyArgs(alg, e, kid, n, type);
        }
    }
}
