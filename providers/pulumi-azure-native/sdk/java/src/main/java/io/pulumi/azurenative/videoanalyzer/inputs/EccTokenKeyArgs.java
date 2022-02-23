// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.azurenative.videoanalyzer.enums.AccessPolicyEccAlgo;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Required validation properties for tokens generated with Elliptical Curve algorithm.
 * 
 */
public final class EccTokenKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final EccTokenKeyArgs Empty = new EccTokenKeyArgs();

    /**
     * Elliptical curve algorithm to be used: ES256, ES384 or ES512.
     * 
     */
    @InputImport(name="alg", required=true)
      private final Input<Either<String,AccessPolicyEccAlgo>> alg;

    public Input<Either<String,AccessPolicyEccAlgo>> getAlg() {
        return this.alg;
    }

    /**
     * JWT token key id. Validation keys are looked up based on the key id present on the JWT token header.
     * 
     */
    @InputImport(name="kid", required=true)
      private final Input<String> kid;

    public Input<String> getKid() {
        return this.kid;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.EccTokenKey'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * X coordinate.
     * 
     */
    @InputImport(name="x", required=true)
      private final Input<String> x;

    public Input<String> getX() {
        return this.x;
    }

    /**
     * Y coordinate.
     * 
     */
    @InputImport(name="y", required=true)
      private final Input<String> y;

    public Input<String> getY() {
        return this.y;
    }

    public EccTokenKeyArgs(
        Input<Either<String,AccessPolicyEccAlgo>> alg,
        Input<String> kid,
        Input<String> type,
        Input<String> x,
        Input<String> y) {
        this.alg = Objects.requireNonNull(alg, "expected parameter 'alg' to be non-null");
        this.kid = Objects.requireNonNull(kid, "expected parameter 'kid' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.x = Objects.requireNonNull(x, "expected parameter 'x' to be non-null");
        this.y = Objects.requireNonNull(y, "expected parameter 'y' to be non-null");
    }

    private EccTokenKeyArgs() {
        this.alg = Input.empty();
        this.kid = Input.empty();
        this.type = Input.empty();
        this.x = Input.empty();
        this.y = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EccTokenKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,AccessPolicyEccAlgo>> alg;
        private Input<String> kid;
        private Input<String> type;
        private Input<String> x;
        private Input<String> y;

        public Builder() {
    	      // Empty
        }

        public Builder(EccTokenKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alg = defaults.alg;
    	      this.kid = defaults.kid;
    	      this.type = defaults.type;
    	      this.x = defaults.x;
    	      this.y = defaults.y;
        }

        public Builder setAlg(Input<Either<String,AccessPolicyEccAlgo>> alg) {
            this.alg = Objects.requireNonNull(alg);
            return this;
        }

        public Builder setAlg(Either<String,AccessPolicyEccAlgo> alg) {
            this.alg = Input.of(Objects.requireNonNull(alg));
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

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setX(Input<String> x) {
            this.x = Objects.requireNonNull(x);
            return this;
        }

        public Builder setX(String x) {
            this.x = Input.of(Objects.requireNonNull(x));
            return this;
        }

        public Builder setY(Input<String> y) {
            this.y = Objects.requireNonNull(y);
            return this;
        }

        public Builder setY(String y) {
            this.y = Input.of(Objects.requireNonNull(y));
            return this;
        }
        public EccTokenKeyArgs build() {
            return new EccTokenKeyArgs(alg, kid, type, x, y);
        }
    }
}
