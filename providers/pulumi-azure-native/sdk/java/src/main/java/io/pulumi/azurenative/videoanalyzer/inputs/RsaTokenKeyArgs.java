// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.azurenative.videoanalyzer.enums.AccessPolicyRsaAlgo;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class RsaTokenKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RsaTokenKeyArgs Empty = new RsaTokenKeyArgs();

    @InputImport(name="alg", required=true)
    private final Input<Either<String,AccessPolicyRsaAlgo>> alg;

    public Input<Either<String,AccessPolicyRsaAlgo>> getAlg() {
        return this.alg;
    }

    @InputImport(name="e", required=true)
    private final Input<String> e;

    public Input<String> getE() {
        return this.e;
    }

    @InputImport(name="kid", required=true)
    private final Input<String> kid;

    public Input<String> getKid() {
        return this.kid;
    }

    @InputImport(name="n", required=true)
    private final Input<String> n;

    public Input<String> getN() {
        return this.n;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public RsaTokenKeyArgs(
        Input<Either<String,AccessPolicyRsaAlgo>> alg,
        Input<String> e,
        Input<String> kid,
        Input<String> n,
        Input<String> type) {
        this.alg = Objects.requireNonNull(alg, "expected parameter 'alg' to be non-null");
        this.e = Objects.requireNonNull(e, "expected parameter 'e' to be non-null");
        this.kid = Objects.requireNonNull(kid, "expected parameter 'kid' to be non-null");
        this.n = Objects.requireNonNull(n, "expected parameter 'n' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private RsaTokenKeyArgs() {
        this.alg = Input.empty();
        this.e = Input.empty();
        this.kid = Input.empty();
        this.n = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RsaTokenKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,AccessPolicyRsaAlgo>> alg;
        private Input<String> e;
        private Input<String> kid;
        private Input<String> n;
        private Input<String> type;

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

        public Builder setAlg(Input<Either<String,AccessPolicyRsaAlgo>> alg) {
            this.alg = Objects.requireNonNull(alg);
            return this;
        }

        public Builder setAlg(Either<String,AccessPolicyRsaAlgo> alg) {
            this.alg = Input.of(Objects.requireNonNull(alg));
            return this;
        }

        public Builder setE(Input<String> e) {
            this.e = Objects.requireNonNull(e);
            return this;
        }

        public Builder setE(String e) {
            this.e = Input.of(Objects.requireNonNull(e));
            return this;
        }

        public Builder setKid(Input<String> kid) {
            this.kid = Objects.requireNonNull(kid);
            return this;
        }

        public Builder setKid(String kid) {
            this.kid = Input.of(Objects.requireNonNull(kid));
            return this;
        }

        public Builder setN(Input<String> n) {
            this.n = Objects.requireNonNull(n);
            return this;
        }

        public Builder setN(String n) {
            this.n = Input.of(Objects.requireNonNull(n));
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public RsaTokenKeyArgs build() {
            return new RsaTokenKeyArgs(alg, e, kid, n, type);
        }
    }
}
