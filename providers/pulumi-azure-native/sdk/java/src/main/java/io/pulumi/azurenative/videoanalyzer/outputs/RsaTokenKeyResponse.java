// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RsaTokenKeyResponse {
    private final String alg;
    private final String e;
    private final String kid;
    private final String n;
    private final String type;

    @OutputCustomType.Constructor({"alg","e","kid","n","type"})
    private RsaTokenKeyResponse(
        String alg,
        String e,
        String kid,
        String n,
        String type) {
        this.alg = Objects.requireNonNull(alg);
        this.e = Objects.requireNonNull(e);
        this.kid = Objects.requireNonNull(kid);
        this.n = Objects.requireNonNull(n);
        this.type = Objects.requireNonNull(type);
    }

    public String getAlg() {
        return this.alg;
    }
    public String getE() {
        return this.e;
    }
    public String getKid() {
        return this.kid;
    }
    public String getN() {
        return this.n;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RsaTokenKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String alg;
        private String e;
        private String kid;
        private String n;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(RsaTokenKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alg = defaults.alg;
    	      this.e = defaults.e;
    	      this.kid = defaults.kid;
    	      this.n = defaults.n;
    	      this.type = defaults.type;
        }

        public Builder setAlg(String alg) {
            this.alg = Objects.requireNonNull(alg);
            return this;
        }

        public Builder setE(String e) {
            this.e = Objects.requireNonNull(e);
            return this;
        }

        public Builder setKid(String kid) {
            this.kid = Objects.requireNonNull(kid);
            return this;
        }

        public Builder setN(String n) {
            this.n = Objects.requireNonNull(n);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public RsaTokenKeyResponse build() {
            return new RsaTokenKeyResponse(alg, e, kid, n, type);
        }
    }
}
