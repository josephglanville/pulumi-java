// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureNodePoolConfigRootVolume {
    /**
     * Optional. The size of the disk, in GiBs. When unspecified, a default value is provided. See the specific reference in the parent resource.
     * 
     */
    private final @Nullable Integer sizeGib;

    @CustomType.Constructor
    private AzureNodePoolConfigRootVolume(@CustomType.Parameter("sizeGib") @Nullable Integer sizeGib) {
        this.sizeGib = sizeGib;
    }

    /**
     * Optional. The size of the disk, in GiBs. When unspecified, a default value is provided. See the specific reference in the parent resource.
     * 
    */
    public Optional<Integer> getSizeGib() {
        return Optional.ofNullable(this.sizeGib);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureNodePoolConfigRootVolume defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer sizeGib;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureNodePoolConfigRootVolume defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sizeGib = defaults.sizeGib;
        }

        public Builder sizeGib(@Nullable Integer sizeGib) {
            this.sizeGib = sizeGib;
            return this;
        }        public AzureNodePoolConfigRootVolume build() {
            return new AzureNodePoolConfigRootVolume(sizeGib);
        }
    }
}
