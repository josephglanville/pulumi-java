// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.privateca_v1.inputs.EcKeyTypeArgs;
import io.pulumi.googlenative.privateca_v1.inputs.RsaKeyTypeArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a "type" of key that may be used in a Certificate issued from a CaPool. Note that a single AllowedKeyType may refer to either a fully-qualified key algorithm, such as RSA 4096, or a family of key algorithms, such as any RSA key.
 * 
 */
public final class AllowedKeyTypeArgs extends io.pulumi.resources.ResourceArgs {

    public static final AllowedKeyTypeArgs Empty = new AllowedKeyTypeArgs();

    /**
     * Represents an allowed Elliptic Curve key type.
     * 
     */
    @InputImport(name="ellipticCurve")
      private final @Nullable Output<EcKeyTypeArgs> ellipticCurve;

    public Output<EcKeyTypeArgs> getEllipticCurve() {
        return this.ellipticCurve == null ? Output.empty() : this.ellipticCurve;
    }

    /**
     * Represents an allowed RSA key type.
     * 
     */
    @InputImport(name="rsa")
      private final @Nullable Output<RsaKeyTypeArgs> rsa;

    public Output<RsaKeyTypeArgs> getRsa() {
        return this.rsa == null ? Output.empty() : this.rsa;
    }

    public AllowedKeyTypeArgs(
        @Nullable Output<EcKeyTypeArgs> ellipticCurve,
        @Nullable Output<RsaKeyTypeArgs> rsa) {
        this.ellipticCurve = ellipticCurve;
        this.rsa = rsa;
    }

    private AllowedKeyTypeArgs() {
        this.ellipticCurve = Output.empty();
        this.rsa = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AllowedKeyTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<EcKeyTypeArgs> ellipticCurve;
        private @Nullable Output<RsaKeyTypeArgs> rsa;

        public Builder() {
    	      // Empty
        }

        public Builder(AllowedKeyTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ellipticCurve = defaults.ellipticCurve;
    	      this.rsa = defaults.rsa;
        }

        public Builder ellipticCurve(@Nullable Output<EcKeyTypeArgs> ellipticCurve) {
            this.ellipticCurve = ellipticCurve;
            return this;
        }

        public Builder ellipticCurve(@Nullable EcKeyTypeArgs ellipticCurve) {
            this.ellipticCurve = Output.ofNullable(ellipticCurve);
            return this;
        }

        public Builder rsa(@Nullable Output<RsaKeyTypeArgs> rsa) {
            this.rsa = rsa;
            return this;
        }

        public Builder rsa(@Nullable RsaKeyTypeArgs rsa) {
            this.rsa = Output.ofNullable(rsa);
            return this;
        }
        public AllowedKeyTypeArgs build() {
            return new AllowedKeyTypeArgs(ellipticCurve, rsa);
        }
    }
}
