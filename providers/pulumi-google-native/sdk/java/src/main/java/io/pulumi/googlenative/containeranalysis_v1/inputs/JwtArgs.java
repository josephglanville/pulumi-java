// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JwtArgs extends io.pulumi.resources.ResourceArgs {

    public static final JwtArgs Empty = new JwtArgs();

    /**
     * The compact encoding of a JWS, which is always three base64 encoded strings joined by periods. For details, see: https://tools.ietf.org/html/rfc7515.html#section-3.1
     * 
     */
    @Import(name="compactJwt")
      private final @Nullable Output<String> compactJwt;

    public Output<String> getCompactJwt() {
        return this.compactJwt == null ? Codegen.empty() : this.compactJwt;
    }

    public JwtArgs(@Nullable Output<String> compactJwt) {
        this.compactJwt = compactJwt;
    }

    private JwtArgs() {
        this.compactJwt = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JwtArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> compactJwt;

        public Builder() {
    	      // Empty
        }

        public Builder(JwtArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compactJwt = defaults.compactJwt;
        }

        public Builder compactJwt(@Nullable Output<String> compactJwt) {
            this.compactJwt = compactJwt;
            return this;
        }
        public Builder compactJwt(@Nullable String compactJwt) {
            this.compactJwt = Codegen.ofNullable(compactJwt);
            return this;
        }        public JwtArgs build() {
            return new JwtArgs(compactJwt);
        }
    }
}
