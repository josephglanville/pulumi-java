// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CaPoolIssuancePolicyAllowedKeyTypeRsaGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CaPoolIssuancePolicyAllowedKeyTypeRsaGetArgs Empty = new CaPoolIssuancePolicyAllowedKeyTypeRsaGetArgs();

    /**
     * The maximum allowed RSA modulus size, in bits. If this is not set, or if set to zero, the
     * service will not enforce an explicit upper bound on RSA modulus sizes.
     * 
     */
    @Import(name="maxModulusSize")
      private final @Nullable Output<String> maxModulusSize;

    public Output<String> getMaxModulusSize() {
        return this.maxModulusSize == null ? Output.empty() : this.maxModulusSize;
    }

    /**
     * The minimum allowed RSA modulus size, in bits. If this is not set, or if set to zero, the
     * service-level min RSA modulus size will continue to apply.
     * 
     */
    @Import(name="minModulusSize")
      private final @Nullable Output<String> minModulusSize;

    public Output<String> getMinModulusSize() {
        return this.minModulusSize == null ? Output.empty() : this.minModulusSize;
    }

    public CaPoolIssuancePolicyAllowedKeyTypeRsaGetArgs(
        @Nullable Output<String> maxModulusSize,
        @Nullable Output<String> minModulusSize) {
        this.maxModulusSize = maxModulusSize;
        this.minModulusSize = minModulusSize;
    }

    private CaPoolIssuancePolicyAllowedKeyTypeRsaGetArgs() {
        this.maxModulusSize = Output.empty();
        this.minModulusSize = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CaPoolIssuancePolicyAllowedKeyTypeRsaGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> maxModulusSize;
        private @Nullable Output<String> minModulusSize;

        public Builder() {
    	      // Empty
        }

        public Builder(CaPoolIssuancePolicyAllowedKeyTypeRsaGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxModulusSize = defaults.maxModulusSize;
    	      this.minModulusSize = defaults.minModulusSize;
        }

        public Builder maxModulusSize(@Nullable Output<String> maxModulusSize) {
            this.maxModulusSize = maxModulusSize;
            return this;
        }
        public Builder maxModulusSize(@Nullable String maxModulusSize) {
            this.maxModulusSize = Output.ofNullable(maxModulusSize);
            return this;
        }
        public Builder minModulusSize(@Nullable Output<String> minModulusSize) {
            this.minModulusSize = minModulusSize;
            return this;
        }
        public Builder minModulusSize(@Nullable String minModulusSize) {
            this.minModulusSize = Output.ofNullable(minModulusSize);
            return this;
        }        public CaPoolIssuancePolicyAllowedKeyTypeRsaGetArgs build() {
            return new CaPoolIssuancePolicyAllowedKeyTypeRsaGetArgs(maxModulusSize, minModulusSize);
        }
    }
}
